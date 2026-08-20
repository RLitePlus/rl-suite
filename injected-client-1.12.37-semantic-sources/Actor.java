import com.google.common.collect.ImmutableSet;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.runelite.api.IterableHashTable;
import net.runelite.api.NPCComposition;
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

@ObfuscatedName("dh")
public abstract class Actor extends Renderable implements CameraFocusableEntity, net.runelite.api.Actor {
   @ObfuscatedName("dz")
   int field1454;
   @ObfuscatedSignature(descriptor = "Ldh;")
   @ObfuscatedName("fb")
   public static Actor field1499;
   @ObfuscatedName("du")
   int field1470;
   @ObfuscatedName("cz")
   int field1467;
   @ObfuscatedName("bg")
   List field1434;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("br")
   final classFL field1435 = new classFL();
   @ObfuscatedName("db")
   int field1473;
   @ObfuscatedName("ck")
   int field1481;
   @ObfuscatedName("bz")
   int field1449;
   @ObfuscatedName("bq")
   int field1436;
   @ObfuscatedName("dd")
   int field1493;
   @ObfuscatedName("xe")
   public boolean field1504;
   @ObfuscatedName("bb")
   int field1487;
   @ObfuscatedName("bi")
   int field1489;
   @ObfuscatedName("bw")
   int field1480;
   @ObfuscatedName("bt")
   int field1490;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("cj")
   classQR field1501;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ch")
   classQR field1466;
   @ObfuscatedName("bf")
   int field1444;
   @ObfuscatedName("bs")
   int field1457;
   @ObfuscatedName("be")
   int field1488;
   @ObfuscatedName("bl")
   int field1462;
   @ObfuscatedName("bv")
   int field1450;
   @ObfuscatedName("cg")
   ArrayList field1500;
   @ObfuscatedName("di")
   int field1494;
   @ObfuscatedName("bd")
   int field1445;
   @ObfuscatedName("cu")
   int field1451;
   @ObfuscatedName("cb")
   int field1452;
   @ObfuscatedName("ct")
   int field1453;
   @ObfuscatedName("cp")
   int field1446;
   @ObfuscatedName("cq")
   int field1455;
   @ObfuscatedName("co")
   int field1460;
   @ObfuscatedName("cd")
   String overheadText;
   @ObfuscatedName("cv")
   boolean field1503;
   @ObfuscatedName("cs")
   boolean field1458;
   @ObfuscatedName("cy")
   int field1459;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("bj")
   IterableNodeDeque field1442;
   @ObfuscatedSignature(descriptor = "Laav;")
   @ObfuscatedName("bm")
   classAAV field1477 = null;
   @ObfuscatedName("ca")
   int[] field1438;
   @ObfuscatedSignature(descriptor = "Lbz;")
   @ObfuscatedName("cc")
   classBZ field1463;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("cf")
   classQR field1464;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("cn")
   classQR field1465;
   @ObfuscatedName("bu")
   int field1432;
   @ObfuscatedName("cl")
   int field1456;
   @ObfuscatedName("zd")
   public static final Set field1482 = ImmutableSet.of(0, 2, 16, 17, 18, 19, new Integer[]{20, 21, 22});
   @ObfuscatedName("iq")
   public float field1486;
   @ObfuscatedName("by")
   int field1441;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("cw")
   classQR field1502;
   @ObfuscatedName("bo")
   int field1437;
   @ObfuscatedName("ci")
   boolean field1468;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("cx")
   IterableNodeHashTable field1469;
   @ObfuscatedName("ba")
   int field1439;
   @ObfuscatedName("zd")
   public static boolean field1483;
   @ObfuscatedName("cm")
   int field1491;
   @ObfuscatedName("gj")
   public float field1485;
   @ObfuscatedName("dc")
   int field1492;
   @ObfuscatedName("bk")
   boolean field1475;
   @ObfuscatedName("dm")
   int field1495;
   @ObfuscatedName("dx")
   int field1497;
   @ObfuscatedName("ce")
   int field1447;
   @ObfuscatedName("cr")
   int field1443;
   @ObfuscatedName("bh")
   int field1448;
   @ObfuscatedName("dt")
   int field1496;
   @ObfuscatedName("ox")
   public byte field1484;
   @ObfuscatedName("dr")
   int field1471;
   @ObfuscatedName("dk")
   int field1472;
   @ObfuscatedName("dy")
   int field1498;
   @ObfuscatedName("dw")
   int[] field1474;
   @ObfuscatedName("dh")
   int[] field1433;
   @ObfuscatedSignature(descriptor = "[Lgt;")
   @ObfuscatedName("de")
   classGT[] field1476;
   @ObfuscatedName("an")
   boolean field1440;
   @ObfuscatedName("dn")
   int field1478;
   @ObfuscatedName("dv")
   int field1479;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ig")
   public void method3282(int var1) {
      this.field1485 = this.field1487 * -1547553299;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dc")
   public abstract float vmethod275();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dy")
   int method3083(int var1) {
      try {
         return this.field1464.method9734(500216846);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dy(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gp")
   void method3087(int var1, int var2) {
      try {
         int var3 = this.field1464.method9734(500216846);
         if (var3 != var1) {
            label31: {
               if (var3 != 1457308725 * this.field1436) {
                  if (var2 == -1882465006) {
                     throw new IllegalStateException();
                  }

                  if (this.field1436 * 1457308725 != var1) {
                     break label31;
                  }

                  if (var2 == -1882465006) {
                     throw new IllegalStateException();
                  }
               }

               if (this.vmethod377(-1923664727)) {
                  if (var2 == -1882465006) {
                     throw new IllegalStateException();
                  }

                  classQR.method9747(this.field1464, -1371786619);
               }
            }

            classQR.method9722(this.field1464, var1, -1978879450);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.di(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZB)V")
   @ObfuscatedName("du")
   void method3090(int var1, int var2, boolean var3, byte var4) {
      try {
         if (null == this.field1500) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }

            this.field1500 = new ArrayList();
         }

         int var5 = client.field855 * 1612595797;
         int var6 = var1 + 1612595797 * client.field855;
         int var7 = var6 + var2;

         for (int var8 = 0; var8 < this.field1500.size(); var8++) {
            classQH var9 = (classQH)this.field1500.get(var8);
            if (classQH.method9536(var9, var5, -1648809635)) {
               if (var4 != 1) {
                  return;
               }

               classQH.method9523(var9, var6, var7, var3, 2141535293);
               return;
            }
         }

         this.field1500.add(new classQH(var6, var7, var3));
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "dh.du(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   boolean vmethod264() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method3286() {
      return this.field1489 * -1272026483;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;I)Z")
   @ObfuscatedName("ah")
   public static boolean method3180(Actor var0, int var1) {
      if (var0 == null) {
         var0.method3182(var1);
      }

      try {
         if (var0.field1435.method4840() && 1612595797 * client.field855 >= var0.field1437 * -1286360919) {
            if (var1 == 341681316) {
               throw new IllegalStateException();
            }

            if (client.field855 * 1612595797 < var0.field1432 * -1575657275) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.en(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod98(int var1) {
      try {
         classQR var2 = this.method3175(-492153704);
         classQR var3 = this.method3177(var2, -2096848621);
         classQR var4 = var3;
         if (null == var3) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var4 = var2;
            if (null == var2) {
               if (var1 <= -1498749565) {
                  throw new IllegalStateException();
               }

               var4 = this.field1466;
            }
         }

         int var10000;
         if (var4.method9726(374233424)) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var10000 = var4.method9731((byte)65).field5138 * -687960895;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dh.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dr")
   int method3097(int var1) {
      try {
         return this.field1465.method9734(500216846);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("pp")
   public int method3287() {
      return this.field1487 * -1547553299;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fd")
   int method3251(int var1) {
      try {
         return 635707271 * this.field1463.field631;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("et")
   boolean method3102(int var1) {
      try {
         if (this.field1465.method9726(374233424)) {
            if (var1 != -1995590748) {
               throw new IllegalStateException();
            }

            if (0 == -211489501 * this.field1467) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.db(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dw")
   void method3106(int var1) {
      try {
         this.field1463.field623 = classLJ.field4174;
         this.field1463.field632 = -2126001287;
         this.field1463.field628 = -1858000903;
         this.field1463.field631 = 366774729;
         this.field1475 = false;
         method3160(this, 1950427400);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("mp")
   public static boolean method3103(Actor var0) {
      return var0.field1465.method9726(374233424) && 0 == -211489501 * var0.field1467;
   }

   public void setAnimation(int var1) {
      this.field1465.field5606 = null;
      this.field1465.method9786(var1);
      this.field1465.field5606 = this;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("de")
   void method3113(int var1, int var2, int var3) {
      try {
         this.field1473 = 0;
         this.field1478 = 0;
         this.field1454 = 0;
         this.field1474[0] = var1;
         this.field1433[0] = var2;
         this.field1487 = this.field1474[0] * 2050486912 + this.field1441 * 1793023936;
         this.method3282(-1);
         this.field1489 = this.field1441 * 790570944 + this.field1433[0] * 36971136;
         this.method3274(-1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.de(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("rj")
   public void method3280(int var1, int var2, int var3, int var4, boolean var5) {
      GraphicChanged var6 = new GraphicChanged();
      var6.setActor(this);
      classOE.field4843.getCallbacks().post(var6);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("dz")
   final void method3117(byte var1) {
      try {
         this.field1473 = 0;
         this.field1478 = 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nx")
   public void method3285(int var1) {
      String var2 = this.getOverheadText();
      if (var2 != null) {
         OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
         classOE.field4843.getCallbacks().post(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bn")
   boolean vmethod262(byte var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.bn(" + ')');
      }
   }

   public void setIdleRotateLeft(int var1) {
      this.field1444 = var1 * -349066389;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ka")
   int method3246() {
      return this.field1463.field629 * -723390423;
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("fk")
   void method3091(int var1, int var2, boolean var3) {
      if (null == this.field1500) {
         this.field1500 = new ArrayList();
      }

      int var4 = client.field855 * 1612595797;
      int var5 = var1 + 914572265 * client.field855;
      int var6 = var5 + var2;

      for (int var7 = 0; var7 < this.field1500.size(); var7++) {
         classQH var8 = (classQH)this.field1500.get(var7);
         if (classQH.method9536(var8, var4, -1541168364)) {
            classQH.method9523(var8, var5, var6, var3, 2141535293);
            return;
         }
      }

      this.field1500.add(new classQH(var5, var6, var3));
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ju")
   boolean method3203() {
      return this.method3223(1536677490) == classLV.field4234 && !this.method3200(-1174896200);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dq")
   void method3138(int var1) {
      try {
         classYA var2 = new classYA(this.field1469);

         for (ActorSpotAnim var3 = (ActorSpotAnim)rl3.method10079(var2); var3 != null; var3 = (ActorSpotAnim)var2.next()) {
            var3.vmethod398();
         }

         this.field1447 = 0;
         this.method3276();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.dq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;)V")
   @ObfuscatedName("pq")
   public static void method3269(WorldView var0, Actor var1) {
      if (var1.field1487 * -1547553299 < 128
         || var0.field1696 * 1296729483 - 1 << 7 <= var1.field1487 * -1547553299
         || var1.field1489 * -1272026483 < 128
         || var0.field1692 * -1269171107 - 1 << 7 <= var1.field1489 * -1272026483) {
         var1.field1465.method9783();
         var1.field1497 = 0 * -1146707731;
         var1.field1498 = 0 * -590932479;
         var1.clearSpotAnims();
         var1.field1487 = (var1.field1474[0] * 128 + var1.field1441 * 670857619 * 64) * -1997246491;
         var1.field1489 = (var1.field1433[0] * 128 + var1.field1441 * 670857619 * 64) * 302278725;
         var1.field1485 = var1.field1487 * -1547553299;
         var1.field1486 = var1.field1489 * -1272026483;
         var1.method3291();
      }

      if (var1.field1480 * -1315528093 == client.field845 * -2130951373
         && var1.field1439 * -1105444433 <= 0
         && (
            var1.field1487 * -1547553299 < 1536
               || 11776 <= var1.field1487 * -1547553299
               || var1.field1489 * -1272026483 < 1536
               || 11776 <= var1.field1489 * -1272026483
         )) {
         var1.field1465.method9783();
         var1.field1497 = 0 * -1146707731;
         var1.field1498 = 0 * -590932479;
         var1.clearSpotAnims();
         var1.field1487 = (var1.field1474[0] * 128 + var1.field1441 * 670857619 * 64) * -1997246491;
         var1.field1489 = (var1.field1433[0] * 128 + var1.field1441 * 670857619 * 64) * 302278725;
         var1.field1485 = var1.field1487 * -1547553299;
         var1.field1486 = var1.field1489 * -1272026483;
         var1.method3291();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldh;F)V")
   @ObfuscatedName("cn")
   public static void method3281(Actor var0, float var1) {
      if (var0.field1497 * -665535259 < client.field855 * 1612595797 && var0.field1498 * -1055069695 < client.field855 * 1612595797) {
         if (var0.field1473 * -1798356091 != 0) {
            if (var0.field1465.field5599 != null && var0.field1467 * -211489501 == 0) {
               SequenceDefinition var2 = var0.field1465.field5599;
               if (var0.field1478 * 642137221 > 0 && var2.field5131 * -702237139 == 0) {
                  return;
               }

               if (var0.field1478 * 642137221 <= 0 && var2.field5119 * 221400229 == 0) {
                  return;
               }
            }

            while (var0.field1473 * -1798356091 > 0 && var1 > 0.0F) {
               float var11 = var0.field1485;
               float var3 = var0.field1486;
               int var4 = var0.field1441 * 670857619 * 64 + var0.field1474[var0.field1473 * -1798356091 - 1] * 128;
               int var5 = var0.field1441 * 670857619 * 64 + var0.field1433[var0.field1473 * -1798356091 - 1] * 128;
               byte var6 = 4;
               boolean var7 = true;
               if (var0 instanceof NPC) {
                  var7 = ((NPC)var0).definition.field5327;
               }

               if (var7) {
                  if (var0.field1496 * 677773095 != var0.field1488 * 1457033841 && !var0.method3299() && var0.field1472 * -909895021 != 0) {
                     var6 = 2;
                  }

                  if (var0.field1473 * -1798356091 > 2) {
                     var6 = 6;
                  }

                  if (var0.field1473 * -1798356091 > 3) {
                     var6 = 8;
                  }

                  if (var0.field1454 * 726476101 > 0 && var0.field1473 * -1798356091 > 1) {
                     var6 = 8;
                  }
               } else {
                  if (var0.field1473 * -1798356091 > 1) {
                     var6 = 6;
                  }

                  if (var0.field1473 * -1798356091 > 2) {
                     var6 = 8;
                  }

                  if (var0.field1454 * 726476101 > 0 && var0.field1473 * -1798356091 > 1) {
                     var6 = 8;
                  }
               }

               classGT var8 = var0.field1476[var0.field1473 * -1798356091 - 1];
               if (var8 == classGT.field2681) {
                  var6 <<= 1;
               } else if (var8 == classGT.field2679) {
                  var6 >>= 1;
               }

               float var9 = var6 * var1;
               float var10 = 0.0F;
               if (var11 < var4) {
                  var0.field1485 += var9;
                  if (var0.field1485 > var4) {
                     var10 = (var0.field1485 - var4) / var6;
                     var0.field1485 = var4;
                  }
               } else if (var11 > var4) {
                  var0.field1485 -= var9;
                  if (var0.field1485 < var4) {
                     var10 = (var4 - var0.field1485) / var6;
                     var0.field1485 = var4;
                  }
               }

               if (var3 < var5) {
                  var0.field1486 += var9;
                  if (var0.field1486 > var5) {
                     var10 = Math.max(var10, (var5 - var0.field1486) / var6);
                     var0.field1486 = var5;
                  }
               } else if (var3 > var5) {
                  var0.field1486 -= var9;
                  if (var0.field1486 < var5) {
                     var10 = Math.max(var10, (var0.field1486 - var5) / var6);
                     var0.field1486 = var5;
                  }
               }

               var1 = var10;
               var0.field1487 = (int)var0.field1485 * -1997246491;
               var0.field1489 = (int)var0.field1486 * 302278725;
               if (var4 == var0.field1487 * -1547553299 && var5 == var0.field1489 * -1272026483) {
                  var0.field1473 = (var0.field1473 * -1798356091 - 1) * -2014692019;
                  if (var0.field1478 * 642137221 > 0) {
                     var0.field1478 = (var0.field1478 * 642137221 - 1) * 2090884173;
                  }
               }
            }
         }
      }
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      LocalPoint var4 = this.getLocalLocation();
      int var5 = Perspective.getFootprintTileHeight(classOE.field4843, var4, this.method3284().field1710 * -483624883, this.getFootprintSize());
      var5 -= this.getAnimationHeightOffset();
      Point var6 = Perspective.localToCanvas(classOE.field4843, var4.getWorldView(), var4.getX(), var4.getY(), var5 - var3);
      if (var6 == null) {
         return null;
      } else {
         FontMetrics var7 = var1.getFontMetrics();
         Rectangle2D var8 = var7.getStringBounds(var2, var1);
         int var9 = var6.getX() - (int)(var8.getWidth() / 2.0);
         return new Point(var9, var6.getY());
      }
   }

   public void setSpotAnimFrame(int var1) {
      Iterator var2 = this.method3294().iterator();
      if (var2.hasNext()) {
         ActorSpotAnim var3 = (ActorSpotAnim)var2.next();
         var3.setFrame(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kf")
   void method3239() {
      this.field1463.method1386(-2135105330);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)V")
   @ObfuscatedName("gk")
   public static void method3107(Actor var0) {
      var0.field1463.field623 = classLJ.field4174;
      var0.field1463.field632 = -835730874;
      var0.field1463.field628 = 526580072;
      var0.field1463.field631 = 366774729;
      var0.field1475 = false;
      method3160(var0, 824093763);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   public int vmethod259() {
      if (0 != this.field1439 * -1105444433) {
         WorldView var1 = client.field814.method1590(this.field1439 * -1561534244, (short)10157);
         if (var1 != null) {
            return -138287248 * var1.field1710;
         }
      }

      return -483624883 * classIS.field3053.field1710;
   }

   @Deprecated
   public void setActionFrame(int var1) {
      this.field1465.field5602 = var1 * -885908119;
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("aj")
   public void method3279(classBZ var1) {
      this.field1484 = (byte)(this.field1484 | 1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   @Override
   public int vmethod368(int var1) {
      try {
         return -1547553299 * this.field1487;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ey(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dj")
   boolean method3200(int var1) {
      try {
         if (this.method3102(-1995590748)) {
            if (var1 != -1174896200) {
               throw new IllegalStateException();
            }

            SequenceDefinition var2 = this.field1465.method9731((byte)60);
            if (this.field1478 * 642137221 > 0) {
               if (var1 != -1174896200) {
                  throw new IllegalStateException();
               }

               if (0 == -702237139 * var2.field5131) {
                  if (var1 != -1174896200) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            if (642137221 * this.field1478 <= 0 && 0 == 221400229 * var2.field5119) {
               if (var1 != -1174896200) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.et(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;I)V")
   @ObfuscatedName("gk")
   public static void method3263(Actor var0, int var1) {
      var0.field1463.field627 = var1 * -689558257;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("wp")
   public static void method3275(WorldView var0, Actor var1, int var2) {
      field1499 = var1;
      method3293(var0, var1);
      method3277(var1);
      method3269(var0, var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldh;ZI)V")
   @ObfuscatedName("sf")
   public static void method3231(Actor var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method3234(var1, var2);
      } else {
         try {
            var0.field1463.field622 = var1;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "dh.eb(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;S)Lky;")
   @ObfuscatedName("ek")
   classKY method3162(WorldView var1, short var2) {
      try {
         if (var1 == classIS.field3053) {
            if (var2 <= 5000) {
               throw new IllegalStateException();
            } else {
               return new classKY(this.vmethod258((byte)-34), this.vmethod368(311606126), this.vmethod371(-1244642707));
            }
         } else {
            WorldEntity var3 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var1.field1699);
            if (var3 == null) {
               if (var2 <= 5000) {
                  throw new IllegalStateException();
               } else {
                  return new classKY(this.vmethod258((byte)-116), this.vmethod368(311606126), this.vmethod371(-1913169800));
               }
            } else {
               int var4 = var3.vmethod368(311606126);
               int var5 = var3.vmethod371(-510813711);
               int var6 = var3.vmethod258((byte)-71);
               int var7 = this.vmethod368(311606126) - var3.method10589(1750722707);
               int var8 = this.vmethod371(-1221603018) - var3.method10590(1340698999);
               double var9 = -var3.method10561(-1721131864) * Math.PI / 1024.0;
               double var11 = Math.cos(var9);
               double var13 = Math.sin(var9);
               int var15 = var4 + (int)(var7 * var11 - var8 * var13);
               int var16 = var5 + (int)(var11 * var8 + var7 * var13);
               return new classKY(var6, var15, var16);
            }
         }
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "dh.ek(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod258(byte var1) {
      try {
         if (0 != this.field1439 * -1105444433) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            WorldView var2 = client.field814.method1590(this.field1439 * -1105444433, (short)-22287);
            if (var2 != null) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               return -483624883 * var2.field1710;
            }
         }

         return -483624883 * classIS.field3053.field1710;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   boolean vmethod266() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(B)Ldz;")
   @ObfuscatedName("ej")
   WorldView method3166(byte var1) {
      try {
         return -1105444433 * this.field1439 != 0 ? client.field814.method1590(-1105444433 * this.field1439, (short)17791) : classIS.field3053;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ej(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   int vmethod267(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.bp(" + 41);
      }
   }

   public void createSpotAnim(int var1, int var2, int var3, int var4) {
      IterableNodeHashTable var5 = this.method3294();
      ActorSpotAnim var6 = (ActorSpotAnim)var5.method13600(var1);
      if (var6 != null) {
         var6.method12065();
         this.field1447 = (this.field1447 * 49255335 - 1) * 509600791;
      }

      if (var2 != -1) {
         var5.method13597(new ActorSpotAnim(var2, var3, classOE.field4843.getGameCycle() + var4, this, false), var1);
         this.field1447 = (this.field1447 * 49255335 + 1) * 509600791;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ee")
   boolean method3170(int var1) {
      try {
         boolean var10000;
         if (this.field1498 * -1055069695 >= client.field855 * 1612595797) {
            if (var1 != -921463806) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ev(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lqr;")
   @ObfuscatedName("el")
   classQR method3175(int var1) {
      try {
         if (this.field1468) {
            if (null != this.field1501) {
               if (var1 == 1129557005) {
                  throw new IllegalStateException();
               }

               if (this.field1501.method9726(374233424)) {
                  if (var1 == 1129557005) {
                     throw new IllegalStateException();
                  }

                  if (this.field1501.method9731((byte)20).method8785((byte)81)) {
                     if (var1 == 1129557005) {
                        throw new IllegalStateException();
                     }

                     return this.field1501;
                  }
               }
            }

            return null;
         } else {
            if (-211489501 * this.field1467 == 0) {
               if (var1 == 1129557005) {
                  throw new IllegalStateException();
               }

               if (this.field1465.method9726(374233424)) {
                  if (var1 == 1129557005) {
                     throw new IllegalStateException();
                  }

                  if (this.field1465.method9731((byte)88).method8785((byte)-99)) {
                     if (var1 == 1129557005) {
                        throw new IllegalStateException();
                     }

                     return this.field1465;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.el(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("sq")
   public boolean method3288() {
      return this.method3149(1857490025);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("qg")
   public void method3289(int var1, int var2, int var3, int var4, boolean var5) {
      method3134(this, var1, var2, var3, var4, var5, (byte)-15);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)V")
   @ObfuscatedName("ww")
   public static void method3240(Actor var0) {
      var0.field1463.method1386(-977264229);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;I)Lqr;")
   @ObfuscatedName("eh")
   classQR method3177(classQR var1, int var2) {
      try {
         if (this.field1468) {
            if (var2 == -55865947) {
               throw new IllegalStateException();
            } else {
               if (this.field1502 != null) {
                  if (var2 == -55865947) {
                     throw new IllegalStateException();
                  }

                  if (this.field1502.method9726(374233424) && this.field1502.method9731((byte)72).method8785((byte)-22)) {
                     if (var2 == -55865947) {
                        throw new IllegalStateException();
                     }

                     if (this.field1502.method9734(500216846) != 1457308725 * this.field1436) {
                        return this.field1502;
                     }

                     if (var2 == -55865947) {
                        throw new IllegalStateException();
                     }

                     if (var1 == null) {
                        if (var2 == -55865947) {
                           throw new IllegalStateException();
                        }

                        return this.field1502;
                     }
                  }
               }

               return null;
            }
         } else {
            if (this.field1464.method9726(374233424)) {
               if (var2 == -55865947) {
                  throw new IllegalStateException();
               }

               if (this.field1464.method9731((byte)48).method8785((byte)-29)) {
                  if (var2 == -55865947) {
                     throw new IllegalStateException();
                  }

                  if (this.method3083(-1797566066) != 1457308725 * this.field1436) {
                     return this.field1464;
                  }

                  if (var2 == -55865947) {
                     throw new IllegalStateException();
                  }

                  if (var1 == null) {
                     if (var2 == -55865947) {
                        throw new IllegalStateException();
                     }

                     return this.field1464;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.eh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eg")
   boolean vmethod377(int var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.eg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jo")
   public boolean method3290() {
      return method3157(this, 1718590827);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kz")
   int method3260() {
      return this.field1463.field627 * 1145236633;
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("bm")
   public abstract float vmethod276(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   public abstract int vmethod278(int var1);

   @ObfuscatedSignature(descriptor = "(IIBBBBI)V")
   @ObfuscatedName("ex")
   void method3183(int var1, int var2, byte var3, byte var4, byte var5, byte var6, int var7) {
      try {
         this.field1437 = var1 * -271322215;
         this.field1432 = -1468588531 * var2;
         classFL.method4832(this.field1435, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dh.ex(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ey")
   public void method3291() {
      this.method3117((byte)-123);
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("fo")
   int method3191(short var1) {
      try {
         int var2 = -1;
         int var3 = this.method3195(1545153168);
         if (-1 == var3) {
            if (var1 >= 511) {
               throw new IllegalStateException();
            }

            var2 = -1657575887 * this.field1445;
         } else {
            int var4 = var3 - 1457033841 * this.field1488 & 2047;
            if (var4 > 1024) {
               if (var1 >= 511) {
                  throw new IllegalStateException();
               }

               var4 -= 2048;
            }

            var2 = this.field1462 * -412780869;
            if (var4 >= -256 && var4 <= 256) {
               if (var1 >= 511) {
                  throw new IllegalStateException();
               }

               var2 = -1657575887 * this.field1445;
            } else {
               label75: {
                  if (var4 >= 256) {
                     if (var1 >= 511) {
                        throw new IllegalStateException();
                     }

                     if (var4 < 768) {
                        var2 = this.field1448 * -144383729;
                        break label75;
                     }
                  }

                  if (var4 >= -768) {
                     if (var1 >= 511) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= -256) {
                        if (var1 >= 511) {
                           throw new IllegalStateException();
                        }

                        var2 = this.field1450 * 1347929125;
                     }
                  }
               }
            }
         }

         if (var2 == -1) {
            if (var1 >= 511) {
               throw new IllegalStateException();
            }

            var2 = -1657575887 * this.field1445;
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dh.er(" + 41);
      }
   }

   @Override
   public int getAnimationHeightOffset() {
      return this.vmethod98(106143449);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eo")
   int method3195(int var1) {
      try {
         int var2 = 128 * this.field1474[-1798356091 * this.field1473 - 1] + this.field1441 * -14785344;
         int var3 = this.field1433[this.field1473 * -1798356091 - 1] * 128 + this.field1441 * -14785344;
         if (this.field1487 * -1547553299 < var2) {
            if (var1 <= 232586001) {
               throw new IllegalStateException();
            } else if (-1272026483 * this.field1489 < var3) {
               if (var1 <= 232586001) {
                  throw new IllegalStateException();
               } else {
                  return 1280;
               }
            } else if (this.field1489 * -1272026483 > var3) {
               if (var1 <= 232586001) {
                  throw new IllegalStateException();
               } else {
                  return 1792;
               }
            } else {
               return 1536;
            }
         } else if (-1547553299 * this.field1487 > var2) {
            if (var1 <= 232586001) {
               throw new IllegalStateException();
            } else if (this.field1489 * -1272026483 < var3) {
               if (var1 <= 232586001) {
                  throw new IllegalStateException();
               } else {
                  return 768;
               }
            } else if (this.field1489 * -1272026483 > var3) {
               if (var1 <= 232586001) {
                  throw new IllegalStateException();
               } else {
                  return 256;
               }
            } else {
               return 512;
            }
         } else if (this.field1489 * -1272026483 < var3) {
            if (var1 <= 232586001) {
               throw new IllegalStateException();
            } else {
               return 1024;
            }
         } else if (this.field1489 * -1272026483 > var3) {
            if (var1 <= 232586001) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.eo(" + 41);
      }
   }

   public int getAnimationFrame() {
      return this.field1465.field5602 * 292569817;
   }

   public boolean hasSpotAnim(int var1) {
      for (ActorSpotAnim var3 : this.method3294()) {
         if (var3.getId() == var1) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("ji")
   void method3214(classBZ var1) {
      this.field1463.method1378(var1, -1429432035);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hb")
   public int method3167() {
      return this.field1441 * 670857619;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("da")
   boolean method3206(int var1) {
      try {
         if (this.method3223(1536677490) != classLV.field4235 && 0 != -1798356091 * this.field1473) {
            if (726476101 * this.field1454 <= 0) {
               return false;
            }

            if (var1 <= 1365312806) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.eu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jd")
   boolean method3207() {
      return this.method3223(1536677490) == classLV.field4235 || 0 == -1798356091 * this.field1473 || 726476101 * this.field1454 > 0;
   }

   public Point getCanvasImageLocation(BufferedImage var1, int var2) {
      LocalPoint var3 = this.getLocalLocation();
      int var4 = Perspective.getFootprintTileHeight(classOE.field4843, var3, this.method3284().field1710 * -483624883, this.getFootprintSize());
      var4 -= this.getAnimationHeightOffset();
      Point var5 = Perspective.localToCanvas(classOE.field4843, var3.getWorldView(), var3.getX(), var3.getY(), var4 - var2);
      if (var5 == null) {
         return null;
      } else {
         int var6 = var5.getX() - var1.getWidth() / 2;
         int var7 = var5.getY() - var1.getHeight() / 2;
         return new Point(var6, var7);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llv;")
   @ObfuscatedName("ei")
   classLV method3223(int var1) {
      try {
         return this.field1463.field625;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ei(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ds")
   boolean method3227(int var1) {
      try {
         return this.field1463.field622;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ee(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gm")
   final void method3123(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= 0 && var5 > 0) {
         boolean var6 = this.field1434.size() >= var5;
         int var7 = 0;

         for (int var8 = 0; var8 < this.field1434.size(); var8++) {
            classDV var9 = (classDV)this.field1434.get(var8);
            if (var9.method3619(1162775791) > var3) {
               var7 = (var8 + 1) % var5;
            } else {
               var6 = false;
            }
         }

         classPW var14 = classDJ.method3373(var1, (byte)13);
         if (null != var14.field5455) {
            var14 = classPW.method9331(var14, (byte)-13);
            if (var14 == null) {
               return;
            }
         }

         int var15 = var14.field5460 * 874549795;
         int var10 = -1;
         if (var6) {
            if (-1 == var15) {
               return;
            }

            int var11 = 0;

            for (int var12 = 0; var12 < this.field1434.size(); var12++) {
               classDV var13 = (classDV)this.field1434.get(var12);
               if (0 == var15) {
                  if (var12 == 0 || var13.method3619(-1224758898) < var11) {
                     var10 = var12;
                     var11 = var13.method3619(893788076);
                  }
               } else if (1 == var15 && (var12 == 0 || var13.method3622((short)16935) < var11)) {
                  var10 = var12;
                  var11 = var13.method3622((short)-12367);
               }
            }

            if (var15 == 1 && var11 >= var2) {
               return;
            }
         } else {
            if (var5 > 4) {
               var7 = 0;
            }

            for (int var16 = 0; var16 < var5; var16++) {
               int var18 = var7;
               var7 = (var7 + 1) % var5;
               if (var18 >= this.field1434.size()) {
                  this.field1434.add(new classDV());
                  var10 = this.field1434.size() - 1;
                  break;
               }

               classDV var19 = (classDV)this.field1434.get(var18);
               if (var19.method3619(310717377) <= var3) {
                  var10 = var18;
                  break;
               }
            }
         }

         if (var10 >= 0) {
            classDV var17 = (classDV)this.field1434.get(var10);
            var17.method3611(var1, var2, var14.field5448 * -1513826825 + var3 + var4, (byte)16);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ec")
   void method3241(byte var1) {
      try {
         this.field1463.method1386(625783929);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ec(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fq")
   int method3084() {
      return this.field1464.method9734(500216846);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("fg")
   int method3247(byte var1) {
      try {
         return this.field1463.field629 * -723390423;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ud")
   public int[] method3292() {
      return this.field1433;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("zj")
   public static boolean method3153(Actor var0) {
      return classLU.field4226 == var0.field1463.field624 && var0.field1463.field628 * -1098050121 != -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hw")
   void method3139() {
      classYA var1 = new classYA(this.field1469);

      for (ActorSpotAnim var2 = (ActorSpotAnim)rl3.method10079(var1); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.vmethod398();
      }

      this.field1447 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cm")
   public abstract classFL vmethod273();

   public void setWalkAnimation(int var1) {
      this.field1445 = var1 * -950783279;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("fl")
   int method3254(byte var1) {
      try {
         return 2030011479 * this.field1463.field630;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fy(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("xo")
   public static boolean method3201(Actor var0) {
      if (var0 == null) {
         var0.getAnimation();
      }

      if (var0.method3102(-1995590748)) {
         SequenceDefinition var1 = var0.field1465.method9731((byte)32);
         if (var0.field1478 * 642137221 > 0 && 0 == -702237139 * var1.field5131) {
            return true;
         }

         if (642137221 * var0.field1478 <= 0 && 0 == 221400229 * var1.field5119) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fi")
   int method3261(int var1) {
      try {
         return this.field1463.field627 * 1373839855;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fi(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("di")
   void method3264(int var1, int var2) {
      try {
         this.field1463.field627 = var1 * -689558257;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.fb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod99() {
      classQR var1 = this.method3175(-1334773757);
      classQR var2 = this.method3177(var1, -759330478);
      classQR var3 = var2;
      if (null == var2) {
         var3 = var1;
         if (null == var1) {
            var3 = this.field1466;
         }
      }

      return var3.method9726(374233424) ? var3.method9731((byte)83).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;)V")
   @ObfuscatedName("tx")
   public static void method3277(Actor var0) {
      if (var0.field1497 * -665535259 >= client.field855 * 1612595797) {
         int var12 = Math.max(1, var0.field1497 * -665535259 - client.field855 * 1612595797);
         int var16 = var0.field1441 * 670857619 * 64 + var0.field1491 * -1606442429 * 128;
         int var18 = var0.field1441 * 670857619 * 64 + var0.field1493 * 260232107 * 128;
         var0.field1487 = (var0.field1487 * -1547553299 + (var16 - var0.field1487 * -1547553299) / var12) * -1997246491;
         var0.field1489 = (var0.field1489 * -1272026483 + (var18 - var0.field1489 * -1272026483) / var12) * 302278725;
         var0.field1485 = var0.field1487 * -1547553299;
         var0.field1486 = var0.field1489 * -1272026483;
         var0.field1454 = 0 * -556161651;
         var0.field1496 = var0.field1494 * 1768496529 * -1685749609;
      } else if (var0.field1498 * -1055069695 >= client.field855 * 1612595797) {
         boolean var11 = var0.field1498 * -1055069695 == client.field855 * 1612595797 || var0.field1465.field5599 == null || var0.field1467 * -211489501 != 0;
         if (!var11) {
            SequenceDefinition var14 = var0.field1465.field5599;
            if (var14 != null && !var14.isMayaAnim()) {
               var11 = var0.field1465.field5604 * -1399668821 + 1 > var14.field5125[var0.field1465.field5602 * 292569817];
            } else {
               var11 = true;
            }
         }

         if (var11) {
            int var15 = var0.field1498 * -1055069695 - var0.field1497 * -665535259;
            int var17 = client.field855 * 1612595797 - var0.field1497 * -665535259;
            int var19 = var0.field1441 * 670857619 * 64 + var0.field1491 * -1606442429 * 128;
            int var20 = var0.field1441 * 670857619 * 64 + var0.field1493 * 260232107 * 128;
            int var21 = var0.field1441 * 670857619 * 64 + var0.field1492 * 801221335 * 128;
            int var22 = var0.field1441 * 670857619 * 64 + var0.field1495 * -1067628647 * 128;
            var0.field1487 = (var17 * var21 + var19 * (var15 - var17)) / var15 * -1997246491;
            var0.field1489 = (var17 * var22 + var20 * (var15 - var17)) / var15 * 302278725;
            var0.field1485 = var0.field1487 * -1547553299;
            var0.field1486 = var0.field1489 * -1272026483;
         }

         var0.field1454 = 0 * -556161651;
         var0.field1496 = var0.field1494 * 1768496529 * -1685749609;
         var0.field1488 = var0.field1496 * 677773095 * 573632145;
      } else {
         int var1 = var0.field1436 * 1457308725;
         if (var0.field1473 * -1798356091 == 0) {
            var0.field1454 = 0 * -556161651;
            var0.field1464.method9786(var1);
         } else {
            if (var0.field1465.field5599 != null && var0.field1467 * -211489501 == 0) {
               SequenceDefinition var2 = var0.field1465.field5599;
               if (var0.field1478 * 642137221 > 0 && var2.field5131 * -702237139 == 0) {
                  var0.field1454 = (var0.field1454 * 726476101 + 1) * -556161651;
                  var0.field1464.method9786(var1);
                  return;
               }

               if (var0.field1478 * 642137221 <= 0 && var2.field5119 * 221400229 == 0) {
                  var0.field1454 = (var0.field1454 * 726476101 + 1) * -556161651;
                  var0.field1464.method9786(var1);
                  return;
               }
            }

            float var13 = var0.field1485;
            float var3 = var0.field1486;
            int var4 = var0.field1441 * 670857619 * 64 + var0.field1474[var0.field1473 * -1798356091 - 1] * 128;
            int var5 = var0.field1441 * 670857619 * 64 + var0.field1433[var0.field1473 * -1798356091 - 1] * 128;
            float var6 = Math.max(Math.abs(var4 - var13), Math.abs(var5 - var3));
            if (var6 <= 288.0F) {
               int var7 = var0.field1496 * 677773095 - var0.field1488 * 1457033841 & 2047;
               if (var7 > 1024) {
                  var7 -= 2048;
               }

               var1 = var0.field1462 * -412780869;
               if (var7 >= -256 && var7 <= 256) {
                  var1 = var0.field1445 * -1657575887;
               } else if (var7 >= 256 && var7 < 768) {
                  var1 = var0.field1448 * -144383729;
               } else if (var7 >= -768 && var7 <= -256) {
                  var1 = var0.field1450 * 1347929125;
               }

               if (var1 == -1) {
                  var1 = var0.field1445 * -1657575887;
               }

               byte var8 = 4;
               boolean var9 = true;
               if (var0 instanceof NPC) {
                  var9 = ((NPC)var0).definition.field5327;
               }

               if (var9) {
                  if (var0.field1496 * 677773095 != var0.field1488 * 1457033841 && !var0.method3299() && var0.field1472 * -909895021 != 0) {
                     var8 = 2;
                  }

                  if (var0.field1473 * -1798356091 > 2) {
                     var8 = 6;
                  }

                  if (var0.field1473 * -1798356091 > 3) {
                     var8 = 8;
                  }

                  if (var0.field1454 * 726476101 > 0 && var0.field1473 * -1798356091 > 1) {
                     var8 = 8;
                     var0.field1454 = (var0.field1454 * 726476101 - 1) * -556161651;
                  }
               } else {
                  if (var0.field1473 * -1798356091 > 1) {
                     var8 = 6;
                  }

                  if (var0.field1473 * -1798356091 > 2) {
                     var8 = 8;
                  }

                  if (var0.field1454 * 726476101 > 0 && var0.field1473 * -1798356091 > 1) {
                     var8 = 8;
                     var0.field1454 = (var0.field1454 * 726476101 - 1) * -556161651;
                  }
               }

               classGT var10 = var0.field1476[var0.field1473 * -1798356091 - 1];
               if (var10 == classGT.field2681) {
                  var8 <<= 1;
               } else if (var10 == classGT.field2679) {
                  var8 >>= 1;
               }

               if (var8 >= 8) {
                  if (var1 == var0.field1445 * -1657575887 && var0.field1449 * -1549975911 != -1) {
                     var1 = var0.field1449 * -1549975911;
                  } else if (var1 == var0.field1462 * -412780869 && var0.field1443 * -1673289465 != -1) {
                     var1 = var0.field1443 * -1673289465;
                  } else if (var1 == var0.field1450 * 1347929125 && var0.field1451 * 95006409 != -1) {
                     var1 = var0.field1451 * 95006409;
                  } else if (var1 == var0.field1448 * -144383729 && var0.field1452 * 570027823 != -1) {
                     var1 = var0.field1452 * 570027823;
                  }
               } else if (var8 <= 2) {
                  if (var1 == var0.field1445 * -1657575887 && var0.field1453 * 887997003 != -1) {
                     var1 = var0.field1453 * 887997003;
                  } else if (var1 == var0.field1462 * -412780869 && var0.field1446 * -98755809 != -1) {
                     var1 = var0.field1446 * -98755809;
                  } else if (var1 == var0.field1450 * 1347929125 && var0.field1455 * -478124031 != -1) {
                     var1 = var0.field1455 * -478124031;
                  } else if (var1 == var0.field1448 * -144383729 && var0.field1456 * 1568201995 != -1) {
                     var1 = var0.field1456 * 1568201995;
                  }
               }

               if (var4 == var0.field1487 * -1547553299 && var5 == var0.field1489 * -1272026483) {
                  var0.field1473 = (var0.field1473 * -1798356091 - 1) * -2014692019;
                  if (var0.field1478 * 642137221 > 0) {
                     var0.field1478 = (var0.field1478 * 642137221 - 1) * 2090884173;
                  }
               }
            } else {
               var0.field1487 = var4 * -1997246491;
               var0.field1489 = var5 * 302278725;
               var0.field1485 = var4;
               var0.field1486 = var5;
               var0.field1473 = (var0.field1473 * -1798356091 - 1) * -2014692019;
               if (var0.field1478 * 642137221 > 0) {
                  var0.field1478 = (var0.field1478 * 642137221 - 1) * 2090884173;
               }
            }

            var0.field1464.method9786(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod100() {
      classQR var1 = this.method3175(-1822316548);
      classQR var2 = this.method3177(var1, -114235744);
      classQR var3 = var2;
      if (null == var2) {
         var3 = var1;
         if (null == var1) {
            var3 = this.field1466;
         }
      }

      return var3.method9726(374233424) ? var3.method9731((byte)109).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   public int vmethod101() {
      classQR var1 = this.method3175(909846629);
      classQR var2 = this.method3177(var1, 206308559);
      classQR var3 = var2;
      if (null == var2) {
         var3 = var1;
         if (null == var1) {
            var3 = this.field1466;
         }
      }

      return var3.method9726(374233424) ? var3.method9731((byte)45).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jg")
   boolean method3209() {
      return this.method3223(1536677490) == classLV.field4235 || 0 == -1798356091 * this.field1473;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod103() {
      classQR var1 = this.method3175(1201112592);
      classQR var2 = this.method3177(var1, 1619363717);
      classQR var3 = var2;
      if (null == var2) {
         var3 = var1;
         if (null == var1) {
            var3 = this.field1466;
         }
      }

      return var3.method9726(374233424) ? var3.method9731((byte)80).field5138 * -687960895 : 0;
   }

   public net.runelite.api.Actor getInteracting() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.field1463.field624 != classLU.field4225) {
         return null;
      } else if (this.field1463.field623 != classLJ.field4176 && this.field1463.field623 != classLJ.field4177) {
         return null;
      } else {
         for (WorldView var2 : client.field814) {
            if (var2.field1699 * 2140889407 != 0) {
               Actor var3 = this.field1463.field623 == classLJ.field4177
                  ? (Actor)var2.field1698.method13405(this.field1463.field632 * 893538615)
                  : (Actor)var2.field1694.method13405(this.field1463.field632 * 893538615);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         WorldView var4 = classIS.field3053;
         return this.field1463.field623 == classLJ.field4177
            ? (net.runelite.api.Actor)var4.field1698.method13405(this.field1463.field632 * 893538615)
            : (net.runelite.api.Actor)var4.field1694.method13405(this.field1463.field632 * 893538615);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ky")
   @Override
   public int vmethod370() {
      return this.field1489 * -1272026483;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod102() {
      classQR var1 = this.method3175(1243103153);
      classQR var2 = this.method3177(var1, 1017017174);
      classQR var3 = var2;
      if (null == var2) {
         var3 = var1;
         if (null == var1) {
            var3 = this.field1466;
         }
      }

      return var3.method9726(374233424) ? var3.method9731((byte)49).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ks")
   int method3243() {
      return this.field1463.field632 * 893538615;
   }

   public int getIdleRotateLeft() {
      return this.field1444 * 1201940803;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   boolean vmethod265() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("es")
   int vmethod373(int var1) {
      try {
         return -1576740359 * this.field1470 + this.vmethod98(106143449);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.es(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   int vmethod268() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eu")
   boolean method3151(int var1) {
      try {
         boolean var10000;
         if (this.field1463.field624 == classLU.field4225 && classLJ.field4174 != this.field1463.field623 && -1 != 893538615 * this.field1463.field632) {
            if (var1 == 221400229) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ci")
   public abstract classFL vmethod271();

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ew")
   boolean method3204(byte var1) {
      try {
         if (this.method3223(1536677490) == classLV.field4234) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (!this.method3200(-1174896200)) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ew(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ce")
   public abstract classFL vmethod272();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kv")
   int method3252() {
      return 635707271 * this.field1463.field631;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iu")
   int method3192() {
      int var1 = -1;
      int var2 = this.method3195(1744765911);
      if (-1 == var2) {
         var1 = -1657575887 * this.field1445;
      } else {
         int var3 = var2 - 1457033841 * this.field1488 & 2047;
         if (var3 > 1024) {
            var3 -= 2048;
         }

         var1 = this.field1462 * -412780869;
         if (var3 >= -256 && var3 <= 256) {
            var1 = -1657575887 * this.field1445;
         } else if (var3 >= 256 && var3 < 768) {
            var1 = this.field1448 * -144383729;
         } else if (var3 >= -768 && var3 <= -256) {
            var1 = this.field1450 * 1347929125;
         }
      }

      if (var1 == -1) {
         var1 = -1657575887 * this.field1445;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dd")
   public abstract float vmethod277();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dx")
   public abstract int vmethod280();

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fs")
   public void method3270(int var1, int var2, int var3, int var4, int var5) {
      classDV.field1640 = null;
   }

   public int getHealthScale() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         classCO var1 = (classCO)this.method3300().method8223();
         return var1 != null ? var1.method2568().method9373() : -1;
      }
   }

   public void setIdlePoseAnimation(int var1) {
      this.field1436 = var1 * -506237411;
   }

   public int getGraphicHeight() {
      Iterator var1 = this.method3294().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getHeight();
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   public abstract int vmethod279();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   int method3085() {
      return this.field1464.method9734(500216846);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fz")
   int method3086() {
      return this.field1464.method9734(500216846);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fj")
   int method3249(int var1) {
      try {
         return this.field1463.field628 * -1098050121;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fp")
   void method3088(int var1) {
      int var2 = this.field1464.method9734(500216846);
      if (var2 != var1) {
         if ((var2 == 1457308725 * this.field1436 || this.field1436 * 1457308725 == var1) && this.vmethod377(-1090467429)) {
            classQR.method9747(this.field1464, -709175844);
         }

         classQR.method9722(this.field1464, var1, -2088088287);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;)V")
   @ObfuscatedName("pj")
   public static void method3293(WorldView var0, Actor var1) {
      classEB.method3803(var0, var1, -1622953475);
   }

   public int getWalkAnimation() {
      return this.field1445 * -1657575887;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gt")
   public void method3276() {
      GraphicChanged var1 = new GraphicChanged();
      var1.setActor(this);
      classOE.field4843.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fs")
   void method3089(int var1) {
      int var2 = this.field1464.method9734(500216846);
      if (var2 != var1) {
         if ((var2 == 1203212678 * this.field1436 || this.field1436 * 1457308725 == var1) && this.vmethod377(-79489027)) {
            classQR.method9747(this.field1464, -1064705684);
         }

         classQR.method9722(this.field1464, var1, -2088678235);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("fx")
   void method3092(int var1, int var2, boolean var3) {
      if (null == this.field1500) {
         this.field1500 = new ArrayList();
      }

      int var4 = client.field855 * 1612595797;
      int var5 = var1 + 1612595797 * client.field855;
      int var6 = var5 + var2;

      for (int var7 = 0; var7 < this.field1500.size(); var7++) {
         classQH var8 = (classQH)this.field1500.get(var7);
         if (classQH.method9536(var8, var4, -134128334)) {
            classQH.method9523(var8, var5, var6, var3, 2141535293);
            return;
         }
      }

      this.field1500.add(new classQH(var5, var6, var3));
   }

   public int getLogicalHeight() {
      return this.field1470 * -1576740359;
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("fv")
   void method3093(int var1, int var2, boolean var3) {
      if (null == this.field1500) {
         this.field1500 = new ArrayList();
      }

      int var4 = client.field855 * 1612595797;
      int var5 = var1 + 1612595797 * client.field855;
      int var6 = var5 + var2;

      for (int var7 = 0; var7 < this.field1500.size(); var7++) {
         classQH var8 = (classQH)this.field1500.get(var7);
         if (classQH.method9536(var8, var4, -1116619611)) {
            classQH.method9523(var8, var5, var6, var3, 2141535293);
            return;
         }
      }

      this.field1500.add(new classQH(var5, var6, var3));
   }

   public int getPoseAnimation() {
      return this.field1464.field5598 * 1684838611;
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("fn")
   void method3094(int var1, int var2, boolean var3) {
      if (null == this.field1500) {
         this.field1500 = new ArrayList();
      }

      int var4 = client.field855 * -2075759992;
      int var5 = var1 + 2131601484 * client.field855;
      int var6 = var5 + var2;

      for (int var7 = 0; var7 < this.field1500.size(); var7++) {
         classQH var8 = (classQH)this.field1500.get(var7);
         if (classQH.method9536(var8, var4, -606226450)) {
            classQH.method9523(var8, var5, var6, var3, 2141535293);
            return;
         }
      }

      this.field1500.add(new classQH(var5, var6, var3));
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("br")
   static int method3268(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)66);
         if (var0 == 2800) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(
               classWK.field6691.method12173(var4, (byte)0), -2106114841
            );
            return 1;
         } else if (var0 == 2801) {
            if (var3 == -201810439) {
               throw new IllegalStateException();
            } else {
               int var5 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var5--;
               if (null != var4.actions) {
                  if (var3 == -201810439) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.actions.length) {
                     if (var3 == -201810439) {
                        throw new IllegalStateException();
                     }

                     if (null != var4.actions[var5]) {
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.actions[var5];
                        return 1;
                     }
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (var0 == 2802) {
            if (var3 == -201810439) {
               throw new IllegalStateException();
            } else {
               if (var4.field4309 == null) {
                  if (var3 == -201810439) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.field4309;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "dh.br(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fr")
   void method3095() {
      this.field1501 = null;
      this.field1502 = null;
      if (null != this.field1500) {
         this.field1500.clear();
      }
   }

   Actor(int var1) {
      this.field1434 = new ArrayList(4);
      this.field1442 = new IterableNodeDeque();
      this.field1475 = false;
      this.field1437 = 271322215;
      this.field1432 = 1468588531;
      this.field1439 = 0;
      this.field1440 = false;
      this.field1441 = -108884837;
      this.field1436 = 506237411;
      this.field1444 = 349066389;
      this.field1457 = -190249931;
      this.field1445 = 950783279;
      this.field1462 = -164191859;
      this.field1450 = -1936897965;
      this.field1448 = 1239814673;
      this.field1449 = 627296855;
      this.field1443 = 982254409;
      this.field1451 = 1508127879;
      this.field1452 = -245610447;
      this.field1453 = 367560861;
      this.field1446 = -202285279;
      this.field1455 = -1186961409;
      this.field1456 = -1823934115;
      this.overheadText = null;
      this.method3285(-1);
      this.field1458 = false;
      this.field1459 = 91279092;
      this.field1460 = 0;
      this.field1481 = 0;
      this.field1438 = null;
      this.field1463 = new classBZ();
      this.field1464 = new classQR();
      this.field1465 = new classQR();
      this.field1466 = new classQR();
      this.field1467 = 0;
      this.field1468 = false;
      this.field1469 = new IterableNodeHashTable(4);
      this.field1447 = 0;
      this.field1470 = -66651896;
      this.field1471 = 0;
      this.field1472 = -853380256;
      this.field1473 = 0;
      this.field1474 = new int[10];
      this.field1433 = new int[10];
      this.field1476 = new classGT[10];
      this.field1454 = 0;
      this.field1478 = 0;
      this.field1479 = -2128850993;
      this.field1480 = 216854347 * var1;
      this.method3273();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ff")
   void method3099() {
      classQR.method9720(this.field1465, -540836926);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fe")
   void method3100() {
      classQR.method9720(this.field1465, -471869728);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;IIIII)V")
   @ObfuscatedName("ue")
   public static void method3124(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.vmethod103();
      }

      if (var1 >= 0 && var5 > 0) {
         boolean var6 = var0.field1434.size() >= var5;
         int var7 = 0;

         for (int var8 = 0; var8 < var0.field1434.size(); var8++) {
            classDV var9 = (classDV)var0.field1434.get(var8);
            if (var9.method3619(-2046283961) > var3) {
               var7 = (var8 + 1) % var5;
            } else {
               var6 = false;
            }
         }

         classPW var14 = classDJ.method3373(var1, (byte)33);
         if (null != var14.field5455) {
            var14 = classPW.method9331(var14, (byte)30);
            if (var14 == null) {
               return;
            }
         }

         int var15 = var14.field5460 * 874549795;
         int var10 = -1;
         if (var6) {
            if (-1 == var15) {
               return;
            }

            int var11 = 0;

            for (int var12 = 0; var12 < var0.field1434.size(); var12++) {
               classDV var13 = (classDV)var0.field1434.get(var12);
               if (0 == var15) {
                  if (var12 == 0 || var13.method3619(1611644735) < var11) {
                     var10 = var12;
                     var11 = var13.method3619(2032676317);
                  }
               } else if (1 == var15 && (var12 == 0 || var13.method3622((short)-13649) < var11)) {
                  var10 = var12;
                  var11 = var13.method3622((short)-20459);
               }
            }

            if (var15 == 1 && var11 >= var2) {
               return;
            }
         } else {
            if (var5 > 4) {
               var7 = 0;
            }

            for (int var16 = 0; var16 < var5; var16++) {
               int var18 = var7;
               var7 = (var7 + 1) % var5;
               if (var18 >= var0.field1434.size()) {
                  var0.field1434.add(new classDV());
                  var10 = var0.field1434.size() - 1;
                  break;
               }

               classDV var19 = (classDV)var0.field1434.get(var18);
               if (var19.method3619(313030306) <= var3) {
                  var10 = var18;
                  break;
               }
            }
         }

         if (var10 >= 0) {
            classDV var17 = (classDV)var0.field1434.get(var10);
            var17.method3611(var1, var2, var14.field5448 * -1580853435 + var3 + var4, (byte)16);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ku")
   int method3255() {
      return 2030011479 * this.field1463.field630;
   }

   @ObfuscatedSignature(descriptor = "(Lqr;)Lqr;")
   @ObfuscatedName("ie")
   classQR method3178(classQR var1) {
      if (this.field1468) {
         return this.field1502 == null
               || !this.field1502.method9726(374233424)
               || !this.field1502.method9731((byte)95).method8785((byte)14)
               || this.field1502.method9734(500216846) == 1457308725 * this.field1436 && var1 != null
            ? null
            : this.field1502;
      } else {
         return !this.field1464.method9726(374233424)
               || !this.field1464.method9731((byte)14).method8785((byte)120)
               || this.method3083(-1524557566) == 1457308725 * this.field1436 && var1 != null
            ? null
            : this.field1464;
      }
   }

   public int getRunAnimation() {
      return this.field1449 * -1549975911;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fa")
   boolean method3104() {
      return this.field1465.method9726(374233424) && 0 == -211489501 * this.field1467;
   }

   public void setWalkRotateRight(int var1) {
      this.field1448 = var1 * -1239814673;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;II)V")
   @ObfuscatedName("kl")
   public static void method3114(Actor var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3206(var1);
      }

      var0.field1473 = 0;
      var0.field1478 = 0;
      var0.field1454 = 0;
      var0.field1474[0] = var1;
      var0.field1433[0] = var2;
      var0.field1487 = var0.field1474[0] * 2050486912 + var0.field1441 * 1793023936;
      var0.field1489 = var0.field1441 * 790570944 + var0.field1433[0] * 36971136;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gq")
   void method3108() {
      this.field1463.field623 = classLJ.field4174;
      this.field1463.field632 = -1789345463;
      this.field1463.field628 = 1917232306;
      this.field1463.field631 = 366774729;
      this.field1475 = false;
      method3160(this, 1197226635);
   }

   public void setGraphic(int var1) {
      this.method3294().method13602();
      this.field1447 = 0 * 509600791;
      if (var1 > -1) {
         ActorSpotAnim var2 = new ActorSpotAnim(var1, 0, 0, this, false);
         this.method3294().method13597(var2, 0L);
         this.field1447 = (this.field1447 * 49255335 + 1) * 509600791;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILgt;)V")
   @ObfuscatedName("gv")
   void method3109(int var1, int var2, classGT var3) {
      if (this.field1473 * -1798356091 < 9) {
         this.field1473 += -2014692019;
      }

      for (int var4 = this.field1473 * -1798356091; var4 > 0; var4--) {
         this.field1474[var4] = this.field1474[var4 - 1];
         this.field1433[var4] = this.field1433[var4 - 1];
         this.field1476[var4] = this.field1476[var4 - 1];
      }

      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1476[0] = var3;
   }

   @ObfuscatedSignature(descriptor = "()Lyn;")
   @ObfuscatedName("op")
   public IterableNodeHashTable method3294() {
      return this.field1469;
   }

   @ObfuscatedSignature(descriptor = "(IILgt;)V")
   @ObfuscatedName("gk")
   void method3110(int var1, int var2, classGT var3) {
      if (this.field1473 * -1798356091 < 9) {
         this.field1473 += -2014692019;
      }

      for (int var4 = this.field1473 * -1798356091; var4 > 0; var4--) {
         this.field1474[var4] = this.field1474[var4 - 1];
         this.field1433[var4] = this.field1433[var4 - 1];
         this.field1476[var4] = this.field1476[var4 - 1];
      }

      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1476[0] = var3;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fb")
   void method3115(int var1, int var2) {
      this.field1473 = 0;
      this.field1478 = 0;
      this.field1454 = 0;
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1487 = this.field1474[0] * 2050486912 + this.field1441 * 1793023936;
      this.field1489 = this.field1441 * 790570944 + this.field1433[0] * -2041824135;
   }

   @ObfuscatedSignature(descriptor = "(I)Llj;")
   @ObfuscatedName("ep")
   classLJ method3235(int var1) {
      try {
         return this.field1463.field623;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ep(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gw")
   final void method3118() {
      this.field1473 = 0;
      this.field1478 = 0;
   }

   public int getFootprintSize() {
      return this.vmethod267(-1423776655);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gc")
   final void method3119() {
      this.field1473 = 0;
      this.field1478 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("do")
   final void method3132(int var1, int var2) {
      try {
         HealthBarDefinition var3 = classDS.method3535(var1, 2082054101);

         for (classCO var4 = (classCO)this.field1442.method8167(); null != var4; var4 = (classCO)classAAX.method294(this.field1442)) {
            if (var2 == 734225654) {
               throw new IllegalStateException();
            }

            if (var4.field1177 == var3) {
               if (var2 == 734225654) {
                  throw new IllegalStateException();
               }

               var4.vmethod398();
               return;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dh.do(" + ')');
      }
   }

   public int getOverheadCycle() {
      return this.field1459 * 317527437;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gg")
   final void method3120() {
      this.field1473 = 0;
      this.field1478 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;ILxs;B)V")
   @ObfuscatedName("ma")
   public static void method3219(Actor var0, int var1, PacketBuffer var2, byte var3) {
      if (var0 == null) {
         var0.method3222(var1, var2, var3);
      } else {
         var0.method3278(var1, var2);

         try {
            var0.field1463.method1382(var1, var2, (byte)2);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "dh.ez(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   int vmethod269() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ea")
   @Override
   public int vmethod371(int var1) {
      try {
         return this.field1489 * -1272026483;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ea(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gy")
   final void method3125(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= 0 && var5 > 0) {
         boolean var6 = this.field1434.size() >= var5;
         int var7 = 0;

         for (int var8 = 0; var8 < this.field1434.size(); var8++) {
            classDV var9 = (classDV)this.field1434.get(var8);
            if (var9.method3619(1077549418) > var3) {
               var7 = (var8 + 1) % var5;
            } else {
               var6 = false;
            }
         }

         classPW var14 = classDJ.method3373(var1, (byte)9);
         if (null != var14.field5455) {
            var14 = classPW.method9331(var14, (byte)-23);
            if (var14 == null) {
               return;
            }
         }

         int var15 = var14.field5460 * 874549795;
         int var10 = -1;
         if (var6) {
            if (-1 == var15) {
               return;
            }

            int var11 = 0;

            for (int var12 = 0; var12 < this.field1434.size(); var12++) {
               classDV var13 = (classDV)this.field1434.get(var12);
               if (0 == var15) {
                  if (var12 == 0 || var13.method3619(-774385643) < var11) {
                     var10 = var12;
                     var11 = var13.method3619(1191330495);
                  }
               } else if (1 == var15 && (var12 == 0 || var13.method3622((short)-4773) < var11)) {
                  var10 = var12;
                  var11 = var13.method3622((short)-24591);
               }
            }

            if (var15 == 1 && var11 >= var2) {
               return;
            }
         } else {
            if (var5 > 4) {
               var7 = 0;
            }

            for (int var16 = 0; var16 < var5; var16++) {
               int var18 = var7;
               var7 = (var7 + 1) % var5;
               if (var18 >= this.field1434.size()) {
                  this.field1434.add(new classDV());
                  var10 = this.field1434.size() - 1;
                  break;
               }

               classDV var19 = (classDV)this.field1434.get(var18);
               if (var19.method3619(-1837315346) <= var3) {
                  var10 = var18;
                  break;
               }
            }
         }

         if (var10 >= 0) {
            classDV var17 = (classDV)this.field1434.get(var10);
            var17.method3611(var1, var2, var14.field5448 * 1721681309 + var3 + var4, (byte)16);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gs")
   final void method3129(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = classDS.method3535(var1, 1912691981);
      classCO var8 = null;
      classCO var9 = null;
      int var10 = var7.field5482 * 918203003;
      int var11 = 0;

      for (classCO var12 = (classCO)this.field1442.method8167(); var12 != null; var12 = (classCO)classAAX.method294(this.field1442)) {
         var11++;
         if (397419339 * var7.field5484 == var12.field1177.field5484 * 397419339) {
            var12.method2559(var4 + var2, var5, var6, var3, (byte)122);
            return;
         }

         if (-2066916177 * var12.field1177.field5481 <= -2066916177 * var7.field5481) {
            var8 = var12;
         }

         if (var12.field1177.field5482 * 918203003 > var10) {
            var9 = var12;
            var10 = 918203003 * var12.field1177.field5482;
         }
      }

      if (var9 != null || var11 < 4) {
         classCO var13 = new classCO(var7);
         if (var8 == null) {
            this.field1442.method8159(var13);
         } else {
            IterableNodeDeque.method8150(var13, var8);
         }

         var13.method2559(var2 + var4, var5, var6, var3, (byte)37);
         if (var11 >= 4) {
            var9.vmethod398();
         }
      }
   }

   public WorldArea getWorldArea() {
      int var1 = 1;
      if (this instanceof net.runelite.api.NPC) {
         NPCComposition var2 = ((net.runelite.api.NPC)this).getComposition();
         if (var2 != null && var2.getConfigs() != null) {
            var2 = var2.transform();
         }

         if (var2 != null) {
            var1 = var2.getSize();
         }
      }

      return new WorldArea(this.getWorldLocation(), var1, var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jk")
   public void method3273() {
      this.field1465.field5606 = this;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cx")
   public abstract classFL vmethod270();

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("ge")
   void method3133(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var4 + client.field855 * 1612595797;
      ActorSpotAnim var7 = (ActorSpotAnim)this.field1469.method13595(var1);
      if (var7 != null) {
         var7.vmethod398();
         this.field1447 -= 509600791;
      }

      if (65535 != var2 && var2 != -1) {
         IterableNodeHashTable.method13576(this.field1469, new ActorSpotAnim(var2, var3, var6, this, var5), var1);
         this.field1447 += 509600791;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbz;I)V")
   @ObfuscatedName("em")
   void method3215(classBZ var1, int var2) {
      this.method3279(var1);

      try {
         this.field1463.method1378(var1, -719057673);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.em(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kj")
   int method3256() {
      return 2030011479 * this.field1463.field630;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("it")
   boolean vmethod378() {
      return false;
   }

   public int getAnimation() {
      return this.field1465.field5598 * 1684838611;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hk")
   boolean method3154() {
      return classLU.field4226 == this.field1463.field624 && this.field1463.field628 * -1098050121 != -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hm")
   void method3140() {
      classYA var1 = new classYA(this.field1469);

      for (ActorSpotAnim var2 = (ActorSpotAnim)rl3.method10079(var1); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.vmethod398();
      }

      this.field1447 = 0;
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(classOE.field4843, this.getLocalLocation());
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hp")
   boolean method3144() {
      classQR var1 = this.method3175(-873126190);
      if (var1 != null && var1.method9726(374233424) && var1.method9731((byte)112).method8749(var1.method9738(1758938926), 1284412146)) {
         return true;
      } else {
         classQR var2 = this.method3177(var1, 519157121);
         return var2 != null && var2.method9726(374233424) && var2.method9731((byte)118).method8749(var2.method9738(1834435286), 1284412146)
            ? true
            : var1 == null
               && var2 == null
               && this.field1466.method9726(374233424)
               && this.field1466.method9731((byte)55).method8749(this.field1466.method9738(2143154787), 1284412146);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hg")
   boolean method3147() {
      return this.field1463.field624 == classLU.field4228 && this.field1463.field627 * 1373839855 != -1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ia")
   int method3193() {
      int var1 = -1;
      int var2 = this.method3195(1134936393);
      if (-1 == var2) {
         var1 = -1657575887 * this.field1445;
      } else {
         int var3 = var2 - 1457033841 * this.field1488 & 2047;
         if (var3 > 1024) {
            var3 -= 2048;
         }

         var1 = this.field1462 * -412780869;
         if (var3 >= -256 && var3 <= 256) {
            var1 = -1657575887 * this.field1445;
         } else if (var3 >= 256 && var3 < 768) {
            var1 = this.field1448 * -144383729;
         } else if (var3 >= -768 && var3 <= -256) {
            var1 = this.field1450 * 1347929125;
         }
      }

      if (var1 == -1) {
         var1 = -1657575887 * this.field1445;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ta")
   public void method3272(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 == 0) {
         if (this.field1504) {
            return;
         }

         if (!field1482.contains(var1)) {
            return;
         }

         this.field1504 = true;
         if (this == classOE.field4843.method2221()) {
            client.field1026.debug("You died!");
         }

         ActorDeath var7 = new ActorDeath(this);
         classOE.field4843.getCallbacks().post(var7);
      } else if (var5 > 0) {
         if (this instanceof NPC && ((NPC)this).getId() == 319 && this.field1504) {
            return;
         }

         this.field1504 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("yj")
   public static void method3271(WorldView var0, Actor var1, int var2) {
      field1499 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hf")
   boolean method3152() {
      return this.field1463.field624 == classLU.field4225 && classLJ.field4174 != this.field1463.field623 && -1 != 893538615 * this.field1463.field632;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("qw")
   public int[] method3295() {
      return this.field1474;
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("rx")
   public void method3278(int var1, PacketBuffer var2) {
      this.field1484 = (byte)(this.field1484 | 1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   boolean vmethod263() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hr")
   boolean method3155() {
      return classLU.field4226 == this.field1463.field624 && this.field1463.field628 * -1098050121 != -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ha")
   boolean method3156() {
      return classLU.field4226 == this.field1463.field624 && this.field1463.field628 * 1880216081 != -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hu")
   void method3158() {
      this.field1463.field622 = false;
      this.field1463.field627 = 689558257;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hj")
   void method3159() {
      this.field1463.field622 = false;
      this.field1463.field627 = 1505897860;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dv")
   final void method3130(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method3272(var1, var2, var3, var4, var5, var6);

      try {
         HealthBarDefinition var8 = classDS.method3535(var1, 2020516296);
         classCO var9 = null;
         classCO var10 = null;
         int var11 = var8.field5482 * 918203003;
         int var12 = 0;

         for (classCO var13 = (classCO)this.field1442.method8167(); var13 != null; var13 = (classCO)classAAX.method294(this.field1442)) {
            if (var7 != 1874940363) {
               return;
            }

            var12++;
            if (397419339 * var8.field5484 == var13.field1177.field5484 * 397419339) {
               if (var7 != 1874940363) {
                  return;
               }

               var13.method2559(var4 + var2, var5, var6, var3, (byte)84);
               return;
            }

            if (-2066916177 * var13.field1177.field5481 <= -2066916177 * var8.field5481) {
               var9 = var13;
            }

            if (var13.field1177.field5482 * 918203003 > var11) {
               if (var7 != 1874940363) {
                  return;
               }

               var10 = var13;
               var11 = 918203003 * var13.field1177.field5482;
            }
         }

         if (var10 == null) {
            if (var7 != 1874940363) {
               throw new IllegalStateException();
            }

            if (var12 >= 4) {
               if (var7 != 1874940363) {
                  return;
               }

               return;
            }
         }

         classCO var15 = new classCO(var8);
         if (var9 == null) {
            if (var7 != 1874940363) {
               return;
            }

            this.field1442.method8159(var15);
         } else {
            IterableNodeDeque.method8150(var15, var9);
         }

         var15.method2559(var2 + var4, var5, var6, var3, (byte)41);
         if (var12 >= 4) {
            if (var7 != 1874940363) {
               throw new IllegalStateException();
            }

            var10.vmethod398();
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "dh.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)Lky;")
   @ObfuscatedName("he")
   classKY method3163(WorldView var1) {
      if (var1 == classIS.field3053) {
         return new classKY(this.vmethod258((byte)-103), this.vmethod368(311606126), this.vmethod371(62069074));
      } else {
         WorldEntity var2 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var1.field1699);
         if (var2 == null) {
            return new classKY(this.vmethod258((byte)-23), this.vmethod368(311606126), this.vmethod371(-947374844));
         } else {
            int var3 = var2.vmethod368(311606126);
            int var4 = var2.vmethod371(-2078577411);
            int var5 = var2.vmethod258((byte)-42);
            int var6 = this.vmethod368(311606126) - var2.method10589(1516494753);
            int var7 = this.vmethod371(8586893) - var2.method10590(-1634081826);
            double var8 = -var2.method10561(-24025013) * Math.PI / 1024.0;
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            int var14 = var3 + (int)(var6 * var10 - var7 * var12);
            int var15 = var4 + (int)(var10 * var7 + var6 * var12);
            return new classKY(var5, var14, var15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)Lky;")
   @ObfuscatedName("hy")
   classKY method3164(WorldView var1) {
      if (var1 == classIS.field3053) {
         return new classKY(this.vmethod258((byte)-37), this.vmethod368(311606126), this.vmethod371(-1396096594));
      } else {
         WorldEntity var2 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var1.field1699);
         if (var2 == null) {
            return new classKY(this.vmethod258((byte)-93), this.vmethod368(311606126), this.vmethod371(174156971));
         } else {
            int var3 = var2.vmethod368(311606126);
            int var4 = var2.vmethod371(-121081850);
            int var5 = var2.vmethod258((byte)-101);
            int var6 = this.vmethod368(311606126) - var2.method10589(-574423348);
            int var7 = this.vmethod371(-2136855698) - var2.method10590(-977549490);
            double var8 = -var2.method10561(-1382329867) * Math.PI / 1024.0;
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            int var14 = var3 + (int)(var6 * var10 - var7 * var12);
            int var15 = var4 + (int)(var10 * var7 + var6 * var12);
            return new classKY(var5, var14, var15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hh")
   int vmethod374() {
      return -607711375 * this.field1470 + this.vmethod98(-677025270);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hv")
   int vmethod375() {
      return -1576740359 * this.field1470 + this.vmethod98(-1156897916);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hc")
   int vmethod376() {
      return -1475188690 * this.field1470 + this.vmethod98(-429535308);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hn")
   boolean method3171() {
      return this.field1498 * -1055069695 >= client.field855 * 813887586;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hs")
   boolean method3172() {
      return this.field1498 * 1626900634 >= client.field855 * 1474219072;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ir")
   boolean method3173() {
      return this.field1498 * -1357945002 >= client.field855 * 121559722;
   }

   @ObfuscatedSignature(descriptor = "()Lqr;")
   @ObfuscatedName("is")
   classQR method3176() {
      if (this.field1468) {
         return null != this.field1501 && this.field1501.method9726(374233424) && this.field1501.method9731((byte)76).method8785((byte)-10)
            ? this.field1501
            : null;
      } else {
         return -211489501 * this.field1467 == 0 && this.field1465.method9726(374233424) && this.field1465.method9731((byte)73).method8785((byte)-8)
            ? this.field1465
            : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqr;)Lqr;")
   @ObfuscatedName("ix")
   classQR method3179(classQR var1) {
      if (this.field1468) {
         return this.field1502 != null
               && this.field1502.method9726(374233424)
               && this.field1502.method9731((byte)72).method8785((byte)-16)
               && (this.field1502.method9734(500216846) != 1457308725 * this.field1436 || var1 == null)
            ? this.field1502
            : null;
      } else {
         return !this.field1464.method9726(374233424)
               || !this.field1464.method9731((byte)58).method8785((byte)29)
               || this.method3083(-844479644) == 1457308725 * this.field1436 && var1 != null
            ? null
            : this.field1464;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("nl")
   public static boolean method3208(Actor var0) {
      if (var0 == null) {
         var0.vmethod376();
      }

      return var0.method3223(1536677490) == classLV.field4235 || 0 == -562200759 * var0.field1473 || -1504181150 * var0.field1454 > 0;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;I)V")
   @ObfuscatedName("io")
   public static void method3160(Actor var0, int var1) {
      if (var0 == null) {
         var0.method3161(var1);
      }

      try {
         var0.field1463.field622 = false;
         var0.field1463.field627 = 689558257;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dp(" + ')');
      }
   }

   public void setWalkRotate180(int var1) {
      this.field1462 = var1 * 164191859;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hx")
   boolean method3148() {
      return this.field1463.field624 == classLU.field4228 && this.field1463.field627 * 1373839855 != -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("il")
   boolean vmethod379() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ig")
   boolean vmethod380() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ih")
   boolean vmethod381() {
      return false;
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = this.method3284();
      return WorldPoint.fromLocal(var1, this.method3295()[0] * 128 + 64, this.method3292()[0] * 128 + 64, var1.field1710 * -483624883);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("in")
   boolean method3181() {
      return this.field1435.method4840()
         && 1612595797 * client.field855 >= this.field1437 * -1286360919
         && client.field855 * 1612595797 < this.field1432 * -1575657275;
   }

   @ObfuscatedSignature(descriptor = "(IIBBBB)V")
   @ObfuscatedName("ij")
   void method3184(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      this.field1437 = var1 * 1760680083;
      this.field1432 = -1323461812 * var2;
      classFL.method4832(this.field1435, var3, var4, var5, var6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("jp")
   public static boolean method3174(Actor var0) {
      return var0.field1498 * -1055069695 >= client.field855 * 1612595797;
   }

   @ObfuscatedSignature(descriptor = "(IIBBBB)V")
   @ObfuscatedName("iz")
   void method3185(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      this.field1437 = var1 * -271322215;
      this.field1432 = -1468588531 * var2;
      classFL.method4832(this.field1435, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ft")
   int method3098() {
      return this.field1465.method9734(500216846);
   }

   public int getHealthRatio() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         classCO var1 = (classCO)this.method3300().method8223();
         if (var1 != null) {
            classCV var2 = var1.method2569(classOE.field4843.getGameCycle());
            if (var2 != null) {
               return var2.method2686();
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hq")
   @Override
   public int vmethod369() {
      return -1547553299 * this.field1487;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ip")
   boolean method3202() {
      if (this.method3102(-1995590748)) {
         SequenceDefinition var1 = this.field1465.method9731((byte)61);
         if (this.field1478 * -1547072286 > 0 && 0 == -702237139 * var1.field5131) {
            return true;
         }

         if (642137221 * this.field1478 <= 0 && 0 == -104359770 * var1.field5119) {
            return true;
         }
      }

      return false;
   }

   public int getSpotAnimFrame() {
      Iterator var1 = this.method3294().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getFrame();
      } else {
         return 0;
      }
   }

   public IterableHashTable getSpotAnims() {
      return this.method3294();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Llj;")
   @ObfuscatedName("dy")
   public static classLJ method3236(Actor var0) {
      if (var0 == null) {
         var0.method3238();
      }

      return var0.field1463.field623;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.field1487 * -1547553299, this.field1489 * -1272026483, this.field1439 * -1105444433);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dt")
   void method3096(int var1) {
      try {
         this.field1501 = null;
         this.field1502 = null;
         if (null != this.field1500) {
            if (var1 <= 2127104795) {
               throw new IllegalStateException();
            }

            this.field1500.clear();
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iv")
   int method3194() {
      int var1 = -1;
      int var2 = this.method3195(277988498);
      if (-1 == var2) {
         var1 = -579284050 * this.field1445;
      } else {
         int var3 = var2 - 1624578120 * this.field1488 & 2047;
         if (var3 > 1024) {
            var3 -= 2048;
         }

         var1 = this.field1462 * -412780869;
         if (var3 >= -1572723984 && var3 <= 1882655320) {
            var1 = -1657575887 * this.field1445;
         } else if (var3 >= 256 && var3 < -1656656989) {
            var1 = this.field1448 * -144383729;
         } else if (var3 >= -768 && var3 <= 2128448370) {
            var1 = this.field1450 * 1827450544;
         }
      }

      if (var1 == -1) {
         var1 = -1657575887 * this.field1445;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hi")
   void method3141() {
      classYA var1 = new classYA(this.field1469);

      for (ActorSpotAnim var2 = (ActorSpotAnim)rl3.method10079(var1); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.vmethod398();
      }

      this.field1447 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iy")
   int method3196() {
      int var1 = 128 * this.field1474[-1798356091 * this.field1473 - 1] + this.field1441 * -14785344;
      int var2 = this.field1433[this.field1473 * -1798356091 - 1] * 128 + this.field1441 * -14785344;
      if (this.field1487 * -1547553299 < var1) {
         if (-1272026483 * this.field1489 < var2) {
            return 1280;
         } else {
            return this.field1489 * -1272026483 > var2 ? 1792 : 1536;
         }
      } else if (-1547553299 * this.field1487 > var1) {
         if (this.field1489 * -1272026483 < var2) {
            return 768;
         } else {
            return this.field1489 * -1272026483 > var2 ? 256 : 512;
         }
      } else if (this.field1489 * -1272026483 < var2) {
         return 1024;
      } else {
         return this.field1489 * -1272026483 > var2 ? 0 : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mg")
   public void method3296() {
      method3160(this, -983329598);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ik")
   int method3197() {
      int var1 = 128 * this.field1474[-1798356091 * this.field1473 - 1] + this.field1441 * -14785344;
      int var2 = this.field1433[this.field1473 * -1798356091 - 1] * 128 + this.field1441 * -14785344;
      if (this.field1487 * -1547553299 < var1) {
         if (-1272026483 * this.field1489 < var2) {
            return 1280;
         } else {
            return this.field1489 * -1272026483 > var2 ? 1792 : 1536;
         }
      } else if (-1547553299 * this.field1487 > var1) {
         if (this.field1489 * -1272026483 < var2) {
            return 768;
         } else {
            return this.field1489 * -1272026483 > var2 ? 256 : 512;
         }
      } else if (this.field1489 * -1272026483 < var2) {
         return 1024;
      } else {
         return this.field1489 * -1272026483 > var2 ? 0 : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("dn")
   final void method3126(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method3270(var1, var2, var3, var4, var5);

      try {
         if (var1 >= 0) {
            if (var6 <= 471596656) {
               throw new IllegalStateException();
            }

            if (var5 > 0) {
               boolean var7 = this.field1434.size() >= var5;
               int var8 = 0;

               for (int var9 = 0; var9 < this.field1434.size(); var9++) {
                  if (var6 <= 471596656) {
                     this.method3283(var1, var2, var3, var4, var5);
                     return;
                  }

                  classDV var10 = (classDV)this.field1434.get(var9);
                  if (var10.method3619(478683830) > var3) {
                     if (var6 <= 471596656) {
                        throw new IllegalStateException();
                     }

                     var8 = (var9 + 1) % var5;
                  } else {
                     var7 = false;
                  }
               }

               classPW var16 = classDJ.method3373(var1, (byte)78);
               if (null != var16.field5455) {
                  if (var6 <= 471596656) {
                     this.method3283(var1, var2, var3, var4, var5);
                     return;
                  }

                  var16 = classPW.method9331(var16, (byte)43);
                  if (var16 == null) {
                     this.method3283(var1, var2, var3, var4, var5);
                     return;
                  }
               }

               int var17 = var16.field5460 * 874549795;
               int var11 = -1;
               if (var7) {
                  if (var6 <= 471596656) {
                     throw new IllegalStateException();
                  }

                  if (-1 == var17) {
                     this.method3283(var1, var2, var3, var4, var5);
                     return;
                  }

                  int var12 = 0;

                  for (int var13 = 0; var13 < this.field1434.size(); var13++) {
                     classDV var14 = (classDV)this.field1434.get(var13);
                     if (0 == var17) {
                        if (var6 <= 471596656) {
                           throw new IllegalStateException();
                        }

                        if (var13 != 0) {
                           if (var14.method3619(-1451184888) >= var12) {
                              continue;
                           }

                           if (var6 <= 471596656) {
                              throw new IllegalStateException();
                           }
                        }

                        var11 = var13;
                        var12 = var14.method3619(-572067219);
                     } else if (1 == var17) {
                        if (var6 <= 471596656) {
                           this.method3283(var1, var2, var3, var4, var5);
                           return;
                        }

                        if (var13 != 0) {
                           if (var14.method3622((short)2278) >= var12) {
                              continue;
                           }

                           if (var6 <= 471596656) {
                              throw new IllegalStateException();
                           }
                        }

                        var11 = var13;
                        var12 = var14.method3622((short)-12603);
                     }
                  }

                  if (var17 == 1 && var12 >= var2) {
                     if (var6 <= 471596656) {
                        this.method3283(var1, var2, var3, var4, var5);
                        return;
                     }

                     this.method3283(var1, var2, var3, var4, var5);
                     return;
                  }
               } else {
                  if (var5 > 4) {
                     if (var6 <= 471596656) {
                        throw new IllegalStateException();
                     }

                     var8 = 0;
                  }

                  for (int var18 = 0; var18 < var5; var18++) {
                     if (var6 <= 471596656) {
                        this.method3283(var1, var2, var3, var4, var5);
                        return;
                     }

                     int var20 = var8;
                     var8 = (var8 + 1) % var5;
                     if (var20 >= this.field1434.size()) {
                        if (var6 <= 471596656) {
                           this.method3283(var1, var2, var3, var4, var5);
                           return;
                        }

                        this.field1434.add(new classDV());
                        var11 = this.field1434.size() - 1;
                        break;
                     }

                     classDV var21 = (classDV)this.field1434.get(var20);
                     if (var21.method3619(83933298) <= var3) {
                        if (var6 <= 471596656) {
                           throw new IllegalStateException();
                        }

                        var11 = var20;
                        break;
                     }
                  }
               }

               if (var11 < 0) {
                  if (var6 <= 471596656) {
                     throw new IllegalStateException();
                  }

                  this.method3283(var1, var2, var3, var4, var5);
                  return;
               }

               classDV var19 = (classDV)this.field1434.get(var11);
               var19.method3611(var1, var2, var16.field5448 * -265436849 + var3 + var4, (byte)16);
               this.method3283(var1, var2, var3, var4, var5);
               return;
            }
         }

         this.method3283(var1, var2, var3, var4, var5);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "dh.dn(" + ')');
      }
   }

   public void setWalkRotateLeft(int var1) {
      this.field1450 = var1 * 1936897965;
   }

   public int getOrientation() {
      return this.field1496 * 677773095;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("id")
   boolean method3205() {
      return this.method3223(1536677490) == classLV.field4234 && !this.method3200(-1174896200);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Llv;")
   @ObfuscatedName("xc")
   public static classLV method3224(Actor var0) {
      return var0.field1463.field625;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hl")
   boolean method3145() {
      classQR var1 = this.method3175(439880158);
      if (var1 != null && var1.method9726(374233424) && var1.method9731((byte)12).method8749(var1.method9738(1738380288), 1284412146)) {
         return true;
      } else {
         classQR var2 = this.method3177(var1, -1806884887);
         return var2 != null && var2.method9726(374233424) && var2.method9731((byte)14).method8749(var2.method9738(2102837982), 1284412146)
            ? true
            : var1 == null
               && var2 == null
               && this.field1466.method9726(374233424)
               && this.field1466.method9731((byte)49).method8749(this.field1466.method9738(1829465469), 1284412146);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("go")
   void method3116(int var1, int var2) {
      this.field1473 = 0;
      this.field1478 = 0;
      this.field1454 = 0;
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1487 = this.field1474[0] * 2050486912 + this.field1441 * 1793023936;
      this.field1489 = this.field1441 * 790570944 + this.field1433[0] * 36971136;
   }

   @ObfuscatedSignature(descriptor = "(Ldh;IILgt;I)V")
   @ObfuscatedName("uy")
   public static void method3111(Actor var0, int var1, int var2, classGT var3, int var4) {
      if (var0 == null) {
         var0.method3112(var1, var1, var3, var1);
      } else {
         try {
            if (var0.field1473 * -1798356091 < 9) {
               if (var4 == -2075447184) {
                  return;
               }

               var0.field1473 += -2014692019;
            }

            for (int var5 = var0.field1473 * -1798356091; var5 > 0; var5--) {
               if (var4 == -2075447184) {
                  throw new IllegalStateException();
               }

               var0.field1474[var5] = var0.field1474[var5 - 1];
               var0.field1433[var5] = var0.field1433[var5 - 1];
               var0.field1476[var5] = var0.field1476[var5 - 1];
            }

            var0.field1474[0] = var1;
            var0.field1433[0] = var2;
            var0.field1476[0] = var3;
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "dh.dh(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("db")
   boolean method3146(int var1) {
      try {
         classQR var2 = this.method3175(622034409);
         if (var2 != null && var2.method9726(374233424)) {
            if (var1 >= -322689719) {
               throw new IllegalStateException();
            }

            if (var2.method9731((byte)72).method8749(var2.method9738(1802932656), 1284412146)) {
               if (var1 >= -322689719) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         classQR var3 = this.method3177(var2, 1988230289);
         if (var3 != null && var3.method9726(374233424)) {
            if (var1 >= -322689719) {
               throw new IllegalStateException();
            }

            if (var3.method9731((byte)102).method8749(var3.method9738(2136879231), 1284412146)) {
               if (var1 >= -322689719) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var2 == null) {
            if (var1 >= -322689719) {
               throw new IllegalStateException();
            }

            if (var3 == null) {
               if (var1 >= -322689719) {
                  throw new IllegalStateException();
               }

               if (this.field1466.method9726(374233424)) {
                  if (var1 >= -322689719) {
                     throw new IllegalStateException();
                  }

                  if (this.field1466.method9731((byte)63).method8749(this.field1466.method9738(1835353605), 1284412146)) {
                     if (var1 >= -322689719) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.df(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldh;IIIIZB)V")
   @ObfuscatedName("fy")
   public static void method3134(Actor var0, int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      if (var0 == null) {
         var0.method3136(var1, var1, var1, var1, var5, var6);
      } else {
         try {
            int var7 = var4 + client.field855 * 1612595797;
            ActorSpotAnim var8 = (ActorSpotAnim)var0.field1469.method13595(var1);
            if (var8 != null) {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               var8.vmethod398();
               var0.field1447 -= 509600791;
            }

            if (65535 != var2) {
               if (var6 == 0) {
                  var0.method3280(var1, var2, var3, var4, var5);
                  return;
               }

               if (var2 != -1) {
                  IterableNodeHashTable.method13576(var0.field1469, new ActorSpotAnim(var2, var3, var7, var0, var5), var1);
                  var0.field1447 += 509600791;
                  var0.method3280(var1, var2, var3, var4, var5);
                  return;
               }
            }

            var0.method3280(var1, var2, var3, var4, var5);
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "dh.dg(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   @Override
   public int vmethod372() {
      return this.field1489 * -1272026483;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jf")
   public void method3165() {
      if ((this.field1484 & 1) != 0) {
         classOE.field4843.getCallbacks().post(new InteractingChanged(this, this.getInteracting()));
      }

      if ((this.field1484 & 2) != 0) {
         AnimationChanged var1 = new AnimationChanged();
         var1.setActor(this);
         classOE.field4843.getCallbacks().post(var1);
      }

      this.field1484 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IILfl;)V")
   @ObfuscatedName("if")
   void method3186(int var1, int var2, classFL var3) {
      this.field1437 = var1 * -271322215;
      this.field1432 = var2 * -1468588531;
      classFL.method4827(this.field1435, var3);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jf")
   boolean method3210() {
      return this.method3223(1536677490) == classLV.field4235 || 0 == -1798356091 * this.field1473;
   }

   @ObfuscatedSignature(descriptor = "(IILfl;)V")
   @ObfuscatedName("iw")
   void method3187(int var1, int var2, classFL var3) {
      this.field1437 = var1 * -271322215;
      this.field1432 = var2 * -1468588531;
      classFL.method4827(this.field1435, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("jn")
   void method3216(classBZ var1) {
      this.field1463.method1378(var1, -1869046405);
   }

   public void clearSpotAnims() {
      this.method3294().method13602();
      this.field1447 = 0 * 509600791;
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("js")
   void method3217(classBZ var1) {
      this.field1463.method1378(var1, -1456645010);
   }

   public void setOverheadCycle(int var1) {
      this.field1459 = var1 * -84986555;
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("jc")
   void method3218(classBZ var1) {
      this.field1463.method1378(var1, -1988370989);
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("jj")
   void method3220(int var1, PacketBuffer var2) {
      this.field1463.method1382(var1, var2, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("jt")
   void method3221(int var1, PacketBuffer var2) {
      this.field1463.method1382(var1, var2, (byte)2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("gu")
   public static int method3198(Actor var0) {
      int var1 = 128 * var0.field1474[-1798356091 * var0.field1473 - 1] + var0.field1441 * 112850596;
      int var2 = var0.field1433[var0.field1473 * -1798356091 - 1] * 128 + var0.field1441 * -102015458;
      if (var0.field1487 * -1214576333 < var1) {
         if (-1272026483 * var0.field1489 < var2) {
            return 1435000885;
         } else {
            return var0.field1489 * -1272026483 > var2 ? 1792 : 1536;
         }
      } else if (1972246165 * var0.field1487 > var1) {
         if (var0.field1489 * -2116044190 < var2) {
            return 943801294;
         } else {
            return var0.field1489 * -1272026483 > var2 ? 256 : 512;
         }
      } else if (var0.field1489 * -1330455547 < var2) {
         return 1785825938;
      } else {
         return var0.field1489 * -1272026483 > var2 ? 0 : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("jh")
   classLV method3225() {
      return this.field1463.field625;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method3297() {
      return this.method3195(1593126723);
   }

   public int getIdleRotateRight() {
      return this.field1457 * -47525405;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("fy")
   int method3258(byte var1) {
      try {
         return -950185259 * this.field1463.field633;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("jx")
   classLV method3226() {
      return this.field1463.field625;
   }

   public void setAnimationFrame(int var1) {
      this.field1465.field5602 = var1 * -885908119;
   }

   @ObfuscatedSignature(descriptor = "(B)Lfl;")
   @ObfuscatedName("br")
   public abstract classFL vmethod274(byte var1);

   public void setDead(boolean var1) {
      this.field1504 = var1;
   }

   public int getWalkRotate180() {
      return this.field1462 * -412780869;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jp")
   boolean method3228() {
      return this.field1463.field622;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jy")
   boolean method3229() {
      return this.field1463.field622;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("jb")
   void method3232(boolean var1) {
      this.field1463.field622 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("sl")
   public static boolean method3211(Actor var0) {
      if (var0 == null) {
         var0.method3121();
      }

      return var0.method3223(1536677490) == classLV.field4235 || 0 == -1798356091 * var0.field1473;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("jk")
   void method3233(boolean var1) {
      this.field1463.field622 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Llj;")
   @ObfuscatedName("ke")
   classLJ method3237() {
      return this.field1463.field623;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gt")
   final void method3127(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= 0 && var5 > 0) {
         boolean var6 = this.field1434.size() >= var5;
         int var7 = 0;

         for (int var8 = 0; var8 < this.field1434.size(); var8++) {
            classDV var9 = (classDV)this.field1434.get(var8);
            if (var9.method3619(-1127391081) > var3) {
               var7 = (var8 + 1) % var5;
            } else {
               var6 = false;
            }
         }

         classPW var14 = classDJ.method3373(var1, (byte)23);
         if (null != var14.field5455) {
            var14 = classPW.method9331(var14, (byte)-29);
            if (var14 == null) {
               return;
            }
         }

         int var15 = var14.field5460 * -455606386;
         int var10 = -1;
         if (var6) {
            if (-1 == var15) {
               return;
            }

            int var11 = 0;

            for (int var12 = 0; var12 < this.field1434.size(); var12++) {
               classDV var13 = (classDV)this.field1434.get(var12);
               if (0 == var15) {
                  if (var12 == 0 || var13.method3619(-768225562) < var11) {
                     var10 = var12;
                     var11 = var13.method3619(-139114633);
                  }
               } else if (1 == var15 && (var12 == 0 || var13.method3622((short)-136) < var11)) {
                  var10 = var12;
                  var11 = var13.method3622((short)-2375);
               }
            }

            if (var15 == 1 && var11 >= var2) {
               return;
            }
         } else {
            if (var5 > 4) {
               var7 = 0;
            }

            for (int var16 = 0; var16 < var5; var16++) {
               int var18 = var7;
               var7 = (var7 + 1) % var5;
               if (var18 >= this.field1434.size()) {
                  this.field1434.add(new classDV());
                  var10 = this.field1434.size() - 1;
                  break;
               }

               classDV var19 = (classDV)this.field1434.get(var18);
               if (var19.method3619(421490623) <= var3) {
                  var10 = var18;
                  break;
               }
            }
         }

         if (var10 >= 0) {
            classDV var17 = (classDV)this.field1434.get(var10);
            var17.method3611(var1, var2, var14.field5448 * -265436849 + var3 + var4, (byte)16);
         }
      }
   }

   public boolean isDead() {
      return this.field1504;
   }

   public void removeSpotAnim(int var1) {
      ActorSpotAnim var2 = (ActorSpotAnim)this.method3294().method13600(var1);
      if (var2 != null) {
         var2.method12065();
         this.field1447 = (this.field1447 * 49255335 - 1) * 509600791;
      }
   }

   public int getWalkRotateLeft() {
      return this.field1450 * 1347929125;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kx")
   void method3242() {
      this.field1463.method1386(387771610);
   }

   public void setRunAnimation(int var1) {
      this.field1449 = var1 * -627296855;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jq")
   boolean method3212() {
      return this.method3223(1536677490) == classLV.field4235 || 0 == -1798356091 * this.field1473;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ko")
   int method3244() {
      return this.field1463.field632 * -1076229136;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ga")
   final void method3121() {
      this.field1473 = 0;
      this.field1478 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kq")
   int method3248() {
      return this.field1463.field629 * 217183351;
   }

   public int getPoseAnimationFrame() {
      return this.field1464.field5602 * 292569817;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;IIIIII)V")
   @ObfuscatedName("pa")
   public static void method3131(Actor var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method3195(var1);
      }

      HealthBarDefinition var7 = classDS.method3535(var1, 1904378382);
      classCO var8 = null;
      classCO var9 = null;
      int var10 = var7.field5482 * 918203003;
      int var11 = 0;

      for (classCO var12 = (classCO)var0.field1442.method8167(); var12 != null; var12 = (classCO)classAAX.method294(var0.field1442)) {
         var11++;
         if (397419339 * var7.field5484 == var12.field1177.field5484 * 397419339) {
            var12.method2559(var4 + var2, var5, var6, var3, (byte)79);
            return;
         }

         if (-2066916177 * var12.field1177.field5481 <= -2066916177 * var7.field5481) {
            var8 = var12;
         }

         if (var12.field1177.field5482 * 918203003 > var10) {
            var9 = var12;
            var10 = 918203003 * var12.field1177.field5482;
         }
      }

      if (var9 != null || var11 < 4) {
         classCO var13 = new classCO(var7);
         if (var8 == null) {
            var0.field1442.method8159(var13);
         } else {
            IterableNodeDeque.method8150(var13, var8);
         }

         var13.method2559(var2 + var4, var5, var6, var3, (byte)2);
         if (var11 >= 4) {
            var9.vmethod398();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;IIIIZ)V")
   @ObfuscatedName("lv")
   public static void method3135(Actor var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == null) {
         var0.method3229();
      }

      int var6 = var4 + client.field855 * 1612595797;
      ActorSpotAnim var7 = (ActorSpotAnim)var0.field1469.method13595(var1);
      if (var7 != null) {
         var7.vmethod398();
         var0.field1447 -= 509600791;
      }

      if (65535 != var2 && var2 != -1) {
         IterableNodeHashTable.method13576(var0.field1469, new ActorSpotAnim(var2, var3, var6, var0, var5), var1);
         var0.field1447 += 509600791;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dc")
   public void method3298() {
      this.method3138(-2127451492);
   }

   public void setOverheadText(String var1) {
      this.overheadText = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kk")
   int method3262() {
      return this.field1463.field627 * 1346270722;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ki")
   int method3250() {
      return this.field1463.field628 * -1098050121;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kw")
   int method3253() {
      return 635707271 * this.field1463.field631;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hd")
   void method3142() {
      classYA var1 = new classYA(this.field1469);

      for (ActorSpotAnim var2 = (ActorSpotAnim)rl3.method10079(var1); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.vmethod398();
      }

      this.field1447 = 0;
   }

   public int getCurrentOrientation() {
      return this.field1488 * 1457033841;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("th")
   public boolean method3299() {
      return this.method3151(-1423687886);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kn")
   int method3257() {
      return 2030011479 * this.field1463.field630;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("en")
   boolean method3149(int var1) {
      try {
         if (this.field1463.field624 == classLU.field4228) {
            if (var1 <= -1137072437) {
               throw new IllegalStateException();
            }

            if (this.field1463.field627 * 1373839855 != -1) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ds(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kd")
   int method3259() {
      return -950185259 * this.field1463.field633;
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("er")
   int method3245(short var1) {
      try {
         return this.field1463.field632 * 893538615;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.fo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lyn;")
   @ObfuscatedName("dl")
   IterableNodeHashTable method3137(byte var1) {
      try {
         return this.field1469;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dl(" + ')');
      }
   }

   public void setPoseAnimationFrame(int var1) {
      this.field1464.field5602 = var1 * -885908119;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kc")
   void method3265(int var1) {
      this.field1463.field627 = var1 * -689558257;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("km")
   void method3266(int var1) {
      this.field1463.field627 = var1 * -689558257;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;IILfl;)V")
   @ObfuscatedName("uc")
   public static void method3188(Actor var0, int var1, int var2, classFL var3) {
      if (var0 == null) {
         var0.method3199();
      }

      var0.field1437 = var1 * -271322215;
      var0.field1432 = var2 * -1468588531;
      classFL.method4827(var0.field1435, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ldh;I)I")
   @ObfuscatedName("qh")
   public static int method3168(Actor var0, int var1) {
      if (var0 == null) {
         var0.method3169(var1);
      }

      try {
         return var0.field1441 * 670857619;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ed(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ef")
   boolean method3213(byte var1) {
      try {
         if (this.method3223(1536677490) != classLV.field4235) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            if (0 != -1798356091 * this.field1473) {
               return false;
            }

            if (var1 == 1) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ef(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jw")
   boolean method3230() {
      return this.field1463.field622;
   }

   public Point getCanvasSpriteLocation(net.runelite.api.SpritePixels var1, int var2) {
      LocalPoint var3 = this.getLocalLocation();
      int var4 = Perspective.getFootprintTileHeight(classOE.field4843, var3, this.method3284().field1710 * -483624883, this.getFootprintSize());
      var4 -= this.getAnimationHeightOffset();
      Point var5 = Perspective.localToCanvas(classOE.field4843, var3.getWorldView(), var3.getX(), var3.getY(), var4 - var2);
      if (var5 == null) {
         return null;
      } else {
         int var6 = var5.getX() - var1.getWidth() / 2;
         int var7 = var5.getY() - var1.getHeight() / 2;
         return new Point(var6, var7);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ic")
   int method3199() {
      int var1 = 128 * this.field1474[-1798356091 * this.field1473 - 1] + this.field1441 * -14785344;
      int var2 = this.field1433[this.field1473 * -1798356091 - 1] * 128 + this.field1441 * -14785344;
      if (this.field1487 * -1547553299 < var1) {
         if (-1272026483 * this.field1489 < var2) {
            return 1280;
         } else {
            return this.field1489 * -1272026483 > var2 ? 1792 : 1536;
         }
      } else if (-1547553299 * this.field1487 > var1) {
         if (this.field1489 * -1272026483 < var2) {
            return 768;
         } else {
            return this.field1489 * -1272026483 > var2 ? 256 : 512;
         }
      } else if (this.field1489 * -1272026483 < var2) {
         return 1024;
      } else {
         return this.field1489 * -1272026483 > var2 ? 0 : -1;
      }
   }

   public void setPoseAnimation(int var1) {
      this.field1464.method9786(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   public static void method3122(int var0) {
      try {
         classNP.field4699.clear();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dh.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxo;I)I")
   @ObfuscatedName("az")
   public static int method3081(CharSequence var0, CharSequence var1, classXO var2, int var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         byte var8 = 0;
         byte var9 = 0;

         while (true) {
            if (var6 - var8 >= var4) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               if (var7 - var9 >= var5) {
                  if (var3 == 67371012) {
                     throw new IllegalStateException();
                  }

                  int var22 = Math.min(var4, var5);

                  for (int var25 = 0; var25 < var22; var25++) {
                     if (var3 == 67371012) {
                        throw new IllegalStateException();
                     }

                     if (classXO.field6895 == var2) {
                        var6 = var4 - 1 - var25;
                        var7 = var5 - 1 - var25;
                     } else {
                        var7 = var25;
                        var6 = var25;
                     }

                     char var27 = var0.charAt(var6);
                     char var30 = var1.charAt(var7);
                     if (var30 != var27) {
                        if (var3 == 67371012) {
                           throw new IllegalStateException();
                        }

                        if (Character.toUpperCase(var27) != Character.toUpperCase(var30)) {
                           if (var3 == 67371012) {
                              throw new IllegalStateException();
                           }

                           var27 = Character.toLowerCase(var27);
                           var30 = Character.toLowerCase(var30);
                           if (var27 != var30) {
                              if (var3 == 67371012) {
                                 throw new IllegalStateException();
                              }

                              return classCA.method1394(var27, var2, (byte)115) - classCA.method1394(var30, var2, (byte)48);
                           }
                        }
                     }
                  }

                  int var26 = var4 - var5;
                  if (var26 != 0) {
                     if (var3 == 67371012) {
                        throw new IllegalStateException();
                     }

                     return var26;
                  }

                  for (int var29 = 0; var29 < var22; var29++) {
                     if (var3 == 67371012) {
                        throw new IllegalStateException();
                     }

                     char var32 = var0.charAt(var29);
                     char var14 = var1.charAt(var29);
                     if (var32 != var14) {
                        if (var3 == 67371012) {
                           throw new IllegalStateException();
                        }

                        return classCA.method1394(var32, var2, (byte)86) - classCA.method1394(var14, var2, (byte)55);
                     }
                  }

                  return 0;
               }
            }

            if (var6 - var8 >= var4) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if (var7 - var9 >= var5) {
               return 1;
            }

            char var10;
            if (0 != var8) {
               var10 = (char)var8;
               boolean var18 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var11;
            if (var9 != 0) {
               var11 = (char)var9;
               boolean var19 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            byte var12;
            if (var10 == 198) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (var10 == 230) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else if (223 == var10) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var12 = 115;
            } else if (var10 == 338) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (var10 == 339) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else {
               var12 = 0;
            }

            var8 = var12;
            byte var13;
            if (var11 == 198) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var13 = 69;
            } else if (230 == var11) {
               var13 = 101;
            } else if (var11 == 223) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var13 = 115;
            } else if (338 == var11) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var13 = 69;
            } else if (339 == var11) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               var13 = 101;
            } else {
               var13 = 0;
            }

            var9 = var13;
            var10 = classKR.method6556(var10, var2, (byte)-10);
            var11 = classKR.method6556(var11, var2, (byte)-92);
            if (var10 != var11) {
               if (var3 == 67371012) {
                  throw new IllegalStateException();
               }

               if (Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                  if (var3 == 67371012) {
                     throw new IllegalStateException();
                  }

                  var10 = Character.toLowerCase(var10);
                  var11 = Character.toLowerCase(var11);
                  if (var10 != var11) {
                     if (var3 == 67371012) {
                        throw new IllegalStateException();
                     }

                     return classCA.method1394(var10, var2, (byte)72) - classCA.method1394(var11, var2, (byte)92);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "dh.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method3082(int var0, int var1) {
      try {
         return classGB.field2540[var0 & 16383];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([F[IIII)V")
   @ObfuscatedName("aj")
   static void method3128(float[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 <= 1694882104) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            float var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 <= 1694882104) {
                  throw new IllegalStateException();
               }

               if (var0[var9] < var7) {
                  float var10 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6] = var10;
                  int var11 = var1[var9];
                  var1[var9] = var1[var6];
                  var1[var6++] = var11;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method3128(var0, var1, var2, var6 - 1, 1869585972);
            method3128(var0, var1, var6 + 1, var3, 2028505282);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "dh.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hg")
   @Override
   public int vmethod384() {
      return this.vmethod368(311606126);
   }

   public void setGraphicHeight(int var1) {
      Iterator var2 = this.method3294().iterator();
      if (var2.hasNext()) {
         ActorSpotAnim var3 = (ActorSpotAnim)var2.next();
         var3.setHeight(var1);
      }
   }

   public int getWalkRotateRight() {
      return this.field1448 * -144383729;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("di")
   @Override
   public int vmethod385() {
      return this.vmethod371(-267974568);
   }

   public int getIdlePoseAnimation() {
      return this.field1436 * 1457308725;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hr")
   @Override
   public int vmethod386() {
      return this.vmethod258((byte)-13);
   }

   @ObfuscatedSignature(descriptor = "(Ldh;I)Z")
   @ObfuscatedName("jf")
   public static boolean method3157(Actor var0, int var1) {
      if (var0 == null) {
         return var0.method3150(var1);
      } else {
         try {
            if (classLU.field4226 == var0.field1463.field624) {
               if (var1 == 559811142) {
                  throw new IllegalStateException();
               }

               if (var0.field1463.field628 * -1098050121 != -1) {
                  if (var1 == 559811142) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "dh.da(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("yq")
   @Override
   public float vmethod382() {
      return this.field1485;
   }

   public int getGraphic() {
      Iterator var1 = this.method3294().iterator();
      if (var1.hasNext()) {
         ActorSpotAnim var2 = (ActorSpotAnim)var1.next();
         return var2.getId();
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("rd")
   public WorldView method3284() {
      if (this.field1439 * -1105444433 > -1) {
         if (!classOE.field4843.isClientThread()) {
            if (!GameEngine.$assertionsDisabled) {
               throw new AssertionError("must be called on client thread");
            } else {
               throw new IllegalStateException("must be called on client thread");
            }
         } else {
            return client.field814.method1634(this.field1439 * -1105444433);
         }
      } else {
         return classIS.field3053;
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ef")
   @Override
   public float vmethod383() {
      return this.field1486;
   }

   public void setIdleRotateRight(int var1) {
      this.field1457 = var1 * 190249931;
   }

   @ObfuscatedSignature(descriptor = "(IILgt;I)V")
   @ObfuscatedName("dh")
   void method3112(int var1, int var2, classGT var3, int var4) {
      try {
         if (this.field1478 * -1798356091 < 9) {
            if (var4 == -2075447184) {
               return;
            }

            this.field1479 += -2014692019;
         }

         for (int var5 = this.field1460 * -1798356091; var5 > 0; var5--) {
            if (var4 == -2075447184) {
               throw new IllegalStateException();
            }

            this.field1433[var5] = this.field1474[var5 - 1];
            this.field1438[var5] = this.field1438[var5 - 1];
            this.field1476[var5] = this.field1476[var5 - 1];
         }

         this.field1438[0] = var1;
         this.field1474[0] = var2;
         this.field1476[0] = var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "dh.dh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jb")
   public void method3274(int var1) {
      this.field1486 = this.field1489 * -1272026483;
   }

   public boolean isInteracting() {
      return this.field1463.field624 != classLU.field4225
         ? false
         : this.field1463.field623 == classLJ.field4176 || this.field1463.field623 == classLJ.field4177;
   }

   @ObfuscatedSignature(descriptor = "(ILxs;B)V")
   @ObfuscatedName("ez")
   void method3222(int var1, PacketBuffer var2, byte var3) {
      this.method3278(var1, var2);

      try {
         this.field1463.method1382(var1, var2, (byte)2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dh.ez(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ev")
   boolean method3150(int var1) {
      try {
         if (this.field1463.field624 == classLU.field4225) {
            if (var1 <= -1137072437) {
               throw new IllegalStateException();
            }

            if (this.field1463.field627 * 1373839855 != -1) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ds(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldh;IILfl;I)V")
   @ObfuscatedName("yz")
   public static void method3189(Actor var0, int var1, int var2, classFL var3, int var4) {
      if (var0 == null) {
         var0.method3190(var1, var1, var3, var1);
      } else {
         try {
            var0.field1437 = var1 * -271322215;
            var0.field1432 = var2 * -1468588531;
            classFL.method4827(var0.field1435, var3);
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "dh.eq(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dp")
   void method3161(int var1) {
      try {
         this.field1463.field622 = false;
         this.field1463.field633 = 689558257;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dp(" + ')');
      }
   }

   public LocalPoint getCameraFocus() {
      return this.getLocalLocation();
   }

   @ObfuscatedSignature(descriptor = "(Ldh;I)V")
   @ObfuscatedName("jj")
   public static void method3101(Actor var0, int var1) {
      if (var0 == null) {
         var0.method3267(var1);
      }

      try {
         classQR.method9720(var0.field1465, 1196954566);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.dk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ed")
   public int method3169(int var1) {
      try {
         return this.field1496 * 670857619;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.ed(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILfl;I)V")
   @ObfuscatedName("eq")
   void method3190(int var1, int var2, classFL var3, int var4) {
      try {
         this.field1478 = var1 * -271322215;
         this.field1441 = var2 * -1468588531;
         classFL.method4827(this.field1435, var3);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dh.eq(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Z")
   @ObfuscatedName("te")
   public static boolean method3105(Actor var0) {
      return var0.field1465.method9726(374233424) && 0 == -211489501 * var0.field1467;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("df")
   boolean method3182(int var1) {
      try {
         if (this.field1435.method4841() && 1612595797 * client.field1093 >= this.field1449 * -1286360919) {
            if (var1 == 341681316) {
               throw new IllegalStateException();
            }

            if (client.field827 * 1612595797 < this.field1472 * -1575657275) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dh.en(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dk")
   void method3267(int var1) {
      this.field1463.field629 = var1 * -689558257;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("zo")
   public void method3283(int var1, int var2, int var3, int var4, int var5) {
      classDV var6 = classDV.field1640;
      if (var6 == null) {
         var6 = new classDV();
         classPW var7 = classPW.method9357(var1);
         if (var7.field5455 != null) {
            var7 = var7.method9359();
            if (var7 == null) {
               return;
            }
         }

         classDV.method3629(var6, var1, var2, var3 + var4 + var7.field5448 * -265436849);
      }

      HitsplatApplied var8 = new HitsplatApplied();
      var8.setActor(this);
      var8.setHitsplat(var6);
      classOE.field4843.getCallbacks().post(var8);
   }

   public String getOverheadText() {
      return this.overheadText;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)V")
   @ObfuscatedName("ly")
   public static void method3143(Actor var0) {
      classYA var1 = new classYA(var0.field1469);

      for (ActorSpotAnim var2 = (ActorSpotAnim)rl3.method10079(var1); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.vmethod398();
      }

      var0.field1447 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Lnv;")
   @ObfuscatedName("co")
   public IterableNodeDeque method3300() {
      return this.field1442;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZB)V")
   @ObfuscatedName("dg")
   void method3136(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         int var7 = var4 + client.field1090 * 1612595797;
         ActorSpotAnim var8 = (ActorSpotAnim)this.field1469.method13595(var1);
         if (var8 != null) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var8.method12065();
            this.field1472 = this.field1443 - 509600791;
         }

         if (65535 != var2) {
            if (var6 == 0) {
               this.method3280(var1, var2, var3, var4, var5);
               return;
            }

            if (var2 != -1) {
               IterableNodeHashTable.method13576(this.field1469, new ActorSpotAnim(var2, var3, var7, this, var5), var1);
               this.field1439 = this.field1492 + 509600791;
               this.method3289(var1, var2, var3, var4, var5);
               return;
            }
         }

         this.method3280(var1, var2, var3, var4, var5);
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "dh.dg(" + ')');
      }
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.field4843, this.getLocalLocation());
   }

   @ObfuscatedSignature(descriptor = "()Llj;")
   @ObfuscatedName("je")
   classLJ method3238() {
      return this.field1463.field623;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("eb")
   void method3234(boolean var1, int var2) {
      try {
         this.field1463.field622 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dh.eb(" + ')');
      }
   }
}
