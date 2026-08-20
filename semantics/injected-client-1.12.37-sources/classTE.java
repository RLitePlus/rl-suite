import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("te")
public class classTE {
   @ObfuscatedName("ao")
   public boolean field6133;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6129 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6130 = 3;
   @ObfuscatedName("aa")
   public final boolean field6124;
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("ac")
   public final classYY field6128;
   @ObfuscatedName("ad")
   public long[] field6127;
   @ObfuscatedName("al")
   public int field6131;
   @ObfuscatedName("aj")
   public int field6123;
   @ObfuscatedName("ay")
   Object field6122;
   @ObfuscatedName("aq")
   int[] field6126;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field6132 = 5000;
   @ObfuscatedName("ap")
   public Object[] field6125;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("sf")
   public static int method10755(classTE var0) {
      return var0.field6131 * -1943548931;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public final int method10756(int var1) {
      try {
         return this.field6131 * -1943548931;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "te.ab(" + 41);
      }
   }

   public classTE(classYY var1, Object var2, int var3, int var4) {
      this.field6124 = true;
      this.field6128 = var1;
      this.field6123 = var4 * 404453943;
      this.field6122 = var2;
      if (classYY.field7111 == var1) {
         this.field6126 = new int[var4];
      } else if (classYY.field7115 == var1) {
         this.field6127 = new long[var4];
      } else if (var1 == classYY.field7113) {
         this.field6125 = new String[var4];
      }

      method10782(this, var3, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("az")
   public final int[] method10748(int var1) {
      try {
         return this.field6126;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "te.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[J")
   @ObfuscatedName("af")
   public final long[] method10750(int var1) {
      try {
         return this.field6127;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "te.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[J")
   @ObfuscatedName("aw")
   public final long[] method10751() {
      return this.field6127;
   }

   @ObfuscatedSignature(descriptor = "(Lte;IB)V")
   @ObfuscatedName("do")
   public static void method10782(classTE var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method10783(var1, var2);
      }

      try {
         int var3 = var0.field6131 * -1943548931;
         var0.field6131 = var1 * -1063196331;
         if (var1 < var3) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            if (classYY.field7111 == var0.field6128) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               Arrays.fill(var0.field6126, var1, var3, 0);
            } else if (classYY.field7115 == var0.field6128) {
               Arrays.fill(var0.field6127, var1, var3, 0L);
            } else {
               Arrays.fill(var0.field6125, var1, var3, null);
            }
         } else if (var1 > var3) {
            if (var0.field6128 == classYY.field7111) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               int var4 = (Integer)var0.field6122;
               if (0 != var4) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(var0.field6126, var3, var1, var4);
               }
            } else if (classYY.field7115 == var0.field6128) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               long var7 = (Long)var0.field6122;
               if (var7 != 0L) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(var0.field6127, var3, var1, var7);
               }
            } else if (null != var0.field6122) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               Arrays.fill(var0.field6125, var3, var1, var0.field6122);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "te.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Object;")
   @ObfuscatedName("ag")
   final Object method10759(int var1, byte var2) {
      try {
         if (classYY.field7111 == this.field6128) {
            if (var2 != -1) {
               throw new IllegalStateException();
            } else {
               return this.field6126[var1];
            }
         } else if (classYY.field7115 == this.field6128) {
            if (var2 != -1) {
               throw new IllegalStateException();
            } else {
               return this.field6127[var1];
            }
         } else {
            return this.field6125[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "te.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V")
   @ObfuscatedName("as")
   final void method10765(int var1, Object var2, int var3) {
      try {
         if (classYY.field7111 == this.field6128) {
            if (var3 == -764360928) {
               throw new IllegalStateException();
            }

            this.field6126[var1] = (Integer)var2;
         } else if (this.field6128 == classYY.field7115) {
            if (var3 == -764360928) {
               return;
            }

            this.field6127[var1] = (Long)var2;
         } else {
            this.field6125[var1] = var2;
         }

         this.field6133 = true;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "te.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public final void method10767(int var1, int var2) {
      try {
         this.method10774(var1, 472983705);
         method10782(this, var1, (byte)2);
         this.field6133 = true;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "te.ax(" + ')');
      }
   }

   public classTE(classYY var1, boolean var2) {
      this.field6128 = var1;
      this.field6124 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   final void method10770(int var1) {
      if (!this.field6124) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 1205727595) {
         if (var1 > this.field6123 * 922180487) {
            this.method10781(this.method10776(var1, 120041229), -483624883);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bc")
   final Object method10760(int var1) {
      if (classYY.field7111 == this.field6128) {
         return this.field6126[var1];
      } else {
         return classYY.field7115 == this.field6128 ? this.field6127[var1] : this.field6125[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   int method10776(int var1, int var2) {
      try {
         int var3 = (this.field6123 * 922180487 >> 1) + this.field6123 * 922180487;
         return Math.max(var1, Math.min(var3, 5000));
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "te.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("br")
   final void method10766(int var1, Object var2) {
      if (classYY.field7111 == this.field6128) {
         this.field6126[var1] = (Integer)var2;
      } else if (this.field6128 == classYY.field7115) {
         this.field6127[var1] = (Long)var2;
      } else {
         this.field6125[var1] = var2;
      }

      this.field6133 = true;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ar")
   public final int[] method10749() {
      return this.field6126;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lte;")
   @ObfuscatedName("bz")
   public static classTE method10792(int[] var0) {
      classTE var1 = new classTE(classYY.field7111, false);
      var1.field6126 = var0;
      var1.field6131 = var0.length * -605546848;
      var1.field6123 = var0.length * -534213669;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)Lte;")
   @ObfuscatedName("bv")
   static classTE method10788(String[] var0) {
      classTE var1 = new classTE(classYY.field7113, true);
      var1.field6125 = var0;
      var1.field6131 = -1063196331 * var0.length;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[J")
   @ObfuscatedName("av")
   public final long[] method10752() {
      return this.field6127;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public final int method10757() {
      return this.field6131 * -1943548931;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)V")
   @ObfuscatedName("pg")
   public static void method10771(classTE var0, int var1) {
      if (!var0.field6124) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 5000) {
         if (var1 > var0.field6123 * 922180487) {
            var0.method10781(var0.method10776(var1, 120041229), -483624883);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("ah")
   final Object method10761(int var1) {
      if (classYY.field7111 == this.field6128) {
         return this.field6126[var1];
      } else {
         return classYY.field7115 == this.field6128 ? this.field6127[var1] : this.field6125[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bn")
   final Object method10762(int var1) {
      if (classYY.field7111 == this.field6128) {
         return this.field6126[var1];
      } else {
         return classYY.field7115 == this.field6128 ? this.field6127[var1] : this.field6125[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bx")
   final Object method10763(int var1) {
      if (classYY.field7111 == this.field6128) {
         return this.field6126[var1];
      } else {
         return classYY.field7115 == this.field6128 ? this.field6127[var1] : this.field6125[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Z)Lte;")
   @ObfuscatedName("cl")
   public static classTE method10798(Buffer var0, boolean var1) {
      int var2 = Buffer.method13047(var0, -415805025);
      if (var2 >= 0 && var2 <= 5000) {
         int var3 = Buffer.method13039(var0, -346779531);
         if (var3 == 0 || 1 == var3) {
            int[] var9 = new int[var2];

            for (int var13 = 0; var13 < var2; var13++) {
               var9[var13] = var0.method13056((byte)1);
            }

            return var1 ? classKH.method6476(var9, (byte)116) : classDG.method3075(var9, -530642757);
         } else if (var3 == 2 || var3 == 3) {
            long[] var8 = new long[var2];

            for (int var11 = 0; var11 < var2; var11++) {
               var8[var11] = var0.method13059(-299072268);
            }

            classTE var12;
            if (var1) {
               var12 = classEK.method3909(var8, (byte)49);
            } else {
               classTE var14 = new classTE(classYY.field7115, false);
               var14.field6127 = var8;
               var14.field6131 = -1063196331 * var8.length;
               var14.field6123 = var8.length * 404453943;
               var12 = var14;
            }

            return var12;
         } else if (var3 == 4) {
            String[] var4 = new String[var2];

            for (int var5 = 0; var5 < var2; var5++) {
               var4[var5] = var0.method13071(2029779499);
            }

            classTE var10;
            if (var1) {
               var10 = SceneTilePaint.method4804(var4, 325060923);
            } else {
               classTE var7 = new classTE(classYY.field7113, false);
               var7.field6125 = var4;
               var7.field6131 = var4.length * -1063196331;
               var7.field6123 = var4.length * 404453943;
               var10 = var7;
            }

            return var10;
         } else if (var3 == 255) {
            return null;
         } else {
            throw new RuntimeException();
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bp")
   final Object method10764(int var1) {
      if (classYY.field7111 == this.field6128) {
         return this.field6126[var1];
      } else {
         return classYY.field7115 == this.field6128 ? this.field6127[var1] : this.field6125[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lte;")
   @ObfuscatedName("bq")
   public static classTE method10784(int[] var0) {
      classTE var1 = new classTE(classYY.field7111, true);
      var1.field6126 = var0;
      var1.field6131 = var0.length * -1063196331;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   public final void method10768(int var1) {
      this.method10774(var1, 1423762563);
      method10782(this, var1, (byte)2);
      this.field6133 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bt")
   public final void method10769(int var1) {
      this.method10774(var1, 1733599349);
      method10782(this, var1, (byte)2);
      this.field6133 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   final void method10772(int var1) {
      if (!this.field6124) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 5000) {
         if (var1 > this.field6123 * 922180487) {
            this.method10781(this.method10776(var1, 120041229), -483624883);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("ax")
   public static int method10777(classTE var0, int var1) {
      int var2 = (var0.field6123 * 922180487 >> 1) + var0.field6123 * 922180487;
      return Math.max(var1, Math.min(var2, 5000));
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("au")
   public void method10795(Buffer var1, byte var2) {
      try {
         var1.method12973(-1943548931 * this.field6131, -1542382992);
         if (classYY.field7111 == this.field6128) {
            if (var2 == -73) {
               return;
            }

            byte var10001;
            if (null != this.field6122 && (Integer)this.field6122 == -1) {
               if (var2 == -73) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            Buffer.method12971(var1, var10001, (byte)-94);

            for (int var3 = 0; var3 < -1943548931 * this.field6131; var3++) {
               var1.method12979(this.field6126[var3], 1710743860);
            }
         } else if (this.field6128 == classYY.field7115) {
            if (var2 == -73) {
               throw new IllegalStateException();
            }

            Buffer.method12971(var1, this.field6122 != null && (Long)this.field6122 == -1L ? 3 : 2, (byte)-13);

            for (int var5 = 0; var5 < this.field6131 * -1943548931; var5++) {
               var1.method12987(this.field6127[var5]);
            }
         } else if (classYY.field7113 == this.field6128) {
            if (var2 == -73) {
               throw new IllegalStateException();
            }

            Buffer.method12971(var1, 4, (byte)-30);

            for (int var6 = 0; var6 < -1943548931 * this.field6131; var6++) {
               if (var2 == -73) {
                  throw new IllegalStateException();
               }

               Buffer.method12997(var1, (String)this.field6125[var6], (short)25085);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "te.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;I)[Ljava/lang/Object;")
   @ObfuscatedName("mc")
   public static Object[] method10753(classTE var0, int var1) {
      if (var0 == null) {
         return var0.method10754(var1);
      } else {
         try {
            return var0.field6125;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "te.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bb")
   int method10778(int var1) {
      int var2 = (this.field6123 * 922180487 >> 1) + this.field6123 * 922180487;
      return Math.max(var1, Math.min(var2, 5000));
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   void method10780(int var1) {
      if (this.field6123 * 922180487 != var1) {
         this.field6123 = var1 * 404453943;
         if (this.field6128 == classYY.field7111) {
            this.field6126 = Arrays.copyOf(this.field6126, var1);
         } else if (this.field6128 == classYY.field7115) {
            this.field6127 = Arrays.copyOf(this.field6127, var1);
         } else if (classYY.field7113 == this.field6128) {
            this.field6125 = Arrays.copyOf(this.field6125, var1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lte;")
   @ObfuscatedName("by")
   public static classTE method10785(int[] var0) {
      classTE var1 = new classTE(classYY.field7111, true);
      var1.field6126 = var0;
      var1.field6131 = var0.length * -1063196331;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)Lte;")
   @ObfuscatedName("bl")
   static classTE method10789(String[] var0) {
      classTE var1 = new classTE(classYY.field7113, true);
      var1.field6125 = var0;
      var1.field6131 = 1956881527 * var0.length;
      var1.field6123 = var0.length * -1221531616;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)V")
   @ObfuscatedName("sy")
   public static void method10773(classTE var0, int var1) {
      if (!var0.field6124) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 5000) {
         if (var1 > var0.field6123 * 922180487) {
            var0.method10781(var0.method10776(var1, 120041229), -483624883);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J)Lte;")
   @ObfuscatedName("bf")
   static classTE method10786(long[] var0) {
      classTE var1 = new classTE(classYY.field7115, true);
      var1.field6127 = var0;
      var1.field6131 = var0.length * -1063196331;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J)Lte;")
   @ObfuscatedName("bs")
   static classTE method10787(long[] var0) {
      classTE var1 = new classTE(classYY.field7115, true);
      var1.field6127 = var0;
      var1.field6131 = var0.length * -1063196331;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)Lte;")
   @ObfuscatedName("bd")
   static classTE method10790(String[] var0) {
      classTE var1 = new classTE(classYY.field7113, true);
      var1.field6125 = var0;
      var1.field6131 = -1063196331 * var0.length;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bi")
   int method10779(int var1) {
      int var2 = (this.field6123 * 922180487 >> 1) + this.field6123 * 922180487;
      return Math.max(var1, Math.min(var2, 5000));
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   final void method10774(int var1, int var2) {
      try {
         if (!this.field6124) {
            if (var2 <= 107806170) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= 107806170) {
                  throw new IllegalStateException();
               }

               if (var1 <= 5000) {
                  if (var1 > this.field6123 * 922180487) {
                     if (var2 <= 107806170) {
                        throw new IllegalStateException();
                     }

                     this.method10781(this.method10776(var1, 120041229), -483624883);
                  }

                  return;
               }

               if (var2 <= 107806170) {
                  throw new IllegalStateException();
               }
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "te.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)Lte;")
   @ObfuscatedName("bh")
   static classTE method10791(String[] var0) {
      classTE var1 = new classTE(classYY.field7113, true);
      var1.field6125 = var0;
      var1.field6131 = -1063196331 * var0.length;
      var1.field6123 = var0.length * 404453943;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ao")
   void method10781(int var1, int var2) {
      try {
         if (this.field6123 * 922180487 != var1) {
            if (var2 != -483624883) {
               throw new IllegalStateException();
            }

            this.field6123 = var1 * 404453943;
            if (this.field6128 == classYY.field7111) {
               if (var2 != -483624883) {
                  return;
               }

               this.field6126 = Arrays.copyOf(this.field6126, var1);
            } else if (this.field6128 == classYY.field7115) {
               if (var2 != -483624883) {
                  throw new IllegalStateException();
               }

               this.field6127 = Arrays.copyOf(this.field6127, var1);
            } else if (classYY.field7113 == this.field6128) {
               if (var2 != -483624883) {
                  throw new IllegalStateException();
               }

               this.field6125 = Arrays.copyOf(this.field6125, var1);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "te.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("cr")
   public static int method10793(classTE var0) {
      int var1 = 3;
      if (var0 != null) {
         switch (var0.field6128.field7107 * -972641695) {
            case 2:
               var1 += 176544829 * var0.field6131;
               break;
            case 3:
               var1 += var0.field6131 * 1631477736;
               break;
            case 4:
               for (int var2 = 0; var2 < var0.field6131 * -1943548931; var2++) {
                  var1 += classAU.method712((String)var0.field6125[var2], (byte)77);
               }
               break;
            default:
               throw new IllegalArgumentException();
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("cu")
   public static int method10794(classTE var0) {
      int var1 = 3;
      if (var0 != null) {
         switch (var0.field6128.field7107 * -900901303) {
            case 2:
               var1 += 815738868 * var0.field6131;
               break;
            case 3:
               var1 += var0.field6131 * 1631477736;
               break;
            case 4:
               for (int var2 = 0; var2 < var0.field6131 * -1943548931; var2++) {
                  var1 += classAU.method712((String)var0.field6125[var2], (byte)106);
               }
               break;
            default:
               throw new IllegalArgumentException();
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cb")
   public void method10796(Buffer var1) {
      var1.method12973(-1943548931 * this.field6131, -1542382992);
      if (classYY.field7111 == this.field6128) {
         Buffer.method12971(var1, null != this.field6122 && (Integer)this.field6122 == -1 ? 1 : 0, (byte)-97);

         for (int var2 = 0; var2 < -1943548931 * this.field6131; var2++) {
            var1.method12979(this.field6126[var2], -193597109);
         }
      } else if (this.field6128 == classYY.field7115) {
         Buffer.method12971(var1, this.field6122 != null && (Long)this.field6122 == -1L ? 3 : 2, (byte)-59);

         for (int var3 = 0; var3 < this.field6131 * -1943548931; var3++) {
            var1.method12987(this.field6127[var3]);
         }
      } else if (classYY.field7113 == this.field6128) {
         Buffer.method12971(var1, 4, (byte)-13);

         for (int var4 = 0; var4 < -1943548931 * this.field6131; var4++) {
            Buffer.method12997(var1, (String)this.field6125[var4], (short)26595);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ct")
   public void method10797(Buffer var1) {
      var1.method12973(-1943548931 * this.field6131, -1542382992);
      if (classYY.field7111 == this.field6128) {
         Buffer.method12971(var1, null != this.field6122 && (Integer)this.field6122 == -1 ? 1 : 0, (byte)-49);

         for (int var2 = 0; var2 < -1943548931 * this.field6131; var2++) {
            var1.method12979(this.field6126[var2], 576025583);
         }
      } else if (this.field6128 == classYY.field7115) {
         Buffer.method12971(var1, this.field6122 != null && (Long)this.field6122 == -1L ? 3 : 2, (byte)-90);

         for (int var3 = 0; var3 < this.field6131 * -1250620310; var3++) {
            var1.method12987(this.field6127[var3]);
         }
      } else if (classYY.field7113 == this.field6128) {
         Buffer.method12971(var1, 4, (byte)-89);

         for (int var4 = 0; var4 < -1943548931 * this.field6131; var4++) {
            Buffer.method12997(var1, (String)this.field6125[var4], (short)11373);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Z)Lte;")
   @ObfuscatedName("cp")
   public static classTE method10799(Buffer var0, boolean var1) {
      int var2 = Buffer.method13047(var0, -103836328);
      if (var2 >= 0 && var2 <= 5000) {
         int var3 = Buffer.method13039(var0, -346779531);
         if (var3 == 0 || 1 == var3) {
            int[] var9 = new int[var2];

            for (int var13 = 0; var13 < var2; var13++) {
               var9[var13] = var0.method13056((byte)1);
            }

            return var1 ? classKH.method6476(var9, (byte)5) : classDG.method3075(var9, -530642757);
         } else if (var3 == 2 || var3 == 3) {
            long[] var8 = new long[var2];

            for (int var11 = 0; var11 < var2; var11++) {
               var8[var11] = var0.method13059(244337670);
            }

            classTE var12;
            if (var1) {
               var12 = classEK.method3909(var8, (byte)49);
            } else {
               classTE var14 = new classTE(classYY.field7115, false);
               var14.field6127 = var8;
               var14.field6131 = -1063196331 * var8.length;
               var14.field6123 = var8.length * 404453943;
               var12 = var14;
            }

            return var12;
         } else if (var3 == 4) {
            String[] var4 = new String[var2];

            for (int var5 = 0; var5 < var2; var5++) {
               var4[var5] = var0.method13071(944597331);
            }

            classTE var10;
            if (var1) {
               var10 = SceneTilePaint.method4804(var4, -2022602313);
            } else {
               classTE var7 = new classTE(classYY.field7113, false);
               var7.field6125 = var4;
               var7.field6131 = var4.length * -1052601557;
               var7.field6123 = var4.length * 404453943;
               var10 = var7;
            }

            return var10;
         } else if (var3 == 255) {
            return null;
         } else {
            throw new RuntimeException();
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Z)Lte;")
   @ObfuscatedName("cq")
   public static classTE method10800(Buffer var0, boolean var1) {
      int var2 = Buffer.method13047(var0, -836339954);
      if (var2 >= 0 && var2 <= 5000) {
         int var3 = Buffer.method13039(var0, -346779531);
         if (var3 == 0 || 1 == var3) {
            int[] var9 = new int[var2];

            for (int var13 = 0; var13 < var2; var13++) {
               var9[var13] = var0.method13056((byte)1);
            }

            return var1 ? classKH.method6476(var9, (byte)9) : classDG.method3075(var9, -530642757);
         } else if (var3 == 2 || var3 == 3) {
            long[] var8 = new long[var2];

            for (int var11 = 0; var11 < var2; var11++) {
               var8[var11] = var0.method13059(1895486891);
            }

            classTE var12;
            if (var1) {
               var12 = classEK.method3909(var8, (byte)49);
            } else {
               classTE var14 = new classTE(classYY.field7115, false);
               var14.field6127 = var8;
               var14.field6131 = -1063196331 * var8.length;
               var14.field6123 = var8.length * 404453943;
               var12 = var14;
            }

            return var12;
         } else if (var3 == 4) {
            String[] var4 = new String[var2];

            for (int var5 = 0; var5 < var2; var5++) {
               var4[var5] = var0.method13071(465506);
            }

            classTE var10;
            if (var1) {
               var10 = SceneTilePaint.method4804(var4, 326583914);
            } else {
               classTE var7 = new classTE(classYY.field7113, false);
               var7.field6125 = var4;
               var7.field6131 = var4.length * -1063196331;
               var7.field6123 = var4.length * 404453943;
               var10 = var7;
            }

            return var10;
         } else if (var3 == 255) {
            return null;
         } else {
            throw new RuntimeException();
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   final void method10775(int var1) {
      if (!this.field6124) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= -1262220156) {
         if (var1 > this.field6123 * 416449250) {
            this.method10781(this.method10776(var1, 120041229), -483624883);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("ae")
   public final Object[] method10754(int var1) {
      try {
         return this.field6125;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "te.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public final int method10758() {
      return this.field6123 * -1943548931;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("al")
   final void method10783(int var1, byte var2) {
      try {
         int var3 = this.field6123 * -1943548931;
         this.field6131 = var1 * -1063196331;
         if (var1 < var3) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            if (classYY.field7115 == this.field6128) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               Arrays.fill(this.field6126, var1, var3, 0);
            } else if (classYY.field7113 == this.field6128) {
               Arrays.fill(this.field6127, var1, var3, 0L);
            } else {
               Arrays.fill(this.field6125, var1, var3, null);
            }
         } else if (var1 > var3) {
            if (this.field6128 == classYY.field7114) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               int var4 = (Integer)this.field6122;
               if (0 != var4) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(this.field6126, var3, var1, var4);
               }
            } else if (classYY.field7113 == this.field6128) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               long var7 = (Long)this.field6122;
               if (var7 != 0L) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(this.field6127, var3, var1, var7);
               }
            } else if (null != this.field6122) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               Arrays.fill(this.field6125, var3, var1, this.field6122);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "te.al(" + ')');
      }
   }
}
