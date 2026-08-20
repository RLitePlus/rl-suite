import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ul")
public final class classUL {
   @ObfuscatedName("ax")
   float field6327;
   @ObfuscatedName("ab")
   float field6324;
   @ObfuscatedName("ae")
   static int field6321 = 0;
   @ObfuscatedName("ag")
   float field6325;
   @ObfuscatedName("as")
   float field6326;
   @ObfuscatedSignature(descriptor = "[Lul;")
   @ObfuscatedName("az")
   static final classUL[] field6323 = new classUL[classUL.field6322 * -2034009973];
   @ObfuscatedName("af")
   static final int field6322 = 15921712;

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("zg")
   public static void method11377(classUL var0, int var1) {
      if (var0 == null) {
         var0.method11380(var1);
      } else {
         try {
            var0.field6327 = 0.0F;
            var0.field6326 = 0.0F;
            var0.field6325 = 0.0F;
            var0.field6324 = 1.0F;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ul.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public final void method11383() {
      float var1 = (float)Math.sqrt(classHV.method6122(this, this, -1447396430));
      float var3 = 1.0F / var1;
      this.field6325 *= var3;
      this.field6326 *= var3;
      this.field6327 *= var3;
      this.field6324 *= var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)F")
   @ObfuscatedName("bc")
   static final float method11349(classUL var0, classUL var1) {
      return method11386(var0, var1, (byte)0);
   }

   classUL(classUL var1) {
      this.method11365(var1, -569935459);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   public void method11357(int var1) {
      try {
         synchronized (field6323) {
            if (field6321 * 1171203923 < field6322 * -2034009973) {
               if (var1 <= -2130951373) {
                  throw new IllegalStateException();
               }

               field6323[(field6321 += -1712212773) * 1171203923 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ul.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFB)V")
   @ObfuscatedName("ac")
   void method11361(float var1, float var2, float var3, float var4, byte var5) {
      try {
         this.field6325 = var1;
         this.field6326 = var2;
         this.field6327 = var3;
         this.field6324 = var4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ul.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;Lul;B)F")
   @ObfuscatedName("bn")
   public static float method11386(classUL var0, classUL var1, byte var2) {
      if (var0 == null) {
         var0.method11389(var0, var2);
      }

      try {
         return var0.field6324 * var1.field6324 + (var1.field6325 * var0.field6325 + var1.field6326 * var0.field6326 + var0.field6327 * var1.field6327);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bs")
   public void method11372(float var1, float var2, float var3) {
      this.method11371(0.0F, 1.0F, 0.0F, var1, (short)-1062);
      classUL var4 = classAV.method720((byte)0);
      var4.method11371(1.0F, 0.0F, 0.0F, var2, (short)-30281);
      this.method11390(var4, 1591236864);
      var4.method11371(0.0F, 0.0F, 1.0F, var3, (short)-15823);
      this.method11390(var4, 1591236864);
      var4.method11357(-1702025949);
   }

   @ObfuscatedSignature(descriptor = "(Luz;FB)V")
   @ObfuscatedName("ao")
   public void method11368(classUZ var1, float var2, byte var3) {
      try {
         this.method11371(var1.field6427, var1.field6425, var1.field6426, var2, (short)-30093);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ul.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFS)V")
   @ObfuscatedName("al")
   public void method11371(float var1, float var2, float var3, float var4, short var5) {
      try {
         float var6 = (float)Math.sin(0.5F * var4);
         float var7 = (float)Math.cos(var4 * 0.5F);
         this.field6325 = var6 * var1;
         this.field6326 = var2 * var6;
         this.field6327 = var6 * var3;
         this.field6324 = var7;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ul.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fa")
   public void method11402() {
      this.method11357(1594685984);
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("aj")
   public void method11373(float var1, float var2, float var3, int var4) {
      try {
         this.method11371(0.0F, 1.0F, 0.0F, var1, (short)-32251);
         classUL var5 = classAV.method720((byte)0);
         var5.method11371(1.0F, 0.0F, 0.0F, var2, (short)-10171);
         this.method11390(var5, 1591236864);
         var5.method11371(0.0F, 0.0F, 1.0F, var3, (short)-24077);
         this.method11390(var5, 1591236864);
         var5.method11357(1594685984);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ul.aj(" + ')');
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof classUL)) {
            return false;
         } else {
            classUL var2 = (classUL)var1;
            return var2.field6325 == this.field6325 && this.field6326 == var2.field6326 && var2.field6327 == this.field6327 && var2.field6324 == this.field6324;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lul;")
   @ObfuscatedName("ar")
   static classUL method11339(float var0, float var1, float var2, float var3) {
      synchronized (field6323) {
         if (field6321 * 1171203923 == 0) {
            return new classUL(var0, var1, var2, var3);
         } else {
            field6323[(field6321 -= -1712212773) * 1171203923].method11361(var0, var1, var2, var3, (byte)-93);
            return field6323[1171203923 * field6321];
         }
      }
   }

   classUL() {
      method11377(this, -1661557895);
   }

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("au")
   public final void method11390(classUL var1, int var2) {
      try {
         this.method11361(
            var1.field6326 * this.field6327 + (this.field6325 * var1.field6324 + var1.field6325 * this.field6324) - this.field6326 * var1.field6327,
            var1.field6327 * this.field6325 + (var1.field6326 * this.field6324 + (var1.field6324 * this.field6326 - this.field6327 * var1.field6325)),
            this.field6324 * var1.field6327 + (var1.field6324 * this.field6327 + this.field6326 * var1.field6325 - this.field6325 * var1.field6326),
            this.field6324 * var1.field6324 - this.field6325 * var1.field6325 - this.field6326 * var1.field6326 - var1.field6327 * this.field6327,
            (byte)-100
         );
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("bb")
   void method11362(float var1, float var2, float var3, float var4) {
      this.field6325 = var1;
      this.field6326 = var2;
      this.field6327 = var3;
      this.field6324 = var4;
   }

   @Override
   public int hashCode() {
      try {
         byte var1 = 31;
         float var2 = 1.0F;
         var2 = this.field6325 + var2 * 31.0F;
         var2 = 31.0F * var2 + this.field6326;
         var2 = var2 * 31.0F + this.field6327;
         var2 = this.field6324 + 31.0F * var2;
         return (int)var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.hashCode(" + 41);
      }
   }

   @Override
   public String toString() {
      try {
         return this.field6325 + "," + this.field6326 + "," + this.field6327 + "," + this.field6324;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ul.toString(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)I")
   @ObfuscatedName("qw")
   public static int method11394(classUL var0) {
      if (var0 == null) {
         var0.method11358();
      }

      byte var1 = 31;
      float var2 = 1.0F;
      var2 = var0.field6325 + var2 * 31.0F;
      var2 = 31.0F * var2 + var0.field6326;
      var2 = var2 * 31.0F + var0.field6327;
      var2 = var0.field6324 + 31.0F * var2;
      return (int)var2;
   }

   static {
      new classUL();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Ljava/lang/Object;)Z")
   @ObfuscatedName("zt")
   public static boolean method11392(classUL var0, Object var1) {
      if (var0 == null) {
         var0.method11383();
      }

      if (!(var1 instanceof classUL)) {
         return false;
      } else {
         classUL var2 = (classUL)var1;
         return var2.field6325 == var0.field6325 && var0.field6326 == var2.field6326 && var2.field6327 == var0.field6327 && var2.field6324 == var0.field6324;
      }
   }

   classUL(float var1, float var2, float var3, float var4) {
      this.method11361(var1, var2, var3, var4, (byte)-27);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11398() {
      return this.field6325 + "," + this.field6326 + "," + this.field6327 + "," + this.field6324;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lul;")
   @ObfuscatedName("ai")
   public static classUL method11338() {
      synchronized (field6323) {
         if (0 == field6321 * 1161587058) {
            return new classUL();
         } else {
            method11377(field6323[(field6321 -= 2060350923) * 1171203923], -1386453875);
            return field6323[field6321 * 269812248];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("aa")
   void method11365(classUL var1, int var2) {
      try {
         this.field6325 = var1.field6325;
         this.field6326 = var1.field6326;
         this.field6327 = var1.field6327;
         this.field6324 = var1.field6324;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method11395() {
      byte var1 = 31;
      float var2 = 1.0F;
      var2 = this.field6325 + var2 * 31.0F;
      var2 = 31.0F * var2 + this.field6326;
      var2 = var2 * 31.0F + this.field6327;
      var2 = this.field6324 + 31.0F * var2;
      return (int)var2;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aq")
   final void method11381(byte var1) {
      try {
         this.field6325 = -this.field6325;
         this.field6326 = -this.field6326;
         this.field6327 = -this.field6327;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ul.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   final void method11378() {
      this.field6327 = 0.0F;
      this.field6326 = 0.0F;
      this.field6325 = 0.0F;
      this.field6324 = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lul;")
   @ObfuscatedName("aw")
   static classUL method11340(float var0, float var1, float var2, float var3) {
      synchronized (field6323) {
         if (field6321 * 1171203923 == 0) {
            return new classUL(var0, var1, var2, var3);
         } else {
            field6323[(field6321 -= -1712212773) * 1171203923].method11361(var0, var1, var2, var3, (byte)-60);
            return field6323[1171203923 * field6321];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lul;")
   @ObfuscatedName("ak")
   static classUL method11341(float var0, float var1, float var2, float var3) {
      synchronized (field6323) {
         if (field6321 * 1171203923 == 0) {
            return new classUL(var0, var1, var2, var3);
         } else {
            field6323[(field6321 -= -1712212773) * 1171203923].method11361(var0, var1, var2, var3, (byte)-39);
            return field6323[1171203923 * field6321];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("av")
   static classUL method11342(classUL var0) {
      synchronized (field6323) {
         if (field6321 * 1171203923 == 0) {
            return new classUL(var0);
         } else {
            field6323[(field6321 -= -190643795) * 1323684265].method11365(var0, -569935459);
            return field6323[1171203923 * field6321];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method11396() {
      byte var1 = 31;
      float var2 = 1.0F;
      var2 = this.field6325 + var2 * 31.0F;
      var2 = 31.0F * var2 + this.field6326;
      var2 = var2 * 31.0F + this.field6327;
      var2 = this.field6324 + 31.0F * var2;
      return (int)var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("an")
   static classUL method11343(classUL var0) {
      synchronized (field6323) {
         if (field6321 * -1878689472 == 0) {
            return new classUL(var0);
         } else {
            field6323[(field6321 -= 737987315) * 1171203923].method11365(var0, -569935459);
            return field6323[693693592 * field6321];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("am")
   static final classUL method11345(classUL var0) {
      classUL var1 = classSQ.method10636(var0, -506347951);
      var1.method11381((byte)110);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("ah")
   static final classUL method11346(classUL var0) {
      classUL var1 = classSQ.method10636(var0, -506347951);
      var1.method11381((byte)109);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("bn")
   static final classUL method11347(classUL var0) {
      classUL var1 = classSQ.method10636(var0, -506347951);
      var1.method11381((byte)93);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("bx")
   static final classUL method11348(classUL var0) {
      classUL var1 = classSQ.method10636(var0, -506347951);
      var1.method11381((byte)109);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)F")
   @ObfuscatedName("ct")
   final float method11387(classUL var1) {
      return this.field6324 * var1.field6324 + (var1.field6325 * this.field6325 + var1.field6326 * this.field6326 + this.field6327 * var1.field6327);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)F")
   @ObfuscatedName("bp")
   static final float method11350(classUL var0, classUL var1) {
      return method11386(var0, var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method11399() {
      return this.field6325 + "," + this.field6326 + "," + this.field6327 + "," + this.field6324;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)F")
   @ObfuscatedName("bm")
   static final float method11351(classUL var0, classUL var1) {
      return method11386(var0, var1, (byte)0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)Lul;")
   @ObfuscatedName("bt")
   static final classUL method11353(classUL var0, classUL var1) {
      classUL var2 = classSQ.method10636(var0, -506347951);
      var2.method11390(var1, 1591236864);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)Lul;")
   @ObfuscatedName("bg")
   static final classUL method11354(classUL var0, classUL var1) {
      classUL var2 = classSQ.method10636(var0, -506347951);
      var2.method11390(var1, 1591236864);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)Lul;")
   @ObfuscatedName("bj")
   static final classUL method11355(classUL var0, classUL var1) {
      classUL var2 = classSQ.method10636(var0, -506347951);
      var2.method11390(var1, 1591236864);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)Lul;")
   @ObfuscatedName("bk")
   static final classUL method11356(classUL var0, classUL var1) {
      classUL var2 = classSQ.method10636(var0, -506347951);
      var2.method11390(var1, 1591236864);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("ti")
   public void method11403(float var1, float var2, float var3) {
      this.method11373(var1, var2, var3, -608116520);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11400() {
      return this.field6325 + "," + this.field6326 + "," + this.field6327 + "," + this.field6324;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method11397() {
      byte var1 = 31;
      float var2 = 1.0F;
      var2 = this.field6325 + var2 * 31.0F;
      var2 = 31.0F * var2 + this.field6326;
      var2 = var2 * 31.0F + this.field6327;
      var2 = this.field6324 + 31.0F * var2;
      return (int)var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public void method11358() {
      synchronized (field6323) {
         if (field6321 * 1171203923 < field6322 * 487482895) {
            field6323[(field6321 += -1712212773) * 1263940280 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("bw")
   void method11363(float var1, float var2, float var3, float var4) {
      this.field6325 = var1;
      this.field6326 = var2;
      this.field6327 = var3;
      this.field6324 = var4;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wa")
   public void method11404() {
      method11377(this, -1661557895);
   }

   @ObfuscatedSignature(descriptor = "()Lul;")
   @ObfuscatedName("kd")
   public static classUL method11405() {
      return classAV.method720((byte)0);
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("ra")
   public void method11406(float var1, float var2, float var3, float var4) {
      this.method11371(var1, var2, var3, var4, (short)-32251);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ec")
   static void method11401(int var0, int var1, int var2) {
      try {
         classJL var3 = classEF.method3849(classJS.RESUME_PAUSEBUTTON, client.field795.field1535, (byte)-81);
         var3.field3343.method12979(var0, 478308754);
         var3.field3343.method13188(var1, (short)-25700);
         client.field795.method3367(var3, -1301097035);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ul.ec(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;)Lul;")
   @ObfuscatedName("at")
   static classUL method11344(classUL var0) {
      synchronized (field6323) {
         if (field6321 * 1171203923 == 0) {
            return new classUL(var0);
         } else {
            field6323[(field6321 -= -1712212773) * 1171203923].method11365(var0, -569935459);
            return field6323[1171203923 * field6321];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)V")
   @ObfuscatedName("cg")
   public static void method11391(classUL var0, classUL var1) {
      var0.method11361(
         var1.field6326 * var0.field6327 + (var0.field6325 * var1.field6324 + var1.field6325 * var0.field6324) - var0.field6326 * var1.field6327,
         var1.field6327 * var0.field6325 + (var1.field6326 * var0.field6324 + (var1.field6324 * var0.field6326 - var0.field6327 * var1.field6325)),
         var0.field6324 * var1.field6327 + (var1.field6324 * var0.field6327 + var0.field6326 * var1.field6325 - var0.field6325 * var1.field6326),
         var0.field6324 * var1.field6324 - var0.field6325 * var1.field6325 - var0.field6326 * var1.field6326 - var1.field6327 * var0.field6327,
         (byte)-41
      );
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("be")
   void method11366(classUL var1) {
      this.field6325 = var1.field6325;
      this.field6326 = var1.field6326;
      this.field6327 = var1.field6327;
      this.field6324 = var1.field6324;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)V")
   @ObfuscatedName("by")
   void method11367(classUL var1) {
      this.field6325 = var1.field6325;
      this.field6326 = var1.field6326;
      this.field6327 = var1.field6327;
      this.field6324 = var1.field6324;
   }

   @ObfuscatedSignature(descriptor = "(Luz;F)V")
   @ObfuscatedName("bq")
   public void method11369(classUZ var1, float var2) {
      this.method11371(var1.field6427, var1.field6425, var1.field6426, var2, (short)-10333);
   }

   @ObfuscatedSignature(descriptor = "(Luz;F)V")
   @ObfuscatedName("bf")
   public void method11370(classUZ var1, float var2) {
      this.method11371(var1.field6427, var1.field6425, var1.field6426, var2, (short)-17309);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bl")
   public void method11374(float var1, float var2, float var3) {
      this.method11371(0.0F, 1.0F, 0.0F, var1, (short)-17039);
      classUL var4 = classAV.method720((byte)0);
      var4.method11371(1.0F, 0.0F, 0.0F, var2, (short)-21004);
      this.method11390(var4, 1591236864);
      var4.method11371(0.0F, 0.0F, 1.0F, var3, (short)-519);
      this.method11390(var4, 1591236864);
      var4.method11357(-1923352007);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bd")
   public void method11375(float var1, float var2, float var3) {
      this.method11371(0.0F, 1.0F, 0.0F, var1, (short)-13072);
      classUL var4 = classAV.method720((byte)0);
      var4.method11371(1.0F, 0.0F, 0.0F, var2, (short)-7493);
      this.method11390(var4, 1591236864);
      var4.method11371(0.0F, 0.0F, 1.0F, var3, (short)-11364);
      this.method11390(var4, 1591236864);
      var4.method11357(-241161367);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lul;Lul;)F")
   @ObfuscatedName("br")
   static final float method11352(classUL var0, classUL var1) {
      return method11386(var0, var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bv")
   public void method11376(float var1, float var2, float var3) {
      this.method11371(0.0F, 1.0F, 0.0F, var1, (short)-19569);
      classUL var4 = classAV.method720((byte)0);
      var4.method11371(1.0F, 0.0F, 0.0F, var2, (short)-16877);
      this.method11390(var4, 1591236864);
      var4.method11371(0.0F, 0.0F, 1.0F, var3, (short)-324);
      this.method11390(var4, 1591236864);
      var4.method11357(852696603);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   final void method11379() {
      this.field6327 = 0.0F;
      this.field6326 = 0.0F;
      this.field6325 = 0.0F;
      this.field6324 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void method11359() {
      synchronized (field6323) {
         if (field6321 * -1243073851 < field6322 * 2049269463) {
            field6323[(field6321 += 2039088019) * -48298440 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   final void method11382() {
      this.field6325 = -this.field6325;
      this.field6326 = -this.field6326;
      this.field6327 = -this.field6327;
   }

   @ObfuscatedSignature(descriptor = "(Lul;)F")
   @ObfuscatedName("cp")
   final float method11388(classUL var1) {
      return this.field6324 * var1.field6324 + (var1.field6325 * this.field6325 + var1.field6326 * this.field6326 + this.field6327 * var1.field6327);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method11393(Object var1) {
      if (!(var1 instanceof classUL)) {
         return false;
      } else {
         classUL var2 = (classUL)var1;
         return var2.field6325 == this.field6325 && this.field6326 == var2.field6326 && var2.field6327 == this.field6327 && var2.field6324 == this.field6324;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public void method11360() {
      synchronized (field6323) {
         if (field6321 * 1171203923 < field6322 * -2034009973) {
            field6323[(field6321 += -1712212773) * 1171203923 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("bi")
   void method11364(float var1, float var2, float var3, float var4) {
      this.field6325 = var1;
      this.field6326 = var2;
      this.field6327 = var3;
      this.field6324 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lul;I)V")
   @ObfuscatedName("ny")
   public static void method11384(classUL var0, int var1) {
      if (var0 == null) {
         var0.method11385(var1);
      }

      try {
         float var2 = (float)Math.sqrt(classHV.method6122(var0, var0, 937507952));
         float var4 = 1.0F / var2;
         var0.field6325 *= var4;
         var0.field6326 *= var4;
         var0.field6327 *= var4;
         var0.field6324 *= var4;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ul.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public final void method11385(int var1) {
      try {
         float var2 = (float)Math.sqrt(classHV.method6122(this, this, 937507952));
         float var4 = 1.0F / var2;
         this.field6326 = this.field6327 * var4;
         this.field6326 = this.field6324 * var4;
         this.field6327 = this.field6324 * var4;
         this.field6326 = this.field6325 * var4;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ul.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   final void method11380(int var1) {
      try {
         this.field6327 = 0.0F;
         this.field6324 = 0.0F;
         this.field6325 = 0.0F;
         this.field6324 = 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ul.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lul;B)F")
   @ObfuscatedName("ap")
   final float method11389(classUL var1, byte var2) {
      try {
         return this.field6324 * var1.field6325 + (var1.field6325 * this.field6327 + var1.field6326 * this.field6324 + this.field6327 * var1.field6324);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ul.ap(" + ')');
      }
   }
}
