import com.google.common.collect.ImmutableSet;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Set;
import net.runelite.api.Hitsplat;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cr")
public abstract class Actor extends Renderable implements CameraFocusableEntity, net.runelite.api.Actor {
   @ObfuscatedName("by")
   int field1123;
   @ObfuscatedName("bk")
   int playerCycle;
   @ObfuscatedName("bb")
   byte hitSplatCount;
   @ObfuscatedName("cs")
   int field1138;
   @ObfuscatedName("bm")
   int[] hitSplatValues;
   @ObfuscatedName("cu")
   int walkBackSequence;
   @ObfuscatedName("rs")
   public byte field1169;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("cj")
   AnimationSequence field1152;
   @ObfuscatedName("bu")
   int[] hitSplatValues2;
   @ObfuscatedName("ca")
   int field1153;
   @ObfuscatedName("bq")
   int size;
   @ObfuscatedName("dr")
   int[] pathY;
   @ObfuscatedName("yv")
   public boolean field1188;
   @ObfuscatedName("bw")
   boolean field1185;
   @ObfuscatedName("dt")
   int field1179;
   @ObfuscatedName("bn")
   int field1125;
   @ObfuscatedName("cp")
   String overheadText;
   @ObfuscatedName("br")
   int index;
   @ObfuscatedName("bh")
   int x;
   @ObfuscatedName("fy")
   public static boolean field1187;
   @ObfuscatedName("bl")
   int y;
   @ObfuscatedName("cc")
   int field1154;
   @ObfuscatedName("an")
   boolean isWalking;
   @ObfuscatedName("bf")
   int npcCycle;
   @ObfuscatedName("bj")
   int[] hitSplatTypes;
   @ObfuscatedName("bv")
   int turnLeftSequence;
   @ObfuscatedName("ch")
   int turnRightSequence;
   @ObfuscatedName("ce")
   int walkSequence;
   @ObfuscatedName("bx")
   int idleSequence;
   @ObfuscatedName("ct")
   int walkLeftSequence;
   @ObfuscatedName("bi")
   boolean false0;
   @ObfuscatedName("dh")
   int defaultHeight;
   @ObfuscatedName("ck")
   int field1160;
   @ObfuscatedName("bp")
   int[] hitSplatCycles;
   @ObfuscatedName("cx")
   int field1141;
   @ObfuscatedName("cn")
   int field1139;
   @ObfuscatedName("co")
   int field1140;
   @ObfuscatedName("fe")
   public float field1170;
   @ObfuscatedName("cg")
   int field1142;
   @ObfuscatedName("bd")
   int worldViewId;
   @ObfuscatedName("bt")
   int[] hitSplatTypes2;
   @ObfuscatedName("cd")
   boolean field1186;
   @ObfuscatedName("gx")
   public float field1171;
   @ObfuscatedName("cm")
   int walkRightSequence;
   @ObfuscatedName("ci")
   int overheadTextCyclesRemaining;
   @ObfuscatedName("cf")
   int field1161;
   @ObfuscatedName("cy")
   int field1147;
   @ObfuscatedName("cq")
   int[] field1148;
   @ObfuscatedSignature(descriptor = "Lcr;")
   @ObfuscatedName("tr")
   public static Actor field1184;
   @ObfuscatedName("cv")
   int targetIndex;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("cw")
   AnimationSequence poseAnimationSequence;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("cr")
   AnimationSequence animationSequence;
   @ObfuscatedName("bc")
   int rotation;
   @ObfuscatedName("cz")
   boolean field1144;
   @ObfuscatedName("db")
   int field1176;
   @ObfuscatedName("dd")
   int graphicsCount;
   @ObfuscatedName("dw")
   int field1181;
   @ObfuscatedName("dv")
   int field1180;
   @ObfuscatedName("df")
   int field1178;
   @ObfuscatedName("dy")
   int field1182;
   @ObfuscatedName("dc")
   int spotAnimation;
   @ObfuscatedName("cb")
   int runSequence;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("bz")
   final ModelColorOverride field1136 = new ModelColorOverride();
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("ba")
   IterableNodeDeque healthBars;
   @ObfuscatedName("dz")
   int orientation;
   @ObfuscatedName("di")
   int field1130;
   @ObfuscatedName("dj")
   int field1158;
   @ObfuscatedName("da")
   int pathLength;
   @ObfuscatedName("dl")
   int[] pathX;
   @ObfuscatedName("tu")
   public static final Set field1168 = ImmutableSet.of(0, 2, 16, 17, 18, 19, new Integer[]{20, 21, 22});
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("cl")
   IterableNodeHashTable spotAnimations;
   @ObfuscatedSignature(descriptor = "[Llz;")
   @ObfuscatedName("dx")
   MoveSpeed[] pathTraversed;
   @ObfuscatedName("dq")
   int field1145;
   @ObfuscatedName("du")
   int field1164;
   @ObfuscatedName("dm")
   int field1165;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   boolean isVisible(int var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dq")
   int vmethod147(int var1) {
      try {
         return 1491799315 * this.defaultHeight + this.getAnimationHeightOffset(-903085797);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cl")
   void method2767(int var1, int var2, int var3) {
      try {
         this.pathLength = 0;
         this.field1164 = 0;
         this.field1145 = 0;
         this.pathX[0] = var1;
         this.pathY[0] = var2;
         this.x = 792581824 * this.size + -432594048 * this.pathX[0];
         this.method2835(-1);
         this.y = this.size * 207061312 + 1438010496 * this.pathY[0];
         this.method2829(-1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cr.cl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("df")
   final void removeHealthBar(int var1, int var2) {
      try {
         HealthBarDefinition var4 = (HealthBarDefinition)class402.method8806(HealthBarDefinition.HealthBarDefinition_cached, var1);
         HealthBarDefinition var3;
         if (var4 != null) {
            if (var2 != 327716789) {
               throw new IllegalStateException();
            }

            var3 = var4;
         } else {
            byte[] var5 = HealthBarDefinition.HealthBarDefinition_archive.getFile(33, var1, 584555228);
            var4 = new HealthBarDefinition();
            var4.field2238 = 415242223 * var1;
            if (var5 != null) {
               if (var2 != 327716789) {
                  throw new IllegalStateException();
               }

               var4.decode(new Buffer(var5), 686350153);
            }

            HealthBarDefinition.HealthBarDefinition_cached.put(var4, var1);
            var3 = var4;
         }

         var4 = var3;

         for (HealthBarConfig var9 = (HealthBarConfig)this.healthBars.method9642(); var9 != null; var9 = (HealthBarConfig)this.healthBars.method9646()) {
            if (var2 != 327716789) {
               throw new IllegalStateException();
            }

            if (var4 == var9.definition) {
               var9.remove();
               return;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cr.df(" + ')');
      }
   }

   public int getAnimationFrame() {
      return this.animationSequence.frame * 1756992279;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fy")
   @Override
   public int vmethod143() {
      return -1747310679 * this.y;
   }

   public void setIdlePoseAnimation(int var1) {
      this.idleSequence = var1 * -2146330229;
   }

   @ObfuscatedSignature(descriptor = "(Lsj;)Lsj;")
   @ObfuscatedName("gd")
   AnimationSequence method2821(AnimationSequence var1) {
      return AnimationSequence.method10315(this.poseAnimationSequence, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(this.poseAnimationSequence, -652974257), (byte)-6)
            && (method2743(this, 1356161355) != 1683244579 * this.idleSequence || null == var1)
         ? this.poseAnimationSequence
         : null;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIS)V")
   @ObfuscatedName("dw")
   final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      try {
         boolean var8 = true;
         boolean var9 = true;

         for (int var10 = 0; var10 < 4; var10++) {
            if (var7 != 32767) {
               throw new IllegalStateException();
            }

            if (this.hitSplatCycles[var10] > var5) {
               var8 = false;
            } else {
               var9 = false;
            }
         }

         int var16 = -1;
         int var11 = -1;
         int var12 = 0;
         if (var1 >= 0) {
            if (var7 != 32767) {
               throw new IllegalStateException();
            }

            HitSplatDefinition var13 = classGF.method4234(var1, 558050665);
            var11 = var13.field2555 * 375984523;
            var12 = -332979161 * var13.field2548;
         }

         if (var9) {
            if (var7 != 32767) {
               throw new IllegalStateException();
            }

            if (-1 == var11) {
               if (var7 != 32767) {
                  throw new IllegalStateException();
               }

               this.method2842(var1, var2, var3, var4, var5, var6);
               return;
            }

            var16 = 0;
            int var17 = 0;
            if (0 == var11) {
               if (var7 != 32767) {
                  throw new IllegalStateException();
               }

               var17 = this.hitSplatCycles[0];
            } else if (var11 == 1) {
               if (var7 != 32767) {
                  throw new IllegalStateException();
               }

               var17 = this.hitSplatValues[0];
            }

            for (int var14 = 1; var14 < 4; var14++) {
               if (var11 == 0) {
                  if (var7 != 32767) {
                     this.method2842(var1, var2, var3, var4, var5, var6);
                     return;
                  }

                  if (this.hitSplatCycles[var14] < var17) {
                     if (var7 != 32767) {
                        this.method2842(var1, var2, var3, var4, var5, var6);
                        return;
                     }

                     var16 = var14;
                     var17 = this.hitSplatCycles[var14];
                  }
               } else if (1 == var11) {
                  if (var7 != 32767) {
                     this.method2842(var1, var2, var3, var4, var5, var6);
                     return;
                  }

                  if (this.hitSplatValues[var14] < var17) {
                     if (var7 != 32767) {
                        throw new IllegalStateException();
                     }

                     var16 = var14;
                     var17 = this.hitSplatValues[var14];
                  }
               }
            }

            if (1 == var11 && var17 >= var2) {
               this.method2842(var1, var2, var3, var4, var5, var6);
               return;
            }
         } else {
            if (var8) {
               if (var7 != 32767) {
                  throw new IllegalStateException();
               }

               this.hitSplatCount = 0;
            }

            for (int var18 = 0; var18 < 4; var18++) {
               if (var7 != 32767) {
                  throw new IllegalStateException();
               }

               byte var19 = this.hitSplatCount;
               this.hitSplatCount = (byte)((1 + this.hitSplatCount) % 4);
               if (this.hitSplatCycles[var19] <= var5) {
                  if (var7 != 32767) {
                     throw new IllegalStateException();
                  }

                  var16 = var19;
                  break;
               }
            }
         }

         if (var16 < 0) {
            this.method2842(var1, var2, var3, var4, var5, var6);
         } else {
            this.hitSplatTypes[var16] = var1;
            this.hitSplatValues[var16] = var2;
            this.hitSplatTypes2[var16] = var3;
            this.hitSplatValues2[var16] = var4;
            this.hitSplatCycles[var16] = var6 + var12 + var5;
            this.method2842(var1, var2, var3, var4, var5, var6);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "cr.dw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;IILlz;)V")
   @ObfuscatedName("ze")
   public static void method2763(Actor var0, int var1, int var2, MoveSpeed var3) {
      if (-1921456255 * var0.pathLength < 9) {
         var0.pathLength += 234838145;
      }

      for (int var4 = var0.pathLength * -1921456255; var4 > 0; var4--) {
         var0.pathX[var4] = var0.pathX[var4 - 1];
         var0.pathY[var4] = var0.pathY[var4 - 1];
         var0.pathTraversed[var4] = var0.pathTraversed[var4 - 1];
      }

      var0.pathX[0] = var1;
      var0.pathY[0] = var2;
      var0.pathTraversed[0] = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIB)V")
   @ObfuscatedName("dv")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      this.method2832(var1, var2, var3, var4, var5, var6);

      try {
         HealthBarDefinition var9 = (HealthBarDefinition)class402.method8806(HealthBarDefinition.HealthBarDefinition_cached, var1);
         HealthBarDefinition var8;
         if (var9 != null) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            var8 = var9;
         } else {
            byte[] var10 = HealthBarDefinition.HealthBarDefinition_archive.getFile(33, var1, 112568952);
            var9 = new HealthBarDefinition();
            var9.field2238 = var1 * 415242223;
            if (var10 != null) {
               var9.decode(new Buffer(var10), 389865377);
            }

            HealthBarDefinition.HealthBarDefinition_cached.put(var9, var1);
            var8 = var9;
         }

         var9 = var8;
         HealthBarConfig var18 = null;
         HealthBarConfig var11 = null;
         int var12 = -1653451413 * var8.int2;
         int var13 = 0;

         for (HealthBarConfig var14 = (HealthBarConfig)this.healthBars.method9642(); null != var14; var14 = (HealthBarConfig)this.healthBars.method9646()) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            var13++;
            if (var14.definition.field2238 * 1170863887 == var9.field2238 * 1170863887) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               var14.put(var4 + var2, var5, var6, var3, 1249509877);
               return;
            }

            if (var14.definition.int1 * 813571171 <= 813571171 * var9.int1) {
               if (var7 <= 0) {
                  return;
               }

               var18 = var14;
            }

            if (var14.definition.int2 * -1653451413 > var12) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               var11 = var14;
               var12 = var14.definition.int2 * -1653451413;
            }
         }

         if (null == var11) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            if (var13 >= 4) {
               if (var7 <= 0) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         HealthBarConfig var19 = new HealthBarConfig(var9);
         if (null == var18) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            this.healthBars.addLast(var19);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var19, var18);
         }

         var19.put(var4 + var2, var5, var6, var3, 1614953685);
         if (var13 >= 4) {
            if (var7 <= 0) {
               throw new IllegalStateException();
            }

            var11.remove();
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "cr.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrm;")
   @ObfuscatedName("ul")
   public IterableNodeDeque method2844() {
      return this.healthBars;
   }

   public void setIdleRotateLeft(int var1) {
      this.turnLeftSequence = var1 * 10470407;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fv")
   @Override
   public int vmethod144() {
      return -1747310679 * this.y;
   }

   public int getWalkRotateRight() {
      return this.walkRightSequence * 577914413;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dy")
   void updateSpotAnimation(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = 1759706017 * client.cycle + var4;
         ActorSpotAnim var7 = (ActorSpotAnim)this.spotAnimations.get((long)var1);
         if (null != var7) {
            if (var5 >= 468903749) {
               throw new IllegalStateException();
            }

            var7.remove();
            this.graphicsCount -= 75728729;
         }

         if (65535 != var2) {
            if (var5 >= 468903749) {
               this.method2837(var1, var2, var3, var4);
               return;
            }

            if (var2 != -1) {
               this.spotAnimations.put((Node)(new ActorSpotAnim(var2, var3, var6)), (long)var1);
               this.graphicsCount += 75728729;
               this.method2837(var1, var2, var3, var4);
               return;
            }
         }

         this.method2837(var1, var2, var3, var4);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cr.dy(" + ')');
      }
   }

   public void setWalkRotateRight(int var1) {
      this.walkRightSequence = var1 * 1809054117;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int getPlane(int var1) {
      try {
         if (-1 != 1753020269 * this.worldViewId) {
            if (var1 >= 1463650599) {
               throw new IllegalStateException();
            }

            WorldView var2 = WorldViewManager.method2901(client.worldViewManager, 1753020269 * this.worldViewId, (byte)1);
            if (null != var2) {
               if (var1 >= 1463650599) {
                  throw new IllegalStateException();
               }

               return 2115028565 * var2.plane;
            }
         }

         return Occluder.topLevelWorldView.plane * 2115028565;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cr.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("dt")
   Model method2839(Model var1, int var2) {
      Model var5 = var1;
      Actor var4 = this;
      int var6 = 1973682866;

      Model var10000;
      try {
         if (942559465 * var4.graphicsCount == 0) {
            if (var6 == -211133582) {
               throw new IllegalStateException();
            }

            var10000 = var5;
         } else {
            IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var4.spotAnimations);
            int var8 = var5.verticesCount;
            int var9 = var5.indicesCount;
            int var10 = var5.texIndicesCount;
            byte var11 = var5.field3502;

            for (ActorSpotAnim var12 = (ActorSpotAnim)var7.method9152(); var12 != null; var12 = (ActorSpotAnim)var7.next()) {
               if (var6 == -211133582) {
                  throw new IllegalStateException();
               }

               if (1759706017 * client.cycle < var12.startCycle * -1097832863) {
                  if (var6 == -211133582) {
                     throw new IllegalStateException();
                  }
               } else if (AnimationSequence.method10341(var12.animationSequence, 30, -1002405506)) {
                  if (var6 == -211133582) {
                     throw new IllegalStateException();
                  }
               } else {
                  Model var13 = class181.SpotAnimationDefinition_get(-1003297275 * var12.id, 1142786574).method4617((byte)42);
                  if (null != var13) {
                     var8 += var13.verticesCount;
                     var9 += var13.indicesCount;
                     var10 += var13.texIndicesCount;
                  }
               }
            }

            Model var16 = new Model(var8, var9, var10, var11);
            var16.method6716(var5);

            for (ActorSpotAnim var17 = (ActorSpotAnim)var7.method9152(); var17 != null; var17 = (ActorSpotAnim)var7.next()) {
               if (client.cycle * 1759706017 < -1097832863 * var17.startCycle) {
                  if (var6 == -211133582) {
                     throw new IllegalStateException();
                  }
               } else if (AnimationSequence.method10341(var17.animationSequence, 30, -1002405506)) {
                  if (var6 == -211133582) {
                     throw new IllegalStateException();
                  }
               } else {
                  Model var14 = SpotAnimationDefinition.method4613(
                     class181.SpotAnimationDefinition_get(var17.id * -1003297275, 490458623), var17.animationSequence.getFrame(-609025707), 1014572956
                  );
                  if (null == var14) {
                     if (var6 == -211133582) {
                        throw new IllegalStateException();
                     }
                  } else {
                     Model.method6877(var14, 0, -(var17.height * 1008557345), 0);
                     var16.method6716(var14);
                  }
               }
            }

            var10000 = var16;
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "cr.dt(" + ')');
      }

      Model var3 = var10000;
      var3.method6866();
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   int vmethod118() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("di")
   void method2804(int var1) {
      try {
         this.field1185 = false;
         this.field1123 = -967374543;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.di(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dr")
   @Override
   public int getY(int var1) {
      try {
         return this.x * 340712311;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dl")
   @Override
   public int getX(int var1) {
      try {
         return -1747310679 * this.y;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   int vmethod117() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("un")
   public int method2845() {
      return this.y * -1747310679;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("zb")
   public WorldView method2836() {
      if (this.worldViewId * 1753020269 > -1) {
         if (!SecureUrlRequester.client.isClientThread()) {
            if (!GameEngine.$assertionsDisabled) {
               throw new AssertionError("must be called on client thread");
            } else {
               throw new IllegalStateException("must be called on client thread");
            }
         } else {
            return client.worldViewManager.method2969(this.worldViewId * 1753020269);
         }
      } else {
         return Occluder.topLevelWorldView;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)Loj;")
   @ObfuscatedName("fx")
   Coord method2809(WorldView var1) {
      if (var1 == Occluder.topLevelWorldView) {
         return new Coord(this.getPlane(-2125870897), this.getY(-1873818967), this.getX(-727737924));
      } else {
         WorldEntity var2 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(577964535 * var1.id));
         if (var2 == null) {
            return new Coord(this.getPlane(-632843494), this.getY(-2035414221), this.getX(-727737924));
         } else {
            int var3 = var2.getY(-942126931);
            int var4 = var2.getX(-727737924);
            int var5 = var2.getPlane(-406523329);
            int var6 = this.getY(-1369747901) - WorldEntity.method10852(var2, 618253431);
            int var7 = this.getX(-727737924) - var2.method10855(2131959522);
            double var8 = -WorldEntity.method10834(var2, (byte)32) * Math.PI / 1024.0;
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            int var14 = var3 + (int)(var10 * var6 - var12 * var7);
            int var15 = (int)(var6 * var12 + var10 * var7) + var4;
            return new Coord(var5, var14, var15);
         }
      }
   }

   public void setGraphic(int var1) {
      this.method2848().method8959();
      this.graphicsCount = 0 * 75728729;
      if (var1 > -1) {
         ActorSpotAnim var2 = new ActorSpotAnim(var1, 0, 0);
         this.method2848().method8956(var2, 0L);
         this.graphicsCount = (this.graphicsCount * 942559465 + 1) * 75728729;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("el")
   void method2768(int var1, int var2) {
      this.pathLength = 0;
      this.field1164 = 0;
      this.field1145 = 0;
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.x = 792581824 * this.size + -432594048 * this.pathX[0];
      this.y = this.size * 207061312 + 1438010496 * this.pathY[0];
   }

   @ObfuscatedSignature(descriptor = "(B)Ldd;")
   @ObfuscatedName("du")
   WorldView getWorldView(byte var1) {
      try {
         if (this.worldViewId * 1753020269 != -1) {
            if (var1 == 9) {
               throw new IllegalStateException();
            } else {
               return WorldViewManager.method2901(client.worldViewManager, this.worldViewId * 1753020269, (byte)1);
            }
         } else {
            return Occluder.topLevelWorldView;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.du(" + ')');
      }
   }

   public boolean isDead() {
      return this.field1188;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   int vmethod115(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)Z")
   @ObfuscatedName("be")
   public static boolean method2758(Actor var0, int var1) {
      if (var0 == null) {
         var0.method2762(var1);
      }

      try {
         boolean var10000;
         if (AnimationSequence.method10315(var0.animationSequence, -831296794) && 0 == var0.field1153 * -1580752043) {
            if (var1 <= -1313381003) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.cj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;I)V")
   @ObfuscatedName("ro")
   public static void method2827(WorldView var0, Actor var1, int var2) {
      field1184 = null;
   }

   public LocalPoint getCameraFocus() {
      return this.getLocalLocation();
   }

   @Deprecated
   public void setActionFrame(int var1) {
      this.animationSequence.frame = var1 * -449915737;
   }

   public boolean hasSpotAnim(int var1) {
      for (ActorSpotAnim var3 : this.method2848()) {
         if (var3.getId() == var1) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("ms")
   public static void method2754(Actor var0, int var1) {
      if (var0 == null) {
         var0.method2826(var1);
      }

      try {
         var0.animationSequence.reset(-14717013);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.cr(" + ')');
      }
   }

   public int getWalkRotate180() {
      return this.walkBackSequence * -1392171615;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("dm")
   boolean method2813(byte var1) {
      try {
         boolean var10000;
         if (this.field1176 * 69976937 >= 1759706017 * client.cycle) {
            if (var1 != 32) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)Lsj;")
   @ObfuscatedName("dg")
   AnimationSequence method2822(AnimationSequence var1, int var2) {
      try {
         if (AnimationSequence.method10315(this.poseAnimationSequence, -831296794)) {
            if (var2 <= -1317103856) {
               throw new IllegalStateException();
            }

            if (SequenceDefinition.method5260(AnimationSequence.method10318(this.poseAnimationSequence, -1923924884), (byte)-44)) {
               if (var2 <= -1317103856) {
                  throw new IllegalStateException();
               }

               if (method2743(this, 1356161355) == 1683244579 * this.idleSequence) {
                  if (var2 <= -1317103856) {
                     throw new IllegalStateException();
                  }

                  if (null != var1) {
                     return null;
                  }

                  if (var2 <= -1317103856) {
                     throw new IllegalStateException();
                  }
               }

               return this.poseAnimationSequence;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cr.dg(" + ')');
      }
   }

   public void setSpotAnimFrame(int var1) {
      Iterator var2 = this.method2848().iterator();
      if (var2.hasNext()) {
         ActorSpotAnim var3 = (ActorSpotAnim)var2.next();
         var3.setFrame(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   protected int vmethod54() {
      AnimationSequence var1 = method2816(this, 2135517718);
      AnimationSequence var2 = this.method2822(var1, 248769663);
      AnimationSequence var3 = var2;
      if (var2 == null) {
         var3 = this.animationSequence;
         if (null == var3) {
            var3 = this.field1152;
         }
      }

      return AnimationSequence.method10315(var3, -831296794) ? AnimationSequence.method10318(var3, 451542338).animationHeightOffset * 89078819 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   protected int vmethod55() {
      AnimationSequence var1 = method2816(this, 2109411145);
      AnimationSequence var2 = this.method2822(var1, 106374693);
      AnimationSequence var3 = var2;
      if (var2 == null) {
         var3 = this.animationSequence;
         if (null == var3) {
            var3 = this.field1152;
         }
      }

      return AnimationSequence.method10315(var3, -831296794) ? AnimationSequence.method10318(var3, -1681966390).animationHeightOffset * 1030328834 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   protected int vmethod56() {
      AnimationSequence var1 = method2816(this, 2092315101);
      AnimationSequence var2 = this.method2822(var1, -1311858714);
      AnimationSequence var3 = var2;
      if (var2 == null) {
         var3 = this.animationSequence;
         if (null == var3) {
            var3 = this.field1152;
         }
      }

      return AnimationSequence.method10315(var3, -831296794) ? AnimationSequence.method10318(var3, -522799609).animationHeightOffset * 89078819 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   @Override
   public int vmethod102() {
      if (-1 != 1753020269 * this.worldViewId) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, -212708009 * this.worldViewId, (byte)1);
         if (null != var1) {
            return 1363839090 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ej")
   boolean method2759() {
      return AnimationSequence.method10315(this.animationSequence, -831296794) && 0 == this.field1153 * -1580752043;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   @Override
   public int vmethod103() {
      if (-1 != 1753020269 * this.worldViewId) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 1753020269 * this.worldViewId, (byte)1);
         if (null != var1) {
            return 2115028565 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fn")
   public int method2846() {
      return this.x * 340712311;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   @Override
   public int vmethod105() {
      if (-1 != 1753020269 * this.worldViewId) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 1753020269 * this.worldViewId, (byte)1);
         if (null != var1) {
            return 2115028565 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 2115028565;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   @Override
   public int vmethod146() {
      return -1747310679 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   boolean vmethod112() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   boolean vmethod113() {
      return false;
   }

   public void clearSpotAnims() {
      this.method2848().method8959();
      this.graphicsCount = 0 * 75728729;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)Loj;")
   @ObfuscatedName("dx")
   Coord method2810(WorldView var1, byte var2) {
      try {
         if (var1 == Occluder.topLevelWorldView) {
            return new Coord(this.getPlane(-865223927), this.getY(-616611981), this.getX(-727737924));
         } else {
            WorldEntity var3 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(577964535 * var1.id));
            if (var3 == null) {
               if (var2 <= 28) {
                  throw new IllegalStateException();
               } else {
                  return new Coord(this.getPlane(-1827032873), this.getY(-1800978789), this.getX(-727737924));
               }
            } else {
               int var4 = var3.getY(-458908149);
               int var5 = var3.getX(-727737924);
               int var6 = var3.getPlane(333439206);
               int var7 = this.getY(-1378704147) - WorldEntity.method10852(var3, 739537467);
               int var8 = this.getX(-727737924) - var3.method10855(2131959522);
               double var9 = -WorldEntity.method10834(var3, (byte)32) * Math.PI / 1024.0;
               double var11 = Math.cos(var9);
               double var13 = Math.sin(var9);
               int var15 = var4 + (int)(var11 * var7 - var13 * var8);
               int var16 = (int)(var7 * var13 + var11 * var8) + var5;
               return new Coord(var6, var15, var16);
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "cr.dx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   boolean vmethod111() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;I)V")
   @ObfuscatedName("if")
   public static void method2831(WorldView var0, Actor var1, int var2) {
      field1184 = var1;
      method2830(var1);
      method2843(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   @Override
   public int vmethod140() {
      return this.x * 340712311;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cf")
   int vmethod116() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("de")
   int method2742() {
      return this.poseAnimationSequence.getId(-1117014351);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("do")
   void method2744(int var1) {
      AnimationSequence.method10313(this.poseAnimationSequence, var1, 1432831541);
   }

   public void createSpotAnim(int var1, int var2, int var3, int var4) {
      IterableNodeHashTable var5 = this.method2848();
      ActorSpotAnim var6 = (ActorSpotAnim)class340.method7830(var5, var1);
      if (var6 != null) {
         var6.method11660();
         this.graphicsCount = (this.graphicsCount * 942559465 - 1) * 75728729;
      }

      if (var2 != -1) {
         var5.method8956(new ActorSpotAnim(var2, var3, SecureUrlRequester.client.getGameCycle() + var4), var1);
         this.graphicsCount = (this.graphicsCount * 942559465 + 1) * 75728729;
      }
   }

   public void setRunAnimation(int var1) {
      this.runSequence = var1 * -1512855059;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dn")
   void method2745(int var1) {
      AnimationSequence.method10313(this.poseAnimationSequence, var1, 947982394);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("da")
   public void method2835(int var1) {
      this.field1170 = this.x * 340712311;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ec")
   void method2746(int var1) {
      AnimationSequence.method10313(this.poseAnimationSequence, var1, 385740575);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;IIIIII)V")
   @ObfuscatedName("fx")
   public static void method2776(Actor var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.getWalkRotateLeft();
      }

      boolean var7 = true;
      boolean var8 = true;

      for (int var9 = 0; var9 < 4; var9++) {
         if (var0.hitSplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      int var14 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = classGF.method4234(var1, 558050665);
         var10 = var12.field2555 * 375984523;
         var11 = -332979161 * var12.field2548;
      }

      if (var8) {
         if (-1 == var10) {
            return;
         }

         var14 = 0;
         int var15 = 0;
         if (0 == var10) {
            var15 = var0.hitSplatCycles[0];
         } else if (var10 == 1) {
            var15 = var0.hitSplatValues[0];
         }

         for (int var13 = 1; var13 < 4; var13++) {
            if (var10 == 0) {
               if (var0.hitSplatCycles[var13] < var15) {
                  var14 = var13;
                  var15 = var0.hitSplatCycles[var13];
               }
            } else if (1 == var10 && var0.hitSplatValues[var13] < var15) {
               var14 = var13;
               var15 = var0.hitSplatValues[var13];
            }
         }

         if (1 == var10 && var15 >= var2) {
            return;
         }
      } else {
         if (var7) {
            var0.hitSplatCount = 0;
         }

         for (int var16 = 0; var16 < 4; var16++) {
            byte var17 = var0.hitSplatCount;
            var0.hitSplatCount = (byte)((1 + var0.hitSplatCount) % 4);
            if (var0.hitSplatCycles[var17] <= var5) {
               var14 = var17;
               break;
            }
         }
      }

      if (var14 >= 0) {
         var0.hitSplatTypes[var14] = var1;
         var0.hitSplatValues[var14] = var2;
         var0.hitSplatTypes2[var14] = var3;
         var0.hitSplatValues2[var14] = var4;
         var0.hitSplatCycles[var14] = var6 + var11 + var5;
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("hr")
   public int[] method2847() {
      return this.pathY;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jh")
   public void method2840() {
      GraphicChanged var1 = new GraphicChanged();
      var1.setActor(this);
      SecureUrlRequester.client.getCallbacks().post(var1);
   }

   public int getHealthScale() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         HealthBarConfig var1 = (HealthBarConfig)this.method2844().previous();
         return var1 != null ? var1.method3568().method4592() : -1;
      }
   }

   public int getIdleRotateRight() {
      return this.turnRightSequence * -878052923;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;II)V")
   @ObfuscatedName("xc")
   public static void method2769(Actor var0, int var1, int var2) {
      if (var0 == null) {
         var0.createSpotAnim(var1, var1, var1, var1);
      } else {
         var0.pathLength = 0;
         var0.field1164 = 0;
         var0.field1145 = 0;
         var0.pathX[0] = var1;
         var0.pathY[0] = var2;
         var0.x = 792581824 * var0.size + 1440189065 * var0.pathX[0];
         var0.y = var0.size * -1844510446 + -1929406537 * var0.pathY[0];
      }
   }

   public String getOverheadText() {
      return this.overheadText;
   }

   public int getGraphic() {
      Iterator var1 = this.method2848().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getId();
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lql;")
   @ObfuscatedName("eb")
   IterableNodeHashTable method2785() {
      return this.spotAnimations;
   }

   public void setWalkRotateLeft(int var1) {
      this.walkLeftSequence = var1 * 1071631209;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("md")
   public void method2838(int var1) {
      this.field1169 = (byte)(this.field1169 | 1);
   }

   @ObfuscatedSignature(descriptor = "(Lcr;)V")
   @ObfuscatedName("kx")
   public static void method2843(Actor var0) {
      if (var0.x * 340712311 < 128 || 13184 <= var0.x * 340712311 || var0.y * -1747310679 < 128 || 13184 <= var0.y * -1747310679) {
         var0.animationSequence.method10362();
         var0.spotAnimation = 0 * -779189801;
         var0.field1176 = 0 * 1487731929;
         var0.clearSpotAnims();
         var0.x = (var0.pathX[0] * 128 + var0.size * -919874483 * 64) * 1875668551;
         var0.y = (var0.pathY[0] * 128 + var0.size * -919874483 * 64) * -122983271;
         var0.field1170 = var0.x * 340712311;
         var0.field1171 = var0.y * -1747310679;
         var0.method2851();
      }

      if (var0 == class330.localPlayer
         && (var0.x * 340712311 < 1536 || 11776 <= var0.x * 340712311 || var0.y * -1747310679 < 1536 || 11776 <= var0.y * -1747310679)) {
         var0.animationSequence.method10362();
         var0.spotAnimation = 0 * -779189801;
         var0.field1176 = 0 * 1487731929;
         var0.clearSpotAnims();
         var0.x = (var0.pathX[0] * 128 + var0.size * -919874483 * 64) * 1875668551;
         var0.y = (var0.pathY[0] * 128 + var0.size * -919874483 * 64) * -122983271;
         var0.field1170 = var0.x * 340712311;
         var0.field1171 = var0.y * -1747310679;
         var0.method2851();
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("jp")
   public void method2832(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 == 0) {
         if (this.field1188) {
            return;
         }

         if (!field1168.contains(var1)) {
            return;
         }

         this.field1188 = true;
         if (this == SecureUrlRequester.client.method2443()) {
            client.field938.debug("You died!");
         }

         ActorDeath var7 = new ActorDeath(this);
         SecureUrlRequester.client.getCallbacks().post(var7);
      } else if (var5 > 0) {
         if (this instanceof NPC && ((NPC)this).getId() == 319 && this.field1188) {
            return;
         }

         this.field1188 = false;
      }
   }

   public void setDead(boolean var1) {
      this.field1188 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ee")
   int method2750() {
      return this.animationSequence.getId(1083289176);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("es")
   void method2755() {
      this.animationSequence.reset(-2001939340);
   }

   public Point getCanvasSpriteLocation(net.runelite.api.SpritePixels var1, int var2) {
      int var3 = this instanceof Player ? ((Player)this).getFootprintSize() : ((NPC)this).definition.getFootprintSize();
      LocalPoint var4 = this.getLocalLocation();
      int var5 = Perspective.getFootprintTileHeight(SecureUrlRequester.client, var4, this.method2836().plane * 2115028565, var3);
      var5 -= this.getAnimationHeightOffset();
      Point var6 = Perspective.localToCanvas(SecureUrlRequester.client, var4.getWorldView(), var4.getX(), var4.getY(), var5 - var2);
      if (var6 == null) {
         return null;
      } else {
         int var7 = var6.getX() - var1.getWidth() / 2;
         int var8 = var6.getY() - var1.getHeight() / 2;
         return new Point(var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("er")
   void method2756() {
      this.animationSequence.reset(2054255281);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ek")
   void method2757() {
      this.animationSequence.reset(711237364);
   }

   @ObfuscatedSignature(descriptor = "(Lcr;)V")
   @ObfuscatedName("zp")
   public static void method2830(Actor var0) {
      if (var0.spotAnimation * 108069351 >= client.cycle * 1759706017) {
         int var12 = Math.max(1, var0.spotAnimation * 108069351 - client.cycle * 1759706017);
         int var16 = var0.size * -919874483 * 64 + var0.field1181 * -1977436663 * 128;
         int var18 = var0.size * -919874483 * 64 + var0.field1178 * 2138954761 * 128;
         var0.x = (var0.x * 340712311 + (var16 - var0.x * 340712311) / var12) * 1875668551;
         var0.y = (var0.y * -1747310679 + (var18 - var0.y * -1747310679) / var12) * -122983271;
         var0.field1170 = var0.x * 340712311;
         var0.field1171 = var0.y * -1747310679;
         var0.field1145 = 0 * 1816773741;
         var0.orientation = var0.field1179 * -246789331 * -731948309;
      } else if (var0.field1176 * 69976937 >= client.cycle * 1759706017) {
         boolean var11 = var0.field1176 * 69976937 == client.cycle * 1759706017
            || var0.animationSequence.sequenceDefinition == null
            || var0.field1153 * -1580752043 != 0;
         if (!var11) {
            SequenceDefinition var14 = var0.animationSequence.sequenceDefinition;
            if (var14 != null && !var14.isMayaAnim()) {
               var11 = var0.animationSequence.frameCycle * -1148754599 + 1 > var14.frameLengths[var0.animationSequence.frame * 1756992279];
            } else {
               var11 = true;
            }
         }

         if (var11) {
            int var15 = var0.field1176 * 69976937 - var0.spotAnimation * 108069351;
            int var17 = client.cycle * 1759706017 - var0.spotAnimation * 108069351;
            int var19 = var0.size * -919874483 * 64 + var0.field1181 * -1977436663 * 128;
            int var20 = var0.size * -919874483 * 64 + var0.field1178 * 2138954761 * 128;
            int var21 = var0.size * -919874483 * 64 + var0.field1180 * -259434463 * 128;
            int var22 = var0.size * -919874483 * 64 + var0.field1182 * -276095977 * 128;
            var0.x = (var17 * var21 + var19 * (var15 - var17)) / var15 * 1875668551;
            var0.y = (var17 * var22 + var20 * (var15 - var17)) / var15 * -122983271;
            var0.field1170 = var0.x * 340712311;
            var0.field1171 = var0.y * -1747310679;
         }

         var0.field1145 = 0 * 1816773741;
         var0.orientation = var0.field1179 * -246789331 * -731948309;
         var0.rotation = var0.orientation * -1817477693 * -1511045985;
      } else {
         int var1 = var0.idleSequence * 1683244579;
         if (var0.pathLength * -1921456255 == 0) {
            var0.field1145 = 0 * 1816773741;
            var0.poseAnimationSequence.method10359(var1);
         } else {
            if (var0.animationSequence.sequenceDefinition != null && var0.field1153 * -1580752043 == 0) {
               SequenceDefinition var2 = var0.animationSequence.sequenceDefinition;
               if (var0.field1164 * -114856975 > 0 && var2.field2734 * 1930490603 == 0) {
                  var0.field1145 = (var0.field1145 * 888202597 + 1) * 1816773741;
                  var0.poseAnimationSequence.method10359(var1);
                  return;
               }

               if (var0.field1164 * -114856975 <= 0 && var2.field2731 * -1606113103 == 0) {
                  var0.field1145 = (var0.field1145 * 888202597 + 1) * 1816773741;
                  var0.poseAnimationSequence.method10359(var1);
                  return;
               }
            }

            float var13 = var0.field1170;
            float var3 = var0.field1171;
            int var4 = var0.size * -919874483 * 64 + var0.pathX[var0.pathLength * -1921456255 - 1] * 128;
            int var5 = var0.size * -919874483 * 64 + var0.pathY[var0.pathLength * -1921456255 - 1] * 128;
            if (var13 < var4) {
               if (var3 < var5) {
                  var0.orientation = 1280 * -731948309;
               } else if (var3 > var5) {
                  var0.orientation = 1792 * -731948309;
               } else {
                  var0.orientation = 1536 * -731948309;
               }
            } else if (var13 > var4) {
               if (var3 < var5) {
                  var0.orientation = 768 * -731948309;
               } else if (var3 > var5) {
                  var0.orientation = 256 * -731948309;
               } else {
                  var0.orientation = 512 * -731948309;
               }
            } else if (var3 < var5) {
               var0.orientation = 1024 * -731948309;
            } else if (var3 > var5) {
               var0.orientation = 0 * -731948309;
            }

            float var6 = Math.max(Math.abs(var4 - var13), Math.abs(var5 - var3));
            if (var6 <= 288.0F) {
               int var7 = var0.orientation * -1817477693 - var0.rotation * 1777129311 & 2047;
               if (var7 > 1024) {
                  var7 -= 2048;
               }

               var1 = var0.walkBackSequence * -1392171615;
               if (var7 >= -256 && var7 <= 256) {
                  var1 = var0.walkSequence * -1691426581;
               } else if (var7 >= 256 && var7 < 768) {
                  var1 = var0.walkRightSequence * 577914413;
               } else if (var7 >= -768 && var7 <= -256) {
                  var1 = var0.walkLeftSequence * -1963363111;
               }

               if (var1 == -1) {
                  var1 = var0.walkSequence * -1691426581;
               }

               byte var8 = 4;
               boolean var9 = true;
               if (var0 instanceof NPC) {
                  var9 = ((NPC)var0).definition.isClipped;
               }

               if (var9) {
                  if (var0.orientation * -1817477693 != var0.rotation * 1777129311 && var0.targetIndex * -998106409 == -1 && var0.field1158 * 662711013 != 0) {
                     var8 = 2;
                  }

                  if (var0.pathLength * -1921456255 > 2) {
                     var8 = 6;
                  }

                  if (var0.pathLength * -1921456255 > 3) {
                     var8 = 8;
                  }

                  if (var0.field1145 * 888202597 > 0 && var0.pathLength * -1921456255 > 1) {
                     var8 = 8;
                     var0.field1145 = (var0.field1145 * 888202597 - 1) * 1816773741;
                  }
               } else {
                  if (var0.pathLength * -1921456255 > 1) {
                     var8 = 6;
                  }

                  if (var0.pathLength * -1921456255 > 2) {
                     var8 = 8;
                  }

                  if (var0.field1145 * 888202597 > 0 && var0.pathLength * -1921456255 > 1) {
                     var8 = 8;
                     var0.field1145 = (var0.field1145 * 888202597 - 1) * 1816773741;
                  }
               }

               MoveSpeed var10 = var0.pathTraversed[var0.pathLength * -1921456255 - 1];
               if (var10 == MoveSpeed.field3808) {
                  var8 <<= 1;
               } else if (var10 == MoveSpeed.field3807) {
                  var8 >>= 1;
               }

               if (var8 >= 8) {
                  if (var1 == var0.walkSequence * -1691426581 && var0.runSequence * -2045699099 != -1) {
                     var1 = var0.runSequence * -2045699099;
                  } else if (var1 == var0.walkBackSequence * -1392171615 && var0.field1160 * 1665234837 != -1) {
                     var1 = var0.field1160 * 1665234837;
                  } else if (var1 == var0.walkLeftSequence * -1963363111 && var0.field1154 * -1258908619 != -1) {
                     var1 = var0.field1154 * -1258908619;
                  } else if (var1 == var0.walkRightSequence * 577914413 && var0.field1138 * 2019166665 != -1) {
                     var1 = var0.field1138 * 2019166665;
                  }
               } else if (var8 <= 2) {
                  if (var1 == var0.walkSequence * -1691426581 && var0.field1139 * 397393405 != -1) {
                     var1 = var0.field1139 * 397393405;
                  } else if (var1 == var0.walkBackSequence * -1392171615 && var0.field1140 * -2048617785 != -1) {
                     var1 = var0.field1140 * -2048617785;
                  } else if (var1 == var0.walkLeftSequence * -1963363111 && var0.field1141 * 2044363043 != -1) {
                     var1 = var0.field1141 * 2044363043;
                  } else if (var1 == var0.walkRightSequence * 577914413 && var0.field1142 * -1077781875 != -1) {
                     var1 = var0.field1142 * -1077781875;
                  }
               }

               if (var4 == var0.x * 340712311 && var5 == var0.y * -1747310679) {
                  var0.pathLength = (var0.pathLength * -1921456255 - 1) * 234838145;
                  if (var0.field1164 * -114856975 > 0) {
                     var0.field1164 = (var0.field1164 * -114856975 - 1) * -968350447;
                  }
               }
            } else {
               var0.x = var4 * 1875668551;
               var0.y = var5 * -122983271;
               var0.field1170 = var4;
               var0.field1171 = var5;
               var0.pathLength = (var0.pathLength * -1921456255 - 1) * 234838145;
               if (var0.field1164 * -114856975 > 0) {
                  var0.field1164 = (var0.field1164 * -114856975 - 1) * -968350447;
               }
            }

            var0.poseAnimationSequence.method10359(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lql;")
   @ObfuscatedName("lb")
   public IterableNodeHashTable method2848() {
      return this.spotAnimations;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ef")
   boolean method2760() {
      return AnimationSequence.method10315(this.animationSequence, -831296794) && 0 == this.field1153 * -1580752043;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fo")
   @Override
   public int vmethod141() {
      return this.x * 340712311;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   protected int getAnimationHeightOffset(int var1) {
      try {
         AnimationSequence var2 = method2816(this, 2141640514);
         AnimationSequence var3 = this.method2822(var2, -846573248);
         AnimationSequence var4 = var3;
         if (var3 == null) {
            if (var1 == -962274595) {
               throw new IllegalStateException();
            }

            var4 = this.animationSequence;
            if (null == var4) {
               var4 = this.field1152;
            }
         }

         int var10000;
         if (AnimationSequence.method10315(var4, -831296794)) {
            if (var1 == -962274595) {
               throw new IllegalStateException();
            }

            var10000 = AnimationSequence.method10318(var4, 540609692).animationHeightOffset * 89078819;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cr.ae(" + 41);
      }
   }

   public void removeSpotAnim(int var1) {
      ActorSpotAnim var2 = (ActorSpotAnim)class340.method7830(this.method2848(), var1);
      if (var2 != null) {
         var2.method11660();
         this.graphicsCount = (this.graphicsCount * 942559465 - 1) * 75728729;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cv")
   void method2770(int var1, int var2) {
      this.pathLength = 0;
      this.field1164 = 0;
      this.field1145 = 0;
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.x = 792581824 * this.size + -432594048 * this.pathX[0];
      this.y = this.size * 207061312 + 1438010496 * this.pathY[0];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("yk")
   public void method2841() {
      if ((this.field1169 & 1) != 0) {
         SecureUrlRequester.client.getCallbacks().post(new InteractingChanged(this, this.getInteracting()));
      }

      if ((this.field1169 & 2) != 0) {
         AnimationChanged var1 = new AnimationChanged();
         var1.setActor(this);
         SecureUrlRequester.client.getCallbacks().post(var1);
      }

      this.field1169 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   int method2751() {
      return this.animationSequence.getId(573020152);
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      int var4 = this instanceof Player ? ((Player)this).getFootprintSize() : ((NPC)this).definition.getFootprintSize();
      LocalPoint var5 = this.getLocalLocation();
      int var6 = Perspective.getFootprintTileHeight(SecureUrlRequester.client, var5, this.method2836().plane * 2115028565, var4);
      var6 -= this.getAnimationHeightOffset();
      Point var7 = Perspective.localToCanvas(SecureUrlRequester.client, var5.getWorldView(), var5.getX(), var5.getY(), var6 - var3);
      if (var7 == null) {
         return null;
      } else {
         FontMetrics var8 = var1.getFontMetrics();
         Rectangle2D var9 = var8.getStringBounds(var2, var1);
         int var10 = var7.getX() - (int)(var9.getWidth() / 2.0);
         return new Point(var10, var7.getY());
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eq")
   int method2752() {
      return this.animationSequence.getId(-1445263189);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   final void method2771() {
      this.pathLength = 0;
      this.field1164 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   final void method2772() {
      this.pathLength = 0;
      this.field1164 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ey")
   final void method2773() {
      this.pathLength = 0;
      this.field1164 = 0;
   }

   public int getPoseAnimation() {
      return this.poseAnimationSequence.id * 1870316967;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ep")
   void method2747(int var1, int var2) {
      try {
         AnimationSequence.method10313(this.poseAnimationSequence, var1, 1969090235);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cr.cv(" + ')');
      }
   }

   public int getOverheadCycle() {
      return this.overheadTextCyclesRemaining * 421730673;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eh")
   final void method2780(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var8 = (HealthBarDefinition)class402.method8806(HealthBarDefinition.HealthBarDefinition_cached, var1);
      HealthBarDefinition var7;
      if (var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.getFile(-867567277, var1, 1770238473);
         var8 = new HealthBarDefinition();
         var8.field2238 = var1 * -1714915024;
         if (var9 != null) {
            var8.decode(new Buffer(var9), -966912634);
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var8, var1);
         var7 = var8;
      }

      var8 = var7;
      HealthBarConfig var16 = null;
      HealthBarConfig var10 = null;
      int var11 = -1653451413 * var7.int2;
      int var12 = 0;

      for (HealthBarConfig var13 = (HealthBarConfig)this.healthBars.method9642(); null != var13; var13 = (HealthBarConfig)this.healthBars.method9646()) {
         var12++;
         if (var13.definition.field2238 * 1170863887 == var8.field2238 * 976768516) {
            var13.put(var4 + var2, var5, var6, var3, 763043849);
            return;
         }

         if (var13.definition.int1 * 813571171 <= 813571171 * var8.int1) {
            var16 = var13;
         }

         if (var13.definition.int2 * -2122262212 > var11) {
            var10 = var13;
            var11 = var13.definition.int2 * -1653451413;
         }
      }

      if (null != var10 || var12 < 4) {
         HealthBarConfig var17 = new HealthBarConfig(var8);
         if (null == var16) {
            this.healthBars.addLast(var17);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var17, var16);
         }

         var17.put(var4 + var2, var5, var6, var3, 740817316);
         if (var12 >= 4) {
            var10.remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlz;)V")
   @ObfuscatedName("eg")
   void method2764(int var1, int var2, MoveSpeed var3) {
      if (-1921456255 * this.pathLength < 9) {
         this.pathLength += 234838145;
      }

      for (int var4 = this.pathLength * 628667229; var4 > 0; var4--) {
         this.pathX[var4] = this.pathX[var4 - 1];
         this.pathY[var4] = this.pathY[var4 - 1];
         this.pathTraversed[var4] = this.pathTraversed[var4 - 1];
      }

      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.pathTraversed[0] = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ev")
   final void method2777(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      for (int var9 = 0; var9 < 4; var9++) {
         if (this.hitSplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      int var14 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = classGF.method4234(var1, 558050665);
         var10 = var12.field2555 * 375984523;
         var11 = -332979161 * var12.field2548;
      }

      if (var8) {
         if (-1 == var10) {
            return;
         }

         var14 = 0;
         int var15 = 0;
         if (0 == var10) {
            var15 = this.hitSplatCycles[0];
         } else if (var10 == 1) {
            var15 = this.hitSplatValues[0];
         }

         for (int var13 = 1; var13 < 4; var13++) {
            if (var10 == 0) {
               if (this.hitSplatCycles[var13] < var15) {
                  var14 = var13;
                  var15 = this.hitSplatCycles[var13];
               }
            } else if (1 == var10 && this.hitSplatValues[var13] < var15) {
               var14 = var13;
               var15 = this.hitSplatValues[var13];
            }
         }

         if (1 == var10 && var15 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for (int var16 = 0; var16 < 4; var16++) {
            byte var17 = this.hitSplatCount;
            this.hitSplatCount = (byte)((1 + this.hitSplatCount) % 4);
            if (this.hitSplatCycles[var17] <= var5) {
               var14 = var17;
               break;
            }
         }
      }

      if (var14 >= 0) {
         this.hitSplatTypes[var14] = var1;
         this.hitSplatValues[var14] = var2;
         this.hitSplatTypes2[var14] = var3;
         this.hitSplatValues2[var14] = var4;
         this.hitSplatCycles[var14] = var6 + var11 + var5;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fe")
   @Override
   public int vmethod142() {
      return this.x * 340712311;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cs")
   boolean vmethod114() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)Z")
   @ObfuscatedName("fo")
   public static boolean method2795(Actor var0, int var1) {
      if (var0 == null) {
         return var0.method2798(var1);
      } else {
         try {
            AnimationSequence var2 = method2816(var0, 2114683333);
            if (var2 != null) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (AnimationSequence.method10315(var2, -831296794)) {
                  if (var1 == 1344714459) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10318(var2, -1055040234).method5224(var2.getFrame(-609025707), 1415570509)) {
                     return true;
                  }
               }
            }

            AnimationSequence var3 = var0.method2822(var2, -40336886);
            if (null != var3) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (AnimationSequence.method10315(var3, -831296794)) {
                  if (var1 == 1344714459) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10318(var3, 1471095491).method5224(var3.getFrame(-609025707), 579242651)) {
                     if (var1 == 1344714459) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }

            if (null == var2) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (var3 == null) {
                  if (var1 == 1344714459) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10315(var0.field1152, -831296794)) {
                     if (var1 == 1344714459) {
                        throw new IllegalStateException();
                     }

                     if (AnimationSequence.method10318(var0.field1152, -2110812275).method5224(var0.field1152.getFrame(-609025707), 406499666)) {
                        if (var1 == 1344714459) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }
                  }
               }
            }

            return false;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "cr.dh(" + ')');
         }
      }
   }

   public int getHealthRatio() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         HealthBarConfig var1 = (HealthBarConfig)this.method2844().previous();
         if (var1 != null) {
            HealthBarUpdate var2 = var1.method3567(SecureUrlRequester.client.getGameCycle());
            if (var2 != null) {
               return var2.method1489();
            }
         }

         return -1;
      }
   }

   public int getRunAnimation() {
      return this.runSequence * -2045699099;
   }

   public int getWalkAnimation() {
      return this.walkSequence * -1691426581;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ff")
   void method2789() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.remove();
      }

      this.graphicsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("py")
   public void method2825(int var1) {
      String var2 = this.getOverheadText();
      if (var2 != null) {
         OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
         SecureUrlRequester.client.getCallbacks().post(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ed")
   final void method2781(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var8 = (HealthBarDefinition)class402.method8806(HealthBarDefinition.HealthBarDefinition_cached, var1);
      HealthBarDefinition var7;
      if (var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.getFile(33, var1, -1380725401);
         var8 = new HealthBarDefinition();
         var8.field2238 = var1 * 415242223;
         if (var9 != null) {
            var8.decode(new Buffer(var9), -190192420);
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var8, var1);
         var7 = var8;
      }

      var8 = var7;
      HealthBarConfig var16 = null;
      HealthBarConfig var10 = null;
      int var11 = -1653451413 * var7.int2;
      int var12 = 0;

      for (HealthBarConfig var13 = (HealthBarConfig)this.healthBars.method9642(); null != var13; var13 = (HealthBarConfig)this.healthBars.method9646()) {
         var12++;
         if (var13.definition.field2238 * 1170863887 == var8.field2238 * 1170863887) {
            var13.put(var4 + var2, var5, var6, var3, 203049998);
            return;
         }

         if (var13.definition.int1 * 813571171 <= 813571171 * var8.int1) {
            var16 = var13;
         }

         if (var13.definition.int2 * -1653451413 > var11) {
            var10 = var13;
            var11 = var13.definition.int2 * -1653451413;
         }
      }

      if (null != var10 || var12 < 4) {
         HealthBarConfig var17 = new HealthBarConfig(var8);
         if (null == var16) {
            this.healthBars.addLast(var17);
         } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(var17, var16);
         }

         var17.put(var4 + var2, var5, var6, var3, 886754753);
         if (var12 >= 4) {
            var10.remove();
         }
      }
   }

   public void setGraphicHeight(int var1) {
      Iterator var2 = this.method2848().iterator();
      if (var2.hasNext()) {
         ActorSpotAnim var3 = (ActorSpotAnim)var2.next();
         var3.setHeight(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;)Lky;")
   @ObfuscatedName("fn")
   Model method2793(Model var1) {
      if (-1074055438 * this.graphicsCount == 0) {
         return var1;
      } else {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
         int var3 = var1.verticesCount;
         int var4 = var1.indicesCount;
         int var5 = var1.texIndicesCount;
         byte var6 = var1.field3502;

         for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9152(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
            if (-1623890767 * client.cycle >= var7.startCycle * 1358672563 && !AnimationSequence.method10341(var7.animationSequence, 30, -1002405506)) {
               Model var8 = class181.SpotAnimationDefinition_get(-1256081809 * var7.id, -1028593734).method4617((byte)6);
               if (null != var8) {
                  var3 += var8.verticesCount;
                  var4 += var8.indicesCount;
                  var5 += var8.texIndicesCount;
               }
            }
         }

         Model var10 = new Model(var3, var4, var5, var6);
         var10.method6716(var1);

         for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9152(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
            if (client.cycle * -1981575928 >= 1628805092 * var11.startCycle && !AnimationSequence.method10341(var11.animationSequence, 30, -1002405506)) {
               Model var9 = SpotAnimationDefinition.method4613(
                  class181.SpotAnimationDefinition_get(var11.id * 250539459, 1601526568), var11.animationSequence.getFrame(-609025707), 1378757248
               );
               if (null != var9) {
                  Model.method6877(var9, 0, -(var11.height * 1008557345), 0);
                  var10.method6716(var9);
               }
            }
         }

         return var10;
      }
   }

   public int getLogicalHeight() {
      return this.defaultHeight * 1491799315;
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)I")
   @ObfuscatedName("kk")
   public static int method2743(Actor var0, int var1) {
      if (var0 == null) {
         return var0.method2808(var1);
      } else {
         try {
            return var0.poseAnimationSequence.getId(-1580272474);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cr.cq(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;)Lky;")
   @ObfuscatedName("fl")
   Model method2794(Model var1) {
      if (-410444352 * this.graphicsCount == 0) {
         return var1;
      } else {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
         int var3 = var1.verticesCount;
         int var4 = var1.indicesCount;
         int var5 = var1.texIndicesCount;
         byte var6 = var1.field3502;

         for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9152(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
            if (-355750311 * client.cycle >= var7.startCycle * -265302598 && !AnimationSequence.method10341(var7.animationSequence, 30, -1002405506)) {
               Model var8 = class181.SpotAnimationDefinition_get(-1003297275 * var7.id, 1341944852).method4617((byte)116);
               if (null != var8) {
                  var3 += var8.verticesCount;
                  var4 += var8.indicesCount;
                  var5 += var8.texIndicesCount;
               }
            }
         }

         Model var10 = new Model(var3, var4, var5, var6);
         var10.method6716(var1);

         for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9152(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
            if (client.cycle * 1759706017 >= -1097832863 * var11.startCycle && !AnimationSequence.method10341(var11.animationSequence, 30, -1002405506)) {
               Model var9 = SpotAnimationDefinition.method4613(
                  class181.SpotAnimationDefinition_get(var11.id * 332392077, 361433049), var11.animationSequence.getFrame(-609025707), 474836330
               );
               if (null != var9) {
                  Model.method6877(var9, 0, -(var11.height * 1008557345), 0);
                  var10.method6716(var9);
               }
            }
         }

         return var10;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fh")
   boolean method2796() {
      AnimationSequence var1 = method2816(this, 2129631053);
      if (var1 != null
         && AnimationSequence.method10315(var1, -831296794)
         && AnimationSequence.method10318(var1, -1000926125).method5224(var1.getFrame(-609025707), -1754768469)) {
         return true;
      } else {
         AnimationSequence var2 = this.method2822(var1, -596191460);
         return null != var2
               && AnimationSequence.method10315(var2, -831296794)
               && AnimationSequence.method10318(var2, -1124595996).method5224(var2.getFrame(-609025707), 1436893552)
            ? true
            : null == var1
               && var2 == null
               && AnimationSequence.method10315(this.field1152, -831296794)
               && AnimationSequence.method10318(this.field1152, -1704658990).method5224(this.field1152.getFrame(-609025707), -103748921);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)Lql;")
   @ObfuscatedName("gl")
   public static IterableNodeHashTable method2786(Actor var0, int var1) {
      if (var0 == null) {
         return var0.method2788(var1);
      } else {
         try {
            return var0.spotAnimations;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cr.dc(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)Lsj;")
   @ObfuscatedName("sn")
   public static AnimationSequence method2816(Actor var0, int var1) {
      if (var0 == null) {
         var0.method2820(var1);
      }

      try {
         if (0 == var0.field1153 * -1580752043) {
            if (var1 <= 2077538819) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(var0.animationSequence, -831296794)
               && SequenceDefinition.method5260(AnimationSequence.method10318(var0.animationSequence, -1223897053), (byte)-105)) {
               if (var1 <= 2077538819) {
                  throw new IllegalStateException();
               }

               return var0.animationSequence;
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;)Lsj;")
   @ObfuscatedName("go")
   AnimationSequence method2823(AnimationSequence var1) {
      return !AnimationSequence.method10315(this.poseAnimationSequence, -831296794)
            || !SequenceDefinition.method5260(AnimationSequence.method10318(this.poseAnimationSequence, -1341066544), (byte)-42)
            || method2743(this, 1356161355) == 1683244579 * this.idleSequence && null != var1
         ? null
         : this.poseAnimationSequence;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fi")
   boolean method2799() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); null != var2; var2 = (ActorSpotAnim)var1.next()) {
         if (client.cycle * 1759706017 >= var2.startCycle * -1097832863) {
            SpotAnimationDefinition var3 = class181.SpotAnimationDefinition_get(var2.id * -1003297275, 1234187406);
            if (AnimationSequence.method10315(var2.animationSequence, -831296794)
               && AnimationSequence.method10318(var2.animationSequence, 1995170717).method5224(var2.animationSequence.getFrame(-609025707), -1315584950)) {
               return true;
            }

            Model var4 = var3.method4617((byte)121);
            if (var4 != null && null != var4.faceAlphas) {
               return true;
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fg")
   boolean method2800() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); null != var2; var2 = (ActorSpotAnim)var1.next()) {
         if (client.cycle * 1759706017 >= var2.startCycle * -1097832863) {
            SpotAnimationDefinition var3 = class181.SpotAnimationDefinition_get(var2.id * -1003297275, 1835445873);
            if (AnimationSequence.method10315(var2.animationSequence, -831296794)
               && AnimationSequence.method10318(var2.animationSequence, -1624487618).method5224(var2.animationSequence.getFrame(-609025707), 1575272062)) {
               return true;
            }

            Model var4 = var3.method4617((byte)108);
            if (var4 != null && null != var4.faceAlphas) {
               return true;
            }
         }
      }

      return false;
   }

   public void setWalkAnimation(int var1) {
      this.walkSequence = var1 * 308070339;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;Lsj;)Lsj;")
   @ObfuscatedName("kg")
   public static AnimationSequence method2824(Actor var0, AnimationSequence var1) {
      return AnimationSequence.method10315(var0.poseAnimationSequence, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(var0.poseAnimationSequence, -766339333), (byte)-25)
            && (method2743(var0, 1356161355) != 1683244579 * var0.idleSequence || null == var1)
         ? var0.poseAnimationSequence
         : null;
   }

   public int getGraphicHeight() {
      Iterator var1 = this.method2848().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getHeight();
      } else {
         return 0;
      }
   }

   public IterableHashTable getSpotAnims() {
      return this.method2848();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ft")
   boolean method2801() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); null != var2; var2 = (ActorSpotAnim)var1.next()) {
         if (client.cycle * -264020804 >= var2.startCycle * 459086475) {
            SpotAnimationDefinition var3 = class181.SpotAnimationDefinition_get(var2.id * -1003297275, 633726221);
            if (AnimationSequence.method10315(var2.animationSequence, -831296794)
               && AnimationSequence.method10318(var2.animationSequence, 1982028269).method5224(var2.animationSequence.getFrame(-609025707), -1175784809)) {
               return true;
            }

            Model var4 = var3.method4617((byte)84);
            if (var4 != null && null != var4.faceAlphas) {
               return true;
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fq")
   void method2805() {
      this.field1185 = false;
      this.field1123 = -967374543;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lg")
   public void method2849() {
      method2790(this, 1935599509);
   }

   public void setPoseAnimation(int var1) {
      this.poseAnimationSequence.method10359(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fz")
   void method2806() {
      this.field1185 = false;
      this.field1123 = -967374543;
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(SecureUrlRequester.client, this.getLocalLocation());
   }

   public void setAnimationFrame(int var1) {
      this.animationSequence.frame = var1 * -449915737;
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = this.method2836();
      return WorldPoint.fromLocal(var1, this.method2852()[0] * 128 + 64, this.method2847()[0] * 128 + 64, var1.plane * 2115028565);
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("lq")
   public static void method2790(Actor var0, int var1) {
      if (var0 == null) {
         var0.clearSpotAnimations(var1);
      } else {
         try {
            IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(var0.spotAnimations);

            for (ActorSpotAnim var3 = (ActorSpotAnim)var2.method9152(); var3 != null; var3 = (ActorSpotAnim)var2.next()) {
               if (var1 <= 1523445101) {
                  var0.method2840();
                  return;
               }

               var3.remove();
            }

            var0.graphicsCount = 0;
            var0.method2840();
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "cr.db(" + ')');
         }
      }
   }

   @Override
   public int getAnimationHeightOffset() {
      return this.getAnimationHeightOffset(-903085797);
   }

   public void setAnimation(int var1) {
      this.animationSequence.field5800 = null;
      this.animationSequence.method10359(var1);
      this.animationSequence.field5800 = this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fk")
   void method2807() {
      this.field1185 = false;
      this.field1123 = -967374543;
   }

   public void setIdleRotateRight(int var1) {
      this.turnRightSequence = var1 * 1660361997;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("vh")
   public boolean method2833() {
      return this.x * 340712311 >= 0 && this.x * 340712311 < 13312 && this.y * -1747310679 >= 0 && this.y * -1747310679 < 13312;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fp")
   void method2791() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.remove();
      }

      this.graphicsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("wb")
   public void method2829(int var1) {
      this.field1171 = this.y * -1747310679;
   }

   Actor(int var1) {
      this.hitSplatCount = 0;
      this.hitSplatTypes = new int[4];
      this.hitSplatValues = new int[4];
      this.hitSplatCycles = new int[4];
      this.hitSplatTypes2 = new int[4];
      this.hitSplatValues2 = new int[4];
      this.healthBars = new IterableNodeDeque();
      this.false0 = false;
      this.field1123 = -967374543;
      this.npcCycle = -657376133;
      this.field1125 = 244368321;
      this.worldViewId = -1098164837;
      this.isWalking = false;
      this.size = 1531937925;
      this.idleSequence = 2146330229;
      this.turnLeftSequence = -10470407;
      this.turnRightSequence = -1660361997;
      this.walkSequence = -308070339;
      this.walkBackSequence = -207093345;
      this.walkLeftSequence = -1071631209;
      this.walkRightSequence = -1809054117;
      this.runSequence = 1512855059;
      this.field1160 = 782885955;
      this.field1154 = 2142822883;
      this.field1138 = 1365876615;
      this.field1139 = -914622293;
      this.field1140 = -1955892983;
      this.field1141 = 191908213;
      this.field1142 = -1035597893;
      this.overheadText = null;
      this.method2825(-1);
      this.field1144 = false;
      this.overheadTextCyclesRemaining = 59045028;
      this.field1161 = 0;
      this.field1147 = 0;
      this.field1148 = null;
      this.targetIndex = 92047129;
      this.method2838(-1);
      this.poseAnimationSequence = new AnimationSequence();
      this.animationSequence = new AnimationSequence();
      this.field1152 = new AnimationSequence();
      this.field1153 = 0;
      this.spotAnimations = new IterableNodeHashTable(4);
      this.graphicsCount = 0;
      this.defaultHeight = 1646918936;
      this.field1130 = 0;
      this.field1158 = -1441768032;
      this.pathLength = 0;
      this.pathX = new int[10];
      this.pathY = new int[10];
      this.pathTraversed = new MoveSpeed[10];
      this.field1145 = 0;
      this.field1164 = 0;
      this.field1165 = -2006173817;
      this.index = var1 * 1899248289;
      this.method2828();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ew")
   boolean method2761() {
      return AnimationSequence.method10315(this.animationSequence, -831296794) && 0 == this.field1153 * -1580752043;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   @Override
   public int vmethod104() {
      if (-1 != 1753020269 * this.worldViewId) {
         WorldView var1 = WorldViewManager.method2901(client.worldViewManager, 928959812 * this.worldViewId, (byte)1);
         if (null != var1) {
            return -1926883755 * var1.plane;
         }
      }

      return Occluder.topLevelWorldView.plane * 1648275262;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;IIIIII)V")
   @ObfuscatedName("lp")
   public static void method2782(Actor var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method2778(var1, var1, var1, var1, var1, var1);
      } else {
         HealthBarDefinition var8 = (HealthBarDefinition)class402.method8806(HealthBarDefinition.HealthBarDefinition_cached, var1);
         HealthBarDefinition var7;
         if (var8 != null) {
            var7 = var8;
         } else {
            byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.getFile(43518673, var1, -1808518953);
            var8 = new HealthBarDefinition();
            var8.field2238 = var1 * 1792434333;
            if (var9 != null) {
               var8.decode(new Buffer(var9), 787424);
            }

            HealthBarDefinition.HealthBarDefinition_cached.put(var8, var1);
            var7 = var8;
         }

         var8 = var7;
         HealthBarConfig var16 = null;
         HealthBarConfig var10 = null;
         int var11 = -1653451413 * var7.int2;
         int var12 = 0;

         for (HealthBarConfig var13 = (HealthBarConfig)var0.healthBars.method9642(); null != var13; var13 = (HealthBarConfig)var0.healthBars.method9646()) {
            var12++;
            if (var13.definition.field2238 * 1170863887 == var8.field2238 * 1170863887) {
               var13.put(var4 + var2, var5, var6, var3, 259833741);
               return;
            }

            if (var13.definition.int1 * 813571171 <= -1652888244 * var8.int1) {
               var16 = var13;
            }

            if (var13.definition.int2 * -831675835 > var11) {
               var10 = var13;
               var11 = var13.definition.int2 * -917305451;
            }
         }

         if (null != var10 || var12 < 4) {
            HealthBarConfig var17 = new HealthBarConfig(var8);
            if (null == var16) {
               var0.healthBars.addLast(var17);
            } else {
               IterableNodeDeque.IterableNodeDeque_addBefore(var17, var16);
            }

            var17.put(var4 + var2, var5, var6, var3, 1030332190);
            if (var12 >= 4) {
               var10.remove();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fs")
   boolean method2797() {
      AnimationSequence var1 = method2816(this, 2104300754);
      if (var1 != null
         && AnimationSequence.method10315(var1, -831296794)
         && AnimationSequence.method10318(var1, -828656959).method5224(var1.getFrame(-609025707), -2069227816)) {
         return true;
      } else {
         AnimationSequence var2 = this.method2822(var1, 713370173);
         return null != var2
               && AnimationSequence.method10315(var2, -831296794)
               && AnimationSequence.method10318(var2, -1004473835).method5224(var2.getFrame(-609025707), 1997178679)
            ? true
            : null == var1
               && var2 == null
               && AnimationSequence.method10315(this.field1152, -831296794)
               && AnimationSequence.method10318(this.field1152, -1874149797).method5224(this.field1152.getFrame(-609025707), 198056546);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cw")
   int method2753(int var1) {
      try {
         return this.animationSequence.getId(-1811806191);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.cw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcr;IILlz;I)V")
   @ObfuscatedName("ry")
   public static void method2765(Actor var0, int var1, int var2, MoveSpeed var3, int var4) {
      if (var0 == null) {
         var0.method2766(var1, var1, var3, var1);
      }

      try {
         if (-1921456255 * var0.pathLength < 9) {
            if (var4 != -645794364) {
               throw new IllegalStateException();
            }

            var0.pathLength += 234838145;
         }

         for (int var5 = var0.pathLength * -1921456255; var5 > 0; var5--) {
            var0.pathX[var5] = var0.pathX[var5 - 1];
            var0.pathY[var5] = var0.pathY[var5 - 1];
            var0.pathTraversed[var5] = var0.pathTraversed[var5 - 1];
         }

         var0.pathX[0] = var1;
         var0.pathY[0] = var2;
         var0.pathTraversed[0] = var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cr.ca(" + ')');
      }
   }

   public int getIdleRotateLeft() {
      return this.turnLeftSequence * -1787008585;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   protected int vmethod57() {
      AnimationSequence var1 = method2816(this, 2138885571);
      AnimationSequence var2 = this.method2822(var1, 1664376390);
      AnimationSequence var3 = var2;
      if (var2 == null) {
         var3 = this.animationSequence;
         if (null == var3) {
            var3 = this.field1152;
         }
      }

      return AnimationSequence.method10315(var3, -831296794) ? AnimationSequence.method10318(var3, 1578001932).animationHeightOffset * 89078819 : 0;
   }

   public int getSpotAnimFrame() {
      Iterator var1 = this.method2848().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getFrame();
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fd")
   int vmethod148() {
      return 1115955436 * this.defaultHeight + this.getAnimationHeightOffset(1895760472);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fj")
   int vmethod149() {
      return 1491799315 * this.defaultHeight + this.getAnimationHeightOffset(-132493663);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fm")
   int vmethod150() {
      return -1923669626 * this.defaultHeight + this.getAnimationHeightOffset(660363288);
   }

   public void setOverheadCycle(int var1) {
      this.overheadTextCyclesRemaining = var1 * -1846245487;
   }

   public int getPoseAnimationFrame() {
      return this.poseAnimationSequence.frame * 1756992279;
   }

   public int getOrientation() {
      return this.orientation * -1817477693;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("fa")
   WorldView method2812() {
      return this.worldViewId * 1166861224 != -1
         ? WorldViewManager.method2901(client.worldViewManager, this.worldViewId * 1753020269, (byte)1)
         : Occluder.topLevelWorldView;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bx")
   public void method2850(int var1, int var2, int var3, int var4) {
      this.updateSpotAnimation(var1, var2, var3, var4, -1259962786);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fr")
   boolean method2814() {
      return this.field1176 * 69976937 >= 1759706017 * client.cycle;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("gn")
   boolean method2815() {
      return this.field1176 * -1092494422 >= -13793668 * client.cycle;
   }

   @ObfuscatedSignature(descriptor = "()Lql;")
   @ObfuscatedName("en")
   IterableNodeHashTable method2787() {
      return this.spotAnimations;
   }

   @ObfuscatedSignature(descriptor = "()Lsj;")
   @ObfuscatedName("gm")
   AnimationSequence method2817() {
      return 0 == this.field1153 * -1580752043
            && AnimationSequence.method10315(this.animationSequence, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(this.animationSequence, -364134761), (byte)49)
         ? this.animationSequence
         : null;
   }

   @ObfuscatedSignature(descriptor = "()Lsj;")
   @ObfuscatedName("gf")
   AnimationSequence method2818() {
      return 0 == this.field1153 * -1580752043
            && AnimationSequence.method10315(this.animationSequence, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(this.animationSequence, 1411401156), (byte)48)
         ? this.animationSequence
         : null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fb")
   void method2792() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9152(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.remove();
      }

      this.graphicsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xm")
   public void method2851() {
      method2774(this, 1773119452);
   }

   @ObfuscatedSignature(descriptor = "(CLqd;I)C")
   @ObfuscatedName("at")
   static char standardizeChar(char var0, Language var1, int var2) {
      try {
         if (var0 >= 192) {
            if (var2 >= 533869311) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var2 >= 533869311) {
                  throw new IllegalStateException();
               }

               if (var0 >= 192) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 198) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'A';
                  }
               }

               if (var0 == 199) {
                  return 'C';
               }

               if (var0 >= 200) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 203) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'E';
                  }
               }

               if (var0 >= 204) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 207) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'I';
                  }
               }

               if (var0 == 209 && Language.Language_ES != var1) {
                  return 'N';
               }

               if (var0 >= 210) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 214) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'O';
                  }
               }

               if (var0 >= 217 && var0 <= 220) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 'U';
               }

               if (221 == var0) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 'Y';
               }

               if (223 == var0) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 's';
               }

               if (var0 >= 224 && var0 <= 230) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 'a';
               }

               if (var0 == 231) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 'c';
               }

               if (var0 >= 232) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 235) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'e';
                  }
               }

               if (var0 >= 236) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 239) {
                     if (var2 >= 533869311) {
                        throw new IllegalStateException();
                     }

                     return 'i';
                  }
               }

               if (241 == var0 && Language.Language_ES != var1) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  return 'n';
               }

               if (var0 >= 242) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 246) {
                     return 'o';
                  }
               }

               if (var0 >= 249) {
                  if (var2 >= 533869311) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 252) {
                     return 'u';
                  }
               }

               if (var0 == 253) {
                  return 'y';
               }

               if (var2 >= 533869311) {
                  throw new IllegalStateException();
               }

               if (var0 == 255) {
                  return 'y';
               }
            }
         }

         if (var0 == 338) {
            if (var2 >= 533869311) {
               throw new IllegalStateException();
            } else {
               return 'O';
            }
         } else if (var0 == 339) {
            if (var2 >= 533869311) {
               throw new IllegalStateException();
            } else {
               return 'o';
            }
         } else if (376 != var0) {
            return var0;
         } else if (var2 >= 533869311) {
            throw new IllegalStateException();
         } else {
            return 'Y';
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cr.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIII)Z")
   @ObfuscatedName("av")
   static boolean method2741(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      try {
         if (!ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, -755359068)) {
            if (var12 <= 1723419291) {
               throw new IllegalStateException();
            }

            if (!ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, 1579267759)) {
               if (var12 <= 1723419291) {
                  throw new IllegalStateException();
               }

               if (!ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, -89193160)
                  && !ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, 782644770)) {
                  return false;
               }
            }
         }

         return true;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "cr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mv")
   @Override
   public int vmethod153() {
      return this.getY(-1790262579);
   }

   public void setOverheadText(String var1) {
      this.overheadText = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;)Lsj;")
   @ObfuscatedName("iw")
   public static AnimationSequence method2819(Actor var0) {
      return 0 == var0.field1153 * -1580752043
            && AnimationSequence.method10315(var0.animationSequence, -831296794)
            && SequenceDefinition.method5260(AnimationSequence.method10318(var0.animationSequence, 1210872422), (byte)52)
         ? var0.animationSequence
         : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("is")
   @Override
   public int vmethod154() {
      return this.getX(-727737924);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ww")
   @Override
   public int vmethod155() {
      return this.getPlane(446304328);
   }

   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("dh")
   public static void method2774(Actor var0, int var1) {
      if (var0 == null) {
         var0.method2748(var1);
      } else {
         try {
            var0.pathLength = 0;
            var0.field1164 = 0;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cr.dd(" + ')');
         }
      }
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("nt")
   @Override
   public float vmethod152() {
      return this.field1170;
   }

   public Point getCanvasImageLocation(BufferedImage var1, int var2) {
      int var3 = this instanceof Player ? ((Player)this).getFootprintSize() : ((NPC)this).definition.getFootprintSize();
      LocalPoint var4 = this.getLocalLocation();
      int var5 = Perspective.getFootprintTileHeight(SecureUrlRequester.client, var4, this.method2836().plane * 2115028565, var3);
      var5 -= this.getAnimationHeightOffset();
      Point var6 = Perspective.localToCanvas(SecureUrlRequester.client, var4.getWorldView(), var4.getX(), var4.getY(), var5 - var2);
      if (var6 == null) {
         return null;
      } else {
         int var7 = var6.getX() - var1.getWidth() / 2;
         int var8 = var6.getY() - var1.getHeight() / 2;
         return new Point(var7, var8);
      }
   }

   public int getWalkRotateLeft() {
      return this.walkLeftSequence * -1963363111;
   }

   @ObfuscatedSignature(descriptor = "(Lcr;F)V")
   @ObfuscatedName("iz")
   public static void method2834(Actor var0, float var1) {
      if (var0.spotAnimation * 108069351 < client.cycle * 1759706017 && var0.field1176 * 69976937 < client.cycle * 1759706017) {
         if (var0.pathLength * -1921456255 != 0) {
            if (var0.animationSequence.sequenceDefinition != null && var0.field1153 * -1580752043 == 0) {
               SequenceDefinition var2 = var0.animationSequence.sequenceDefinition;
               if (var0.field1164 * -114856975 > 0 && var2.field2734 * 1930490603 == 0) {
                  return;
               }

               if (var0.field1164 * -114856975 <= 0 && var2.field2731 * -1606113103 == 0) {
                  return;
               }
            }

            while (var0.pathLength * -1921456255 > 0 && var1 > 0.0F) {
               float var11 = var0.field1170;
               float var3 = var0.field1171;
               int var4 = var0.size * -919874483 * 64 + var0.pathX[var0.pathLength * -1921456255 - 1] * 128;
               int var5 = var0.size * -919874483 * 64 + var0.pathY[var0.pathLength * -1921456255 - 1] * 128;
               byte var6 = 4;
               boolean var7 = true;
               if (var0 instanceof NPC) {
                  var7 = ((NPC)var0).definition.isClipped;
               }

               if (var7) {
                  if (var0.orientation * -1817477693 != var0.rotation * 1777129311 && var0.targetIndex * -998106409 == -1 && var0.field1158 * 662711013 != 0) {
                     var6 = 2;
                  }

                  if (var0.pathLength * -1921456255 > 2) {
                     var6 = 6;
                  }

                  if (var0.pathLength * -1921456255 > 3) {
                     var6 = 8;
                  }

                  if (var0.field1145 * 888202597 > 0 && var0.pathLength * -1921456255 > 1) {
                     var6 = 8;
                  }
               } else {
                  if (var0.pathLength * -1921456255 > 1) {
                     var6 = 6;
                  }

                  if (var0.pathLength * -1921456255 > 2) {
                     var6 = 8;
                  }

                  if (var0.field1145 * 888202597 > 0 && var0.pathLength * -1921456255 > 1) {
                     var6 = 8;
                  }
               }

               MoveSpeed var8 = var0.pathTraversed[var0.pathLength * -1921456255 - 1];
               if (var8 == MoveSpeed.field3808) {
                  var6 <<= 1;
               } else if (var8 == MoveSpeed.field3807) {
                  var6 >>= 1;
               }

               float var9 = var6 * var1;
               float var10 = 0.0F;
               if (var11 < var4) {
                  var0.field1170 += var9;
                  if (var0.field1170 > var4) {
                     var10 = (var0.field1170 - var4) / var6;
                     var0.field1170 = var4;
                  }
               } else if (var11 > var4) {
                  var0.field1170 -= var9;
                  if (var0.field1170 < var4) {
                     var10 = (var4 - var0.field1170) / var6;
                     var0.field1170 = var4;
                  }
               }

               if (var3 < var5) {
                  var0.field1171 += var9;
                  if (var0.field1171 > var5) {
                     var10 = Math.max(var10, (var5 - var0.field1171) / var6);
                     var0.field1171 = var5;
                  }
               } else if (var3 > var5) {
                  var0.field1171 -= var9;
                  if (var0.field1171 < var5) {
                     var10 = Math.max(var10, (var0.field1171 - var5) / var6);
                     var0.field1171 = var5;
                  }
               }

               var1 = var10;
               var0.x = (int)var0.field1170 * 1875668551;
               var0.y = (int)var0.field1171 * -122983271;
               if (var4 == var0.x * 340712311 && var5 == var0.y * -1747310679) {
                  var0.pathLength = (var0.pathLength * -1921456255 - 1) * 234838145;
                  if (var0.field1164 * -114856975 > 0) {
                     var0.field1164 = (var0.field1164 * -114856975 - 1) * -968350447;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cv")
   @Override
   public float vmethod151() {
      return this.field1171;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("no")
   public void method2828() {
      this.animationSequence.field5800 = this;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cq")
   int method2808(int var1) {
      try {
         return -1747310679 * this.walkBackSequence;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cn")
   public int[] method2852() {
      return this.pathX;
   }

   public int getIdlePoseAnimation() {
      return this.idleSequence * 1683244579;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yc")
   public int method2853() {
      return this.targetIndex * -998106409;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eo")
   final void method2778(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      for (int var9 = 0; var9 < 4; var9++) {
         if (this.hitSplatValues2[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      int var14 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var12 = classGF.method4234(var1, 558050665);
         var10 = var12.field2552 * 375984523;
         var11 = -332979161 * var12.field2553;
      }

      if (var8) {
         if (-1 == var10) {
            return;
         }

         var14 = 0;
         int var15 = 0;
         if (0 == var10) {
            var15 = this.hitSplatValues2[0];
         } else if (var10 == 1) {
            var15 = this.field1148[0];
         }

         for (int var13 = 1; var13 < 4; var13++) {
            if (var10 == 0) {
               if (this.hitSplatValues2[var13] < var15) {
                  var14 = var13;
                  var15 = this.hitSplatTypes2[var13];
               }
            } else if (1 == var10 && this.hitSplatValues2[var13] < var15) {
               var14 = var13;
               var15 = this.hitSplatTypes[var13];
            }
         }

         if (1 == var10 && var15 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.hitSplatCount = 0;
         }

         for (int var16 = 0; var16 < 4; var16++) {
            byte var17 = this.hitSplatCount;
            this.hitSplatCount = (byte)((1 + this.hitSplatCount) % 4);
            if (this.field1148[var17] <= var5) {
               var14 = var17;
               break;
            }
         }
      }

      if (var14 >= 0) {
         this.pathY[var14] = var1;
         this.hitSplatTypes2[var14] = var2;
         this.hitSplatCycles[var14] = var3;
         this.hitSplatTypes2[var14] = var4;
         this.pathX[var14] = var6 + var11 + var5;
      }
   }

   public void setWalkRotate180(int var1) {
      this.walkBackSequence = var1 * 207093345;
   }

   public net.runelite.api.Actor getInteracting() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var1 = this.method2853();
         if (var1 == -1) {
            return null;
         } else {
            for (WorldView var3 : client.worldViewManager) {
               if (var3.id * 577964535 != -1) {
                  Actor var4 = var1 < 65536 ? (Actor)var3.players.method9177(var1) : (Actor)var3.npcs.method9177(var1 - 65536);
                  if (var4 != null) {
                     return var4;
                  }
               }
            }

            WorldView var5 = Occluder.topLevelWorldView;
            return var1 < 65536 ? (net.runelite.api.Actor)var5.players.method9177(var1) : (net.runelite.api.Actor)var5.npcs.method9177(var1 - 65536);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cj")
   boolean method2762(int var1) {
      try {
         boolean var10000;
         if (AnimationSequence.method10315(this.poseAnimationSequence, -831296794) && 0 == this.field1182 * -1580752043) {
            if (var1 <= -1313381003) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.cj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ef")
   public void method2837(int var1, int var2, int var3, int var4) {
      GraphicChanged var5 = new GraphicChanged();
      var5.setActor(this);
      SecureUrlRequester.client.getCallbacks().post(var5);
   }

   @ObfuscatedSignature(descriptor = "(Lcr;S)Z")
   @ObfuscatedName("hn")
   public static boolean method2802(Actor var0, short var1) {
      if (var0 == null) {
         var0.method2803(var1);
      }

      try {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(var0.spotAnimations);

         for (ActorSpotAnim var3 = (ActorSpotAnim)var2.method9152(); null != var3; var3 = (ActorSpotAnim)var2.next()) {
            if (var1 != 2048) {
               throw new IllegalStateException();
            }

            if (client.cycle * 1759706017 < var3.startCycle * -1097832863) {
               if (var1 != 2048) {
                  throw new IllegalStateException();
               }
            } else {
               SpotAnimationDefinition var4 = class181.SpotAnimationDefinition_get(var3.id * -1003297275, 1375788598);
               if (AnimationSequence.method10315(var3.animationSequence, -831296794)) {
                  if (var1 != 2048) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10318(var3.animationSequence, -1962605211).method5224(var3.animationSequence.getFrame(-609025707), 664610716)) {
                     return true;
                  }
               }

               Model var5 = var4.method4617((byte)32);
               if (var5 != null) {
                  if (var1 != 2048) {
                     throw new IllegalStateException();
                  }

                  if (null != var5.faceAlphas) {
                     if (var1 != 2048) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cr.dz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cr")
   void method2826(int var1) {
      String var2 = this.getOverheadText();
      if (var2 != null) {
         OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
         SecureUrlRequester.client.getCallbacks().post(var3);
      }
   }

   public void setPoseAnimationFrame(int var1) {
      this.poseAnimationSequence.frame = var1 * -449915737;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dd")
   final void method2748(int var1) {
      AnimationSequence.method10313(this.field1152, var1, 947982394);
   }

   public int getCurrentOrientation() {
      return this.rotation * 1777129311;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("db")
   void clearSpotAnimations(int var1) {
      this.field1138 = var1 * -1512855059;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("zd")
   public void method2842(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var1 >= 0) {
         HitSplatDefinition var8 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.method7390(var1);
         if (var8 != null) {
            var7 = var8.method5017();
         }
      }

      Hitsplat var10 = new Hitsplat(var1, var2, var5 + var7 + var6);
      HitsplatApplied var9 = new HitsplatApplied();
      var9.setActor(this);
      var9.setHitsplat(var10);
      SecureUrlRequester.client.getCallbacks().post(var9);
   }

   public boolean isInteracting() {
      return this.method2853() != -1;
   }

   public WorldArea getWorldArea() {
      int var1 = 1;
      if (this instanceof net.runelite.api.NPC) {
         net.runelite.api.NPCComposition var2 = ((net.runelite.api.NPC)this).getComposition();
         if (var2 != null && var2.getConfigs() != null) {
            var2 = var2.transform();
         }

         if (var2 != null) {
            var1 = var2.getSize();
         }
      }

      return new WorldArea(this.getWorldLocation(), var1, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dh")
   boolean method2798(int var1) {
      try {
         AnimationSequence var2 = method2816(this, 2114683333);
         if (var2 != null) {
            if (var1 == 1344714459) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(var2, -831296794)) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (AnimationSequence.method10318(var2, -1055040234).method5224(var2.method10335(-609025707), 1415570509)) {
                  return true;
               }
            }
         }

         AnimationSequence var3 = this.method2822(var2, -40336886);
         if (null != var3) {
            if (var1 == 1344714459) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(var3, -831296794)) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (AnimationSequence.method10318(var3, 1471095491).method5224(var3.getFrame(-609025707), 579242651)) {
                  if (var1 == 1344714459) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         if (null == var2) {
            if (var1 == 1344714459) {
               throw new IllegalStateException();
            }

            if (var3 == null) {
               if (var1 == 1344714459) {
                  throw new IllegalStateException();
               }

               if (AnimationSequence.method10315(this.animationSequence, -831296794)) {
                  if (var1 == 1344714459) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10318(this.poseAnimationSequence, -2110812275)
                     .method5224(this.animationSequence.method10335(-609025707), 406499666)) {
                     if (var1 == 1344714459) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cr.dh(" + ')');
      }
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.x * 340712311, this.y * -1747310679, this.worldViewId * 1753020269);
   }

   @ObfuscatedSignature(descriptor = "(I)Lsj;")
   @ObfuscatedName("dp")
   AnimationSequence method2820(int var1) {
      try {
         if (0 == this.rotation * -1580752043) {
            if (var1 <= 2077538819) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10315(this.field1152, -831296794)
               && SequenceDefinition.method5260(AnimationSequence.method10318(this.field1152, -1223897053), (byte)-105)) {
               if (var1 <= 2077538819) {
                  throw new IllegalStateException();
               }

               return this.field1152;
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dp(" + ')');
      }
   }

   public int getAnimation() {
      return this.animationSequence.id * 1870316967;
   }

   @ObfuscatedSignature(descriptor = "(I)Lql;")
   @ObfuscatedName("dc")
   IterableNodeHashTable method2788(int var1) {
      try {
         return this.spotAnimations;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cr.dc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("dz")
   boolean method2803(short var1) {
      try {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);

         for (ActorSpotAnim var3 = (ActorSpotAnim)var2.method9152(); null != var3; var3 = (ActorSpotAnim)var2.next()) {
            if (var1 != 2048) {
               throw new IllegalStateException();
            }

            if (client.field934 * 1759706017 < var3.startCycle * -1097832863) {
               if (var1 != 2048) {
                  throw new IllegalStateException();
               }
            } else {
               SpotAnimationDefinition var4 = class181.SpotAnimationDefinition_get(var3.id * -1003297275, 1375788598);
               if (AnimationSequence.method10315(var3.animationSequence, -831296794)) {
                  if (var1 != 2048) {
                     throw new IllegalStateException();
                  }

                  if (AnimationSequence.method10318(var3.animationSequence, -1962605211).method5224(var3.animationSequence.getId(-609025707), 664610716)) {
                     return true;
                  }
               }

               Model var5 = var4.method4617((byte)32);
               if (var5 != null) {
                  if (var1 != 2048) {
                     throw new IllegalStateException();
                  }

                  if (null != var5.faceAlphas) {
                     if (var1 != 2048) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cr.dz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILlz;I)V")
   @ObfuscatedName("ca")
   void method2766(int var1, int var2, MoveSpeed var3, int var4) {
      try {
         if (-1921456255 * this.y < 9) {
            if (var4 != -645794364) {
               throw new IllegalStateException();
            }

            this.field1140 = this.field1145 + 234838145;
         }

         for (int var5 = this.spotAnimation * -1921456255; var5 > 0; var5--) {
            this.pathY[var5] = this.hitSplatCycles[var5 - 1];
            this.hitSplatCycles[var5] = this.field1148[var5 - 1];
            this.pathTraversed[var5] = this.pathTraversed[var5 - 1];
         }

         this.hitSplatValues[0] = var1;
         this.hitSplatValues2[0] = var2;
         this.pathTraversed[0] = var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cr.ca(" + ')');
      }
   }
}
