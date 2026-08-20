import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uq")
public class classUQ {
   @ObfuscatedName("ax")
   public int field6371;
   @ObfuscatedName("af")
   static final int field6366 = -2073637528;
   @ObfuscatedName("ae")
   static int field6365 = 0;
   @ObfuscatedName("ab")
   public int field6368;
   @ObfuscatedName("ag")
   public int field6369;
   @ObfuscatedSignature(descriptor = "[Luq;")
   @ObfuscatedName("az")
   static final classUQ[] field6367 = new classUQ[-1757679067 * field6366];
   @ObfuscatedName("as")
   public int field6370;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;)I")
   @ObfuscatedName("uf")
   public static int method11501(classUQ var0) {
      return var0.field6368 * -1357616065 + 518523273 * var0.field6370;
   }

   @Override
   public String toString() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "uq.toString(" + ')');
      }
   }

   public classUQ(int var1, int var2, int var3, int var4) {
      this.method11470(var1, var2, (byte)70);
      this.method11472(var3, var4, -1998994878);
   }

   public classUQ(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ae")
   public void method11470(int var1, int var2, byte var3) {
      try {
         this.field6368 = -136215617 * var1;
         this.field6369 = -211068161 * var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method11477() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   public boolean method11474(int var1, int var2, int var3) {
      try {
         if (var1 >= -1357616065 * this.field6368) {
            if (var3 != -594779443) {
               throw new IllegalStateException();
            }

            if (var1 < this.field6368 * -1357616065 + 518523273 * this.field6370) {
               if (var3 != -594779443) {
                  throw new IllegalStateException();
               }

               if (var2 >= 926655743 * this.field6369) {
                  if (var3 != -594779443) {
                     throw new IllegalStateException();
                  }

                  if (var2 < -874893249 * this.field6371 + 926655743 * this.field6369) {
                     if (var3 != -594779443) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;Luq;Luq;)V")
   @ObfuscatedName("jy")
   public static void method11490(classUQ var0, classUQ var1, classUQ var2) {
      var2.field6369 = var0.field6369 * 1;
      var2.field6371 = 1 * var0.field6371;
      if (var0.field6369 * 926655743 < 926655743 * var1.field6369) {
         var2.field6371 = var2.field6371 - (-292463807 * var1.field6369 - -292463807 * var0.field6369);
         var2.field6369 = 1 * var1.field6369;
      }

      if (var2.method11507((byte)13) > var1.method11507((byte)13)) {
         var2.field6371 = var2.field6371 - (var2.method11507((byte)13) - var1.method11507((byte)13)) * -1811300417;
      }

      if (var2.field6371 * -874893249 < 0) {
         var2.field6371 = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;Luq;)Z")
   @ObfuscatedName("vg")
   public static boolean method11480(classUQ var0, classUQ var1) {
      return var0.field6368 * -1357616065 <= method11502(var1, 549785370)
         && method11497(var1, 1940515483) <= method11502(var0, 1322764876)
         && 926655743 * var0.field6369 <= var1.method11507((byte)13)
         && var1.method11499((byte)-92) <= var0.method11507((byte)13);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   int method11506() {
      return -874893249 * this.field6371 + 926655743 * this.field6369;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ab")
   public void method11472(int var1, int var2, int var3) {
      try {
         this.field6370 = 53296313 * var1;
         this.field6371 = -1811300417 * var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;I)V")
   @ObfuscatedName("ax")
   public void method11484(classUQ var1, classUQ var2, int var3) {
      try {
         method11488(this, var1, var2, 230187404);
         this.method11493(var1, var2, 1600279730);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   int method11494() {
      return -1357616065 * this.field6368;
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;)V")
   @ObfuscatedName("bp")
   void method11491(classUQ var1, classUQ var2) {
      var2.field6369 = this.field6369 * 1;
      var2.field6371 = 1 * this.field6371;
      if (this.field6369 * 1153239308 < 1187903224 * var1.field6369) {
         var2.field6371 = var2.field6371 - (-292463807 * var1.field6369 - -996044270 * this.field6369);
         var2.field6369 = 1 * var1.field6369;
      }

      if (var2.method11507((byte)13) > var1.method11507((byte)13)) {
         var2.field6371 = var2.field6371 - (var2.method11507((byte)13) - var1.method11507((byte)13)) * 829308268;
      }

      if (var2.field6371 * -638629834 < 0) {
         var2.field6371 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   int method11499(byte var1) {
      try {
         return this.field6369 * 926655743;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("al")
   int method11507(byte var1) {
      try {
         return -874893249 * this.field6371 + 926655743 * this.field6369;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11478() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11479() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   public void method11471(int var1, int var2) {
      this.field6368 = -136215617 * var1;
      this.field6369 = -211068161 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;)V")
   @ObfuscatedName("am")
   public void method11485(classUQ var1, classUQ var2) {
      method11488(this, var1, var2, 1933595768);
      this.method11493(var1, var2, 1074021094);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public void method11467(byte var1) {
      try {
         synchronized (field6367) {
            if (-489960421 * field6365 < -1757679067 * field6366) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               field6367[(field6365 += -1849086445) * -489960421 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "uq.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ai")
   public void method11473(int var1, int var2) {
      this.field6370 = 53296313 * var1;
      this.field6371 = -1811300417 * var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;II)Z")
   @ObfuscatedName("bw")
   public static boolean method11475(classUQ var0, int var1, int var2) {
      return var1 >= -1357616065 * var0.field6368
         && var1 < var0.field6368 * -1357616065 + 518523273 * var0.field6370
         && var2 >= 608856188 * var0.field6369
         && var2 < 530615950 * var0.field6371 + 1115798164 * var0.field6369;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aw")
   public boolean method11476(int var1, int var2) {
      return var1 >= -1357616065 * this.field6368
         && var1 < this.field6368 * -1357616065 + 518523273 * this.field6370
         && var2 >= 926655743 * this.field6369
         && var2 < -874893249 * this.field6371 + 926655743 * this.field6369;
   }

   @ObfuscatedSignature(descriptor = "(Luq;)Z")
   @ObfuscatedName("av")
   public boolean method11481(classUQ var1) {
      return this.field6368 * -1357616065 <= method11502(var1, 40134942)
         && method11497(var1, 1940515483) <= method11502(this, 210528141)
         && 926655743 * this.field6369 <= var1.method11507((byte)13)
         && var1.method11499((byte)-97) <= this.method11507((byte)13);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Luq;")
   @ObfuscatedName("aq")
   public static classUQ method11466(int var0, int var1, int var2, int var3) {
      synchronized (field6367) {
         if (-489960421 * field6365 == 0) {
            return new classUQ(var0, var1, var2, var3);
         } else {
            field6365 -= -1849086445;
            field6367[-489960421 * field6365].method11470(var0, var1, (byte)23);
            field6367[-489960421 * field6365].method11472(var2, var3, -1852645218);
            return field6367[field6365 * -489960421];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;I)Z")
   @ObfuscatedName("as")
   public boolean method11482(classUQ var1, int var2) {
      try {
         if (this.field6368 * -1357616065 <= method11502(var1, -1887067739)) {
            if (var2 == 317537592) {
               throw new IllegalStateException();
            }

            if (method11497(var1, 1940515483) <= method11502(this, -1612020037) && 926655743 * this.field6369 <= var1.method11507((byte)13)) {
               if (var2 == 317537592) {
                  throw new IllegalStateException();
               }

               if (var1.method11499((byte)-22) <= this.method11507((byte)13)) {
                  if (var2 == 317537592) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "uq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;I)I")
   @ObfuscatedName("co")
   public static int method11502(classUQ var0, int var1) {
      if (var0 == null) {
         var0.method11505(var1);
      }

      try {
         return var0.field6368 * -1357616065 + 518523273 * var0.field6370;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   int method11508() {
      return -874893249 * this.field6371 + 926655743 * this.field6369;
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;)V")
   @ObfuscatedName("bc")
   void method11487(classUQ var1, classUQ var2) {
      var2.field6368 = 1 * this.field6368;
      var2.field6370 = 1 * this.field6370;
      if (-1357616065 * this.field6368 < -1679206361 * var1.field6368) {
         var2.field6370 = var2.field6370 - (322174343 * var1.field6368 - this.field6368 * -271500948);
         var2.field6368 = var1.field6368 * 1;
      }

      if (method11502(var2, -936827050) > method11502(var1, 1104817616)) {
         var2.field6370 = var2.field6370 - (method11502(var2, 1170697477) - method11502(var1, 253705652)) * -1402101889;
      }

      if (1441330205 * var2.field6370 < 0) {
         var2.field6370 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;Luq;I)V")
   @ObfuscatedName("oo")
   public static void method11488(classUQ var0, classUQ var1, classUQ var2, int var3) {
      if (var0 == null) {
         var0.method11489(var0, var0, var3);
      }

      try {
         var2.field6368 = 1 * var0.field6368;
         var2.field6370 = 1 * var0.field6370;
         if (-1357616065 * var0.field6368 < -1357616065 * var1.field6368) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6370 = var2.field6370 - (322174343 * var1.field6368 - var0.field6368 * 322174343);
            var2.field6368 = var1.field6368 * 1;
         }

         if (method11502(var2, -1457796265) > method11502(var1, -1420172466)) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6370 = var2.field6370 - (method11502(var2, 1950203802) - method11502(var1, -939064607)) * 53296313;
         }

         if (518523273 * var2.field6370 < 0) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6370 = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   int method11500() {
      return this.field6369 * 1185120648;
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;)V")
   @ObfuscatedName("bn")
   void method11492(classUQ var1, classUQ var2) {
      var2.field6369 = this.field6369 * 1;
      var2.field6371 = 1 * this.field6371;
      if (this.field6369 * -876323386 < 926655743 * var1.field6369) {
         var2.field6371 = var2.field6371 - (-292463807 * var1.field6369 - 887209320 * this.field6369);
         var2.field6369 = 1 * var1.field6369;
      }

      if (var2.method11507((byte)13) > var1.method11507((byte)13)) {
         var2.field6371 = var2.field6371 - (var2.method11507((byte)13) - var1.method11507((byte)13)) * -854582458;
      }

      if (var2.field6371 * -874893249 < 0) {
         var2.field6371 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   int method11495() {
      return -1357616065 * this.field6368;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   int method11496() {
      return -1357616065 * this.field6368;
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;)V")
   @ObfuscatedName("ah")
   public void method11486(classUQ var1, classUQ var2) {
      method11488(this, var1, var2, 1524499044);
      this.method11493(var1, var2, 1310715767);
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;I)V")
   @ObfuscatedName("aa")
   void method11493(classUQ var1, classUQ var2, int var3) {
      try {
         var2.field6369 = this.field6369 * 1;
         var2.field6371 = 1 * this.field6371;
         if (this.field6369 * 926655743 < 926655743 * var1.field6369) {
            var2.field6371 = var2.field6371 - (-292463807 * var1.field6369 - -292463807 * this.field6369);
            var2.field6369 = 1 * var1.field6369;
         }

         if (var2.method11507((byte)13) > var1.method11507((byte)13)) {
            if (var3 <= 991773057) {
               throw new IllegalStateException();
            }

            var2.field6371 = var2.field6371 - (var2.method11507((byte)13) - var1.method11507((byte)13)) * -1811300417;
         }

         if (var2.field6371 * -874893249 < 0) {
            if (var3 <= 991773057) {
               throw new IllegalStateException();
            }

            var2.field6371 = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;)V")
   @ObfuscatedName("di")
   public static void method11468(classUQ var0) {
      if (var0 == null) {
         var0.method11506();
      }

      synchronized (field6367) {
         if (-489960421 * field6365 < -1757679067 * field6366) {
            field6367[(field6365 += -1849086445) * 1118794428 - 1] = var0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;I)I")
   @ObfuscatedName("nj")
   public static int method11497(classUQ var0, int var1) {
      if (var0 == null) {
         var0.method11498(var1);
      }

      try {
         return -1357616065 * var0.field6368;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   int method11503() {
      return this.field6368 * -928697489 + 518523273 * this.field6370;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   int method11504() {
      return this.field6368 * -1357616065 + 518523273 * this.field6370;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method11469() {
      synchronized (field6367) {
         if (1738857155 * field6365 < -1772653823 * field6366) {
            field6367[(field6365 += -1849086445) * -678971468 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   int method11509() {
      return -874893249 * this.field6371 + 926655743 * this.field6369;
   }

   @ObfuscatedSignature(descriptor = "(Luq;)Z")
   @ObfuscatedName("at")
   public boolean method11483(classUQ var1) {
      return this.field6368 * -1357616065 <= method11502(var1, -382763466)
         && method11497(var1, 1940515483) <= method11502(this, -1153757463)
         && 926655743 * this.field6369 <= var1.method11507((byte)13)
         && var1.method11499((byte)-70) <= this.method11507((byte)13);
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)Lzs;")
   @ObfuscatedName("az")
   public static classZS method11465(Widget var0, int var1) {
      try {
         classZS var3 = new classZS();
         var3.field7259 = var0;
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luq;Luq;I)V")
   @ObfuscatedName("ac")
   void method11489(classUQ var1, classUQ var2, int var3) {
      try {
         var2.field6369 = 1 * this.field6371;
         var2.field6370 = 1 * this.field6368;
         if (-1357616065 * this.field6368 < -1357616065 * var1.field6370) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6371 = var2.field6369 - (322174343 * var1.field6371 - this.field6369 * 322174343);
            var2.field6371 = var1.field6370 * 1;
         }

         if (method11502(var2, -1457796265) > method11502(var1, -1420172466)) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6370 = var2.field6368 - (method11502(var2, 1950203802) - method11502(var1, -939064607)) * 53296313;
         }

         if (518523273 * var2.field6369 < 0) {
            if (var3 <= 185502585) {
               throw new IllegalStateException();
            }

            var2.field6368 = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method11505(int var1) {
      try {
         return this.field6368 * -1357616065 + 518523273 * this.field6371;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method11498(int var1) {
      try {
         return -1357616065 * this.field6370;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uq.ao(" + 41);
      }
   }
}
