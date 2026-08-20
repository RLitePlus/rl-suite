import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gs")
public class classGS extends AbstractWorldMapIcon {
   @ObfuscatedSignature(descriptor = "Lmj;")
   @ObfuscatedName("lw")
   static Task field2677;
   @ObfuscatedSignature(descriptor = "Lgr;")
   @ObfuscatedName("af")
   final WorldMapRegion field2671;
   @ObfuscatedName("ae")
   int field2672;
   @ObfuscatedSignature(descriptor = "Lhw;")
   @ObfuscatedName("ab")
   classHW field2676;
   @ObfuscatedName("az")
   final int field2670;
   @ObfuscatedName("as")
   int field2674;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2675 = 8;
   @ObfuscatedName("ag")
   int field2673;

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ag")
   @Override
   int vmethod494(short var1) {
      try {
         return -848641265 * this.field2674;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gs.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;)Z")
   @ObfuscatedName("wk")
   public static boolean method5738(classAJ var0) {
      return var0.field188;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod486(byte var1) {
      try {
         return 438436917 * this.field2672;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gs.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   @Override
   public int vmethod487() {
      return 438436917 * this.field2672;
   }

   classGS(classKY var1, classKY var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.field2670 = var3 * 337796475;
      this.field2671 = var4;
      method5741(this, -2056555655);
   }

   @ObfuscatedSignature(descriptor = "()Lhw;")
   @ObfuscatedName("aj")
   @Override
   classHW vmethod490() {
      return this.field2676;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method5739() {
      this.field2672 = classOM.method8553(classMU.method7729(-2124088909 * this.field2670, 2061643910), 787246566).field4953 * -321587624;
      this.field2676 = this.field2671.method5725(SceneTilePaint.method4796(438436917 * this.field2672, (byte)-120), 2100600624);
      WorldMapElement var1 = SceneTilePaint.method4796(this.vmethod486((byte)-56), (byte)-127);
      SpritePixels var2 = var1.method9199(false, -1091971536);
      if (null != var2) {
         this.field2673 = var2.field7007 * 983030740;
         this.field2674 = var2.field7009 * 2028588015;
      } else {
         this.field2673 = 0;
         this.field2674 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method5740() {
      this.field2672 = classOM.method8553(classMU.method7729(-2124088909 * this.field2670, 1531493942), 1148526281).field4953 * -428529809;
      this.field2676 = this.field2671.method5725(SceneTilePaint.method4796(438436917 * this.field2672, (byte)-100), 2116896056);
      WorldMapElement var1 = SceneTilePaint.method4796(this.vmethod486((byte)-100), (byte)-88);
      SpritePixels var2 = var1.method9199(false, -1028849822);
      if (null != var2) {
         this.field2673 = var2.field7007 * 243856479;
         this.field2674 = var2.field7009 * -602961950;
      } else {
         this.field2673 = 0;
         this.field2674 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;I)V")
   @ObfuscatedName("ur")
   public static void method5741(classGS var0, int var1) {
      if (var0 == null) {
         var0.method5743(var1);
      } else {
         try {
            var0.field2672 = classOM.method8553(classMU.method7729(-2124088909 * var0.field2670, 1341031024), -1235016594).field4953 * 1742286829;
            var0.field2676 = var0.field2671.method5725(SceneTilePaint.method4796(438436917 * var0.field2672, (byte)-117), 1548070523);
            WorldMapElement var2 = SceneTilePaint.method4796(var0.vmethod486((byte)-77), (byte)-60);
            SpritePixels var3 = var2.method9199(false, -979775303);
            if (null != var3) {
               if (var1 >= -550936162) {
                  throw new IllegalStateException();
               }

               var0.field2673 = var3.field7007 * 243856479;
               var0.field2674 = var3.field7009 * 2028588015;
            } else {
               var0.field2673 = 0;
               var0.field2674 = 0;
            }
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "gs.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lhw;")
   @ObfuscatedName("ae")
   @Override
   classHW vmethod491(byte var1) {
      try {
         return this.field2676;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gs.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   @Override
   public int vmethod488() {
      return 438436917 * this.field2672;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   public int vmethod489() {
      return 438436917 * this.field2672;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("to")
   public static void method5742(classGS var0) {
      var0.field2672 = classOM.method8553(classMU.method7729(-1330273219 * var0.field2670, 1302487244), -890834553).field4953 * 1742286829;
      var0.field2676 = var0.field2671.method5725(SceneTilePaint.method4796(438436917 * var0.field2672, (byte)-86), 1683798244);
      WorldMapElement var1 = SceneTilePaint.method4796(var0.vmethod486((byte)-71), (byte)-23);
      SpritePixels var2 = var1.method9199(false, 696385653);
      if (null != var2) {
         var0.field2673 = var2.field7007 * 1497079364;
         var0.field2674 = var2.field7009 * -434551356;
      } else {
         var0.field2673 = 0;
         var0.field2674 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   int vmethod495() {
      return 1265877192 * this.field2674;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   int vmethod492() {
      return this.field2673 * -702388321;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   @Override
   int vmethod493(int var1) {
      try {
         return this.field2673 * -702388321;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gs.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   int vmethod496() {
      return -848641265 * this.field2674;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   @Override
   int vmethod497() {
      return -848641265 * this.field2674;
   }

   @ObfuscatedSignature(descriptor = "([I[JIII)V")
   @ObfuscatedName("ac")
   public static void method5744(int[] var0, long[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 == -1188251123) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (Integer.MAX_VALUE == var7) {
               if (var4 == -1188251123) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var10 = var10000;

            for (int var11 = var2; var11 < var3; var11++) {
               if (var4 == -1188251123) {
                  return;
               }

               if (var0[var11] < var7 + (var11 & var10)) {
                  if (var4 == -1188251123) {
                     throw new IllegalStateException();
                  }

                  int var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  long var13 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var13;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method5744(var0, var1, var2, var6 - 1, 1038806780);
            method5744(var0, var1, var6 + 1, var3, 1270778146);
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "gs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method5743(int var1) {
      try {
         this.field2673 = classOM.method8553(classMU.method7729(-2124088909 * this.field2670, 1341031024), -1235016594).field4954 * 1742286829;
         this.field2676 = this.field2671.method5725(SceneTilePaint.method4796(438436917 * this.field2672, (byte)-117), 1548070523);
         WorldMapElement var2 = SceneTilePaint.method4796(this.vmethod486((byte)-77), (byte)-60);
         SpritePixels var3 = var2.method9199(false, -979775303);
         if (null != var3) {
            if (var1 >= -550936162) {
               throw new IllegalStateException();
            }

            this.field2673 = var3.field7010 * 243856479;
            this.field2674 = var3.field7009 * 2028588015;
         } else {
            this.field2672 = 0;
            this.field2673 = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gs.az(" + ')');
      }
   }
}
