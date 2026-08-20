import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kn")
public class IndexCheck implements classBS {
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   static final int field3388 = 1000;
   @ObfuscatedName("dh")
   public int[] field3393;
   @ObfuscatedName("ak")
   public int field3386;
   @ObfuscatedName("cr")
   public int[] field3392;
   @ObfuscatedName("ag")
   public int field3373;
   @ObfuscatedName("an")
   int[] field3382;
   @ObfuscatedName("ae")
   int field3374;
   @ObfuscatedName("ic")
   public int field3391;
   @ObfuscatedName("au")
   int field3380;
   @ToRemove(unused = "true")
   @ObfuscatedName("cm")
   static final int field3389 = 72;
   @ObfuscatedName("aw")
   char[] field3377;
   @ObfuscatedName("ap")
   int[] field3378;
   @ObfuscatedName("ay")
   int field3379;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3387 = 128;
   @ObfuscatedName("az")
   int field3375;
   @ObfuscatedName("ad")
   boolean[] field3383;
   @ObfuscatedName("hs")
   public int field3390;
   @ObfuscatedName("ai")
   boolean[] field3381;
   @ObfuscatedName("as")
   boolean[] field3376;
   @ObfuscatedName("at")
   public int[] field3384 = new int[128];
   @ObfuscatedName("aj")
   public char field3385;

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod92(boolean var1, int var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kn.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod96(int var1, int var2) {
      if (class33.field207) {
         if (this.field3373 * -1355266525 < this.field3384.length) {
            int[] var10000 = this.field3384;
            int var10001 = this.field3373 * -1355266525;
            this.field3373 = (this.field3373 * -1355266525 + 1) * 1984797067;
            var10000[var10001] = var1;
         }
      } else {
         int var3 = var1;
         IndexCheck var6 = this;
         int var4 = -1696349320;

         try {
            var6.method6503(var3, -320593924);
            var6.field3383[var3] = true;
            var6.field3381[var3] = true;
            var6.field3376[var3] = false;
            if (-1355266525 * var6.field3373 < 128) {
               if (var4 == -1931673031) {
                  throw new IllegalStateException();
               }

               var6.field3384[(var6.field3373 += 1984797067) * -1355266525 - 1] = var3;
            }

            boolean var7 = true;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "kn.av(" + ')');
         }

         if (this.field3390 < this.field3392.length) {
            this.field3392[this.field3390++] = var1;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bg")
   public int[] method6520() {
      int[] var1 = new int[689848607 * this.field3374];

      for (int var2 = 0; var2 < 689848607 * this.field3374; var2++) {
         var1[var2] = this.field3382[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lkn;IS)Z")
   @ObfuscatedName("rk")
   public static boolean method6514(IndexCheck var0, int var1, short var2) {
      if (var0 == null) {
         var0.isValidIndexInRange(var1, var2);
      }

      try {
         if (var1 >= 0) {
            if (var2 != 1337) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return var0.field3383[var1];
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kn.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Z")
   @ObfuscatedName("km")
   public boolean[] method6528() {
      return this.field3383;
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod91(char var1, byte var2) {
      if (!class33.field207) {
         char var3 = var1;
         IndexCheck var7 = this;
         byte var4 = -128;

         try {
            int var5 = -822332839 * var7.field3380 + 1 & 127;
            if (729836485 * var7.field3379 != var5) {
               if (var4 >= 30) {
                  throw new IllegalStateException();
               }

               var7.field3378[var7.field3380 * -822332839] = -1;
               var7.field3377[var7.field3380 * -822332839] = var3;
               var7.field3380 = 1939863017 * var5;
            }

            boolean var8 = false;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "kn.ag(" + ')');
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   void method6503(int var1, int var2) {
      try {
         int var3 = this.field3380 * -822332839 + 1 & 127;
         if (this.field3379 * 729836485 != var3) {
            if (var2 != -320593924) {
               throw new IllegalStateException();
            }

            this.field3378[this.field3380 * -822332839] = var1;
            this.field3377[-822332839 * this.field3380] = 0;
            this.field3380 = var3 * 1939863017;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kn.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   public boolean method6517(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 2042375222) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field3376[var1];
            }

            if (var2 >= 2042375222) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ll")
   public void method6527() {
      this.field3390 = 0;
      this.field3391 = 0;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   public void method6506(byte var1) {
      this.method6527();

      try {
         this.field3379 = 1001826131 * this.field3375;
         this.field3375 = 550756551 * this.field3380;
         this.field3373 = 0;
         this.field3374 = 0;
         Arrays.fill(this.field3381, false);
         Arrays.fill(this.field3376, false);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kn.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("as")
   public final boolean method6510(byte var1) {
      try {
         if (-436309025 * this.field3375 == 729836485 * this.field3379) {
            if (var1 >= 25) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.field3386 = -1887256713 * this.field3378[729836485 * this.field3379];
            this.field3385 = this.field3377[this.field3379 * 729836485];
            this.field3379 = -1934238963 * (729836485 * this.field3379 + 1 & 127);
            return true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kn.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method6507() {
      this.field3379 = 1050265063 * this.field3375;
      this.field3375 = -797432377 * this.field3380;
      this.field3373 = 0;
      this.field3374 = 0;
      Arrays.fill(this.field3381, false);
      Arrays.fill(this.field3376, false);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("be")
   public boolean method6515(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3383[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ar")
   public int[] method6526(int var1) {
      int[] var2 = new int[this.field3390];

      for (int var3 = 0; var3 < this.field3390; var3++) {
         var2[var3] = this.field3392[var3];
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method6508() {
      this.field3379 = 1001826131 * this.field3375;
      this.field3375 = 1059448358 * this.field3380;
      this.field3373 = 0;
      this.field3374 = 0;
      Arrays.fill(this.field3381, false);
      Arrays.fill(this.field3376, false);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod93(int var1) {
      this.method6503(var1, -320593924);
      this.field3383[var1] = true;
      this.field3381[var1] = true;
      this.field3376[var1] = false;
      if (766616395 * this.field3373 < 128) {
         this.field3384[(this.field3373 += 1984797067) * -1355266525 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Liv;B)Z")
   @ObfuscatedName("at")
   static boolean method6505(ObjectComposition var0, byte var1) {
      try {
         if (null != var0.transforms) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            int[] var2 = var0.transforms;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               int var4 = var2[var3];
               ObjectComposition var5 = AsyncHttpResponse.getObjectDefinition(var4, 1999308982);
               if (-2059094647 * var5.mapIconId != -1) {
                  return true;
               }
            }
         } else if (-1 != -2059094647 * var0.mapIconId) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            return true;
         }

         return false;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod97(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aw")
   @Override
   public boolean vmethod99(char var1) {
      int var2 = -822332839 * this.field3380 + 1 & 725466470;
      if (729836485 * this.field3379 != var2) {
         this.field3378[this.field3380 * -822332839] = -1;
         this.field3377[this.field3380 * -822332839] = var1;
         this.field3380 = 567918125 * var2;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("il")
   public boolean method6529(int var1) {
      return method6514(this, var1, (short)1337);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   public boolean method6513(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 1971916558) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field3381[var1];
            }

            if (var2 >= 1971916558) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kn.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod89(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod90(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ap")
   @Override
   public boolean vmethod100(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lkn;I)[I")
   @ObfuscatedName("rn")
   public static int[] method6524(IndexCheck var0, int var1) {
      if (var0 == null) {
         var0.method6525(var1);
      }

      int[] var2 = new int[var0.field3391];

      for (int var3 = 0; var3 < var0.field3391; var3++) {
         var2[var3] = var0.field3393[var3];
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method6504(int var1) {
      int var2 = this.field3380 * 103165602 + 1 & -1182301171;
      if (this.field3379 * 729836485 != var2) {
         this.field3378[this.field3380 * -1451075270] = var1;
         this.field3377[-822332839 * this.field3380] = 0;
         this.field3380 = var2 * 159392060;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public final boolean method6511() {
      if (1836616624 * this.field3375 == 729836485 * this.field3379) {
         return false;
      } else {
         this.field3386 = -1887256713 * this.field3378[729836485 * this.field3379];
         this.field3385 = this.field3377[this.field3379 * 1278764220];
         this.field3379 = -1934238963 * (729836485 * this.field3379 + 1 & 127);
         return true;
      }
   }

   public IndexCheck() {
      this.field3373 = 0;
      this.field3382 = new int[128];
      this.field3374 = 0;
      this.field3377 = new char[128];
      this.field3378 = new int[128];
      this.field3379 = 0;
      this.field3380 = 0;
      this.field3375 = 0;
      this.field3383 = new boolean[112];
      this.field3381 = new boolean[112];
      this.field3376 = new boolean[112];
      this.method6523();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jt")
   public void method6523() {
      this.field3392 = new int[this.field3384.length];
      this.field3393 = new int[this.field3382.length];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method6509() {
      this.field3379 = 1001826131 * this.field3375;
      this.field3375 = 550756551 * this.field3380;
      this.field3373 = 0;
      this.field3374 = 0;
      Arrays.fill(this.field3381, false);
      Arrays.fill(this.field3376, false);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod94(int var1) {
      this.method6503(var1, -320593924);
      this.field3383[var1] = true;
      this.field3381[var1] = true;
      this.field3376[var1] = false;
      if (-1355266525 * this.field3373 < 128) {
         this.field3384[(this.field3373 += 1984797067) * -1355266525 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public final boolean method6512() {
      if (-436309025 * this.field3375 == 729836485 * this.field3379) {
         return false;
      } else {
         this.field3386 = -1887256713 * this.field3378[729836485 * this.field3379];
         this.field3385 = this.field3377[this.field3379 * 729836485];
         this.field3379 = -1934238963 * (729836485 * this.field3379 + 1 & 127);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bz")
   public int[] method6518() {
      int[] var1 = new int[this.field3373 * -1355266525];

      for (int var2 = 0; var2 < -1355266525 * this.field3373; var2++) {
         var1[var2] = this.field3384[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bk")
   public int[] method6521() {
      int[] var1 = new int[689848607 * this.field3374];

      for (int var2 = 0; var2 < 689848607 * this.field3374; var2++) {
         var1[var2] = this.field3382[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bs")
   public int[] method6522() {
      int[] var1 = new int[689848607 * this.field3374];

      for (int var2 = 0; var2 < -1773135284 * this.field3374; var2++) {
         var1[var2] = this.field3382[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   @Override
   public boolean vmethod95(int var1) {
      this.field3383[var1] = false;
      this.field3381[var1] = false;
      this.field3376[var1] = true;
      if (689848607 * this.field3374 < 1895521583) {
         this.field3382[(this.field3374 += 1052903929) * -890058041 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean vmethod98(int var1, byte var2) {
      if (class33.field207) {
         if (this.field3374 * 689848607 < this.field3382.length) {
            int[] var10000 = this.field3382;
            int var10001 = this.field3374 * 689848607;
            this.field3374 = (this.field3374 * 689848607 + 1) * -1168901409;
            var10000[var10001] = var1;
         }
      } else {
         int var3 = var1;
         IndexCheck var6 = this;
         byte var4 = 63;

         try {
            var6.field3383[var3] = false;
            var6.field3381[var3] = false;
            var6.field3376[var3] = true;
            if (689848607 * var6.field3374 < 128) {
               if (var4 == 1) {
                  throw new IllegalStateException();
               }

               var6.field3382[(var6.field3374 += -1168901409) * 689848607 - 1] = var3;
            }

            boolean var7 = true;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "kn.at(" + ')');
         }

         if (this.field3391 < this.field3393.length) {
            this.field3393[this.field3391++] = var1;
         }
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;)V")
   @ObfuscatedName("wa")
   public static void method6502(AccessFile var0) throws IOException {
      if (var0 == null) {
         var0.method11803();
      } else {
         AccessFile.method11807(var0, false, (byte)-81);
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)Z")
   @ObfuscatedName("ab")
   public boolean isValidIndexInRange(int var1, short var2) {
      try {
         if (var1 >= 0) {
            if (var2 != 1337) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field3381[var1];
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kn.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkn;)[I")
   @ObfuscatedName("lo")
   public static int[] method6519(IndexCheck var0) {
      int[] var1 = new int[var0.field3373 * -1355266525];

      for (int var2 = 0; var2 < -1355266525 * var0.field3373; var2++) {
         var1[var2] = var0.field3384[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ah")
   public int[] method6525(int var1) {
      int[] var2 = new int[this.field3373];

      for (int var3 = 0; var3 < this.field3386; var3++) {
         var2[var3] = this.field3393[var3];
      }

      return var2;
   }
}
