import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ra")
public final class class461 {
   @ObfuscatedName("ag")
   static int field5496 = 0;
   @ObfuscatedName("at")
   static final int field5497 = 1083506224;
   @ObfuscatedName("ak")
   float field5501;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5503 = 18;
   @ObfuscatedName("ae")
   float field5499;
   @ObfuscatedName("aj")
   float field5500;
   @ObfuscatedSignature(descriptor = "[Lra;")
   @ObfuscatedName("av")
   static final class461[] field5498 = new class461[-1021415989 * field5497];
   @ObfuscatedName("az")
   static final int field5504 = 60;
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("dh")
   static SpritePixels[] worldSelectBackSprites;
   @ObfuscatedName("an")
   float field5502;

   class461(float var1, float var2, float var3, float var4) {
      this.method9294(var1, var2, var3, var4, (byte)74);
   }

   @ObfuscatedSignature(descriptor = "(FFFFB)V")
   @ObfuscatedName("ae")
   void method9294(float var1, float var2, float var3, float var4, byte var5) {
      try {
         this.field5502 = var1;
         this.field5499 = var2;
         this.field5500 = var3;
         this.field5501 = var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ra.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lxy;")
   @ObfuscatedName("at")
   public static PrivateChatMode method9279(int var0, byte var1) {
      try {
         PrivateChatMode[] var2 = class33.method654(1993951420);

         for (int var3 = 0; var3 < var2.length; var3++) {
            PrivateChatMode var4 = var2[var3];
            if (-1408231813 * var4.field6650 == var0) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ra.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;B)V")
   @ObfuscatedName("hv")
   public static void method9289(class461 var0, byte var1) {
      if (var0 == null) {
         var0.method9292(var1);
      } else {
         try {
            synchronized (field5498) {
               if (-603351739 * field5496 < field5497 * -1021415989) {
                  if (var1 >= 4) {
                     throw new IllegalStateException();
                  }

                  field5498[(field5496 += -1125927539) * -603351739 - 1] = var0;
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "ra.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;I)V")
   @ObfuscatedName("aj")
   void method9296(class461 var1, int var2) {
      try {
         this.field5502 = var1.field5502;
         this.field5499 = var1.field5499;
         this.field5500 = var1.field5500;
         this.field5501 = var1.field5501;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   final void method9312() {
      this.field5500 = 0.0F;
      this.field5499 = 0.0F;
      this.field5502 = 0.0F;
      this.field5501 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)F")
   @ObfuscatedName("bc")
   final float method9321(class461 var1) {
      return this.field5501 * var1.field5501 + (var1.field5500 * this.field5500 + (this.field5499 * var1.field5499 + var1.field5502 * this.field5502));
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("ap")
   public void method9303(float var1, float var2, float var3, int var4) {
      try {
         this.method9302(0.0F, 1.0F, 0.0F, var1, 1709440975);
         class461 var5 = classFM.method4026(-2143684328);
         var5.method9302(1.0F, 0.0F, 0.0F, var2, 1493123348);
         method9328(this, var5, (byte)127);
         var5.method9302(0.0F, 0.0F, 1.0F, var3, 1841520065);
         method9328(this, var5, (byte)81);
         method9289(var5, (byte)-70);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ra.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;I)V")
   @ObfuscatedName("ay")
   public void method9308(ProjectionCoord var1, ProjectionCoord var2, int var3) {
      try {
         ProjectionCoord var4 = class451.method9731(var1, var2, (byte)1);
         float var5 = var1.method9897(var2, -1450681416);
         float var7 = (float)Math.acos(var5);
         var4.method9920((short)3141);
         this.method9298(var4, var7, (short)1024);
         var4.release(-804947546);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ra.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bt")
   public void method9339(float var1, float var2, float var3) {
      this.method9303(var1, var2, var3, -1574760321);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;FS)V")
   @ObfuscatedName("ak")
   void method9298(ProjectionCoord var1, float var2, short var3) {
      try {
         this.method9302(var1.x, var1.z, var1.y, var2, 1360836152);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ra.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("ya")
   public void method9340(class461 var1) {
      method9328(this, var1, (byte)127);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ad")
   public final void method9318(byte var1) {
      try {
         float var4 = method9323(this, this, 1153725407);
         float var2 = (float)Math.sqrt(var4);
         var4 = 1.0F / var2;
         this.field5502 *= var4;
         this.field5499 *= var4;
         this.field5500 *= var4;
         this.field5501 *= var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ra.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)Lra;")
   @ObfuscatedName("ao")
   static final class461 method9287(class461 var0) {
      class461 var1;
      synchronized (field5498) {
         if (field5496 * -603351739 == 0) {
            var1 = new class461(var0);
         } else {
            field5498[(field5496 -= -1125927539) * -603351739].method9296(var0, 743318851);
            var1 = field5498[-603351739 * field5496];
         }
      }

      method9315(var1, (byte)-41);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lut;Lwh;ZI)V")
   @ObfuscatedName("am")
   static void method9338(DynamicArray var0, class586 var1, boolean var2, int var3) {
      try {
         if (var0 == null) {
            if (var3 == -928498657) {
               throw new RuntimeException();
            }
         } else {
            if (null != var1) {
               if (var3 != -928498657) {
                  throw new IllegalStateException();
               }

               if (var1 != var0.field6107) {
                  if (var3 != -928498657) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException();
               }
            }

            if (var2) {
               if (var3 != -928498657) {
                  throw new IllegalStateException();
               }

               if (!var0.field6109) {
                  if (var3 != -928498657) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ra.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lra;")
   @ObfuscatedName("na")
   public static class461 method9341() {
      return classFM.method4026(-2143684328);
   }

   @Override
   public String toString() {
      try {
         return this.field5502 + "," + this.field5499 + "," + this.field5500 + "," + this.field5501;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ra.toString(" + ')');
      }
   }

   static {
      new class461();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method9331(Object var1) {
      if (!(var1 instanceof class461)) {
         return false;
      } else {
         class461 var2 = (class461)var1;
         return this.field5502 == var2.field5502 && this.field5499 == var2.field5499 && var2.field5500 == this.field5500 && var2.field5501 == this.field5501;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method9332(Object var1) {
      if (!(var1 instanceof class461)) {
         return false;
      } else {
         class461 var2 = (class461)var1;
         return this.field5502 == var2.field5502 && this.field5499 == var2.field5499 && var2.field5500 == this.field5500 && var2.field5501 == this.field5501;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public void method9342() {
      method9289(this, (byte)-70);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method9333(Object var1) {
      if (!(var1 instanceof class461)) {
         return false;
      } else {
         class461 var2 = (class461)var1;
         return this.field5502 == var2.field5502 && this.field5499 == var2.field5499 && var2.field5500 == this.field5500 && var2.field5501 == this.field5501;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("zx")
   public static void method9290(class461 var0) {
      if (var0 == null) {
         var0.method9337();
      }

      synchronized (field5498) {
         if (-603351739 * field5496 < field5497 * -1021415989) {
            field5498[(field5496 += -1125927539) * -603351739 - 1] = var0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method9335() {
      return this.field5502 + "," + this.field5499 + "," + this.field5500 + "," + this.field5501;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)F")
   @ObfuscatedName("bh")
   final float method9322(class461 var1) {
      return this.field5501 * var1.field5501 + (var1.field5500 * this.field5500 + (this.field5499 * var1.field5499 + var1.field5502 * this.field5502));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method9334() {
      byte var1 = 31;
      float var2 = 1.0F;
      var2 = var2 * 31.0F + this.field5502;
      var2 = this.field5499 + 31.0F * var2;
      var2 = var2 * 31.0F + this.field5500;
      var2 = this.field5501 + var2 * 31.0F;
      return (int)var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lra;")
   @ObfuscatedName("ac")
   public static class461 method9280() {
      synchronized (field5498) {
         if (-603351739 * field5496 == 0) {
            return new class461();
         } else {
            method9313(field5498[(field5496 -= -1125927539) * -603351739], -1845539078);
            return field5498[field5496 * -603351739];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;I)V")
   @ObfuscatedName("fz")
   public static void method9313(class461 var0, int var1) {
      if (var0 == null) {
         var0.method9314(var1);
      }

      try {
         var0.field5500 = 0.0F;
         var0.field5499 = 0.0F;
         var0.field5502 = 0.0F;
         var0.field5501 = 1.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ra.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;Lra;B)V")
   @ObfuscatedName("wk")
   public static void method9328(class461 var0, class461 var1, byte var2) {
      if (var0 == null) {
         var0.method9330(var0, var2);
      }

      try {
         var0.method9294(
            var1.field5501 * var0.field5502 + var1.field5502 * var0.field5501 + var0.field5500 * var1.field5499 - var1.field5500 * var0.field5499,
            var1.field5499 * var0.field5501 + (var1.field5501 * var0.field5499 - var0.field5500 * var1.field5502) + var0.field5502 * var1.field5500,
            var0.field5500 * var1.field5501 + var1.field5502 * var0.field5499 - var0.field5502 * var1.field5499 + var1.field5500 * var0.field5501,
            var1.field5501 * var0.field5501 - var1.field5502 * var0.field5502 - var1.field5499 * var0.field5499 - var0.field5500 * var1.field5500,
            (byte)116
         );
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lra;")
   @ObfuscatedName("ab")
   public static class461 method9281() {
      synchronized (field5498) {
         if (33176160 * field5496 == 0) {
            return new class461();
         } else {
            method9313(field5498[(field5496 -= -1125927539) * -1248473825], -1845539078);
            return field5498[field5496 * -603351739];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lra;")
   @ObfuscatedName("ax")
   static class461 method9282(float var0, float var1, float var2, float var3) {
      synchronized (field5498) {
         if (0 == -603351739 * field5496) {
            return new class461(var0, var1, var2, var3);
         } else {
            field5498[(field5496 -= 2025609077) * 1258528531].method9294(var0, var1, var2, var3, (byte)88);
            return field5498[-419661846 * field5496];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lra;")
   @ObfuscatedName("ar")
   static class461 method9283(float var0, float var1, float var2, float var3) {
      synchronized (field5498) {
         if (0 == -603351739 * field5496) {
            return new class461(var0, var1, var2, var3);
         } else {
            field5498[(field5496 -= -1125927539) * -603351739].method9294(var0, var1, var2, var3, (byte)125);
            return field5498[-603351739 * field5496];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lra;")
   @ObfuscatedName("ah")
   static class461 method9284(float var0, float var1, float var2, float var3) {
      synchronized (field5498) {
         if (0 == -603351739 * field5496) {
            return new class461(var0, var1, var2, var3);
         } else {
            field5498[(field5496 -= -1125927539) * -603351739].method9294(var0, var1, var2, var3, (byte)28);
            return field5498[-603351739 * field5496];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lra;")
   @ObfuscatedName("al")
   static class461 method9285(float var0, float var1, float var2, float var3) {
      synchronized (field5498) {
         if (0 == -603351739 * field5496) {
            return new class461(var0, var1, var2, var3);
         } else {
            field5498[(field5496 -= -1125927539) * -603351739].method9294(var0, var1, var2, var3, (byte)88);
            return field5498[-603351739 * field5496];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ny")
   public void method9291() {
      synchronized (field5498) {
         if (-603351739 * field5496 < field5497 * -1021415989) {
            field5498[(field5496 += -1125927539) * -603351739 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)Lra;")
   @ObfuscatedName("am")
   static final class461 method9288(class461 var0) {
      class461 var1;
      synchronized (field5498) {
         if (field5496 * -603351739 == 0) {
            var1 = new class461(var0);
         } else {
            field5498[(field5496 -= -553808062) * 949822984].method9296(var0, 743318851);
            var1 = field5498[1762430429 * field5496];
         }
      }

      method9315(var1, (byte)-30);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("td")
   public void method9304(float var1, float var2, float var3) {
      this.method9302(0.0F, 1.0F, 0.0F, var1, 1518169296);
      class461 var4 = classFM.method4026(395315046);
      var4.method9302(1.0F, 0.0F, 0.0F, var2, 1567383430);
      method9328(this, var4, (byte)26);
      var4.method9302(0.0F, 0.0F, 1.0F, var3, 1570827872);
      method9328(this, var4, (byte)40);
      method9289(var4, (byte)-102);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof class461)) {
            return false;
         } else {
            class461 var2 = (class461)var1;
            return this.field5502 == var2.field5502 && this.field5499 == var2.field5499 && var2.field5500 == this.field5500 && var2.field5501 == this.field5501;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)V")
   @ObfuscatedName("ba")
   public void method9309(ProjectionCoord var1, ProjectionCoord var2) {
      ProjectionCoord var3 = class451.method9731(var1, var2, (byte)1);
      float var4 = var1.method9897(var2, 1686697518);
      float var6 = (float)Math.acos(var4);
      var3.method9920((short)3141);
      this.method9298(var3, var6, (short)1024);
      var3.release(-804947546);
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("bs")
   void method9297(class461 var1) {
      this.field5502 = var1.field5502;
      this.field5499 = var1.field5499;
      this.field5500 = var1.field5500;
      this.field5501 = var1.field5501;
   }

   @ObfuscatedSignature(descriptor = "(Lra;Lra;I)F")
   @ObfuscatedName("gu")
   public static float method9323(class461 var0, class461 var1, int var2) {
      if (var0 == null) {
         return var0.method9327(var0, var2);
      } else {
         try {
            return var0.field5501 * var1.field5501 + (var1.field5500 * var0.field5500 + (var0.field5499 * var1.field5499 + var1.field5502 * var0.field5502));
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "ra.ai(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;F)V")
   @ObfuscatedName("bk")
   void method9299(ProjectionCoord var1, float var2) {
      this.method9302(var1.x, var1.z, var1.y, var2, 1588950271);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;F)V")
   @ObfuscatedName("bb")
   void method9300(ProjectionCoord var1, float var2) {
      this.method9302(var1.x, var1.z, var1.y, var2, 2118292660);
   }

   @ObfuscatedSignature(descriptor = "(FFFFI)V")
   @ObfuscatedName("aw")
   public void method9302(float var1, float var2, float var3, float var4, int var5) {
      try {
         float var6 = (float)Math.sin(0.5F * var4);
         float var7 = (float)Math.cos(0.5F * var4);
         this.field5502 = var6 * var1;
         this.field5499 = var2 * var6;
         this.field5500 = var6 * var3;
         this.field5501 = var7;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ra.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("bc")
   public void method9343(float var1, float var2, float var3, float var4) {
      this.method9302(var1, var2, var3, var4, 1709440975);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xn")
   public void method9344() {
      method9313(this, -1845539078);
   }

   class461() {
      method9313(this, -1845539078);
   }

   @Override
   public int hashCode() {
      try {
         byte var1 = 31;
         float var2 = 1.0F;
         var2 = var2 * 31.0F + this.field5502;
         var2 = this.field5499 + 31.0F * var2;
         var2 = var2 * 31.0F + this.field5500;
         var2 = this.field5501 + var2 * 31.0F;
         return (int)var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bm")
   public void method9305(float var1, float var2, float var3) {
      this.method9302(0.0F, 1.0F, 0.0F, var1, 1955931207);
      class461 var4 = classFM.method4026(585764813);
      var4.method9302(1.0F, 0.0F, 0.0F, var2, 1442692381);
      method9328(this, var4, (byte)113);
      var4.method9302(0.0F, 0.0F, 1.0F, var3, 1825826532);
      method9328(this, var4, (byte)73);
      method9289(var4, (byte)-117);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)Ljava/lang/String;")
   @ObfuscatedName("oi")
   public static String method9336(class461 var0) {
      if (var0 == null) {
         var0.method9337();
      }

      return var0.field5502 + "," + var0.field5499 + "," + var0.field5500 + "," + var0.field5501;
   }

   @ObfuscatedSignature(descriptor = "(Lra;B)V")
   @ObfuscatedName("ev")
   public static void method9315(class461 var0, byte var1) {
      if (var0 == null) {
         var0.method9316(var1);
      }

      try {
         var0.field5502 = -var0.field5502;
         var0.field5499 = -var0.field5499;
         var0.field5500 = -var0.field5500;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ra.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("vu")
   public static void method9319(class461 var0) {
      if (var0 == null) {
         var0.toString();
      }

      float var3 = method9323(var0, var0, 858733824);
      float var1 = (float)Math.sqrt(var3);
      var3 = 1.0F / var1;
      var0.field5502 *= var3;
      var0.field5499 *= var3;
      var0.field5500 *= var3;
      var0.field5501 *= var3;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)V")
   @ObfuscatedName("bu")
   public void method9310(ProjectionCoord var1, ProjectionCoord var2) {
      ProjectionCoord var3 = class451.method9731(var1, var2, (byte)1);
      float var4 = var1.method9897(var2, 887544949);
      float var6 = (float)Math.acos(var4);
      var3.method9920((short)3141);
      this.method9298(var3, var6, (short)1024);
      var3.release(-804947546);
   }

   @ObfuscatedSignature(descriptor = "(Lra;)F")
   @ObfuscatedName("br")
   final float method9324(class461 var1) {
      return this.field5501 * var1.field5501 + (var1.field5500 * this.field5500 + (this.field5499 * var1.field5499 + var1.field5502 * this.field5502));
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)V")
   @ObfuscatedName("bi")
   public void method9311(ProjectionCoord var1, ProjectionCoord var2) {
      ProjectionCoord var3 = class451.method9731(var1, var2, (byte)1);
      float var4 = var1.method9897(var2, 518901977);
      float var6 = (float)Math.acos(var4);
      var3.method9920((short)3141);
      this.method9298(var3, var6, (short)1024);
      var3.release(-804947546);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bj")
   public void method9306(float var1, float var2, float var3) {
      this.method9302(0.0F, 1.0F, 0.0F, var1, 1349038361);
      class461 var4 = classFM.method4026(40969422);
      var4.method9302(1.0F, 0.0F, 0.0F, var2, 1740770417);
      method9328(this, var4, (byte)83);
      var4.method9302(0.0F, 0.0F, 1.0F, var3, 2073732459);
      method9328(this, var4, (byte)24);
      method9289(var4, (byte)-113);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public final void method9320() {
      float var3 = method9323(this, this, 306869276);
      float var1 = (float)Math.sqrt(var3);
      var3 = 1.0F / var1;
      this.field5502 *= var3;
      this.field5499 *= var3;
      this.field5500 *= var3;
      this.field5501 *= var3;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bp")
   public void method9307(float var1, float var2, float var3) {
      this.method9302(0.0F, 1.0F, 0.0F, var1, 1555356696);
      class461 var4 = classFM.method4026(1255606659);
      var4.method9302(1.0F, 0.0F, 0.0F, var2, 1701396423);
      method9328(this, var4, (byte)11);
      var4.method9302(0.0F, 0.0F, 1.0F, var3, 1550913743);
      method9328(this, var4, (byte)32);
      method9289(var4, (byte)-65);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)Lra;")
   @ObfuscatedName("af")
   static class461 method9286(float var0, float var1, float var2, float var3) {
      synchronized (field5498) {
         if (0 == -603351739 * field5496) {
            return new class461(var0, var1, var2, var3);
         } else {
            field5498[(field5496 -= -1125927539) * -603351739].method9294(var0, var1, var2, var3, (byte)30);
            return field5498[-603351739 * field5496];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;)F")
   @ObfuscatedName("bd")
   final float method9325(class461 var1) {
      return this.field5501 * var1.field5501 + (var1.field5500 * this.field5500 + (this.field5499 * var1.field5499 + var1.field5502 * this.field5502));
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("bo")
   void method9295(float var1, float var2, float var3, float var4) {
      this.field5502 = var1;
      this.field5499 = var2;
      this.field5500 = var3;
      this.field5501 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)F")
   @ObfuscatedName("bl")
   final float method9326(class461 var1) {
      return this.field5501 * var1.field5501 + (var1.field5500 * this.field5500 + (this.field5499 * var1.field5499 + var1.field5502 * this.field5502));
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("bq")
   public final void method9329(class461 var1) {
      this.method9294(
         var1.field5501 * this.field5502 + var1.field5502 * this.field5501 + this.field5500 * var1.field5499 - var1.field5500 * this.field5499,
         var1.field5499 * this.field5501 + (var1.field5501 * this.field5499 - this.field5500 * var1.field5502) + this.field5502 * var1.field5500,
         this.field5500 * var1.field5501 + var1.field5502 * this.field5499 - this.field5502 * var1.field5499 + var1.field5500 * this.field5501,
         var1.field5501 * this.field5501 - var1.field5502 * this.field5502 - var1.field5499 * this.field5499 - this.field5500 * var1.field5500,
         (byte)26
      );
   }

   class461(class461 var1) {
      this.method9296(var1, 743318851);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;Lrx;F)V")
   @ObfuscatedName("sf")
   public static void method9301(class461 var0, ProjectionCoord var1, float var2) {
      if (var0 == null) {
         var0.method9295(var2, var2, var2, var2);
      }

      var0.method9302(var1.x, var1.z, var1.y, var2, 1385357604);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method9337() {
      return this.field5502 + "," + this.field5499 + "," + this.field5500 + "," + this.field5501;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   final void method9316(byte var1) {
      try {
         this.field5501 = -this.field5499;
         this.field5501 = -this.field5502;
         this.field5502 = -this.field5499;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ra.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("an")
   public void method9292(byte var1) {
      try {
         synchronized (field5498) {
            if (-603351739 * field5496 < field5504 * -1021415989) {
               if (var1 >= 4) {
                  throw new IllegalStateException();
               }

               field5498[(field5496 += -1125927539) * -603351739 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ra.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   final void method9314(int var1) {
      try {
         this.field5499 = 0.0F;
         this.field5502 = 0.0F;
         this.field5502 = 0.0F;
         this.field5499 = 1.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ra.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("xs")
   public static void method9293(class461 var0) {
      if (var0 == null) {
         var0.method9320();
      } else {
         synchronized (field5498) {
            if (285198942 * field5496 < field5497 * -1021415989) {
               field5498[(field5496 += 1388157148) * -603351739 - 1] = var0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;I)F")
   @ObfuscatedName("ai")
   final float method9327(class461 var1, int var2) {
      try {
         return this.field5502 * var1.field5502 + (var1.field5499 * this.field5501 + (this.field5501 * var1.field5499 + var1.field5502 * this.field5500));
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("li")
   public static void method9317(class461 var0) {
      var0.field5502 = -var0.field5502;
      var0.field5499 = -var0.field5499;
      var0.field5500 = -var0.field5500;
   }

   @ObfuscatedSignature(descriptor = "(Lra;B)V")
   @ObfuscatedName("as")
   public final void method9330(class461 var1, byte var2) {
      try {
         this.method9294(
            var1.field5499 * this.field5502 + var1.field5502 * this.field5501 + this.field5500 * var1.field5500 - var1.field5499 * this.field5499,
            var1.field5500 * this.field5500 + (var1.field5502 * this.field5500 - this.field5499 * var1.field5501) + this.field5499 * var1.field5501,
            this.field5502 * var1.field5502 + var1.field5500 * this.field5501 - this.field5499 * var1.field5499 + var1.field5501 * this.field5502,
            var1.field5499 * this.field5502 - var1.field5499 * this.field5502 - var1.field5501 * this.field5501 - this.field5500 * var1.field5499,
            (byte)116
         );
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ra.as(" + ')');
      }
   }
}
