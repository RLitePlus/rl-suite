import net.runelite.api.coords.LocalPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ts")
public class WorldEntity extends Node implements CameraFocusableEntity, net.runelite.api.WorldEntity {
   @ObfuscatedName("ab")
   public int field5968;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5974 = -1200;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5972 = 31;
   @ObfuscatedSignature(descriptor = "Lkb;")
   @ObfuscatedName("an")
   public final WorldEntityCoord worldEntityCoord;
   @ObfuscatedSignature(descriptor = "Luj;")
   @ObfuscatedName("ad")
   class520 field5967;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("aj")
   public WorldView worldView;
   @ObfuscatedName("ae")
   public int plane;
   @ObfuscatedSignature(descriptor = "[Lto;")
   @ObfuscatedName("aw")
   WorldEntityCoordSnapshot[] worldEntityCoordSnapshots;
   @ObfuscatedName("ap")
   int worldEntityCoordSnapshotIdx;
   @ObfuscatedSignature(descriptor = "Lpw;")
   @ObfuscatedName("au")
   WorldEntityOwnerType worldEntityOwnerType;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("as")
   public AnimationSequence field5959;
   @ObfuscatedName("az")
   int field5960;
   @ObfuscatedName("ay")
   public int field5964;
   @ObfuscatedName("ai")
   boolean field5965;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("ac")
   public AnimationSequence field5966;
   @ObfuscatedSignature(descriptor = "Lhv;")
   @ObfuscatedName("ak")
   public WorldEntityConfig worldEntityConfig;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final float field5971 = 0.01F;
   @ObfuscatedName("rc")
   public boolean field5957 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field5973 = 39;

   @ObfuscatedSignature(descriptor = "(III)Lrx;")
   @ObfuscatedName("am")
   public ProjectionCoord method10885(int var1, int var2, int var3) {
      try {
         class456 var4 = BuddyRankComparator.method3976(-814754263);
         TransformationMatrix var5 = SecureUrlRequester.method3893(-1254975273);
         var4.field5516.method9303(class6.method119(this.worldEntityCoord.getX(2143513104), -1205328023), 0.0F, 0.0F, -1574760321);
         var4.field5515.method9868(this.worldEntityCoord.getY(-1650321790), 0.0F, this.worldEntityCoord.getZ(747743448), 535954146);
         var5.method10017(var4, (byte)92);
         var5.method9982(-64629359);
         var4.method9422((short)22707);
         ProjectionCoord var6 = var5.method9992(var1, 0.0F, var2, -885458071);
         var6.method9890(method10852(this, 914688714), 0.0F, this.method10855(2131959522), 1519953141);
         TransformationMatrix.method9929(var5, (byte)1);
         return var6;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ts.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ag")
   public void initScenePlane(boolean var1, byte var2) {
      try {
         AnimationSequence var3 = method10817(this, -1307993407);
         AnimationSequence var10000;
         if (var3 != null) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field5959;
         }

         AnimationSequence var4 = var10000;
         this.worldView.scene.field2922.method9938((byte)6);
         if (null != var4) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            if (var4.getId(1896887973) != -1) {
               if (var2 == 8) {
                  throw new IllegalStateException();
               }

               if (var4.method10344(555294601)) {
                  if (var2 == 8) {
                     return;
                  }

                  if (AnimationSequence.method10318(var4, 2074378571).isCachedModelIdSet((byte)-61)) {
                     if (var2 == 8) {
                        throw new IllegalStateException();
                     }

                     classFY var5 = AnimationSequence.method10318(var4, 389183652).method5250((byte)87);
                     class251 var6 = var5.field1921.method5403(-510419997);
                     class136 var7 = var6.method6159(0, -146335463);
                     if (null != var7) {
                        if (var2 == 8) {
                           throw new IllegalStateException();
                        }

                        var6.method6165(var5, var4.getFrame(-609025707), (byte)48);
                        TransformationMatrix.method10012(this.worldView.scene.field2922, var7.method4087(665880124), -1492394805);
                        this.worldView.scene.field2922.field5737 = -this.worldView.scene.field2922.field5737;
                     }
                  }
               }
            }
         }

         this.worldView.scene.Scene_plane = 2115028565 * this.worldView.plane;
         if (var1) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            this.worldView.scene.field2924 = -1200;
            this.worldView.scene.Scene_scale = 0.01F;
            int var13 = this.worldEntityConfig.method4784(-1872155345);
            ModelColorOverride var14 = this.worldView.scene.modelColorOverride;
            byte var15 = (byte)(var13 >> 10 & 63);
            byte var9 = (byte)(var13 >> 7 & 7);
            byte var11 = (byte)(var13 & 127);
            GrandExchangeOfferWorldComparator.method8848(var14, var15, var9, var11, (byte)127);
         } else {
            this.worldView.scene.field2924 = 0;
            this.worldView.scene.Scene_scale = 1.0F;
            this.worldView.scene.modelColorOverride.method6533();
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "ts.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dr")
   @Override
   public int getY(int var1) {
      try {
         return this.worldEntityCoord.getY(-2041651233);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.dl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method10829(int var1) {
      try {
         return WorldEntityCoord.method6240(this.worldEntityCoord, -518611141);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dl")
   @Override
   public int getX(int var1) {
      try {
         return this.worldEntityCoord.getZ(869849026);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.dr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lts;I)Z")
   @ObfuscatedName("fb")
   public static boolean method10825(WorldEntity var0, int var1) {
      if (var0 == null) {
         return var0.method10828(var1);
      } else {
         try {
            return var0.worldView.scene.Scene_scale == 0.01F;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ts.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("vs")
   public void method10891(int var1, int var2) {
      this.setPosition(var1, var2, 1218192168);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int getPlane(int var1) {
      try {
         if (-1 != this.field5964 * 965183031) {
            WorldView var2 = WorldViewManager.method2901(client.worldViewManager, 965183031 * this.field5964, (byte)1);
            if (null != var2) {
               if (var1 >= 1463650599) {
                  throw new IllegalStateException();
               }

               return 2115028565 * var2.plane;
            }
         }

         return Occluder.topLevelWorldView.plane * 2115028565;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("af")
   public final void method10888(int var1, byte var2) {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   public int method10860() {
      return this.field5966.getId(1264982126);
   }

   @ObfuscatedSignature(descriptor = "(Lhv;I)V")
   @ObfuscatedName("aw")
   public void method10838(WorldEntityConfig var1, int var2) {
      try {
         this.worldEntityConfig = var1;
         this.worldView.scene.field2923 = WorldEntityConfig.method4757(var1, (byte)124);
         this.worldView.scene.field2925 = var1.method4761(-1281592688);
         this.method10858(var1.method4765(1936731261), -1115137565);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.aw(" + ')');
      }
   }

   public LocalPoint getTargetLocation() {
      return this.worldEntityCoordSnapshotIdx * -535483495 > 0
         ? new LocalPoint(
            this.worldEntityCoordSnapshots[0].worldEntityCoord.x * -639471049, this.worldEntityCoordSnapshots[0].worldEntityCoord.y * -430111663, -1
         )
         : this.getLocalLocation();
   }

   @ObfuscatedSignature(descriptor = "(S)Lpw;")
   @ObfuscatedName("ap")
   public WorldEntityOwnerType method10842(short var1) {
      try {
         return this.worldEntityOwnerType;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lpn;")
   @ObfuscatedName("ay")
   public class406 method10845(boolean var1, int var2) {
      try {
         if (var1) {
            if (var2 == 1321700550) {
               throw new IllegalStateException();
            } else {
               return class406.field5183;
            }
         } else {
            return this.worldEntityConfig.method4771((byte)123);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpw;I)V")
   @ObfuscatedName("au")
   public void method10848(WorldEntityOwnerType var1, int var2) {
      try {
         this.worldEntityOwnerType = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lts;I)Lsj;")
   @ObfuscatedName("nb")
   public static AnimationSequence method10817(WorldEntity var0, int var1) {
      if (var0 == null) {
         var0.method10820(var1);
      }

      try {
         if (-73411393 * var0.field5968 == 0) {
            if (var1 != -1307993407) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(var0.field5966, -831296794)) {
               if (var1 != -1307993407) {
                  throw new IllegalStateException();
               }

               if (SequenceDefinition.method5260(AnimationSequence.method10318(var0.field5966, -1485555135), (byte)-4)) {
                  if (var1 != -1307993407) {
                     throw new IllegalStateException();
                  }

                  return var0.field5966;
               }
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("az")
   public void method10849(int var1, byte var2) {
      try {
         this.field5960 = 1366065475 * var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cf")
   public final void method10878(int var1) {
      if (0 == this.worldEntityCoordSnapshotIdx * -535483495) {
         method10874(this, this.worldEntityCoordSnapshots[0].worldEntityCoord, -352626735);
      } else {
         if (!this.field5965) {
            this.field5967.vmethod393(this.worldEntityCoord, this.worldEntityCoordSnapshots[0], var1, -1995243555);
            this.field5965 = true;
         }

         if (this.field5967.vmethod400(this.worldEntityCoord, var1, this.worldEntityCoordSnapshotIdx * -535483495, (byte)46)) {
            this.worldEntityCoordSnapshotIdx -= -1671759703;
            this.field5965 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method10830() {
      return WorldEntityCoord.method6240(this.worldEntityCoord, -518611141);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;)I")
   @ObfuscatedName("wg")
   public static int method10861(WorldEntity var0) {
      return var0.field5966.getId(839311662);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ltt;Ltt;)I")
   @ObfuscatedName("an")
   public static int method10816(classTE var0, class499 var1, class499 var2) {
      if (var0 == null) {
         var0.method10593(var1, var1);
      }

      if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
         return 1;
      } else {
         return 2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   public int method10862() {
      return this.field5966.getId(-718228228);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method10863(int var1) {
      try {
         return this.field5966.getId(-130517780);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ax")
   public void setPosition(int var1, int var2, int var3) {
      try {
         for (int var4 = 0; var4 < this.worldEntityCoordSnapshots.length; var4++) {
            if (var3 <= -546151359) {
               return;
            }

            this.worldEntityCoordSnapshots[var4].worldEntityCoord.setDirection(var1, var2, 1161831867);
         }

         this.worldEntityCoord.setDirection(var1, var2, 1161831867);
         this.field5967.vmethod401(var1, var2, (byte)56);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ts.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("cx")
   public final void method10868(WorldEntityCoord var1) {
      int var2 = var1.getTileX((byte)72);
      int var3 = var1.getTileY((byte)1);
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < -1013340940) {
         int var4 = var1.getY(-1715585327) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getY(-1870182130);
         int var5 = var1.getZ(1312528716) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getZ(1950314454);
         this.method10876(var1, Math.abs(var4), Math.abs(var5), (short)248);
      } else {
         method10874(this, var1, -428689334);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public int method10855(int var1) {
      try {
         return this.worldView.sizeY * 730485696 + this.worldEntityConfig.method4761(1292643);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lrx;")
   @ObfuscatedName("ao")
   public ProjectionCoord getProjectionCoord(int var1, int var2, int var3) {
      try {
         class456 var4 = BuddyRankComparator.method3976(-814754263);
         TransformationMatrix var5 = SecureUrlRequester.method3893(2046726516);
         var4.field5516.method9303(class6.method119(this.worldEntityCoord.getX(-1346356962), -819950547), 0.0F, 0.0F, -1574760321);
         var4.field5515.method9868(this.worldEntityCoord.getY(-1606896006), 0.0F, this.worldEntityCoord.getZ(770714164), -426188988);
         var1 -= method10852(this, -1489131279);
         var2 -= this.method10855(2131959522);
         var5.method10017(var4, (byte)36);
         var4.method9422((short)16834);
         ProjectionCoord var6 = var5.method9992(var1, 0.0F, var2, -582377025);
         TransformationMatrix.method9929(var5, (byte)1);
         return var6;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ts.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lsj;")
   @ObfuscatedName("aq")
   AnimationSequence method10818() {
      return -344196232 * this.field5968 == 0
            && AnimationSequence.method10315(this.field5966, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(this.field5966, -311685830), (byte)-49)
         ? this.field5966
         : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   @Override
   public int vmethod102() {
      if (-1 != this.field5964 * 965183031) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 965183031 * this.field5964, (byte)1);
         if (null != var1) {
            return 2115028565 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   public int getOwnerType() {
      return this.worldEntityOwnerType.method9146();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   @Override
   public int vmethod103() {
      if (-1 != this.field5964 * 965183031) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 636997752 * this.field5964, (byte)1);
         if (null != var1) {
            return -1893115167 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * -1777612090;
   }

   public int getTargetOrientation() {
      return this.worldEntityCoordSnapshotIdx * -535483495 > 0
         ? this.worldEntityCoordSnapshots[0].worldEntityCoord.orientation * 459733525
         : this.getOrientation();
   }

   @ObfuscatedSignature(descriptor = "(Lts;I)I")
   @ObfuscatedName("ar")
   public static int method10852(WorldEntity var0, int var1) {
      if (var0 == null) {
         var0.getZ(var1);
      }

      try {
         return -174152128 * var0.worldView.sizeX + WorldEntityConfig.method4757(var0.worldEntityConfig, (byte)115);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   @Override
   public int vmethod105() {
      if (-1 != this.field5964 * 965183031) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 965183031 * this.field5964, (byte)1);
         if (null != var1) {
            return 2115028565 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method10832() {
      return this.worldEntityCoord.getX(483014591);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fo")
   @Override
   public int vmethod141() {
      return this.worldEntityCoord.getY(-2125616482);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fe")
   @Override
   public int vmethod142() {
      return this.worldEntityCoord.getY(-2113625766);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   @Override
   public int vmethod140() {
      return this.worldEntityCoord.getY(-2136192054);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fy")
   @Override
   public int vmethod143() {
      return this.worldEntityCoord.getZ(1255997533);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;)I")
   @ObfuscatedName("qf")
   public static int method10864(WorldEntity var0) {
      return var0.field5966.getId(1575312155);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   @Override
   public int vmethod146() {
      return this.worldEntityCoord.getZ(2082533293);
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("hr")
   public WorldView method10892() {
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ig")
   public void method10890(int var1) {
      if (this.worldEntityCoordSnapshotIdx * -535483495 == 0) {
         this.method10895(this.worldEntityCoordSnapshots[0].worldEntityCoord);
      } else {
         if (!this.field5965) {
            if (this.field5957) {
               this.field5967.vmethod405(this.worldEntityCoord, var1 - 1, this.worldEntityCoordSnapshotIdx * -535483495);
            }

            this.field5967.method11175(this.worldEntityCoord, this.worldEntityCoordSnapshots[0], var1);
            this.field5965 = true;
         }

         if (this.field5967.vmethod405(this.worldEntityCoord, var1 + (float)NanoClock.field2569, this.worldEntityCoordSnapshotIdx * -535483495)) {
            this.worldEntityCoordSnapshotIdx = (this.worldEntityCoordSnapshotIdx * -535483495 - 1) * -1671759703;
            this.field5965 = false;
         }

         this.field5957 = true;
      }
   }

   public LocalPoint transformToMainWorld(LocalPoint var1) {
      if (var1.getWorldView() != this.plane * 314555321) {
         throw new IllegalArgumentException("LocalPoint doesn't belong do this WorldEntity");
      } else {
         ProjectionCoord var2 = this.method10893(var1.getX(), var1.getY());
         LocalPoint var3 = new LocalPoint((int)var2.x, (int)var2.y, -1);
         var2.method9925();
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fv")
   @Override
   public int vmethod144() {
      return this.worldEntityCoord.getZ(1238999721);
   }

   @ObfuscatedSignature(descriptor = "()Lsj;")
   @ObfuscatedName("aa")
   AnimationSequence method10819() {
      return -73411393 * this.field5968 == 0
            && AnimationSequence.method10315(this.field5966, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(this.field5966, 1859168417), (byte)-85)
         ? this.field5966
         : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bq")
   public boolean method10850(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (this.field5960 * -572910741 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("be")
   public void method10822(boolean var1) {
      AnimationSequence var2 = method10817(this, -1307993407);
      AnimationSequence var3 = var2 != null ? var2 : this.field5959;
      this.worldView.scene.field2922.method9938((byte)6);
      if (null != var3
         && var3.getId(-1217919592) != -1
         && var3.method10344(1904570995)
         && AnimationSequence.method10318(var3, -925536538).isCachedModelIdSet((byte)19)) {
         classFY var4 = AnimationSequence.method10318(var3, 505382630).method5250((byte)67);
         class251 var5 = var4.field1921.method5403(-510419997);
         class136 var6 = var5.method6159(0, -146335463);
         if (null != var6) {
            var5.method6165(var4, var3.getFrame(-609025707), (byte)39);
            TransformationMatrix.method10012(this.worldView.scene.field2922, var6.method4087(154438381), -883057055);
            this.worldView.scene.field2922.field5737 = -this.worldView.scene.field2922.field5737;
         }
      }

      this.worldView.scene.Scene_plane = 2115028565 * this.worldView.plane;
      if (var1) {
         this.worldView.scene.field2924 = -1200;
         this.worldView.scene.Scene_scale = 0.01F;
         int var11 = this.worldEntityConfig.method4784(-1872155345);
         ModelColorOverride var12 = this.worldView.scene.modelColorOverride;
         byte var13 = (byte)(var11 >> 10 & 63);
         byte var8 = (byte)(var11 >> 7 & 7);
         byte var10 = (byte)(var11 & 127);
         GrandExchangeOfferWorldComparator.method8848(var12, var13, var8, var10, (byte)127);
      } else {
         this.worldView.scene.field2924 = 0;
         this.worldView.scene.Scene_scale = 1.0F;
         this.worldView.scene.modelColorOverride.method6533();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("th")
   public void method10889() {
      client.field947.add(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;)Z")
   @ObfuscatedName("oi")
   public static boolean method10826(WorldEntity var0) {
      return var0.worldView.scene.Scene_scale == 0.01F;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("uv")
   public void method10887(WorldEntityCoord var1) {
      this.field5957 = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;)I")
   @ObfuscatedName("ox")
   public static int method10833(WorldEntity var0) {
      return var0.worldEntityCoord.getX(-748488789);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bo")
   public void method10823(boolean var1) {
      AnimationSequence var2 = method10817(this, -1307993407);
      AnimationSequence var3 = var2 != null ? var2 : this.field5959;
      this.worldView.scene.field2922.method9938((byte)6);
      if (null != var3
         && var3.getId(-1258817726) != -1
         && var3.method10344(-319742488)
         && AnimationSequence.method10318(var3, -1667860609).isCachedModelIdSet((byte)72)) {
         classFY var4 = AnimationSequence.method10318(var3, -60628494).method5250((byte)22);
         class251 var5 = var4.field1921.method5403(-510419997);
         class136 var6 = var5.method6159(0, -146335463);
         if (null != var6) {
            var5.method6165(var4, var3.getFrame(-609025707), (byte)2);
            TransformationMatrix.method10012(this.worldView.scene.field2922, var6.method4087(-1701562070), -688911650);
            this.worldView.scene.field2922.field5737 = -this.worldView.scene.field2922.field5737;
         }
      }

      this.worldView.scene.Scene_plane = 2115028565 * this.worldView.plane;
      if (var1) {
         this.worldView.scene.field2924 = -1200;
         this.worldView.scene.Scene_scale = 0.01F;
         int var11 = this.worldEntityConfig.method4784(-1872155345);
         ModelColorOverride var12 = this.worldView.scene.modelColorOverride;
         byte var13 = (byte)(var11 >> 10 & 63);
         byte var8 = (byte)(var11 >> 7 & 7);
         byte var10 = (byte)(var11 & 127);
         GrandExchangeOfferWorldComparator.method8848(var12, var13, var8, var10, (byte)127);
      } else {
         this.worldView.scene.field2924 = 0;
         this.worldView.scene.Scene_scale = 1.0F;
         this.worldView.scene.modelColorOverride.method6533();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   public boolean method10827() {
      return this.worldView.scene.Scene_scale == 0.01F;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ad")
   public boolean method10851(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -114229164) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               boolean var10000;
               if (0 != (this.field5960 * -572910741 & 1 << var1)) {
                  if (var2 == -114229164) {
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
         throw RestClientThreadFactory.newRunException(var3, "ts.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   void method10858(int var1, int var2) {
      try {
         AnimationSequence.method10313(this.field5959, var1, 769523376);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lrx;")
   @ObfuscatedName("ez")
   public ProjectionCoord method10893(int var1, int var2) {
      return this.getProjectionCoord(var1, var2, 1285583752);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method10831() {
      return WorldEntityCoord.method6240(this.worldEntityCoord, -518611141);
   }

   @ObfuscatedSignature(descriptor = "()Lkb;")
   @ObfuscatedName("ba")
   public WorldEntityCoord method10836() {
      return 0 == -535483495 * this.worldEntityCoordSnapshotIdx ? this.worldEntityCoord : this.worldEntityCoordSnapshots[0].worldEntityCoord;
   }

   @ObfuscatedSignature(descriptor = "(Lhv;)V")
   @ObfuscatedName("bi")
   public void method10839(WorldEntityConfig var1) {
      this.worldEntityConfig = var1;
      this.worldView.scene.field2923 = WorldEntityConfig.method4757(var1, (byte)86);
      this.worldView.scene.field2925 = var1.method4761(-576687519);
      this.method10858(var1.method4765(2080937894), 1941606686);
   }

   @ObfuscatedSignature(descriptor = "(Lhv;)V")
   @ObfuscatedName("by")
   public void method10840(WorldEntityConfig var1) {
      this.worldEntityConfig = var1;
      this.worldView.scene.field2923 = WorldEntityConfig.method4757(var1, (byte)90);
      this.worldView.scene.field2925 = var1.method4761(-2128077504);
      this.method10858(var1.method4765(1962799967), 179351088);
   }

   @ObfuscatedSignature(descriptor = "()Lpw;")
   @ObfuscatedName("bf")
   public WorldEntityOwnerType method10843() {
      return this.worldEntityOwnerType;
   }

   @ObfuscatedSignature(descriptor = "()Lpw;")
   @ObfuscatedName("bn")
   public WorldEntityOwnerType method10844() {
      return this.worldEntityOwnerType;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lpn;")
   @ObfuscatedName("br")
   public class406 method10846(boolean var1) {
      return var1 ? class406.field5183 : this.worldEntityConfig.method4771((byte)123);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lpn;")
   @ObfuscatedName("bd")
   public class406 method10847(boolean var1) {
      return var1 ? class406.field5183 : this.worldEntityConfig.method4771((byte)123);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cu")
   void method10859(int var1) {
      AnimationSequence.method10313(this.field5959, var1, -276333370);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cc")
   public int method10865() {
      return this.field5966.getId(1098475104);
   }

   @ObfuscatedSignature(descriptor = "()Lhv;")
   @ObfuscatedName("kw")
   public WorldEntityConfig method10894() {
      return this.worldEntityConfig;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("cp")
   public void method10872(WorldEntityCoord var1) {
      this.worldEntityCoord.method6262(var1, 1420242432);
      this.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, 492679116);
      this.worldEntityCoordSnapshotIdx = 0;
      this.field5965 = false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   public int method10853() {
      return -174152128 * this.worldView.sizeX + WorldEntityConfig.method4757(this.worldEntityConfig, (byte)127);
   }

   public LocalPoint getCameraFocus() {
      return this.getLocalLocation();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   public int method10856() {
      return this.worldView.sizeY * -2080336220 + this.worldEntityConfig.method4761(346217969);
   }

   @ObfuscatedSignature(descriptor = "(Lts;B)I")
   @ObfuscatedName("op")
   public static int method10834(WorldEntity var0, byte var1) {
      if (var0 == null) {
         return var0.method10835(var1);
      } else {
         try {
            return var0.worldEntityCoord.getX(-223472691);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ts.aj(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ce")
   public int method10857() {
      return this.worldView.sizeY * 730485696 + this.worldEntityConfig.method4761(566353401);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;I)V")
   @ObfuscatedName("ar")
   public final void method10869(WorldEntityCoord var1, int var2) {
      try {
         int var3 = var1.getTileX((byte)65);
         int var4 = var1.getTileY((byte)1);
         if (var3 >= 0 && var3 < 104) {
            if (var2 >= -321128568) {
               return;
            }

            if (var4 >= 0) {
               if (var2 >= -321128568) {
                  throw new IllegalStateException();
               }

               if (var4 < 104) {
                  int var5 = var1.getY(-1614548684) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getY(-1822434630);
                  int var6 = var1.getZ(824920384) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getZ(1168661784);
                  this.method10876(var1, Math.abs(var5), Math.abs(var6), (short)248);
                  return;
               }

               if (var2 >= -321128568) {
                  throw new IllegalStateException();
               }
            }
         }

         method10874(this, var1, -958844259);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ts.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("co")
   public final void method10870(WorldEntityCoord var1) {
      int var2 = var1.getTileX((byte)9);
      int var3 = var1.getTileY((byte)1);
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         int var4 = var1.getY(-1782915651) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getY(-1813380549);
         int var5 = var1.getZ(328287087) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getZ(488278004);
         this.method10876(var1, Math.abs(var4), Math.abs(var5), (short)248);
      } else {
         method10874(this, var1, -348748319);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cs")
   public void method10867(int var1, int var2) {
      for (int var3 = 0; var3 < this.worldEntityCoordSnapshots.length; var3++) {
         this.worldEntityCoordSnapshots[var3].worldEntityCoord.setDirection(var1, var2, 1161831867);
      }

      this.worldEntityCoord.setDirection(var1, var2, 1161831867);
      this.field5967.vmethod401(var1, var2, (byte)95);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("cn")
   public final void method10871(WorldEntityCoord var1) {
      int var2 = var1.getTileX((byte)10);
      int var3 = var1.getTileY((byte)1);
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < -560936667) {
         int var4 = var1.getY(-1983807657) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getY(-2097162332);
         int var5 = var1.getZ(669017580) - this.worldEntityCoordSnapshots[0].worldEntityCoord.getZ(1520720377);
         this.method10876(var1, Math.abs(var4), Math.abs(var5), (short)248);
      } else {
         method10874(this, var1, -420424990);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   @Override
   public int vmethod104() {
      if (-1 != this.field5964 * 965183031) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 965183031 * this.field5964, (byte)1);
         if (null != var1) {
            return 2115028565 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cq")
   public final void method10879(int var1) {
      if (0 == this.worldEntityCoordSnapshotIdx * -535483495) {
         method10874(this, this.worldEntityCoordSnapshots[0].worldEntityCoord, 898855216);
      } else {
         if (!this.field5965) {
            this.field5967.vmethod393(this.worldEntityCoord, this.worldEntityCoordSnapshots[0], var1, -1771872105);
            this.field5965 = true;
         }

         if (this.field5967.vmethod400(this.worldEntityCoord, var1, this.worldEntityCoordSnapshotIdx * -535483495, (byte)64)) {
            this.worldEntityCoordSnapshotIdx -= -1671759703;
            this.field5965 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("fm")
   public void method10895(WorldEntityCoord var1) {
      method10874(this, var1, -1172380292);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("cg")
   public void method10873(WorldEntityCoord var1) {
      this.worldEntityCoord.method6262(var1, -589494509);
      this.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, -57093506);
      this.worldEntityCoordSnapshotIdx = 0;
      this.field5965 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;IIS)V")
   @ObfuscatedName("al")
   void method10876(WorldEntityCoord var1, int var2, int var3, short var4) {
      try {
         if (this.worldEntityCoordSnapshotIdx * -535483495 < 9) {
            this.worldEntityCoordSnapshotIdx += -1671759703;
         }

         for (int var5 = -535483495 * this.worldEntityCoordSnapshotIdx; var5 > 0; var5--) {
            if (var4 != 248) {
               return;
            }

            WorldEntityCoordSnapshot var6 = this.worldEntityCoordSnapshots[var5];
            this.worldEntityCoordSnapshots[var5] = this.worldEntityCoordSnapshots[var5 - 1];
            this.worldEntityCoordSnapshots[var5 - 1] = var6;
         }

         this.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, 438649875);
         this.worldEntityCoordSnapshots[0].field5948 = -802391057 * client.cycle;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ts.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)V")
   @ObfuscatedName("cd")
   void method10877(WorldEntityCoord var1, int var2, int var3) {
      if (this.worldEntityCoordSnapshotIdx * 1688837778 < 9) {
         this.worldEntityCoordSnapshotIdx += -1671759703;
      }

      for (int var4 = -535483495 * this.worldEntityCoordSnapshotIdx; var4 > 0; var4--) {
         WorldEntityCoordSnapshot var5 = this.worldEntityCoordSnapshots[var4];
         this.worldEntityCoordSnapshots[var4] = this.worldEntityCoordSnapshots[var4 - 1];
         this.worldEntityCoordSnapshots[var4 - 1] = var5;
      }

      this.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, -277361349);
      this.worldEntityCoordSnapshots[0].field5948 = -802391057 * client.cycle;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cz")
   public final void method10880(int var1) {
      if (0 == this.worldEntityCoordSnapshotIdx * -535483495) {
         method10874(this, this.worldEntityCoordSnapshots[0].worldEntityCoord, 350075889);
      } else {
         if (!this.field5965) {
            this.field5967.vmethod393(this.worldEntityCoord, this.worldEntityCoordSnapshots[0], var1, -2141001228);
            this.field5965 = true;
         }

         if (this.field5967.vmethod400(this.worldEntityCoord, var1, this.worldEntityCoordSnapshotIdx * -535483495, (byte)88)) {
            this.worldEntityCoordSnapshotIdx -= -1671759703;
            this.field5965 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ci")
   public final void method10881(int var1) {
      if (0 == this.worldEntityCoordSnapshotIdx * 524772740) {
         method10874(this, this.worldEntityCoordSnapshots[0].worldEntityCoord, -773985346);
      } else {
         if (!this.field5965) {
            this.field5967.vmethod393(this.worldEntityCoord, this.worldEntityCoordSnapshots[0], var1, -2016940101);
            this.field5965 = true;
         }

         if (this.field5967.vmethod400(this.worldEntityCoord, var1, this.worldEntityCoordSnapshotIdx * -535483495, (byte)26)) {
            this.worldEntityCoordSnapshotIdx -= 1039543784;
            this.field5965 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lkb;")
   @ObfuscatedName("ak")
   public WorldEntityCoord method10837(int var1) {
      try {
         return 0 == -535483495 * this.worldEntityCoordSnapshotIdx ? this.worldEntityCoord : this.worldEntityCoordSnapshots[0].worldEntityCoord;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ak(" + ')');
      }
   }

   public WorldEntity(int var1, WorldView var2) {
      this.method10889();
      this.worldEntityCoord = new WorldEntityCoord();
      this.plane = 0;
      this.worldEntityCoordSnapshots = new WorldEntityCoordSnapshot[10];
      this.worldEntityCoordSnapshotIdx = 0;
      this.field5964 = -1731006343;
      this.worldEntityOwnerType = WorldEntityOwnerType.field5256;
      this.field5960 = -601643235;
      this.field5967 = new classUC();
      this.field5965 = false;
      this.field5959 = new AnimationSequence();
      this.field5966 = new AnimationSequence();
      this.field5968 = 0;
      this.plane = -1403921783 * var1;
      this.worldView = var2;
      this.worldEntityCoordSnapshotIdx = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         this.worldEntityCoordSnapshots[var3] = new WorldEntityCoordSnapshot();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lrx;")
   @ObfuscatedName("cr")
   public ProjectionCoord method10886(int var1, int var2) {
      class456 var3 = BuddyRankComparator.method3976(-814754263);
      TransformationMatrix var4 = SecureUrlRequester.method3893(784404844);
      var3.field5516.method9303(class6.method119(this.worldEntityCoord.getX(916094853), -533898029), 0.0F, 0.0F, -1574760321);
      var3.field5515.method9868(this.worldEntityCoord.getY(-2107723175), 0.0F, this.worldEntityCoord.getZ(1949689427), -988105975);
      var4.method10017(var3, (byte)56);
      var4.method9982(665089950);
      var3.method9422((short)28061);
      ProjectionCoord var5 = var4.method9992(var1, 0.0F, var2, 1901586530);
      var5.method9890(method10852(this, 751918924), 0.0F, this.method10855(2131959522), 1519953141);
      TransformationMatrix.method9929(var4, (byte)1);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lts;Lkb;I)V")
   @ObfuscatedName("wt")
   public static void method10874(WorldEntity var0, WorldEntityCoord var1, int var2) {
      if (var0 == null) {
         var0.method10875(var1, var2);
      } else {
         var0.method10887(var1);

         try {
            var0.worldEntityCoord.method6262(var1, 1531022422);
            var0.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, -633212748);
            var0.worldEntityCoordSnapshotIdx = 0;
            var0.field5965 = false;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "ts.ah(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aw")
   static final void method10824(String var0, int var1) {
      try {
         PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3893, client.packetWriter.isaacCipher, -1323491981);
         var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, -1810288009), (short)-5054);
         var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
         PacketWriter.method3330(client.packetWriter, var2, -1771370198);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.aw(" + ')');
      }
   }

   public boolean isHiddenForOverlap() {
      return method10825(this, 1600404130);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lhv;)V")
   @ObfuscatedName("pp")
   public static void method10841(WorldEntity var0, WorldEntityConfig var1) {
      if (var0 == null) {
         var0.method10844();
      }

      var0.worldEntityConfig = var1;
      var0.worldView.scene.field2923 = WorldEntityConfig.method4757(var1, (byte)109);
      var0.worldView.scene.field2925 = var1.method4761(1708261924);
      var0.method10858(var1.method4765(2098653816), -1307030546);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mv")
   @Override
   public int vmethod153() {
      return this.getY(-1790262579);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("is")
   @Override
   public int vmethod154() {
      return this.getX(-727737924);
   }

   public int getOrientation() {
      return this.worldEntityCoord.orientation * 459733525;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ww")
   @Override
   public int vmethod155() {
      return this.getPlane(446304328);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("nt")
   @Override
   public float vmethod152() {
      return this.worldEntityCoord.x * -639471049;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cv")
   @Override
   public float vmethod151() {
      return this.worldEntityCoord.y * -430111663;
   }

   @ObfuscatedSignature(descriptor = "(I)Lsj;")
   @ObfuscatedName("at")
   AnimationSequence method10820(int var1) {
      try {
         if (-73411393 * this.field5964 == 0) {
            if (var1 != -1307993407) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(this.field5959, -831296794)) {
               if (var1 != -1307993407) {
                  throw new IllegalStateException();
               }

               if (SequenceDefinition.method5260(AnimationSequence.method10318(this.field5966, -1485555135), (byte)-4)) {
                  if (var1 != -1307993407) {
                     throw new IllegalStateException();
                  }

                  return this.field5959;
               }
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   public boolean method10828(int var1) {
      try {
         return this.worldView.scene.field2973 == 0.01F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;II)Lrx;")
   @ObfuscatedName("hi")
   public static ProjectionCoord method10883(WorldEntity var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10884(var1, var1);
      }

      class456 var3 = BuddyRankComparator.method3976(-814754263);
      TransformationMatrix var4 = SecureUrlRequester.method3893(1508375359);
      var3.field5516.method9303(class6.method119(var0.worldEntityCoord.getX(-431939558), -587219267), 0.0F, 0.0F, -1574760321);
      var3.field5515.method9868(var0.worldEntityCoord.getY(-1787196425), 0.0F, var0.worldEntityCoord.getZ(1506189568), 1677717469);
      var1 -= method10852(var0, 632840291);
      var2 -= var0.method10855(2131959522);
      var4.method10017(var3, (byte)101);
      var3.method9422((short)13606);
      ProjectionCoord var5 = var4.method9992(var1, 0.0F, var2, 1632070539);
      TransformationMatrix.method9929(var4, (byte)1);
      return var5;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.worldEntityCoord.x * -639471049, this.worldEntityCoord.y * -430111663, -1);
   }

   @ObfuscatedSignature(descriptor = "(II)Lrx;")
   @ObfuscatedName("cw")
   public ProjectionCoord method10884(int var1, int var2) {
      class456 var3 = BuddyRankComparator.method3976(-814754263);
      TransformationMatrix var4 = SecureUrlRequester.method3893(1508375359);
      var3.field5516.method9303(class6.method119(this.worldEntityCoord.getY(-431939558), -587219267), 0.0F, 0.0F, -1574760321);
      var3.field5515.method9868(this.worldEntityCoord.getOrientation(-1787196425), 0.0F, this.worldEntityCoord.getOrientation(1506189568), 1677717469);
      var1 -= method10852(this, 632840291);
      var2 -= this.getX(2131959522);
      var4.method10017(var3, (byte)101);
      var3.method9422((short)13606);
      ProjectionCoord var5 = var4.method9992(var1, 0.0F, var2, 1632070539);
      TransformationMatrix.method9929(var4, (byte)1);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;I)V")
   @ObfuscatedName("ah")
   public void method10875(WorldEntityCoord var1, int var2) {
      this.method10873(var1);

      try {
         this.worldEntityCoord.method6262(var1, 1531022422);
         this.worldEntityCoordSnapshots[0].worldEntityCoord.method6262(var1, -633212748);
         this.worldEntityCoordSnapshotIdx = 0;
         this.field5965 = false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ts.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   public int method10835(byte var1) {
      try {
         return this.worldEntityCoord.getOrientation(-223472691);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int getZ(int var1) {
      try {
         return -174152128 * this.worldView.sizeY + WorldEntityConfig.method4757(this.worldEntityConfig, (byte)115);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ts.ai(" + 41);
      }
   }
}
