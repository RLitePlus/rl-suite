import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AmbientSoundEffectCreated;
import net.runelite.api.events.ItemSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dz")
public class WorldView extends Node implements net.runelite.api.WorldView {
   @ObfuscatedSignature(descriptor = "[[[Lnn;")
   @ObfuscatedName("ka")
   public final classNN[][][] field1686;
   @ObfuscatedName("as")
   public int field1696;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ui")
   public classNN field1685 = new classNN();
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("az")
   final classNN field1695;
   @ObfuscatedSignature(descriptor = "Lez;")
   @ObfuscatedName("ae")
   public Scene scene;
   @ObfuscatedSignature(descriptor = "[Lgc;")
   @ObfuscatedName("ab")
   CollisionMap[] field1687;
   @ObfuscatedName("ag")
   public int field1710;
   @ObfuscatedName("ao")
   int[][] field1703;
   @ObfuscatedName("av")
   static int[][] field1705 = new int[2][3];
   @ObfuscatedName("ac")
   int field1709;
   @ObfuscatedName("af")
   public int field1699;
   @ObfuscatedName("aa")
   int field1708;
   @ObfuscatedName("al")
   int[][][] field1688;
   @ObfuscatedName("aj")
   byte[][][] field1702;
   @ObfuscatedSignature(descriptor = "Lyk;")
   @ObfuscatedName("ay")
   public IndexedObjectSet field1694;
   @ObfuscatedSignature(descriptor = "Lzh;")
   @ObfuscatedName("aw")
   classZH field1693;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ad")
   IterableNodeHashTable worldEntities;
   @ObfuscatedSignature(descriptor = "[[[Lnn;")
   @ObfuscatedName("ap")
   classNN[][][] field1701;
   @ObfuscatedName("ax")
   public int field1692;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ai")
   classNN field1691;
   @ObfuscatedName("di")
   public int field1711;
   @ObfuscatedName("ju")
   public int[][][] field1714;
   @ObfuscatedSignature(descriptor = "Lzh;")
   @ObfuscatedName("ar")
   classZH field1697;
   @ObfuscatedName("ak")
   static int[][] field1704 = new int[2][3];
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("au")
   classNN field1690;
   @ObfuscatedSignature(descriptor = "Lyk;")
   @ObfuscatedName("aq")
   public IndexedObjectSet field1698;
   @ObfuscatedName("ju")
   public boolean field1712;
   @ObfuscatedName("jj")
   public int[] field1713;
   @ObfuscatedName("at")
   static int[][] field1706 = new int[2][3];

   public Tile getSelectedSceneTile() {
      int var1 = classOE.client.isMenuOpen() ? this.scene.field2036 : this.scene.field2026;
      int var2 = classOE.client.isMenuOpen() ? this.scene.field2037 : this.scene.field2034;
      return var1 >= this.scene.field2144 && var2 >= this.scene.field2148 && var1 < this.scene.field2145 && var2 < this.scene.field2111
         ? this.scene.field1993[this.getPlane()][var1 + this.scene.field2147][var2 + this.scene.field2147]
         : null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lky;")
   @ObfuscatedName("ae")
   classKY method3726(int var1, int var2, int var3, int var4) {
      try {
         return new classKY(var1, var2 - this.field1709 * -1444178379, var3 - -351145363 * this.field1708);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dz.ae(" + ')');
      }
   }

   public boolean isTopLevel() {
      return this.field1699 * 2140889407 == 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method3719(int var1) {
      try {
         boolean var10000;
         if (0 == this.field1699 * 2140889407) {
            if (var1 != -2087374717) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfn;IIII)I")
   @ObfuscatedName("bl")
   int method3763(SceneTileModel var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var1.field2330.length; var6++) {
         int var7 = var1.field2322[var1.field2330[var6]];
         int var8 = var1.field2327[var1.field2330[var6]];
         int var9 = var1.field2322[var1.field2331[var6]];
         int var10 = var1.field2327[var1.field2331[var6]];
         int var11 = var1.field2322[var1.field2329[var6]];
         int var12 = var1.field2327[var1.field2329[var6]];
         if (Scene.method4144(var4, var5, var8, var10, var12, var7, var9, var11)) {
            int var13 = var1.field2323[var1.field2330[var6]];
            int var14 = var1.field2323[var1.field2331[var6]];
            int var15 = var1.field2323[var1.field2329[var6]];
            float var16 = classVI.method11957(var4, var5, var7, var9, var11, var8, var10, var12, var13, var14, var15, -2120871691);
            return (int)var16;
         }
      }

      return -1067550383;
   }

   @ObfuscatedSignature(descriptor = "(IIILom;I)V")
   @ObfuscatedName("vp")
   public void method3779(int var1, int var2, int var3, classOM var4, int var5) {
      ObjectSound var6 = (ObjectSound)this.field1695.method7930();
      AmbientSoundEffectCreated var7 = new AmbientSoundEffectCreated(var6);
      classOE.client.getCallbacks().post(var7);
   }

   public int getBaseY() {
      return this.field1708 * -351145363;
   }

   @ObfuscatedSignature(descriptor = "(J)Lcd;")
   @ObfuscatedName("zr")
   public classCD method3775(long var1) {
      if (!classOE.client.isClientThread()) {
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

         for (classCD var7 = (classCD)this.field1690.method7931(); var7 != null; var7 = (classCD)this.field1690.method7935()) {
            if (var6 == var7.field675 * 1490231037
               && var5 == var7.field679 * -1436432311
               && var3 == var7.field676 * -1779660971
               && var4 == var7.field680 * -522576623) {
               return var7;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method3728(int var1) {
      try {
         this.field1694.method13396();
         Iterator var2 = this.field1698.iterator();

         while (var2.hasNext()) {
            if (var1 != -1008620329) {
               throw new IllegalStateException();
            }

            Actor var3 = (Actor)var2.next();
            var3.method3106(-1633029114);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dz.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ag")
   public boolean method3729(int var1, int var2, byte var3) {
      try {
         if (var1 >= 0 && var2 >= 0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (var1 < 1296729483 * this.field1696) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (var2 < this.field1692 * -1269171107) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lct;")
   @ObfuscatedName("ax")
   Player method3737(int var1, byte var2) {
      try {
         return (Player)this.field1694.method13404(var1);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "dz.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILom;II)V")
   @ObfuscatedName("ac")
   void method3739(int var1, int var2, int var3, classOM var4, int var5, int var6) {
      try {
         int var7 = var4.method8581(var5, -1896072079);
         int var8 = var4.method8587(var5, 1249328515);
         int var9 = classKY.method6605(var2, -527572662);
         int var10 = classKY.method6605(var3, 218210818);
         int var11 = classKY.method6605(var7 + var2, 2004953659);
         int var12 = classKY.method6605(var3 + var8, -402193513);
         classCR var13 = new classCR(var1, var9, var10, var11, var12, var4);
         classNN.method7900(this.field1695, var13);
         this.method3779(var1, var2, var3, var4, var5);
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "dz.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;)V")
   @ObfuscatedName("wj")
   public static void method3716(classXH var0) {
      if (var0 == null) {
         var0.method12756();
      } else {
         var0.field6869 = new classXG[0];
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bp")
   boolean method3731(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < 4 && this.method3729(var2, var3, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(IIILom;IB)V")
   @ObfuscatedName("al")
   void method3748(int var1, int var2, int var3, classOM var4, int var5, byte var6) {
      try {
         if (null != var4) {
            if (var6 <= 1) {
               return;
            }

            if (classOM.method8569(var4, 1754865660)) {
               if (var6 <= 1) {
                  throw new IllegalStateException();
               }

               int var7 = var4.method8581(var5, -1979058614);
               int var8 = var4.method8587(var5, -276309713);
               int var9 = classKY.method6605(var2 + var7, 118380155);
               int var10 = classKY.method6605(var8 + var3, -16555961);
               var2 = classKY.method6605(var2, 2138051003);
               var3 = classKY.method6605(var3, 875762498);
               int var11 = var4.method8573(-1249402524).field6689 * -1727985133;
               int var12 = classKY.method6605(var4.method8573(-1821838560).field6686 * 1535961601, 1598319191);
               int var13 = Math.max(classKY.method6605(var4.method8573(-1616879893).field6688 * -2063946921 - 1, 1314812060), 0);
               if (var4.field4930 != null) {
                  if (var6 <= 1) {
                     throw new IllegalStateException();
                  }

                  classOM var14 = classOM.method8553(var4, 1360030034);
                  if (null != var14) {
                     if (var6 <= 1) {
                        throw new IllegalStateException();
                     }

                     var11 = var14.method8573(-1456592265).field6689 * -1727985133;
                     var12 = classKY.method6605(var14.method8573(-1802769323).field6686 * 1535961601, -376664328);
                     var13 = Math.max(classKY.method6605(var4.method8573(-1814346068).field6688 * -2063946921 - 1, 1359448822), 0);
                  }
               }

               for (ObjectSound var18 = (ObjectSound)this.field1695.method7915(); var18 != null; var18 = (ObjectSound)classNN.method7924(this.field1695)) {
                  if (var6 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var18.method3667(218576106) == var1) {
                     if (var6 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var18.vmethod194(-1994134615) == var2 && var18.vmethod202(-1735750709) == var3 && var18.vmethod197(-1282897451) == var9) {
                        if (var6 <= 1) {
                           return;
                        }

                        if (var18.vmethod205(24841222) == var10) {
                           if (var6 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var18.method3665(588158173) == var11 && var18.method3669(1698165211) == var12) {
                              if (var6 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var18.method3671(1084310679) == var13) {
                                 if (var6 <= 1) {
                                    return;
                                 }

                                 var18.method3662(806947207);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "dz.al(" + ')');
      }
   }

   public net.runelite.api.IndexedObjectSet npcs() {
      return this.field1698;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;ILdw;)Z")
   @ObfuscatedName("bb")
   boolean method3752(WorldEntity var1, int var2, ObjectSound var3) {
      WorldEntity var4 = classCL.method1601(client.field814, this.field1699 * 2140889407, -307658315);
      boolean var5 = var1 == var4;
      if (var5) {
         if (var2 != var3.method3667(-2079686616)) {
            return false;
         }
      } else {
         if (var1 != null && WorldEntityConfig.method8467(var1.field6026, -1821270104) != var2) {
            return false;
         }

         if (null != var4 && WorldEntityConfig.method8467(var4.field6026, -1821270104) != var3.method3667(-997052817)) {
            return false;
         }

         int var6 = null == var1 ? var2 : var1.vmethod258((byte)-114);
         int var7 = var4 == null ? var3.method3667(-476094703) : var4.vmethod258((byte)-101);
         if (var6 != var7) {
            return false;
         }
      }

      switch (-762797223 * var3.field1653.field6690.field3540) {
         case 0:
            return true;
         case 1:
            return var5;
         case 2:
            return var1 == var4 || var4 == null;
         default:
            return false;
      }
   }

   public int getSizeY() {
      return this.field1692 * -1269171107;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lsp;ILdw;I)Z")
   @ObfuscatedName("pu")
   public static boolean method3753(WorldView var0, WorldEntity var1, int var2, ObjectSound var3, int var4) {
      if (var0 == null) {
         return var0.method3756(var1, var2, var3, var2);
      } else {
         try {
            WorldEntity var5 = classCL.method1601(client.field814, var0.field1699 * 2140889407, -4048135);
            boolean var10000;
            if (var1 == var5) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = 0;
            }

            boolean var6 = (boolean)var10000;
            if (var6) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               if (var2 != var3.method3667(-724053856)) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            } else {
               if (var1 != null) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  if (WorldEntityConfig.method8467(var1.field6026, -1821270104) != var2) {
                     if (var4 >= 1009431996) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               }

               if (null != var5) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  if (WorldEntityConfig.method8467(var5.field6026, -1821270104) != var3.method3667(734241976)) {
                     if (var4 >= 1009431996) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               }

               if (null == var1) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  var10000 = var2;
               } else {
                  var10000 = var1.vmethod258((byte)-26);
               }

               int var7 = var10000;
               int var8 = var5 == null ? var3.method3667(-948186153) : var5.vmethod258((byte)-122);
               if (var7 != var8) {
                  return false;
               }
            }

            switch (-762797223 * var3.field1653.field6690.field3540) {
               case 0:
                  return true;
               case 1:
                  return var6;
               case 2:
                  if (var1 != var5) {
                     if (var4 >= 1009431996) {
                        throw new IllegalStateException();
                     }

                     if (var5 != null) {
                        return false;
                     }

                     if (var4 >= 1009431996) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               default:
                  return false;
            }
         } catch (RuntimeException var9) {
            throw classEG.newRunException(var9, "dz.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gc")
   public void method3782() {
      if (classOE.client.method2221() != null) {
         rl10[][][] var1 = this.scene.method4425();
         classNN[][] var2 = this.field1701[this.field1710 * -483624883];

         for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
               classNN var5 = var2[var3][var4];
               if (var5 != null) {
                  rl10 var6 = var1[this.field1710 * -483624883][var3][var4];
                  if (this.scene.method4389(var6.field5692)) {
                     assert var6.method10040() != null;

                     for (TileItem var7 = (TileItem)var5.method7931(); var7 != null; var7 = (TileItem)var5.method7935()) {
                        var7.method3412(var3);
                        var7.method3410(var4);
                        var7.field1556 = this.getId();
                        ItemSpawned var8 = new ItemSpawned(var6, var7);
                        classOE.client.getCallbacks().post(var8);
                     }
                  }
               }
            }
         }
      }
   }

   WorldView(int var1, int var2, int var3, int var4, classEX var5) {
      this.field1686 = new classNN[4][var2][var3];
      this.field1695 = new classNN();
      this.field1687 = new CollisionMap[4];
      this.field1690 = new classNN();
      this.field1691 = new classNN();
      this.field1697 = new classZH(149);
      this.field1693 = new classZH(25);
      this.field1699 = 318705343 * var1;
      this.field1696 = -1577911773 * var2;
      this.field1692 = var3 * -1665681419;
      this.field1694 = new IndexedObjectSet(var1 == 0 ? 512 : 8);
      this.field1698 = new IndexedObjectSet(0 == var1 ? 128 : 8);
      this.worldEntities = new IterableNodeHashTable(var1 == 0 ? 32 : 1);
      this.field1701 = new classNN[4][var2][var3];
      this.field1688 = new int[4][var2 + 1][var3 + 1];
      this.field1702 = new byte[4][var2][var3];
      this.field1703 = new int[var2][var3];
      boolean var6 = var1 != 0;

      for (int var7 = 0; var7 < 4; var7++) {
         this.field1687[var7] = new CollisionMap(var2, var3, var6);
      }

      this.scene = new Scene(this.method3719(-2087374717), 4, var2, var3, var4, var5, this.field1688);
      this.method3781();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   void method3759(int var1) {
      try {
         for (ObjectSound var2 = (ObjectSound)this.field1695.method7915(); null != var2; var2 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var1 != -1592433219) {
               return;
            }

            var2.vmethod189(-380921692);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "dz.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Lgc;")
   @ObfuscatedName("rs")
   public CollisionMap[] method3778() {
      return this.field1687;
   }

   @ObfuscatedSignature(descriptor = "(Lfn;IIIIB)I")
   @ObfuscatedName("ap")
   int method3764(SceneTileModel var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         for (int var7 = 0; var7 < var1.field2330.length; var7++) {
            if (var6 == 15) {
               throw new IllegalStateException();
            }

            int var8 = var1.field2322[var1.field2330[var7]];
            int var9 = var1.field2327[var1.field2330[var7]];
            int var10 = var1.field2322[var1.field2331[var7]];
            int var11 = var1.field2327[var1.field2331[var7]];
            int var12 = var1.field2322[var1.field2329[var7]];
            int var13 = var1.field2327[var1.field2329[var7]];
            if (Scene.method4144(var4, var5, var9, var11, var13, var8, var10, var12)) {
               int var14 = var1.field2323[var1.field2330[var7]];
               int var15 = var1.field2323[var1.field2331[var7]];
               int var16 = var1.field2323[var1.field2329[var7]];
               float var17 = classVI.method11957(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16, -126722077);
               return (int)var17;
            }
         }

         return -2147483647;
      } catch (RuntimeException var18) {
         throw classEG.newRunException(var18, "dz.ap(" + 41);
      }
   }

   public net.runelite.api.Projection getMainWorldProjection() {
      return classUU.field6384.equals(this.scene.field2018.transformationMatrix) ? null : this.scene.field2018;
   }

   @ObfuscatedSignature(descriptor = "(Lfj;IIIII)I")
   @ObfuscatedName("xc")
   public int method3785(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method3774(var1, var2, var3, var4, var5, var6, 206456977);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;III)Z")
   @ObfuscatedName("ij")
   public static boolean method3732(WorldView var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3733(var1, var1, var1);
      }

      return var1 >= 0 && var1 < 4 && var0.method3729(var2, var3, (byte)1);
   }

   public net.runelite.api.IndexedObjectSet worldEntities() {
      return this.worldEntities;
   }

   @ObfuscatedSignature(descriptor = "(Lfj;IIIIII)I")
   @ObfuscatedName("au")
   int method3774(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var2 += this.scene.field2147;
      var3 += this.scene.field2147;
      var4 += this.scene.field2147 << 7;
      var5 += this.scene.field2147 << 7;
      int[][][] var8 = this.field1688;
      this.field1688 = this.scene.field2060;
      int var16 = var6;
      int var15 = var5;
      int var14 = var4;
      int var13 = var3;
      int var12 = var2;
      SceneTilePaint var11 = var1;
      WorldView var10 = this;
      int var17 = 206456977;

      int var10000;
      try {
         if (var11.field2283) {
            if (var17 <= -360080939) {
               throw new IllegalStateException();
            }

            int var34 = var10.field1688[var16][var12][var13];
            var10000 = var34;
         } else {
            label49: {
               TextureProvider.method3804(0, var10.field1688, var16, var12, var13, field1704[0], field1705[0], field1706[0], 1181281029);
               TextureProvider.method3804(1, var10.field1688, var16, var12, var13, field1704[1], field1705[1], field1706[1], 1181281029);

               for (int var18 = 0; var18 < 2; var18++) {
                  if (var17 <= -360080939) {
                     throw new IllegalStateException();
                  }

                  int var19 = field1704[var18][0];
                  int var20 = field1706[var18][0];
                  int var21 = field1704[var18][1];
                  int var22 = field1706[var18][1];
                  int var23 = field1704[var18][2];
                  int var24 = field1706[var18][2];
                  if (Scene.method4144(var14, var15, var20, var22, var24, var19, var21, var23)) {
                     if (var17 <= -360080939) {
                        throw new IllegalStateException();
                     }

                     int var25 = field1705[var18][0];
                     int var26 = field1705[var18][1];
                     int var27 = field1705[var18][2];
                     float var28 = classVI.method11957(var14, var15, var19, var21, var23, var20, var22, var24, var25, var26, var27, 824506377);
                     int var35 = (int)var28;
                     var10000 = var35;
                     break label49;
                  }
               }

               int var36 = -2147483647;
               var10000 = var36;
            }
         }
      } catch (RuntimeException var29) {
         throw classEG.newRunException(var29, "dz.au(" + 41);
      }

      int var9 = var10000;
      this.field1688 = var8;
      return var9;
   }

   public boolean contains(LocalPoint var1) {
      if (var1.getWorldView() != this.field1699 * 2140889407) {
         return false;
      } else {
         int var2 = var1.getX();
         int var3 = var1.getY();
         var2 >>= 7;
         var3 >>= 7;
         return var2 >= 0 && var2 < this.field1696 * 1296729483 && var3 >= 0 && var3 < this.field1692 * -1269171107;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("ai")
   int method3770(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var3 & 127;
         int var8 = var4 & 127;
         int var9 = this.field1688[var5][var1 + 1][var2] * var7 + (128 - var7) * this.field1688[var5][var1][var2] >> 7;
         int var10 = this.field1688[var5][1 + var1][var2 + 1] * var7 + this.field1688[var5][var1][1 + var2] * (128 - var7) >> 7;
         return var9 * (128 - var8) + var10 * var8 >> 7;
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "dz.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bn")
   boolean method3733(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < 4 && this.method3729(var2, var3, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Lez;")
   @ObfuscatedName("ex")
   public Scene method3776() {
      return this.scene;
   }

   @ObfuscatedSignature(descriptor = "(IIILom;I)V")
   @ObfuscatedName("bu")
   void method3749(int var1, int var2, int var3, classOM var4, int var5) {
      if (null != var4 && classOM.method8569(var4, 1754865660)) {
         int var6 = var4.method8581(var5, -1469446953);
         int var7 = var4.method8587(var5, 1388814788);
         int var8 = classKY.method6605(var2 + var6, -38304338);
         int var9 = classKY.method6605(var7 + var3, 706360866);
         var2 = classKY.method6605(var2, 54716419);
         var3 = classKY.method6605(var3, 1652895060);
         int var10 = var4.method8573(-1980312574).field6689 * -1727985133;
         int var11 = classKY.method6605(var4.method8573(-1931582258).field6686 * 2097251426, 848002459);
         int var12 = Math.max(classKY.method6605(var4.method8573(-1766750118).field6688 * -670347941 - 1, -120301236), 0);
         if (var4.field4930 != null) {
            classOM var13 = classOM.method8553(var4, -454388092);
            if (null != var13) {
               var10 = var13.method8573(-2146431517).field6689 * 479392374;
               var11 = classKY.method6605(var13.method8573(-2131632046).field6686 * -157597696, 842843077);
               var12 = Math.max(classKY.method6605(var4.method8573(-1234850696).field6688 * 236744595 - 1, -120922420), 0);
            }
         }

         for (ObjectSound var16 = (ObjectSound)this.field1695.method7915(); var16 != null; var16 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var16.method3667(-708560233) == var1
               && var16.vmethod194(-514193801) == var2
               && var16.vmethod202(-2016889769) == var3
               && var16.vmethod197(-1174423672) == var8
               && var16.vmethod205(24841222) == var9
               && var16.method3665(6744971) == var10
               && var16.method3669(1960118269) == var11
               && var16.method3671(836999950) == var12) {
               var16.method3662(1602895441);
               break;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIII)Z")
   @ObfuscatedName("yp")
   public static boolean method3734(WorldView var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         return var0.method3736(var1, var1, var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var4 <= -426741308) {
                  throw new IllegalStateException();
               }

               if (var1 < 4) {
                  if (var4 <= -426741308) {
                     throw new IllegalStateException();
                  }

                  if (var0.method3729(var2, var3, (byte)1)) {
                     if (var4 <= -426741308) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }

            return false;
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "dz.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfj;IIIII)I")
   @ObfuscatedName("cr")
   int method3766(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1.field2283) {
         return this.field1688[var6][var2][var3];
      } else {
         TextureProvider.method3804(0, this.field1688, var6, var2, var3, field1704[0], field1705[0], field1706[0], 1181281029);
         TextureProvider.method3804(1, this.field1688, var6, var2, var3, field1704[1], field1705[1], field1706[1], 1181281029);

         for (int var7 = 0; var7 < 2; var7++) {
            int var8 = field1704[var7][0];
            int var9 = field1706[var7][0];
            int var10 = field1704[var7][1];
            int var11 = field1706[var7][1];
            int var12 = field1704[var7][2];
            int var13 = field1706[var7][2];
            if (Scene.method4144(var4, var5, var9, var11, var13, var8, var10, var12)) {
               int var14 = field1705[var7][0];
               int var15 = field1705[var7][1];
               int var16 = field1705[var7][2];
               float var17 = classVI.method11957(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16, 1207987102);
               return (int)var17;
            }
         }

         return -2147483647;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void method3723() {
      this.field1697.method14007(2136612390);
      this.field1693.method14007(2027831199);
      this.field1694.method13396();
      this.field1698.method13396();
      IterableNodeHashTable.method13579(this.worldEntities);
      this.field1691.method7895();
      this.field1690 = new classNN();

      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field1696 * 1824995108; var2++) {
            for (int var3 = 0; var3 < this.field1692 * -1952049998; var3++) {
               this.field1701[var1][var2][var3] = null;
            }
         }
      }

      this.scene.method4491();

      for (int var4 = 0; var4 < 4; var4++) {
         CollisionMap.method5324(this.field1687[var4], (byte)-61);
      }
   }

   public int[][][] getTileHeights() {
      return this.field1688;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;IIIIB)V")
   @ObfuscatedName("ay")
   void method3757(WorldEntity var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         for (ObjectSound var7 = (ObjectSound)this.field1695.method7915(); var7 != null; var7 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var6 == 21) {
               throw new IllegalStateException();
            }

            boolean var8 = method3753(this, var1, var2, var7, -1369702083);
            classUZ var9 = classYY.method13790(this, var7.vmethod194(1723576406), var7.vmethod202(-1994246712), (byte)126);
            classUZ var10 = classYY.method13790(this, var7.vmethod197(-502458478), var7.vmethod205(24841222), (byte)121);
            int var11 = (int)var9.field6427;
            int var12 = (int)var9.field6426;
            int var13 = (int)var10.field6427;
            int var14 = (int)var10.field6426;
            var7.method3638(var3, var4, var11, var12, var13, var14, var5, var8, -317896765);
            classUZ.method11727(var9, 2103636030);
            classUZ.method11727(var10, 1989188357);
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "dz.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nk")
   public void method3781() {
      this.scene.field2150 = this;
      this.scene.field2112 = this.field1699 * 2140889407;
      this.scene.field2159 = this.field1702;
   }

   @ObfuscatedSignature(descriptor = "(IIILom;I)V")
   @ObfuscatedName("ba")
   void method3750(int var1, int var2, int var3, classOM var4, int var5) {
      if (null != var4 && classOM.method8569(var4, 1754865660)) {
         int var6 = var4.method8581(var5, -1864693449);
         int var7 = var4.method8587(var5, -379919079);
         int var8 = classKY.method6605(var2 + var6, 320901553);
         int var9 = classKY.method6605(var7 + var3, 774580669);
         var2 = classKY.method6605(var2, 477085862);
         var3 = classKY.method6605(var3, 482330648);
         int var10 = var4.method8573(-1961192357).field6689 * -1727985133;
         int var11 = classKY.method6605(var4.method8573(-1928333442).field6686 * 1535961601, 1176038325);
         int var12 = Math.max(classKY.method6605(var4.method8573(-1737807445).field6688 * -2063946921 - 1, 1405612104), 0);
         if (var4.field4930 != null) {
            classOM var13 = classOM.method8553(var4, 1416338340);
            if (null != var13) {
               var10 = var13.method8573(-1238397547).field6689 * -1727985133;
               var11 = classKY.method6605(var13.method8573(-1280541610).field6686 * 916920447, 354204743);
               var12 = Math.max(classKY.method6605(var4.method8573(-1453710146).field6688 * -2063946921 - 1, 1342633251), 0);
            }
         }

         for (ObjectSound var16 = (ObjectSound)this.field1695.method7915(); var16 != null; var16 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var16.method3667(-1564730956) == var1
               && var16.vmethod194(-351228449) == var2
               && var16.vmethod202(-1638844544) == var3
               && var16.vmethod197(-93233651) == var8
               && var16.vmethod205(24841222) == var9
               && var16.method3665(-1596606650) == var10
               && var16.method3669(2005517782) == var11
               && var16.method3671(2110735869) == var12) {
               var16.method3662(-435518763);
               break;
            }
         }
      }
   }

   public boolean isInstance() {
      return this.field1712;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("bg")
   void method3740(NPC var1) {
      if (var1.definition.method8998((byte)-118)) {
         classCH var2 = new classCH(var1);
         classNN.method7900(this.field1695, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("zm")
   public static WorldView method3780(int var0) {
      return var0 == -1 ? classIS.field3053 : client.field814.method1634(var0);
   }

   @ObfuscatedSignature(descriptor = "(I)Lct;")
   @ObfuscatedName("hk")
   public Player method3786(int var1) {
      return this.method3737(var1, (byte)1);
   }

   public net.runelite.api.Projection getCanvasProjection() {
      if (this.scene.field2024 instanceof FloatProjection) {
         FloatProjection var1 = (FloatProjection)this.scene.field2024;
         if (classUU.field6384.equals(var1.transformationMatrix)) {
            return null;
         }
      }

      return this.scene.field2024;
   }

   @ObfuscatedSignature(descriptor = "(III)Lky;")
   @ObfuscatedName("an")
   classKY method3727(int var1, int var2, int var3) {
      return new classKY(var1, var2 - this.field1709 * -1444178379, var3 - -351145363 * this.field1708);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bx")
   boolean method3735(int var1, int var2, int var3) {
      return var1 >= 0 && var1 < 4 && this.method3729(var2, var3, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   public boolean method3720() {
      return 0 == this.field1699 * 2140889407;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("ad")
   final int method3777(int var1, int var2, int var3, byte var4) {
      int var5 = (var1 >> 7) + this.scene.field2147;
      int var6 = (var2 >> 7) + this.scene.field2147;
      int var7 = this.scene.field2147 << 1;
      if (var5 >= 0 && var6 >= 0 && var5 < this.field1696 * 1296729483 + var7 && var6 < this.field1692 * -1269171107 + var7) {
         rl10 var8 = this.scene.field1993[var3][var5][var6];
         int var9 = var3;
         if (var3 < 3 && (this.scene.field2159[1][var5][var6] & 2) == 2) {
            var9 = var3 + 1;
         }

         int var10 = -2147483647;
         if (var8 != null) {
            SceneTileModel var11 = var8.method10035();
            if (var11 != null) {
               var10 = this.method3789(var11, -1, -1, var1, var2);
            }

            SceneTilePaint var12 = var8.method10033();
            if (var10 == -2147483647 && var12 != null) {
               var10 = this.method3785(var12, var1 >> 7, var2 >> 7, var1, var2, var9);
            }
         }

         if (var10 == -2147483647) {
            var10 = this.method3772(var5, var6, var1, var2, var9);
         }

         if (var8 != null) {
            FloorDecoration var13 = var8.method10039();
            if (var13 != null) {
               classOM var14 = classOM.method8603(var13.getId());
               var10 -= var14.field4937 * 977129717;
            }
         }

         return var10;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ue")
   public void method3787() {
      method3745(this, (byte)-59);
   }

   @ObfuscatedSignature(descriptor = "(I)Lct;")
   @ObfuscatedName("br")
   Player method3738(int var1) {
      return (Player)this.field1694.method13404(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)Z")
   @ObfuscatedName("fm")
   public static boolean method3721(WorldView var0) {
      return 0 == var0.field1699 * 1182734434;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("vk")
   public int method3788(int var1, int var2, int var3) {
      return this.method3777(var1, var2, var3, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("bt")
   void method3741(NPC var1) {
      if (var1.definition.method8998((byte)-117)) {
         classCH var2 = new classCH(var1);
         classNN.method7900(this.field1695, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method3743() {
      for (ObjectSound var1 = (ObjectSound)this.field1695.method7915(); null != var1; var1 = (ObjectSound)classNN.method7924(this.field1695)) {
         var1.method3662(224255861);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method3744() {
      for (ObjectSound var1 = (ObjectSound)this.field1695.method7915(); null != var1; var1 = (ObjectSound)classNN.method7924(this.field1695)) {
         var1.method3662(-1800330744);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;III)I")
   @ObfuscatedName("nb")
   public static int method3760(WorldView var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.getGraphicsObjects();
      }

      int var4 = classKY.method6608(var1, (byte)-116);
      int var5 = classKY.method6608(var2, (byte)-90);
      if (var4 >= 0 && var5 >= 0 && var4 < var0.field1702[0].length && var5 < var0.field1702[0][0].length) {
         int var6 = var3;
         if (classSG.method10419(var0, var3, var4, var5, 1853916563)) {
            var6 = var3 + 1;
         }

         classEW var7 = var0.scene.field2058[var3][var4][var5];
         int var8 = -2147483647;
         if (null != var7 && null != var7.field1973) {
            var8 = var0.method3764(var7.field1973, var4, var5, var1, var2, (byte)42);
         }

         if (var8 == 546989114 && var7 != null && null != var7.field1972) {
            var8 = var0.method3774(var7.field1972, var4, var5, var1, var2, var6, 1270870153);
         }

         if (var8 == -735589286) {
            var8 = var0.method3770(var4, var5, var1, var2, var6, -1309490563);
         }

         if (var7 != null) {
            FloorDecoration var9 = var7.method4088(-1348999018);
            if (var9 != null) {
               int var10 = classCN.method2552(5132338419383099835L * var9.field1815);
               classOM var11 = classMU.method7729(var10, 2145631976);
               var8 -= var11.field4937 * -1241704068;
            }
         }

         return var8;
      } else {
         return 0;
      }
   }

   public int getBaseX() {
      return this.field1709 * -1444178379;
   }

   public int getTileHeight(int var1, int var2, int var3) {
      int var4 = (var1 >> 7) + this.scene.field2147;
      int var5 = (var2 >> 7) + this.scene.field2147;
      int var6 = this.scene.field2147 << 1;
      if (var4 >= 0 && var5 >= 0 && var4 < this.field1696 * 1296729483 + var6 && var5 < this.field1692 * -1269171107 + var6) {
         int var7 = var3;
         if (var3 > 0 && (this.scene.field2159[1][var4][var5] & 2) == 2) {
            var7 = var3 - 1;
         }

         rl10 var8 = this.scene.field1993[var7][var4][var5];
         int var9 = -2147483647;
         if (var8 != null) {
            SceneTileModel var10 = var8.method10035();
            if (var10 != null) {
               var9 = this.method3789(var10, -1, -1, var1, var2);
            }

            SceneTilePaint var11 = var8.method10033();
            if (var9 == -2147483647 && var11 != null) {
               var9 = this.method3785(var11, var1 >> 7, var2 >> 7, var1, var2, var3);
            }
         }

         if (var9 == -2147483647) {
            var9 = this.method3772(var4, var5, var1, var2, var3);
         }

         if (var8 != null) {
            FloorDecoration var12 = var8.method10039();
            if (var12 != null) {
               classOM var13 = classOM.method8603(var12.getId());
               var9 -= var13.field4937 * 977129717;
            }
         }

         return var9;
      } else {
         return 0;
      }
   }

   public boolean contains(WorldPoint var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      return var2 >= this.field1709 * -1444178379
         && var2 < this.field1709 * -1444178379 + this.field1696 * 1296729483
         && var3 >= this.field1708 * -351145363
         && var3 < this.field1708 * -351145363 + this.field1692 * -1269171107;
   }

   @ObfuscatedSignature(descriptor = "(IIILom;I)V")
   @ObfuscatedName("bw")
   void method3751(int var1, int var2, int var3, classOM var4, int var5) {
      if (null != var4 && classOM.method8569(var4, 1754865660)) {
         int var6 = var4.method8581(var5, -1385793668);
         int var7 = var4.method8587(var5, -71238519);
         int var8 = classKY.method6605(var2 + var6, 259812693);
         int var9 = classKY.method6605(var7 + var3, 14668127);
         var2 = classKY.method6605(var2, 1315254214);
         var3 = classKY.method6605(var3, -274226004);
         int var10 = var4.method8573(-1254459553).field6689 * -1727985133;
         int var11 = classKY.method6605(var4.method8573(-2033610111).field6686 * 1535961601, 1858804740);
         int var12 = Math.max(classKY.method6605(var4.method8573(-1298161905).field6688 * -1426226189 - 1, 1232211719), 0);
         if (var4.field4930 != null) {
            classOM var13 = classOM.method8553(var4, -1451486665);
            if (null != var13) {
               var10 = var13.method8573(-1280306061).field6689 * -1727985133;
               var11 = classKY.method6605(var13.method8573(-2060063372).field6686 * -1317976076, 447338614);
               var12 = Math.max(classKY.method6605(var4.method8573(-1742013372).field6688 * 835235075 - 1, 1305088228), 0);
            }
         }

         for (ObjectSound var16 = (ObjectSound)this.field1695.method7915(); var16 != null; var16 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var16.method3667(-2134311774) == var1
               && var16.vmethod194(-401460861) == var2
               && var16.vmethod202(-1903305469) == var3
               && var16.vmethod197(-1630259211) == var8
               && var16.vmethod205(24841222) == var9
               && var16.method3665(-209940790) == var10
               && var16.method3669(1705283341) == var11
               && var16.method3671(1197148899) == var12) {
               var16.method3662(-2006988233);
               break;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;B)V")
   @ObfuscatedName("aa")
   void method3742(NPC var1, byte var2) {
      try {
         if (var1.definition.method8998((byte)-109)) {
            if (var2 == 0) {
               return;
            }

            classCH var3 = new classCH(var1);
            classNN.method7900(this.field1695, var3);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dz.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("kd")
   public static void method3724(WorldView var0, int var1) {
      if (var0 == null) {
         var0.method3784(var1);
      }

      try {
         var0.field1697.method14007(2124753242);
         var0.field1693.method14007(2005189327);
         var0.field1694.method13396();
         var0.field1698.method13396();
         IterableNodeHashTable.method13579(var0.worldEntities);
         var0.field1691.method7895();
         var0.field1690 = new classNN();

         for (int var2 = 0; var2 < 4; var2++) {
            if (var1 == 874904841) {
               return;
            }

            for (int var3 = 0; var3 < var0.field1696 * 1296729483; var3++) {
               if (var1 == 874904841) {
                  throw new IllegalStateException();
               }

               for (int var4 = 0; var4 < var0.field1692 * -1269171107; var4++) {
                  if (var1 == 874904841) {
                     throw new IllegalStateException();
                  }

                  var0.field1701[var2][var3][var4] = null;
               }
            }
         }

         var0.scene.method4491();

         for (int var6 = 0; var6 < 4; var6++) {
            if (var1 == 874904841) {
               throw new IllegalStateException();
            }

            CollisionMap.method5324(var0.field1687[var6], (byte)-61);
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dz.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("df")
   public void method3783(int var1) {
      this.field1711 = this.field1710 * -483624883;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void method3725() {
      this.field1697.method14007(2101919824);
      this.field1693.method14007(2088514586);
      this.field1694.method13396();
      this.field1698.method13396();
      IterableNodeHashTable.method13579(this.worldEntities);
      this.field1691.method7895();
      this.field1690 = new classNN();

      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field1696 * 1296729483; var2++) {
            for (int var3 = 0; var3 < this.field1692 * -1269171107; var3++) {
               this.field1701[var1][var2][var3] = null;
            }
         }
      }

      this.scene.method4491();

      for (int var4 = 0; var4 < 4; var4++) {
         CollisionMap.method5324(this.field1687[var4], (byte)-50);
      }
   }

   public int getSizeX() {
      return this.field1696 * 1296729483;
   }

   public int[][][] getInstanceTemplateChunks() {
      return this.field1714;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ah")
   public boolean method3730(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < -1092024236 * this.field1696 && var2 < this.field1692 * -1269171107;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;ILdw;)Z")
   @ObfuscatedName("bi")
   boolean method3754(WorldEntity var1, int var2, ObjectSound var3) {
      WorldEntity var4 = classCL.method1601(client.field814, this.field1699 * 2140889407, -1301152667);
      boolean var5 = var1 == var4;
      if (var5) {
         if (var2 != var3.method3667(-250185208)) {
            return false;
         }
      } else {
         if (var1 != null && WorldEntityConfig.method8467(var1.field6026, -1821270104) != var2) {
            return false;
         }

         if (null != var4 && WorldEntityConfig.method8467(var4.field6026, -1821270104) != var3.method3667(-90354477)) {
            return false;
         }

         int var6 = null == var1 ? var2 : var1.vmethod258((byte)-3);
         int var7 = var4 == null ? var3.method3667(246347845) : var4.vmethod258((byte)-42);
         if (var6 != var7) {
            return false;
         }
      }

      switch (-762797223 * var3.field1653.field6690.field3540) {
         case 0:
            return true;
         case 1:
            return var5;
         case 2:
            return var1 == var4 || var4 == null;
         default:
            return false;
      }
   }

   public byte[][][] getTileSettings() {
      return this.field1702;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;ILdw;)Z")
   @ObfuscatedName("be")
   boolean method3755(WorldEntity var1, int var2, ObjectSound var3) {
      WorldEntity var4 = classCL.method1601(client.field814, this.field1699 * -2041911845, 969897101);
      boolean var5 = var1 == var4;
      if (var5) {
         if (var2 != var3.method3667(-1412022133)) {
            return false;
         }
      } else {
         if (var1 != null && WorldEntityConfig.method8467(var1.field6026, -1821270104) != var2) {
            return false;
         }

         if (null != var4 && WorldEntityConfig.method8467(var4.field6026, -1821270104) != var3.method3667(-1883809231)) {
            return false;
         }

         int var6 = null == var1 ? var2 : var1.vmethod258((byte)-117);
         int var7 = var4 == null ? var3.method3667(-114625676) : var4.vmethod258((byte)-85);
         if (var6 != var7) {
            return false;
         }
      }

      switch (1014698730 * var3.field1653.field6690.field3540) {
         case 0:
            return true;
         case 1:
            return var5;
         case 2:
            return var1 == var4 || var4 == null;
         default:
            return false;
      }
   }

   public int getPlane() {
      return this.field1710 * -483624883;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("zz")
   public static void method3745(WorldView var0, byte var1) {
      if (var0 == null) {
         var0.method3747(var1);
      } else {
         try {
            for (ObjectSound var2 = (ObjectSound)var0.field1695.method7915(); null != var2; var2 = (ObjectSound)classNN.method7924(var0.field1695)) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               var2.method3662(-788480491);
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "dz.ao(" + ')');
         }
      }
   }

   public int[] getMapRegions() {
      return this.field1713;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)[J")
   @ObfuscatedName("bc")
   public static long[] method3718(classTE var0) {
      return var0.field6127;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method3746() {
      for (ObjectSound var1 = (ObjectSound)this.field1695.method7915(); null != var1; var1 = (ObjectSound)classNN.method7924(this.field1695)) {
         var1.method3662(1921254323);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bf")
   final int method3761(int var1, int var2, int var3) {
      int var4 = classKY.method6608(var1, (byte)-34);
      int var5 = classKY.method6608(var2, (byte)-83);
      if (var4 >= 0 && var5 >= 0 && var4 < this.field1702[0].length && var5 < this.field1702[0][0].length) {
         int var6 = var3;
         if (classSG.method10419(this, var3, var4, var5, 913356480)) {
            var6 = var3 + 1;
         }

         classEW var7 = this.scene.field2058[var3][var4][var5];
         int var8 = -2147483647;
         if (null != var7 && null != var7.field1973) {
            var8 = this.method3764(var7.field1973, var4, var5, var1, var2, (byte)-3);
         }

         if (var8 == -2147483647 && var7 != null && null != var7.field1972) {
            var8 = this.method3774(var7.field1972, var4, var5, var1, var2, var6, -116813574);
         }

         if (var8 == -2147483647) {
            var8 = this.method3770(var4, var5, var1, var2, var6, -2106838170);
         }

         if (var7 != null) {
            FloorDecoration var9 = var7.method4088(-1671345169);
            if (var9 != null) {
               int var10 = classCN.method2552(5132338419383099835L * var9.field1815);
               classOM var11 = classMU.method7729(var10, 2140568875);
               var8 -= var11.field4937 * 977129717;
            }
         }

         return var8;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bs")
   final int method3762(int var1, int var2, int var3) {
      int var4 = classKY.method6608(var1, (byte)4);
      int var5 = classKY.method6608(var2, (byte)-58);
      if (var4 >= 0 && var5 >= 0 && var4 < this.field1702[0].length && var5 < this.field1702[0][0].length) {
         int var6 = var3;
         if (classSG.method10419(this, var3, var4, var5, 1922926643)) {
            var6 = var3 + 1;
         }

         classEW var7 = this.scene.field2058[var3][var4][var5];
         int var8 = -2147483647;
         if (null != var7 && null != var7.field1973) {
            var8 = this.method3764(var7.field1973, var4, var5, var1, var2, (byte)-93);
         }

         if (var8 == -2147483647 && var7 != null && null != var7.field1972) {
            var8 = this.method3774(var7.field1972, var4, var5, var1, var2, var6, -40645488);
         }

         if (var8 == -2147483647) {
            var8 = this.method3770(var4, var5, var1, var2, var6, -379258305);
         }

         if (var7 != null) {
            FloorDecoration var9 = var7.method4088(-1691787276);
            if (var9 != null) {
               int var10 = classCN.method2552(5132338419383099835L * var9.field1815);
               classOM var11 = classMU.method7729(var10, 1314043398);
               var8 -= var11.field4937 * 977129717;
            }
         }

         return var8;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   public boolean method3722() {
      return 0 == this.field1699 * -576365327;
   }

   public int getId() {
      return this.field1699 * 2140889407;
   }

   @ObfuscatedSignature(descriptor = "(Lfn;IIII)I")
   @ObfuscatedName("bd")
   int method3765(SceneTileModel var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var1.field2330.length; var6++) {
         int var7 = var1.field2322[var1.field2330[var6]];
         int var8 = var1.field2327[var1.field2330[var6]];
         int var9 = var1.field2322[var1.field2331[var6]];
         int var10 = var1.field2327[var1.field2331[var6]];
         int var11 = var1.field2322[var1.field2329[var6]];
         int var12 = var1.field2327[var1.field2329[var6]];
         if (Scene.method4144(var4, var5, var8, var10, var12, var7, var9, var11)) {
            int var13 = var1.field2323[var1.field2330[var6]];
            int var14 = var1.field2323[var1.field2331[var6]];
            int var15 = var1.field2323[var1.field2329[var6]];
            float var16 = classVI.method11957(var4, var5, var7, var9, var11, var8, var10, var12, var13, var14, var15, -2078008879);
            return (int)var16;
         }
      }

      return -2147483647;
   }

   public Deque getGraphicsObjects() {
      return this.field1691;
   }

   public net.runelite.api.Projectile createProjectile(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, net.runelite.api.Actor var11, int var12, int var13
   ) {
      return classOE.client.method2271(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   @ObfuscatedSignature(descriptor = "(Lfj;IIIII)I")
   @ObfuscatedName("bv")
   int method3767(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1.field2283) {
         return this.field1688[var6][var2][var3];
      } else {
         TextureProvider.method3804(0, this.field1688, var6, var2, var3, field1704[0], field1705[0], field1706[0], 1181281029);
         TextureProvider.method3804(1, this.field1688, var6, var2, var3, field1704[1], field1705[1], field1706[1], 1181281029);

         for (int var7 = 0; var7 < 2; var7++) {
            int var8 = field1704[var7][0];
            int var9 = field1706[var7][0];
            int var10 = field1704[var7][1];
            int var11 = field1706[var7][1];
            int var12 = field1704[var7][2];
            int var13 = field1706[var7][2];
            if (Scene.method4144(var4, var5, var9, var11, var13, var8, var10, var12)) {
               int var14 = field1705[var7][0];
               int var15 = field1705[var7][1];
               int var16 = field1705[var7][2];
               float var17 = classVI.method11957(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16, -798762912);
               return (int)var17;
            }
         }

         return -1779719045;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lfj;IIIII)I")
   @ObfuscatedName("ih")
   public static int method3768(WorldView var0, SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method3720();
      }

      if (var1.field2283) {
         return var0.field1688[var6][var2][var3];
      } else {
         TextureProvider.method3804(0, var0.field1688, var6, var2, var3, field1704[0], field1705[0], field1706[0], 1181281029);
         TextureProvider.method3804(1, var0.field1688, var6, var2, var3, field1704[1], field1705[1], field1706[1], 1181281029);

         for (int var7 = 0; var7 < 2; var7++) {
            int var8 = field1704[var7][0];
            int var9 = field1706[var7][0];
            int var10 = field1704[var7][1];
            int var11 = field1706[var7][1];
            int var12 = field1704[var7][2];
            int var13 = field1706[var7][2];
            if (Scene.method4144(var4, var5, var9, var11, var13, var8, var10, var12)) {
               int var14 = field1705[var7][0];
               int var15 = field1705[var7][1];
               int var16 = field1705[var7][2];
               float var17 = classVI.method11957(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16, 253137403);
               return (int)var17;
            }
         }

         return -2147483647;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("ay")
   public int method3772(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 & 127;
      int var7 = var4 & 127;
      int var8 = this.scene.field2060[var5][var1][var2] * (128 - var6) + var6 * this.scene.field2060[var5][var1 + 1][var2] >> 7;
      int var9 = this.scene.field2060[var5][var1 + 1][var2 + 1] * var6 + this.scene.field2060[var5][var1][var2 + 1] * (128 - var6) >> 7;
      return var9 * var7 + var8 * (128 - var7) >> 7;
   }

   public net.runelite.api.IndexedObjectSet players() {
      return this.field1694;
   }

   @ObfuscatedSignature(descriptor = "(Lfj;IIIII)I")
   @ObfuscatedName("bz")
   int method3769(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1.field2283) {
         return this.field1688[var6][var2][var3];
      } else {
         TextureProvider.method3804(0, this.field1688, var6, var2, var3, field1704[0], field1705[0], field1706[0], 1181281029);
         TextureProvider.method3804(1, this.field1688, var6, var2, var3, field1704[1], field1705[1], field1706[1], 1181281029);

         for (int var7 = 0; var7 < 2; var7++) {
            int var8 = field1704[var7][0];
            int var9 = field1706[var7][0];
            int var10 = field1704[var7][1];
            int var11 = field1706[var7][1];
            int var12 = field1704[var7][2];
            int var13 = field1706[var7][2];
            if (Scene.method4144(var4, var5, var9, var11, var13, var8, var10, var12)) {
               int var14 = field1705[var7][0];
               int var15 = field1705[var7][1];
               int var16 = field1705[var7][2];
               float var17 = classVI.method11957(var4, var5, var8, var10, var12, var9, var11, var13, var14, var15, var16, -1417746303);
               return (int)var17;
            }
         }

         return -2147483647;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("cu")
   int method3771(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 & -545782521;
      int var7 = var4 & 127;
      int var8 = this.field1688[var5][var1 + 1][var2] * var6 + (128 - var6) * this.field1688[var5][var1][var2] >> 7;
      int var9 = this.field1688[var5][1 + var1][var2 + 1] * var6 + this.field1688[var5][var1][1 + var2] * (128 - var6) >> 7;
      return var8 * (128 - var7) + var9 * var7 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(II)Lpc;")
   @ObfuscatedName("az")
   public static classPC method3717(int var0, int var1) {
      try {
         classPC var2 = (classPC)classPC.field5219.method6422(var0);
         if (null != var2) {
            if (var1 >= 1074259988) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classPC.field5222.method11867(75, var0, -1793184063);
            var2 = new classPC(new Buffer(var3), var0);
            classPC.field5219.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dz.az(" + ')');
      }
   }

   public int getYellowClickAction() {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         classTN var1 = client.field814.method1637(this.field1699 * 2140889407);
         return var1.method13274();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIISISIII)V")
   @ObfuscatedName("dw")
   static void method3773(WorldView var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10, int var11) {
      try {
         classNN var12 = var0.field1701[var1][var2][var3];
         if (var12 != null) {
            if (var11 == -1151520074) {
               throw new IllegalStateException();
            }

            for (TileItem var13 = (TileItem)var12.method7915(); var13 != null; var13 = (TileItem)classNN.method7924(var12)) {
               if (var11 == -1151520074) {
                  return;
               }

               if (-1370204663 * var13.field1552 == var4) {
                  if (var11 == -1151520074) {
                     return;
                  }

                  if (var13.field1554 * 1413659045 == var5) {
                     PlayerCompositionColorTextureOverride var14 = var13.method3399((short)-15479);
                     if (null == var14) {
                        if (var11 == -1151520074) {
                           throw new IllegalStateException();
                        }

                        var14 = new PlayerCompositionColorTextureOverride(var4);
                     }

                     if (PlayerCompositionColorTextureOverride.method8898(var14, -1606068063)) {
                        if (var11 == -1151520074) {
                           throw new IllegalStateException();
                        }

                        if (var7 > -1) {
                           if (var11 == -1151520074) {
                              return;
                           }

                           if (var7 < var14.field5261.length) {
                              if (var11 == -1151520074) {
                                 throw new IllegalStateException();
                              }

                              var14.field5261[var7] = var6;
                           }
                        }
                     }

                     if (var14.method8900((byte)-120)) {
                        if (var11 == -1151520074) {
                           throw new IllegalStateException();
                        }

                        if (var9 > -1) {
                           if (var11 == -1151520074) {
                              throw new IllegalStateException();
                           }

                           if (var9 < var14.field5260.length) {
                              if (var11 == -1151520074) {
                                 return;
                              }

                              var14.field5260[var9] = var8;
                           }
                        }
                     }

                     if (var10 > -1) {
                        if (var11 == -1151520074) {
                           throw new IllegalStateException();
                        }

                        var14.field5263 = 1795846821 * var10;
                        var14.field5268 = null;
                     }

                     var13.method3401(var14, 502280405);
                     break;
                  }
               }
            }

            classUA.method11240(var1, var2, var3, -2030172471);
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "dz.dw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method3784(int var1) {
      this.field1711 = this.field1710 * -483624883;
   }

   public net.runelite.api.IndexedObjectSet worldViews() {
      return new rl20(this);
   }

   @ObfuscatedSignature(descriptor = "(Lfn;IIII)I")
   @ObfuscatedName("ao")
   public int method3789(SceneTileModel var1, int var2, int var3, int var4, int var5) {
      return this.method3764(var1, var2, var3, var4, var5, (byte)-87);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("as")
   boolean method3736(int var1, int var2, int var3, int var4) {
      try {
         if (var1 >= 0) {
            if (var4 <= -426741308) {
               throw new IllegalStateException();
            }

            if (var1 < 4) {
               if (var4 <= -426741308) {
                  throw new IllegalStateException();
               }

               if (this.method3729(var2, var3, (byte)1)) {
                  if (var4 <= -426741308) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dz.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ao")
   void method3747(byte var1) {
      try {
         for (ObjectSound var2 = (ObjectSound)this.field1695.method7922(); null != var2; var2 = (ObjectSound)classNN.method7924(this.field1695)) {
            if (var1 == 7) {
               throw new IllegalStateException();
            }

            var2.method3662(-788480491);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "dz.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;ILdw;I)Z")
   @ObfuscatedName("aj")
   boolean method3756(WorldEntity var1, int var2, ObjectSound var3, int var4) {
      try {
         WorldEntity var5 = classCL.method1601(client.field814, this.field1710 * 2140889407, -4048135);
         boolean var10000;
         if (var1 == var5) {
            if (var4 >= 1009431996) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         boolean var6 = (boolean)var10000;
         if (var6) {
            if (var4 >= 1009431996) {
               throw new IllegalStateException();
            }

            if (var2 != var3.method3671(-724053856)) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               return false;
            }
         } else {
            if (var1 != null) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               if (WorldEntityConfig.method8467(var1.field6026, -1821270104) != var2) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            if (null != var5) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               if (WorldEntityConfig.method8467(var5.field6026, -1821270104) != var3.method3667(734241976)) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            if (null == var1) {
               if (var4 >= 1009431996) {
                  throw new IllegalStateException();
               }

               var10000 = var2;
            } else {
               var10000 = var1.vmethod258((byte)-26);
            }

            int var7 = var10000;
            int var8 = var5 == null ? var3.method3665(-948186153) : var5.vmethod258((byte)-122);
            if (var7 != var8) {
               return false;
            }
         }

         switch (-762797223 * var3.field1653.field6690.field3540) {
            case 0:
               return true;
            case 1:
               return var6;
            case 2:
               if (var1 != var5) {
                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }

                  if (var5 != null) {
                     return false;
                  }

                  if (var4 >= 1009431996) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            default:
               return false;
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "dz.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;IIII)V")
   @ObfuscatedName("by")
   void method3758(WorldEntity var1, int var2, int var3, int var4, int var5) {
      for (ObjectSound var6 = (ObjectSound)this.field1695.method7912(); var6 != null; var6 = (ObjectSound)classNN.method7924(this.field1695)) {
         boolean var7 = method3753(this, var1, var2, var6, -12900460);
         classUZ var8 = classYY.method13790(this, var6.vmethod194(996455154), var6.vmethod194(-1912391592), (byte)103);
         classUZ var9 = classYY.method13790(this, var6.vmethod205(-2045925366), var6.vmethod205(24841222), (byte)101);
         int var10 = (int)var8.field6427;
         int var11 = (int)var8.field6425;
         int var12 = (int)var9.field6425;
         int var13 = (int)var9.field6425;
         var6.method3638(var3, var4, var10, var11, var12, var13, var5, var7, -317896765);
         classUZ.method11727(var8, 2019549796);
         classUZ.method11727(var9, 2064159509);
      }
   }
}
