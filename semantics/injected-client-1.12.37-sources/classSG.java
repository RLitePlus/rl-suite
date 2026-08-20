import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sg")
public class classSG {
   @ObfuscatedSignature(descriptor = "[Luu;")
   @ObfuscatedName("as")
   classUU[] field5926;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("aa")
   classUU field5930;
   @ObfuscatedSignature(descriptor = "Lsg;")
   @ObfuscatedName("ae")
   public classSG field5929;
   @ObfuscatedName("ab")
   boolean field5923;
   @ObfuscatedName("ux")
   public int field5928;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("ao")
   classUU field5932;
   @ObfuscatedName("ag")
   boolean field5922;
   @ObfuscatedSignature(descriptor = "[Luu;")
   @ObfuscatedName("ax")
   classUU[] field5927;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("ac")
   classUU field5931;
   @ObfuscatedName("az")
   public final int field5924;
   @ObfuscatedSignature(descriptor = "[Luu;")
   @ObfuscatedName("af")
   final classUU[] field5925;
   @ObfuscatedName("ay")
   float[][] field5935;
   @ObfuscatedName("al")
   float[][] field5934;
   @ObfuscatedName("aj")
   float[][] field5933;

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("lr")
   public float[] method10425(int var1) {
      return method10414(this, var1, -16766288);
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bk")
   float[] method10413(int var1) {
      return this.field5933[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;I)Luu;")
   @ObfuscatedName("uu")
   public classUU method10420(rl21 var1, int var2) {
      rl2 var3 = var1.field5722[this.field5928];
      if (var3.field5719) {
         var3.field5718.method11649(this.method10427(var2));
         var3.field5718.method11652(this.method10418(var1));
         var3.field5719 = false;
      }

      return var3.field5718;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void method10381(byte var1) {
      try {
         this.field5935 = new float[this.field5925.length][3];
         this.field5934 = new float[this.field5925.length][3];
         this.field5933 = new float[this.field5925.length][3];
         classUU var2 = classRM.method10129(1778071523);

         for (int var3 = 0; var3 < this.field5925.length; var3++) {
            classUU var4 = this.method10384(var3, (byte)10);
            rl23.method10067(var2, var4, (byte)-47);
            var2.method11609(-56392464);
            this.field5935[var3] = var2.method11570(966942861);
            this.field5934[var3][0] = var4.field6400;
            this.field5934[var3][1] = var4.field6399;
            this.field5934[var3][2] = var4.field6395;
            this.field5933[var3] = var4.method11636(986444461);
         }

         var2.method11555(1707831254);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "sg.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Luu;")
   @ObfuscatedName("af")
   classUU method10384(int var1, byte var2) {
      try {
         return this.field5925[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Luu;")
   @ObfuscatedName("ae")
   classUU method10424(int var1, int var2) {
      if (this.field5926[var1] == null) {
         classUU var3 = this.method10428(var1);
         if (this.field5929 != null) {
            var3 = new classUU(var3);
            var3.method11652(this.field5929.method10429(var1));
         }

         this.field5926[var1] = var3;
      }

      return this.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("aq")
   classUU method10385(int var1) {
      return this.field5925[var1];
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("tx")
   public void method10426(classUU var1) {
      this.method10397(var1, 1262310232);
   }

   @ObfuscatedSignature(descriptor = "(Luu;I)V")
   @ObfuscatedName("as")
   void method10397(classUU var1, int var2) {
      try {
         rl23.method10067(this.field5931, var1, (byte)7);
         this.field5923 = true;
         this.field5922 = true;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("aw")
   classUU method10388(int var1) {
      if (this.field5926[var1] == null) {
         classUU var2 = this.method10384(var1, (byte)52);
         if (this.field5929 != null) {
            var2 = new classUU(var2);
            classUU.method11594(var2, this.field5929.method10424(var1, -1226312150), -479714307);
         }

         this.field5926[var1] = var2;
      }

      return this.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "(II)Luu;")
   @ObfuscatedName("ac")
   public classUU method10403(int var1, int var2) {
      try {
         if (this.field5922) {
            if (var2 != 131168747) {
               throw new IllegalStateException();
            }

            rl23.method10067(this.field5932, this.method10422(var1, (byte)-3), (byte)-94);
            classUU.method11594(this.field5932, this.method10399(-1065936393), -204408522);
            this.field5922 = false;
         }

         return this.field5932;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bu")
   float[] method10405(int var1) {
      return this.field5935[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("gt")
   public classUU method10427(int var1) {
      return this.method10422(var1, (byte)-3);
   }

   @ObfuscatedSignature(descriptor = "(Lsg;II)[F")
   @ObfuscatedName("ot")
   public static float[] method10414(classSG var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10412(var1, var1);
      }

      try {
         return var0.field5933[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method10382() {
      this.field5935 = new float[this.field5925.length][3];
      this.field5934 = new float[this.field5925.length][3];
      this.field5933 = new float[this.field5925.length][3];
      classUU var1 = classRM.method10129(1778071523);

      for (int var2 = 0; var2 < this.field5925.length; var2++) {
         classUU var3 = this.method10384(var2, (byte)90);
         rl23.method10067(var1, var3, (byte)-27);
         var1.method11609(-1298350421);
         this.field5935[var2] = var1.method11570(1615612734);
         this.field5934[var2][0] = var3.field6400;
         this.field5934[var2][1] = var3.field6399;
         this.field5934[var2][2] = var3.field6395;
         this.field5933[var2] = var3.method11636(986444461);
      }

      var1.method11555(1961003628);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yr")
   public void method10421(int var1) {
      this.field5925[var1] = null;
      this.field5926 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("av")
   classUU method10393(int var1) {
      if (null == this.field5927[var1]) {
         this.field5927[var1] = new classUU(this.method10424(var1, -1630528307));
         this.field5927[var1].method11609(-575747350);
      }

      return this.field5927[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ad")
   classUU method10386(int var1) {
      return this.field5925[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ak")
   classUU method10389(int var1) {
      if (this.field5926[var1] == null) {
         classUU var2 = this.method10384(var1, (byte)88);
         if (this.field5929 != null) {
            var2 = new classUU(var2);
            classUU.method11594(var2, this.field5929.method10424(var1, 884608822), 1084677221);
         }

         this.field5926[var1] = var2;
      }

      return this.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("au")
   classUU method10390(int var1) {
      if (this.field5926[var1] == null) {
         classUU var2 = this.method10384(var1, (byte)87);
         if (this.field5929 != null) {
            var2 = new classUU(var2);
            classUU.method11594(var2, this.field5929.method10424(var1, 413405924), -1208372749);
         }

         this.field5926[var1] = var2;
      }

      return this.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ai")
   classUU method10391(int var1) {
      if (this.field5926[var1] == null) {
         classUU var2 = this.method10384(var1, (byte)111);
         if (this.field5929 != null) {
            var2 = new classUU(var2);
            classUU.method11594(var2, this.field5929.method10424(var1, 585432322), -1742291172);
         }

         this.field5926[var1] = var2;
      }

      return this.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method10383() {
      this.field5935 = new float[this.field5925.length][3];
      this.field5934 = new float[this.field5925.length][3];
      this.field5933 = new float[this.field5925.length][3];
      classUU var1 = classRM.method10129(1778071523);

      for (int var2 = 0; var2 < this.field5925.length; var2++) {
         classUU var3 = this.method10384(var2, (byte)49);
         rl23.method10067(var1, var3, (byte)104);
         var1.method11609(-1455755593);
         this.field5935[var2] = var1.method11570(-1493867438);
         this.field5934[var2][0] = var3.field6400;
         this.field5934[var2][1] = var3.field6399;
         this.field5934[var2][2] = var3.field6395;
         this.field5933[var2] = var3.method11636(986444461);
      }

      var1.method11555(1543161437);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsg;I)Luu;")
   @ObfuscatedName("sc")
   public static classUU method10392(classSG var0, int var1) {
      if (var0.field5926[var1] == null) {
         classUU var2 = var0.method10384(var1, (byte)72);
         if (var0.field5929 != null) {
            var2 = new classUU(var2);
            classUU.method11594(var2, var0.field5929.method10424(var1, -1652078851), -717763018);
         }

         var0.field5926[var1] = var2;
      }

      return var0.field5926[var1];
   }

   @ObfuscatedSignature(descriptor = "(IB)Luu;")
   @ObfuscatedName("ab")
   classUU method10422(int var1, byte var2) {
      if (this.field5927[var1] == null) {
         classUU var3 = new classUU(this.method10429(var1));
         var3.method11653();
         this.field5927[var1] = var3;
      }

      return this.field5927[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("at")
   classUU method10394(int var1) {
      if (null == this.field5927[var1]) {
         this.field5927[var1] = new classUU(this.method10424(var1, -1635901835));
         this.field5927[var1].method11609(-1314355848);
      }

      return this.field5927[var1];
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("an")
   public classUU method10395() {
      return this.field5931;
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("am")
   public classUU method10396() {
      return this.field5931;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("ah")
   void method10398(classUU var1) {
      rl23.method10067(this.field5931, var1, (byte)74);
      this.field5923 = true;
      this.field5922 = true;
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;)Luu;")
   @ObfuscatedName("bv")
   public classUU method10418(rl21 var1) {
      rl2 var2 = var1.field5722[this.field5928];
      if (var2.field5720) {
         var2.field5717.method11649(var2.field5716);
         if (this.field5929 != null) {
            var2.field5717.method11652(this.field5929.method10418(var1));
         }

         var2.field5720 = false;
      }

      return var2.field5717;
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("bk")
   public classUU method10428(int var1) {
      return this.method10384(var1, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("zy")
   public classUU method10429(int var1) {
      return this.method10424(var1, 55397094);
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ax")
   classUU method10399(int var1) {
      try {
         if (this.field5923) {
            if (var1 == 1870919123) {
               throw new IllegalStateException();
            }

            rl23.method10067(this.field5930, classMN.method7625(this, -2034392768), (byte)4);
            if (null != this.field5929) {
               if (var1 == 1870919123) {
                  throw new IllegalStateException();
               }

               classUU.method11594(this.field5930, this.field5929.method10399(-304311430), -365415784);
            }

            this.field5923 = false;
         }

         return this.field5930;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "sg.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("bx")
   classUU method10400() {
      if (this.field5923) {
         rl23.method10067(this.field5930, classMN.method7625(this, -2133598912), (byte)22);
         if (null != this.field5929) {
            classUU.method11594(this.field5930, this.field5929.method10399(404339773), -388573751);
         }

         this.field5923 = false;
      }

      return this.field5930;
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("bn")
   classUU method10401() {
      if (this.field5923) {
         rl23.method10067(this.field5930, classMN.method7625(this, -2057048639), (byte)-88);
         if (null != this.field5929) {
            classUU.method11594(this.field5930, this.field5929.method10399(-1520100119), 584151555);
         }

         this.field5923 = false;
      }

      return this.field5930;
   }

   @ObfuscatedSignature(descriptor = "(Lsg;II)[F")
   @ObfuscatedName("zg")
   public static float[] method10406(classSG var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method10411(var1, var1);
      } else {
         try {
            return var0.field5935[var1];
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "sg.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Luu;")
   @ObfuscatedName("bc")
   classUU method10402() {
      if (this.field5923) {
         rl23.method10067(this.field5930, classMN.method7625(this, -1960989982), (byte)49);
         if (null != this.field5929) {
            classUU.method11594(this.field5930, this.field5929.method10399(-1483142212), -1173551112);
         }

         this.field5923 = false;
      }

      return this.field5930;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrs;Lrs;)I")
   @ObfuscatedName("mb")
   public static int method10380(Ignored var0, Ignored var1) {
      return -847650061 * var0.field5836 - var1.field5836 * -847650061;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bm")
   float[] method10407(int var1) {
      return this.field5935[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ap")
   classUU method10387(int var1) {
      return this.field5925[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("br")
   float[] method10408(int var1) {
      return this.field5934[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("qk")
   public float[] method10430(int var1) {
      return this.method10410(var1, -316051969);
   }

   public classSG(int var1, Buffer var2, boolean var3) {
      this.field5923 = this.field5922 = true;
      this.field5924 = var2.method13259() * 172778659;
      this.field5925 = new classUU[var1];
      this.field5926 = new classUU[var1];
      this.field5927 = new classUU[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         this.field5925[var4] = new classUU(var2, var3);
         var2.method13265();
         var2.method13265();
         var2.method13265();
      }

      this.method10432();
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("sp")
   public float[] method10431(int var1) {
      return method10406(this, var1, -2034173247);
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bo")
   float[] method10409(int var1) {
      return this.field5934[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bt")
   float[] method10415(int var1) {
      return this.field5933[var1];
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("aa")
   float[] method10410(int var1, int var2) {
      try {
         return this.field5934[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;IIB)V")
   @ObfuscatedName("al")
   public static void method10417(classTE var0, int var1, int var2, byte var3) {
      try {
         classOL.method8512(var0, 1327640383);
         if (var1 >= 0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (var1 < var0.method10756(-1023280051)) {
                  if (var3 >= 0) {
                     return;
                  }

                  if (var2 < var0.method10756(-767501679)) {
                     if (var2 != var1) {
                        if (var3 >= 0) {
                           return;
                        }

                        if (var0.field6128 == classYY.field7111) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           int[] var4 = var0.method10748(1384288442);
                           int var5 = var4[var1];
                           var4[var1] = var4[var2];
                           var4[var2] = var5;
                        } else if (classYY.field7115 == var0.field6128) {
                           long[] var8 = var0.method10750(-1063134522);
                           long var10 = var8[var1];
                           var8[var1] = var8[var2];
                           var8[var2] = var10;
                        } else {
                           Object[] var9 = classTE.method10753(var0, 246853485);
                           Object var11 = var9[var1];
                           var9[var1] = var9[var2];
                           var9[var2] = var11;
                        }

                        var0.field6133 = true;
                     }

                     return;
                  }

                  if (var3 >= 0) {
                     return;
                  }
               }
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "sg.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsg;I)Luu;")
   @ObfuscatedName("rj")
   public static classUU method10404(classSG var0, int var1) {
      if (var0.field5922) {
         rl23.method10067(var0.field5932, var0.method10422(var1, (byte)-63), (byte)29);
         classUU.method11594(var0.field5932, var0.method10399(-1819297163), -2078213200);
         var0.field5922 = false;
      }

      return var0.field5932;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIII)Z")
   @ObfuscatedName("ci")
   static boolean method10419(WorldView var0, int var1, int var2, int var3, int var4) {
      try {
         if (var1 < 3) {
            if (var4 <= 718661024) {
               throw new IllegalStateException();
            }

            if (2 == (var0.field1702[1][var2][var3] & 2)) {
               if (var4 <= 718661024) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "sg.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luu;")
   @ObfuscatedName("ag")
   public classUU method10423(int var1) {
      rl2 var2 = rl21.field5728.field5722[this.field5928];
      return var2.field5717;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kx")
   public void method10432() {
      this.method10381((byte)-65);
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("al")
   float[] method10411(int var1, int var2) {
      try {
         return this.field5935[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("ao")
   float[] method10412(int var1, int var2) {
      try {
         return this.field5935[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sg.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bj")
   float[] method10416(int var1) {
      return this.field5935[var1];
   }
}
