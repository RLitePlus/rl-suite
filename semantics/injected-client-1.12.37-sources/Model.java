import java.awt.Shape;
import java.util.Arrays;
import net.runelite.api.Perspective;
import net.runelite.api.model.Jarvis;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fx")
public class Model extends Renderable implements net.runelite.api.Model {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2461 = 2500;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2484 = 50;
   @ObfuscatedName("ck")
   int[][] field2508;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2483 = 6500;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2468 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2464 = 20;
   @ObfuscatedName("ap")
   static int[] field2476 = new int[6500];
   @ObfuscatedName("ac")
   static boolean[] field2463 = new boolean[6500];
   @ObfuscatedName("be")
   static int field2487;
   @ObfuscatedName("xf")
   public short[] field2506;
   @ObfuscatedName("bo")
   static int[] field2478 = new int[10];
   @ObfuscatedName("mm")
   public int[] field2504;
   @ObfuscatedName("al")
   static float[] field2452 = new float[6500];
   @ObfuscatedName("aj")
   static float[] field2450 = new float[6500];
   @ObfuscatedName("fa")
   public int[] field2503;
   @ObfuscatedName("ay")
   static int[] field2451 = new int[6500];
   @ObfuscatedName("aq")
   static int[] field2470 = new int[6500];
   @ObfuscatedName("ad")
   static int[] field2453 = new int[6500];
   @ObfuscatedName("ot")
   public float[] field2427;
   @ObfuscatedName("ak")
   static int[] field2459 = new int[2500];
   @ObfuscatedName("au")
   static char[] field2455 = new char[6000];
   @ObfuscatedName("aa")
   static boolean[] field2449 = new boolean[6500];
   @ObfuscatedName("ar")
   static int[] field2457 = new int[12];
   @ObfuscatedName("aw")
   static int[][] field2458 = new int[12][2500];
   @ObfuscatedName("bn")
   static int[] field2462 = classFH.field2251;
   @ObfuscatedName("cm")
   short field2499;
   @ObfuscatedName("at")
   static int[] field2480 = new int[12];
   @ObfuscatedName("an")
   static boolean field2448 = true;
   @ObfuscatedName("am")
   static int[] field2465 = classFH.field2253;
   @ObfuscatedName("ah")
   static int[] field2473 = classFH.field2254;
   @ObfuscatedName("ax")
   static boolean[] field2445 = new boolean[6500];
   @ObfuscatedName("do")
   public int field2495;
   @ObfuscatedName("bx")
   static int[] field2469 = classFH.field2252;
   @ObfuscatedName("bc")
   static float[] field2446 = new float[3];
   @ObfuscatedName("cv")
   int field2418;
   @ObfuscatedName("br")
   static byte[] field2472 = new byte[1];
   @ObfuscatedName("cq")
   short[] field2437;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("bp")
   static Model field2447 = new Model();
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("bg")
   static classUU field2475 = new classUU();
   @ObfuscatedName("cy")
   int[] field2440;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("bk")
   static classUU field2477 = new classUU();
   @ObfuscatedName("cb")
   byte[] field2436;
   @ObfuscatedName("bu")
   static int[] field2479 = new int[10];
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("il")
   public Model field2498;
   @ObfuscatedName("ba")
   static int[] field2482 = new int[10];
   @ObfuscatedName("tx")
   public int[] field2505;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("bm")
   static Model field2471 = new Model();
   @ObfuscatedName("bb")
   static int field2486;
   @ObfuscatedName("bi")
   static int field2488;
   @ObfuscatedName("bt")
   static byte[] field2474 = new byte[1];
   @ObfuscatedName("hz")
   public float[] field2430;
   @ObfuscatedName("ai")
   static char[][] field2456 = new char[6000][512];
   @ObfuscatedName("bq")
   int[] field2501;
   @ObfuscatedName("cd")
   byte field2420;
   @ObfuscatedName("bs")
   int[] field2502;
   @ObfuscatedName("bd")
   public int field2419;
   @ObfuscatedName("bl")
   int[] field2429;
   @ObfuscatedName("bv")
   int[] field2432;
   @ObfuscatedName("bh")
   int[] field2433;
   @ObfuscatedName("bz")
   int[] field2434;
   @ObfuscatedName("cr")
   int[] field2428;
   @ObfuscatedName("av")
   static int[] field2467 = new int[2500];
   @ObfuscatedName("cl")
   byte[] field2431;
   @ObfuscatedName("bw")
   static float[] field2454 = new float[10];
   @ObfuscatedName("cu")
   int[] field2435;
   @ObfuscatedName("cs")
   int[] field2439;
   @ObfuscatedName("cp")
   byte[] field2438;
   @ObfuscatedName("bf")
   int[] field2500;
   @ObfuscatedName("td")
   public int field2496;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("bj")
   static classUU field2460 = new classUU();
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2485 = 6000;
   @ObfuscatedName("ct")
   public byte[] field2444;
   @ObfuscatedName("co")
   int[] field2441;
   @ObfuscatedName("cn")
   int field2492;
   @ObfuscatedName("ca")
   int[][] field2507;
   @ObfuscatedName("cc")
   public boolean field2421;
   @ObfuscatedName("cf")
   int field2489;
   @ObfuscatedName("ch")
   int field2491;
   @ObfuscatedName("dg")
   public int field2494;
   @ObfuscatedName("ao")
   static float[] field2466 = new float[6500];
   @ObfuscatedName("cz")
   int field2493;
   @ObfuscatedName("cg")
   int field2490;
   @ObfuscatedName("cw")
   int[][] field2442;
   @ObfuscatedName("cj")
   int[][] field2443;
   @ObfuscatedSignature(descriptor = "Lfp;")
   @ObfuscatedName("ci")
   AABB field2497;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("cx")
   classFL field2422;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ce")
   classFZ field2423;
   @ObfuscatedName("hy")
   public float[] field2426;
   @ObfuscatedName("by")
   int field2424 = 0;
   @ObfuscatedName("dc")
   byte field2425;

   @ObfuscatedSignature(descriptor = "(Lem;Lsn;I[ZZZ)V")
   @ObfuscatedName("ea")
   public void method5124(classEM var1, classSN var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      classEF var7 = var1.method3924((byte)25);
      if (var7 != null) {
         var7.method3873(var2, var3, var4, var5, (byte)11);
         if (var6) {
            this.method5115(var7, var2.method10516(1186942905));
         }
      }

      if (!var5 && classSN.method10518(var2, -155425021)) {
         this.method5221(var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("hx")
   public Model method5253() {
      this.method5174();
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("nz")
   public Model method5244() {
      return this.field2498;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("jt")
   public Model method5254() {
      this.method5238();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lfz;)V")
   @ObfuscatedName("qp")
   public void method5255(classFZ var1) {
      classNZ.method8286(this, var1);
   }

   @ObfuscatedSignature(descriptor = "(III)Lfx;")
   @ObfuscatedName("xx")
   public Model method5256(int var1, int var2, int var3) {
      this.method5237(var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("de")
   public void method5257() {
      classZG.method13998(this);
   }

   public byte[] getTextureFaces() {
      return this.field2436;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lef;I)V")
   @ObfuscatedName("bm")
   public static void method5199(Model var0, classEF var1, int var2) {
      if (var0.field2508 != null) {
         for (int var3 = 0; var3 < var0.field2424; var3++) {
            int[] var4 = var0.field2508[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = var0.field2507[var3];
               field2475.method11579(-1382204550);

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  classSG var8 = var1.method3854(var7, (byte)32);
                  if (var8 != null) {
                     field2460.method11585(var5[var6] / 255.0F, -1290979281);
                     rl23.method10067(field2477, var8.method10403(var2, 131168747), (byte)7);
                     classUU.method11594(field2477, field2460, -289464942);
                     field2475.method11641(field2477, (byte)-85);
                  }
               }

               method5242(var0, var3, field2475);
            }
         }
      }
   }

   public Model(Model[] var1, int var2) {
      this.field2419 = 0;
      this.field2420 = 0;
      this.field2418 = 0;
      this.field2421 = false;
      this.field2422 = null;
      this.field2423 = classFZ.field2515;
      this.field2425 = 0;
      this.field2424 = 0;
      this.field2419 = 0;
      this.field2418 = 0;
      this.field2420 = -1;

      for (int var3 = 0; var3 < var2; var3++) {
         Model var4 = var1[var3];
         if (var4 != null) {
            this.field2424 = this.field2424 + var4.field2424;
            this.field2419 = this.field2419 + var4.field2419;
            this.field2418 = this.field2418 + var4.field2418;
            if (this.field2420 == -1) {
               this.field2420 = var4.field2420;
            }
         }
      }

      this.method5069(this.field2424, this.field2419, this.field2418);
      this.field2424 = 0;
      this.field2419 = 0;
      this.field2418 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         this.method5076(var1[var5]);
      }

      this.method5224(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("fz")
   void method5162(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null || this.field2425 != 0) {
         int var9 = var2.method11443(1765668592);
         int var10 = classUP.method11445(var2, (byte)-16);
         int var11 = var3.method11443(1710077081);
         int var12 = classUP.method11445(var3, (byte)-28);
         float var13 = var2.method11449(2146235953);
         float var14 = var2.method11451((byte)114);
         float var15 = var3.method11449(2111648931);
         float var16 = var3.method11451((byte)110);
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.field2491 * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 742446085 && var18 < classFQ.method4929()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.field2491) * classFH.method4727();
            if (var22 / var20 < classFH.method4716()) {
               int var23 = (var21 + this.field2491) * classFH.method4727();
               if (var23 / var20 > classFH.method4712()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.field2491 * var9 >> 16;
                  int var26 = var25 + (this.field2492 * var10 >> 16);
                  int var27 = (var24 + var26) * classFH.method4727();
                  if (var27 / var20 > classFH.method4724()) {
                     int var28 = var25 + (this.field1743 * 699042514 * var10 >> 16);
                     int var29 = (var24 - var28) * classFH.method4727();
                     if (var29 / var20 < classFH.method4720()) {
                        int var30 = var19 + (this.field1743 * 1410741989 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= -1395221944) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.field2437 != null;
                        int var34 = classCS.method2595(-2101960750);
                        int var35 = -1724683376 * classFO.field2348;
                        boolean var37 = classAS.method660(2102810142);
                        boolean var39 = 0L != var7;
                        if (var39) {
                           boolean var40 = 1 == (int)(var7 >>> 19 & 1L);
                           var39 = !var40;
                        }

                        boolean var55 = false;
                        if (var39 && var37) {
                           boolean var41 = false;
                           if (field2448) {
                              var41 = Projectile.method1219(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 classFH.method4705(),
                                 classFH.method4710(),
                                 classFH.method4727(),
                                 -392431248
                              );
                           } else {
                              int var42 = var18 - var19;
                              if (var42 <= 50) {
                                 var42 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var42;
                              } else {
                                 var23 /= var20;
                                 var22 /= var42;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var42;
                              } else {
                                 var27 /= var20;
                                 var29 /= var42;
                              }

                              int var43 = var34 - classFH.method4705();
                              int var44 = var35 - classFH.method4710();
                              if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
                                 var41 = true;
                              }
                           }

                           if (var41) {
                              if (this.field2421) {
                                 int var60 = classFH.method4705();
                                 int var45 = classFH.method4710();
                                 int var46 = classFH.method4727();
                                 classEV.method4087(var13, var14, var15, var16, var60, var45, var46, (byte)-14);
                                 int var57 = classSZ.method10730(
                                    var4,
                                    var5,
                                    var6,
                                    client.field1069 * -1163968665,
                                    1969534689 * classDX.field1662,
                                    1345215331 * classDU.field1633,
                                    1788691143 * classDB.field1375,
                                    1810494134 * classYJ.field6994,
                                    1711517837 * World.field1165,
                                    this.method5093(var1),
                                    934389493
                                 );
                                 int var47 = var57 + 32;
                                 classGI.method5448(var7, var47, -23559056);
                              } else {
                                 var55 = true;
                              }
                           }
                        }

                        int var56 = classFH.method4705();
                        int var58 = classFH.method4710();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = classFH.field2255[var1];
                           var61 = classFH.field2259[var1];
                        }

                        for (int var62 = 0; var62 < this.field2424; var62++) {
                           float var63 = (int)this.field2427[var62];
                           float var66 = (int)this.field2430[var62];
                           float var48 = (int)this.field2426[var62];
                           if (var1 != 0) {
                              float var49 = var48 * var59 + var63 * var61;
                              var48 = var48 * var61 - var63 * var59;
                              var63 = var49;
                           }

                           var63 += var4;
                           var66 += var5;
                           var48 += var6;
                           float var71 = var48 * var15 + var63 * var16;
                           var48 = var48 * var16 - var63 * var15;
                           float var72 = var66 * var14 - var48 * var13;
                           var48 = var66 * var13 + var48 * var14;
                           var31 |= classKD.method6465(this, var62, var71, var72, var48, var18, var56, var58, var33);
                        }

                        try {
                           this.method5171(var31, var55, this.field2421, var7);
                        } catch (Exception var50) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("bq")
   void method5163(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null || this.field2425 != 0) {
         int var9 = var2.method11443(-188309584);
         int var10 = classUP.method11445(var2, (byte)56);
         int var11 = var3.method11443(1044302003);
         int var12 = classUP.method11445(var3, (byte)-29);
         float var13 = var2.method11449(2086932342);
         float var14 = var2.method11451((byte)108);
         float var15 = var3.method11449(2110171503);
         float var16 = var3.method11451((byte)114);
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.field2491 * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < classFQ.method4929()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.field2491) * classFH.method4727();
            if (var22 / var20 < classFH.method4716()) {
               int var23 = (var21 + this.field2491) * classFH.method4727();
               if (var23 / var20 > classFH.method4712()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.field2491 * var9 >> 16;
                  int var26 = var25 + (this.field2492 * var10 >> 16);
                  int var27 = (var24 + var26) * classFH.method4727();
                  if (var27 / var20 > classFH.method4724()) {
                     int var28 = var25 + (this.field1743 * -1256242689 * var10 >> 16);
                     int var29 = (var24 - var28) * classFH.method4727();
                     if (var29 / var20 < classFH.method4720()) {
                        int var30 = var19 + (this.field1743 * -1256242689 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.field2437 != null;
                        int var34 = classCS.method2595(-820146731);
                        int var35 = 1170217135 * classFO.field2348;
                        boolean var37 = classAS.method660(2088058067);
                        boolean var39 = 0L != var7;
                        if (var39) {
                           boolean var40 = 1 == (int)(var7 >>> 19 & 1L);
                           var39 = !var40;
                        }

                        boolean var55 = false;
                        if (var39 && var37) {
                           boolean var41 = false;
                           if (field2448) {
                              var41 = Projectile.method1219(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 classFH.method4705(),
                                 classFH.method4710(),
                                 classFH.method4727(),
                                 1949910178
                              );
                           } else {
                              int var42 = var18 - var19;
                              if (var42 <= 50) {
                                 var42 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var42;
                              } else {
                                 var23 /= var20;
                                 var22 /= var42;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var42;
                              } else {
                                 var27 /= var20;
                                 var29 /= var42;
                              }

                              int var43 = var34 - classFH.method4705();
                              int var44 = var35 - classFH.method4710();
                              if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
                                 var41 = true;
                              }
                           }

                           if (var41) {
                              if (this.field2421) {
                                 int var60 = classFH.method4705();
                                 int var45 = classFH.method4710();
                                 int var46 = classFH.method4727();
                                 classEV.method4087(var13, var14, var15, var16, var60, var45, var46, (byte)-58);
                                 int var57 = classSZ.method10730(
                                    var4,
                                    var5,
                                    var6,
                                    client.field1069 * -1163968665,
                                    -639123865 * classDX.field1662,
                                    -1674330987 * classDU.field1633,
                                    1788691143 * classDB.field1375,
                                    1768347607 * classYJ.field6994,
                                    -1569185711 * World.field1165,
                                    this.method5093(var1),
                                    1140024710
                                 );
                                 int var47 = var57 + 32;
                                 classGI.method5448(var7, var47, -1724546756);
                              } else {
                                 var55 = true;
                              }
                           }
                        }

                        int var56 = classFH.method4705();
                        int var58 = classFH.method4710();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = classFH.field2255[var1];
                           var61 = classFH.field2259[var1];
                        }

                        for (int var62 = 0; var62 < this.field2424; var62++) {
                           float var63 = (int)this.field2427[var62];
                           float var66 = (int)this.field2430[var62];
                           float var48 = (int)this.field2426[var62];
                           if (var1 != 0) {
                              float var49 = var48 * var59 + var63 * var61;
                              var48 = var48 * var61 - var63 * var59;
                              var63 = var49;
                           }

                           var63 += var4;
                           var66 += var5;
                           var48 += var6;
                           float var71 = var48 * var15 + var63 * var16;
                           var48 = var48 * var16 - var63 * var15;
                           float var72 = var66 * var14 - var48 * var13;
                           var48 = var66 * var13 + var48 * var14;
                           var31 |= classKD.method6465(this, var62, var71, var72, var48, var18, var56, var58, var33);
                        }

                        try {
                           this.method5171(var31, var55, this.field2421, var7);
                        } catch (Exception var50) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("as")
   void method5076(Model var1) {
      this.method5219(var1);
      if (var1 != null) {
         this.method5074(var1);

         for (int var2 = 0; var2 < var1.field2419; var2++) {
            this.field2429[this.field2419] = var1.field2429[var2] + this.field2424;
            this.field2432[this.field2419] = var1.field2432[var2] + this.field2424;
            this.field2433[this.field2419] = var1.field2433[var2] + this.field2424;
            this.field2434[this.field2419] = var1.field2434[var2];
            this.field2428[this.field2419] = var1.field2428[var2];
            this.field2435[this.field2419] = var1.field2435[var2];
            if (this.field2431 != null) {
               this.field2431[this.field2419] = var1.field2431 != null ? var1.field2431[var2] : var1.field2420;
            }

            if (this.field2444 != null && var1.field2444 != null) {
               this.field2444[this.field2419] = var1.field2444[var2];
            }

            if (this.field2437 != null) {
               this.field2437[this.field2419] = var1.field2437 != null ? var1.field2437[var2] : -1;
            }

            if (this.field2436 != null) {
               if (var1.field2436 != null && var1.field2436[var2] != -1) {
                  this.field2436[this.field2419] = (byte)(var1.field2436[var2] + this.field2418);
               } else {
                  this.field2436[this.field2419] = -1;
               }
            }

            if (this.field2438 != null && var1.field2438 != null) {
               this.field2438[this.field2419] = var1.field2438[var2];
            }

            this.field2419++;
         }

         for (int var3 = 0; var3 < var1.field2418; var3++) {
            this.field2439[this.field2418] = var1.field2439[var3] + this.field2424;
            this.field2440[this.field2418] = var1.field2440[var3] + this.field2424;
            this.field2441[this.field2418] = var1.field2441[var3] + this.field2424;
            this.field2418++;
         }

         for (int var4 = 0; var4 < var1.field2424; var4++) {
            this.field2427[this.field2424] = var1.field2427[var4];
            this.field2430[this.field2424] = var1.field2430[var4];
            this.field2426[this.field2424] = var1.field2426[var4];
            this.field2424++;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lfs;ILfs;I[I)V")
   @ObfuscatedName("ck")
   public static void method5120(Model var0, classFS var1, int var2, classFS var3, int var4, int[] var5) {
      if (var0 == null) {
         var0.translate(var2, var2, var2);
      }

      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            classET var6 = var1.field2392[var2];
            classET var7 = var3.field2392[var4];
            classEM var8 = var6.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.field1913; var11++) {
               int var12 = var6.field1912[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.field1785[var12] == 0) {
                  var0.method5249(var8.field1785[var12], var8.field1787[var12], var6.field1909[var11], var6.field1915[var11], var6.field1914[var11]);
               }
            }

            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.field1913; var17++) {
               int var18 = var7.field1912[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.field1785[var18] == 0) {
                  var0.method5249(var8.field1785[var18], var8.field1787[var18], var7.field1909[var17], var7.field1915[var17], var7.field1914[var17]);
               }
            }

            classZG.method13998(var0);
         } else {
            var0.method5106(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lfx;")
   @ObfuscatedName("cg")
   public Model method5246(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var14 = var6;
      int var12 = var4;
      int var11 = var3;
      int var10 = var2;
      int[][] var9 = var1;
      Model var8 = this;
      this.method5230();
      int var15 = var2 - this.field2491;
      int var16 = var2 + this.field2491;
      int var17 = var4 - this.field2491;
      int var18 = var4 + this.field2491;
      Model var10000;
      if (var15 >= 0 && var16 + 128 >> 7 < var1.length && var17 >= 0 && var18 + 128 >> 7 < var1[0].length) {
         var15 >>= 7;
         var16 = var16 + 127 >> 7;
         var17 >>= 7;
         var18 = var18 + 127 >> 7;
         if (var1[var15][var17] == var3 && var1[var16][var17] == var3 && var1[var15][var18] == var3 && var1[var16][var18] == var3) {
            var10000 = this;
         } else {
            Model var19;
            if (var5) {
               var19 = new Model(this);
               var19.field2430 = new float[var19.field2424];
            } else {
               var19 = this;
            }

            if (var6 == 0) {
               for (int var35 = 0; var35 < var19.field2424; var35++) {
                  int var36 = (int)var8.field2427[var35] + var10;
                  int var37 = (int)var8.field2426[var35] + var12;
                  int var38 = var36 & 127;
                  int var39 = var37 & 127;
                  int var40 = var36 >> 7;
                  int var41 = var37 >> 7;
                  int var42 = var9[var40][var41] * (128 - var38) + var9[var40 + 1][var41] * var38 >> 7;
                  int var43 = var9[var40][var41 + 1] * (128 - var38) + var9[var40 + 1][var41 + 1] * var38 >> 7;
                  int var44 = var42 * (128 - var39) + var43 * var39 >> 7;
                  var19.field2430[var35] = (int)var8.field2430[var35] + var44 - var11;
               }
            } else {
               for (int var20 = 0; var20 < var19.field2424; var20++) {
                  int var21 = (-((int)var8.field2430[var20]) << 16) / (var8.field1743 * -1256242689);
                  if (var21 < var14) {
                     int var22 = (int)var8.field2427[var20] + var10;
                     int var23 = (int)var8.field2426[var20] + var12;
                     int var24 = var22 & 127;
                     int var25 = var23 & 127;
                     int var26 = var22 >> 7;
                     int var27 = var23 >> 7;
                     int var28 = var9[var26][var27] * (128 - var24) + var9[var26 + 1][var27] * var24 >> 7;
                     int var29 = var9[var26][var27 + 1] * (128 - var24) + var9[var26 + 1][var27 + 1] * var24 >> 7;
                     int var30 = var28 * (128 - var25) + var29 * var25 >> 7;
                     var19.field2430[var20] = (int)var8.field2430[var20] + (var30 - var11) * (var14 - var21) / var14;
                  } else {
                     var19.field2430[var20] = var8.field2430[var20];
                  }
               }
            }

            classZG.method13998(var19);
            var10000 = var19;
         }
      } else {
         var10000 = this;
      }

      Model var7 = var10000;
      if (var7 != this && (client.field1096 & 2) == 2 && var6 == 0) {
         var7.field2498 = this;
      }

      return var7;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("ac")
   public Model method5081(boolean var1) {
      if (!var1 && field2472.length < this.field2419) {
         field2472 = new byte[this.field2419 + 100];
      }

      return this.method5087(var1, field2447, field2472);
   }

   public int[] getTexIndices1() {
      return this.field2439;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("aa")
   public Model method5084(boolean var1) {
      if (!var1 && field2474.length < this.field2419) {
         field2474 = new byte[this.field2419 + 100];
      }

      return this.method5087(var1, field2471, field2474);
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)Lfx;")
   @ObfuscatedName("ao")
   Model method5087(boolean var1, Model var2, byte[] var3) {
      this.method5218(var1, var2, var3);
      var2.field2424 = this.field2424;
      var2.field2419 = this.field2419;
      var2.field2418 = this.field2418;
      if (var2.field2427 == null || var2.field2427.length < this.field2424) {
         var2.field2427 = new float[this.field2424 + 100];
         var2.field2430 = new float[this.field2424 + 100];
         var2.field2426 = new float[this.field2424 + 100];
      }

      for (int var4 = 0; var4 < this.field2424; var4++) {
         var2.field2427[var4] = this.field2427[var4];
         var2.field2430[var4] = this.field2430[var4];
         var2.field2426[var4] = this.field2426[var4];
      }

      if (var1) {
         var2.field2444 = this.field2444;
      } else {
         var2.field2444 = var3;
         if (this.field2444 == null) {
            for (int var5 = 0; var5 < this.field2419; var5++) {
               var2.field2444[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.field2419; var6++) {
               var2.field2444[var6] = this.field2444[var6];
            }
         }
      }

      var2.field2429 = this.field2429;
      var2.field2432 = this.field2432;
      var2.field2433 = this.field2433;
      var2.field2434 = this.field2434;
      var2.field2428 = this.field2428;
      var2.field2435 = this.field2435;
      var2.field2431 = this.field2431;
      var2.field2436 = this.field2436;
      var2.field2437 = this.field2437;
      var2.field2438 = this.field2438;
      var2.field2420 = this.field2420;
      var2.field2439 = this.field2439;
      var2.field2440 = this.field2440;
      var2.field2441 = this.field2441;
      var2.field2442 = this.field2442;
      var2.field2443 = this.field2443;
      var2.field2508 = this.field2508;
      var2.field2507 = this.field2507;
      var2.field2421 = this.field2421;
      var2.field2422 = this.field2422;
      var2.field2499 = this.field2499;
      var2.field2425 = this.field2425;
      classZG.method13998(var2);
      return var2;
   }

   Model(Model var1) {
      this.field2419 = 0;
      this.field2420 = 0;
      this.field2418 = 0;
      this.field2421 = false;
      this.field2422 = null;
      this.field2423 = classFZ.field2515;
      this.field2425 = 0;
      this.field2424 = var1.field2424;
      this.field2419 = var1.field2419;
      this.field2418 = var1.field2418;
      this.field2427 = var1.field2427;
      this.field2430 = var1.field2430;
      this.field2426 = var1.field2426;
      this.field2429 = var1.field2429;
      this.field2432 = var1.field2432;
      this.field2433 = var1.field2433;
      this.field2434 = var1.field2434;
      this.field2428 = var1.field2428;
      this.field2435 = var1.field2435;
      this.field2431 = var1.field2431;
      this.field2444 = var1.field2444;
      this.field2436 = var1.field2436;
      this.field2437 = var1.field2437;
      this.field2438 = var1.field2438;
      this.field2420 = var1.field2420;
      this.field2439 = var1.field2439;
      this.field2440 = var1.field2440;
      this.field2441 = var1.field2441;
      this.field2442 = var1.field2442;
      this.field2443 = var1.field2443;
      this.field2421 = var1.field2421;
      this.method5229(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lfp;")
   @ObfuscatedName("aj")
   AABB method5093(int var1) {
      for (AABB var2 = this.field2497; var2 != null; var2 = var2.field2371) {
         if (var2.field2364 * 1384390485 == var1) {
            return var2;
         }
      }

      return null;
   }

   public short[] getFaceTextures() {
      return this.field2437;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lfl;S)V")
   @ObfuscatedName("jj")
   public static void method5204(Model var0, classFL var1, short var2) {
      if (var0 == null) {
         var0.getBottomY();
      }

      if (var1 == null) {
         classQG.method9520(var0);
      } else {
         if (var0.field2422 == null) {
            var0.field2422 = new classFL();
         }

         classFL.method4827(var0.field2422, var1);
         var0.field2499 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfp;")
   @ObfuscatedName("yb")
   public AABB method5235(int var1) {
      this.calculateExtreme(var1);
      AABB var2 = this.method5258(var1);

      assert var2 != null;

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("mf")
   public void method5248(int var1, int var2, int var3) {
      if ((client.field1096 & 64) != 0) {
         this.field2506 = new short[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dw")
   public void method5230() {
      if (this.field2489 != 1) {
         this.field2489 = 1;
         float var1 = 0.0F;
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (int var4 = 0; var4 < this.field2424; var4++) {
            float var5 = this.field2427[var4];
            float var6 = this.field2430[var4];
            float var7 = this.field2426[var4];
            if (-var6 > var1) {
               var1 = -var6;
            }

            if (var6 > var2) {
               var2 = var6;
            }

            float var8 = var5 * var5 + var7 * var7;
            if (var8 > var3) {
               var3 = var8;
            }
         }

         this.field2492 = (int)Math.ceil(var2);
         super.field1743 = (int)Math.ceil(var1) * 903659007;
         this.field2491 = (int)Math.ceil(Math.sqrt(var3));
         this.field2490 = (int)Math.ceil(Math.sqrt(this.field2491 * this.field2491 + super.field1743 * -1256242689 * super.field1743 * -1256242689));
         this.field2493 = this.field2490 + (int)Math.ceil(Math.sqrt(this.field2491 * this.field2491 + this.field2492 * this.field2492));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfp;")
   @ObfuscatedName("qv")
   public AABB method5258(int var1) {
      return this.method5093(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lfs;ILfs;I[I)V")
   @ObfuscatedName("dp")
   public void method5121(classFS var1, int var2, classFS var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            classET var6 = var1.field2392[var2];
            classET var7 = var3.field2392[var4];
            classEM var8 = var6.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            method5239(-1);
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.field1913; var11++) {
               int var12 = var6.field1912[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.field1785[var12] == 0) {
                  this.method5249(var8.field1785[var12], var8.field1787[var12], var6.field1909[var11], var6.field1915[var11], var6.field1914[var11]);
               }
            }

            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            method5239(-1);
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.field1913; var17++) {
               int var18 = var7.field1912[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.field1785[var18] == 0) {
                  this.method5249(var8.field1785[var18], var8.field1787[var18], var7.field1909[var17], var7.field1915[var17], var7.field1914[var17]);
               }
            }

            classZG.method13998(this);
         } else {
            this.method5106(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method5101() {
      this.method5230();
      return this.field2491;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gy")
   public void method5208(int var1) {
      if (var1 != 0) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = (int)this.field2430[var2] + var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("bc")
   void method5221(classSN var1, int var2) {
      classEM var3 = var1.field5983;
      byte[] var4 = this.getFaceTransparencies();

      for (int var5 = 0; var5 < var3.field1786 * 1690200285; var5++) {
         int var6 = var3.field1785[var5];
         if (var6 == 5 && var1.field6002 != null && var1.field6002[var5 * 1 + 0] != 0 && this.field2443 != null && var4 != null) {
            int var7 = var1.field6002[var5 * 1 + 0];

            for (int var11 : var3.field1787[var5]) {
               if (var11 < this.field2443.length) {
                  int[] var12 = this.field2443[var11];

                  for (int var13 = 0; var13 < var12.length; var13++) {
                     int var14 = var12[var13];
                     int var15 = (int)((var4[var14] & 255) + var1.method10541(var7, var2) * 255.0F);
                     if (var15 < 0) {
                        var15 = 0;
                     } else if (var15 > 255) {
                        var15 = 255;
                     }

                     var4[var14] = (byte)var15;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("bp")
   void method5115(classEF var1, int var2) {
      NpcOverrides.method9089(this, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;IIIIIII)V")
   @ObfuscatedName("fr")
   public static void method5158(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0.field2489 != 2) {
         method5225(var0);
      }

      int var8 = classFH.method4705();
      int var9 = classFH.method4710();
      int var10 = field2465[var1];
      int var11 = field2473[var1];
      int var12 = field2465[var2];
      int var13 = field2473[var2];
      int var14 = field2465[var3];
      int var15 = field2473[var3];
      int var16 = field2465[var4];
      int var17 = field2473[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for (int var19 = 0; var19 < var0.field2424; var19++) {
         int var20 = (int)var0.field2427[var19];
         int var21 = (int)var0.field2430[var19];
         int var22 = (int)var0.field2426[var19];
         if (var3 != 0) {
            int var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            int var29 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var29;
         }

         if (var2 != 0) {
            int var30 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var30;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         int var31 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2451[var19] = var22 - var18;
         field2466[var19] = var8 + var20 * classFH.method4727() / var22;
         field2452[var19] = var9 + var31 * classFH.method4727() / var22;
         field2450[var19] = var22;
         if (var0.field2437 != null) {
            field2470[var19] = var20;
            field2453[var19] = var31;
            field2476[var19] = var22;
         }
      }

      try {
         var0.method5171(false, false, false, 0L);
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("az")
   void method5069(int var1, int var2, int var3) {
      this.method5248(var1, var2, var3);
      this.field2427 = new float[var1];
      this.field2430 = new float[var1];
      this.field2426 = new float[var1];
      this.field2429 = new int[var2];
      this.field2432 = new int[var2];
      this.field2433 = new int[var2];
      this.field2434 = new int[var2];
      this.field2428 = new int[var2];
      this.field2435 = new int[var2];
      if (var3 > 0) {
         this.field2439 = new int[var3];
         this.field2440 = new int[var3];
         this.field2441 = new int[var3];
      }
   }

   public int getXYZMag() {
      return this.field2491;
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("fn")
   final void method5170(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2493 < 6000) {
         for (int var6 = 0; var6 < this.field2493; var6++) {
            field2455[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = classFH.method4731();

         for (int var8 = 0; var8 < this.field2419; var8++) {
            if (this.field2435[var8] == -2) {
               field2449[var8] = true;
            } else {
               if (this.field2423 != classFZ.field2517) {
                  if (classFH.field2257.field2217 == 1 && (this.field2444 == null || this.field2444[var8] == 0) && this.field2425 == 0) {
                     field2449[var8] = true;
                     continue;
                  }

                  if (classFH.field2257.field2217 == 0 && (this.field2444 != null && this.field2444[var8] != 0 || this.field2425 != 0)) {
                     field2449[var8] = true;
                     continue;
                  }
               }

               int var9 = this.field2429[var8];
               int var10 = this.field2432[var8];
               int var11 = this.field2433[var8];
               float var12 = field2466[var9];
               float var13 = field2466[var10];
               float var14 = field2466[var11];
               field2463[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field2463[var8]) {
                  int var15 = field2470[var9];
                  int var16 = field2470[var10];
                  int var17 = field2470[var11];
                  int var18 = field2453[var9];
                  int var19 = field2453[var10];
                  int var20 = field2453[var11];
                  int var21 = field2476[var9];
                  int var22 = field2476[var10];
                  int var23 = field2476[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field2449[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field2449[var8] = (var12 - var13) * (field2452[var11] - field2452[var10]) - (field2452[var9] - field2452[var10]) * (var14 - var13) <= 0.0F;
                  field2445[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && classDG.method3077(
                        (int)field2452[var9], (int)field2452[var10], (int)field2452[var11], (int)var12, (int)var13, (int)var14, var30, -2043306261
                     )) {
                     int var35 = (int)(field2450[var9] + field2450[var10] + field2450[var11]) / 3;
                     classGI.method5448(var4, var35, -1325273292);
                  }
               }
            }
         }

         short var31 = this.field2499;
         boolean var32 = false;
         if (classFH.field2257.field2215.method4840()) {
            this.field2499 = (short)this.field2419;
         } else if (this.field2422 != null && this.field2422.method4840()) {
            classFL.method4827(classFH.field2257.field2215, this.field2422);
            var32 = true;
         }

         try {
            if (!classFH.method4735()) {
               method5179(this, true);
            } else {
               classFZ var33 = this.field2423;
               if (var33 == classFZ.field2515) {
                  if (classFH.field2257.field2217 != 0 && this.field2444 != null) {
                     var33 = classFZ.field2516;
                  } else {
                     var33 = classFZ.field2518;
                  }
               }

               switch (var33.field2514) {
                  case 1:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     method5179(this, false);
                     break;
                  case 2:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     method5179(this, true);
                     classFH.field2257.field2210 = 0;
                     classFH.field2257.field2216 = -1;
                     method5179(this, true);
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     break;
                  case 3:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     this.method5175();
                     break;
                  case 4:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     this.method5175();
               }
            }
         } finally {
            this.field2499 = var31;
            if (var32) {
               classFL.method4836(classFH.field2257.field2215);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)Lfx;")
   @ObfuscatedName("cm")
   Model method5088(boolean var1, Model var2, byte[] var3) {
      var2.field2424 = this.field2424;
      var2.field2419 = this.field2419;
      var2.field2418 = this.field2418;
      if (var2.field2427 == null || var2.field2427.length < this.field2424) {
         var2.field2427 = new float[this.field2424 + 1497599298];
         var2.field2430 = new float[this.field2424 + 100];
         var2.field2426 = new float[this.field2424 + 100];
      }

      for (int var4 = 0; var4 < this.field2424; var4++) {
         var2.field2427[var4] = this.field2427[var4];
         var2.field2430[var4] = this.field2430[var4];
         var2.field2426[var4] = this.field2426[var4];
      }

      if (var1) {
         var2.field2444 = this.field2444;
      } else {
         var2.field2444 = var3;
         if (this.field2444 == null) {
            for (int var5 = 0; var5 < this.field2419; var5++) {
               var2.field2444[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.field2419; var6++) {
               var2.field2444[var6] = this.field2444[var6];
            }
         }
      }

      var2.field2429 = this.field2429;
      var2.field2432 = this.field2432;
      var2.field2433 = this.field2433;
      var2.field2434 = this.field2434;
      var2.field2428 = this.field2428;
      var2.field2435 = this.field2435;
      var2.field2431 = this.field2431;
      var2.field2436 = this.field2436;
      var2.field2437 = this.field2437;
      var2.field2438 = this.field2438;
      var2.field2420 = this.field2420;
      var2.field2439 = this.field2439;
      var2.field2440 = this.field2440;
      var2.field2441 = this.field2441;
      var2.field2442 = this.field2442;
      var2.field2443 = this.field2443;
      var2.field2508 = this.field2508;
      var2.field2507 = this.field2507;
      var2.field2421 = this.field2421;
      var2.field2422 = this.field2422;
      var2.field2499 = this.field2499;
      var2.field2425 = this.field2425;
      classZG.method13998(var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "([Lfx;I)V")
   @ObfuscatedName("zp")
   public void method5224(Model[] var1, int var2) {
      this.method5241();
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("bj")
   void method5249(int var1, int[] var2, int var3, int var4, int var5) {
      assert classOE.client.isClientThread();

      this.method5228(rl21.field5728, var1, var2, var3, var4, var5);
   }

   public int getFaceCount() {
      return this.field2419;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("iz")
   public void method5219(Model var1) {
      if (var1 != null && this.field2506 != null && var1.field2506 != null) {
         for (int var2 = 0; var2 < var1.field2419; var2++) {
            this.field2506[this.field2419 + var2] = var1.field2506[var2];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lem;Lsn;I[ZZZ)V")
   @ObfuscatedName("bm")
   public void method5125(classEM var1, classSN var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      classEF var7 = var1.method3924((byte)-21);
      if (var7 != null) {
         var7.method3873(var2, var3, var4, var5, (byte)123);
         if (var6) {
            this.method5115(var7, var2.method10516(912562354));
         }
      }

      if (!var5 && classSN.method10518(var2, 286256297)) {
         this.method5221(var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method5245() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         this.field2427[var1] = -this.field2427[var1];
         this.field2426[var1] = -this.field2426[var1];
      }

      this.method5257();
   }

   public int[] getFaceColors1() {
      return this.field2434;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("ir")
   public void method5259(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      this.method5163(var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eo")
   public void method5174() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         float var2 = this.field2426[var1];
         this.field2426[var1] = this.field2427[var1];
         this.field2427[var1] = -var2;
      }

      this.method5257();
   }

   public byte getTransparency() {
      return this.field2425;
   }

   public int getDiameter() {
      return this.field2493;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   public void method5144(int var1) {
      int var2 = field2465[var1];
      int var3 = field2473[var1];

      for (int var4 = 0; var4 < this.field2424; var4++) {
         int var5 = (int)this.field2430[var4] * var3 - (int)this.field2426[var4] * var2 >> 16;
         this.field2426[var4] = (int)this.field2430[var4] * var2 + (int)this.field2426[var4] * var3 >> 16;
         this.field2430[var4] = var5;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bb")
   public void method5233(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = this.field2427[var4] + var1;
         this.field2430[var4] = this.field2430[var4] + var2;
         this.field2426[var4] = this.field2426[var4] + var3;
      }

      this.method5257();
   }

   public int getVerticesCount() {
      return this.field2424;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bi")
   public void method5237(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = var1 * this.field2427[var4] / 128.0F;
         this.field2430[var4] = var2 * this.field2430[var4] / 128.0F;
         this.field2426[var4] = var3 * this.field2426[var4] / 128.0F;
      }

      this.method5257();
   }

   public int getRadius() {
      return this.field2490;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("be")
   public final void method5250(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var16 = var7;
         int var15 = var6;
         int var14 = var5;
         int var12 = var3;
         int var11 = var2;
         int var10 = var1;
         Model var9 = this;
         if (this.field2489 != 2) {
            method5225(this);
         }

         int var17 = classFH.method4705();
         int var18 = classFH.method4710();
         int var19 = field2465[var1];
         int var20 = field2473[var1];
         int var21 = field2465[var2];
         int var22 = field2473[var2];
         int var23 = field2465[var3];
         int var24 = field2473[var3];
         int var25 = field2465[var4];
         int var26 = field2473[var4];
         int var27 = var6 * var25 + var7 * var26 >> 16;

         for (int var28 = 0; var28 < var9.field2424; var28++) {
            int var29 = (int)var9.field2427[var28];
            int var30 = (int)var9.field2430[var28];
            int var31 = (int)var9.field2426[var28];
            if (var12 != 0) {
               int var32 = var30 * var23 + var29 * var24 >> 16;
               var30 = var30 * var24 - var29 * var23 >> 16;
               var29 = var32;
            }

            if (var10 != 0) {
               int var39 = var30 * var20 - var31 * var19 >> 16;
               var31 = var30 * var19 + var31 * var20 >> 16;
               var30 = var39;
            }

            if (var11 != 0) {
               int var40 = var31 * var21 + var29 * var22 >> 16;
               var31 = var31 * var22 - var29 * var21 >> 16;
               var29 = var40;
            }

            var29 += var14;
            var30 += var15;
            var31 += var16;
            int var41 = var30 * var26 - var31 * var25 >> 16;
            var31 = var30 * var25 + var31 * var26 >> 16;
            field2451[var28] = var31 - var27;
            field2466[var28] = var17 + var29 * classFH.method4727() / var31;
            field2452[var28] = var18 + var41 * classFH.method4727() / var31;
            field2450[var28] = var31;
            if (var9.field2437 != null) {
               field2470[var28] = var29;
               field2453[var28] = var41;
               field2476[var28] = var31;
            }
         }

         try {
            var9.method5171(false, false, false, 0L);
         } catch (Exception var33) {
         }
      } catch (Exception var34) {
         client.logger.debug("failed drawing model", var34);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("lx")
   @Override
   void vmethod415(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("ei")
   public void method5148(classUL var1) {
      classUZ var2 = classHZ.method6135(16777216);

      for (int var3 = 0; var3 < this.field2424; var3++) {
         var2.method11728((int)this.field2427[var3], (int)this.field2430[var3], (int)this.field2426[var3], 2115498524);
         var2.method11780(var1, -1949319718);
         this.field2427[var3] = var2.field6427;
         this.field2430[var3] = var2.field6425;
         this.field2426[var3] = var2.field6426;
      }

      classUZ.method11727(var2, 1774614733);
      classZG.method13998(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;I[IIII)V")
   @ObfuscatedName("yg")
   public static void method5129(Model var0, int var1, int[] var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method5096();
      }

      int var6 = var2.length;
      if (var1 == 0) {
         int var21 = 0;
         field2486 = 0;
         field2488 = 0;
         field2487 = 0;

         for (int var25 = 0; var25 < var6; var25++) {
            int var29 = var2[var25];
            if (var29 < var0.field2442.length) {
               int[] var33 = var0.field2442[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var39 = var33[var37];
                  field2486 = field2486 + (int)var0.field2427[var39];
                  field2488 = field2488 + (int)var0.field2430[var39];
                  field2487 = field2487 + (int)var0.field2426[var39];
                  var21++;
               }
            }
         }

         if (var21 > 0) {
            field2486 = field2486 / var21 + var3;
            field2488 = field2488 / var21 + var4;
            field2487 = field2487 / var21 + var5;
         } else {
            field2486 = var3;
            field2488 = var4;
            field2487 = var5;
         }
      } else if (var1 == 1) {
         for (int var20 = 0; var20 < var6; var20++) {
            int var24 = var2[var20];
            if (var24 < var0.field2442.length) {
               int[] var28 = var0.field2442[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  var0.field2427[var36] = (int)var0.field2427[var36] + var3;
                  var0.field2430[var36] = (int)var0.field2430[var36] + var4;
                  var0.field2426[var36] = (int)var0.field2426[var36] + var5;
               }
            }
         }
      } else if (var1 == 2) {
         for (int var19 = 0; var19 < var6; var19++) {
            int var23 = var2[var19];
            if (var23 < var0.field2442.length) {
               int[] var27 = var0.field2442[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  var0.field2427[var35] = (int)var0.field2427[var35] - field2486;
                  var0.field2430[var35] = (int)var0.field2430[var35] - field2488;
                  var0.field2426[var35] = (int)var0.field2426[var35] - field2487;
                  int var38 = (var3 & 1124927192) * 8;
                  int var13 = (var4 & 0xFF) * 8;
                  int var14 = (var5 & 0xFF) * 8;
                  if (var14 != 0) {
                     int var15 = field2465[var14];
                     int var16 = field2473[var14];
                     int var17 = (int)var0.field2430[var35] * var15 + (int)var0.field2427[var35] * var16 >> 16;
                     var0.field2430[var35] = (int)var0.field2430[var35] * var16 - (int)var0.field2427[var35] * var15 >> 16;
                     var0.field2427[var35] = var17;
                  }

                  if (var38 != 0) {
                     int var40 = field2465[var38];
                     int var42 = field2473[var38];
                     int var44 = (int)var0.field2430[var35] * var42 - (int)var0.field2426[var35] * var40 >> 16;
                     var0.field2426[var35] = (int)var0.field2430[var35] * var40 + (int)var0.field2426[var35] * var42 >> 16;
                     var0.field2430[var35] = var44;
                  }

                  if (var13 != 0) {
                     int var41 = field2465[var13];
                     int var43 = field2473[var13];
                     int var45 = (int)var0.field2426[var35] * var41 + (int)var0.field2427[var35] * var43 >> 16;
                     var0.field2426[var35] = (int)var0.field2426[var35] * var43 - (int)var0.field2427[var35] * var41 >> 16;
                     var0.field2427[var35] = var45;
                  }

                  var0.field2427[var35] = (int)var0.field2427[var35] + field2486;
                  var0.field2430[var35] = (int)var0.field2430[var35] + field2488;
                  var0.field2426[var35] = (int)var0.field2426[var35] + field2487;
               }
            }
         }
      } else if (var1 == 3) {
         for (int var18 = 0; var18 < var6; var18++) {
            int var22 = var2[var18];
            if (var22 < var0.field2442.length) {
               int[] var26 = var0.field2442[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  var0.field2427[var34] = (int)var0.field2427[var34] - field2486;
                  var0.field2430[var34] = (int)var0.field2430[var34] - field2488;
                  var0.field2426[var34] = (int)var0.field2426[var34] - field2487;
                  var0.field2427[var34] = (int)var0.field2427[var34] * var3 / -1716346759;
                  var0.field2430[var34] = (int)var0.field2430[var34] * var4 / 1756641002;
                  var0.field2426[var34] = (int)var0.field2426[var34] * var5 / 128;
                  var0.field2427[var34] = (int)var0.field2427[var34] + field2486;
                  var0.field2430[var34] = (int)var0.field2430[var34] + field2488;
                  var0.field2426[var34] = (int)var0.field2426[var34] + field2487;
               }
            }
         }
      } else if (var1 == 5) {
         if (var0.field2443 != null && var0.field2444 != null) {
            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var2[var7];
               if (var8 < var0.field2443.length) {
                  int[] var9 = var0.field2443[var8];

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     int var11 = var9[var10];
                     int var12 = (var0.field2444[var11] & 255) + var3 * 8;
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 255) {
                        var12 = -2034739518;
                     }

                     var0.field2444[var11] = (byte)var12;
                  }
               }
            }
         }
      }
   }

   public int[] getFaceIndices2() {
      return this.field2432;
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("ms")
   @Override
   void vmethod419(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null) {
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         classUG var8 = classMQ.method7640(-1562594477);
         var8.field6305.method11373(var1 * 0.0030679614F, 0.0F, 0.0F, 996505715);
         var8.field6306.method11728(1.0F, 1.0F, 1.0F, 1881271103);
         var8.field6307.method11728(var3, var4, var5, 2067038293);
         classUU var9 = classRM.method10129(1778071523);
         var9.method11642(var8, 1963133204);
         classUU.method11594(var9, var2, 802951699);
         int var10 = (int)var9.method11625(0.0F, 0.0F, 0.0F, -1839417560);
         boolean var11 = false;
         int var12 = var10 - this.field2490;
         boolean var13 = var12 <= 50 || this.field2437 != null;
         boolean var15 = var6 != 0L;
         if (var15) {
            boolean var16 = (int)(var6 >>> 19 & 1L) == 1;
            var15 = !var16;
         }

         boolean var30 = false;
         if (var15 && classAS.method660(2120718781)) {
            int var19 = classFH.method4705();
            int var20 = classFH.method4710();
            int var21 = classFH.method4727();
            boolean var22 = classFO.field2352;
            boolean var17;
            if (!var22) {
               var17 = false;
            } else {
               classVL.method11993(var2, var19, var20, var21, 2082928416);
               var17 = GrandExchangeOffer.method7619(
                  this, var1, var3 - -1365423377 * classFM.field2315, var4 - classCP.field1202 * 1448483213, var5 - -417087201 * classVR.field6560, (byte)32
               );
            }

            if (var17) {
               if (this.field2421) {
                  int var25 = classFH.method4705();
                  int var26 = classFH.method4710();
                  int var27 = classFH.method4727();
                  classVL.method11993(var2, var25, var26, var27, 678266870);
                  int var23 = classSZ.method10730(
                     var3 - classFM.field2315 * -1365423377,
                     var4 - 1448483213 * classCP.field1202,
                     var5 - -417087201 * classVR.field6560,
                     -1163968665 * client.field1069,
                     classDX.field1662 * -639123865,
                     classDU.field1633 * -1674330987,
                     classDB.field1375 * 1788691143,
                     1768347607 * classYJ.field6994,
                     World.field1165 * -1569185711,
                     this.method5093(var1),
                     -474044496
                  );
                  int var28 = var23 + 32;
                  classGI.method5448(var6, var28, -1753576533);
               } else {
                  var30 = true;
               }
            }
         }

         int var31 = classFH.method4705();
         int var18 = classFH.method4710();

         for (int var32 = 0; var32 < this.field2424; var32++) {
            float var33 = (int)this.field2427[var32];
            float var35 = (int)this.field2430[var32];
            float var37 = (int)this.field2426[var32];
            var9.method11616(var33, var35, var37, field2446, 1634822735);
            var33 = field2446[0];
            var35 = field2446[1];
            var37 = field2446[2];
            var11 |= classKD.method6465(this, var32, var33, var35, var37, var10, var31, var18, var13);
         }

         var8.method11306(182636645);
         var9.method11555(1862795037);

         try {
            this.method5171(var11, var30, this.field2421, var6);
         } catch (Exception var29) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mk")
   @Override
   void vmethod416(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("ej")
   void method5130(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      if (var1 == 0) {
         int var21 = 0;
         field2486 = 0;
         field2488 = 0;
         field2487 = 0;

         for (int var25 = 0; var25 < var6; var25++) {
            int var29 = var2[var25];
            if (var29 < this.field2442.length) {
               int[] var33 = this.field2442[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var39 = var33[var37];
                  field2486 = field2486 + (int)this.field2427[var39];
                  field2488 = field2488 + (int)this.field2430[var39];
                  field2487 = field2487 + (int)this.field2426[var39];
                  var21++;
               }
            }
         }

         if (var21 > 0) {
            field2486 = field2486 / var21 + var3;
            field2488 = field2488 / var21 + var4;
            field2487 = field2487 / var21 + var5;
         } else {
            field2486 = var3;
            field2488 = var4;
            field2487 = var5;
         }
      } else if (var1 == 1) {
         for (int var20 = 0; var20 < var6; var20++) {
            int var24 = var2[var20];
            if (var24 < this.field2442.length) {
               int[] var28 = this.field2442[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  this.field2427[var36] = (int)this.field2427[var36] + var3;
                  this.field2430[var36] = (int)this.field2430[var36] + var4;
                  this.field2426[var36] = (int)this.field2426[var36] + var5;
               }
            }
         }
      } else if (var1 == 2) {
         for (int var19 = 0; var19 < var6; var19++) {
            int var23 = var2[var19];
            if (var23 < this.field2442.length) {
               int[] var27 = this.field2442[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  this.field2427[var35] = (int)this.field2427[var35] - field2486;
                  this.field2430[var35] = (int)this.field2430[var35] - field2488;
                  this.field2426[var35] = (int)this.field2426[var35] - field2487;
                  int var38 = (var3 & 0xFF) * 8;
                  int var13 = (var4 & 0xFF) * 8;
                  int var14 = (var5 & 593523257) * 8;
                  if (var14 != 0) {
                     int var15 = field2465[var14];
                     int var16 = field2473[var14];
                     int var17 = (int)this.field2430[var35] * var15 + (int)this.field2427[var35] * var16 >> 16;
                     this.field2430[var35] = (int)this.field2430[var35] * var16 - (int)this.field2427[var35] * var15 >> 16;
                     this.field2427[var35] = var17;
                  }

                  if (var38 != 0) {
                     int var40 = field2465[var38];
                     int var42 = field2473[var38];
                     int var44 = (int)this.field2430[var35] * var42 - (int)this.field2426[var35] * var40 >> 16;
                     this.field2426[var35] = (int)this.field2430[var35] * var40 + (int)this.field2426[var35] * var42 >> 16;
                     this.field2430[var35] = var44;
                  }

                  if (var13 != 0) {
                     int var41 = field2465[var13];
                     int var43 = field2473[var13];
                     int var45 = (int)this.field2426[var35] * var41 + (int)this.field2427[var35] * var43 >> 16;
                     this.field2426[var35] = (int)this.field2426[var35] * var43 - (int)this.field2427[var35] * var41 >> 16;
                     this.field2427[var35] = var45;
                  }

                  this.field2427[var35] = (int)this.field2427[var35] + field2486;
                  this.field2430[var35] = (int)this.field2430[var35] + field2488;
                  this.field2426[var35] = (int)this.field2426[var35] + field2487;
               }
            }
         }
      } else if (var1 == 3) {
         for (int var18 = 0; var18 < var6; var18++) {
            int var22 = var2[var18];
            if (var22 < this.field2442.length) {
               int[] var26 = this.field2442[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  this.field2427[var34] = (int)this.field2427[var34] - field2486;
                  this.field2430[var34] = (int)this.field2430[var34] - field2488;
                  this.field2426[var34] = (int)this.field2426[var34] - field2487;
                  this.field2427[var34] = (int)this.field2427[var34] * var3 / 128;
                  this.field2430[var34] = (int)this.field2430[var34] * var4 / 128;
                  this.field2426[var34] = (int)this.field2426[var34] * var5 / 128;
                  this.field2427[var34] = (int)this.field2427[var34] + field2486;
                  this.field2430[var34] = (int)this.field2430[var34] + field2488;
                  this.field2426[var34] = (int)this.field2426[var34] + field2487;
               }
            }
         }
      } else if (var1 == 5) {
         if (this.field2443 != null && this.field2444 != null) {
            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var2[var7];
               if (var8 < this.field2443.length) {
                  int[] var9 = this.field2443[var8];

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     int var11 = var9[var10];
                     int var12 = (this.field2444[var11] & -671553839) + var3 * 8;
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 255) {
                        var12 = 255;
                     }

                     this.field2444[var11] = (byte)var12;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   void method5182() {
      for (int var1 = 0; var1 < 12; var1++) {
         field2457[var1] = 0;
         field2480[var1] = 0;
      }

      for (int var13 = this.field2493 - 1; var13 >= 0; var13--) {
         char var2 = field2455[var13];
         if (var2 > 0) {
            char[] var3 = field2456[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.field2431[var5];
               int var7 = field2457[var6]++;
               field2458[var6][var7] = var5;
               if (var6 < 10) {
                  field2480[var6] = field2480[var6] + var13;
               } else if (var6 == 10) {
                  field2459[var7] = var13;
               } else {
                  field2467[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field2457[1] > 0 || field2457[2] > 0) {
         var14 = (field2480[1] + field2480[2]) / (field2457[1] + field2457[2]);
      }

      int var15 = 0;
      if (field2457[3] > 0 || field2457[4] > 0) {
         var15 = (field2480[3] + field2480[4]) / (field2457[3] + field2457[4]);
      }

      int var16 = 0;
      if (field2457[6] > 0 || field2457[8] > 0) {
         var16 = (field2480[6] + field2480[8]) / (field2457[6] + field2457[8]);
      }

      int var18 = 0;
      int var19 = field2457[10];
      int[] var20 = field2458[10];
      int[] var8 = field2459;
      if (var18 == var19) {
         var18 = 0;
         var19 = field2457[11];
         var20 = field2458[11];
         var8 = field2467;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = field2457[var9];
         int[] var11 = field2458[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method5187(var11[var12]);
         }
      }

      while (var17 != -1000) {
         this.method5187(var20[var18++]);
         if (var18 == var19 && var20 != field2458[11]) {
            var18 = 0;
            var20 = field2458[11];
            var19 = field2457[11];
            var8 = field2467;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   public int[] getFaceIndices1() {
      return this.field2429;
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;I[IFFF)V")
   @ObfuscatedName("jw")
   public void method5247(rl21 var1, int var2, int[] var3, float var4, float var5, float var6) {
      if (var2 == 0) {
         int var7 = 0;
         var1.field5731 = var1.field5729 = var1.field5730 = 0.0F;

         for (int var8 = 0; var8 < var3.length; var8++) {
            int var9 = var3[var8];
            if (var9 < this.field2442.length) {
               int[] var10 = this.field2442[var9];

               for (int var11 = 0; var11 < var10.length; var11++) {
                  int var12 = var10[var11];
                  var1.field5731 = var1.field5731 + this.field2427[var12];
                  var1.field5729 = var1.field5729 + this.field2430[var12];
                  var1.field5730 = var1.field5730 + this.field2426[var12];
                  var7++;
               }
            }
         }

         if (var7 > 0) {
            var1.field5731 = var4 + var1.field5731 / var7;
            var1.field5729 = var5 + var1.field5729 / var7;
            var1.field5730 = var6 + var1.field5730 / var7;
         } else {
            var1.field5731 = var4;
            var1.field5729 = var5;
            var1.field5730 = var6;
         }
      } else if (var2 == 1) {
         for (int var22 = 0; var22 < var3.length; var22++) {
            int var26 = var3[var22];
            if (var26 < this.field2442.length) {
               int[] var30 = this.field2442[var26];

               for (int var34 = 0; var34 < var30.length; var34++) {
                  int var38 = var30[var34];
                  this.field2427[var38] = this.field2427[var38] + var4;
                  this.field2430[var38] = this.field2430[var38] + var5;
                  this.field2426[var38] = this.field2426[var38] + var6;
               }
            }
         }
      } else if (var2 == 2) {
         float var23 = var4 * 8.0F * 0.0030679617F;
         float var27 = var5 * 8.0F * 0.0030679617F;
         float var31 = var6 * 8.0F * 0.0030679617F;
         float var35 = 0.0F;
         float var39 = 0.0F;
         float var42 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         if (var23 != 0.0F) {
            var35 = (float)Math.sin(var23);
            var39 = (float)Math.cos(var23);
         }

         if (var27 != 0.0F) {
            var42 = (float)Math.sin(var27);
            var13 = (float)Math.cos(var27);
         }

         if (var31 != 0.0F) {
            var14 = (float)Math.sin(var31);
            var15 = (float)Math.cos(var31);
         }

         for (int var16 = 0; var16 < var3.length; var16++) {
            int var17 = var3[var16];
            if (var17 < this.field2442.length) {
               int[] var18 = this.field2442[var17];

               for (int var19 = 0; var19 < var18.length; var19++) {
                  int var20 = var18[var19];
                  this.field2427[var20] = this.field2427[var20] - var1.field5731;
                  this.field2430[var20] = this.field2430[var20] - var1.field5729;
                  this.field2426[var20] = this.field2426[var20] - var1.field5730;
                  if (var31 != 0.0F) {
                     float var21 = var14 * this.field2430[var20] + var15 * this.field2427[var20];
                     this.field2430[var20] = var15 * this.field2430[var20] - var14 * this.field2427[var20];
                     this.field2427[var20] = var21;
                  }

                  if (var23 != 0.0F) {
                     float var44 = var39 * this.field2430[var20] - var35 * this.field2426[var20];
                     this.field2426[var20] = var35 * this.field2430[var20] + var39 * this.field2426[var20];
                     this.field2430[var20] = var44;
                  }

                  if (var27 != 0.0F) {
                     float var45 = var42 * this.field2426[var20] + var13 * this.field2427[var20];
                     this.field2426[var20] = var13 * this.field2426[var20] - var42 * this.field2427[var20];
                     this.field2427[var20] = var45;
                  }

                  this.field2427[var20] = this.field2427[var20] + var1.field5731;
                  this.field2430[var20] = this.field2430[var20] + var1.field5729;
                  this.field2426[var20] = this.field2426[var20] + var1.field5730;
               }
            }
         }
      } else if (var2 == 3) {
         for (int var24 = 0; var24 < var3.length; var24++) {
            int var28 = var3[var24];
            if (var28 < this.field2442.length) {
               int[] var32 = this.field2442[var28];

               for (int var36 = 0; var36 < var32.length; var36++) {
                  int var40 = var32[var36];
                  this.field2427[var40] = this.field2427[var40] - var1.field5731;
                  this.field2430[var40] = this.field2430[var40] - var1.field5729;
                  this.field2426[var40] = this.field2426[var40] - var1.field5730;
                  this.field2427[var40] = var4 * this.field2427[var40] / 128.0F;
                  this.field2430[var40] = var5 * this.field2430[var40] / 128.0F;
                  this.field2426[var40] = var6 * this.field2426[var40] / 128.0F;
                  this.field2427[var40] = this.field2427[var40] + var1.field5731;
                  this.field2430[var40] = this.field2430[var40] + var1.field5729;
                  this.field2426[var40] = this.field2426[var40] + var1.field5730;
               }
            }
         }
      } else if (var2 == 5 && this.field2443 != null && this.field2444 != null) {
         for (int var25 = 0; var25 < var3.length; var25++) {
            int var29 = var3[var25];
            if (var29 < this.field2443.length) {
               int[] var33 = this.field2443[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var41 = var33[var37];
                  int var43 = (this.field2444[var41] & 255) + (int)var4 * 8;
                  if (var43 < 0) {
                     var43 = 0;
                  } else if (var43 > 255) {
                     var43 = 255;
                  }

                  this.field2444[var41] = (byte)var43;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cr")
   boolean method5189(int var1) {
      return var1 < this.field2499;
   }

   public int[] getTexIndices2() {
      return this.field2440;
   }

   public byte getOverrideLuminance() {
      return this.field2422 != null ? this.field2422.field2302 : 0;
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("cu")
   final void method5191(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.field2437 != null && this.field2437[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.field2436 != null && this.field2436[var1] != -1) {
            int var17 = this.field2436[var1] & 255;
            var18 = this.field2439[var17];
            var15 = this.field2440[var17];
            var16 = this.field2441[var17];
         } else {
            var18 = this.field2429[var1];
            var15 = this.field2432[var1];
            var16 = this.field2433[var1];
         }

         if (this.field2435[var1] == -1) {
            classFH.method4767(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field2470[var18],
               field2470[var15],
               field2470[var16],
               field2453[var18],
               field2453[var15],
               field2453[var16],
               field2476[var18],
               field2476[var15],
               field2476[var16],
               this.field2437[var1]
            );
         } else {
            classFH.method4767(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field2470[var18],
               field2470[var15],
               field2470[var16],
               field2453[var18],
               field2453[var15],
               field2453[var16],
               field2476[var18],
               field2476[var15],
               field2476[var16],
               this.field2437[var1]
            );
         }
      } else {
         boolean var14 = this.method5189(var1);
         if (this.field2435[var1] == -1 && var14) {
            classFH.method4773(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2462[this.field2434[var1]]);
         } else if (this.field2435[var1] == -1) {
            classFH.method4762(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2462[this.field2434[var1]]);
         } else if (var14) {
            classFH.method4772(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            classFH.method4758(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Z)Lfx;")
   @ObfuscatedName("la")
   public Model method5220(rl21 var1, boolean var2) {
      if (!var2 && var1.field5724.length < this.field2419) {
         var1.field5724 = new byte[this.field2419 + 100];
      }

      return this.method5263(var2, var1.field5723, var1.field5724);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cb")
   final void method5193(int var1) {
      int var2 = classFH.method4705();
      int var3 = classFH.method4710();
      int var4 = 0;
      int var5 = this.field2429[var1];
      int var6 = this.field2432[var1];
      int var7 = this.field2433[var1];
      int var8 = field2476[var5];
      int var9 = field2476[var6];
      int var10 = field2476[var7];
      if (var8 >= 50) {
         field2478[var4] = (int)field2466[var5];
         field2479[var4] = (int)field2452[var5];
         field2454[var4] = field2450[var5];
         field2482[var4++] = this.field2434[var1];
      } else {
         int var11 = field2470[var5];
         int var12 = field2453[var5];
         int var13 = this.field2434[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * field2469[var10 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var7] - var11) * var14 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var7] - var12) * var14 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2435[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var35 = (50 - var8) * field2469[var9 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var6] - var11) * var35 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var6] - var12) * var35 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2428[var1] - var13) * var35 >> 16);
         }
      }

      if (var9 >= 50) {
         field2478[var4] = (int)field2466[var6];
         field2479[var4] = (int)field2452[var6];
         field2454[var4] = field2450[var6];
         field2482[var4++] = this.field2428[var1];
      } else {
         int var26 = field2470[var6];
         int var29 = field2453[var6];
         int var32 = this.field2428[var1];
         if (var8 >= 50) {
            int var36 = (50 - var9) * field2469[var8 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var5] - var26) * var36 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var5] - var29) * var36 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2434[var1] - var32) * var36 >> 16);
         }

         if (var10 >= 50) {
            int var37 = (50 - var9) * field2469[var10 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var7] - var26) * var37 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var7] - var29) * var37 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2435[var1] - var32) * var37 >> 16);
         }
      }

      if (var10 >= 50) {
         field2478[var4] = (int)field2466[var7];
         field2479[var4] = (int)field2452[var7];
         field2454[var4] = field2450[var7];
         field2482[var4++] = this.field2435[var1];
      } else {
         int var27 = field2470[var7];
         int var30 = field2453[var7];
         int var33 = this.field2435[var1];
         if (var9 >= 50) {
            int var38 = (50 - var10) * field2469[var9 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var6] - var27) * var38 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var6] - var30) * var38 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2428[var1] - var33) * var38 >> 16);
         }

         if (var8 >= 50) {
            int var39 = (50 - var10) * field2469[var8 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var5] - var27) * var39 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var5] - var30) * var39 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2434[var1] - var33) * var39 >> 16);
         }
      }

      int var28 = field2478[0];
      int var31 = field2478[1];
      int var34 = field2478[2];
      int var40 = field2479[0];
      int var15 = field2479[1];
      int var16 = field2479[2];
      int var17 = this.field2438 == null ? 0 : this.field2438[var1] * 2;
      float var18 = classJE.method6356(field2454[0] - var17, 2136660051);
      float var19 = classJE.method6356(field2454[1] - var17, 2127606892);
      float var20 = classJE.method6356(field2454[2] - var17, 2086644271);
      classFH.field2257.field2211 = false;
      int var21 = classFH.method4731();
      if (var4 == 3) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
            classFH.field2257.field2211 = true;
         }

         this.method5191(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
      }

      if (var4 == 4) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field2478[3] < 0 || field2478[3] > var21) {
            classFH.field2257.field2211 = true;
         }

         if (this.field2437 != null && this.field2437[var1] != -1) {
            int var24;
            int var41;
            int var43;
            if (this.field2436 != null && this.field2436[var1] != -1) {
               int var25 = this.field2436[var1] & 255;
               var41 = this.field2439[var25];
               var43 = this.field2440[var25];
               var24 = this.field2441[var25];
            } else {
               var41 = var5;
               var43 = var6;
               var24 = var7;
            }

            short var44 = this.field2437[var1];
            if (this.field2435[var1] == -1) {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            } else {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  field2482[0],
                  field2482[1],
                  field2482[2],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  field2482[0],
                  field2482[2],
                  field2482[3],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            }
         } else {
            boolean var22 = this.method5189(var1);
            if (this.field2435[var1] == -1 && var22) {
               int var42 = field2462[this.field2434[var1]];
               classFH.method4773(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
               classFH.method4773(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var42);
            } else if (this.field2435[var1] == -1) {
               int var23 = field2462[this.field2434[var1]];
               classFH.method4762(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
               classFH.method4762(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var23);
            } else if (var22) {
               classFH.method4772(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4772(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            } else {
               classFH.method4758(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4758(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("us")
   public static void method5098(Model var0) {
      if (var0 == null) {
         var0.getVerticesCount();
      }

      if (var0.field2489 != 2) {
         var0.field2489 = 2;
         var0.field2491 = 0;

         for (int var1 = 0; var1 < var0.field2424; var1++) {
            int var2 = (int)var0.field2427[var1];
            int var3 = (int)var0.field2430[var1];
            int var4 = (int)var0.field2426[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > var0.field2491) {
               var0.field2491 = var5;
            }
         }

         var0.field2491 = (int)(Math.sqrt(var0.field2491) + 0.99);
         var0.field2490 = var0.field2491;
         var0.field2493 = var0.field2491 + var0.field2491;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;Lsn;I)V")
   @ObfuscatedName("hm")
   public static void method5109(Model var0, classSN var1, int var2) {
      if (var0 == null) {
         var0.method5112(var1, var2);
      }

      classEM var3 = var1.field5983;
      classEF var4 = var3.method3924((byte)90);
      if (var4 != null) {
         var4.method3865(var1, var2, -1468766705);
         var0.method5115(var4, var1.method10516(-1499030123));
      }

      if (classSN.method10518(var1, 1772783837)) {
         var0.method5221(var1, var2);
      }

      classZG.method13998(var0);
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I)V")
   @ObfuscatedName("bn")
   public void method5106(classFS var1, int var2) {
      if (this.field2442 != null) {
         if (var2 != -1) {
            classET var3 = var1.field2392[var2];
            classEM var4 = var3.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            method5239(-1);

            for (int var5 = 0; var5 < var3.field1913; var5++) {
               int var6 = var3.field1912[var5];
               this.method5249(var4.field1785[var6], var4.field1787[var6], var3.field1909[var5], var3.field1915[var5], var3.field1914[var5]);
            }

            classZG.method13998(this);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method5175() {
      for (int var1 = 0; var1 < this.field2419; var1++) {
         if (!field2449[var1]) {
            this.method5187(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;)V")
   @ObfuscatedName("gz")
   void method5197(int var1, classUU var2) {
      float var3 = (int)this.field2427[var1];
      float var4 = -((int)this.field2430[var1]);
      float var5 = -((int)this.field2426[var1]);
      float var6 = 1.0F;
      this.field2427[var1] = var2.field6385 * var3 + var2.field6398 * var4 + var2.field6401 * var5 + var2.field6400 * var6;
      this.field2430[var1] = -((int)(var2.field6392 * var3 + var2.field6386 * var4 + var2.field6389 * var5 + var2.field6399 * var6));
      this.field2426[var1] = -((int)(var2.field6394 * var3 + var2.field6391 * var4 + var2.field6387 * var5 + var2.field6395 * var6));
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)Lfx;")
   @ObfuscatedName("dc")
   Model method5089(boolean var1, Model var2, byte[] var3) {
      var2.field2424 = this.field2424;
      var2.field2419 = this.field2419;
      var2.field2418 = this.field2418;
      if (var2.field2427 == null || var2.field2427.length < this.field2424) {
         var2.field2427 = new float[this.field2424 + 100];
         var2.field2430 = new float[this.field2424 + 100];
         var2.field2426 = new float[this.field2424 + 100];
      }

      for (int var4 = 0; var4 < this.field2424; var4++) {
         var2.field2427[var4] = this.field2427[var4];
         var2.field2430[var4] = this.field2430[var4];
         var2.field2426[var4] = this.field2426[var4];
      }

      if (var1) {
         var2.field2444 = this.field2444;
      } else {
         var2.field2444 = var3;
         if (this.field2444 == null) {
            for (int var5 = 0; var5 < this.field2419; var5++) {
               var2.field2444[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.field2419; var6++) {
               var2.field2444[var6] = this.field2444[var6];
            }
         }
      }

      var2.field2429 = this.field2429;
      var2.field2432 = this.field2432;
      var2.field2433 = this.field2433;
      var2.field2434 = this.field2434;
      var2.field2428 = this.field2428;
      var2.field2435 = this.field2435;
      var2.field2431 = this.field2431;
      var2.field2436 = this.field2436;
      var2.field2437 = this.field2437;
      var2.field2438 = this.field2438;
      var2.field2420 = this.field2420;
      var2.field2439 = this.field2439;
      var2.field2440 = this.field2440;
      var2.field2441 = this.field2441;
      var2.field2442 = this.field2442;
      var2.field2443 = this.field2443;
      var2.field2508 = this.field2508;
      var2.field2507 = this.field2507;
      var2.field2421 = this.field2421;
      var2.field2422 = this.field2422;
      var2.field2499 = this.field2499;
      var2.field2425 = this.field2425;
      classZG.method13998(var2);
      return var2;
   }

   public int[] getFaceIndices3() {
      return this.field2433;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cy")
   public void method5232(int var1) {
      if (var1 != 0) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = this.field2430[var2] + var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("ml")
   @Override
   void vmethod420(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null) {
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         classUG var8 = classMQ.method7640(-1972315157);
         var8.field6305.method11373(var1 * 0.0030679614F, 0.0F, 0.0F, -730815713);
         var8.field6306.method11728(1.0F, 1.0F, 1.0F, 1856106547);
         var8.field6307.method11728(var3, var4, var5, 2083064542);
         classUU var9 = classRM.method10129(1778071523);
         var9.method11642(var8, 1339616684);
         classUU.method11594(var9, var2, -444615886);
         int var10 = (int)var9.method11625(0.0F, 0.0F, 0.0F, -1706408908);
         boolean var11 = false;
         int var12 = var10 - this.field2490;
         boolean var13 = var12 <= 50 || this.field2437 != null;
         boolean var15 = var6 != 0L;
         if (var15) {
            boolean var16 = (int)(var6 >>> 19 & 1L) == 1;
            var15 = !var16;
         }

         boolean var30 = false;
         if (var15 && classAS.method660(1964944400)) {
            int var19 = classFH.method4705();
            int var20 = classFH.method4710();
            int var21 = classFH.method4727();
            boolean var22 = classFO.field2352;
            boolean var17;
            if (!var22) {
               var17 = false;
            } else {
               classVL.method11993(var2, var19, var20, var21, -2041222024);
               var17 = GrandExchangeOffer.method7619(
                  this, var1, var3 - -1365423377 * classFM.field2315, var4 - classCP.field1202 * 1448483213, var5 - -417087201 * classVR.field6560, (byte)-34
               );
            }

            if (var17) {
               if (this.field2421) {
                  int var25 = classFH.method4705();
                  int var26 = classFH.method4710();
                  int var27 = classFH.method4727();
                  classVL.method11993(var2, var25, var26, var27, -1851788954);
                  int var23 = classSZ.method10730(
                     var3 - classFM.field2315 * -1365423377,
                     var4 - 1448483213 * classCP.field1202,
                     var5 - -417087201 * classVR.field6560,
                     -1163968665 * client.field1069,
                     classDX.field1662 * -639123865,
                     classDU.field1633 * -1674330987,
                     classDB.field1375 * 1788691143,
                     1768347607 * classYJ.field6994,
                     World.field1165 * -1569185711,
                     this.method5093(var1),
                     1622140609
                  );
                  int var28 = var23 + 32;
                  classGI.method5448(var6, var28, -688236266);
               } else {
                  var30 = true;
               }
            }
         }

         int var31 = classFH.method4705();
         int var18 = classFH.method4710();

         for (int var32 = 0; var32 < this.field2424; var32++) {
            float var33 = (int)this.field2427[var32];
            float var35 = (int)this.field2430[var32];
            float var37 = (int)this.field2426[var32];
            var9.method11616(var33, var35, var37, field2446, 1634822735);
            var33 = field2446[0];
            var35 = field2446[1];
            var37 = field2446[2];
            var11 |= classKD.method6465(this, var32, var33, var35, var37, var10, var31, var18, var13);
         }

         var8.method11306(-1504735407);
         var9.method11555(1546527942);

         try {
            this.method5171(var11, var30, this.field2421, var6);
         } catch (Exception var29) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("me")
   @Override
   void vmethod417(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mt")
   @Override
   void vmethod418(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mq")
   @Override
   void vmethod414(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("nh")
   public void method5229(Model var1) {
      this.field2503 = var1.field2503;
      this.field2504 = var1.field2504;
      this.field2505 = var1.field2505;
      this.field2506 = var1.field2506;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("sz")
   public Model method5260() {
      this.method5245();
      return this;
   }

   public short[] getUnlitFaceColors() {
      return this.field2506;
   }

   public void calculateBoundsCylinder() {
      this.method5230();
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("eb")
   public void method5151(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] + var1;
         this.field2430[var4] = (int)this.field2430[var4] + var2;
         this.field2426[var4] = (int)this.field2426[var4] + var3;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lem;Let;Let;FI)V")
   @ObfuscatedName("ua")
   public void method5236(rl21 var1, classEM var2, classET var3, classET var4, float var5, int var6) {
      if (var4 != null && var5 != 0.0F) {
         int var26 = 0;
         int var27 = 0;

         for (int var9 = 0; var9 < var2.field1786 * 1690200285; var9++) {
            boolean var10 = false;
            if (var26 < var3.field1913 && var3.field1912[var26] == var9) {
               var10 = true;
            }

            boolean var11 = false;
            if (var27 < var4.field1913 && var4.field1912[var27] == var9) {
               var11 = true;
            }

            if (var10 || var11) {
               short var12 = 0;
               int var13 = var2.field1785[var9];
               if (var13 == 3) {
                  var12 = 128;
               }

               int var14 = var12;
               int var15 = var12;
               int var16 = var12;
               if (var10) {
                  var14 = var3.field1909[var26];
                  var15 = var3.field1915[var26];
                  var16 = var3.field1914[var26];
                  var26++;
               }

               int var17 = var12;
               int var18 = var12;
               int var19 = var12;
               if (var11) {
                  var17 = var4.field1909[var27];
                  var18 = var4.field1915[var27];
                  var19 = var4.field1914[var27];
                  var27++;
               }

               float var20;
               float var21;
               float var22;
               if (var13 == 2) {
                  int var23 = var17 - var14 & 0xFF;
                  int var24 = var18 - var15 & 0xFF;
                  int var25 = var19 - var16 & 0xFF;
                  if (var23 >= 128) {
                     var23 -= 256;
                  }

                  if (var24 >= 128) {
                     var24 -= 256;
                  }

                  if (var25 >= 128) {
                     var25 -= 256;
                  }

                  var20 = var14 + var23 * var5 / var6;
                  var21 = var15 + var24 * var5 / var6;
                  var22 = var16 + var25 * var5 / var6;
               } else if (var13 == 5) {
                  var20 = var14;
                  var21 = 0.0F;
                  var22 = 0.0F;
               } else {
                  var20 = var14 + (var17 - var14) * var5 / var6;
                  var21 = var15 + (var18 - var15) * var5 / var6;
                  var22 = var16 + (var19 - var16) * var5 / var6;
               }

               this.method5247(var1, var13, var2.field1787[var9], var20, var21, var22);
            }
         }
      } else {
         for (int var7 = 0; var7 < var3.field1913; var7++) {
            int var8 = var3.field1912[var7];
            this.method5247(var1, var2.field1785[var8], var2.field1787[var8], var3.field1909[var7], var3.field1915[var7], var3.field1914[var7]);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("em")
   public void method5145(int var1) {
      int var2 = field2465[var1];
      int var3 = field2473[var1];

      for (int var4 = 0; var4 < this.field2424; var4++) {
         int var5 = (int)this.field2430[var4] * var3 - (int)this.field2426[var4] * var2 >> 16;
         this.field2426[var4] = (int)this.field2430[var4] * var2 + (int)this.field2426[var4] * var3 >> 16;
         this.field2430[var4] = var5;
      }

      classZG.method13998(this);
   }

   public int[] getTexIndices3() {
      return this.field2441;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ck")
   void method5070(int var1, int var2, int var3) {
      this.field2427 = new float[var1];
      this.field2430 = new float[var1];
      this.field2426 = new float[var1];
      this.field2429 = new int[var2];
      this.field2432 = new int[var2];
      this.field2433 = new int[var2];
      this.field2434 = new int[var2];
      this.field2428 = new int[var2];
      this.field2435 = new int[var2];
      if (var3 > 0) {
         this.field2439 = new int[var3];
         this.field2440 = new int[var3];
         this.field2441 = new int[var3];
      }
   }

   public float[] getVerticesZ() {
      return this.field2426;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ca")
   void method5071(int var1, int var2, int var3) {
      this.field2427 = new float[var1];
      this.field2430 = new float[var1];
      this.field2426 = new float[var1];
      this.field2429 = new int[var2];
      this.field2432 = new int[var2];
      this.field2433 = new int[var2];
      this.field2434 = new int[var2];
      this.field2428 = new int[var2];
      this.field2435 = new int[var2];
      if (var3 > 0) {
         this.field2439 = new int[var3];
         this.field2440 = new int[var3];
         this.field2441 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cc")
   void method5072(int var1, int var2, int var3) {
      this.field2427 = new float[var1];
      this.field2430 = new float[var1];
      this.field2426 = new float[var1];
      this.field2429 = new int[var2];
      this.field2432 = new int[var2];
      this.field2433 = new int[var2];
      this.field2434 = new int[var2];
      this.field2428 = new int[var2];
      this.field2435 = new int[var2];
      if (var3 > 0) {
         this.field2439 = new int[var3];
         this.field2440 = new int[var3];
         this.field2441 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("fs")
   boolean method5167(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field2451[var1] = (int)var4 - var5;
      if (var8) {
         field2470[var1] = (int)var2;
         field2453[var1] = (int)var3;
         field2476[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         field2466[var1] = var6 + var2 * classFH.method4727() / var4;
         field2452[var1] = var7 + var3 * classFH.method4727() / var4;
         field2450[var1] = var4;
         return false;
      } else {
         field2466[var1] = -5000.0F;
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gj")
   public void method5209(int var1) {
      if (var1 != 0) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = (int)this.field2430[var2] + var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("cz")
   void method5077(Model var1) {
      if (var1 != null) {
         this.method5074(var1);

         for (int var2 = 0; var2 < var1.field2419; var2++) {
            this.field2429[this.field2419] = var1.field2429[var2] + this.field2424;
            this.field2432[this.field2419] = var1.field2432[var2] + this.field2424;
            this.field2433[this.field2419] = var1.field2433[var2] + this.field2424;
            this.field2434[this.field2419] = var1.field2434[var2];
            this.field2428[this.field2419] = var1.field2428[var2];
            this.field2435[this.field2419] = var1.field2435[var2];
            if (this.field2431 != null) {
               this.field2431[this.field2419] = var1.field2431 != null ? var1.field2431[var2] : var1.field2420;
            }

            if (this.field2444 != null && var1.field2444 != null) {
               this.field2444[this.field2419] = var1.field2444[var2];
            }

            if (this.field2437 != null) {
               this.field2437[this.field2419] = var1.field2437 != null ? var1.field2437[var2] : -1;
            }

            if (this.field2436 != null) {
               if (var1.field2436 != null && var1.field2436[var2] != -1) {
                  this.field2436[this.field2419] = (byte)(var1.field2436[var2] + this.field2418);
               } else {
                  this.field2436[this.field2419] = -1;
               }
            }

            if (this.field2438 != null && var1.field2438 != null) {
               this.field2438[this.field2419] = var1.field2438[var2];
            }

            this.field2419++;
         }

         for (int var3 = 0; var3 < var1.field2418; var3++) {
            this.field2439[this.field2418] = var1.field2439[var3] + this.field2424;
            this.field2440[this.field2418] = var1.field2440[var3] + this.field2424;
            this.field2441[this.field2418] = var1.field2441[var3] + this.field2424;
            this.field2418++;
         }

         for (int var4 = 0; var4 < var1.field2424; var4++) {
            this.field2427[this.field2424] = var1.field2427[var4];
            this.field2430[this.field2424] = var1.field2430[var4];
            this.field2426[this.field2424] = var1.field2426[var4];
            this.field2424++;
         }
      }
   }

   public void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.method5161(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lfx;")
   @ObfuscatedName("xf")
   public Model method5079(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method5230();
      int var7 = var2 - this.field2491;
      int var8 = var2 + this.field2491;
      int var9 = var4 - this.field2491;
      int var10 = var4 + this.field2491;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model(this);
               var11.field2430 = new float[var11.field2424];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.field2424; var12++) {
                  int var13 = (int)this.field2427[var12] + var2;
                  int var14 = (int)this.field2426[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2430[var12] = (int)this.field2430[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.field2424; var27++) {
                  int var28 = (-((int)this.field2430[var27]) << 16) / (this.field1743 * -1256242689);
                  if (var28 < var6) {
                     int var29 = (int)this.field2427[var27] + var2;
                     int var30 = (int)this.field2426[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field2430[var27] = (int)this.field2430[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field2430[var27] = this.field2430[var27];
                  }
               }
            }

            classZG.method13998(var11);
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gt")
   public void method5102() {
      this.field2489 = 0;
      this.field2497 = null;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("cj")
   public Model method5082(boolean var1) {
      if (!var1 && field2472.length < this.field2419) {
         field2472 = new byte[this.field2419 + -463814622];
      }

      return this.method5087(var1, field2447, field2472);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gs")
   public void method5210(int var1) {
      if (var1 != 0) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = (int)this.field2430[var2] + var1;
         }
      }
   }

   public void setBufferOffset(int var1) {
      this.field2495 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("ce")
   public Model method5085(boolean var1) {
      if (!var1 && field2474.length < this.field2419) {
         field2474 = new byte[this.field2419 + 100];
      }

      return this.method5087(var1, field2471, field2474);
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I)V")
   @ObfuscatedName("dv")
   public void method5107(classFS var1, int var2) {
      if (this.field2442 != null) {
         if (var2 != -1) {
            classET var3 = var1.field2392[var2];
            classEM var4 = var3.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;

            for (int var5 = 0; var5 < var3.field1913; var5++) {
               int var6 = var3.field1912[var5];
               this.method5249(var4.field1785[var6], var4.field1787[var6], var3.field1909[var5], var3.field1915[var5], var3.field1914[var5]);
            }

            classZG.method13998(this);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dz")
   public void method5132() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2427[var1];
         this.field2427[var1] = this.field2426[var1];
         this.field2426[var1] = -var2;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("fg")
   public final void method5159(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field2489 != 2) {
         method5225(this);
      }

      int var8 = classFH.method4705();
      int var9 = classFH.method4710();
      int var10 = field2465[var1];
      int var11 = field2473[var1];
      int var12 = field2465[var2];
      int var13 = field2473[var2];
      int var14 = field2465[var3];
      int var15 = field2473[var3];
      int var16 = field2465[var4];
      int var17 = field2473[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for (int var19 = 0; var19 < this.field2424; var19++) {
         int var20 = (int)this.field2427[var19];
         int var21 = (int)this.field2430[var19];
         int var22 = (int)this.field2426[var19];
         if (var3 != 0) {
            int var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            int var29 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var29;
         }

         if (var2 != 0) {
            int var30 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var30;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         int var31 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2451[var19] = var22 - var18;
         field2466[var19] = var8 + var20 * classFH.method4727() / var22;
         field2452[var19] = var9 + var31 * classFH.method4727() / var22;
         field2450[var19] = var22;
         if (this.field2437 != null) {
            field2470[var19] = var20;
            field2453[var19] = var31;
            field2476[var19] = var22;
         }
      }

      try {
         this.method5171(false, false, false, 0L);
      } catch (Exception var24) {
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfp;")
   @ObfuscatedName("dx")
   AABB method5094(int var1) {
      for (AABB var2 = this.field2497; var2 != null; var2 = var2.field2371) {
         if (var2.field2364 * 1384390485 == var1) {
            return var2;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;)Ljava/lang/String;")
   @ObfuscatedName("xf")
   public static String method5068(classAAE var0) {
      return var0.field42;
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I[IZ)V")
   @ObfuscatedName("bt")
   public void method5127(classFS var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method5106(var1, var2);
      } else {
         classET var5 = var1.field2392[var2];
         classEM var6 = var5.field1911;
         int var7 = 0;
         int var8 = var3[var7++];
         field2486 = 0;
         field2488 = 0;
         field2487 = 0;
         method5239(-1);

         for (int var9 = 0; var9 < var5.field1913; var9++) {
            int var10 = var5.field1912[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.field1785[var10] == 0) {
                  this.method5249(var6.field1785[var10], var6.field1787[var10], var5.field1909[var9], var5.field1915[var9], var5.field1914[var9]);
               }
            } else if (var10 != var8 || var6.field1785[var10] == 0) {
               this.method5249(var6.field1785[var10], var6.field1787[var10], var5.field1909[var9], var5.field1915[var9], var5.field1914[var9]);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;Z)V")
   @ObfuscatedName("av")
   public static void method5179(Model var0, boolean var1) {
      if (var0 == null) {
         var0.method5181(var1);
      } else {
         for (char var2 = 0; var2 < var0.field2419; var2++) {
            if (!field2449[var2]) {
               int var3 = (field2451[var0.field2429[var2]] + field2451[var0.field2432[var2]] + field2451[var0.field2433[var2]]) / 3 + var0.field2490;
               char[] var10000 = field2456[var3];
               field2455[var3]++;
               var10000[field2455[var3]] = var2;
            }
         }

         if (var0.field2431 != null && var1) {
            var0.method5182();
         } else {
            for (int var6 = var0.field2493 - 1; var6 >= 0; var6--) {
               char var7 = field2455[var6];
               if (var7 > 0) {
                  char[] var4 = field2456[var6];

                  for (int var5 = 0; var5 < var7; var5++) {
                     var0.method5187(var4[var5]);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lfx;")
   @ObfuscatedName("ax")
   public Model method5080(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method5230();
      int var7 = var2 - this.field2491;
      int var8 = var2 + this.field2491;
      int var9 = var4 - this.field2491;
      int var10 = var4 + this.field2491;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model(this);
               var11.field2430 = new float[var11.field2424];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.field2424; var12++) {
                  int var13 = (int)this.field2427[var12] + var2;
                  int var14 = (int)this.field2426[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2430[var12] = (int)this.field2430[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.field2424; var27++) {
                  int var28 = (-((int)this.field2430[var27]) << 16) / (this.field1743 * -1256242689);
                  if (var28 < var6) {
                     int var29 = (int)this.field2427[var27] + var2;
                     int var30 = (int)this.field2426[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field2430[var27] = (int)this.field2430[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field2430[var27] = this.field2430[var27];
                  }
               }
            }

            classZG.method13998(var11);
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("ve")
   public void method5261(int var1, int[] var2, int var3, int var4, int var5) {
      this.method5249(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eh")
   public void method5096() {
      if (this.field2489 != 1) {
         this.field2489 = 1;
         this.field1743 = 0;
         this.field2492 = 0;
         this.field2491 = 0;

         for (int var1 = 0; var1 < this.field2424; var1++) {
            int var2 = (int)this.field2427[var1];
            int var3 = (int)this.field2430[var1];
            int var4 = (int)this.field2426[var1];
            if (-var3 > this.field1743 * -1256242689) {
               this.field1743 = -var3 * 903659007;
            }

            if (var3 > this.field2492) {
               this.field2492 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2491) {
               this.field2491 = var5;
            }
         }

         this.field2491 = (int)(Math.sqrt(this.field2491) + 0.99);
         this.field2490 = (int)(Math.sqrt(this.field2491 * this.field2491 + this.field1743 * -1256242689 * this.field1743 * -1256242689) + 0.99);
         this.field2493 = this.field2490 + (int)(Math.sqrt(this.field2491 * this.field2491 + this.field2492 * this.field2492) + 0.99);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dt")
   void method5099() {
      if (this.field2489 != 2) {
         this.field2489 = 2;
         this.field2491 = 0;

         for (int var1 = 0; var1 < this.field2424; var1++) {
            int var2 = (int)this.field2427[var1];
            int var3 = (int)this.field2430[var1];
            int var4 = (int)this.field2426[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field2491) {
               this.field2491 = var5;
            }
         }

         this.field2491 = (int)(Math.sqrt(this.field2491) + 0.99);
         this.field2490 = this.field2491;
         this.field2493 = this.field2491 + this.field2491;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lfs;I)V")
   @ObfuscatedName("wg")
   public static void method5108(Model var0, classFS var1, int var2) {
      if (var0.field2442 != null) {
         if (var2 != -1) {
            classET var3 = var1.field2392[var2];
            classEM var4 = var3.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;

            for (int var5 = 0; var5 < var3.field1913; var5++) {
               int var6 = var3.field1912[var5];
               var0.method5249(var4.field1785[var6], var4.field1787[var6], var3.field1909[var5], var3.field1915[var5], var3.field1914[var5]);
            }

            classZG.method13998(var0);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("ev")
   void method5131(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      if (var1 == 0) {
         int var21 = 0;
         field2486 = 0;
         field2488 = 0;
         field2487 = 0;

         for (int var25 = 0; var25 < var6; var25++) {
            int var29 = var2[var25];
            if (var29 < this.field2442.length) {
               int[] var33 = this.field2442[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var39 = var33[var37];
                  field2486 = field2486 + (int)this.field2427[var39];
                  field2488 = field2488 + (int)this.field2430[var39];
                  field2487 = field2487 + (int)this.field2426[var39];
                  var21++;
               }
            }
         }

         if (var21 > 0) {
            field2486 = field2486 / var21 + var3;
            field2488 = field2488 / var21 + var4;
            field2487 = field2487 / var21 + var5;
         } else {
            field2486 = var3;
            field2488 = var4;
            field2487 = var5;
         }
      } else if (var1 == 1) {
         for (int var20 = 0; var20 < var6; var20++) {
            int var24 = var2[var20];
            if (var24 < this.field2442.length) {
               int[] var28 = this.field2442[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  this.field2427[var36] = (int)this.field2427[var36] + var3;
                  this.field2430[var36] = (int)this.field2430[var36] + var4;
                  this.field2426[var36] = (int)this.field2426[var36] + var5;
               }
            }
         }
      } else if (var1 == 2) {
         for (int var19 = 0; var19 < var6; var19++) {
            int var23 = var2[var19];
            if (var23 < this.field2442.length) {
               int[] var27 = this.field2442[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  this.field2427[var35] = (int)this.field2427[var35] - field2486;
                  this.field2430[var35] = (int)this.field2430[var35] - field2488;
                  this.field2426[var35] = (int)this.field2426[var35] - field2487;
                  int var38 = (var3 & 0xFF) * 8;
                  int var13 = (var4 & 0xFF) * 8;
                  int var14 = (var5 & 0xFF) * 8;
                  if (var14 != 0) {
                     int var15 = field2465[var14];
                     int var16 = field2473[var14];
                     int var17 = (int)this.field2430[var35] * var15 + (int)this.field2427[var35] * var16 >> 16;
                     this.field2430[var35] = (int)this.field2430[var35] * var16 - (int)this.field2427[var35] * var15 >> 16;
                     this.field2427[var35] = var17;
                  }

                  if (var38 != 0) {
                     int var40 = field2465[var38];
                     int var42 = field2473[var38];
                     int var44 = (int)this.field2430[var35] * var42 - (int)this.field2426[var35] * var40 >> 16;
                     this.field2426[var35] = (int)this.field2430[var35] * var40 + (int)this.field2426[var35] * var42 >> 16;
                     this.field2430[var35] = var44;
                  }

                  if (var13 != 0) {
                     int var41 = field2465[var13];
                     int var43 = field2473[var13];
                     int var45 = (int)this.field2426[var35] * var41 + (int)this.field2427[var35] * var43 >> 16;
                     this.field2426[var35] = (int)this.field2426[var35] * var43 - (int)this.field2427[var35] * var41 >> 16;
                     this.field2427[var35] = var45;
                  }

                  this.field2427[var35] = (int)this.field2427[var35] + field2486;
                  this.field2430[var35] = (int)this.field2430[var35] + field2488;
                  this.field2426[var35] = (int)this.field2426[var35] + field2487;
               }
            }
         }
      } else if (var1 == 3) {
         for (int var18 = 0; var18 < var6; var18++) {
            int var22 = var2[var18];
            if (var22 < this.field2442.length) {
               int[] var26 = this.field2442[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  this.field2427[var34] = (int)this.field2427[var34] - field2486;
                  this.field2430[var34] = (int)this.field2430[var34] - field2488;
                  this.field2426[var34] = (int)this.field2426[var34] - field2487;
                  this.field2427[var34] = (int)this.field2427[var34] * var3 / 128;
                  this.field2430[var34] = (int)this.field2430[var34] * var4 / 128;
                  this.field2426[var34] = (int)this.field2426[var34] * var5 / 128;
                  this.field2427[var34] = (int)this.field2427[var34] + field2486;
                  this.field2430[var34] = (int)this.field2430[var34] + field2488;
                  this.field2426[var34] = (int)this.field2426[var34] + field2487;
               }
            }
         }
      } else if (var1 == 5) {
         if (this.field2443 != null && this.field2444 != null) {
            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var2[var7];
               if (var8 < this.field2443.length) {
                  int[] var9 = this.field2443[var8];

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     int var11 = var9[var10];
                     int var12 = (this.field2444[var11] & 255) + var3 * 8;
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 255) {
                        var12 = 255;
                     }

                     this.field2444[var11] = (byte)var12;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("et")
   public void method5103() {
      this.field2489 = 0;
      this.field2497 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("cf")
   void method5073(Model var1) {
      int var2 = this.field2429.length;
      if (this.field2431 == null && (var1.field2431 != null || this.field2420 != var1.field2420)) {
         this.field2431 = new byte[var2];
         Arrays.fill(this.field2431, this.field2420);
      }

      if (this.field2444 == null && var1.field2444 != null) {
         this.field2444 = new byte[var2];
         Arrays.fill(this.field2444, (byte)0);
      }

      if (this.field2437 == null && var1.field2437 != null) {
         this.field2437 = new short[var2];
         Arrays.fill(this.field2437, (short)-1);
      }

      if (this.field2436 == null && var1.field2436 != null) {
         this.field2436 = new byte[var2];
         Arrays.fill(this.field2436, (byte)-1);
      }

      if (this.field2438 == null && var1.field2438 != null) {
         this.field2438 = new byte[var2];
         Arrays.fill(this.field2438, (byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   void method5100() {
      if (this.field2489 != 2) {
         this.field2489 = 2;
         this.field2491 = 0;

         for (int var1 = 0; var1 < this.field2424; var1++) {
            int var2 = (int)this.field2427[var1];
            int var3 = (int)this.field2430[var1];
            int var4 = (int)this.field2426[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field2491) {
               this.field2491 = var5;
            }
         }

         this.field2491 = (int)(Math.sqrt(this.field2491) + 0.99);
         this.field2490 = this.field2491;
         this.field2493 = this.field2491 + this.field2491;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("do")
   public void method5110(classSN var1, int var2) {
      classEM var3 = var1.field5983;
      classEF var4 = var3.method3924((byte)16);
      if (var4 != null) {
         var4.method3865(var1, var2, -1468766705);
         this.method5115(var4, var1.method10516(2107780364));
      }

      if (classSN.method10518(var1, -397143478)) {
         this.method5221(var1, var2);
      }

      classZG.method13998(this);
   }

   public int[] getVertexNormalsX() {
      return this.field2503;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfp;")
   @ObfuscatedName("dy")
   AABB method5095(int var1) {
      for (AABB var2 = this.field2497; var2 != null; var2 = var2.field2371) {
         if (var2.field2364 * 1384390485 == var1) {
            return var2;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("dl")
   void method5113(classSN var1, int var2) {
      classEM var3 = var1.field5983;

      for (int var4 = 0; var4 < var3.field1786 * 1690200285; var4++) {
         int var5 = var3.field1785[var4];
         if (var5 == 5
            && var1.field6006 != null
            && var1.field6006[var4] != null
            && var1.field6006[var4][0] != null
            && this.field2443 != null
            && this.field2444 != null) {
            classSU var6 = var1.field6006[var4][0];

            for (int var10 : var3.field1787[var4]) {
               if (var10 < this.field2443.length) {
                  int[] var11 = this.field2443[var10];

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     int var13 = var11[var12];
                     int var14 = (int)((this.field2444[var13] & 255) + var6.method10658(var2, -792518208) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 1294318459;
                     }

                     this.field2444[var13] = (byte)var14;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("dq")
   void method5114(classSN var1, int var2) {
      classEM var3 = var1.field5983;

      for (int var4 = 0; var4 < var3.field1786 * 1690200285; var4++) {
         int var5 = var3.field1785[var4];
         if (var5 == 5
            && var1.field6006 != null
            && var1.field6006[var4] != null
            && var1.field6006[var4][0] != null
            && this.field2443 != null
            && this.field2444 != null) {
            classSU var6 = var1.field6006[var4][0];

            for (int var10 : var3.field1787[var4]) {
               if (var10 < this.field2443.length) {
                  int[] var11 = this.field2443[var10];

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     int var13 = var11[var12];
                     int var14 = (int)((this.field2444[var13] & 255) + var6.method10658(var2, -2135412554) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.field2444[var13] = (byte)var14;
                  }
               }
            }
         }
      }
   }

   public byte getOverrideHue() {
      return this.field2422 != null ? this.field2422.field2300 : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("df")
   void method5116(classEF var1, int var2) {
      NpcOverrides.method9089(this, var1, var2);
   }

   public void calculateExtreme(int var1) {
      this.method5092(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pg")
   public static void method5239(int var0) {
      assert classOE.client.isClientThread();

      rl21 var1 = rl21.field5728;
      var1.field5732 = var1.field5734 = var1.field5733 = 0;
      var1.field5731 = var1.field5729 = var1.field5730 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cs")
   public void method5227(float var1) {
      if (var1 != 1.0F) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = this.field2430[var2] * var1;
         }
      }
   }

   public int getBottomY() {
      return this.field2492;
   }

   @ObfuscatedSignature(descriptor = "(Lfs;ILfs;I[I)V")
   @ObfuscatedName("ey")
   public void method5122(classFS var1, int var2, classFS var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            classET var6 = var1.field2392[var2];
            classET var7 = var3.field2392[var4];
            classEM var8 = var6.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.field1913; var11++) {
               int var12 = var6.field1912[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.field1785[var12] == 0) {
                  this.method5249(var8.field1785[var12], var8.field1787[var12], var6.field1909[var11], var6.field1915[var11], var6.field1914[var11]);
               }
            }

            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.field1913; var17++) {
               int var18 = var7.field1912[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.field1785[var18] == 0) {
                  this.method5249(var8.field1785[var18], var8.field1787[var18], var7.field1909[var17], var7.field1915[var17], var7.field1914[var17]);
               }
            }

            classZG.method13998(this);
         } else {
            this.method5106(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ex")
   public void method5262() {
      method5225(this);
   }

   @ObfuscatedSignature(descriptor = "(Lfs;ILfs;I[I)V")
   @ObfuscatedName("br")
   public void method5123(classFS var1, int var2, classFS var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            classET var6 = var1.field2392[var2];
            classET var7 = var3.field2392[var4];
            classEM var8 = var6.field1911;
            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.field1913; var11++) {
               int var12 = var6.field1912[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.field1785[var12] == 0) {
                  this.method5249(var8.field1785[var12], var8.field1787[var12], var6.field1909[var11], var6.field1915[var11], var6.field1914[var11]);
               }
            }

            field2486 = 0;
            field2488 = 0;
            field2487 = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.field1913; var17++) {
               int var18 = var7.field1912[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.field1785[var18] == 0) {
                  this.method5249(var8.field1785[var18], var8.field1787[var18], var7.field1909[var17], var7.field1915[var17], var7.field1914[var17]);
               }
            }

            classZG.method13998(this);
         } else {
            this.method5106(var1, var2);
         }
      }
   }

   public float[] getVerticesY() {
      return this.field2430;
   }

   public void setSceneId(int var1) {
      this.field2496 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;I[IIII)V")
   @ObfuscatedName("mw")
   public void method5223(rl21 var1, int var2, int[] var3, int var4, int var5, int var6) {
      if (var2 == 0) {
         int var7 = 0;
         var1.field5732 = 0;
         var1.field5734 = 0;
         var1.field5733 = 0;

         for (int var8 = 0; var8 < var3.length; var8++) {
            int var9 = var3[var8];
            if (var9 < this.field2442.length) {
               int[] var10 = this.field2442[var9];

               for (int var11 = 0; var11 < var10.length; var11++) {
                  int var12 = var10[var11];
                  var1.field5732 = (int)(var1.field5732 + this.field2427[var12]);
                  var1.field5734 = (int)(var1.field5734 + this.field2430[var12]);
                  var1.field5733 = (int)(var1.field5733 + this.field2426[var12]);
                  var7++;
               }
            }
         }

         if (var7 > 0) {
            var1.field5732 = var4 + var1.field5732 / var7;
            var1.field5734 = var5 + var1.field5734 / var7;
            var1.field5733 = var6 + var1.field5733 / var7;
         } else {
            var1.field5732 = var4;
            var1.field5734 = var5;
            var1.field5733 = var6;
         }
      } else if (var2 == 1) {
         for (int var18 = 0; var18 < var3.length; var18++) {
            int var22 = var3[var18];
            if (var22 < this.field2442.length) {
               int[] var26 = this.field2442[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  this.field2427[var34] = this.field2427[var34] + var4;
                  this.field2430[var34] = this.field2430[var34] + var5;
                  this.field2426[var34] = this.field2426[var34] + var6;
               }
            }
         }
      } else if (var2 == 2) {
         for (int var19 = 0; var19 < var3.length; var19++) {
            int var23 = var3[var19];
            if (var23 < this.field2442.length) {
               int[] var27 = this.field2442[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  this.field2427[var35] = this.field2427[var35] - var1.field5732;
                  this.field2430[var35] = this.field2430[var35] - var1.field5734;
                  this.field2426[var35] = this.field2426[var35] - var1.field5733;
                  int var38 = (var4 & 0xFF) * 8;
                  int var13 = (var5 & 0xFF) * 8;
                  int var14 = (var6 & 0xFF) * 8;
                  if (var14 != 0) {
                     int var15 = classFH.field2253[var14];
                     int var16 = classFH.field2254[var14];
                     int var17 = var15 * (int)this.field2430[var35] + var16 * (int)this.field2427[var35] >> 16;
                     this.field2430[var35] = var16 * (int)this.field2430[var35] - var15 * (int)this.field2427[var35] >> 16;
                     this.field2427[var35] = var17;
                  }

                  if (var38 != 0) {
                     int var40 = classFH.field2253[var38];
                     int var42 = classFH.field2254[var38];
                     int var44 = var42 * (int)this.field2430[var35] - var40 * (int)this.field2426[var35] >> 16;
                     this.field2426[var35] = var40 * (int)this.field2430[var35] + var42 * (int)this.field2426[var35] >> 16;
                     this.field2430[var35] = var44;
                  }

                  if (var13 != 0) {
                     int var41 = classFH.field2253[var13];
                     int var43 = classFH.field2254[var13];
                     int var45 = var41 * (int)this.field2426[var35] + var43 * (int)this.field2427[var35] >> 16;
                     this.field2426[var35] = var43 * (int)this.field2426[var35] - var41 * (int)this.field2427[var35] >> 16;
                     this.field2427[var35] = var45;
                  }

                  this.field2427[var35] = this.field2427[var35] + var1.field5732;
                  this.field2430[var35] = this.field2430[var35] + var1.field5734;
                  this.field2426[var35] = this.field2426[var35] + var1.field5733;
               }
            }
         }
      } else if (var2 == 3) {
         for (int var20 = 0; var20 < var3.length; var20++) {
            int var24 = var3[var20];
            if (var24 < this.field2442.length) {
               int[] var28 = this.field2442[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  this.field2427[var36] = this.field2427[var36] - var1.field5732;
                  this.field2430[var36] = this.field2430[var36] - var1.field5734;
                  this.field2426[var36] = this.field2426[var36] - var1.field5733;
                  this.field2427[var36] = var4 * (int)this.field2427[var36] / 128;
                  this.field2430[var36] = var5 * (int)this.field2430[var36] / 128;
                  this.field2426[var36] = var6 * (int)this.field2426[var36] / 128;
                  this.field2427[var36] = this.field2427[var36] + var1.field5732;
                  this.field2430[var36] = this.field2430[var36] + var1.field5734;
                  this.field2426[var36] = this.field2426[var36] + var1.field5733;
               }
            }
         }
      } else if (var2 == 5 && this.field2443 != null && this.field2444 != null) {
         for (int var21 = 0; var21 < var3.length; var21++) {
            int var25 = var3[var21];
            if (var25 < this.field2443.length) {
               int[] var29 = this.field2443[var25];

               for (int var33 = 0; var33 < var29.length; var33++) {
                  int var37 = var29[var33];
                  int var39 = (this.field2444[var37] & 255) + var4 * 8;
                  if (var39 < 0) {
                     var39 = 0;
                  } else if (var39 > 255) {
                     var39 = 255;
                  }

                  this.field2444[var37] = (byte)var39;
               }
            }
         }
      }
   }

   Model() {
      this.field2419 = 0;
      this.field2420 = 0;
      this.field2418 = 0;
      this.field2421 = false;
      this.field2422 = null;
      this.field2423 = classFZ.field2515;
      this.field2425 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;ZLfx;[B)Lfx;")
   @ObfuscatedName("dn")
   public static Model method5090(Model var0, boolean var1, Model var2, byte[] var3) {
      var2.field2424 = var0.field2424;
      var2.field2419 = var0.field2419;
      var2.field2418 = var0.field2418;
      if (var2.field2427 == null || var2.field2427.length < var0.field2424) {
         var2.field2427 = new float[var0.field2424 + 2116082260];
         var2.field2430 = new float[var0.field2424 + -458330916];
         var2.field2426 = new float[var0.field2424 + -577404880];
      }

      for (int var4 = 0; var4 < var0.field2424; var4++) {
         var2.field2427[var4] = var0.field2427[var4];
         var2.field2430[var4] = var0.field2430[var4];
         var2.field2426[var4] = var0.field2426[var4];
      }

      if (var1) {
         var2.field2444 = var0.field2444;
      } else {
         var2.field2444 = var3;
         if (var0.field2444 == null) {
            for (int var5 = 0; var5 < var0.field2419; var5++) {
               var2.field2444[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < var0.field2419; var6++) {
               var2.field2444[var6] = var0.field2444[var6];
            }
         }
      }

      var2.field2429 = var0.field2429;
      var2.field2432 = var0.field2432;
      var2.field2433 = var0.field2433;
      var2.field2434 = var0.field2434;
      var2.field2428 = var0.field2428;
      var2.field2435 = var0.field2435;
      var2.field2431 = var0.field2431;
      var2.field2436 = var0.field2436;
      var2.field2437 = var0.field2437;
      var2.field2438 = var0.field2438;
      var2.field2420 = var0.field2420;
      var2.field2439 = var0.field2439;
      var2.field2440 = var0.field2440;
      var2.field2441 = var0.field2441;
      var2.field2442 = var0.field2442;
      var2.field2443 = var0.field2443;
      var2.field2508 = var0.field2508;
      var2.field2507 = var0.field2507;
      var2.field2421 = var0.field2421;
      var2.field2422 = var0.field2422;
      var2.field2499 = var0.field2499;
      var2.field2425 = var0.field2425;
      classZG.method13998(var2);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lef;I)V")
   @ObfuscatedName("nf")
   public static void method5117(Model var0, classEF var1, int var2) {
      if (var0 == null) {
         var0.method5119(var1, var2);
      }

      NpcOverrides.method9089(var0, var1, var2);
   }

   public float[] getVerticesX() {
      return this.field2427;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;III)V")
   @ObfuscatedName("ws")
   public static void method5155(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5071(var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.field2424; var4++) {
         var0.field2427[var4] = (int)var0.field2427[var4] * var1 / 128;
         var0.field2430[var4] = (int)var0.field2430[var4] * var2 / 128;
         var0.field2426[var4] = (int)var0.field2426[var4] * var3 / 128;
      }

      classZG.method13998(var0);
   }

   @ObfuscatedSignature(descriptor = "(Lfl;S)V")
   @ObfuscatedName("cd")
   public void method5205(classFL var1, short var2) {
      if (var1 == null) {
         classQG.method9520(this);
      } else {
         if (this.field2422 == null) {
            this.field2422 = new classFL();
         }

         classFL.method4827(this.field2422, var1);
         this.field2499 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I[IZ)V")
   @ObfuscatedName("es")
   public void method5128(classFS var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method5106(var1, var2);
      } else {
         classET var5 = var1.field2392[var2];
         classEM var6 = var5.field1911;
         int var7 = 0;
         int var8 = var3[var7++];
         field2486 = 0;
         field2488 = 0;
         field2487 = 0;

         for (int var9 = 0; var9 < var5.field1913; var9++) {
            int var10 = var5.field1912[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.field1785[var10] == 0) {
                  this.method5249(var6.field1785[var10], var6.field1787[var10], var5.field1909[var9], var5.field1915[var9], var5.field1914[var9]);
               }
            } else if (var10 != var8 || var6.field1785[var10] == 0) {
               this.method5249(var6.field1785[var10], var6.field1787[var10], var5.field1909[var9], var5.field1915[var9], var5.field1914[var9]);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ep")
   public void method5152(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] + var1;
         this.field2430[var4] = (int)this.field2430[var4] + var2;
         this.field2426[var4] = (int)this.field2426[var4] + var3;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   public void method5238() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         float var2 = this.field2427[var1];
         this.field2427[var1] = this.field2426[var1];
         this.field2426[var1] = -var2;
      }

      this.method5257();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gm")
   public void method5211(int var1) {
      if (var1 != 0) {
         for (int var2 = 0; var2 < this.field2424; var2++) {
            this.field2430[var2] = (int)this.field2430[var2] + var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kv")
   public void method5133() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2427[var1];
         this.field2427[var1] = this.field2426[var1];
         this.field2426[var1] = -var2;
      }

      classZG.method13998(this);
   }

   public void setUvBufferOffset(int var1) {
      this.field2494 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method5092(int var1) {
      AABB var2 = this.method5093(var1);
      if (var2 == null) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = field2473[var1];
         int var10 = field2465[var1];

         for (int var11 = 0; var11 < this.field2424; var11++) {
            int var12 = classAU.method695((int)this.field2427[var11], (int)this.field2426[var11], var9, var10, -1418703602);
            int var13 = (int)this.field2430[var11];
            int var14 = classUE.method11281((int)this.field2427[var11], (int)this.field2426[var11], var9, var10, 1397515973);
            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            if (var14 > var8) {
               var8 = var14;
            }
         }

         var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
         byte var16 = 32;
         if (var2.field2368 * 1301855055 < 32) {
            var2.field2368 = 854554080;
         }

         if (var2.field2370 * 2105673973 < 32) {
            var2.field2370 = -1282643040;
         }

         if (this.field2421) {
            byte var17 = 8;
            var2.field2368 += -860103304;
            var2.field2370 += 753081064;
         }

         var2.field2371 = this.field2497;
         this.field2497 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public void method5134() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2427[var1];
         this.field2427[var1] = this.field2426[var1];
         this.field2426[var1] = -var2;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lef;I)V")
   @ObfuscatedName("ia")
   public void method5240(rl21 var1, classEF var2, int var3) {
      if (this.field2508 != null) {
         for (int var4 = 0; var4 < this.field2424; var4++) {
            int[] var5 = this.field2508[var4];
            if (var5 != null && var5.length != 0) {
               int[] var6 = this.field2507[var4];
               var1.field5725.method11651();

               for (int var7 = 0; var7 < var5.length; var7++) {
                  int var8 = var5[var7];
                  classSG var9 = var2.method3874(var8);
                  if (var9 != null) {
                     float var10 = var6[var7] / 255.0F;
                     var1.field5726.method11659(var10, var10, var10);
                     var1.field5727.method11649(var9.method10420(var1, var3));
                     var1.field5727.method11652(var1.field5726);
                     var1.field5725.method11658(var1.field5727);
                  }
               }

               this.method5267(var4, var1.field5725);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)Lfx;")
   @ObfuscatedName("pj")
   public Model method5263(boolean var1, Model var2, byte[] var3) {
      return this.method5087(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eq")
   public void method5136() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         this.field2427[var1] = -((int)this.field2427[var1]);
         this.field2426[var1] = -((int)this.field2426[var1]);
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public void method5137() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         this.field2427[var1] = -((int)this.field2427[var1]);
         this.field2426[var1] = -((int)this.field2426[var1]);
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   public void method5138() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         this.field2427[var1] = -((int)this.field2427[var1]);
         this.field2426[var1] = -((int)this.field2426[var1]);
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void method5139() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2426[var1];
         this.field2426[var1] = this.field2427[var1];
         this.field2427[var1] = -var2;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("cv")
   public Model method5264(boolean var1) {
      return this.method5081(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eg")
   public void method5140() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2426[var1];
         this.field2426[var1] = this.field2427[var1];
         this.field2427[var1] = -var2;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method5141() {
      for (int var1 = 0; var1 < this.field2424; var1++) {
         int var2 = (int)this.field2426[var1];
         this.field2426[var1] = this.field2427[var1];
         this.field2427[var1] = -var2;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ef")
   public void method5146(int var1) {
      int var2 = field2465[var1];
      int var3 = field2473[var1];

      for (int var4 = 0; var4 < this.field2424; var4++) {
         int var5 = (int)this.field2430[var4] * var3 - (int)this.field2426[var4] * var2 >> 16;
         this.field2426[var4] = (int)this.field2430[var4] * var2 + (int)this.field2426[var4] * var3 >> 16;
         this.field2430[var4] = var5;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("du")
   public void method5104() {
      this.field2489 = 0;
      this.field2497 = null;
   }

   public void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method5250(var1, var2, var3, var4, var5, var6, var7);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("sa")
   public static void method5105(Model var0) {
      if (var0 == null) {
         var0.getVertexNormalsZ();
      }

      var0.field2489 = 0;
      var0.field2497 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ez")
   public void method5147(int var1) {
      int var2 = field2465[var1];
      int var3 = field2473[var1];

      for (int var4 = 0; var4 < this.field2424; var4++) {
         int var5 = (int)this.field2430[var4] * var3 - (int)this.field2426[var4] * var2 >> 16;
         this.field2426[var4] = (int)this.field2430[var4] * var2 + (int)this.field2426[var4] * var3 >> 16;
         this.field2430[var4] = var5;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bz")
   final void method5187(int var1) {
      if (this.field2425 != -1) {
         if (this.field2444 == null) {
            classFH.field2257.field2213 = 0;
         } else {
            classFH.field2257.field2213 = (this.field2444[var1] == -1 ? 253 : this.field2444[var1]) & 255;
         }

         if (this.field2425 != 0) {
            classFH.field2257.field2213 = GameEngine.method11089(this, classFH.field2257.field2213);
         }

         if (classFH.field2257.field2217 != 1 || classFH.field2257.field2213 != 0 || this.field2425 != 0) {
            if (classFH.field2257.field2217 != 0 || classFH.field2257.field2213 == 0) {
               if (field2463[var1]) {
                  this.method5193(var1);
               } else {
                  int var2 = this.field2429[var1];
                  int var3 = this.field2432[var1];
                  int var4 = this.field2433[var1];
                  classFH.field2257.field2211 = field2445[var1];
                  int var5 = this.field2438 == null ? 0 : this.field2438[var1] * 2;
                  float var6 = classJE.method6356(field2450[var2] - var5, 2098849775);
                  float var7 = classJE.method6356(field2450[var3] - var5, 2113670730);
                  float var8 = classJE.method6356(field2450[var4] - var5, 2103903816);
                  this.method5191(
                     var1,
                     field2452[var2],
                     field2452[var3],
                     field2452[var4],
                     field2466[var2],
                     field2466[var3],
                     field2466[var4],
                     var6,
                     var7,
                     var8,
                     this.field2434[var1],
                     this.field2428[var1],
                     this.field2435[var1]
                  );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("ee")
   public void method5149(classUL var1) {
      classUZ var2 = classHZ.method6135(16777216);

      for (int var3 = 0; var3 < this.field2424; var3++) {
         var2.method11728((int)this.field2427[var3], (int)this.field2430[var3], (int)this.field2426[var3], 1706466493);
         var2.method11780(var1, 893551407);
         this.field2427[var3] = var2.field6427;
         this.field2430[var3] = var2.field6425;
         this.field2426[var3] = var2.field6426;
      }

      classUZ.method11727(var2, 1758606309);
      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(III)Lfx;")
   @ObfuscatedName("ru")
   public Model method5265(int var1, int var2, int var3) {
      this.method5233(var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gg")
   public void method5200(byte var1) {
      this.field2425 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;I)V")
   @ObfuscatedName("di")
   public static void method5188(Model var0, int var1) {
      if (var0.field2425 != -1) {
         if (var0.field2444 == null) {
            classFH.field2257.field2213 = 0;
         } else {
            classFH.field2257.field2213 = (var0.field2444[var1] == -1 ? 253 : var0.field2444[var1]) & 255;
         }

         if (var0.field2425 != 0) {
            classFH.field2257.field2213 = GameEngine.method11089(var0, classFH.field2257.field2213);
         }

         if (classFH.field2257.field2217 != 1 || classFH.field2257.field2213 != 0 || var0.field2425 != 0) {
            if (classFH.field2257.field2217 != 0 || classFH.field2257.field2213 == 0) {
               if (field2463[var1]) {
                  var0.method5193(var1);
               } else {
                  int var2 = var0.field2429[var1];
                  int var3 = var0.field2432[var1];
                  int var4 = var0.field2433[var1];
                  classFH.field2257.field2211 = field2445[var1];
                  int var5 = var0.field2438 == null ? 0 : var0.field2438[var1] * 2;
                  float var6 = classJE.method6356(field2450[var2] - var5, 2099878350);
                  float var7 = classJE.method6356(field2450[var3] - var5, 2090890276);
                  float var8 = classJE.method6356(field2450[var4] - var5, 2115871006);
                  var0.method5191(
                     var1,
                     field2452[var2],
                     field2452[var3],
                     field2452[var4],
                     field2466[var2],
                     field2466[var3],
                     field2466[var4],
                     var6,
                     var7,
                     var8,
                     var0.field2434[var1],
                     var0.field2428[var1],
                     var0.field2435[var1]
                  );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("er")
   public void method5241() {
      if (this.field2503 == null && (client.field1096 & 4) == 4) {
         int var1 = this.getVerticesCount();
         this.field2503 = new int[var1];
         this.field2504 = new int[var1];
         this.field2505 = new int[var1];
         int[] var2 = this.getFaceIndices1();
         int[] var3 = this.getFaceIndices2();
         int[] var4 = this.getFaceIndices3();
         float[] var5 = this.getVerticesX();
         float[] var6 = this.getVerticesY();
         float[] var7 = this.getVerticesZ();

         for (int var8 = 0; var8 < this.getFaceCount(); var8++) {
            int var9 = var2[var8];
            int var10 = var3[var8];
            int var11 = var4[var8];
            int var12 = (int)(var5[var10] - var5[var9]);
            int var13 = (int)(var6[var10] - var6[var9]);
            int var14 = (int)(var7[var10] - var7[var9]);
            int var15 = (int)(var5[var11] - var5[var9]);
            int var16 = (int)(var6[var11] - var6[var9]);
            int var17 = (int)(var7[var11] - var7[var9]);
            int var18 = var13 * var17 - var16 * var14;
            int var19 = var14 * var15 - var17 * var12;

            int var20;
            for (var20 = var12 * var16 - var15 * var13;
               var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192;
               var20 >>= 1
            ) {
               var18 >>= 1;
               var19 >>= 1;
            }

            int var21 = (int)Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
            if (var21 <= 0) {
               var21 = 1;
            }

            var18 = var18 * 256 / var21;
            var19 = var19 * 256 / var21;
            var20 = var20 * 256 / var21;
            this.field2503[var9] = this.field2503[var9] + var18;
            this.field2504[var9] = this.field2504[var9] + var19;
            this.field2505[var9] = this.field2505[var9] + var20;
            this.field2503[var10] = this.field2503[var10] + var18;
            this.field2504[var10] = this.field2504[var10] + var19;
            this.field2505[var10] = this.field2505[var10] + var20;
            this.field2503[var11] = this.field2503[var11] + var18;
            this.field2504[var11] = this.field2504[var11] + var19;
            this.field2505[var11] = this.field2505[var11] + var20;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;I[IIII)V")
   @ObfuscatedName("gs")
   public void method5228(rl21 var1, int var2, int[] var3, int var4, int var5, int var6) {
      if ((client.field1096 & 8) != 0) {
         this.method5247(var1, var2, var3, var4, var5, var6);
      } else {
         this.method5223(var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("af")
   void method5074(Model var1) {
      int var2 = this.field2429.length;
      if (this.field2431 == null && (var1.field2431 != null || this.field2420 != var1.field2420)) {
         this.field2431 = new byte[var2];
         Arrays.fill(this.field2431, this.field2420);
      }

      if (this.field2444 == null && var1.field2444 != null) {
         this.field2444 = new byte[var2];
         Arrays.fill(this.field2444, (byte)0);
      }

      if (this.field2437 == null && var1.field2437 != null) {
         this.field2437 = new short[var2];
         Arrays.fill(this.field2437, (short)-1);
      }

      if (this.field2436 == null && var1.field2436 != null) {
         this.field2436 = new byte[var2];
         Arrays.fill(this.field2436, (byte)-1);
      }

      if (this.field2438 == null && var1.field2438 != null) {
         this.field2438 = new byte[var2];
         Arrays.fill(this.field2438, (byte)0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;I)V")
   @ObfuscatedName("dt")
   public static void method5212(Model var0, int var1) {
      if (var0 == null) {
         var0.method5238();
      }

      if (var1 != 0) {
         for (int var2 = 0; var2 < var0.field2424; var2++) {
            var0.field2430[var2] = (int)var0.field2430[var2] + var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ec")
   public void method5153(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] + var1;
         this.field2430[var4] = (int)this.field2430[var4] + var2;
         this.field2426[var4] = (int)this.field2426[var4] + var3;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lem;Lsn;I[ZZZ)V")
   @ObfuscatedName("ek")
   public void method5126(classEM var1, classSN var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      classEF var7 = var1.method3924((byte)-24);
      if (var7 != null) {
         var7.method3873(var2, var3, var4, var5, (byte)69);
         if (var6) {
            this.method5115(var7, var2.method10516(1853881563));
         }
      }

      if (!var5 && classSN.method10518(var2, 1617374318)) {
         this.method5221(var2, var3);
      }
   }

   public byte getOverrideAmount() {
      return this.field2422 != null ? this.field2422.field2303 : 0;
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)Lfx;")
   @ObfuscatedName("dm")
   Model method5091(boolean var1, Model var2, byte[] var3) {
      var2.field2424 = this.field2424;
      var2.field2419 = this.field2419;
      var2.field2418 = this.field2418;
      if (var2.field2427 == null || var2.field2427.length < this.field2424) {
         var2.field2427 = new float[this.field2424 + 100];
         var2.field2430 = new float[this.field2424 + 100];
         var2.field2426 = new float[this.field2424 + 100];
      }

      for (int var4 = 0; var4 < this.field2424; var4++) {
         var2.field2427[var4] = this.field2427[var4];
         var2.field2430[var4] = this.field2430[var4];
         var2.field2426[var4] = this.field2426[var4];
      }

      if (var1) {
         var2.field2444 = this.field2444;
      } else {
         var2.field2444 = var3;
         if (this.field2444 == null) {
            for (int var5 = 0; var5 < this.field2419; var5++) {
               var2.field2444[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.field2419; var6++) {
               var2.field2444[var6] = this.field2444[var6];
            }
         }
      }

      var2.field2429 = this.field2429;
      var2.field2432 = this.field2432;
      var2.field2433 = this.field2433;
      var2.field2434 = this.field2434;
      var2.field2428 = this.field2428;
      var2.field2435 = this.field2435;
      var2.field2431 = this.field2431;
      var2.field2436 = this.field2436;
      var2.field2437 = this.field2437;
      var2.field2438 = this.field2438;
      var2.field2420 = this.field2420;
      var2.field2439 = this.field2439;
      var2.field2440 = this.field2440;
      var2.field2441 = this.field2441;
      var2.field2442 = this.field2442;
      var2.field2443 = this.field2443;
      var2.field2508 = this.field2508;
      var2.field2507 = this.field2507;
      var2.field2421 = this.field2421;
      var2.field2422 = this.field2422;
      var2.field2499 = this.field2499;
      var2.field2425 = this.field2425;
      classZG.method13998(var2);
      return var2;
   }

   public int[] getFaceColors2() {
      return this.field2428;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fy")
   public void method5156(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] * var1 / 128;
         this.field2430[var4] = (int)this.field2430[var4] * var2 / 128;
         this.field2426[var4] = (int)this.field2426[var4] * var3 / 128;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("dg")
   public void method5111(classSN var1, int var2) {
      classEM var3 = var1.field5983;
      classEF var4 = var3.method3924((byte)27);
      if (var4 != null) {
         var4.method3865(var1, var2, -1468766705);
         this.method5115(var4, var1.method10516(1641569409));
      }

      if (classSN.method10518(var1, 1651933478)) {
         this.method5221(var1, var2);
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIII)Ljava/awt/Shape;")
   @ObfuscatedName("jy")
   public Shape method5252(WorldView var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[this.field2424];
      int[] var7 = new int[this.field2424];
      Perspective.modelToCanvas(classOE.client, var1, this.field2424, var2, var3, var5, var4, this.field2427, this.field2426, this.field2430, var6, var7);
      return Jarvis.convexHull(var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fo")
   public void method5154(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] + var1;
         this.field2430[var4] = (int)this.field2430[var4] + var2;
         this.field2426[var4] = (int)this.field2426[var4] + var3;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lfs;I)V")
   @ObfuscatedName("ny")
   public void method5217(rl21 var1, classFS var2, int var3) {
      if (this.field2442 != null && var3 != -1) {
         classET var4 = var2.field2392[var3];
         classEM var5 = var4.field1911;
         var1.field5732 = 0;
         var1.field5734 = 0;
         var1.field5733 = 0;

         for (int var6 = 0; var6 < var4.field1913; var6++) {
            int var7 = var4.field1912[var6];
            this.method5228(var1, var5.field1785[var7], var5.field1787[var7], var4.field1909[var6], var4.field1915[var6], var4.field1914[var6]);
         }

         this.method5257();
      }
   }

   public byte[] getFaceTransparencies() {
      return this.field2444;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("by")
   public final void method5160(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2489 != 2) {
         method5225(this);
      }

      int var9 = classFH.method4705();
      int var10 = classFH.method4710();
      int var11 = field2465[var1];
      int var12 = field2473[var1];
      int var13 = field2465[var2];
      int var14 = field2473[var2];
      int var15 = field2465[var3];
      int var16 = field2473[var3];
      int var17 = field2465[var4];
      int var18 = field2473[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.field2424; var20++) {
         int var21 = (int)this.field2427[var20];
         int var22 = (int)this.field2430[var20];
         int var23 = (int)this.field2426[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2451[var20] = var23 - var19;
         field2466[var20] = var9 + var21 * classFH.method4727() / var8;
         field2452[var20] = var10 + var32 * classFH.method4727() / var8;
         field2450[var20] = var8;
         if (this.field2437 != null) {
            field2470[var20] = var21;
            field2453[var20] = var32;
            field2476[var20] = var23;
         }
      }

      try {
         this.method5171(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("bs")
   final void method5171(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2493 < 6000) {
         for (int var6 = 0; var6 < this.field2493; var6++) {
            field2455[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = classFH.method4731();

         for (int var8 = 0; var8 < this.field2419; var8++) {
            if (this.field2435[var8] == -2) {
               field2449[var8] = true;
            } else {
               if (this.field2423 != classFZ.field2517) {
                  if (classFH.field2257.field2217 == 1 && (this.field2444 == null || this.field2444[var8] == 0) && this.field2425 == 0) {
                     field2449[var8] = true;
                     continue;
                  }

                  if (classFH.field2257.field2217 == 0 && (this.field2444 != null && this.field2444[var8] != 0 || this.field2425 != 0)) {
                     field2449[var8] = true;
                     continue;
                  }
               }

               int var9 = this.field2429[var8];
               int var10 = this.field2432[var8];
               int var11 = this.field2433[var8];
               float var12 = field2466[var9];
               float var13 = field2466[var10];
               float var14 = field2466[var11];
               field2463[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field2463[var8]) {
                  int var15 = field2470[var9];
                  int var16 = field2470[var10];
                  int var17 = field2470[var11];
                  int var18 = field2453[var9];
                  int var19 = field2453[var10];
                  int var20 = field2453[var11];
                  int var21 = field2476[var9];
                  int var22 = field2476[var10];
                  int var23 = field2476[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field2449[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field2449[var8] = (var12 - var13) * (field2452[var11] - field2452[var10]) - (field2452[var9] - field2452[var10]) * (var14 - var13) <= 0.0F;
                  field2445[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && classDG.method3077(
                        (int)field2452[var9], (int)field2452[var10], (int)field2452[var11], (int)var12, (int)var13, (int)var14, var30, -2043627994
                     )) {
                     int var35 = (int)(field2450[var9] + field2450[var10] + field2450[var11]) / 3;
                     classGI.method5448(var4, var35, -340158988);
                  }
               }
            }
         }

         short var31 = this.field2499;
         boolean var32 = false;
         if (classFH.field2257.field2215.method4840()) {
            this.field2499 = (short)this.field2419;
         } else if (this.field2422 != null && this.field2422.method4840()) {
            classFL.method4827(classFH.field2257.field2215, this.field2422);
            var32 = true;
         }

         try {
            if (!classFH.method4735()) {
               method5179(this, true);
            } else {
               classFZ var33 = this.field2423;
               if (var33 == classFZ.field2515) {
                  if (classFH.field2257.field2217 != 0 && this.field2444 != null) {
                     var33 = classFZ.field2516;
                  } else {
                     var33 = classFZ.field2518;
                  }
               }

               switch (var33.field2514) {
                  case 1:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     method5179(this, false);
                     break;
                  case 2:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     method5179(this, true);
                     classFH.field2257.field2210 = 0;
                     classFH.field2257.field2216 = -1;
                     method5179(this, true);
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     break;
                  case 3:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     this.method5175();
                     break;
                  case 4:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     this.method5175();
               }
            }
         } finally {
            this.field2499 = var31;
            if (var32) {
               classFL.method4836(classFH.field2257.field2215);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("fh")
   void method5164(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null || this.field2425 != 0) {
         int var9 = var2.method11443(2030397284);
         int var10 = classUP.method11445(var2, (byte)-34);
         int var11 = var3.method11443(843730827);
         int var12 = classUP.method11445(var3, (byte)16);
         float var13 = var2.method11449(2122430262);
         float var14 = var2.method11451((byte)115);
         float var15 = var3.method11449(2100578267);
         float var16 = var3.method11451((byte)118);
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.field2491 * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < classFQ.method4929()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.field2491) * classFH.method4727();
            if (var22 / var20 < classFH.method4716()) {
               int var23 = (var21 + this.field2491) * classFH.method4727();
               if (var23 / var20 > classFH.method4712()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.field2491 * var9 >> 16;
                  int var26 = var25 + (this.field2492 * var10 >> 16);
                  int var27 = (var24 + var26) * classFH.method4727();
                  if (var27 / var20 > classFH.method4724()) {
                     int var28 = var25 + (this.field1743 * -1256242689 * var10 >> 16);
                     int var29 = (var24 - var28) * classFH.method4727();
                     if (var29 / var20 < classFH.method4720()) {
                        int var30 = var19 + (this.field1743 * -1256242689 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.field2437 != null;
                        int var34 = classCS.method2595(-290355318);
                        int var35 = 1170217135 * classFO.field2348;
                        boolean var37 = classAS.method660(2087470704);
                        boolean var39 = 0L != var7;
                        if (var39) {
                           boolean var40 = 1 == (int)(var7 >>> 19 & 1L);
                           var39 = !var40;
                        }

                        boolean var55 = false;
                        if (var39 && var37) {
                           boolean var41 = false;
                           if (field2448) {
                              var41 = Projectile.method1219(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 classFH.method4705(),
                                 classFH.method4710(),
                                 classFH.method4727(),
                                 -1756217321
                              );
                           } else {
                              int var42 = var18 - var19;
                              if (var42 <= 50) {
                                 var42 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var42;
                              } else {
                                 var23 /= var20;
                                 var22 /= var42;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var42;
                              } else {
                                 var27 /= var20;
                                 var29 /= var42;
                              }

                              int var43 = var34 - classFH.method4705();
                              int var44 = var35 - classFH.method4710();
                              if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
                                 var41 = true;
                              }
                           }

                           if (var41) {
                              if (this.field2421) {
                                 int var60 = classFH.method4705();
                                 int var45 = classFH.method4710();
                                 int var46 = classFH.method4727();
                                 classEV.method4087(var13, var14, var15, var16, var60, var45, var46, (byte)-5);
                                 int var57 = classSZ.method10730(
                                    var4,
                                    var5,
                                    var6,
                                    client.field1069 * -1163968665,
                                    -639123865 * classDX.field1662,
                                    -1674330987 * classDU.field1633,
                                    1788691143 * classDB.field1375,
                                    1768347607 * classYJ.field6994,
                                    -1569185711 * World.field1165,
                                    this.method5093(var1),
                                    1366188944
                                 );
                                 int var47 = var57 + 32;
                                 classGI.method5448(var7, var47, -55367300);
                              } else {
                                 var55 = true;
                              }
                           }
                        }

                        int var56 = classFH.method4705();
                        int var58 = classFH.method4710();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = classFH.field2255[var1];
                           var61 = classFH.field2259[var1];
                        }

                        for (int var62 = 0; var62 < this.field2424; var62++) {
                           float var63 = (int)this.field2427[var62];
                           float var66 = (int)this.field2430[var62];
                           float var48 = (int)this.field2426[var62];
                           if (var1 != 0) {
                              float var49 = var48 * var59 + var63 * var61;
                              var48 = var48 * var61 - var63 * var59;
                              var63 = var49;
                           }

                           var63 += var4;
                           var66 += var5;
                           var48 += var6;
                           float var71 = var48 * var15 + var63 * var16;
                           var48 = var48 * var16 - var63 * var15;
                           float var72 = var66 * var14 - var48 * var13;
                           var48 = var66 * var13 + var48 * var14;
                           var31 |= classKD.method6465(this, var62, var71, var72, var48, var18, var56, var58, var33);
                        }

                        try {
                           this.method5171(var31, var55, this.field2421, var7);
                        } catch (Exception var50) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("fq")
   void method5165(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null || this.field2425 != 0) {
         int var9 = var2.method11443(1594011388);
         int var10 = classUP.method11445(var2, (byte)-82);
         int var11 = var3.method11443(1201365912);
         int var12 = classUP.method11445(var3, (byte)-7);
         float var13 = var2.method11449(2080224168);
         float var14 = var2.method11451((byte)108);
         float var15 = var3.method11449(2096610087);
         float var16 = var3.method11451((byte)116);
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.field2491 * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < classFQ.method4929()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.field2491) * classFH.method4727();
            if (var22 / var20 < classFH.method4716()) {
               int var23 = (var21 + this.field2491) * classFH.method4727();
               if (var23 / var20 > classFH.method4712()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.field2491 * var9 >> 16;
                  int var26 = var25 + (this.field2492 * var10 >> 16);
                  int var27 = (var24 + var26) * classFH.method4727();
                  if (var27 / var20 > classFH.method4724()) {
                     int var28 = var25 + (this.field1743 * -1256242689 * var10 >> 16);
                     int var29 = (var24 - var28) * classFH.method4727();
                     if (var29 / var20 < classFH.method4720()) {
                        int var30 = var19 + (this.field1743 * -1256242689 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.field2437 != null;
                        int var34 = classCS.method2595(-1053495833);
                        int var35 = 1170217135 * classFO.field2348;
                        boolean var37 = classAS.method660(1941153625);
                        boolean var39 = 0L != var7;
                        if (var39) {
                           boolean var40 = 1 == (int)(var7 >>> 19 & 1L);
                           var39 = !var40;
                        }

                        boolean var55 = false;
                        if (var39 && var37) {
                           boolean var41 = false;
                           if (field2448) {
                              var41 = Projectile.method1219(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 classFH.method4705(),
                                 classFH.method4710(),
                                 classFH.method4727(),
                                 1122533453
                              );
                           } else {
                              int var42 = var18 - var19;
                              if (var42 <= 1123749286) {
                                 var42 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var42;
                              } else {
                                 var23 /= var20;
                                 var22 /= var42;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var42;
                              } else {
                                 var27 /= var20;
                                 var29 /= var42;
                              }

                              int var43 = var34 - classFH.method4705();
                              int var44 = var35 - classFH.method4710();
                              if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
                                 var41 = true;
                              }
                           }

                           if (var41) {
                              if (this.field2421) {
                                 int var60 = classFH.method4705();
                                 int var45 = classFH.method4710();
                                 int var46 = classFH.method4727();
                                 classEV.method4087(var13, var14, var15, var16, var60, var45, var46, (byte)-97);
                                 int var57 = classSZ.method10730(
                                    var4,
                                    var5,
                                    var6,
                                    client.field1069 * -1163968665,
                                    455131281 * classDX.field1662,
                                    -914460155 * classDU.field1633,
                                    1788691143 * classDB.field1375,
                                    1768347607 * classYJ.field6994,
                                    -1569185711 * World.field1165,
                                    this.method5093(var1),
                                    1360440870
                                 );
                                 int var47 = var57 + 32;
                                 classGI.method5448(var7, var47, -1866449209);
                              } else {
                                 var55 = true;
                              }
                           }
                        }

                        int var56 = classFH.method4705();
                        int var58 = classFH.method4710();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = classFH.field2255[var1];
                           var61 = classFH.field2259[var1];
                        }

                        for (int var62 = 0; var62 < this.field2424; var62++) {
                           float var63 = (int)this.field2427[var62];
                           float var66 = (int)this.field2430[var62];
                           float var48 = (int)this.field2426[var62];
                           if (var1 != 0) {
                              float var49 = var48 * var59 + var63 * var61;
                              var48 = var48 * var61 - var63 * var59;
                              var63 = var49;
                           }

                           var63 += var4;
                           var66 += var5;
                           var48 += var6;
                           float var71 = var48 * var15 + var63 * var16;
                           var48 = var48 * var16 - var63 * var15;
                           float var72 = var66 * var14 - var48 * var13;
                           var48 = var66 * var13 + var48 * var14;
                           var31 |= classKD.method6465(this, var62, var71, var72, var48, var18, var56, var58, var33);
                        }

                        try {
                           this.method5171(var31, var55, this.field2421, var7);
                        } catch (Exception var50) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("ky")
   public Model method5266(boolean var1) {
      return this.method5084(var1);
   }

   public int[] getFaceColors3() {
      return this.field2435;
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("fp")
   boolean method5168(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field2451[var1] = (int)var4 - var5;
      if (var8) {
         field2470[var1] = (int)var2;
         field2453[var1] = (int)var3;
         field2476[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         field2466[var1] = var6 + var2 * classFH.method4727() / var4;
         field2452[var1] = var7 + var3 * classFH.method4727() / var4;
         field2450[var1] = var4;
         return false;
      } else {
         field2466[var1] = -5000.0F;
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lsn;I)V")
   @ObfuscatedName("yy")
   public void method5234(rl21 var1, classSN var2, int var3) {
      classEM var4 = var2.field5983;
      classEF var5 = var4.field1788;
      if (var5 != null) {
         var5.method3871(var1, var2, var3, null, false);
         this.method5240(var1, var5, var2.field5992 * -1268206765);
      }

      if (var2.field5995) {
         this.method5269(var2, var3);
      }

      this.method5257();
   }

   @ObfuscatedSignature(descriptor = "(Lfx;ILuu;)V")
   @ObfuscatedName("rt")
   public static void method5242(Model var0, int var1, classUU var2) {
      if (var0 == null) {
         var0.method5243(var1, var2);
      }

      float var3 = var0.field2427[var1];
      float var4 = -var0.field2430[var1];
      float var5 = -var0.field2426[var1];
      float var6 = 1.0F;
      var0.field2427[var1] = var2.field6385 * var3 + var2.field6398 * var4 + var2.field6401 * var5 + var2.field6400 * var6;
      var0.field2430[var1] = -(var2.field6392 * var3 + var2.field6386 * var4 + var2.field6389 * var5 + var2.field6399 * var6);
      var0.field2426[var1] = -(var2.field6394 * var3 + var2.field6391 * var4 + var2.field6387 * var5 + var2.field6395 * var6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;I)V")
   @ObfuscatedName("tr")
   public static void method5194(Model var0, int var1) {
      if (var0 == null) {
         var0.method5103();
      } else {
         int var2 = classFH.method4705();
         int var3 = classFH.method4710();
         int var4 = 0;
         int var5 = var0.field2429[var1];
         int var6 = var0.field2432[var1];
         int var7 = var0.field2433[var1];
         int var8 = field2476[var5];
         int var9 = field2476[var6];
         int var10 = field2476[var7];
         if (var8 >= -1172003941) {
            field2478[var4] = (int)field2466[var5];
            field2479[var4] = (int)field2452[var5];
            field2454[var4] = field2450[var5];
            field2482[var4++] = var0.field2434[var1];
         } else {
            int var11 = field2470[var5];
            int var12 = field2453[var5];
            int var13 = var0.field2434[var1];
            if (var10 >= 517882684) {
               int var14 = (50 - var8) * field2469[var10 - var8];
               field2478[var4] = var2 + (var11 + ((field2470[var7] - var11) * var14 >> 16)) * classFH.method4727() / 50;
               field2479[var4] = var3 + (var12 + ((field2453[var7] - var12) * var14 >> 16)) * classFH.method4727() / 50;
               field2454[var4] = 50.0F;
               field2482[var4++] = var13 + ((var0.field2435[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 1559659392) {
               int var35 = (1897216099 - var8) * field2469[var9 - var8];
               field2478[var4] = var2 + (var11 + ((field2470[var6] - var11) * var35 >> 16)) * classFH.method4727() / 50;
               field2479[var4] = var3 + (var12 + ((field2453[var6] - var12) * var35 >> 16)) * classFH.method4727() / -1577117509;
               field2454[var4] = 50.0F;
               field2482[var4++] = var13 + ((var0.field2428[var1] - var13) * var35 >> 16);
            }
         }

         if (var9 >= 180363830) {
            field2478[var4] = (int)field2466[var6];
            field2479[var4] = (int)field2452[var6];
            field2454[var4] = field2450[var6];
            field2482[var4++] = var0.field2428[var1];
         } else {
            int var26 = field2470[var6];
            int var29 = field2453[var6];
            int var32 = var0.field2428[var1];
            if (var8 >= -2060554894) {
               int var36 = (50 - var9) * field2469[var8 - var9];
               field2478[var4] = var2 + (var26 + ((field2470[var5] - var26) * var36 >> 16)) * classFH.method4727() / 955862431;
               field2479[var4] = var3 + (var29 + ((field2453[var5] - var29) * var36 >> 16)) * classFH.method4727() / 50;
               field2454[var4] = 50.0F;
               field2482[var4++] = var32 + ((var0.field2434[var1] - var32) * var36 >> 16);
            }

            if (var10 >= -373040161) {
               int var37 = (226635654 - var9) * field2469[var10 - var9];
               field2478[var4] = var2 + (var26 + ((field2470[var7] - var26) * var37 >> 16)) * classFH.method4727() / 50;
               field2479[var4] = var3 + (var29 + ((field2453[var7] - var29) * var37 >> 16)) * classFH.method4727() / 50;
               field2454[var4] = 50.0F;
               field2482[var4++] = var32 + ((var0.field2435[var1] - var32) * var37 >> 16);
            }
         }

         if (var10 >= -1699572022) {
            field2478[var4] = (int)field2466[var7];
            field2479[var4] = (int)field2452[var7];
            field2454[var4] = field2450[var7];
            field2482[var4++] = var0.field2435[var1];
         } else {
            int var27 = field2470[var7];
            int var30 = field2453[var7];
            int var33 = var0.field2435[var1];
            if (var9 >= 50) {
               int var38 = (-655626768 - var10) * field2469[var9 - var10];
               field2478[var4] = var2 + (var27 + ((field2470[var6] - var27) * var38 >> 16)) * classFH.method4727() / -334396117;
               field2479[var4] = var3 + (var30 + ((field2453[var6] - var30) * var38 >> 16)) * classFH.method4727() / 50;
               field2454[var4] = 50.0F;
               field2482[var4++] = var33 + ((var0.field2428[var1] - var33) * var38 >> 16);
            }

            if (var8 >= 50) {
               int var39 = (50 - var10) * field2469[var8 - var10];
               field2478[var4] = var2 + (var27 + ((field2470[var5] - var27) * var39 >> 16)) * classFH.method4727() / 1860222670;
               field2479[var4] = var3 + (var30 + ((field2453[var5] - var30) * var39 >> 16)) * classFH.method4727() / -680005987;
               field2454[var4] = 50.0F;
               field2482[var4++] = var33 + ((var0.field2434[var1] - var33) * var39 >> 16);
            }
         }

         int var28 = field2478[0];
         int var31 = field2478[1];
         int var34 = field2478[2];
         int var40 = field2479[0];
         int var15 = field2479[1];
         int var16 = field2479[2];
         int var17 = var0.field2438 == null ? 0 : var0.field2438[var1] * 2;
         float var18 = classJE.method6356(field2454[0] - var17, 2090952653);
         float var19 = classJE.method6356(field2454[1] - var17, 2125155099);
         float var20 = classJE.method6356(field2454[2] - var17, 2089276127);
         classFH.field2257.field2211 = false;
         int var21 = classFH.method4731();
         if (var4 == 3) {
            if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
               classFH.field2257.field2211 = true;
            }

            var0.method5191(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
         }

         if (var4 == 4) {
            if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field2478[3] < 0 || field2478[3] > var21) {
               classFH.field2257.field2211 = true;
            }

            if (var0.field2437 != null && var0.field2437[var1] != -1) {
               int var24;
               int var41;
               int var43;
               if (var0.field2436 != null && var0.field2436[var1] != -1) {
                  int var25 = var0.field2436[var1] & 255;
                  var41 = var0.field2439[var25];
                  var43 = var0.field2440[var25];
                  var24 = var0.field2441[var25];
               } else {
                  var41 = var5;
                  var43 = var6;
                  var24 = var7;
               }

               short var44 = var0.field2437[var1];
               if (var0.field2435[var1] == -1) {
                  classFH.method4767(
                     var40,
                     var15,
                     var16,
                     var28,
                     var31,
                     var34,
                     var18,
                     var19,
                     var20,
                     var0.field2434[var1],
                     var0.field2434[var1],
                     var0.field2434[var1],
                     field2470[var41],
                     field2470[var43],
                     field2470[var24],
                     field2453[var41],
                     field2453[var43],
                     field2453[var24],
                     field2476[var41],
                     field2476[var43],
                     field2476[var24],
                     var44
                  );
                  classFH.method4767(
                     var40,
                     var16,
                     field2479[3],
                     var28,
                     var34,
                     field2478[3],
                     var18,
                     var20,
                     field2454[3],
                     var0.field2434[var1],
                     var0.field2434[var1],
                     var0.field2434[var1],
                     field2470[var41],
                     field2470[var43],
                     field2470[var24],
                     field2453[var41],
                     field2453[var43],
                     field2453[var24],
                     field2476[var41],
                     field2476[var43],
                     field2476[var24],
                     var44
                  );
               } else {
                  classFH.method4767(
                     var40,
                     var15,
                     var16,
                     var28,
                     var31,
                     var34,
                     var18,
                     var19,
                     var20,
                     field2482[0],
                     field2482[1],
                     field2482[2],
                     field2470[var41],
                     field2470[var43],
                     field2470[var24],
                     field2453[var41],
                     field2453[var43],
                     field2453[var24],
                     field2476[var41],
                     field2476[var43],
                     field2476[var24],
                     var44
                  );
                  classFH.method4767(
                     var40,
                     var16,
                     field2479[3],
                     var28,
                     var34,
                     field2478[3],
                     var18,
                     var20,
                     field2454[3],
                     field2482[0],
                     field2482[2],
                     field2482[3],
                     field2470[var41],
                     field2470[var43],
                     field2470[var24],
                     field2453[var41],
                     field2453[var43],
                     field2453[var24],
                     field2476[var41],
                     field2476[var43],
                     field2476[var24],
                     var44
                  );
               }
            } else {
               boolean var22 = var0.method5189(var1);
               if (var0.field2435[var1] == -1 && var22) {
                  int var42 = field2462[var0.field2434[var1]];
                  classFH.method4773(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
                  classFH.method4773(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var42);
               } else if (var0.field2435[var1] == -1) {
                  int var23 = field2462[var0.field2434[var1]];
                  classFH.method4762(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
                  classFH.method4762(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var23);
               } else if (var22) {
                  classFH.method4772(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
                  classFH.method4772(
                     var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]
                  );
               } else {
                  classFH.method4758(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
                  classFH.method4758(
                     var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]
                  );
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("mu")
   @Override
   void vmethod421(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null) {
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         classUG var8 = classMQ.method7640(654899424);
         var8.field6305.method11373(var1 * 0.0030679614F, 0.0F, 0.0F, -284857820);
         var8.field6306.method11728(1.0F, 1.0F, 1.0F, 1784367608);
         var8.field6307.method11728(var3, var4, var5, 1892025795);
         classUU var9 = classRM.method10129(1778071523);
         var9.method11642(var8, 2098028491);
         classUU.method11594(var9, var2, 433257666);
         int var10 = (int)var9.method11625(0.0F, 0.0F, 0.0F, -1972903940);
         boolean var11 = false;
         int var12 = var10 - this.field2490;
         boolean var13 = var12 <= -1603509246 || this.field2437 != null;
         boolean var15 = var6 != 0L;
         if (var15) {
            boolean var16 = (int)(var6 >>> 19 & 1L) == 1;
            var15 = !var16;
         }

         boolean var30 = false;
         if (var15 && classAS.method660(1962492365)) {
            int var19 = classFH.method4705();
            int var20 = classFH.method4710();
            int var21 = classFH.method4727();
            boolean var22 = classFO.field2352;
            boolean var17;
            if (!var22) {
               var17 = false;
            } else {
               classVL.method11993(var2, var19, var20, var21, -1777153680);
               var17 = GrandExchangeOffer.method7619(
                  this, var1, var3 - -1650464014 * classFM.field2315, var4 - classCP.field1202 * 1933993628, var5 - -1592493719 * classVR.field6560, (byte)-52
               );
            }

            if (var17) {
               if (this.field2421) {
                  int var25 = classFH.method4705();
                  int var26 = classFH.method4710();
                  int var27 = classFH.method4727();
                  classVL.method11993(var2, var25, var26, var27, 1506999251);
                  int var23 = classSZ.method10730(
                     var3 - classFM.field2315 * -1039715711,
                     var4 - 1448483213 * classCP.field1202,
                     var5 - -417087201 * classVR.field6560,
                     -1163968665 * client.field1069,
                     classDX.field1662 * -888802465,
                     classDU.field1633 * -1708438567,
                     classDB.field1375 * 1788691143,
                     -318412586 * classYJ.field6994,
                     World.field1165 * -1569185711,
                     this.method5093(var1),
                     -471932658
                  );
                  int var28 = var23 + 32;
                  classGI.method5448(var6, var28, -86511550);
               } else {
                  var30 = true;
               }
            }
         }

         int var31 = classFH.method4705();
         int var18 = classFH.method4710();

         for (int var32 = 0; var32 < this.field2424; var32++) {
            float var33 = (int)this.field2427[var32];
            float var35 = (int)this.field2430[var32];
            float var37 = (int)this.field2426[var32];
            var9.method11616(var33, var35, var37, field2446, 1634822735);
            var33 = field2446[0];
            var35 = field2446[1];
            var37 = field2446[2];
            var11 |= classKD.method6465(this, var32, var33, var35, var37, var10, var31, var18, var13);
         }

         var8.method11306(-531063913);
         var9.method11555(1957724618);

         try {
            this.method5171(var11, var30, this.field2421, var6);
         } catch (Exception var29) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("fv")
   final void method5172(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2493 < 6000) {
         for (int var6 = 0; var6 < this.field2493; var6++) {
            field2455[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = classFH.method4731();

         for (int var8 = 0; var8 < this.field2419; var8++) {
            if (this.field2435[var8] == -2) {
               field2449[var8] = true;
            } else {
               if (this.field2423 != classFZ.field2517) {
                  if (classFH.field2257.field2217 == 1 && (this.field2444 == null || this.field2444[var8] == 0) && this.field2425 == 0) {
                     field2449[var8] = true;
                     continue;
                  }

                  if (classFH.field2257.field2217 == 0 && (this.field2444 != null && this.field2444[var8] != 0 || this.field2425 != 0)) {
                     field2449[var8] = true;
                     continue;
                  }
               }

               int var9 = this.field2429[var8];
               int var10 = this.field2432[var8];
               int var11 = this.field2433[var8];
               float var12 = field2466[var9];
               float var13 = field2466[var10];
               float var14 = field2466[var11];
               field2463[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field2463[var8]) {
                  int var15 = field2470[var9];
                  int var16 = field2470[var10];
                  int var17 = field2470[var11];
                  int var18 = field2453[var9];
                  int var19 = field2453[var10];
                  int var20 = field2453[var11];
                  int var21 = field2476[var9];
                  int var22 = field2476[var10];
                  int var23 = field2476[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field2449[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field2449[var8] = (var12 - var13) * (field2452[var11] - field2452[var10]) - (field2452[var9] - field2452[var10]) * (var14 - var13) <= 0.0F;
                  field2445[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && classDG.method3077(
                        (int)field2452[var9], (int)field2452[var10], (int)field2452[var11], (int)var12, (int)var13, (int)var14, var30, -1933558936
                     )) {
                     int var35 = (int)(field2450[var9] + field2450[var10] + field2450[var11]) / 3;
                     classGI.method5448(var4, var35, -339143960);
                  }
               }
            }
         }

         short var31 = this.field2499;
         boolean var32 = false;
         if (classFH.field2257.field2215.method4840()) {
            this.field2499 = (short)this.field2419;
         } else if (this.field2422 != null && this.field2422.method4840()) {
            classFL.method4827(classFH.field2257.field2215, this.field2422);
            var32 = true;
         }

         try {
            if (!classFH.method4735()) {
               method5179(this, true);
            } else {
               classFZ var33 = this.field2423;
               if (var33 == classFZ.field2515) {
                  if (classFH.field2257.field2217 != 0 && this.field2444 != null) {
                     var33 = classFZ.field2516;
                  } else {
                     var33 = classFZ.field2518;
                  }
               }

               switch (var33.field2514) {
                  case 1:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     method5179(this, false);
                     break;
                  case 2:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     method5179(this, true);
                     classFH.field2257.field2210 = 0;
                     classFH.field2257.field2216 = -1;
                     method5179(this, true);
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     break;
                  case 3:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     this.method5175();
                     break;
                  case 4:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     this.method5175();
               }
            }
         } finally {
            this.field2499 = var31;
            if (var32) {
               classFL.method4836(classFH.field2257.field2215);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fx")
   void method5176() {
      for (int var1 = 0; var1 < this.field2419; var1++) {
         if (!field2449[var1]) {
            this.method5187(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("fk")
   final void method5173(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2493 < 6000) {
         for (int var6 = 0; var6 < this.field2493; var6++) {
            field2455[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = classFH.method4731();

         for (int var8 = 0; var8 < this.field2419; var8++) {
            if (this.field2435[var8] == 1428405977) {
               field2449[var8] = true;
            } else {
               if (this.field2423 != classFZ.field2517) {
                  if (classFH.field2257.field2217 == 1 && (this.field2444 == null || this.field2444[var8] == 0) && this.field2425 == 0) {
                     field2449[var8] = true;
                     continue;
                  }

                  if (classFH.field2257.field2217 == 0 && (this.field2444 != null && this.field2444[var8] != 0 || this.field2425 != 0)) {
                     field2449[var8] = true;
                     continue;
                  }
               }

               int var9 = this.field2429[var8];
               int var10 = this.field2432[var8];
               int var11 = this.field2433[var8];
               float var12 = field2466[var9];
               float var13 = field2466[var10];
               float var14 = field2466[var11];
               field2463[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field2463[var8]) {
                  int var15 = field2470[var9];
                  int var16 = field2470[var10];
                  int var17 = field2470[var11];
                  int var18 = field2453[var9];
                  int var19 = field2453[var10];
                  int var20 = field2453[var11];
                  int var21 = field2476[var9];
                  int var22 = field2476[var10];
                  int var23 = field2476[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field2449[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field2449[var8] = (var12 - var13) * (field2452[var11] - field2452[var10]) - (field2452[var9] - field2452[var10]) * (var14 - var13) <= 0.0F;
                  field2445[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && classDG.method3077(
                        (int)field2452[var9], (int)field2452[var10], (int)field2452[var11], (int)var12, (int)var13, (int)var14, var30, -1778910972
                     )) {
                     int var35 = (int)(field2450[var9] + field2450[var10] + field2450[var11]) / 3;
                     classGI.method5448(var4, var35, -1931336340);
                  }
               }
            }
         }

         short var31 = this.field2499;
         boolean var32 = false;
         if (classFH.field2257.field2215.method4840()) {
            this.field2499 = (short)this.field2419;
         } else if (this.field2422 != null && this.field2422.method4840()) {
            classFL.method4827(classFH.field2257.field2215, this.field2422);
            var32 = true;
         }

         try {
            if (!classFH.method4735()) {
               method5179(this, true);
            } else {
               classFZ var33 = this.field2423;
               if (var33 == classFZ.field2515) {
                  if (classFH.field2257.field2217 != 0 && this.field2444 != null) {
                     var33 = classFZ.field2516;
                  } else {
                     var33 = classFZ.field2518;
                  }
               }

               switch (var33.field2514) {
                  case 1:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     method5179(this, false);
                     break;
                  case 2:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     method5179(this, true);
                     classFH.field2257.field2210 = 0;
                     classFH.field2257.field2216 = -1;
                     method5179(this, true);
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     break;
                  case 3:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = -1;
                     this.method5175();
                     break;
                  case 4:
                     classFH.field2257.field2210 = -1;
                     classFH.field2257.field2216 = 0;
                     this.method5175();
               }
            }
         } finally {
            this.field2499 = var31;
            if (var32) {
               classFL.method4836(classFH.field2257.field2215);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fr")
   void method5177() {
      for (int var1 = 0; var1 < this.field2419; var1++) {
         if (!field2449[var1]) {
            this.method5187(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ft")
   void method5178() {
      for (int var1 = 0; var1 < this.field2419; var1++) {
         if (!field2449[var1]) {
            this.method5187(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bl")
   void method5180(boolean var1) {
      for (char var2 = 0; var2 < this.field2419; var2++) {
         if (!field2449[var2]) {
            int var3 = (field2451[this.field2429[var2]] + field2451[this.field2432[var2]] + field2451[this.field2433[var2]]) / 3 + this.field2490;
            char[] var10000 = field2456[var3];
            field2455[var3]++;
            var10000[field2455[var3]] = var2;
         }
      }

      if (this.field2431 != null && var1) {
         this.method5182();
      } else {
         for (int var6 = this.field2493 - 1; var6 >= 0; var6--) {
            char var7 = field2455[var6];
            if (var7 > 0) {
               char[] var4 = field2456[var6];

               for (int var5 = 0; var5 < var7; var5++) {
                  this.method5187(var4[var5]);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("ee")
   public static void method5097(Model var0) {
      if (var0.field2489 != 1) {
         var0.field2489 = 1;
         var0.field1743 = 0;
         var0.field2492 = 0;
         var0.field2491 = 0;

         for (int var1 = 0; var1 < var0.field2424; var1++) {
            int var2 = (int)var0.field2427[var1];
            int var3 = (int)var0.field2430[var1];
            int var4 = (int)var0.field2426[var1];
            if (-var3 > var0.field1743 * -1256242689) {
               var0.field1743 = -var3 * 380135762;
            }

            if (var3 > var0.field2492) {
               var0.field2492 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > var0.field2491) {
               var0.field2491 = var5;
            }
         }

         var0.field2491 = (int)(Math.sqrt(var0.field2491) + 0.99);
         var0.field2490 = (int)(Math.sqrt(var0.field2491 * var0.field2491 + var0.field1743 * -1208950765 * var0.field1743 * 1759926241) + 0.99);
         var0.field2493 = var0.field2490 + (int)(Math.sqrt(var0.field2491 * var0.field2491 + var0.field2492 * var0.field2492) + 0.99);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fe")
   void method5183() {
      for (int var1 = 0; var1 < 12; var1++) {
         field2457[var1] = 0;
         field2480[var1] = 0;
      }

      for (int var13 = this.field2493 - 1; var13 >= 0; var13--) {
         char var2 = field2455[var13];
         if (var2 > 0) {
            char[] var3 = field2456[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.field2431[var5];
               int var7 = field2457[var6]++;
               field2458[var6][var7] = var5;
               if (var6 < 10) {
                  field2480[var6] = field2480[var6] + var13;
               } else if (var6 == 10) {
                  field2459[var7] = var13;
               } else {
                  field2467[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field2457[1] > 0 || field2457[2] > 0) {
         var14 = (field2480[1] + field2480[2]) / (field2457[1] + field2457[2]);
      }

      int var15 = 0;
      if (field2457[3] > 0 || field2457[4] > 0) {
         var15 = (field2480[3] + field2480[4]) / (field2457[3] + field2457[4]);
      }

      int var16 = 0;
      if (field2457[6] > 0 || field2457[8] > 0) {
         var16 = (field2480[6] + field2480[8]) / (field2457[6] + field2457[8]);
      }

      int var18 = 0;
      int var19 = field2457[10];
      int[] var20 = field2458[10];
      int[] var8 = field2459;
      if (var18 == var19) {
         var18 = 0;
         var19 = field2457[11];
         var20 = field2458[11];
         var8 = field2467;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method5187(var20[var18++]);
            if (var18 == var19 && var20 != field2458[11]) {
               var18 = 0;
               var19 = field2457[11];
               var20 = field2458[11];
               var8 = field2467;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = field2457[var9];
         int[] var11 = field2458[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method5187(var11[var12]);
         }
      }

      while (var17 != -1000) {
         this.method5187(var20[var18++]);
         if (var18 == var19 && var20 != field2458[11]) {
            var18 = 0;
            var20 = field2458[11];
            var19 = field2457[11];
            var8 = field2467;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;)V")
   @ObfuscatedName("pe")
   public void method5267(int var1, classUU var2) {
      method5242(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fm")
   int method5184(int var1) {
      if (this.field2425 == -1) {
         return 253;
      } else {
         int var2 = this.field2425 & 1625264886;
         if (var2 > 0 && var1 < 253) {
            int var3 = 352118421 - var1;
            int var4 = var3 * var2 >> 8;
            return var1 + var4;
         } else {
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("ds")
   public static void method5225(Model var0) {
      if (var0 == null) {
         var0.method5226();
      }

      if (var0.field2489 != 2) {
         var0.field2489 = 2;
         float var1 = 0.0F;

         for (int var2 = 0; var2 < var0.field2424; var2++) {
            float var3 = var0.field2427[var2];
            float var4 = var0.field2430[var2];
            float var5 = var0.field2426[var2];
            float var6 = var3 * var3 + var5 * var5 + var4 * var4;
            if (var6 > var1) {
               var1 = var6;
            }
         }

         var0.field2491 = (int)Math.ceil(Math.sqrt(var1));
         var0.field2490 = var0.field2491;
         var0.field2493 = var0.field2491 + var0.field2491;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;Lul;)V")
   @ObfuscatedName("sl")
   public static void method5222(Model var0, classUL var1) {
      if (var0 == null) {
         var0.method5150(var1);
      } else {
         classUZ var2 = classUZ.method11786(0.0F, 0.0F, 0.0F);

         for (int var3 = 0; var3 < var0.field2424; var3++) {
            classSJ.method10457(var2, var0.field2427[var3], var0.field2430[var3], var0.field2426[var3]);
            var2.method11787(var1);
            var0.field2427[var3] = var2.field6427;
            var0.field2430[var3] = var2.field6425;
            var0.field2426[var3] = var2.field6426;
         }

         var2.method11788();
         var0.method5257();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fa")
   int method5185(int var1) {
      if (this.field2425 == -1) {
         return 253;
      } else {
         int var2 = this.field2425 & 255;
         if (var2 > 0 && var1 < 253) {
            int var3 = 161191213 - var1;
            int var4 = var3 * var2 >> 8;
            return var1 + var4;
         } else {
            return var1;
         }
      }
   }

   public int getSceneId() {
      return this.field2496;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Z)Lfx;")
   @ObfuscatedName("fn")
   public static Model method5083(Model var0, boolean var1) {
      if (var0 == null) {
         var0.method5142();
      }

      if (!var1 && field2472.length < var0.field2419) {
         field2472 = new byte[var0.field2419 + 100];
      }

      return var0.method5087(var1, field2447, field2472);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("gq")
   boolean method5190(int var1) {
      return var1 < this.field2499;
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("gb")
   final void method5192(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.field2437 != null && this.field2437[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.field2436 != null && this.field2436[var1] != -1) {
            int var17 = this.field2436[var1] & -1449798525;
            var18 = this.field2439[var17];
            var15 = this.field2440[var17];
            var16 = this.field2441[var17];
         } else {
            var18 = this.field2429[var1];
            var15 = this.field2432[var1];
            var16 = this.field2433[var1];
         }

         if (this.field2435[var1] == -1) {
            classFH.method4767(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field2470[var18],
               field2470[var15],
               field2470[var16],
               field2453[var18],
               field2453[var15],
               field2453[var16],
               field2476[var18],
               field2476[var15],
               field2476[var16],
               this.field2437[var1]
            );
         } else {
            classFH.method4767(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field2470[var18],
               field2470[var15],
               field2470[var16],
               field2453[var18],
               field2453[var15],
               field2453[var16],
               field2476[var18],
               field2476[var15],
               field2476[var16],
               this.field2437[var1]
            );
         }
      } else {
         boolean var14 = this.method5189(var1);
         if (this.field2435[var1] == -1 && var14) {
            classFH.method4773(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2462[this.field2434[var1]]);
         } else if (this.field2435[var1] == -1) {
            classFH.method4762(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2462[this.field2434[var1]]);
         } else if (var14) {
            classFH.method4772(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            classFH.method4758(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   public int[] getVertexNormalsY() {
      return this.field2504;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gv")
   final void method5195(int var1) {
      int var2 = classFH.method4705();
      int var3 = classFH.method4710();
      int var4 = 0;
      int var5 = this.field2429[var1];
      int var6 = this.field2432[var1];
      int var7 = this.field2433[var1];
      int var8 = field2476[var5];
      int var9 = field2476[var6];
      int var10 = field2476[var7];
      if (var8 >= 50) {
         field2478[var4] = (int)field2466[var5];
         field2479[var4] = (int)field2452[var5];
         field2454[var4] = field2450[var5];
         field2482[var4++] = this.field2434[var1];
      } else {
         int var11 = field2470[var5];
         int var12 = field2453[var5];
         int var13 = this.field2434[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * field2469[var10 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var7] - var11) * var14 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var7] - var12) * var14 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2435[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var35 = (50 - var8) * field2469[var9 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var6] - var11) * var35 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var6] - var12) * var35 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2428[var1] - var13) * var35 >> 16);
         }
      }

      if (var9 >= 50) {
         field2478[var4] = (int)field2466[var6];
         field2479[var4] = (int)field2452[var6];
         field2454[var4] = field2450[var6];
         field2482[var4++] = this.field2428[var1];
      } else {
         int var26 = field2470[var6];
         int var29 = field2453[var6];
         int var32 = this.field2428[var1];
         if (var8 >= 50) {
            int var36 = (50 - var9) * field2469[var8 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var5] - var26) * var36 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var5] - var29) * var36 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2434[var1] - var32) * var36 >> 16);
         }

         if (var10 >= 50) {
            int var37 = (50 - var9) * field2469[var10 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var7] - var26) * var37 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var7] - var29) * var37 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2435[var1] - var32) * var37 >> 16);
         }
      }

      if (var10 >= 50) {
         field2478[var4] = (int)field2466[var7];
         field2479[var4] = (int)field2452[var7];
         field2454[var4] = field2450[var7];
         field2482[var4++] = this.field2435[var1];
      } else {
         int var27 = field2470[var7];
         int var30 = field2453[var7];
         int var33 = this.field2435[var1];
         if (var9 >= 50) {
            int var38 = (50 - var10) * field2469[var9 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var6] - var27) * var38 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var6] - var30) * var38 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2428[var1] - var33) * var38 >> 16);
         }

         if (var8 >= 50) {
            int var39 = (50 - var10) * field2469[var8 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var5] - var27) * var39 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var5] - var30) * var39 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2434[var1] - var33) * var39 >> 16);
         }
      }

      int var28 = field2478[0];
      int var31 = field2478[1];
      int var34 = field2478[2];
      int var40 = field2479[0];
      int var15 = field2479[1];
      int var16 = field2479[2];
      int var17 = this.field2438 == null ? 0 : this.field2438[var1] * 2;
      float var18 = classJE.method6356(field2454[0] - var17, 2130938186);
      float var19 = classJE.method6356(field2454[1] - var17, 2139279569);
      float var20 = classJE.method6356(field2454[2] - var17, 2139204638);
      classFH.field2257.field2211 = false;
      int var21 = classFH.method4731();
      if (var4 == 3) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
            classFH.field2257.field2211 = true;
         }

         this.method5191(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
      }

      if (var4 == 4) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field2478[3] < 0 || field2478[3] > var21) {
            classFH.field2257.field2211 = true;
         }

         if (this.field2437 != null && this.field2437[var1] != -1) {
            int var24;
            int var41;
            int var43;
            if (this.field2436 != null && this.field2436[var1] != -1) {
               int var25 = this.field2436[var1] & 255;
               var41 = this.field2439[var25];
               var43 = this.field2440[var25];
               var24 = this.field2441[var25];
            } else {
               var41 = var5;
               var43 = var6;
               var24 = var7;
            }

            short var44 = this.field2437[var1];
            if (this.field2435[var1] == -1) {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            } else {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  field2482[0],
                  field2482[1],
                  field2482[2],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  field2482[0],
                  field2482[2],
                  field2482[3],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            }
         } else {
            boolean var22 = this.method5189(var1);
            if (this.field2435[var1] == -1 && var22) {
               int var42 = field2462[this.field2434[var1]];
               classFH.method4773(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
               classFH.method4773(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var42);
            } else if (this.field2435[var1] == -1) {
               int var23 = field2462[this.field2434[var1]];
               classFH.method4762(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
               classFH.method4762(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var23);
            } else if (var22) {
               classFH.method4772(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4772(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            } else {
               classFH.method4758(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4758(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("go")
   final void method5196(int var1) {
      int var2 = classFH.method4705();
      int var3 = classFH.method4710();
      int var4 = 0;
      int var5 = this.field2429[var1];
      int var6 = this.field2432[var1];
      int var7 = this.field2433[var1];
      int var8 = field2476[var5];
      int var9 = field2476[var6];
      int var10 = field2476[var7];
      if (var8 >= 50) {
         field2478[var4] = (int)field2466[var5];
         field2479[var4] = (int)field2452[var5];
         field2454[var4] = field2450[var5];
         field2482[var4++] = this.field2434[var1];
      } else {
         int var11 = field2470[var5];
         int var12 = field2453[var5];
         int var13 = this.field2434[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * field2469[var10 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var7] - var11) * var14 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var7] - var12) * var14 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2435[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var35 = (50 - var8) * field2469[var9 - var8];
            field2478[var4] = var2 + (var11 + ((field2470[var6] - var11) * var35 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var12 + ((field2453[var6] - var12) * var35 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var13 + ((this.field2428[var1] - var13) * var35 >> 16);
         }
      }

      if (var9 >= 50) {
         field2478[var4] = (int)field2466[var6];
         field2479[var4] = (int)field2452[var6];
         field2454[var4] = field2450[var6];
         field2482[var4++] = this.field2428[var1];
      } else {
         int var26 = field2470[var6];
         int var29 = field2453[var6];
         int var32 = this.field2428[var1];
         if (var8 >= 50) {
            int var36 = (50 - var9) * field2469[var8 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var5] - var26) * var36 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var5] - var29) * var36 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2434[var1] - var32) * var36 >> 16);
         }

         if (var10 >= 50) {
            int var37 = (50 - var9) * field2469[var10 - var9];
            field2478[var4] = var2 + (var26 + ((field2470[var7] - var26) * var37 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var29 + ((field2453[var7] - var29) * var37 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var32 + ((this.field2435[var1] - var32) * var37 >> 16);
         }
      }

      if (var10 >= 50) {
         field2478[var4] = (int)field2466[var7];
         field2479[var4] = (int)field2452[var7];
         field2454[var4] = field2450[var7];
         field2482[var4++] = this.field2435[var1];
      } else {
         int var27 = field2470[var7];
         int var30 = field2453[var7];
         int var33 = this.field2435[var1];
         if (var9 >= 50) {
            int var38 = (50 - var10) * field2469[var9 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var6] - var27) * var38 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var6] - var30) * var38 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2428[var1] - var33) * var38 >> 16);
         }

         if (var8 >= 50) {
            int var39 = (50 - var10) * field2469[var8 - var10];
            field2478[var4] = var2 + (var27 + ((field2470[var5] - var27) * var39 >> 16)) * classFH.method4727() / 50;
            field2479[var4] = var3 + (var30 + ((field2453[var5] - var30) * var39 >> 16)) * classFH.method4727() / 50;
            field2454[var4] = 50.0F;
            field2482[var4++] = var33 + ((this.field2434[var1] - var33) * var39 >> 16);
         }
      }

      int var28 = field2478[0];
      int var31 = field2478[1];
      int var34 = field2478[2];
      int var40 = field2479[0];
      int var15 = field2479[1];
      int var16 = field2479[2];
      int var17 = this.field2438 == null ? 0 : this.field2438[var1] * 2;
      float var18 = classJE.method6356(field2454[0] - var17, 2105000881);
      float var19 = classJE.method6356(field2454[1] - var17, 2108969058);
      float var20 = classJE.method6356(field2454[2] - var17, 2135725121);
      classFH.field2257.field2211 = false;
      int var21 = classFH.method4731();
      if (var4 == 3) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
            classFH.field2257.field2211 = true;
         }

         this.method5191(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
      }

      if (var4 == 4) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field2478[3] < 0 || field2478[3] > var21) {
            classFH.field2257.field2211 = true;
         }

         if (this.field2437 != null && this.field2437[var1] != -1) {
            int var24;
            int var41;
            int var43;
            if (this.field2436 != null && this.field2436[var1] != -1) {
               int var25 = this.field2436[var1] & 255;
               var41 = this.field2439[var25];
               var43 = this.field2440[var25];
               var24 = this.field2441[var25];
            } else {
               var41 = var5;
               var43 = var6;
               var24 = var7;
            }

            short var44 = this.field2437[var1];
            if (this.field2435[var1] == -1) {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  this.field2434[var1],
                  this.field2434[var1],
                  this.field2434[var1],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            } else {
               classFH.method4767(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  field2482[0],
                  field2482[1],
                  field2482[2],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
               classFH.method4767(
                  var40,
                  var16,
                  field2479[3],
                  var28,
                  var34,
                  field2478[3],
                  var18,
                  var20,
                  field2454[3],
                  field2482[0],
                  field2482[2],
                  field2482[3],
                  field2470[var41],
                  field2470[var43],
                  field2470[var24],
                  field2453[var41],
                  field2453[var43],
                  field2453[var24],
                  field2476[var41],
                  field2476[var43],
                  field2476[var24],
                  var44
               );
            }
         } else {
            boolean var22 = this.method5189(var1);
            if (this.field2435[var1] == -1 && var22) {
               int var42 = field2462[this.field2434[var1]];
               classFH.method4773(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
               classFH.method4773(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var42);
            } else if (this.field2435[var1] == -1) {
               int var23 = field2462[this.field2434[var1]];
               classFH.method4762(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
               classFH.method4762(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], var23);
            } else if (var22) {
               classFH.method4772(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4772(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            } else {
               classFH.method4758(var40, var15, var16, var28, var31, var34, var18, var19, var20, field2482[0], field2482[1], field2482[2]);
               classFH.method4758(var40, var16, field2479[3], var28, var34, field2478[3], var18, var20, field2454[3], field2482[0], field2482[2], field2482[3]);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("ds")
   void method5118(classEF var1, int var2) {
      NpcOverrides.method9089(this, var1, var2);
   }

   public int getBufferOffset() {
      return this.field2495;
   }

   @ObfuscatedSignature(descriptor = "(ILuu;)V")
   @ObfuscatedName("gp")
   void method5198(int var1, classUU var2) {
      float var3 = (int)this.field2427[var1];
      float var4 = -((int)this.field2430[var1]);
      float var5 = -((int)this.field2426[var1]);
      float var6 = 1.0F;
      this.field2427[var1] = var2.field6385 * var3 + var2.field6398 * var4 + var2.field6401 * var5 + var2.field6400 * var6;
      this.field2430[var1] = -((int)(var2.field6392 * var3 + var2.field6386 * var4 + var2.field6389 * var5 + var2.field6399 * var6));
      this.field2426[var1] = -((int)(var2.field6394 * var3 + var2.field6391 * var4 + var2.field6387 * var5 + var2.field6395 * var6));
   }

   public byte[] getFaceRenderPriorities() {
      return this.field2431;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lfx;")
   @ObfuscatedName("cx")
   public Model method5086(boolean var1) {
      if (!var1 && field2474.length < this.field2419) {
         field2474 = new byte[this.field2419 + 100];
      }

      return this.method5087(var1, field2471, field2474);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cl")
   public void method5201(byte var1) {
      this.field2425 = var1;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lfx;")
   @ObfuscatedName("cw")
   public Model method5268(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      return this.method5246(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gc")
   public void method5202(byte var1) {
      this.field2425 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("er")
   public static void method5135(Model var0) {
      if (var0 == null) {
         var0.method5142();
      } else {
         for (int var1 = 0; var1 < var0.field2424; var1++) {
            int var2 = (int)var0.field2427[var1];
            var0.field2427[var1] = var0.field2426[var1];
            var0.field2426[var1] = -var2;
         }

         classZG.method13998(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gw")
   public void method5203(byte var1) {
      this.field2425 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("fb")
   public final void method5161(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2489 != 2) {
         method5225(this);
      }

      int var9 = classFH.method4705();
      int var10 = classFH.method4710();
      int var11 = field2465[var1];
      int var12 = field2473[var1];
      int var13 = field2465[var2];
      int var14 = field2473[var2];
      int var15 = field2465[var3];
      int var16 = field2473[var3];
      int var17 = field2465[var4];
      int var18 = field2473[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.field2424; var20++) {
         int var21 = (int)this.field2427[var20];
         int var22 = (int)this.field2430[var20];
         int var23 = (int)this.field2426[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2451[var20] = var23 - var19;
         field2466[var20] = var9 + var21 * classFH.method4727() / var8;
         field2452[var20] = var10 + var32 * classFH.method4727() / var8;
         field2450[var20] = var8;
         if (this.field2437 != null) {
            field2470[var20] = var21;
            field2453[var20] = var32;
            field2476[var20] = var23;
         }
      }

      try {
         this.method5171(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("pp")
   public void method5206() {
      this.field2422 = null;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIJ)V")
   @ObfuscatedName("fu")
   void method5166(int var1, classUP var2, classUP var3, int var4, int var5, int var6, long var7) {
      if (classFH.field2257.field2217 != 1 || this.field2444 != null || this.field2425 != 0) {
         int var9 = var2.method11443(1237894015);
         int var10 = classUP.method11445(var2, (byte)-69);
         int var11 = var3.method11443(1606683675);
         int var12 = classUP.method11445(var3, (byte)-3);
         float var13 = var2.method11449(2111974549);
         float var14 = var2.method11451((byte)125);
         float var15 = var3.method11449(2132282507);
         float var16 = var3.method11451((byte)127);
         if (this.field2489 != 1) {
            this.method5230();
         }

         this.method5092(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.field2491 * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > -1061492015 && var18 < classFQ.method4929()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.field2491) * classFH.method4727();
            if (var22 / var20 < classFH.method4716()) {
               int var23 = (var21 + this.field2491) * classFH.method4727();
               if (var23 / var20 > classFH.method4712()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.field2491 * var9 >> 16;
                  int var26 = var25 + (this.field2492 * var10 >> 16);
                  int var27 = (var24 + var26) * classFH.method4727();
                  if (var27 / var20 > classFH.method4724()) {
                     int var28 = var25 + (this.field1743 * -1256242689 * var10 >> 16);
                     int var29 = (var24 - var28) * classFH.method4727();
                     if (var29 / var20 < classFH.method4720()) {
                        int var30 = var19 + (this.field1743 * -432844799 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 865534903) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.field2437 != null;
                        int var34 = classCS.method2595(-502055544);
                        int var35 = -129880211 * classFO.field2348;
                        boolean var37 = classAS.method660(1907553954);
                        boolean var39 = 0L != var7;
                        if (var39) {
                           boolean var40 = 1 == (int)(var7 >>> 19 & 1L);
                           var39 = !var40;
                        }

                        boolean var55 = false;
                        if (var39 && var37) {
                           boolean var41 = false;
                           if (field2448) {
                              var41 = Projectile.method1219(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 classFH.method4705(),
                                 classFH.method4710(),
                                 classFH.method4727(),
                                 1407604053
                              );
                           } else {
                              int var42 = var18 - var19;
                              if (var42 <= 471943653) {
                                 var42 = -1319565614;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var42;
                              } else {
                                 var23 /= var20;
                                 var22 /= var42;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var42;
                              } else {
                                 var27 /= var20;
                                 var29 /= var42;
                              }

                              int var43 = var34 - classFH.method4705();
                              int var44 = var35 - classFH.method4710();
                              if (var43 > var22 && var43 < var23 && var44 > var29 && var44 < var27) {
                                 var41 = true;
                              }
                           }

                           if (var41) {
                              if (this.field2421) {
                                 int var60 = classFH.method4705();
                                 int var45 = classFH.method4710();
                                 int var46 = classFH.method4727();
                                 classEV.method4087(var13, var14, var15, var16, var60, var45, var46, (byte)-24);
                                 int var57 = classSZ.method10730(
                                    var4,
                                    var5,
                                    var6,
                                    client.field1069 * -436230143,
                                    -1993288235 * classDX.field1662,
                                    -1674330987 * classDU.field1633,
                                    1788691143 * classDB.field1375,
                                    -938609029 * classYJ.field6994,
                                    632410639 * World.field1165,
                                    this.method5093(var1),
                                    -563823246
                                 );
                                 int var47 = var57 + 32;
                                 classGI.method5448(var7, var47, -74243497);
                              } else {
                                 var55 = true;
                              }
                           }
                        }

                        int var56 = classFH.method4705();
                        int var58 = classFH.method4710();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = classFH.field2255[var1];
                           var61 = classFH.field2259[var1];
                        }

                        for (int var62 = 0; var62 < this.field2424; var62++) {
                           float var63 = (int)this.field2427[var62];
                           float var66 = (int)this.field2430[var62];
                           float var48 = (int)this.field2426[var62];
                           if (var1 != 0) {
                              float var49 = var48 * var59 + var63 * var61;
                              var48 = var48 * var61 - var63 * var59;
                              var63 = var49;
                           }

                           var63 += var4;
                           var66 += var5;
                           var48 += var6;
                           float var71 = var48 * var15 + var63 * var16;
                           var48 = var48 * var16 - var63 * var15;
                           float var72 = var66 * var14 - var48 * var13;
                           var48 = var66 * var13 + var48 * var14;
                           var31 |= classKD.method6465(this, var62, var71, var72, var48, var18, var56, var58, var33);
                        }

                        try {
                           this.method5171(var31, var55, this.field2421, var7);
                        } catch (Exception var50) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public byte getOverrideSaturation() {
      return this.field2422 != null ? this.field2422.field2301 : 0;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fj")
   public void method5157(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2424; var4++) {
         this.field2427[var4] = (int)this.field2427[var4] * var1 / -1277400391;
         this.field2430[var4] = (int)this.field2430[var4] * var2 / -381887117;
         this.field2426[var4] = (int)this.field2426[var4] * var3 / 128;
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lfz;)V")
   @ObfuscatedName("ge")
   void method5213(classFZ var1) {
      this.field2423 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfz;)V")
   @ObfuscatedName("hz")
   void method5214(classFZ var1) {
      this.field2423 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfz;)V")
   @ObfuscatedName("hw")
   void method5215(classFZ var1) {
      this.field2423 = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qa")
   public void method5142() {
      for (int var1 = 0; var1 < this.field2493; var1++) {
         int var2 = (int)this.field2426[var1];
         this.field2430[var1] = this.field2430[var1];
         this.field2427[var1] = -var2;
      }

      classZG.method13998(this);
   }

   public int getUvBufferOffset() {
      return this.field2494;
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("bx")
   public void method5112(classSN var1, int var2) {
      classEM var3 = var1.field5983;
      classEF var4 = var3.method3924((byte)90);
      if (var4 != null) {
         var4.method3865(var1, var2, -1468766705);
         this.method5115(var4, var1.method10516(-1499030123));
      }

      if (classSN.method10518(var1, 1772783837)) {
         this.method5221(var1, var2);
      }

      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("bw")
   public void method5150(classUL var1) {
      classUZ var2 = classHZ.method6135(16777216);

      for (int var3 = 0; var3 < this.field2489; var3++) {
         var2.method11728((int)this.field2427[var3], (int)this.field2426[var3], (int)this.field2430[var3], 2115498524);
         var2.method11780(var1, -1949319718);
         this.field2430[var3] = var2.field6427;
         this.field2430[var3] = var2.field6427;
         this.field2430[var3] = var2.field6425;
      }

      classUZ.method11727(var2, 1774614733);
      classZG.method13998(this);
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("bf")
   boolean method5169(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field2467[var1] = (int)var4 - var5;
      if (var8) {
         field2480[var1] = (int)var2;
         field2451[var1] = (int)var3;
         field2453[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         field2450[var1] = var6 + var2 * classFH.method4730() / var4;
         field2446[var1] = var7 + var3 * classFH.method4730() / var4;
         field2454[var1] = var4;
         return false;
      } else {
         field2450[var1] = -5000.0F;
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ff")
   void method5181(boolean var1) {
      for (char var2 = 0; var2 < this.field2419; var2++) {
         if (!field2445[var2]) {
            int var3 = (field2473[this.field2429[var2]] + field2473[this.field2435[var2]] + field2457[this.field2440[var2]]) / 3 + this.field2490;
            char[] var10000 = field2456[var3];
            field2455[var3]++;
            var10000[field2455[var3]] = var2;
         }
      }

      if (this.field2436 != null && var1) {
         this.method5176();
      } else {
         for (int var6 = this.field2418 - 1; var6 >= 0; var6--) {
            char var7 = field2455[var6];
            if (var7 > 0) {
               char[] var4 = field2456[var6];

               for (int var5 = 0; var5 < var7; var5++) {
                  this.method5196(var4[var5]);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bh")
   int method5186(int var1) {
      if (this.field2420 == -1) {
         return 253;
      } else {
         int var2 = this.field2425 & 255;
         if (var2 > 0 && var1 < 253) {
            int var3 = 253 - var1;
            int var4 = var3 * var2 >> 8;
            return var1 + var4;
         } else {
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("rl")
   public void method5269(classSN var1, int var2) {
      this.method5221(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method5226() {
      if (this.field2491 != 2) {
         this.field2489 = 2;
         float var1 = 0.0F;

         for (int var2 = 0; var2 < this.field2424; var2++) {
            float var3 = this.field2427[var2];
            float var4 = this.field2427[var2];
            float var5 = this.field2427[var2];
            float var6 = var3 * var3 + var5 * var5 + var4 * var4;
            if (var6 > var1) {
               var1 = var6;
            }
         }

         this.field2424 = (int)Math.ceil(Math.sqrt(var1));
         this.field2491 = this.field2490;
         this.field2424 = this.field2491 + this.field2418;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("kj")
   public static void method5143(Model var0) {
      if (var0 == null) {
         var0.method5102();
      } else {
         for (int var1 = 0; var1 < var0.field2424; var1++) {
            int var2 = (int)var0.field2426[var1];
            var0.field2426[var1] = var0.field2427[var1];
            var0.field2427[var1] = -var2;
         }

         classZG.method13998(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("cq")
   void method5231(classEF var1, int var2) {
      this.method5240(rl21.field5728, var1, var2);
   }

   public boolean useBoundingBox() {
      return this.field2421;
   }

   @ObfuscatedSignature(descriptor = "(ZLfx;[B)V")
   @ObfuscatedName("xa")
   public void method5218(boolean var1, Model var2, byte[] var3) {
      var2.field2503 = this.field2503;
      var2.field2504 = this.field2504;
      var2.field2505 = this.field2505;
      var2.field2506 = this.field2506;
   }

   public byte[] getFaceBias() {
      return this.field2438;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("el")
   public void method5207() {
      this.field2422 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("ch")
   void method5078(Model var1) {
      if (var1 != null) {
         this.method5076(var1);

         for (int var2 = 0; var2 < var1.field2419; var2++) {
            this.field2428[this.field2496] = var1.field2440[var2] + this.field2493;
            this.field2501[this.field2495] = var1.field2440[var2] + this.field2493;
            this.field2500[this.field2495] = var1.field2428[var2] + this.field2490;
            this.field2441[this.field2494] = var1.field2441[var2];
            this.field2440[this.field2419] = var1.field2439[var2];
            this.field2441[this.field2496] = var1.field2429[var2];
            if (this.field2436 != null) {
               this.field2438[this.field2419] = var1.field2438 != null ? var1.field2431[var2] : var1.field2420;
            }

            if (this.field2444 != null && var1.field2444 != null) {
               this.field2444[this.field2495] = var1.field2444[var2];
            }

            if (this.field2437 != null) {
               this.field2437[this.field2419] = var1.field2437 != null ? var1.field2437[var2] : -1;
            }

            if (this.field2431 != null) {
               if (var1.field2436 != null && var1.field2438[var2] != -1) {
                  this.field2436[this.field2495] = (byte)(var1.field2438[var2] + this.field2490);
               } else {
                  this.field2431[this.field2419] = -1;
               }
            }

            if (this.field2436 != null && var1.field2438 != null) {
               this.field2431[this.field2419] = var1.field2436[var2];
            }

            this.field2419 = this.field2494 + 1;
         }

         for (int var3 = 0; var3 < var1.field2490; var3++) {
            this.field2428[this.field2489] = var1.field2502[var3] + this.field2492;
            this.field2500[this.field2491] = var1.field2429[var3] + this.field2418;
            this.field2501[this.field2491] = var1.field2502[var3] + this.field2424;
            this.field2424 = this.field2493 + 1;
         }

         for (int var4 = 0; var4 < var1.field2490; var4++) {
            this.field2426[this.field2492] = var1.field2426[var4];
            this.field2426[this.field2492] = var1.field2427[var4];
            this.field2427[this.field2489] = var1.field2430[var4];
            this.field2424 = this.field2491 + 1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfz;)V")
   @ObfuscatedName("co")
   void method5216(classFZ var1) {
      this.field2423 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lfs;ILfs;III)V")
   @ObfuscatedName("io")
   public void method5251(rl21 var1, classFS var2, int var3, classFS var4, int var5, int var6, int var7) {
      if (this.field2442 != null && var3 != -1) {
         classET var8 = var2.field2392[var3];
         classEM var9 = var8.field1911;
         classET var10 = null;
         if (var4 != null) {
            var10 = var4.field2392[var5];
            if (var10.field1911 != var9) {
               var10 = null;
            }
         }

         var1.field5731 = var1.field5729 = var1.field5730 = 0.0F;
         this.method5236(var1, var9, var8, var10, var6 + (float)classMG.field4500, var7);
         this.method5257();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lfx;)V")
   @ObfuscatedName("dm")
   public static void method5075(Model var0, Model var1) {
      int var2 = var0.field2429.length;
      if (var0.field2431 == null && (var1.field2431 != null || var0.field2420 != var1.field2420)) {
         var0.field2431 = new byte[var2];
         Arrays.fill(var0.field2431, var0.field2420);
      }

      if (var0.field2444 == null && var1.field2444 != null) {
         var0.field2444 = new byte[var2];
         Arrays.fill(var0.field2444, (byte)0);
      }

      if (var0.field2437 == null && var1.field2437 != null) {
         var0.field2437 = new short[var2];
         Arrays.fill(var0.field2437, (short)-1);
      }

      if (var0.field2436 == null && var1.field2436 != null) {
         var0.field2436 = new byte[var2];
         Arrays.fill(var0.field2436, (byte)-1);
      }

      if (var0.field2438 == null && var1.field2438 != null) {
         var0.field2438 = new byte[var2];
         Arrays.fill(var0.field2438, (byte)0);
      }
   }

   public int[] getVertexNormalsZ() {
      return this.field2505;
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("dj")
   void method5119(classEF var1, int var2) {
      NpcOverrides.method9089(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(ILuu;)V")
   @ObfuscatedName("ct")
   void method5243(int var1, classUU var2) {
      float var3 = this.field2427[var1];
      float var4 = -this.field2430[var1];
      float var5 = -this.field2426[var1];
      float var6 = 1.0F;
      this.field2426[var1] = var2.field6399 * var3 + var2.field6397 * var4 + var2.field6399 * var5 + var2.field6389 * var6;
      this.field2426[var1] = -(var2.field6388 * var3 + var2.field6394 * var4 + var2.field6388 * var5 + var2.field6396 * var6);
      this.field2426[var1] = -(var2.field6388 * var3 + var2.field6398 * var4 + var2.field6397 * var5 + var2.field6393 * var6);
   }
}
