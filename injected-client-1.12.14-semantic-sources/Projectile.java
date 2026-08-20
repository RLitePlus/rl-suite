import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ch")
public final class Projectile extends Renderable implements net.runelite.api.Projectile {
   @ObfuscatedName("as")
   double x;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("am")
   final AnimationSequence animationSequence;
   @ObfuscatedName("ax")
   int orientation;
   @ToRemove(unused = "true")
   @ObfuscatedName("du")
   static final int field562 = 0;
   @ObfuscatedName("ar")
   int field547;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field560 = 1076101438;
   @ObfuscatedName("at")
   int sourceX;
   @ObfuscatedName("ai")
   int startPos;
   @ObfuscatedName("aj")
   int targetLevel;
   @ObfuscatedName("an")
   int startHeight;
   @ObfuscatedName("av")
   int sourceLevel;
   @ObfuscatedName("ae")
   int sourceIndex;
   @ObfuscatedName("ap")
   int endHeight;
   @ObfuscatedName("ad")
   int slope;
   @ObfuscatedName("az")
   int cycleEnd;
   @ObfuscatedName("ac")
   double y;
   @ObfuscatedName("au")
   int cycleStart;
   @ObfuscatedName("ak")
   int targetX;
   @ObfuscatedName("ag")
   int sourceY;
   @ObfuscatedName("ah")
   boolean isMoving = false;
   @ObfuscatedName("al")
   double field556;
   @ObfuscatedName("ay")
   int targetIndex;
   @ObfuscatedName("af")
   int id;
   @ObfuscatedName("ab")
   double z;
   @ObfuscatedName("aw")
   int targetY;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field561 = 50;

   @ObfuscatedSignature(descriptor = "(Lql;ILjava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   static String method1418(IterableNodeHashTable var0, int var1, String var2, int var3) {
      try {
         if (null == var0) {
            if (var3 >= 306634687) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            ObjectNode var4 = (ObjectNode)var0.get((long)var1);
            if (var4 == null) {
               if (var3 >= 306634687) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (String)var4.obj;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ch.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("aj")
   void method1421(int var1, int var2, byte var3) {
      try {
         this.cycleStart += var1 * -319101703;
         this.orientation += var2 * 136566705;
         this.sourceX += var1 * 561414215;
         this.startPos += var2 * 1913364417;
         this.x = this.x + Coord.method8301(var1, -355008838);
         this.y = this.y + Coord.method8301(var2, -355008838);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ch.aj(" + ')');
      }
   }

   public int getSourceLevel() {
      return this.startHeight * 796966857;
   }

   @ObfuscatedSignature(descriptor = "(Lcv;III)V")
   @ObfuscatedName("ak")
   void setDestination(WorldViewManager var1, int var2, int var3, int var4) {
      if (var2 >= this.sourceLevel * 1357932181) {
         ProjectileMoved var23 = new ProjectileMoved();
         var23.setProjectile(this);
         var23.setPosition(this.getTarget());
         var23.setZ(this.targetLevel * 1590814649);
         SecureUrlRequester.client.getCallbacks().post(var23);
      }

      try {
         if (var2 < this.sourceLevel * 1357932181) {
            if (var4 > -311022091) {
               ;
            }
         } else {
            ProjectionCoord var5 = DevicePcmPlayerProvider.method147(
               1701463869 * this.sourceY, -1272370825 * this.sourceX, this.startPos * -1087868863, this.targetX * 778233715, var1, (byte)127
            );
            int var6 = (int)var5.x;
            int var7 = (int)var5.y;
            int var8 = (int)var5.z - 1590814649 * this.targetLevel;
            var5.release(-804947546);
            if (!this.isMoving) {
               if (var4 <= -311022091) {
                  throw new IllegalStateException();
               }

               ProjectionCoord var9 = DevicePcmPlayerProvider.method147(
                  this.field547 * -1394484031, this.cycleStart * 1749589321, this.orientation * 1278611793, this.startHeight * 796966857, var1, (byte)61
               );
               int var10 = (int)var9.x;
               int var11 = (int)var9.y;
               int var12 = (int)var9.z - -2026580493 * this.id;
               var9.release(-804947546);
               double var13 = var6 - var10;
               double var15 = var7 - var11;
               double var17 = Math.sqrt(var13 * var13 + var15 * var15);
               double var10001;
               if (Math.abs(var17) < 0.01F) {
                  if (var4 <= -311022091) {
                     return;
                  }

                  var10001 = var10;
               } else {
                  var10001 = var13 * (this.slope * 1850999055) / var17 + var10;
               }

               this.x = var10001;
               if (Math.abs(var17) < 0.01F) {
                  if (var4 <= -311022091) {
                     throw new IllegalStateException();
                  }

                  var10001 = var11;
               } else {
                  var10001 = var15 * (1850999055 * this.slope) / var17 + var11;
               }

               this.y = var10001;
               this.z = var12;
            }

            double var25 = 1 + this.sourceIndex * 105886935 - var2;
            double var26 = (var6 - this.x) / var25;
            double var27 = (var7 - this.y) / var25;
            double var28 = Math.sqrt(var26 * var26 + var27 * var27);
            if (!this.isMoving) {
               if (var4 <= -311022091) {
                  throw new IllegalStateException();
               }

               this.field556 = -var28 * Math.tan(0.02454369 * (this.endHeight * 201594795));
            }

            double var29 = 2.0 * (var8 - this.z - var25 * this.field556) / (var25 * var25);
            this.isMoving = true;
            this.x += var3 * var26;
            this.y += var3 * var27;
            this.z = this.z + (this.field556 * var3 + var3 * (0.5 * var29 * var3));
            this.field556 += var29 * var3;
            this.cycleEnd = ((int)(Math.atan2(var26, var27) * 325.949) + 1024 & 2047) * 1596852663;
            this.targetY = ((int)(Math.atan2(this.field556, var28) * 325.949) & 2047) * 1233665751;
            client.field900.method11638(Occluder.topLevelWorldView, (int)this.x, (int)this.y, false, 133741999);
            GrandExchangeOfferUnitPriceComparator.method8832(this.animationSequence, var3, client.field900, (byte)53);
            classVW.method11640(client.field900, (byte)-49);
         }
      } catch (RuntimeException var24) {
         throw RestClientThreadFactory.newRunException(var24, "ch.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("aw")
   public static int hashString(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - var3 + Sound.charToByteCp1252(var0.charAt(var4), (byte)120);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ch.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         if (AnimationSequence.method10315(this.animationSequence, -831296794)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10318(this.animationSequence, -710190215).method5224(this.animationSequence.getFrame(-609025707), 81249797)) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         SpotAnimationDefinition var2 = class181.SpotAnimationDefinition_get(this.targetIndex * 687491927, -472226059);
         Model var3 = var2.method4617((byte)37);
         if (var3 != null) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            if (null != var3.faceAlphas) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ch.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   protected int vmethod56() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, 1233267984).animationHeightOffset * -1371386713
         : 0;
   }

   public net.runelite.api.Actor getTargetActor() {
      int var1 = this.sourceY * 1701463869;
      WorldView var2 = Occluder.topLevelWorldView;
      if (var1 > 0) {
         int var4 = var1 - 1;
         return (net.runelite.api.Actor)var2.players.method9177(var4);
      } else if (var1 < 0) {
         int var3 = -var1 - 1;
         return (net.runelite.api.Actor)var2.npcs.method9177(var3);
      } else {
         return null;
      }
   }

   public int getId() {
      return this.targetIndex * 687491927;
   }

   public int getEndCycle() {
      return this.sourceIndex * 105886935;
   }

   public int getRemainingCycles() {
      int var1 = SecureUrlRequester.client.getGameCycle();
      return this.getEndCycle() - var1;
   }

   public int getStartHeight() {
      return this.id * -2026580493;
   }

   public int getTargetLevel() {
      return this.targetX * 778233715;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   protected int getAnimationHeightOffset(int var1) {
      try {
         int var10000;
         if (AnimationSequence.method10315(this.animationSequence, -831296794)) {
            if (var1 == -962274595) {
               throw new IllegalStateException();
            }

            var10000 = AnimationSequence.method10318(this.animationSequence, -615519261).animationHeightOffset * 89078819;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ch.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   protected int vmethod54() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, -348008359).animationHeightOffset * 89078819
         : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   protected int vmethod55() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, 660634839).animationHeightOffset * 89078819
         : 0;
   }

   public net.runelite.api.Animation getAnimation() {
      return this.animationSequence.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      try {
         if (AnimationSequence.method10341(this.animationSequence, 30, -1002405506)) {
            if (var1 == 340712311) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpotAnimationDefinition var2 = class181.SpotAnimationDefinition_get(this.targetIndex * 687491927, 1434150743);
            Model var3 = SpotAnimationDefinition.method4613(var2, this.animationSequence.getFrame(-609025707), 1680977540);
            if (null == var3) {
               if (var1 == 340712311) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var3.rotateZ(-876768025 * this.targetY);
               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ch.ag(" + ')');
      }
   }

   public net.runelite.api.Actor getSourceActor() {
      int var1 = this.field547 * -1394484031;
      WorldView var2 = Occluder.topLevelWorldView;
      if (var1 > 0) {
         int var4 = var1 - 1;
         return (net.runelite.api.Actor)var2.players.method9177(var4);
      } else if (var1 < 0) {
         int var3 = -var1 - 1;
         return (net.runelite.api.Actor)var2.npcs.method9177(var3);
      } else {
         return null;
      }
   }

   public int getX1() {
      return LocalPoint.fromWorld(Occluder.topLevelWorldView, this.cycleStart * 1749589321, this.orientation * 1278611793).getX();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   protected int vmethod57() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, 1697115885).animationHeightOffset * 89078819
         : 0;
   }

   public double getZ() {
      return this.z;
   }

   public int getAnimationFrame() {
      return this.animationSequence.frame * 1756992279;
   }

   public LocalPoint getTarget() {
      return LocalPoint.fromWorld(Occluder.topLevelWorldView, this.sourceX * -1272370825, this.startPos * -1087868863);
   }

   public int getOrientation() {
      return this.cycleEnd * -157277177;
   }

   public int getFloor() {
      return this.getSourceLevel();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   static int method1419(int var0) {
      return var0 - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   static int method1420(int var0) {
      return var0 - 1;
   }

   public WorldPoint getSourcePoint() {
      return new WorldPoint(this.cycleStart * 1749589321, this.orientation * 1278611793, this.startHeight * 796966857);
   }

   public int getHeight() {
      return this.id * -2026580493;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ah")
   void method1422(int var1, int var2) {
      this.cycleStart += var1 * -319101703;
      this.orientation += var2 * 727086488;
      this.sourceX += var1 * -693406376;
      this.startPos += var2 * -1434128360;
      this.x = this.x + Coord.method8301(var1, -355008838);
      this.y = this.y + Coord.method8301(var2, -355008838);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIILcv;)Lrx;")
   @ObfuscatedName("af")
   static ProjectionCoord method1425(int var0, int var1, int var2, int var3, WorldViewManager var4) {
      ProjectionCoord var5 = null;
      WorldView var6 = null;
      boolean var7 = 0 != var0;
      if (var7) {
         boolean var9 = var0 > 0;
         Object var8;
         if (var9) {
            int var10 = classBC.method402(var0, 541564370);
            var6 = WallDecoration.method6327(var10, var4, (byte)-120);
            var8 = (Actor)var6.players.get(var10);
         } else {
            int var17 = class27.method925(var0, -275627793);
            var6 = classLI.method7182(var17, var4, (byte)3);
            var8 = WorldView.method3073(var6, var17, 1452266694);
         }

         if (var8 != null) {
            Coord var18 = ((Actor)var8).method2810(var6, (byte)53);
            ProjectionCoord var11;
            synchronized (ProjectionCoord.field5722) {
               if (1970955523 * ProjectionCoord.field5720 == 0) {
                  var11 = new ProjectionCoord();
               } else {
                  ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9878(1701153650);
                  var11 = ProjectionCoord.field5722[1970955523 * ProjectionCoord.field5720];
               }
            }

            var5 = var11;
            var11.x = var18.x * -1931160809;
            var11.y = -263036313 * var18.y;
         }
      }

      if (var5 == null) {
         var6 = WorldViewManager.method2912(var4, var1, var2, -1830113245);
         int var15 = var1 - var6.baseX * 825809917;
         int var16 = var2 - 1279964673 * var6.baseY;
         WorldEntity var19 = (WorldEntity)var4.method2905((byte)-64).worldEntities.get((long)(577964535 * var6.id));
         if (null != var19) {
            var5 = var19.getProjectionCoord(Coord.method8306(var15, 248986601), Coord.method8306(var16, 248986601), 1871633872);
         } else {
            var5 = FaceNormal.method6214(Coord.method8306(var15, 248986601), 0.0F, Coord.method8306(var16, 248986601), 1707355649);
         }
      }

      int var20 = (int)var5.x;
      int var21 = (int)var5.y;
      int var22 = NPCComposition.getTileHeight(var6, var20, var21, var3, -253070517);
      WorldEntity var13 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(var6.id * 577964535));
      if (var13 != null) {
         var22 += NPCComposition.getTileHeight(
            Occluder.topLevelWorldView, var13.getY(-448073764), var13.getX(-727737924), var13.getPlane(1124631797), -253070517
         );
      }

      var5.z = var22;
      return var5;
   }

   public double getY() {
      return this.y;
   }

   public int getStartCycle() {
      return this.sourceLevel * 1357932181;
   }

   public int getEndHeight() {
      return this.targetLevel * 1590814649;
   }

   @ObfuscatedSignature(descriptor = "(Lcv;II)V")
   @ObfuscatedName("al")
   void method1424(WorldViewManager var1, int var2, int var3) {
      if (var2 >= this.sourceLevel * 1357932181) {
         ProjectionCoord var4 = DevicePcmPlayerProvider.method147(
            1701463869 * this.sourceY, -1272370825 * this.sourceX, this.startPos * -1087868863, this.targetX * 778233715, var1, (byte)57
         );
         int var5 = (int)var4.x;
         int var6 = (int)var4.y;
         int var7 = (int)var4.z - 1590814649 * this.targetLevel;
         var4.release(-804947546);
         if (!this.isMoving) {
            ProjectionCoord var8 = DevicePcmPlayerProvider.method147(
               this.field547 * -1394484031, this.cycleStart * 1749589321, this.orientation * 1278611793, this.startHeight * 796966857, var1, (byte)118
            );
            int var9 = (int)var8.x;
            int var10 = (int)var8.y;
            int var11 = (int)var8.z - -2026580493 * this.id;
            var8.release(-804947546);
            double var12 = var5 - var9;
            double var14 = var6 - var10;
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            this.x = Math.abs(var16) < 0.01F ? var9 : var12 * (this.slope * 1850999055) / var16 + var9;
            this.y = Math.abs(var16) < 0.01F ? var10 : var14 * (1850999055 * this.slope) / var16 + var10;
            this.z = var11;
         }

         double var18 = 1 + this.sourceIndex * 105886935 - var2;
         double var19 = (var5 - this.x) / var18;
         double var20 = (var6 - this.y) / var18;
         double var21 = Math.sqrt(var19 * var19 + var20 * var20);
         if (!this.isMoving) {
            this.field556 = -var21 * Math.tan(0.02454369 * (this.endHeight * 201594795));
         }

         double var22 = 2.0 * (var7 - this.z - var18 * this.field556) / (var18 * var18);
         this.isMoving = true;
         this.x += var3 * var19;
         this.y += var3 * var20;
         this.z = this.z + (this.field556 * var3 + var3 * (0.5 * var22 * var3));
         this.field556 += var22 * var3;
         this.cycleEnd = ((int)(Math.atan2(var19, var20) * 325.949) + 1024 & 2047) * 1596852663;
         this.targetY = ((int)(Math.atan2(this.field556, var21) * 325.949) & 2047) * 1233665751;
         client.field900.method11638(Occluder.topLevelWorldView, (int)this.x, (int)this.y, false, 133741999);
         GrandExchangeOfferUnitPriceComparator.method8832(this.animationSequence, var3, client.field900, (byte)101);
         classVW.method11640(client.field900, (byte)-47);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, -5174584).method5224(this.animationSequence.getFrame(-609025707), 52650960)) {
         return true;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.targetIndex * 687491927, 901756294);
         Model var2 = var1.method4617((byte)72);
         return var2 != null && null != var2.faceAlphas;
      }
   }

   public double getX() {
      return this.x;
   }

   public int getStartPos() {
      return this.slope * 1850999055;
   }

   public int getSlope() {
      return this.endHeight * 201594795;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, -1976596461).method5224(this.animationSequence.getFrame(-609025707), -1225490913)) {
         return true;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.targetIndex * 687491927, 1390584059);
         Model var2 = var1.method4617((byte)20);
         return var2 != null && null != var2.faceAlphas;
      }
   }

   Projectile(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      this.animationSequence = new AnimationSequence();
      this.startHeight = var1 * 2116782713;
      this.cycleStart = var2 * -319101703;
      this.orientation = 136566705 * var3;
      this.id = var4 * -1377187013;
      this.field547 = -1538477247 * var5;
      this.targetX = var6 * 1846121915;
      this.sourceX = 561414215 * var7;
      this.startPos = 1913364417 * var8;
      this.targetLevel = -760877431 * var9;
      this.sourceY = var10 * 1328236565;
      this.targetIndex = var11 * 1651757159;
      this.sourceLevel = 1568027837 * var12;
      this.sourceIndex = 289308391 * var13;
      this.endHeight = var14 * -2115097853;
      this.slope = 1168559599 * var15;
      AnimationSequence.method10313(
         this.animationSequence, class181.SpotAnimationDefinition_get(687491927 * this.targetIndex, 518127603).sequence * -508160903, -568109315
      );
   }

   @ObfuscatedSignature(descriptor = "(Lof;III)V")
   @ObfuscatedName("my")
   static void alignWidgetPosition(Widget var0, int var1, int var2, int var3) {
      try {
         if (-423647551 * var0.xAlignment == 0) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.x = 1406454795 * var0.rawX;
            var0.method8177(-1);
         } else if (var0.xAlignment * -423647551 == 1) {
            if (var3 != -1844377419) {
               return;
            }

            var0.x = -890506545 * (var0.rawX * -1022258683 + (var1 - var0.width * -1946208531) / 2);
            var0.method8177(-1);
         } else if (2 == -423647551 * var0.xAlignment) {
            if (var3 != -1844377419) {
               return;
            }

            var0.x = -890506545 * (var1 - -1946208531 * var0.width - -1022258683 * var0.rawX);
            var0.method8177(-1);
         } else if (-423647551 * var0.xAlignment == 3) {
            var0.x = (-1022258683 * var0.rawX * var1 >> 14) * -890506545;
            var0.method8177(-1);
         } else if (4 == var0.xAlignment * -423647551) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.x = ((var1 * var0.rawX * -1022258683 >> 14) + (var1 - var0.width * -1946208531) / 2) * -890506545;
            var0.method8177(-1);
         } else {
            var0.x = (var1 - var0.width * -1946208531 - (var1 * var0.rawX * -1022258683 >> 14)) * -890506545;
            var0.method8177(-1);
         }

         if (-818525789 * var0.yAlignment == 0) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.y = var0.rawY * -263606643;
            var0.method8180(-1);
         } else if (-818525789 * var0.yAlignment == 1) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.y = 90132725 * (1002768441 * var0.rawY + (var2 - var0.height * -905446999) / 2);
            var0.method8180(-1);
         } else if (2 == -818525789 * var0.yAlignment) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.y = 90132725 * (var2 - var0.height * -905446999 - 1002768441 * var0.rawY);
            var0.method8180(-1);
         } else if (var0.yAlignment * -818525789 == 3) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.y = 90132725 * (var2 * 1002768441 * var0.rawY >> 14);
            var0.method8180(-1);
         } else if (var0.yAlignment * -818525789 == 4) {
            if (var3 != -1844377419) {
               throw new IllegalStateException();
            }

            var0.y = 90132725 * ((var2 * 1002768441 * var0.rawY >> 14) + (var2 - var0.height * -905446999) / 2);
            var0.method8180(-1);
         } else {
            var0.y = 90132725 * (var2 - -905446999 * var0.height - (var2 * var0.rawY * 1002768441 >> 14));
            var0.method8180(-1);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ch.my(" + ')');
      }
   }

   public WorldPoint getTargetPoint() {
      return new WorldPoint(this.sourceX * -1272370825, this.startPos * -1087868863, this.targetX * 778233715);
   }

   public void setEndCycle(int var1) {
      this.sourceIndex = var1 * 289308391;
   }

   public int getY1() {
      return LocalPoint.fromWorld(Occluder.topLevelWorldView, this.cycleStart * 1749589321, this.orientation * 1278611793).getY();
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      if (AnimationSequence.method10341(this.animationSequence, 30, -1002405506)) {
         return null;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.targetIndex * 1837525203, 1516971961);
         Model var2 = SpotAnimationDefinition.method4613(var1, this.animationSequence.getFrame(-609025707), 1824436158);
         if (null == var2) {
            return null;
         } else {
            var2.rotateZ(-1464723005 * this.targetY);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("og")
   public void method1430(int var1, int var2) {
      this.method1421(var1, var2, (byte)-124);
   }

   @ObfuscatedSignature(descriptor = "(Lut;I)I")
   @ObfuscatedName("aj")
   public static int method1427(DynamicArray var0, int var1) {
      try {
         classWJ.method11743(var0, (byte)15);
         byte var2 = 0;
         int var3 = var0.method11215((byte)51);
         int var4 = -1;
         if (class586.field6376 == var0.field6107) {
            int[] var5 = var0.method11207(2053374425);

            for (int var6 = var2; var6 < var3; var6++) {
               if (var1 != 1393891487) {
                  throw new IllegalStateException();
               }

               if (var4 != -1) {
                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }

                  if (var5[var6] <= var5[var4]) {
                     continue;
                  }

                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var6;
            }
         } else if (var0.field6107 == class586.field6377) {
            if (var1 != 1393891487) {
               throw new IllegalStateException();
            }

            long[] var10 = DynamicArray.method11211(var0, (byte)-69);

            for (int var12 = var2; var12 < var3; var12++) {
               if (var1 != 1393891487) {
                  throw new IllegalStateException();
               }

               if (var4 != -1) {
                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }

                  if (var10[var12] <= var10[var4]) {
                     continue;
                  }

                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var12;
            }
         } else if (var0.field6107 == class586.field6379) {
            if (var1 != 1393891487) {
               throw new IllegalStateException();
            }

            String var11 = null;
            Object[] var13 = var0.method11214((byte)50);

            for (int var7 = var2; var7 < var3; var7++) {
               if (var1 != 1393891487) {
                  throw new IllegalStateException();
               }

               String var8 = (String)var13[var7];
               if (var4 != -1) {
                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }

                  if (var8 == null) {
                     continue;
                  }

                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }

                  if (var8.compareTo(var11) <= 0) {
                     continue;
                  }

                  if (var1 != 1393891487) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var7;
               var11 = var8;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ch.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   void method1423(int var1, int var2) {
      this.cycleStart += var1 * -319101703;
      this.orientation += var2 * 136566705;
      this.sourceX += var1 * 561414215;
      this.startPos += var2 * 1913364417;
      this.x = this.x + Coord.method8301(var1, -355008838);
      this.y = this.y + Coord.method8301(var2, -355008838);
   }
}
