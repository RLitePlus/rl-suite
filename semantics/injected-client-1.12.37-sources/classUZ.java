import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uz")
public class classUZ {
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("ag")
   public static final classUZ field6433 = new classUZ(0.0F, -1.0F, 0.0F);
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("ab")
   public static final classUZ field6431 = new classUZ(0.0F, 0.0F, -1.0F);
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("ae")
   public static final classUZ field6432 = new classUZ(0.0F, 1.0F, 0.0F);
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("az")
   public static final classUZ field6428 = new classUZ(0.0F, 0.0F, 0.0F);
   @ObfuscatedSignature(descriptor = "[Luz;")
   @ObfuscatedName("as")
   static final classUZ[] field6430 = new classUZ[classUZ.field6429 * -2140716621];
   @ObfuscatedName("ax")
   static final int field6429 = -904570960;
   @ObfuscatedName("al")
   public float field6426;
   @ObfuscatedName("ac")
   static int field6435 = 0;
   @ObfuscatedName("aa")
   public float field6427;
   @ObfuscatedName("ao")
   public float field6425;
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("af")
   public static final classUZ field6434 = new classUZ(1.0F, 0.0F, 0.0F);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public void method11725() {
      synchronized (field6430) {
         if (-423594961 * field6435 < -341335151 * field6429) {
            field6430[(field6435 += -2112947797) * -1124722655 - 1] = this;
         }
      }
   }

   classUZ(float var1, float var2, float var3) {
      this.field6427 = var1;
      this.field6425 = var2;
      this.field6426 = var3;
   }

   classUZ(classUZ var1) {
      this.field6427 = var1.field6427;
      this.field6425 = var1.field6425;
      this.field6426 = var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   final void method11737() {
      this.field6426 = 0.0F;
      this.field6425 = 0.0F;
      this.field6427 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("aa")
   public void method11728(float var1, float var2, float var3, int var4) {
      try {
         this.field6427 = var1;
         this.field6425 = var2;
         this.field6426 = var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "uz.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("ao")
   void method11732(classUZ var1, int var2) {
      try {
         this.method11728(var1.field6427, var1.field6425, var1.field6426, 1686353034);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   final void method11738(int var1) {
      try {
         this.field6426 = 0.0F;
         this.field6425 = 0.0F;
         this.field6427 = 0.0F;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "uz.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("am")
   public static classUZ method11712(float var0, float var1, float var2) {
      synchronized (field6430) {
         if (-1124722655 * field6435 == 0) {
            return new classUZ(var0, var1, var2);
         } else {
            field6430[(field6435 -= 801074145) * -1124722655].method11728(var0, var1, var2, 2018270634);
            return field6430[-1124722655 * field6435];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   public final void method11747(int var1) {
      try {
         float var2 = 1.0F / this.method11774(-1808401369);
         this.field6427 *= var2;
         this.field6425 *= var2;
         this.field6426 *= var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cs")
   final void method11759(classUZ var1) {
      this.field6427 = this.field6427 - var1.field6427;
      this.field6425 = this.field6425 - var1.field6425;
      this.field6426 = this.field6426 - var1.field6426;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Lul;)V")
   @ObfuscatedName("up")
   public static void method11779(classUZ var0, classUL var1) {
      classUL var2 = classQQ.method9713(var0.field6427, var0.field6425, var0.field6426, 0.0F, -2119413410);
      classUL var3 = classQE.method9495(var1, (byte)112);
      classUL var4 = classED.method3835(var3, var2, 42710306);
      var4.method11390(var1, 1591236864);
      var0.method11728(var4.field6325, var4.field6326, var4.field6327, 1942084358);
      var2.method11357(-245247090);
      var3.method11357(-922479729);
      var4.method11357(-559441743);
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("ap")
   public final void method11754(float var1, float var2, float var3, int var4) {
      try {
         this.field6427 += var1;
         this.field6425 += var2;
         this.field6426 += var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "uz.ap(" + ')');
      }
   }

   static {
      new classUZ(1.0F, 1.0F, 1.0F);
      new classUZ(0.0F, 0.0F, 1.0F);
      new classUZ(1.0F, 0.0F, 0.0F);
      new classUZ(-1.0F, 0.0F, 0.0F);
      new classUZ(0.0F, 0.0F, 1.0F);
      new classUZ(0.0F, 1.0F, 0.0F);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("cp")
   public final void method11755(float var1, float var2, float var3) {
      this.field6427 += var1;
      this.field6425 += var2;
      this.field6426 += var3;
   }

   @ObfuscatedSignature(descriptor = "(Luz;S)F")
   @ObfuscatedName("ar")
   final float method11765(classUZ var1, short var2) {
      try {
         return var1.field6426 * this.field6426 + (this.field6427 * var1.field6427 + var1.field6425 * this.field6425);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("ai")
   final void method11768(classUZ var1, int var2) {
      try {
         this.method11728(
            var1.field6426 * this.field6425 - this.field6426 * var1.field6425,
            this.field6426 * var1.field6427 - var1.field6426 * this.field6427,
            this.field6427 * var1.field6425 - this.field6425 * var1.field6427,
            1942851705
         );
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ak")
   public final float method11774(int var1) {
      try {
         return (float)Math.sqrt(this.field6426 * this.field6426 + (this.field6425 * this.field6425 + this.field6427 * this.field6427));
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "uz.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("av")
   final void method11775(float var1, int var2) {
      try {
         this.field6427 *= var1;
         this.field6425 *= var1;
         this.field6426 *= var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("at")
   public final void method11780(classUL var1, int var2) {
      try {
         classUL var3 = classQQ.method9713(this.field6427, this.field6425, this.field6426, 0.0F, -1320248703);
         classUL var4 = classQE.method9495(var1, (byte)124);
         classUL var5 = classED.method3835(var4, var3, 1384267445);
         var5.method11390(var1, 1591236864);
         this.method11728(var5.field6325, var5.field6326, var5.field6327, 1697852429);
         var3.method11357(846791916);
         var4.method11357(-1927076050);
         var5.method11357(-1744029903);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "uz.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("bn")
   public static classUZ method11713(float var0, float var1, float var2) {
      synchronized (field6430) {
         if (-1124722655 * field6435 == 0) {
            return new classUZ(var0, var1, var2);
         } else {
            field6430[(field6435 -= 801074145) * -1124722655].method11728(var0, var1, var2, 2140828537);
            return field6430[-1124722655 * field6435];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11782() {
      return this.field6427 + ", " + this.field6425 + ", " + this.field6426;
   }

   public classUZ() {
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bw")
   public void method11729(float var1, float var2, float var3) {
      this.field6427 = var1;
      this.field6425 = var2;
      this.field6426 = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("ah")
   public static classUZ method11714(float var0, float var1, float var2) {
      synchronized (field6430) {
         if (1659307323 * field6435 == 0) {
            return new classUZ(var0, var1, var2);
         } else {
            field6430[(field6435 -= -705569252) * -1124722655].method11728(var0, var1, var2, 1833575835);
            return field6430[-1124722655 * field6435];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;FB)V")
   @ObfuscatedName("au")
   public final void method11757(classUZ var1, float var2, byte var3) {
      try {
         this.field6427 = this.field6427 + var1.field6427 * var2;
         this.field6425 = this.field6425 + var2 * var1.field6425;
         this.field6426 = this.field6426 + var2 * var1.field6426;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "uz.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;)Luz;")
   @ObfuscatedName("bx")
   public static classUZ method11715(classUZ var0) {
      synchronized (field6430) {
         if (0 == -1124722655 * field6435) {
            return new classUZ(var0);
         } else {
            field6430[(field6435 -= 998381365) * -1124722655].method11732(var0, 138131447);
            return field6430[-1492309671 * field6435];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("bc")
   public static final classUZ method11716(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)2);
      var2.method11764(var1, -291135846);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)V")
   @ObfuscatedName("ww")
   public static void method11769(classUZ var0, classUZ var1) {
      if (var0 == null) {
         var0.method11773(var0);
      }

      var0.method11728(
         var1.field6426 * var0.field6425 - var0.field6426 * var1.field6425,
         var0.field6426 * var1.field6427 - var1.field6426 * var0.field6427,
         var0.field6427 * var1.field6425 - var0.field6425 * var1.field6427,
         1664425080
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("bp")
   public static final classUZ method11717(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)-74);
      var2.method11764(var1, -291135846);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("br")
   public static final classUZ method11718(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)-84);
      var2.method11764(var1, -291135846);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)F")
   @ObfuscatedName("bm")
   public static final float method11719(classUZ var0, classUZ var1) {
      return var0.method11765(var1, (short)10641);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)F")
   @ObfuscatedName("bt")
   public static final float method11720(classUZ var0, classUZ var1) {
      return var0.method11765(var1, (short)-16238);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cb")
   public final void method11752(classUZ var1) {
      this.field6427 = this.field6427 + var1.field6427;
      this.field6425 = this.field6425 + var1.field6425;
      this.field6426 = this.field6426 + var1.field6426;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("bj")
   public static final classUZ method11721(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)50);
      var2.method11768(var1, -985130897);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("bk")
   public static final classUZ method11722(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)-20);
      var2.method11768(var1, -1264866644);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("zv")
   public static void method11748(classUZ var0) {
      if (var0 == null) {
         var0.method11782();
      }

      float var1 = 1.0F / var0.method11774(-1808401369);
      var0.field6427 *= var1;
      var0.field6425 *= var1;
      var0.field6426 *= var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;F)Luz;")
   @ObfuscatedName("bo")
   public static final classUZ method11724(classUZ var0, float var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)-22);
      var2.method11775(var1, 1904316259);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Luz;B)Z")
   @ObfuscatedName("vn")
   public static boolean method11745(classUZ var0, byte var1) {
      if (var0 == null) {
         var0.method11746(var1);
      }

      try {
         boolean var10000;
         label62: {
            float var3 = var0.field6427;
            if (var3 < 9.765625E-4F) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var3 > -9.765625E-4F) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label62;
               }
            }

            var10000 = false;
         }

         boolean var2 = var10000;
         float var6 = var0.field6425;
         if (var6 < 9.765625E-4F && var6 > -9.765625E-4F) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7;
         label51: {
            boolean var5 = var10000;
            var7 = var2 & var5;
            float var9 = var0.field6426;
            if (var9 < 9.765625E-4F) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var9 > -9.765625E-4F) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label51;
               }
            }

            var10000 = false;
         }

         boolean var8 = var10000;
         return var7 & var8;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "uz.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public void method11726() {
      synchronized (field6430) {
         if (-1124722655 * field6435 < -2140716621 * field6429) {
            field6430[(field6435 += 801074145) * -1124722655 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)Luz;")
   @ObfuscatedName("bg")
   public static final classUZ method11723(classUZ var0, classUZ var1) {
      classUZ var2 = WorldMapArea.method5840(var0, (byte)-35);
      var2.method11768(var1, -1780703631);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   final void method11739() {
      this.field6426 = 0.0F;
      this.field6425 = 0.0F;
      this.field6427 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cf")
   final void method11770(classUZ var1) {
      this.method11728(
         var1.field6426 * this.field6425 - this.field6426 * var1.field6425,
         this.field6426 * var1.field6427 - var1.field6426 * this.field6427,
         this.field6427 * var1.field6425 - this.field6425 * var1.field6427,
         1899156015
      );
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("ad")
   public final void method11753(classUZ var1, int var2) {
      try {
         this.field6427 = this.field6427 + var1.field6427;
         this.field6425 = this.field6425 + var1.field6425;
         this.field6426 = this.field6426 + var1.field6426;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;Luz;B)Z")
   @ObfuscatedName("yp")
   public static boolean method11742(classUZ var0, classUZ var1, byte var2) {
      if (var0 == null) {
         var0.method11744(var0, var2);
      }

      try {
         if (var0.field6427 == var1.field6427) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var1.field6425 == var0.field6425) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var1.field6426 == var0.field6426) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("oh")
   public void method11785() {
      this.method11747(1213748358);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("be")
   void method11733(classUZ var1) {
      this.method11728(var1.field6427, var1.field6425, var1.field6426, 1805805294);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("by")
   void method11734(classUZ var1) {
      this.method11728(var1.field6427, var1.field6425, var1.field6426, 1642542008);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("bq")
   void method11735(classUZ var1) {
      this.method11728(var1.field6427, var1.field6425, var1.field6426, 2085765392);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("bf")
   void method11736(classUZ var1) {
      this.method11728(var1.field6427, var1.field6425, var1.field6426, 1870058782);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   final void method11740() {
      this.field6426 = 0.0F;
      this.field6425 = 0.0F;
      this.field6427 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   final void method11741() {
      this.field6426 = 0.0F;
      this.field6425 = 0.0F;
      this.field6427 = 0.0F;
   }

   @Override
   public String toString() {
      try {
         return this.field6427 + ", " + this.field6425 + ", " + this.field6426;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "uz.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)Luz;")
   @ObfuscatedName("fk")
   public static classUZ method11786(float var0, float var1, float var2) {
      return classIK.method6218(var0, var1, var2, (byte)-64);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bi")
   public void method11730(float var1, float var2, float var3) {
      this.field6427 = var1;
      this.field6425 = var2;
      this.field6426 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)Z")
   @ObfuscatedName("bh")
   public boolean method11743(classUZ var1) {
      return this.field6427 == var1.field6427 && var1.field6425 == this.field6425 && var1.field6426 == this.field6426;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Luz;")
   @ObfuscatedName("an")
   public static classUZ method11711() {
      synchronized (field6430) {
         if (929647618 * field6435 == 0) {
            return new classUZ();
         } else {
            field6430[(field6435 -= -337739282) * -1543405511].method11738(-1792024384);
            return field6430[-402165147 * field6435];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   public final void method11749() {
      float var1 = 1.0F / this.method11774(-1808401369);
      this.field6427 *= var1;
      this.field6425 *= var1;
      this.field6426 *= var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method11783() {
      return this.field6427 + ", " + this.field6425 + ", " + this.field6426;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("ct")
   public final void method11756(float var1, float var2, float var3) {
      this.field6427 += var1;
      this.field6425 += var2;
      this.field6426 += var3;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11784() {
      return this.field6427 + ", " + this.field6425 + ", " + this.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)F")
   @ObfuscatedName("ck")
   final float method11766(classUZ var1) {
      return var1.field6426 * this.field6426 + (this.field6427 * var1.field6427 + var1.field6425 * this.field6425);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cl")
   final void method11760(classUZ var1) {
      this.field6427 = this.field6427 - var1.field6427;
      this.field6425 = this.field6425 - var1.field6425;
      this.field6426 = this.field6426 - var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cd")
   final void method11761(classUZ var1) {
      this.field6427 = this.field6427 - var1.field6427;
      this.field6425 = this.field6425 - var1.field6425;
      this.field6426 = this.field6426 - var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("uv")
   public void method11787(classUL var1) {
      this.method11780(var1, -1804299098);
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cv")
   final void method11762(classUZ var1) {
      this.field6427 = this.field6427 - var1.field6427;
      this.field6425 = this.field6425 - var1.field6425;
      this.field6426 = this.field6426 - var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Luz;F)V")
   @ObfuscatedName("cq")
   public final void method11758(classUZ var1, float var2) {
      this.field6427 = this.field6427 + var1.field6427 * var2;
      this.field6425 = this.field6425 + var2 * var1.field6425;
      this.field6426 = this.field6426 + var2 * var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cy")
   final void method11763(classUZ var1) {
      this.field6427 = this.field6427 - var1.field6427;
      this.field6425 = this.field6425 - var1.field6425;
      this.field6426 = this.field6426 - var1.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("hb")
   public static void method11727(classUZ var0, int var1) {
      if (var0 == null) {
         var0.method11751(var1);
      } else {
         try {
            synchronized (field6430) {
               if (-1124722655 * field6435 < -2140716621 * field6429) {
                  if (var1 <= 1658407667) {
                     throw new IllegalStateException();
                  }

                  field6430[(field6435 += 801074145) * -1124722655 - 1] = var0;
               }
            }
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "uz.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;)F")
   @ObfuscatedName("co")
   final float method11767(classUZ var1) {
      return var1.field6426 * this.field6426 + (this.field6427 * var1.field6427 + var1.field6425 * this.field6425);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;Luz;)V")
   @ObfuscatedName("bh")
   public static void method11771(classUZ var0, classUZ var1) {
      if (var0 == null) {
         var0.method11770(var0);
      }

      var0.method11728(
         var1.field6426 * var0.field6425 - var0.field6426 * var1.field6425,
         var0.field6426 * var1.field6427 - var1.field6426 * var0.field6427,
         var0.field6427 * var1.field6425 - var0.field6425 * var1.field6427,
         1704323527
      );
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bb")
   public void method11731(float var1, float var2, float var3) {
      this.field6427 = var1;
      this.field6425 = var2;
      this.field6426 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("aw")
   final void method11764(classUZ var1, int var2) {
      try {
         this.field6427 = this.field6427 - var1.field6427;
         this.field6425 = this.field6425 - var1.field6425;
         this.field6426 = this.field6426 - var1.field6426;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("cn")
   final void method11772(classUZ var1) {
      this.method11728(
         var1.field6426 * this.field6425 - this.field6426 * var1.field6425,
         this.field6426 * var1.field6427 - var1.field6426 * this.field6427,
         this.field6427 * var1.field6425 - this.field6425 * var1.field6427,
         1787747073
      );
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cz")
   final void method11776(float var1) {
      this.field6427 *= var1;
      this.field6425 *= var1;
      this.field6426 *= var1;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cg")
   final void method11777(float var1) {
      this.field6427 *= var1;
      this.field6425 *= var1;
      this.field6426 *= var1;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cw")
   final void method11778(float var1) {
      this.field6427 *= var1;
      this.field6425 *= var1;
      this.field6426 *= var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("qz")
   public static void method11750(classUZ var0) {
      if (var0 == null) {
         var0.method11740();
      }

      float var1 = 1.0F / var0.method11774(-1808401369);
      var0.field6427 *= var1;
      var0.field6425 *= var1;
      var0.field6426 *= var1;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("cj")
   public final void method11781(classUL var1) {
      classUL var2 = classQQ.method9713(this.field6427, this.field6425, this.field6426, 0.0F, -750862988);
      classUL var3 = classQE.method9495(var1, (byte)65);
      classUL var4 = classED.method3835(var3, var2, 1237511684);
      var4.method11390(var1, 1591236864);
      this.method11728(var4.field6325, var4.field6326, var4.field6327, 1714710211);
      var2.method11357(512029697);
      var3.method11357(1552780190);
      var4.method11357(991154170);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("zp")
   public void method11788() {
      method11727(this, 2094341737);
   }

   @ObfuscatedSignature(descriptor = "(Luz;B)Z")
   @ObfuscatedName("aj")
   public boolean method11744(classUZ var1, byte var2) {
      try {
         if (this.field6427 == var1.field6426) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var1.field6426 == this.field6425) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var1.field6425 == this.field6427) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   public void method11751(int var1) {
      try {
         float var2 = 1.0F / this.method11774(-1808401369);
         this.field6426 *= var2;
         this.field6426 = this.field6425 * var2;
         this.field6426 *= var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uz.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ay")
   public final boolean method11746(byte var1) {
      try {
         boolean var10000;
         label59: {
            float var3 = this.field6425;
            if (var3 < 9.765625E-4F) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var3 > -9.765625E-4F) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label59;
               }
            }

            var10000 = false;
         }

         boolean var2 = var10000;
         float var6 = this.field6427;
         if (var6 < 9.765625E-4F && var6 > -9.765625E-4F) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7;
         label48: {
            boolean var5 = var10000;
            var7 = var2 & var5;
            float var9 = this.field6425;
            if (var9 < 9.765625E-4F) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (var9 > -9.765625E-4F) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label48;
               }
            }

            var10000 = false;
         }

         boolean var8 = var10000;
         return var7 & var8;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "uz.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("ca")
   final void method11773(classUZ var1) {
      this.method11728(
         var1.field6427 * this.field6425 - this.field6427 * var1.field6425,
         this.field6425 * var1.field6427 - var1.field6427 * this.field6426,
         this.field6427 * var1.field6427 - this.field6425 * var1.field6426,
         1664425080
      );
   }
}
