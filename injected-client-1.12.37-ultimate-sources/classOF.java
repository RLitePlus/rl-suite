import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("of")
public class classOF extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field4858 = 78;
   @ObfuscatedName("an")
   final short[] field4846;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4853 = 40;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4855 = 41;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4854 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field4856 = 75;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4857 = 74;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("av")
   static classJZ field4852 = new classJZ(64);
   @ObfuscatedName("at")
   final int[] field4845;
   @ObfuscatedName("bx")
   final int[] field4850;
   @ObfuscatedName("bn")
   final short[] field4849;
   @ObfuscatedName("ah")
   final short[] field4848;
   @ObfuscatedName("bp")
   final int field4844;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4859 = 1;
   @ObfuscatedName("bc")
   public final boolean field4851;
   @ObfuscatedName("am")
   final short[] field4847;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field4860 = 38;

   classOF(classXY var1) {
      int[] var2 = null;
      short[] var3 = null;
      short[] var4 = null;
      short[] var5 = null;
      short[] var6 = null;
      int[] var7 = new int[]{-1, -1, -1, -1, -1};
      boolean var8 = false;
      int var9 = -1;
      if (null != var1 && null != var1.field6954) {
         while (true) {
            int var10 = classXY.method13039(var1, -346779531);
            if (0 == var10) {
               break;
            }

            switch (var10) {
               case 1:
                  var9 = classXY.method13039(var1, -346779531);
                  break;
               case 3:
                  var8 = true;
                  break;
               case 5:
                  int var14 = classXY.method13039(var1, -346779531);
                  var2 = new int[var14];

                  for (int var16 = 0; var16 < var14; var16++) {
                     var2[var16] = var1.method13117(classXM.field6888.field6890, 1793957453);
                  }
                  break;
               case 40:
                  int var13 = classXY.method13039(var1, -346779531);
                  var3 = new short[var13];
                  var4 = new short[var13];

                  for (int var15 = 0; var15 < var13; var15++) {
                     var3[var15] = (short)classXY.method13047(var1, -1391345931);
                     var4[var15] = (short)classXY.method13047(var1, -809343746);
                  }
                  break;
               case 41:
                  int var11 = classXY.method13039(var1, -346779531);
                  var5 = new short[var11];
                  var6 = new short[var11];

                  for (int var12 = 0; var12 < var11; var12++) {
                     var5[var12] = (short)classXY.method13047(var1, 601297684);
                     var6[var12] = (short)classXY.method13047(var1, -461039493);
                  }
                  break;
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
               case 77:
               case 78:
               case 79:
                  var7[var10 - 70] = var1.method13117(classXM.field6888.field6890, 2002691714);
            }
         }
      }

      this.field4845 = var2;
      this.field4846 = var3;
      this.field4847 = var4;
      this.field4848 = var5;
      this.field4849 = var6;
      this.field4850 = var7;
      this.field4851 = var8;
      this.field4844 = var9 * -1237098007;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public static int method8429() {
      return -1529735849 * classEY.field1983;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("ud")
   public static boolean method8408(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11170(var0.field6248 * 1369847981, var1, var2, var3, (byte)-68);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ae")
   public boolean method8412(int var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 >= -213633548) {
               throw new IllegalStateException();
            } else {
               boolean var5;
               if (var1 + 7 == -472152487 * this.field4844) {
                  if (var3 >= -213633548) {
                     throw new IllegalStateException();
                  }

                  var5 = true;
               } else {
                  var5 = false;
               }

               return var5;
            }
         } else {
            boolean var10000;
            if (-472152487 * this.field4844 == var1) {
               if (var3 >= -213633548) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "of.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean method8422(int var1) {
      try {
         boolean var2 = true;

         for (int var3 = 0; var3 < 5; var3++) {
            if (var1 >= 312604843) {
               throw new IllegalStateException();
            }

            if (-1 != this.field4850[var3]) {
               if (var1 >= 312604843) {
                  throw new IllegalStateException();
               }

               if (!classOX.field5192.method11871(this.field4850[var3], 0, (byte)-54)) {
                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "of.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ni")
   public static void method8411(classQI var0, String var1, String var2) {
      var0.field5548.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)Ler;")
   @ObfuscatedName("ax")
   public classER method8425(int var1) {
      try {
         classER[] var2 = new classER[5];
         int var3 = 0;

         for (int var4 = 0; var4 < 5; var4++) {
            if (var1 == 293773697) {
               throw new IllegalStateException();
            }

            if (-1 != this.field4850[var4]) {
               var2[var3++] = classER.method4047(classOX.field5192, this.field4850[var4], 0);
            }
         }

         classER var7 = new classER(var2, var3);
         if (this.field4846 != null) {
            if (var1 == 293773697) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < this.field4846.length; var5++) {
               var7.method4001(this.field4846[var5], this.field4847[var5]);
            }
         }

         if (null != this.field4848) {
            if (var1 == 293773697) {
               throw new IllegalStateException();
            }

            for (int var8 = 0; var8 < this.field4848.length; var8++) {
               if (var1 == 293773697) {
                  throw new IllegalStateException();
               }

               var7.method4004(this.field4848[var8], this.field4849[var8]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "of.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)Z")
   @ObfuscatedName("xk")
   public static boolean method8413(classOF var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8420();
      }

      return var2 == 1 ? var1 + 7 == -472152487 * var0.field4844 : -472152487 * var0.field4844 == var1;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("ai")
   public classER method8420() {
      if (this.field4845 == null) {
         return null;
      } else {
         classER[] var1 = new classER[this.field4845.length];

         for (int var2 = 0; var2 < this.field4845.length; var2++) {
            var1[var2] = classER.method4047(classOX.field5192, this.field4845[var2], 0);
         }

         classER var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new classER(var1, var1.length);
         }

         if (null != this.field4846) {
            for (int var3 = 0; var3 < this.field4846.length; var3++) {
               var4.method4001(this.field4846[var3], this.field4847[var3]);
            }
         }

         if (this.field4848 != null) {
            for (int var5 = 0; var5 < this.field4848.length; var5++) {
               var4.method4004(this.field4848[var5], this.field4849[var5]);
            }
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ao")
   public static classOF method8406(int var0) {
      classOF var1 = (classOF)field4852.method6422(var0);
      if (null != var1) {
         return var1;
      } else if (classLP.field4196 == null) {
         return null;
      } else {
         byte[] var2 = classLP.field4196.method11867(3, var0, -2099544452);
         var1 = new classOF(new classXY(var2));
         field4852.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)Z")
   @ObfuscatedName("jh")
   public static boolean method8414(classOF var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8425(var1);
      }

      return var2 == 1 ? var1 + 7 == 18219166 * var0.field4844 : -1247501727 * var0.field4844 == var1;
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)Z")
   @ObfuscatedName("ua")
   public static boolean method8417(classOF var0, byte var1) {
      if (var0 == null) {
         return var0.method8419(var1);
      } else {
         try {
            if (null == var0.field4845) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var2 = true;

               for (int var3 = 0; var3 < var0.field4845.length; var3++) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (!classOX.field5192.method11871(var0.field4845[var3], 0, (byte)43)) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     var2 = false;
                  }
               }

               return var2;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "of.ab(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Z")
   @ObfuscatedName("bc")
   public static boolean method8423(classOF var0) {
      if (var0 == null) {
         var0.method8420();
      }

      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != var0.field4850[var2] && !classOX.field5192.method11871(var0.field4850[var2], 0, (byte)-51)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)Z")
   @ObfuscatedName("qx")
   public static boolean method8415(classOF var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8425(var1);
      }

      return var2 == 1 ? var1 + 7 == -472152487 * var0.field4844 : -472152487 * var0.field4844 == var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method8409() {
      classJZ.method6431(field4852);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method8410() {
      classJZ.method6431(field4852);
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("at")
   public classER method8426() {
      classER[] var1 = new classER[5];
      int var2 = 0;

      for (int var3 = 0; var3 < 5; var3++) {
         if (-1 != this.field4850[var3]) {
            var1[var2++] = classER.method4047(classOX.field5192, this.field4850[var3], 0);
         }
      }

      classER var5 = new classER(var1, var2);
      if (this.field4846 != null) {
         for (int var4 = 0; var4 < this.field4846.length; var4++) {
            var5.method4001(this.field4846[var4], this.field4847[var4]);
         }
      }

      if (null != this.field4848) {
         for (int var6 = 0; var6 < this.field4848.length; var6++) {
            var5.method4004(this.field4848[var6], this.field4849[var6]);
         }
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Ler;")
   @ObfuscatedName("cs")
   public static classER method8427(classOF var0) {
      if (var0 == null) {
         return var0.method8426();
      } else {
         classER[] var1 = new classER[5];
         int var2 = 0;

         for (int var3 = 0; var3 < 5; var3++) {
            if (-1 != var0.field4850[var3]) {
               var1[var2++] = classER.method4047(classOX.field5192, var0.field4850[var3], 0);
            }
         }

         classER var5 = new classER(var1, var2);
         if (var0.field4846 != null) {
            for (int var4 = 0; var4 < var0.field4846.length; var4++) {
               var5.method4001(var0.field4846[var4], var0.field4847[var4]);
            }
         }

         if (null != var0.field4848) {
            for (int var6 = 0; var6 < var0.field4848.length; var6++) {
               var5.method4004(var0.field4848[var6], var0.field4849[var6]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ap")
   public boolean method8416(int var1, int var2) {
      return var2 == 1 ? var1 + 7 == -472152487 * this.field4844 : 962878288 * this.field4844 == var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public static int method8430() {
      return -1529735849 * classEY.field1983;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   public boolean method8424() {
      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != this.field4850[var2] && !classOX.field5192.method11871(this.field4850[var2], 0, (byte)-43)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ler;")
   @ObfuscatedName("av")
   public classER method8428() {
      classER[] var1 = new classER[5];
      int var2 = 0;

      for (int var3 = 0; var3 < 5; var3++) {
         if (-1 != this.field4850[var3]) {
            var1[var2++] = classER.method4047(classOX.field5192, this.field4850[var3], 0);
         }
      }

      classER var5 = new classER(var1, var2);
      if (this.field4846 != null) {
         for (int var4 = 0; var4 < this.field4846.length; var4++) {
            var5.method4001(this.field4846[var4], this.field4847[var4]);
         }
      }

      if (null != this.field4848) {
         for (int var6 = 0; var6 < this.field4848.length; var6++) {
            var5.method4004(this.field4848[var6], this.field4849[var6]);
         }
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)Ler;")
   @ObfuscatedName("ag")
   public classER method8421(int var1) {
      try {
         if (this.field4845 == null) {
            if (var1 == 1835499108) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classER[] var2 = new classER[this.field4845.length];

            for (int var3 = 0; var3 < this.field4845.length; var3++) {
               if (var1 == 1835499108) {
                  throw new IllegalStateException();
               }

               var2[var3] = classER.method4047(classOX.field5192, this.field4845[var3], 0);
            }

            classER var6;
            if (1 == var2.length) {
               if (var1 == 1835499108) {
                  throw new IllegalStateException();
               }

               var6 = var2[0];
            } else {
               var6 = new classER(var2, var2.length);
            }

            if (null != this.field4846) {
               if (var1 == 1835499108) {
                  throw new IllegalStateException();
               }

               for (int var4 = 0; var4 < this.field4846.length; var4++) {
                  if (var1 == 1835499108) {
                     throw new IllegalStateException();
                  }

                  var6.method4001(this.field4846[var4], this.field4847[var4]);
               }
            }

            if (this.field4848 != null) {
               if (var1 == 1835499108) {
                  throw new IllegalStateException();
               }

               for (int var7 = 0; var7 < this.field4848.length; var7++) {
                  if (var1 == 1835499108) {
                     throw new IllegalStateException();
                  }

                  var6.method4004(this.field4848[var7], this.field4849[var7]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "of.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("aa")
   public static classOF method8407(int var0) {
      classOF var1 = (classOF)field4852.method6422(var0);
      if (null != var1) {
         return var1;
      } else if (classLP.field4196 == null) {
         return null;
      } else {
         byte[] var2 = classLP.field4196.method11867(3, var0, -1536490744);
         var1 = new classOF(new classXY(var2));
         field4852.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public static int method8431() {
      return -1529735849 * classEY.field1983;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public static int method8432() {
      return -1529735849 * classEY.field1983;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   public static int method8433() {
      return -1284282331 * classEY.field1983;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Z")
   @ObfuscatedName("lu")
   public static boolean method8418(classOF var0) {
      if (var0 == null) {
         var0.method8426();
      }

      if (null == var0.field4845) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < var0.field4845.length; var2++) {
            if (!classOX.field5192.method11871(var0.field4845[var2], 0, (byte)43)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   static void method8405(int var0) {
      try {
         classVR.field6555[0] = 0;

         for (short var1 = 0; var1 < 2048; var1 += 128) {
            int var2 = classMO.method7627(var1, (byte)1);
            short var3 = 0;
            if (var1 > 0) {
               if (var0 <= -148653043) {
                  throw new IllegalStateException();
               }

               if (var1 < 1024) {
                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }

                  var3 |= 272;
               }
            }

            if (var1 > 512) {
               if (var0 <= -148653043) {
                  throw new IllegalStateException();
               }

               if (var1 < 1536) {
                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }

                  var3 |= 1088;
               }
            }

            if (var1 > 1024) {
               if (var0 <= -148653043) {
                  throw new IllegalStateException();
               }

               var3 |= 544;
            }

            label95: {
               if (var1 <= 1536) {
                  if (var1 >= 512) {
                     break label95;
                  }

                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }
               }

               var3 |= 2176;
            }

            label89: {
               if (var1 != 0) {
                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }

                  if (1024 != var1) {
                     break label89;
                  }

                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }
               }

               var3 |= 48;
            }

            label82: {
               if (512 != var1) {
                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }

                  if (1536 != var1) {
                     break label82;
                  }

                  if (var0 <= -148653043) {
                     throw new IllegalStateException();
                  }
               }

               var3 |= 1152;
            }

            classVR.field6555[var2] = var3;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "of.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Lxz;II)Lxz;")
   @ObfuscatedName("az")
   public static classXZ method8404(classXZ[] var0, int var1, int var2) {
      try {
         classXZ[] var3 = var0;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var2 == -172824696) {
               throw new IllegalStateException();
            }

            classXZ var5 = var3[var4];
            if (var1 == var5.vmethod8((byte)1)) {
               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "of.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ab")
   public boolean method8419(byte var1) {
      try {
         if (null == this.field4850) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field4845.length; var3++) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               if (!classOX.field5192.method11871(this.field4850[var3], 0, (byte)43)) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "of.ab(" + ')');
      }
   }
}
