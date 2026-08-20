import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AmbientSoundEffectCreated;
import net.runelite.api.events.ItemSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dd")
public class WorldView extends Node implements net.runelite.api.WorldView {
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("ax")
   NodeDeque graphicsObjects;
   @ObfuscatedSignature(descriptor = "Lsr;")
   @ObfuscatedName("ar")
   classSR field1313;
   @ObfuscatedSignature(descriptor = "Ljh;")
   @ObfuscatedName("ag")
   public Scene scene;
   @ObfuscatedSignature(descriptor = "[Lkk;")
   @ObfuscatedName("an")
   CollisionMap[] collisionMaps;
   @ObfuscatedName("wk")
   public int[][] field1336;
   @ObfuscatedSignature(descriptor = "Lqu;")
   @ObfuscatedName("ad")
   public IndexedObjectSet players;
   @ObfuscatedName("cv")
   public boolean field1334;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("av")
   final NodeDeque objectSounds;
   @ObfuscatedName("ak")
   public int sizeY;
   @ObfuscatedName("zj")
   public int[][][] field1337;
   @ObfuscatedName("oz")
   public int[] field1335;
   @ObfuscatedName("ay")
   int[][] tileLastDrawnActor;
   @ObfuscatedName("ap")
   int baseY;
   @ObfuscatedSignature(descriptor = "[[[Lrt;")
   @ObfuscatedName("ri")
   public final NodeDeque[][][] field1310;
   @ObfuscatedName("aj")
   public int sizeX;
   @ObfuscatedName("mt")
   public int field1331;
   @ObfuscatedName("au")
   int[][][] tileHeights;
   @ObfuscatedName("az")
   byte[][][] tileSettings;
   @ObfuscatedSignature(descriptor = "Lqu;")
   @ObfuscatedName("ai")
   public IndexedObjectSet npcs;
   @ObfuscatedName("uo")
   static int field1332;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("yj")
   public NodeDeque field1308 = new NodeDeque();
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("as")
   IterableNodeHashTable worldEntities;
   @ObfuscatedSignature(descriptor = "[[[Lrt;")
   @ObfuscatedName("ac")
   NodeDeque[][][] groundItems;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("ab")
   NodeDeque pendingSpawns;
   @ObfuscatedName("at")
   public int id;
   @ObfuscatedName("ae")
   public int plane;
   @ObfuscatedSignature(descriptor = "Lsr;")
   @ObfuscatedName("ah")
   classSR field1314;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("rd")
   static Widget field1333;
   @ObfuscatedName("aw")
   int baseX;

   public int getSizeX() {
      return this.sizeX * 2010544793;
   }

   public int getId() {
      return this.id * 577964535;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method3101(int var1) {
      this.field1331 = this.plane * 2115028565;
   }

   WorldView(int var1, int var2, int var3, int var4, TileRenderMode var5) {
      this.objectSounds = null;
      this.field1310 = new NodeDeque[4][var2][var3];
      this.objectSounds = new NodeDeque();
      this.collisionMaps = new CollisionMap[4];
      this.pendingSpawns = new NodeDeque();
      this.graphicsObjects = new NodeDeque();
      this.field1313 = new classSR(149);
      this.field1314 = new classSR(25);
      this.id = var1 * -541161529;
      this.sizeX = -98223703 * var2;
      this.sizeY = 1777028527 * var3;
      this.npcs = new IndexedObjectSet(var1 == -1 ? 512 : 8);
      this.players = new IndexedObjectSet(var1 == -1 ? 128 : 8);
      this.worldEntities = new IterableNodeHashTable(var1 == -1 ? 32 : 1);
      this.groundItems = new NodeDeque[4][var2][var3];
      this.tileHeights = new int[4][1 + var2][1 + var3];
      this.tileSettings = new byte[4][var2][var3];
      this.tileLastDrawnActor = new int[var2][var3];
      boolean var6 = -1 != var1;

      for (int var7 = 0; var7 < 4; var7++) {
         this.collisionMaps[var7] = new CollisionMap(var2, var3, var6);
      }

      this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
      this.method3096();
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)Z")
   @ObfuscatedName("oa")
   public static boolean method3060(WorldView var0, byte var1) {
      if (var0 == null) {
         return var0.method3064(var1);
      } else {
         try {
            boolean var10000;
            if (-1 == var0.id * 577964535) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "dd.av(" + ')');
         }
      }
   }

   public int getPlane() {
      return this.plane * 2115028565;
   }

   public int getBaseX() {
      return this.baseX * 825809917;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;II)Lci;")
   @ObfuscatedName("yb")
   public static Player method3073(WorldView var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3076(var1, var1);
      }

      try {
         return (Player)var0.npcs.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dd.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)V")
   @ObfuscatedName("zp")
   public static void method3068(WorldView var0, byte var1) {
      if (var0 == null) {
         var0.method3090(var1);
      }

      try {
         var0.npcs.clear();
         Iterator var2 = var0.players.iterator();

         while (var2.hasNext()) {
            if (var1 == 10) {
               throw new IllegalStateException();
            }

            Actor var3 = (Actor)var2.next();
            var3.targetIndex = 92047129;
            var3.method2838(-1);
            var3.false0 = false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dd.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILiv;I)V")
   @ObfuscatedName("qz")
   public void method3098(int var1, int var2, int var3, ObjectComposition var4, int var5) {
      ObjectSound var6 = (ObjectSound)this.objectSounds.method9828();
      AmbientSoundEffectCreated var7 = new AmbientSoundEffectCreated(var6);
      SecureUrlRequester.client.getCallbacks().post(var7);
   }

   @ObfuscatedSignature(descriptor = "()Lrt;")
   @ObfuscatedName("am")
   NodeDeque method3078() {
      return this.objectSounds;
   }

   public boolean contains(WorldPoint var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      return var2 >= this.baseX * 825809917
         && var2 < this.baseX * 825809917 + this.sizeX * 2010544793
         && var3 >= this.baseY * 1279964673
         && var3 < this.baseY * 1279964673 + this.sizeY * 1823353167;
   }

   public net.runelite.api.Projection getCanvasProjection() {
      if (this.scene.field2917 instanceof FloatProjection) {
         FloatProjection var1 = (FloatProjection)this.scene.field2917;
         if (TransformationMatrix.field5728.equals(var1.transformationMatrix)) {
            return null;
         }
      }

      return this.scene.field2917;
   }

   @ObfuscatedSignature(descriptor = "(I)Lci;")
   @ObfuscatedName("ax")
   Player method3074(int var1) {
      return (Player)this.npcs.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lci;")
   @ObfuscatedName("lf")
   public Player method3102(int var1) {
      return method3073(this, var1, 1799324545);
   }

   @ObfuscatedSignature(descriptor = "(J)Lcw;")
   @ObfuscatedName("qh")
   public PendingSpawn method3095(long var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if ((var1 >> 16 & 7L) != 2L) {
         return null;
      } else {
         int var3 = (int)(var1 >> 0 & 127L);
         int var4 = (int)(var1 >> 7 & 127L);
         int var5 = (int)(var1 >> 14 & 3L);
         int var6 = (int)(var1 >> 20 & 4294967295L);

         for (PendingSpawn var7 = (PendingSpawn)this.pendingSpawns.method9830(); var7 != null; var7 = (PendingSpawn)this.pendingSpawns.method9827()) {
            if (var6 == var7.objectId2 * -1096388433 && var5 == var7.plane * 1465889165 && var3 == var7.x * 1691331269 && var4 == var7.y * -7912037) {
               return var7;
            }
         }

         return null;
      }
   }

   public net.runelite.api.IndexedObjectSet players() {
      return this.npcs;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void method3084(byte var1) {
      try {
         for (ObjectSound var2 = (ObjectSound)this.objectSounds.last(); null != var2; var2 = (ObjectSound)this.objectSounds.previous()) {
            if (var1 >= 32) {
               throw new IllegalStateException();
            }

            ObjectSound.method2708(var2, -687136603);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dd.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILiv;II)V")
   @ObfuscatedName("aj")
   void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5, int var6) {
      try {
         ObjectSound var7 = new ObjectSound(577964535 * this.id, var1, var2, var3, var5, var4);
         this.objectSounds.addFirst(var7);
         this.method3098(var1, var2, var3, var4, var5);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dd.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILiv;II)V")
   @ObfuscatedName("aw")
   void method3091(int var1, int var2, int var3, ObjectComposition var4, int var5, int var6) {
      try {
         if (null != var4) {
            if (var6 >= 515548769) {
               throw new IllegalStateException();
            }

            if (var4.hasSound(1918356517)) {
               if (var6 >= 515548769) {
                  throw new IllegalStateException();
               }

               int var7;
               int var8;
               label108: {
                  var7 = 1813358617 * var4.sizeX;
                  var8 = -352504863 * var4.sizeY;
                  if (var5 != 1) {
                     if (var6 >= 515548769) {
                        return;
                     }

                     if (var5 != 3) {
                        break label108;
                     }
                  }

                  var7 = var4.sizeY * -352504863;
                  var8 = var4.sizeX * 1813358617;
               }

               int var9 = Coord.method8301(var7 + var2, -355008838);
               int var10 = Coord.method8301(var3 + var8, -355008838);
               var2 = Coord.method8301(var2, -355008838);
               var3 = Coord.method8301(var3, -355008838);
               int var11 = var4.ambientSoundId * -1194817153;
               int var12 = Coord.method8301(var4.int7 * -22639547, -355008838);
               int var13 = Math.max(Coord.method8301(-1714304273 * var4.int8 - 1, -355008838), 0);
               if (var4.transforms != null) {
                  if (var6 >= 515548769) {
                     return;
                  }

                  ObjectComposition var14 = var4.transform(5667229);
                  if (null != var14) {
                     if (var6 >= 515548769) {
                        return;
                     }

                     var11 = -1194817153 * var14.ambientSoundId;
                     var12 = Coord.method8301(var14.int7 * -22639547, -355008838);
                     var13 = Math.max(Coord.method8301(var4.int8 * -1714304273 - 1, -355008838), 0);
                  }
               }

               for (ObjectSound var18 = (ObjectSound)this.objectSounds.last(); null != var18; var18 = (ObjectSound)this.objectSounds.previous()) {
                  if (var18.method2722(-2095760655) == var1) {
                     if (var6 >= 515548769) {
                        throw new IllegalStateException();
                     }

                     if (var18.method2712(-52580555) == var2) {
                        if (var6 >= 515548769) {
                           throw new IllegalStateException();
                        }

                        if (ObjectSound.method2716(var18, 1169198172) == var3) {
                           if (var6 >= 515548769) {
                              throw new IllegalStateException();
                           }

                           if (ObjectSound.method2715(var18, 1435659795) == var9) {
                              if (var6 >= 515548769) {
                                 throw new IllegalStateException();
                              }

                              if (var18.method2718(-845914253) == var10) {
                                 if (var6 >= 515548769) {
                                    throw new IllegalStateException();
                                 }

                                 if (ObjectSound.method2709(var18, (byte)63) == var11) {
                                    if (var6 >= 515548769) {
                                       throw new IllegalStateException();
                                    }

                                    if (ObjectSound.method2727(var18, -742539409) == var12) {
                                       if (var6 >= 515548769) {
                                          throw new IllegalStateException();
                                       }

                                       if (var18.method2730(2020781859) == var13) {
                                          ObjectSound.method2708(var18, -687136603);
                                          break;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "dd.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jw")
   public void method3097() {
      if (SecureUrlRequester.client.method2443() != null) {
         rl8[][][] var1 = this.scene.method5695();
         NodeDeque[][] var2 = this.groundItems[this.plane * 2115028565];

         for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
               NodeDeque var5 = var2[var3][var4];
               if (var5 != null) {
                  rl8 var6 = var1[this.plane * 2115028565][var3][var4];
                  if (this.scene.method5737(var6.field5670)) {
                     assert var6.method9613() != null;

                     for (TileItem var7 = (TileItem)var5.method9830(); var7 != null; var7 = (TileItem)var5.method9827()) {
                        var7.method3054(var3);
                        var7.method3056(var4);
                        var7.field1294 = this.getId();
                        ItemSpawned var8 = new ItemSpawned(var6, var7);
                        SecureUrlRequester.client.getCallbacks().post(var8);
                     }
                  }
               }
            }
         }
      }
   }

   public int getSizeY() {
      return this.sizeY * 1823353167;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   boolean method3061() {
      return -1 == this.id * 577964535;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   boolean method3062() {
      return -1 == this.id * 577964535;
   }

   @ObfuscatedSignature(descriptor = "()Ljh;")
   @ObfuscatedName("si")
   public Scene method3099() {
      return this.scene;
   }

   public boolean contains(LocalPoint var1) {
      if (var1.getWorldView() != this.id * 577964535) {
         return false;
      } else {
         int var2 = var1.getX();
         int var3 = var1.getY();
         var2 >>= 7;
         var3 >>= 7;
         return var2 >= 0 && var2 < this.sizeX * 2010544793 && var3 >= 0 && var3 < this.sizeY * 1823353167;
      }
   }

   public int[] getMapRegions() {
      return this.field1335;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   boolean method3063() {
      return -1 == this.id * 577964535;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method3069() {
      this.npcs.clear();

      for (Actor var2 : this.players) {
         var2.targetIndex = 92047129;
         var2.false0 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method3065() {
      classSR.method10505(this.field1313, -436421820);
      classSR.method10505(this.field1314, -1808608846);
      this.npcs.clear();
      this.players.clear();
      this.worldEntities.clear();
      NodeDeque.method9797(this.graphicsObjects);
      this.pendingSpawns = new NodeDeque();

      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < -549303062 * this.sizeX; var2++) {
            for (int var3 = 0; var3 < this.sizeY * 1823353167; var3++) {
               this.groundItems[var1][var2][var3] = null;
            }
         }
      }

      this.scene.clearTempGameObjects();

      for (int var4 = 0; var4 < 4; var4++) {
         CollisionMap.method6382(this.collisionMaps[var4], 1751321692);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ldd;")
   @ObfuscatedName("zf")
   public static WorldView method3094(int var0) {
      return var0 == -1 ? Occluder.topLevelWorldView : client.worldViewManager.method2969(var0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method3070() {
      this.npcs.clear();

      for (Actor var2 : this.players) {
         var2.targetIndex = 92047129;
         var2.false0 = false;
      }
   }

   public int[][][] getTileHeights() {
      return this.tileHeights;
   }

   public int getBaseY() {
      return this.baseY * 1279964673;
   }

   public Deque getGraphicsObjects() {
      return this.graphicsObjects;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method3071() {
      this.npcs.clear();

      for (Actor var2 : this.players) {
         var2.targetIndex = 92047129;
         var2.false0 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method3066() {
      classSR.method10505(this.field1313, -1927865261);
      classSR.method10505(this.field1314, -483011609);
      this.npcs.clear();
      this.players.clear();
      this.worldEntities.clear();
      NodeDeque.method9797(this.graphicsObjects);
      this.pendingSpawns = new NodeDeque();

      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < 2010544793 * this.sizeX; var2++) {
            for (int var3 = 0; var3 < this.sizeY * 1823353167; var3++) {
               this.groundItems[var1][var2][var3] = null;
            }
         }
      }

      this.scene.clearTempGameObjects();

      for (int var4 = 0; var4 < 4; var4++) {
         CollisionMap.method6382(this.collisionMaps[var4], 1913854636);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method3072() {
      this.npcs.clear();

      for (Actor var2 : this.players) {
         var2.targetIndex = 92047129;
         var2.false0 = false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;)I")
   @ObfuscatedName("pp")
   public static int method3059(UserList var0) {
      return var0.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method3085() {
      for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); null != var1; var1 = (ObjectSound)this.objectSounds.previous()) {
         ObjectSound.method2708(var1, -687136603);
      }
   }

   public net.runelite.api.Tile getSelectedSceneTile() {
      int var1 = SecureUrlRequester.client.isMenuOpen() ? this.scene.baseX : this.scene.Scene_baseX;
      int var2 = SecureUrlRequester.client.isMenuOpen() ? this.scene.baseY : this.scene.Scene_baseY;
      return var1 >= this.scene.field3022 && var2 >= this.scene.field3016 && var1 < this.scene.field3018 && var2 < this.scene.field3015
         ? this.scene.field2886[this.getPlane()][var1 + this.scene.field3014][var2 + this.scene.field3014]
         : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lci;")
   @ObfuscatedName("ah")
   Player method3075(int var1) {
      return (Player)this.npcs.get(var1);
   }

   public boolean isTopLevel() {
      return this.id * 577964535 == -1;
   }

   public int getYellowClickAction() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         ClickAction var1 = client.worldViewManager.method2966(this.id * 577964535);
         return var1.method9146();
      }
   }

   public int[][] getXteaKeys() {
      return this.field1336;
   }

   @ObfuscatedSignature(descriptor = "()Lrt;")
   @ObfuscatedName("al")
   NodeDeque method3079() {
      return this.objectSounds;
   }

   public net.runelite.api.IndexedObjectSet npcs() {
      return this.players;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Z)V")
   @ObfuscatedName("he")
   public static void method3093(ClientPreferences var0, boolean var1) {
      if (var0 == null) {
         var0.method1577(var1);
      }

      var0.displayFps = var1;
      Player.savePreferences((byte)-124);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method3086() {
      for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); null != var1; var1 = (ObjectSound)this.objectSounds.previous()) {
         ObjectSound.method2708(var1, -687136603);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ra")
   public void method3096() {
      this.scene.field3023 = this;
      this.scene.field3028 = this.tileSettings;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrt;")
   @ObfuscatedName("ae")
   NodeDeque method3080(int var1) {
      try {
         return this.objectSounds;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dd.ae(" + ')');
      }
   }

   public byte[][][] getTileSettings() {
      return this.tileSettings;
   }

   @ObfuscatedSignature(descriptor = "(IIILiv;I)V")
   @ObfuscatedName("aa")
   void method3082(int var1, int var2, int var3, ObjectComposition var4, int var5) {
      ObjectSound var6 = new ObjectSound(577964535 * this.id, var1, var2, var3, var5, var4);
      this.objectSounds.addFirst(var6);
   }

   public net.runelite.api.Projection getMainWorldProjection() {
      return TransformationMatrix.field5728.equals(this.scene.field2918.transformationMatrix) ? null : this.scene.field2918;
   }

   public net.runelite.api.Projectile createProjectile(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, net.runelite.api.Actor var11, int var12, int var13
   ) {
      return SecureUrlRequester.client.method2365(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void method3067(int var1) {
      try {
         classSR.method10505(this.field1313, -339513105);
         classSR.method10505(this.field1314, -480109109);
         this.npcs.clear();
         this.players.clear();
         this.worldEntities.clear();
         NodeDeque.method9797(this.graphicsObjects);
         this.pendingSpawns = new NodeDeque();

         for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 2010544793 * this.sizeX; var3++) {
               if (var1 == -1053666579) {
                  return;
               }

               for (int var4 = 0; var4 < this.sizeY * 1823353167; var4++) {
                  if (var1 == -1053666579) {
                     throw new IllegalStateException();
                  }

                  this.groundItems[var2][var3][var4] = null;
               }
            }
         }

         this.scene.clearTempGameObjects();

         for (int var6 = 0; var6 < 4; var6++) {
            if (var1 == -1053666579) {
               throw new IllegalStateException();
            }

            CollisionMap.method6382(this.collisionMaps[var6], 570220214);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dd.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method3087() {
      for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); null != var1; var1 = (ObjectSound)this.objectSounds.previous()) {
         ObjectSound.method2708(var1, -687136603);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method3088() {
      for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); null != var1; var1 = (ObjectSound)this.objectSounds.previous()) {
         ObjectSound.method2708(var1, -687136603);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILiv;I)V")
   @ObfuscatedName("bz")
   void method3092(int var1, int var2, int var3, ObjectComposition var4, int var5) {
      if (null != var4 && var4.hasSound(1752821545)) {
         int var6 = 1813358617 * var4.sizeX;
         int var7 = 931109324 * var4.sizeY;
         if (var5 == 1 || var5 == 3) {
            var6 = var4.sizeY * -1462186276;
            var7 = var4.sizeX * 1813358617;
         }

         int var8 = Coord.method8301(var6 + var2, -355008838);
         int var9 = Coord.method8301(var3 + var7, -355008838);
         var2 = Coord.method8301(var2, -355008838);
         var3 = Coord.method8301(var3, -355008838);
         int var10 = var4.ambientSoundId * -1969900050;
         int var11 = Coord.method8301(var4.int7 * -22639547, -355008838);
         int var12 = Math.max(Coord.method8301(-1911609695 * var4.int8 - 1, -355008838), 0);
         if (var4.transforms != null) {
            ObjectComposition var13 = var4.transform(1063808736);
            if (null != var13) {
               var10 = -1194817153 * var13.ambientSoundId;
               var11 = Coord.method8301(var13.int7 * 774543813, -355008838);
               var12 = Math.max(Coord.method8301(var4.int8 * 756897710 - 1, -355008838), 0);
            }
         }

         for (ObjectSound var16 = (ObjectSound)this.objectSounds.last(); null != var16; var16 = (ObjectSound)this.objectSounds.previous()) {
            if (var16.method2722(-2037177923) == var1
               && var16.method2712(1143130983) == var2
               && ObjectSound.method2716(var16, -505207824) == var3
               && ObjectSound.method2715(var16, 668514052) == var8
               && var16.method2718(-1130167686) == var9
               && ObjectSound.method2709(var16, (byte)35) == var10
               && ObjectSound.method2727(var16, -691207189) == var11
               && var16.method2730(2009691974) == var12) {
               ObjectSound.method2708(var16, -687136603);
               break;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("hu")
   public static void method3089(WorldView var0) {
      if (var0 == null) {
         var0.getSizeY();
      }

      for (ObjectSound var1 = (ObjectSound)var0.objectSounds.last(); null != var1; var1 = (ObjectSound)var0.objectSounds.previous()) {
         ObjectSound.method2708(var1, -687136603);
      }
   }

   public net.runelite.api.IndexedObjectSet worldEntities() {
      return this.worldEntities;
   }

   public boolean isInstance() {
      return this.field1334;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void method3090(byte var1) {
      try {
         for (ObjectSound var2 = (ObjectSound)this.objectSounds.method9811(); null != var2; var2 = (ObjectSound)this.objectSounds.removeLast()) {
            if (var1 >= 32) {
               throw new IllegalStateException();
            }

            ObjectSound.method2708(var2, -687136603);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dd.ak(" + ')');
      }
   }

   public int[][][] getInstanceTemplateChunks() {
      return this.field1337;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIILiv;I)V")
   @ObfuscatedName("kp")
   public static void method3083(WorldView var0, int var1, int var2, int var3, ObjectComposition var4, int var5) {
      ObjectSound var6 = new ObjectSound(577964535 * var0.id, var1, var2, var3, var5, var4);
      var0.objectSounds.addFirst(var6);
   }

   @ObfuscatedSignature(descriptor = "(II)Lci;")
   @ObfuscatedName("an")
   Player method3076(int var1, int var2) {
      try {
         return (Player)this.players.method9177(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dd.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;I)Lci;")
   @ObfuscatedName("dp")
   public static Player method3077(WorldView var0, int var1) {
      return (Player)var0.npcs.get(var1);
   }

   @ObfuscatedSignature(descriptor = "()[Lkk;")
   @ObfuscatedName("bc")
   public CollisionMap[] method3100() {
      return this.collisionMaps;
   }

   public net.runelite.api.IndexedObjectSet worldViews() {
      return new rl18(this);
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   boolean method3064(byte var1) {
      try {
         boolean var10000;
         if (-1 == this.sizeY * 577964535) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dd.av(" + ')');
      }
   }
}
