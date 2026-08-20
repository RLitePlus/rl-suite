import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hj")
public class classHJ implements classHM {
   @ObfuscatedName("az")
   int field2814;
   @ObfuscatedName("af")
   int field2810;
   @ObfuscatedName("ae")
   int field2809;
   @ObfuscatedName("ab")
   int field2807;
   @ObfuscatedName("ag")
   int field2811;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field2812 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2808 = 8;
   @ObfuscatedName("as")
   int field2813;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method6059(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "hj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod469(classHG var1, int var2) {
      try {
         if (var1.field2789 * -1293823145 > 607893793 * this.field2811) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2789 = 350307399 * this.field2811;
         }

         if (var1.field2792 * 1597382741 < 607893793 * this.field2811) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2792 = -745320035 * this.field2811;
         }

         if (var1.field2790 * 1546846349 > 1604434943 * this.field2813) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2790 = 2120280507 * this.field2813;
         }

         if (252768043 * var1.field2791 < this.field2813 * 1604434943) {
            var1.field2791 = -629351299 * this.field2813;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod472(int var1, int var2, int var3, int var4) {
      try {
         if (var1 >= this.field2814 * 1007646335) {
            if (var4 >= -651641119) {
               throw new IllegalStateException();
            }

            if (var1 < 1007646335 * this.field2814 + 1572456705 * this.field2810) {
               boolean var10000;
               if (-577470257 * this.field2809 == var2 >> 6 && 1641555335 * this.field2807 == var3 >> 6) {
                  if (var4 >= -651641119) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }

            if (var4 >= -651641119) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hj.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod476(int var1, int var2, byte var3) {
      try {
         if (this.field2811 * 607893793 == var1 >> 6) {
            if (var3 != 60) {
               throw new IllegalStateException();
            }

            if (var2 >> 6 == 1604434943 * this.field2813) {
               if (var3 != 60) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod475(int var1, int var2) {
      return this.field2811 * 486173645 == var1 >> 6 && var2 >> 6 == 1605296845 * this.field2813;
   }

   @ObfuscatedSignature(descriptor = "(III)Lky;")
   @ObfuscatedName("ag")
   @Override
   public classKY vmethod480(int var1, int var2, int var3) {
      try {
         if (!this.vmethod476(var1, var2, (byte)60)) {
            if (var3 != 2141092142) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = this.field2809 * 1696609216 - this.field2811 * 250497088 + var1;
            int var5 = this.field2807 * 1980326336 - this.field2813 * -395378752 + var2;
            return new classKY(this.field2814 * 1007646335, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hj.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)I")
   @ObfuscatedName("ac")
   public static int method6062(classQZ var0) {
      if (var0 == null) {
         var0.method9927();
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("as")
   @Override
   public void vmethod484(classXY var1, int var2) {
      try {
         this.field2814 = classXY.method13039(var1, -346779531) * 1400260991;
         this.field2810 = classXY.method13039(var1, -346779531) * -1458096383;
         this.field2809 = classXY.method13047(var1, 1325494905) * 2024834607;
         this.field2807 = classXY.method13047(var1, 1501800655) * 200052791;
         this.field2811 = classXY.method13047(var1, -2007941386) * -1771631903;
         this.field2813 = classXY.method13047(var1, 782877627) * -565296129;
         this.method6059(-1433152232);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hj.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;I)Lop;")
   @ObfuscatedName("dj")
   public static classOP method6063(Player var0, int var1) {
      if (var0 == null) {
         var0.method2655(var1, var1);
      }

      return classOB.method8299(var1 - 2048, (byte)30);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ad")
   @Override
   public void vmethod485(classXY var1) {
      this.field2814 = classXY.method13039(var1, -346779531) * 1400260991;
      this.field2810 = classXY.method13039(var1, -346779531) * -1458096383;
      this.field2809 = classXY.method13047(var1, -1410019451) * 2024834607;
      this.field2807 = classXY.method13047(var1, -1803105477) * 200052791;
      this.field2811 = classXY.method13047(var1, 1787004792) * -1771631903;
      this.field2813 = classXY.method13047(var1, -799777673) * -565296129;
      this.method6059(-1433152232);
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod470(classHG var1) {
      if (var1.field2789 * -1293823145 > 607893793 * this.field2811) {
         var1.field2789 = 350307399 * this.field2811;
      }

      if (var1.field2792 * 1597382741 < 607893793 * this.field2811) {
         var1.field2792 = -745320035 * this.field2811;
      }

      if (var1.field2790 * 1546846349 > 1604434943 * this.field2813) {
         var1.field2790 = 2120280507 * this.field2813;
      }

      if (252768043 * var1.field2791 < this.field2813 * 1604434943) {
         var1.field2791 = -629351299 * this.field2813;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("al")
   @Override
   public boolean vmethod474(int var1, int var2, int var3) {
      return var1 >= this.field2814 * 90535482 && var1 < -516961450 * this.field2814 + 1572456705 * this.field2810
         ? -577470257 * this.field2809 == var2 >> 6 && -124727207 * this.field2807 == var3 >> 6
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ao")
   @Override
   public boolean vmethod473(int var1, int var2, int var3) {
      return var1 >= this.field2814 * 1007646335 && var1 < 1007646335 * this.field2814 + 1572456705 * this.field2810
         ? -577470257 * this.field2809 == var2 >> 6 && 1641555335 * this.field2807 == var3 >> 6
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lym;I)V")
   @ObfuscatedName("jt")
   public static void method6064(SpritePixels var0, int var1) {
      if (var0 == null) {
         var0.method13490(var1);
      } else {
         for (int var2 = var0.field7009 - 1; var2 > 0; var2--) {
            int var3 = var2 * var0.field7007;

            for (int var4 = var0.field7007 - 1; var4 > 0; var4--) {
               if (var0.field7005[var4 + var3] == 0 && var0.field7005[var4 + var3 - 1 - var0.field7007] != 0) {
                  var0.field7005[var4 + var3] = var1;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod477(int var1, int var2) {
      return this.field2811 * 1681684141 == var1 >> 6 && var2 >> 6 == 1604434943 * this.field2813;
   }

   classHJ() {
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("aq")
   @Override
   public int[] vmethod479(int var1, int var2, int var3) {
      return !this.vmethod472(var1, var2, var3, -1782764609)
         ? null
         : new int[]{var2 + (this.field2811 * 250497088 - -852401401 * this.field2809), 864977121 * this.field2813 - 1980326336 * this.field2807 + var3};
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod471(classHG var1) {
      if (var1.field2789 * -1293823145 > 607893793 * this.field2811) {
         var1.field2789 = 350307399 * this.field2811;
      }

      if (var1.field2792 * 1597382741 < 607893793 * this.field2811) {
         var1.field2792 = -745320035 * this.field2811;
      }

      if (var1.field2790 * 1546846349 > 1604434943 * this.field2813) {
         var1.field2790 = 2120280507 * this.field2813;
      }

      if (252768043 * var1.field2791 < this.field2813 * 1604434943) {
         var1.field2791 = -629351299 * this.field2813;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ar")
   @Override
   public classKY vmethod482(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2809 * 1696609216 - this.field2811 * -1288736885 + var1;
         int var4 = this.field2807 * 1980326336 - this.field2813 * -126069521 + var2;
         return new classKY(this.field2814 * -644402437, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("aw")
   @Override
   public classKY vmethod483(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2809 * 1696609216 - this.field2811 * 250497088 + var1;
         int var4 = this.field2807 * 1980326336 - this.field2813 * -395378752 + var2;
         return new classKY(this.field2814 * 1007646335, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ak")
   @Override
   public classKY vmethod481(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2809 * 1696609216 - this.field2811 * -1367721173 + var1;
         int var4 = this.field2807 * -2124865884 - this.field2813 * 206720430 + var2;
         return new classKY(this.field2814 * 1007646335, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method6060() {
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod478(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.vmethod472(var1, var2, var3, -2067541473)) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return new int[]{
               var2 + (this.field2811 * 250497088 - 1696609216 * this.field2809), -395378752 * this.field2813 - 1980326336 * this.field2807 + var3
            };
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method6061() {
   }
}
