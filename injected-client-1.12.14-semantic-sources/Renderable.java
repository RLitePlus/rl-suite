import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public abstract class Renderable extends IndexedObjectNode implements net.runelite.api.Renderable {
   @ObfuscatedName("ea")
   public int height = -1953519640;

   @ObfuscatedSignature(descriptor = "(I)Ljs;")
   @ObfuscatedName("am")
   protected classJS vmethod109(int var1) {
      try {
         return classJS.field3180;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jz.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ge")
   void vmethod234(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      try {
         if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.vmethod51(-1841545705)) {
            Model var15 = this.getModel(968421032);
            if (var15 != null) {
               var5 -= this.getAnimationHeightOffset(-1287082651);
               this.height = 1 * var15.height;
               Model.method6841(var15, this.vmethod109(1389940305));
               var15.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
               Model.method6841(var15, classJS.field3180);
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "jz.ge(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kq")
   void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      try {
         if (1 != Rasterizer3D.clips.currentFaceAlpha || this.vmethod51(-1841545705)) {
            Model var8 = this.getModel(-1122875538);
            if (var8 != null) {
               var4 -= this.getAnimationHeightOffset(1119814122);
               this.height = 1 * var8.height;
               Model.method6841(var8, this.vmethod109(933610311));
               var8.draw(var1, var2, var3, var4, var5, var6);
               Model.method6841(var8, classJS.field3180);
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "jz.kq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   protected Model getModel(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jz.ag(" + ')');
      }
   }

   public int getModelHeight() {
      return this.height * -1272589951;
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("ch")
   protected classJS vmethod108() {
      return classJS.field3180;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   protected int vmethod56() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   protected int getAnimationHeightOffset(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jz.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("bv")
   protected classJS vmethod107() {
      return classJS.field3180;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   protected int vmethod54() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   protected int vmethod55() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kf")
   void vmethod250(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha || this.vmethod51(-1841545705)) {
         Model var8 = this.getModel(66999894);
         if (var8 != null) {
            var4 -= this.getAnimationHeightOffset(-2090179782);
            this.height = 1 * var8.height;
            Model.method6841(var8, this.vmethod109(986020107));
            var8.draw(var1, var2, var3, var4, var5, var6);
            Model.method6841(var8, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   protected int vmethod57() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   protected boolean vmethod52() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   protected Model vmethod49() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("lj")
   public void method6218(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.vmethod234(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13, var14);
   }

   protected Renderable() {
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ag")
   public static int method6216(int var0, byte var1) {
      try {
         return var0 >> 3 & 2047;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jz.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("ep")
   public void method6219(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      this.draw(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("ku")
   void vmethod251(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha || this.vmethod51(-1841545705)) {
         Model var8 = this.getModel(128016271);
         if (var8 != null) {
            var4 -= this.getAnimationHeightOffset(1022285397);
            this.height = 1 * var8.height;
            Model.method6841(var8, this.vmethod109(1710747679));
            var8.draw(var1, var2, var3, var4, var5, var6);
            Model.method6841(var8, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("ce")
   protected classJS vmethod106() {
      return classJS.field3180;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kz")
   void vmethod231(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.vmethod51(-1841545705)) {
         Model var15 = this.getModel(-1375233335);
         if (var15 != null) {
            var5 -= this.getAnimationHeightOffset(-1334118423);
            this.height = 1 * var15.height;
            Model.method6841(var15, this.vmethod109(1839569613));
            var15.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            Model.method6841(var15, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   protected boolean vmethod51(int var1) {
      try {
         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jz.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kt")
   void vmethod233(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.vmethod51(-1841545705)) {
         Model var15 = this.getModel(-79942168);
         if (var15 != null) {
            var5 -= this.getAnimationHeightOffset(-1006257063);
            this.height = 1 * var15.height;
            Model.method6841(var15, this.vmethod109(2051354583));
            var15.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            Model.method6841(var15, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kx")
   void vmethod252(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha || this.vmethod51(-1841545705)) {
         Model var8 = this.getModel(347272198);
         if (var8 != null) {
            var4 -= this.getAnimationHeightOffset(667727364);
            this.height = 1 * var8.height;
            Model.method6841(var8, this.vmethod109(1274511181));
            var8.draw(var1, var2, var3, var4, var5, var6);
            Model.method6841(var8, classJS.field3180);
         }
      }
   }

   public int getAnimationHeightOffset() {
      return this.getAnimationHeightOffset(-903085797);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   protected boolean vmethod50() {
      return true;
   }

   public void setModelHeight(int var1) {
      this.height = var1 * -689148287;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ko")
   void vmethod230(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.vmethod51(-1841545705)) {
         Model var15 = this.getModel(901057724);
         if (var15 != null) {
            var5 -= this.getAnimationHeightOffset(969477791);
            this.height = 1 * var15.height;
            Model.method6841(var15, this.vmethod109(1308322444));
            var15.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            Model.method6841(var15, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kg")
   void vmethod253(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (1 != Rasterizer3D.clips.currentFaceAlpha || this.vmethod51(-1841545705)) {
         Model var8 = this.getModel(-1239319979);
         if (var8 != null) {
            var4 -= this.getAnimationHeightOffset(-1843564617);
            this.height = 1 * var8.height;
            Model.method6841(var8, this.vmethod109(1115670503));
            var8.draw(var1, var2, var3, var4, var5, var6);
            Model.method6841(var8, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("tv")
   public Model method6220() {
      return this.getModel(566725961);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kp")
   void vmethod232(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.vmethod51(-1841545705)) {
         Model var15 = this.getModel(1305780505);
         if (var15 != null) {
            var5 -= this.getAnimationHeightOffset(-1778621827);
            this.height = 1 * var15.height;
            Model.method6841(var15, this.vmethod109(1660314846));
            var15.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            Model.method6841(var15, classJS.field3180);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcv;B)Lci;")
   @ObfuscatedName("av")
   public static Player method6215(int var0, WorldViewManager var1, byte var2) {
      try {
         Player var3 = null;

         for (WorldView var5 : var1) {
            Player var6 = (Player)var5.npcs.get(var0);
            if (var6 != null) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (-1 != var5.id * 577964535) {
                  return var6;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = var6;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "jz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;IIB)V")
   @ObfuscatedName("aj")
   public static void method6217(String[] var0, Object[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 <= 1) {
                  return;
               }

               if (var7 != null) {
                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method6217(var0, var1, var2, var6 - 1, (byte)22);
            method6217(var0, var1, 1 + var6, var3, (byte)72);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "jz.aj(" + ')');
      }
   }
}
