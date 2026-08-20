import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gf")
public class classGF extends classHA {
   @ObfuscatedName("af")
   int field2568;
   @ObfuscatedName("ip")
   static int field2570;
   @ObfuscatedName("ae")
   int field2567;
   @ObfuscatedName("ab")
   int field2566;
   @ObfuscatedName("az")
   int field2569;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod466(Buffer var1) {
      this.field2752 = Math.min(-1667236931 * this.field2752, 4) * -765552747;
      this.field2758 = new short[1][64][64];
      this.field2759 = new short[-1667236931 * this.field2752][64][64];
      this.field2757 = new byte[-1667236931 * this.field2752][64][64];
      this.field2756 = new byte[-1667236931 * this.field2752][64][64];
      this.field2760 = new classHZ[-1667236931 * this.field2752][64][64][];

      for (int var2 = 0; var2 < 8; var2++) {
         for (int var3 = 0; var3 < 8; var3++) {
            this.method5971(this.field2567 * 1849701208 + var2, var3 + this.field2566 * 223314696, var1, (byte)-76);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod467(Buffer var1, int var2) {
      try {
         this.field2752 = Math.min(-1667236931 * this.field2752, 4) * -765552747;
         this.field2758 = new short[1][64][64];
         this.field2759 = new short[-1667236931 * this.field2752][64][64];
         this.field2757 = new byte[-1667236931 * this.field2752][64][64];
         this.field2756 = new byte[-1667236931 * this.field2752][64][64];
         this.field2760 = new classHZ[-1667236931 * this.field2752][64][64][];

         for (int var3 = 0; var3 < 8; var3++) {
            if (var2 != -1811901292) {
               throw new IllegalStateException();
            }

            for (int var4 = 0; var4 < 8; var4++) {
               if (var2 != -1811901292) {
                  return;
               }

               this.method5971(this.field2567 * 1849701208 + var3, var4 + this.field2566 * 223314696, var1, (byte)-60);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "gf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgf;Lxy;I)V")
   @ObfuscatedName("dr")
   public static void method5404(classGF var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method5407(var1, var2);
      } else {
         try {
            int var3 = Buffer.method13039(var1, -346779531);
            if (var3 != 1177860011 * classHI.field2803.field2801) {
               if (var2 == -1452870557) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               var0.field2753 = Buffer.method13039(var1, -346779531) * -2015926021;
               var0.field2752 = Buffer.method13039(var1, -346779531) * -765552747;
               var0.field2754 = Buffer.method13047(var1, -2124153845) * -735630941;
               var0.field2755 = Buffer.method13047(var1, -1018264231) * -1209921667;
               var0.field2569 = Buffer.method13039(var1, -346779531) * 113218633;
               var0.field2568 = Buffer.method13039(var1, -346779531) * 2071171191;
               var0.field2751 = Buffer.method13047(var1, 4478478) * -1652832041;
               var0.field2750 = Buffer.method13047(var1, -406885852) * -1381327085;
               var0.field2567 = Buffer.method13039(var1, -346779531) * 1465087555;
               var0.field2566 = Buffer.method13039(var1, -346779531) * 747418529;
            }
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "gf.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method5409(Object var1) {
      if (!(var1 instanceof classGF)) {
         return false;
      } else {
         classGF var2 = (classGF)var1;
         return this.field2751 * 1151970023 == var2.field2751 * 1151970023 && var2.field2750 * -456391909 == this.field2750 * -456391909
            ? this.field2567 * 1304954475 == var2.field2567 * 1304954475 && var2.field2566 * 27914337 == 27914337 * this.field2566
            : false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int method5426(int var1) {
      try {
         return this.field2566 * 27914337;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gf.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   int method5415(byte var1) {
      try {
         return -201810439 * this.field2569;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gf.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method5411() {
      return this.field2751 * 1151970023 | -456391909 * this.field2750 << 8 | this.field2567 * 1304954475 << 16 | 27914337 * this.field2566 << 24;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("vx")
   public static void method5417(Message var0) {
      var0.field722 = classQQ.field5597.field591.method10202(var0.field728, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method5410(Object var1) {
      if (!(var1 instanceof classGF)) {
         return false;
      } else {
         classGF var2 = (classGF)var1;
         return this.field2751 * 1151970023 == var2.field2751 * 1151970023 && var2.field2750 * -456391909 == this.field2750 * 1545877767
            ? this.field2567 * 1312316055 == var2.field2567 * 1304954475 && var2.field2566 * 1479451307 == 27914337 * this.field2566
            : false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgf;Lxy;)V")
   @ObfuscatedName("bg")
   public static void method5405(classGF var0, Buffer var1) {
      if (var0 == null) {
         var0.method5416();
      }

      int var2 = Buffer.method13039(var1, -346779531);
      if (var2 != 1177860011 * classHI.field2803.field2801) {
         throw new IllegalStateException("");
      } else {
         var0.field2753 = Buffer.method13039(var1, -346779531) * -2015926021;
         var0.field2752 = Buffer.method13039(var1, -346779531) * -765552747;
         var0.field2754 = Buffer.method13047(var1, -1163671264) * -735630941;
         var0.field2755 = Buffer.method13047(var1, 563495098) * -1209921667;
         var0.field2569 = Buffer.method13039(var1, -346779531) * 113218633;
         var0.field2568 = Buffer.method13039(var1, -346779531) * 2071171191;
         var0.field2751 = Buffer.method13047(var1, -847400085) * -1652832041;
         var0.field2750 = Buffer.method13047(var1, -1658254727) * -1381327085;
         var0.field2567 = Buffer.method13039(var1, -346779531) * 1465087555;
         var0.field2566 = Buffer.method13039(var1, -346779531) * 747418529;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod468(Buffer var1) {
      this.field2752 = Math.min(387424936 * this.field2752, 4) * -765552747;
      this.field2758 = new short[1][1138436403][64];
      this.field2759 = new short[-1667236931 * this.field2752][-396746423][824068161];
      this.field2757 = new byte[-911637386 * this.field2752][-1930861672][64];
      this.field2756 = new byte[-1667236931 * this.field2752][-278110485][64];
      this.field2760 = new classHZ[-1667236931 * this.field2752][64][64][];

      for (int var2 = 0; var2 < 8; var2++) {
         for (int var3 = 0; var3 < 8; var3++) {
            this.method5971(this.field2567 * 1849701208 + var2, var3 + this.field2566 * 223314696, var1, (byte)27);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method5418() {
      return this.field2568 * 1619478855;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof classGF)) {
            return false;
         } else {
            classGF var2 = (classGF)var1;
            return this.field2751 * 1151970023 == var2.field2751 * 1151970023 && var2.field2750 * -456391909 == this.field2750 * -456391909
               ? this.field2567 * 1304954475 == var2.field2567 * 1304954475 && var2.field2566 * 27914337 == 27914337 * this.field2566
               : false;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "gf.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgf;I)I")
   @ObfuscatedName("yw")
   public static int method5419(classGF var0, int var1) {
      if (var0 == null) {
         return var0.method5421(var1);
      } else {
         try {
            return var0.field2568 * 1619478855;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "gf.as(" + 41);
         }
      }
   }

   @Override
   public int hashCode() {
      try {
         return this.field2751 * 1151970023 | -456391909 * this.field2750 << 8 | this.field2567 * 1304954475 << 16 | 27914337 * this.field2566 << 24;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "gf.hashCode(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgf;)I")
   @ObfuscatedName("hh")
   public static int method5412(classGF var0) {
      return var0.field2751 * 1151970023 | -456391909 * var0.field2750 << 8 | var0.field2567 * 1304954475 << 16 | 27914337 * var0.field2566 << 24;
   }

   classGF() {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method5413() {
      return this.field2751 * 255931660 | 1712704720 * this.field2750 << 8 | this.field2567 * 1304954475 << 16 | 27914337 * this.field2566 << 24;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method5416() {
      return -81434242 * this.field2569;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method5420() {
      return this.field2568 * 1619478855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgf;Lxy;)V")
   @ObfuscatedName("em")
   public static void method5406(classGF var0, Buffer var1) {
      if (var0 == null) {
         var0.vmethod468(var1);
      } else {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 != 1177860011 * classHI.field2803.field2801) {
            throw new IllegalStateException("");
         } else {
            var0.field2753 = Buffer.method13039(var1, -346779531) * -2015926021;
            var0.field2752 = Buffer.method13039(var1, -346779531) * -765552747;
            var0.field2754 = Buffer.method13047(var1, -61034170) * -735630941;
            var0.field2755 = Buffer.method13047(var1, 685524750) * -1209921667;
            var0.field2569 = Buffer.method13039(var1, -346779531) * 113218633;
            var0.field2568 = Buffer.method13039(var1, -346779531) * 2071171191;
            var0.field2751 = Buffer.method13047(var1, 1045258800) * -1652832041;
            var0.field2750 = Buffer.method13047(var1, 1695287848) * -1381327085;
            var0.field2567 = Buffer.method13039(var1, -346779531) * 1465087555;
            var0.field2566 = Buffer.method13039(var1, -346779531) * 747418529;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method5422(int var1) {
      try {
         return 1304954475 * this.field2567;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gf.ax(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgf;)I")
   @ObfuscatedName("ff")
   public static int method5414(classGF var0) {
      return var0.field2751 * 1151970023 | -456391909 * var0.field2750 << 8 | var0.field2567 * 1304954475 << 16 | 27914337 * var0.field2566 << 24;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method5423() {
      return 1304954475 * this.field2567;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method5424() {
      return 1304954475 * this.field2567;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int method5425() {
      return 1304954475 * this.field2567;
   }

   @ObfuscatedSignature(descriptor = "([FIFB)F")
   @ObfuscatedName("af")
   static float method5427(float[] var0, int var1, float var2, byte var3) {
      try {
         float var4 = var0[var1];

         for (int var5 = var1 - 1; var5 >= 0; var5--) {
            if (var3 != 10) {
               throw new IllegalStateException();
            }

            var4 = var2 * var4 + var0[var5];
         }

         return var4;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "gf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Lcg;")
   @ObfuscatedName("ae")
   static Message method5408(int var0, int var1, byte var2) {
      try {
         ChatChannel var3 = (ChatChannel)classCN.field1171.get(var0);
         return ChatChannel.method1252(var3, var1, 1248547089);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "gf.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   void method5407(Buffer var1, int var2) {
      try {
         this.field2752 = Math.min(-1667236931 * this.field2752, 4) * -765552747;
         super.field2759 = new short[1][64][64];
         this.field2759 = new short[-1667236931 * super.field2751][64][64];
         super.field2756 = new byte[-1667236931 * super.field2751][64][64];
         super.field2757 = new byte[-1667236931 * super.field2753][64][64];
         this.field2760 = new classHZ[-1667236931 * super.field2754][64][64][];

         for (int var3 = 0; var3 < 8; var3++) {
            if (var2 != -1811901292) {
               throw new IllegalStateException();
            }

            for (int var4 = 0; var4 < 8; var4++) {
               if (var2 != -1811901292) {
                  return;
               }

               this.method5971(this.field2568 * 1849701208 + var3, var4 + this.field2567 * 223314696, var1, (byte)-60);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "gf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   int method5421(int var1) {
      try {
         return this.field2567 * 1619478855;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "gf.as(" + 41);
      }
   }
}
