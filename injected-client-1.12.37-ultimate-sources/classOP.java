import java.util.Arrays;
import net.runelite.api.ItemComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.api.events.PostItemComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("op")
public class classOP extends classVJ implements ItemComposition, rl9 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field5072 = 35;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5071 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5068 = 5;
   @ObfuscatedName("fj")
   public final int field5013;
   @ObfuscatedName("fl")
   final int field5052;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field5028 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field5053 = 15;
   @ObfuscatedName("ej")
   public final int field5010;
   @rl8(method10126 = 16)
   @ObfuscatedName("dl")
   short[] field5022;
   @ToRemove(unused = "true")
   @ObfuscatedName("cd")
   static final int field5076 = 113;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("dk")
   static classJZ field5006 = new classJZ(64);
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("db")
   static classJZ field5007 = new classJZ(50);
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5074 = 36;
   @ObfuscatedName("de")
   final int field5014;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5070 = 3;
   @ObfuscatedName("er")
   public final int field5058;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5075 = 2;
   @rl8(method10126 = 16)
   @ObfuscatedName("do")
   short[] field5040;
   @ObfuscatedName("em")
   public final int field5030;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5069 = 9;
   @rl8(method10126 = 16)
   @ObfuscatedName("dq")
   short[] field5017;
   @ObfuscatedName("df")
   public int field5034;
   @ObfuscatedName("ev")
   public final boolean field5016;
   @ObfuscatedName("dj")
   public int field5036;
   @ObfuscatedName("da")
   public int field5054;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5073 = 37;
   @ObfuscatedName("eu")
   final int field5027;
   @ObfuscatedName("ea")
   public final int field5055;
   @ObfuscatedName("ek")
   public final int field5043;
   @ObfuscatedName("es")
   public final int field5044;
   @ObfuscatedName("dn")
   String field5042;
   @ObfuscatedName("fi")
   final int field5045;
   @ObfuscatedName("dp")
   public int field5038;
   @ObfuscatedSignature(descriptor = "Lpo;")
   @ObfuscatedName("el")
   final classPO field5048;
   @ObfuscatedName("dv")
   public final String field5033;
   @ObfuscatedName("ed")
   public final int field5021;
   @ObfuscatedName("en")
   public final int field5049;
   @ObfuscatedName("ex")
   final int[] field5056;
   @ObfuscatedName("cl")
   public int field5009 = -2;
   @ObfuscatedName("eh")
   public final String[] field5025;
   @ObfuscatedName("eg")
   public final String[][] field5050;
   @ObfuscatedName("eo")
   public final int field5051;
   @ObfuscatedName("et")
   final int field5023;
   @ObfuscatedName("ew")
   final int field5059;
   @rl8(method10126 = 16)
   @ObfuscatedName("dg")
   short[] field5041;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("dw")
   public static classJZ field5008 = new classJZ(200);
   @ObfuscatedName("eq")
   final int[] field5057;
   @ObfuscatedName("ez")
   public final int field5047;
   @ObfuscatedName("sq")
   public String field5077;
   @ObfuscatedName("ei")
   public final int field5011;
   @rl8(method10126 = 16)
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ee")
   classYN field5032;
   @ObfuscatedName("eb")
   boolean field5061;
   @ObfuscatedName("ep")
   public final boolean field5062;
   @ObfuscatedName("ec")
   public final boolean field5063;
   @ObfuscatedName("fo")
   final int field5064;
   @ObfuscatedName("ds")
   public int field5035;
   @ObfuscatedName("dz")
   int field5037;
   @ObfuscatedName("fd")
   public final int field5065;
   @ObfuscatedName("fy")
   final int field5024;
   @ObfuscatedName("fg")
   final int field5031;
   @ObfuscatedName("ey")
   public int field5039;
   @ObfuscatedName("fb")
   final int field5066;
   @ObfuscatedName("fu")
   final int field5018;
   @ObfuscatedName("fz")
   final int field5019;
   @ObfuscatedName("fh")
   final int field5067;
   @ObfuscatedName("fq")
   final int field5012;
   @ObfuscatedName("fp")
   final int field5026;
   @ObfuscatedName("fs")
   final int field5029;
   @ObfuscatedName("fv")
   final int field5046;
   @ObfuscatedName("fn")
   final int field5015;
   @ObfuscatedName("fk")
   final int field5020;
   @ObfuscatedName("ef")
   public final int field5060;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hc")
   static classVP field5078;

   public int getPlaceholderTemplateId() {
      return this.field5065 * -2023616411;
   }

   @ObfuscatedSignature(descriptor = "(Ler;Lpi;)V")
   @ObfuscatedName("cn")
   void method8684(classER var1, classPI var2) {
      if (this.field5040 != null) {
         short[] var3 = this.field5040;
         short[] var4 = this.field5041;
         if (var2 != null && var2.field5261 != null && this.field5041.length == var2.field5261.length) {
            var4 = var2.field5261;
         }

         for (int var5 = 0; var5 < this.field5040.length; var5++) {
            var1.method4001(var3[var5], var4[var5]);
         }
      }

      if (null != this.field5022) {
         short[] var6 = this.field5022;
         short[] var7 = this.field5017;
         if (var2 != null && var2.field5260 != null && this.field5017.length == var2.field5260.length) {
            var7 = var2.field5260;
         }

         for (int var8 = 0; var8 < this.field5022.length; var8++) {
            var1.method4004(var6[var8], var7[var8]);
         }
      }
   }

   public int getNote() {
      return this.field5051 * 1236138331;
   }

   @ObfuscatedSignature(descriptor = "(II)Lfx;")
   @ObfuscatedName("aa")
   public final classFX method8657(int var1, int var2) {
      try {
         if (null != this.field5056) {
            if (var2 >= 1213519585) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 >= 1213519585) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for (int var4 = 0; var4 < 10; var4++) {
                  if (var2 >= 1213519585) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= this.field5057[var4]) {
                     if (var2 >= 1213519585) {
                        throw new IllegalStateException();
                     }

                     if (this.field5057[var4] != 0) {
                        var3 = this.field5056[var4];
                     }
                  }
               }

               if (-1 != var3) {
                  if (var2 >= 1213519585) {
                     throw new IllegalStateException();
                  }

                  return classOB.method8299(var3, (byte)26).method8657(1, 557403969);
               }
            }
         }

         classFX var6 = (classFX)field5007.method6422(501443835 * this.field5014);
         if (null != var6) {
            if (var2 >= 1213519585) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            classER var8 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
            if (var8 == null) {
               if (var2 >= 1213519585) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label77: {
                  if (128 == this.field5023 * -1567835707 && 128 == -1367777757 * this.field5059) {
                     if (var2 >= 1213519585) {
                        throw new IllegalStateException();
                     }

                     if (this.field5027 * 58165945 == 128) {
                        break label77;
                     }

                     if (var2 >= 1213519585) {
                        throw new IllegalStateException();
                     }
                  }

                  var8.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
               }

               this.method8686(var8, null, 1041866684);
               var6 = var8.method4045(64 + 1845819663 * this.field5060, 768 + -1636300529 * this.field5030, -50, -10, -50);
               var6.field2421 = true;
               field5007.method6428(var6, 501443835 * this.field5014);
               return var6;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "op.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qd")
   public int method8716() {
      return this.field5055 * 1633663665;
   }

   @ObfuscatedSignature(descriptor = "(Lpi;I)Lfx;")
   @ObfuscatedName("ao")
   public final classFX method8662(classPI var1, int var2) {
      try {
         classFX var3 = var1.field5268;
         if (var3 != null) {
            if (var2 >= 458130152) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            classER var4 = classER.method4047(classGU.field2702, 1320690989 * var1.field5263, 0);
            if (null == var4) {
               if (var2 >= 458130152) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label42: {
                  if (128 == -1567835707 * this.field5023) {
                     if (var2 >= 458130152) {
                        throw new IllegalStateException();
                     }

                     if (-1367777757 * this.field5059 == 128) {
                        if (128 == this.field5027 * 58165945) {
                           break label42;
                        }

                        if (var2 >= 458130152) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var4.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
               }

               this.method8686(var4, var1, -793555524);
               var3 = var4.method4045(1845819663 * this.field5060 + 64, 768 + this.field5030 * -1636300529, -50, -10, -50);
               var3.field2421 = true;
               var1.field5268 = var3;
               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "op.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lop;")
   @ObfuscatedName("al")
   public classOP method8664(int var1, int var2) {
      try {
         if (null != this.field5056) {
            if (var2 <= 829149665) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 <= 829149665) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for (int var4 = 0; var4 < 10; var4++) {
                  if (var2 <= 829149665) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= this.field5057[var4]) {
                     if (var2 <= 829149665) {
                        throw new IllegalStateException();
                     }

                     if (this.field5057[var4] != 0) {
                        if (var2 <= 829149665) {
                           throw new IllegalStateException();
                        }

                        var3 = this.field5056[var4];
                     }
                  }
               }

               if (var3 != -1) {
                  if (var2 <= 829149665) {
                     throw new IllegalStateException();
                  }

                  return classOB.method8299(var3, (byte)17);
               }
            }
         }

         return this;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "op.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;I)Z")
   @ObfuscatedName("aq")
   public final boolean method8677(int var1, classPI var2, int var3) {
      try {
         int var4 = -270643873 * this.field5029;
         int var5 = this.field5046 * -318962229;
         if (1 == var1) {
            var4 = 170424773 * this.field5015;
            var5 = -1490499797 * this.field5020;
         }

         if (null != var2) {
            if (var3 == 699854489) {
               throw new IllegalStateException();
            }

            if (var2.method8905(var1, 938234762)) {
               if (var3 == 699854489) {
                  throw new IllegalStateException();
               }

               var4 = var2.method8914(var1, 1991916254);
            }
         }

         if (var4 == -1) {
            if (var3 == 699854489) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var6 = true;
            if (!classGU.field2702.method11871(var4, 0, (byte)17)) {
               if (var3 == 699854489) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }

            if (var5 != -1) {
               if (var3 == 699854489) {
                  throw new IllegalStateException();
               }

               if (!classGU.field2702.method11871(var5, 0, (byte)-7)) {
                  if (var3 == 699854489) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               }
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "op.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("bn")
   classPO method8628() {
      return new classPO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("be")
   public static void method8648(boolean var0) {
      if (classJP.field3357 != var0) {
         classLI.method7108(168002647);
         classJP.field3357 = var0;
      }
   }

   public int getPlaceholderId() {
      return this.field5013 * 1197673963;
   }

   public int getAmbient() {
      return this.field5060 * 1845819663;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;)Z")
   @ObfuscatedName("az")
   public static boolean method8701(classOP var0) {
      return null != var0.field5017;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("au")
   public int method8687(int var1, int var2, int var3) {
      try {
         return classGQ.method5602(this.field5032, var1, var2, 376591025);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "op.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ar")
   public String method8694(int var1, String var2, int var3) {
      try {
         return classFS.method4977(this.field5032, var1, var2, (byte)19);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "op.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lop;B)Loz;")
   @ObfuscatedName("ex")
   public static classOZ method8631(classOP var0, byte var1) {
      if (var0 == null) {
         return var0.method8635(var1);
      } else {
         try {
            return var0.field5048;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "op.af(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bk")
   static final String method8641(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + classKK.field3806 + "</col>" : "<col=00ff80>" + var0 / 1000000 + classKK.field3787 + "</col>";
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("ah")
   classPO method8629() {
      return new classPO();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean method8702(int var1) {
      try {
         boolean var10000;
         if (null != this.field5017) {
            if (var1 >= 1375698635) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ch")
   public int method8688(int var1, int var2) {
      return classGQ.method5602(this.field5032, var1, var2, 666503844);
   }

   public boolean isMembers() {
      return this.field5016;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;II)I")
   @ObfuscatedName("ts")
   public static int method8689(classOP var0, int var1, int var2) {
      return classGQ.method5602(var0.field5032, var1, var2, 1308048585);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lop;")
   @ObfuscatedName("br")
   public static classOP method8636(int var0) {
      classOP var1 = (classOP)field5006.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classOT.field5117.method11867(10, var0, -1018665989);
         if (null == var2) {
            var1 = new classOP(null, var0, null, null, true);
         } else {
            classXY var3 = new classXY(var2);
            int[] var5 = new int[2];
            int var6 = classXY.method13039(var3, -346779531);
            if (var6 != -2098466477 && 139 != var6 && 148 != var6) {
               Arrays.fill(var5, -1);
            } else {
               var5[0] = classXY.method13047(var3, 561495792);
               classXY.method13039(var3, -346779531);
               var5[1] = classXY.method13047(var3, -1883670695);
            }

            var3.field6955 = 0;
            classOP var9 = var5[0] == -1 ? null : classOB.method8299(var5[0], (byte)-19);
            classOP var7 = var5[1] == -1 ? null : classOB.method8299(var5[1], (byte)51);
            var1 = new classOP(var3, var0, var9, var7, true);
         }

         field5006.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lop;")
   @ObfuscatedName("ct")
   public classOP method8665(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && this.field5057[var3] != 0) {
               var2 = this.field5056[var3];
            }
         }

         if (var2 != -1) {
            return classOB.method8299(var2, (byte)25);
         }
      }

      return this;
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("bx")
   public classOZ method8632() {
      return this.field5048;
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("bc")
   public classOZ method8633() {
      return this.field5048;
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("bp")
   public classOZ method8634() {
      return this.field5048;
   }

   @ObfuscatedSignature(descriptor = "(ILpi;I)Ler;")
   @ObfuscatedName("ad")
   public final classER method8679(int var1, classPI var2, int var3) {
      try {
         int var4 = this.field5029 * -270643873;
         int var5 = -318962229 * this.field5046;
         if (1 == var1) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            }

            var4 = 170424773 * this.field5015;
            var5 = this.field5020 * -1490499797;
         }

         if (null != var2) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            }

            if (var2.method8905(var1, 938234762)) {
               if (var3 != -1218924652) {
                  throw new IllegalStateException();
               }

               var4 = var2.method8914(var1, -1957028464);
            }
         }

         if (-1 == var4) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classER var6 = classER.method4047(classGU.field2702, var4, 0);
            if (var5 != -1) {
               if (var3 != -1218924652) {
                  throw new IllegalStateException();
               }

               classER var7 = classER.method4047(classGU.field2702, var5, 0);
               classER[] var8 = new classER[]{var6, var7};
               var6 = new classER(var8, 2);
            }

            this.method8686(var6, var2, 946260232);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "op.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("ai")
   public long method8691(int var1, long var2) {
      try {
         return classBW.method1276(this.field5032, var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "op.ai(" + ')');
      }
   }

   public short[] getColorToReplaceWith() {
      return this.field5041;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;ILpi;)Z")
   @ObfuscatedName("lh")
   public static boolean method8678(classOP var0, int var1, classPI var2) {
      int var3 = -270643873 * var0.field5029;
      int var4 = var0.field5046 * -318962229;
      if (1 == var1) {
         var3 = 170424773 * var0.field5015;
         var4 = -1490499797 * var0.field5020;
      }

      if (null != var2 && var2.method8905(var1, 938234762)) {
         var3 = var2.method8914(var1, -375356849);
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!classGU.field2702.method11871(var3, 0, (byte)-23)) {
            var5 = false;
         }

         if (var4 != -1 && !classGU.field2702.method11871(var4, 0, (byte)38)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lop;")
   @ObfuscatedName("bt")
   public static classOP method8637(int var0) {
      classOP var1 = (classOP)field5006.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classOT.field5117.method11867(10, var0, -1791739969);
         if (null == var2) {
            var1 = new classOP(null, var0, null, null, true);
         } else {
            classXY var3 = new classXY(var2);
            int[] var5 = new int[2];
            int var6 = classXY.method13039(var3, -346779531);
            if (var6 != 97 && -1500868747 != var6 && 148 != var6) {
               Arrays.fill(var5, -1);
            } else {
               var5[0] = classXY.method13047(var3, 1148186132);
               classXY.method13039(var3, -346779531);
               var5[1] = classXY.method13047(var3, -1988948320);
            }

            var3.field6955 = 0;
            classOP var9 = var5[0] == -1 ? null : classOB.method8299(var5[0], (byte)-67);
            classOP var7 = var5[1] == -1 ? null : classOB.method8299(var5[1], (byte)16);
            var1 = new classOP(var3, var0, var9, var7, true);
         }

         field5006.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIZII)Lym;")
   @ObfuscatedName("bg")
   public static final classYM method8639(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      if (var6 != 36 || var7 != 32) {
         var4 = 0;
      } else if (-1 == var1) {
         var4 = 0;
      } else if (2 == var4 && 1 != var1) {
         var4 = 1;
      }

      long var8 = ((long)var1 << 16) + var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      if (!var5 && var6 == 36 && var7 == 32) {
         classYM var10 = (classYM)field5008.method6422(var8);
         if (var10 != null) {
            return var10;
         }
      }

      classOP var11 = classOB.method8299(var0, (byte)12);
      if (var1 > 1 && null != var11.field5056) {
         int var12 = -1;

         for (int var13 = 0; var13 < 10; var13++) {
            if (var1 >= var11.field5057[var13] && 0 != var11.field5057[var13]) {
               var12 = var11.field5056[var13];
            }
         }

         if (-1 != var12) {
            var11 = classOB.method8299(var12, (byte)-15);
         }
      }

      classFX var24 = var11.method8657(1, -298459383);
      if (var24 == null) {
         return null;
      } else {
         classYM var25 = null;
         if (1236138331 * var11.field5051 != -1) {
            var25 = classLJ.method7114(1357747305 * var11.field5058, 10, 1, 0, 0, true, var6, var7, 1683831829);
            if (var25 == null) {
               return null;
            }
         } else if (-1 != var11.field5052 * 1835686777) {
            var25 = classLJ.method7114(var11.field5064 * 641055003, var1, var2, var3, 0, false, var6, var7, 1683831829);
            if (null == var25) {
               return null;
            }
         } else if (-1 != -2023616411 * var11.field5065) {
            var25 = classLJ.method7114(1197673963 * var11.field5013, var1, 0, 0, 0, false, var6, var7, 1683831829);
            if (null == var25) {
               return null;
            }
         }

         int[] var14 = classYW.field7104;
         int var15 = classYW.field7102;
         int var16 = classYW.field7101;
         float[] var17 = classYW.field7103;
         int[] var18 = new int[4];
         classYW.method13675(var18);
         classYM var23 = new classYM(var6, var7);
         classFH.method4738(var23.field7005, var6, var7, null);
         classYW.method13683();
         classFH.method4740();
         int var19 = var7 >> 1;
         classFH.method4756(var19, var19);
         classFH.field2257.field2212 = false;
         if (var11.field5065 * -2023616411 != -1) {
            classYM.method13511(var25, 0, 0);
         }

         int var20 = var11.field5034 * 1694643499;
         if (var6 != 36) {
            var20 = 32 * var20 / var6;
         }

         if (var5) {
            var20 = (int)(var20 * 1.5);
         } else if (var2 == 2) {
            var20 = (int)(1.04 * var20);
         }

         int var21 = var20 * classFH.field2253[var11.field5035 * 320831297] >> 16;
         int var22 = var20 * classFH.field2254[320831297 * var11.field5035] >> 16;
         var24.method5230();
         var24.method5250(
            0,
            -1663465803 * var11.field5036,
            163610477 * var11.field5054,
            320831297 * var11.field5035,
            1898608961 * var11.field5038,
            var21 + -1256242689 * var24.field1743 / 2 + -1593790933 * var11.field5039,
            var22 + var11.field5039 * -1593790933
         );
         if (var11.field5052 * 1835686777 != -1) {
            classYM.method13511(var25, 0, 0);
         }

         if (var2 >= 1) {
            var23.method13500(1);
         }

         if (var2 >= 2) {
            var23.method13500(16777215);
         }

         if (0 != var3) {
            classHJ.method6064(var23, var3);
         }

         classFH.method4738(var23.field7005, var6, var7, null);
         if (-1 != 1236138331 * var11.field5051) {
            classYM.method13511(var25, 0, 0);
         }

         if (1 == var4 || 2 == var4 && var11.field5055 * 1633663665 == 1) {
            classNE.field4667.method56(classLH.method7104(var1, 2053793081), 0, 9, 16776960, 1);
         }

         if (!var5 && 36 == var6 && 32 == var7) {
            field5008.method6428(var23, var8);
         }

         classFH.method4738(var14, var15, var16, var17);
         classYW.method13679(var18);
         classFH.method4740();
         classFH.field2257.field2212 = true;
         return var23;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIZII)Lym;")
   @ObfuscatedName("bj")
   public static final classYM method8640(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      if (var6 != -312366200 || var7 != 32) {
         var4 = 0;
      } else if (-1 == var1) {
         var4 = 0;
      } else if (2 == var4 && 1 != var1) {
         var4 = 1;
      }

      long var8 = ((long)var1 << 16) + var0 + ((long)var2 << -1914704479) + ((long)var4 << -1786782675) + ((long)var3 << 42);
      if (!var5 && var6 == 1086989495 && var7 == -1835691286) {
         classYM var10 = (classYM)field5008.method6422(var8);
         if (var10 != null) {
            return var10;
         }
      }

      classOP var11 = classOB.method8299(var0, (byte)19);
      if (var1 > 1 && null != var11.field5056) {
         int var12 = -1;

         for (int var13 = 0; var13 < 10; var13++) {
            if (var1 >= var11.field5057[var13] && 0 != var11.field5057[var13]) {
               var12 = var11.field5056[var13];
            }
         }

         if (-1 != var12) {
            var11 = classOB.method8299(var12, (byte)-25);
         }
      }

      classFX var24 = var11.method8657(1, -732256111);
      if (var24 == null) {
         return null;
      } else {
         classYM var25 = null;
         if (902793838 * var11.field5051 != -1) {
            var25 = classLJ.method7114(1357747305 * var11.field5058, 10, 1, 0, 0, true, var6, var7, 1683831829);
            if (var25 == null) {
               return null;
            }
         } else if (-1 != var11.field5052 * 1835686777) {
            var25 = classLJ.method7114(var11.field5064 * 641055003, var1, var2, var3, 0, false, var6, var7, 1683831829);
            if (null == var25) {
               return null;
            }
         } else if (-1 != -2023616411 * var11.field5065) {
            var25 = classLJ.method7114(6903103 * var11.field5013, var1, 0, 0, 0, false, var6, var7, 1683831829);
            if (null == var25) {
               return null;
            }
         }

         int[] var14 = classYW.field7104;
         int var15 = classYW.field7102;
         int var16 = classYW.field7101;
         float[] var17 = classYW.field7103;
         int[] var18 = new int[4];
         classYW.method13675(var18);
         classYM var23 = new classYM(var6, var7);
         classFH.method4738(var23.field7005, var6, var7, null);
         classYW.method13683();
         classFH.method4740();
         int var19 = var7 >> 1;
         classFH.method4756(var19, var19);
         classFH.field2257.field2212 = false;
         if (var11.field5065 * -870995309 != -1) {
            classYM.method13511(var25, 0, 0);
         }

         int var20 = var11.field5034 * -2084481691;
         if (var6 != -751854891) {
            var20 = 32 * var20 / var6;
         }

         if (var5) {
            var20 = (int)(var20 * 1.5);
         } else if (var2 == 2) {
            var20 = (int)(1.04 * var20);
         }

         int var21 = var20 * classFH.field2253[var11.field5035 * 320831297] >> 16;
         int var22 = var20 * classFH.field2254[320831297 * var11.field5035] >> 16;
         var24.method5230();
         var24.method5250(
            0,
            1603015838 * var11.field5036,
            1539052839 * var11.field5054,
            1625374268 * var11.field5035,
            1898608961 * var11.field5038,
            var21 + 1457118944 * var24.field1743 / 2 + -319025700 * var11.field5039,
            var22 + var11.field5039 * 336968249
         );
         if (var11.field5052 * 1835686777 != -1) {
            classYM.method13511(var25, 0, 0);
         }

         if (var2 >= 1) {
            var23.method13500(1);
         }

         if (var2 >= 2) {
            var23.method13500(16777215);
         }

         if (0 != var3) {
            classHJ.method6064(var23, var3);
         }

         classFH.method4738(var23.field7005, var6, var7, null);
         if (-1 != 1236138331 * var11.field5051) {
            classYM.method13511(var25, 0, 0);
         }

         if (1 == var4 || 2 == var4 && var11.field5055 * 852572643 == 1) {
            classNE.field4667.method56(classLH.method7104(var1, 1410754082), 0, 9, 16776960, 1);
         }

         if (!var5 && -647262508 == var6 && 32 == var7) {
            field5008.method6428(var23, var8);
         }

         classFH.method4738(var14, var15, var16, var17);
         classYW.method13679(var18);
         classFH.method4740();
         classFH.field2257.field2212 = true;
         return var23;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dw")
   public static int method8711() {
      return classCS.field1248 * -1766337085 - 1;
   }

   public int getHaPrice() {
      int var1 = this.getPrice();
      return (int)(var1 * 0.6F);
   }

   public void setName(String var1) {
      this.field5042 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bo")
   static final String method8642(int var0) {
      if (var0 < 471261072) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 481682444
            ? "<col=ffffff>" + var0 / -1476484895 + classKK.field3806 + "</col>"
            : "<col=00ff80>" + var0 / -2098803328 + classKK.field3787 + "</col>";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;)I")
   @ObfuscatedName("jf")
   public static int method8697(classOP var0) {
      if (var0.field5024 * 1011947055 == -1 || null == var0.field5025) {
         return -1;
      } else if (var0.field5024 * 1011947055 >= 0) {
         return null != var0.field5025[var0.field5024 * 1011947055] ? 1011947055 * var0.field5024 : -1;
      } else {
         return classKK.field3677.equalsIgnoreCase(var0.field5025[4]) ? 4 : -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bu")
   static final String method8643(int var0) {
      if (var0 < -1665438837) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000
            ? "<col=ffffff>" + var0 / 1000 + classKK.field3806 + "</col>"
            : "<col=00ff80>" + var0 / 1865489402 + classKK.field3787 + "</col>";
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dm")
   boolean method8703() {
      return null != this.field5017;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bs")
   public static void method8649(boolean var0) {
      if (classJP.field3357 != var0) {
         classLI.method7108(1540393474);
         classJP.field3357 = var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public static void method8644() {
      classJZ.method6431(field5006);
      classJZ.method6431(field5007);
      classJZ.method6431(field5008);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public static void method8645() {
      classJZ.method6431(field5006);
      classJZ.method6431(field5007);
      classJZ.method6431(field5008);
   }

   static {
      field5006.method6439(1024);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;ILop;Lop;Z)V")
   @ObfuscatedName("xm")
   public void method8715(classXY var1, int var2, classOP var3, classOP var4, boolean var5) {
      if (this.field5042.endsWith(" (Members)")) {
         this.field5077 = this.field5042.substring(0, this.field5042.length() - " (Members)".length());
      } else {
         this.field5077 = this.field5042;
      }

      PostItemComposition var6 = new PostItemComposition(this);
      classOE.field4843.getCallbacks().post(var6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("by")
   public static void method8650(boolean var0) {
      if (classJP.field3357 != var0) {
         classLI.method7108(-83899757);
         classJP.field3357 = var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bq")
   public static void method8651(boolean var0) {
      if (classJP.field3357 != var0) {
         classLI.method7108(-466542089);
         classJP.field3357 = var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bf")
   public static void method8652(boolean var0) {
      if (classJP.field3357 != var0) {
         classLI.method7108(414837972);
         classJP.field3357 = var0;
      }
   }

   public boolean isStackable() {
      return this.method8716() == 1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cm")
   public String method8695(int var1, String var2) {
      return classFS.method4977(this.field5032, var1, var2, (byte)66);
   }

   public int getLinkedNoteId() {
      return this.field5058 * 1357747305;
   }

   @ObfuscatedSignature(descriptor = "(I)Ler;")
   @ObfuscatedName("bd")
   public final classER method8653(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && 0 != this.field5057[var3]) {
               var2 = this.field5056[var3];
            }
         }

         if (var2 != -1) {
            return method8655(classOB.method8299(var2, (byte)-97), 1, -545953769);
         }
      }

      classER var4 = classER.method4047(classGU.field2702, this.field5037 * -1461985842, 0);
      if (null == var4) {
         return null;
      } else {
         if (1680516822 * this.field5023 != 128 || -1191862482 != -1367777757 * this.field5059 || -387468548 != 58165945 * this.field5027) {
            var4.method4035(this.field5023 * 1806637968, -1408246867 * this.field5059, this.field5027 * 58165945);
         }

         this.method8686(var4, null, -1742091839);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;)Z")
   @ObfuscatedName("qc")
   public static boolean method8708(classOP var0) {
      return var0.field5061;
   }

   public void setInventoryModel(int var1) {
      this.field5037 = var1 * -1068841145;
   }

   public String[][] getSubops() {
      return this.field5050;
   }

   @ObfuscatedSignature(descriptor = "(I)Ler;")
   @ObfuscatedName("bl")
   public final classER method8654(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && 0 != this.field5057[var3]) {
               var2 = this.field5056[var3];
            }
         }

         if (var2 != -1) {
            return method8655(classOB.method8299(var2, (byte)1), 1, 336931009);
         }
      }

      classER var4 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
      if (null == var4) {
         return null;
      } else {
         if (-1567835707 * this.field5023 != 128 || 128 != -1367777757 * this.field5059 || 128 != 58165945 * this.field5027) {
            var4.method4035(this.field5023 * -1567835707, -1367777757 * this.field5059, this.field5027 * 58165945);
         }

         this.method8686(var4, null, 651439827);
         return var4;
      }
   }

   public IterableHashTable getParams() {
      return this.field5032;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ce")
   public String method8696(int var1, String var2) {
      return classFS.method4977(this.field5032, var1, var2, (byte)126);
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("bz")
   public final classFX method8658(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && this.field5057[var3] != 0) {
               var2 = this.field5056[var3];
            }
         }

         if (-1 != var2) {
            return classOB.method8299(var2, (byte)-13).method8657(1, -359686508);
         }
      }

      classFX var4 = (classFX)field5007.method6422(501443835 * this.field5014);
      if (null != var4) {
         return var4;
      } else {
         classER var6 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
         if (var6 == null) {
            return null;
         } else {
            if (128 != this.field5023 * -1567835707 || 128 != -1367777757 * this.field5059 || this.field5027 * 58165945 != 128) {
               var6.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
            }

            this.method8686(var6, null, 682729635);
            var4 = var6.method4045(64 + 1845819663 * this.field5060, 768 + -1636300529 * this.field5030, -50, -10, -50);
            var4.field2421 = true;
            field5007.method6428(var4, 501443835 * this.field5014);
            return var4;
         }
      }
   }

   public int getPrice() {
      return this.field5043 * 665046345;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("cr")
   public final classFX method8659(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && this.field5057[var3] != 0) {
               var2 = this.field5056[var3];
            }
         }

         if (-1 != var2) {
            return classOB.method8299(var2, (byte)45).method8657(1, 912409530);
         }
      }

      classFX var4 = (classFX)field5007.method6422(501443835 * this.field5014);
      if (null != var4) {
         return var4;
      } else {
         classER var6 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
         if (var6 == null) {
            return null;
         } else {
            if (128 != this.field5023 * -1567835707 || 128 != -1367777757 * this.field5059 || this.field5027 * 58165945 != 128) {
               var6.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
            }

            this.method8686(var6, null, -531819644);
            var4 = var6.method4045(64 + 1845819663 * this.field5060, 768 + -1636300529 * this.field5030, -50, -10, -50);
            var4.field2421 = true;
            field5007.method6428(var4, 501443835 * this.field5014);
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lop;B)I")
   @ObfuscatedName("vi")
   public static int method8713(classOP var0, byte var1) {
      if (var0 == null) {
         return var0.method8714((byte)var1);
      } else {
         int var8;
         if (var0.field5009 == -2) {
            classOP var4 = var0;
            byte var2 = 25;

            try {
               if (var4.field5024 * 1011947055 == -1 || null == var4.field5025) {
                  var1 = (byte)-1;
                  var8 = var1;
               } else if (var4.field5024 * 1011947055 >= 0) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (null != var4.field5025[var4.field5024 * 1011947055]) {
                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }

                     var8 = 1011947055 * var4.field5024;
                  } else {
                     var8 = -1;
                  }

                  var1 = var8;
                  var8 = var1;
               } else {
                  byte var9;
                  if (classKK.field3677.equalsIgnoreCase(var4.field5025[4])) {
                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }

                     var9 = 4;
                  } else {
                     var9 = -1;
                  }

                  byte var6 = var9;
                  var8 = var6;
               }
            } catch (RuntimeException var3) {
               throw classEG.method3884(var3, "op.aw(" + 41);
            }
         } else {
            var8 = var0.field5009;
         }

         return var8;
      }
   }

   public int getInventoryModel() {
      return this.field5037 * -1092439433;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("cj")
   public long method8692(int var1, long var2) {
      return classBW.method1276(this.field5032, var1, var2);
   }

   public int getZan2d() {
      return this.field5054 * 163610477;
   }

   public void setTextureToReplace(short[] var1) {
      this.field5022 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lpi;)Lfx;")
   @ObfuscatedName("cb")
   public final classFX method8663(classPI var1) {
      classFX var2 = var1.field5268;
      if (var2 != null) {
         return var2;
      } else {
         classER var3 = classER.method4047(classGU.field2702, 1320690989 * var1.field5263, 0);
         if (null == var3) {
            return null;
         } else {
            if (128 != -1567835707 * this.field5023 || -1367777757 * this.field5059 != 128 || 128 != this.field5027 * 58165945) {
               var3.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
            }

            this.method8686(var3, var1, -1988817717);
            var2 = var3.method4045(1845819663 * this.field5060 + 64, 768 + this.field5030 * -1636300529, -50, -10, -50);
            var2.field2421 = true;
            var1.field5268 = var2;
            return var2;
         }
      }
   }

   public boolean isGeTradeable() {
      return this.field5062;
   }

   public short[] getColorToReplace() {
      return this.field5040;
   }

   public int getYan2d() {
      return this.field5036 * -1663465803;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lop;")
   @ObfuscatedName("bm")
   public static classOP method8638(int var0) {
      classOP var1 = (classOP)field5006.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classOT.field5117.method11867(10, var0, -1443156630);
         if (null == var2) {
            var1 = new classOP(null, var0, null, null, true);
         } else {
            classXY var3 = new classXY(var2);
            int[] var5 = new int[2];
            int var6 = classXY.method13039(var3, -346779531);
            if (var6 != 97 && 139 != var6 && 148 != var6) {
               Arrays.fill(var5, -1);
            } else {
               var5[0] = classXY.method13047(var3, 263697987);
               classXY.method13039(var3, -346779531);
               var5[1] = classXY.method13047(var3, -1501548958);
            }

            var3.field6955 = 0;
            classOP var9 = var5[0] == -1 ? null : classOB.method8299(var5[0], (byte)46);
            classOP var7 = var5[1] == -1 ? null : classOB.method8299(var5[1], (byte)-86);
            var1 = new classOP(var3, var0, var9, var7, true);
         }

         field5006.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lop;I)Ljava/lang/String;")
   @ObfuscatedName("wr")
   public static String method8704(classOP var0, int var1) {
      if (var0 == null) {
         var0.method8707(var1);
      }

      try {
         return var0.field5042;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Z")
   @ObfuscatedName("cp")
   public final boolean method8666(int var1, classPI var2) {
      int var3 = this.field5031 * 229685856;
      int var4 = this.field5045 * -1820110788;
      int var5 = -1334677546 * this.field5012;
      if (var1 == 1) {
         var3 = 2058597109 * this.field5018;
         var4 = this.field5019 * -1959611066;
         var5 = this.field5026 * 1981578109;
      }

      if (var2 != null && var2.method8904(var1, -934478747)) {
         var3 = var2.method8910(var1, (byte)-65);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!classGU.field2702.method11871(var3, 0, (byte)-18)) {
            var6 = false;
         }

         if (-1 != var4 && !classGU.field2702.method11871(var4, 0, (byte)-71)) {
            var6 = false;
         }

         if (-1 != var5 && !classGU.field2702.method11871(var5, 0, (byte)-23)) {
            var6 = false;
         }

         return var6;
      }
   }

   public void setZan2d(int var1) {
      this.field5054 = var1 * 1973314149;
   }

   public int getShiftClickActionIndex() {
      return method8713(this, (byte)25);
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Z")
   @ObfuscatedName("cq")
   public final boolean method8667(int var1, classPI var2) {
      int var3 = this.field5031 * 1435937611;
      int var4 = this.field5045 * 1179925911;
      int var5 = 1140068891 * this.field5012;
      if (var1 == 1) {
         var3 = -1246287245 * this.field5018;
         var4 = this.field5019 * 1780591021;
         var5 = this.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, -1169647077)) {
         var3 = var2.method8910(var1, (byte)79);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!classGU.field2702.method11871(var3, 0, (byte)-97)) {
            var6 = false;
         }

         if (-1 != var4 && !classGU.field2702.method11871(var4, 0, (byte)33)) {
            var6 = false;
         }

         if (-1 != var5 && !classGU.field2702.method11871(var5, 0, (byte)12)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;I)Lfx;")
   @ObfuscatedName("ea")
   public static classFX method8660(classOP var0, int var1) {
      if (null != var0.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= var0.field5057[var3] && var0.field5057[var3] != 0) {
               var2 = var0.field5056[var3];
            }
         }

         if (-1 != var2) {
            return classOB.method8299(var2, (byte)1).method8657(1, -1409561541);
         }
      }

      classFX var4 = (classFX)field5007.method6422(501443835 * var0.field5014);
      if (null != var4) {
         return var4;
      } else {
         classER var6 = classER.method4047(classGU.field2702, var0.field5037 * -1092439433, 0);
         if (var6 == null) {
            return null;
         } else {
            if (446765916 != var0.field5023 * -472201330 || 128 != -1629433313 * var0.field5059 || var0.field5027 * 58165945 != 128) {
               var6.method4035(var0.field5023 * -1567835707, var0.field5059 * -1367777757, var0.field5027 * 58165945);
            }

            var0.method8686(var6, null, -1757832547);
            var4 = var6.method4045(1406743090 + 1359909781 * var0.field5060, -649529554 + -612359240 * var0.field5030, -1753294748, -796583298, -50);
            var4.field2421 = true;
            field5007.method6428(var4, -365109785 * var0.field5014);
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lpo;")
   @ObfuscatedName("az")
   classPO method8630(byte var1) {
      try {
         return new classPO();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.az(" + ')');
      }
   }

   public int getXan2d() {
      return this.field5035 * 320831297;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;Ler;Lpi;)V")
   @ObfuscatedName("qi")
   public static void method8685(classOP var0, classER var1, classPI var2) {
      if (var0.field5040 != null) {
         short[] var3 = var0.field5040;
         short[] var4 = var0.field5041;
         if (var2 != null && var2.field5261 != null && var0.field5041.length == var2.field5261.length) {
            var4 = var2.field5261;
         }

         for (int var5 = 0; var5 < var0.field5040.length; var5++) {
            var1.method4001(var3[var5], var4[var5]);
         }
      }

      if (null != var0.field5022) {
         short[] var6 = var0.field5022;
         short[] var7 = var0.field5017;
         if (var2 != null && var2.field5260 != null && var0.field5017.length == var2.field5260.length) {
            var7 = var2.field5260;
         }

         for (int var8 = 0; var8 < var0.field5022.length; var8++) {
            var1.method4004(var6[var8], var7[var8]);
         }
      }
   }

   public void setYan2d(int var1) {
      this.field5036 = var1 * -1388726371;
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Z")
   @ObfuscatedName("cd")
   public final boolean method8668(int var1, classPI var2) {
      int var3 = this.field5031 * 1357704716;
      int var4 = this.field5045 * -2034374715;
      int var5 = 323873585 * this.field5012;
      if (var1 == 1) {
         var3 = 295252139 * this.field5018;
         var4 = this.field5019 * -823410619;
         var5 = this.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, 1826944147)) {
         var3 = var2.method8910(var1, (byte)62);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!classGU.field2702.method11871(var3, 0, (byte)9)) {
            var6 = false;
         }

         if (-1 != var4 && !classGU.field2702.method11871(var4, 0, (byte)63)) {
            var6 = false;
         }

         if (-1 != var5 && !classGU.field2702.method11871(var5, 0, (byte)-104)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Ler;")
   @ObfuscatedName("cc")
   public final classER method8672(int var1, classPI var2) {
      int var3 = 1435937611 * this.field5031;
      int var4 = this.field5045 * 1179925911;
      int var5 = 1140068891 * this.field5012;
      if (1 == var1) {
         var3 = -1246287245 * this.field5018;
         var4 = this.field5019 * 1780591021;
         var5 = this.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, 98485987)) {
         var3 = var2.method8910(var1, (byte)-70);
      }

      if (var3 == -1) {
         return null;
      } else {
         classER var6 = classER.method4047(classGU.field2702, var3, 0);
         if (-1 != var4) {
            classER var7 = classER.method4047(classGU.field2702, var4, 0);
            if (-1 != var5) {
               classER var8 = classER.method4047(classGU.field2702, var5, 0);
               classER[] var9 = new classER[]{var6, var7, var8};
               var6 = new classER(var9, 3);
            } else {
               classER[] var10 = new classER[]{var6, var7};
               var6 = new classER(var10, 2);
            }
         }

         if (0 == var1 && 0 != this.field5066 * 1146551173) {
            classER.method4040(var6, 0, 1146551173 * this.field5066, 0);
         }

         if (1 == var1 && 0 != -1325382577 * this.field5067) {
            classER.method4040(var6, 0, this.field5067 * -1325382577, 0);
         }

         this.method8686(var6, var2, 618580462);
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Ler;")
   @ObfuscatedName("cv")
   public final classER method8673(int var1, classPI var2) {
      int var3 = -1250696238 * this.field5031;
      int var4 = this.field5045 * 1179925911;
      int var5 = 1140068891 * this.field5012;
      if (1 == var1) {
         var3 = 736960605 * this.field5018;
         var4 = this.field5019 * 242622001;
         var5 = this.field5026 * 323047018;
      }

      if (var2 != null && var2.method8904(var1, -1588177379)) {
         var3 = var2.method8910(var1, (byte)23);
      }

      if (var3 == -1) {
         return null;
      } else {
         classER var6 = classER.method4047(classGU.field2702, var3, 0);
         if (-1 != var4) {
            classER var7 = classER.method4047(classGU.field2702, var4, 0);
            if (-1 != var5) {
               classER var8 = classER.method4047(classGU.field2702, var5, 0);
               classER[] var9 = new classER[]{var6, var7, var8};
               var6 = new classER(var9, 3);
            } else {
               classER[] var10 = new classER[]{var6, var7};
               var6 = new classER(var10, 2);
            }
         }

         if (0 == var1 && 0 != this.field5066 * -408388760) {
            classER.method4040(var6, 0, 1765449929 * this.field5066, 0);
         }

         if (1 == var1 && 0 != 1182565682 * this.field5067) {
            classER.method4040(var6, 0, this.field5067 * -8822325, 0);
         }

         this.method8686(var6, var2, 1946050416);
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Ler;")
   @ObfuscatedName("ca")
   public final classER method8674(int var1, classPI var2) {
      int var3 = 1435937611 * this.field5031;
      int var4 = this.field5045 * 1179925911;
      int var5 = 1140068891 * this.field5012;
      if (1 == var1) {
         var3 = -1246287245 * this.field5018;
         var4 = this.field5019 * 1780591021;
         var5 = this.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, -797943705)) {
         var3 = var2.method8910(var1, (byte)-55);
      }

      if (var3 == -1) {
         return null;
      } else {
         classER var6 = classER.method4047(classGU.field2702, var3, 0);
         if (-1 != var4) {
            classER var7 = classER.method4047(classGU.field2702, var4, 0);
            if (-1 != var5) {
               classER var8 = classER.method4047(classGU.field2702, var5, 0);
               classER[] var9 = new classER[]{var6, var7, var8};
               var6 = new classER(var9, 3);
            } else {
               classER[] var10 = new classER[]{var6, var7};
               var6 = new classER(var10, 2);
            }
         }

         if (0 == var1 && 0 != this.field5066 * 1146551173) {
            classER.method4040(var6, 0, 1146551173 * this.field5066, 0);
         }

         if (1 == var1 && 0 != -1325382577 * this.field5067) {
            classER.method4040(var6, 0, this.field5067 * -1325382577, 0);
         }

         this.method8686(var6, var2, 1947094201);
         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;ILpi;)Ler;")
   @ObfuscatedName("ro")
   public static classER method8680(classOP var0, int var1, classPI var2) {
      if (var0 == null) {
         var0.method8683(var1, var2);
      }

      int var3 = var0.field5029 * -270643873;
      int var4 = -318962229 * var0.field5046;
      if (1 == var1) {
         var3 = 170424773 * var0.field5015;
         var4 = var0.field5020 * -1490499797;
      }

      if (null != var2 && var2.method8905(var1, 938234762)) {
         var3 = var2.method8914(var1, -1413638824);
      }

      if (-1 == var3) {
         return null;
      } else {
         classER var5 = classER.method4047(classGU.field2702, var3, 0);
         if (var4 != -1) {
            classER var6 = classER.method4047(classGU.field2702, var4, 0);
            classER[] var7 = new classER[]{var5, var6};
            var5 = new classER(var7, 2);
         }

         var0.method8686(var5, var2, -1469572665);
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   public static void method8646() {
      classJZ.method6431(field5006);
      classJZ.method6431(field5007);
      classJZ.method6431(field5008);
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Ler;")
   @ObfuscatedName("cs")
   public final classER method8681(int var1, classPI var2) {
      int var3 = this.field5029 * -270643873;
      int var4 = -318962229 * this.field5046;
      if (1 == var1) {
         var3 = 170424773 * this.field5015;
         var4 = this.field5020 * -1490499797;
      }

      if (null != var2 && var2.method8905(var1, 938234762)) {
         var3 = var2.method8914(var1, 141890165);
      }

      if (-1 == var3) {
         return null;
      } else {
         classER var5 = classER.method4047(classGU.field2702, var3, 0);
         if (var4 != -1) {
            classER var6 = classER.method4047(classGU.field2702, var4, 0);
            classER[] var7 = new classER[]{var5, var6};
            var5 = new classER(var7, 2);
         }

         this.method8686(var5, var2, -231448513);
         return var5;
      }
   }

   public int getContrast() {
      return this.field5030 * -1636300529;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;ILpi;)Ler;")
   @ObfuscatedName("vl")
   public static classER method8675(classOP var0, int var1, classPI var2) {
      int var3 = 1435937611 * var0.field5031;
      int var4 = var0.field5045 * 1891849656;
      int var5 = 1140068891 * var0.field5012;
      if (1 == var1) {
         var3 = 600435068 * var0.field5018;
         var4 = var0.field5019 * 1324916797;
         var5 = var0.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, 456403126)) {
         var3 = var2.method8910(var1, (byte)-3);
      }

      if (var3 == -1) {
         return null;
      } else {
         classER var6 = classER.method4047(classGU.field2702, var3, 0);
         if (-1 != var4) {
            classER var7 = classER.method4047(classGU.field2702, var4, 0);
            if (-1 != var5) {
               classER var8 = classER.method4047(classGU.field2702, var5, 0);
               classER[] var9 = new classER[]{var6, var7, var8};
               var6 = new classER(var9, 3);
            } else {
               classER[] var10 = new classER[]{var6, var7};
               var6 = new classER(var10, 2);
            }
         }

         if (0 == var1 && 0 != var0.field5066 * -1230210348) {
            classER.method4040(var6, 0, -1352528329 * var0.field5066, 0);
         }

         if (1 == var1 && 0 != -1325382577 * var0.field5067) {
            classER.method4040(var6, 0, var0.field5067 * -407884498, 0);
         }

         var0.method8686(var6, var2, 426112940);
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   public boolean method8709(int var1) {
      try {
         return this.field5061;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.an(" + ')');
      }
   }

   public void setXan2d(int var1) {
      this.field5035 = var1 * 1728909505;
   }

   public short[] getTextureToReplace() {
      return this.field5022;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cw")
   public int method8690(int var1, int var2) {
      return classGQ.method5602(this.field5032, var1, var2, 1255818871);
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("bv")
   public final classFX method8661(int var1) {
      if (null != this.field5056 && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.field5057[var3] && this.field5057[var3] != 0) {
               var2 = this.field5056[var3];
            }
         }

         if (-1 != var2) {
            return classOB.method8299(var2, (byte)71).method8657(1, -1208920301);
         }
      }

      classFX var4 = (classFX)field5007.method6422(501443835 * this.field5014);
      if (null != var4) {
         return var4;
      } else {
         classER var6 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
         if (var6 == null) {
            return null;
         } else {
            if (128 != this.field5023 * -1567835707 || 128 != -1367777757 * this.field5059 || this.field5027 * 58165945 != 128) {
               var6.method4035(this.field5023 * -1567835707, this.field5059 * -1367777757, this.field5027 * 58165945);
            }

            this.method8686(var6, null, 389728438);
            var4 = var6.method4045(64 + 1845819663 * this.field5060, 768 + -1636300529 * this.field5030, -50, -10, -50);
            var4.field2421 = true;
            field5007.method6428(var4, 501443835 * this.field5014);
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("ci")
   public long method8693(int var1, long var2) {
      return classBW.method1276(this.field5032, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dt")
   public String method8705() {
      return this.field5042;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public static void method8647() {
      classJZ.method6431(field5006);
      classJZ.method6431(field5007);
      classJZ.method6431(field5008);
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Z")
   @ObfuscatedName("cl")
   public final boolean method8669(int var1, classPI var2) {
      int var3 = this.field5031 * 1435937611;
      int var4 = this.field5045 * 1179925911;
      int var5 = 1140068891 * this.field5012;
      if (var1 == 1) {
         var3 = -1246287245 * this.field5018;
         var4 = this.field5019 * 1780591021;
         var5 = this.field5026 * 1055956965;
      }

      if (var2 != null && var2.method8904(var1, 508455355)) {
         var3 = var2.method8910(var1, (byte)-107);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!classGU.field2702.method11871(var3, 0, (byte)61)) {
            var6 = false;
         }

         if (-1 != var4 && !classGU.field2702.method11871(var4, 0, (byte)44)) {
            var6 = false;
         }

         if (-1 != var5 && !classGU.field2702.method11871(var5, 0, (byte)24)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lop;II)Ler;")
   @ObfuscatedName("nr")
   public static classER method8655(classOP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8656(var1, var1);
      }

      try {
         if (null != var0.field5056 && var1 > 1) {
            if (var2 == 1413803387) {
               throw new IllegalStateException();
            }

            int var3 = -1;

            for (int var4 = 0; var4 < 10; var4++) {
               if (var1 >= var0.field5057[var4]) {
                  if (var2 == 1413803387) {
                     throw new IllegalStateException();
                  }

                  if (0 != var0.field5057[var4]) {
                     if (var2 == 1413803387) {
                        throw new IllegalStateException();
                     }

                     var3 = var0.field5056[var4];
                  }
               }
            }

            if (var3 != -1) {
               if (var2 == 1413803387) {
                  throw new IllegalStateException();
               }

               return method8655(classOB.method8299(var3, (byte)-27), 1, -582229412);
            }
         }

         classER var6 = classER.method4047(classGU.field2702, var0.field5037 * -1092439433, 0);
         if (null == var6) {
            return null;
         } else {
            label66: {
               if (-1567835707 * var0.field5023 == 128) {
                  if (var2 == 1413803387) {
                     throw new IllegalStateException();
                  }

                  if (128 == -1367777757 * var0.field5059) {
                     if (var2 == 1413803387) {
                        throw new IllegalStateException();
                     }

                     if (128 == 58165945 * var0.field5027) {
                        break label66;
                     }
                  }
               }

               var6.method4035(var0.field5023 * -1567835707, -1367777757 * var0.field5059, var0.field5027 * 58165945);
            }

            var0.method8686(var6, null, 1388508531);
            return var6;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "op.ac(" + ')');
      }
   }

   public void setColorToReplace(short[] var1) {
      this.field5040 = var1;
   }

   public void setColorToReplaceWith(short[] var1) {
      this.field5041 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lop;ILpi;I)Ler;")
   @ObfuscatedName("wc")
   public static classER method8676(classOP var0, int var1, classPI var2, int var3) {
      if (var0 == null) {
         return var0.method8682(var1, var2, var1);
      } else {
         try {
            int var4 = 1435937611 * var0.field5031;
            int var5 = var0.field5045 * 1179925911;
            int var6 = 1140068891 * var0.field5012;
            if (1 == var1) {
               if (var3 != 1986500445) {
                  throw new IllegalStateException();
               }

               var4 = -1246287245 * var0.field5018;
               var5 = var0.field5019 * 1780591021;
               var6 = var0.field5026 * 1055956965;
            }

            if (var2 != null) {
               if (var3 != 1986500445) {
                  throw new IllegalStateException();
               }

               if (var2.method8904(var1, -1598719426)) {
                  var4 = var2.method8910(var1, (byte)-23);
               }
            }

            if (var4 == -1) {
               if (var3 != 1986500445) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               classER var7 = classER.method4047(classGU.field2702, var4, 0);
               if (-1 != var5) {
                  if (var3 != 1986500445) {
                     throw new IllegalStateException();
                  }

                  classER var8 = classER.method4047(classGU.field2702, var5, 0);
                  if (-1 != var6) {
                     if (var3 != 1986500445) {
                        throw new IllegalStateException();
                     }

                     classER var9 = classER.method4047(classGU.field2702, var6, 0);
                     classER[] var10 = new classER[]{var7, var8, var9};
                     var7 = new classER(var10, 3);
                  } else {
                     classER[] var12 = new classER[]{var7, var8};
                     var7 = new classER(var12, 2);
                  }
               }

               if (0 == var1 && 0 != var0.field5066 * 1146551173) {
                  if (var3 != 1986500445) {
                     throw new IllegalStateException();
                  }

                  classER.method4040(var7, 0, 1146551173 * var0.field5066, 0);
               }

               if (1 == var1) {
                  if (var3 != 1986500445) {
                     throw new IllegalStateException();
                  }

                  if (0 != -1325382577 * var0.field5067) {
                     if (var3 != 1986500445) {
                        throw new IllegalStateException();
                     }

                     classER.method4040(var7, 0, var0.field5067 * -1325382577, 0);
                  }
               }

               var0.method8686(var7, var2, 331104662);
               return var7;
            }
         } catch (RuntimeException var11) {
            throw classEG.method3884(var11, "op.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dy")
   boolean method8698() {
      return null != this.field5041;
   }

   @ObfuscatedSignature(descriptor = "(Lop;ILpi;S)Z")
   @ObfuscatedName("hy")
   public static boolean method8670(classOP var0, int var1, classPI var2, short var3) {
      if (var0 == null) {
         var0.method8671(var1, var2, var3);
      }

      try {
         int var4 = var0.field5031 * 1435937611;
         int var5 = var0.field5045 * 1179925911;
         int var6 = 1140068891 * var0.field5012;
         if (var1 == 1) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            }

            var4 = -1246287245 * var0.field5018;
            var5 = var0.field5019 * 1780591021;
            var6 = var0.field5026 * 1055956965;
         }

         if (var2 != null) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            }

            if (var2.method8904(var1, 1873480736)) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               var4 = var2.method8910(var1, (byte)-89);
            }
         }

         if (-1 == var4) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var7 = true;
            if (!classGU.field2702.method11871(var4, 0, (byte)35)) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               var7 = false;
            }

            if (-1 != var5) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               if (!classGU.field2702.method11871(var5, 0, (byte)-53)) {
                  var7 = false;
               }
            }

            if (-1 != var6) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               if (!classGU.field2702.method11871(var6, 0, (byte)101)) {
                  if (var3 == 5017) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               }
            }

            return var7;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "op.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dd")
   boolean method8699() {
      return null != this.field5041;
   }

   @ObfuscatedSignature(descriptor = "(Ler;Lpi;I)V")
   @ObfuscatedName("ap")
   void method8686(classER var1, classPI var2, int var3) {
      try {
         if (this.field5040 != null) {
            short[] var4 = this.field5040;
            short[] var5 = this.field5041;
            if (var2 != null && var2.field5261 != null) {
               if (var3 == 1198748727) {
                  throw new IllegalStateException();
               }

               if (this.field5041.length == var2.field5261.length) {
                  if (var3 == 1198748727) {
                     throw new IllegalStateException();
                  }

                  var5 = var2.field5261;
               }
            }

            for (int var6 = 0; var6 < this.field5040.length; var6++) {
               if (var3 == 1198748727) {
                  return;
               }

               var1.method4001(var4[var6], var5[var6]);
            }
         }

         if (null != this.field5022) {
            if (var3 == 1198748727) {
               return;
            }

            short[] var8 = this.field5022;
            short[] var9 = this.field5017;
            if (var2 != null) {
               if (var3 == 1198748727) {
                  throw new IllegalStateException();
               }

               if (var2.field5260 != null) {
                  if (var3 == 1198748727) {
                     throw new IllegalStateException();
                  }

                  if (this.field5017.length == var2.field5260.length) {
                     if (var3 == 1198748727) {
                        throw new IllegalStateException();
                     }

                     var9 = var2.field5260;
                  }
               }
            }

            for (int var10 = 0; var10 < this.field5022.length; var10++) {
               if (var3 == 1198748727) {
                  return;
               }

               var1.method4004(var8[var10], var9[var10]);
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "op.ap(" + ')');
      }
   }

   public String getMembersName() {
      return this.field5077;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;Laae;Z)Z")
   @ObfuscatedName("vo")
   public static boolean method8627(classRN var0, classAAE var1, boolean var2) {
      if (var0 == null) {
         var0.getPendingLogins();
      }

      classRP var3 = (classRP)var0.method10207(var1, 282151994);
      return null == var3 ? false : !var2 || 1591700924 * var3.field5669 != 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("du")
   public String method8706() {
      return this.field5042;
   }

   public boolean isTradeable() {
      return this.field5061;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   boolean method8700(int var1) {
      try {
         boolean var10000;
         if (null != this.field5041) {
            if (var1 >= -528692156) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dr")
   public boolean method8710() {
      return this.field5061;
   }

   public String getName() {
      return this.field5042;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   public static int method8712() {
      return classCS.field1248 * -172787477 - 1;
   }

   classOP(classXY var1, int var2, classOP var3, classOP var4, boolean var5) {
      this.field5014 = -1958887885 * var2;
      int var6 = 0;
      String var7 = classKK.field3615;
      String var8 = classKK.field3615;
      short[] var9 = null;
      short[] var10 = null;
      short[] var11 = null;
      short[] var12 = null;
      int var13 = 2000;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 1;
      int var21 = -1;
      int var22 = -1;
      int var23 = -1;
      boolean var24 = false;
      classPO var25 = this.method8630((byte)25);
      String[] var26 = new String[]{null, null, null, null, classKK.field3677};
      String[][] var27 = (String[][])null;
      int var28 = -1;
      int[] var29 = null;
      int[] var30 = null;
      int var31 = -1;
      int var32 = -1;
      int var33 = 128;
      int var34 = 128;
      int var35 = 128;
      byte var36 = 0;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;
      classYN var40 = null;
      boolean var41 = true;
      boolean var42 = false;
      boolean var43 = false;
      int var44 = -1;
      int var45 = -1;
      int var46 = -1;
      int var47 = -1;
      byte var48 = -2;
      int var49 = -1;
      int var50 = -1;
      int var51 = 0;
      int var52 = -1;
      int var53 = -1;
      int var54 = 0;
      int var55 = -1;
      int var56 = -1;
      int var57 = -1;
      int var58 = -1;
      int var59 = -1;
      int var60 = -1;
      var25.method9048(2, classKK.field3805, (byte)6);
      if (var1 != null && null != var1.field6954) {
         label397:
         while (true) {
            int var61 = classXY.method13039(var1, -346779531);
            switch (var61) {
               case 0:
                  break label397;
               case 1:
               case 10:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 28:
               case 29:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 64:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 76:
               case 77:
               case 78:
               case 79:
               case 80:
               case 81:
               case 82:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 90:
               case 91:
               case 92:
               case 93:
               case 96:
               case 99:
               case 116:
               case 117:
               case 118:
               case 119:
               case 120:
               case 121:
               case 122:
               case 123:
               case 124:
               case 125:
               case 126:
               case 127:
               case 128:
               case 129:
               case 130:
               case 131:
               case 132:
               case 133:
               case 134:
               case 135:
               case 136:
               case 137:
               case 138:
               case 141:
               case 142:
               case 143:
               case 144:
               case 145:
               case 146:
               case 147:
               case 150:
               case 151:
               case 152:
               case 153:
               case 154:
               case 155:
               case 156:
               case 157:
               case 158:
               case 159:
               case 161:
               case 162:
               case 163:
               case 164:
               case 165:
               case 166:
               case 167:
               case 168:
               case 169:
               case 170:
               case 171:
               case 172:
               case 173:
               case 174:
               case 175:
               case 176:
               case 177:
               case 178:
               case 179:
               case 180:
               case 181:
               case 182:
               case 183:
               case 184:
               case 185:
               case 186:
               case 187:
               case 188:
               case 189:
               case 190:
               case 191:
               case 192:
               case 193:
               case 194:
               case 195:
               case 196:
               case 197:
               case 198:
               case 199:
               case 203:
               case 204:
               case 205:
               case 206:
               case 207:
               case 208:
               case 209:
               case 210:
               case 211:
               case 212:
               case 213:
               case 214:
               case 215:
               case 216:
               case 217:
               case 218:
               case 219:
               case 220:
               case 221:
               case 222:
               case 223:
               case 224:
               case 225:
               case 226:
               case 227:
               case 228:
               case 229:
               case 230:
               case 231:
               case 232:
               case 233:
               case 234:
               case 235:
               case 236:
               case 237:
               case 238:
               case 239:
               case 240:
               case 241:
               case 242:
               case 243:
               case 244:
               case 245:
               case 246:
               case 247:
               case 248:
               default:
                  continue;
               case 2:
                  var7 = var1.method13071(758624956);
                  continue;
               case 3:
                  var8 = var1.method13071(786369912);
                  continue;
               case 4:
                  var13 = classXY.method13047(var1, -2138153189);
                  continue;
               case 5:
                  var14 = classXY.method13047(var1, -629975210);
                  continue;
               case 6:
                  var15 = classXY.method13047(var1, -2014502119);
                  continue;
               case 7:
                  var17 = classXY.method13047(var1, -616024580);
                  if (var17 > 32767) {
                     var17 -= 65536;
                  }
                  continue;
               case 8:
                  var18 = classXY.method13047(var1, 922208087);
                  if (var18 > 32767) {
                     var18 -= 65536;
                  }
                  continue;
               case 9:
                  var1.method13071(-512316701);
                  continue;
               case 11:
                  var19 = 1;
                  continue;
               case 12:
                  var20 = var1.method13056((byte)1);
                  continue;
               case 13:
                  var21 = classXY.method13039(var1, -346779531);
                  continue;
               case 14:
                  var22 = classXY.method13039(var1, -346779531);
                  continue;
               case 15:
                  var41 = false;
                  continue;
               case 16:
                  var24 = true;
                  continue;
               case 27:
                  var23 = classXY.method13039(var1, -346779531);
                  continue;
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 200:
               case 201:
               case 202:
                  classPO.method9044(var25, var1, var61, 30, 34, 200, 201, 202, 1161561653);
                  continue;
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
                  var26[var61 - 35] = var1.method13071(616224821);
                  continue;
               case 40:
                  int var71 = classXY.method13039(var1, -346779531);
                  var9 = new short[var71];
                  var10 = new short[var71];
                  int var74 = 0;

                  while (true) {
                     if (var74 >= var71) {
                        continue label397;
                     }

                     var9[var74] = (short)classXY.method13047(var1, 762099035);
                     var10[var74] = (short)classXY.method13047(var1, -1299973714);
                     var74++;
                  }
               case 41:
                  int var70 = classXY.method13039(var1, -346779531);
                  var11 = new short[var70];
                  var12 = new short[var70];
                  int var73 = 0;

                  while (true) {
                     if (var73 >= var70) {
                        continue label397;
                     }

                     var11[var73] = (short)classXY.method13047(var1, -1945013046);
                     var12[var73] = (short)classXY.method13047(var1, 1655174411);
                     var73++;
                  }
               case 42:
                  var48 = classXY.method13043(var1, (byte)17);
                  continue;
               case 43:
                  int var62 = classXY.method13039(var1, -346779531);
                  if (null == var27) {
                     var27 = new String[5][];
                  }

                  boolean var63 = var62 >= 0 && var62 < 5;
                  if (var63 && var27[var62] == null) {
                     var27[var62] = new String[20];
                  }

                  while (true) {
                     int var64 = classXY.method13039(var1, -346779531) - 1;
                     if (var64 == -1) {
                        continue label397;
                     }

                     String var65 = var1.method13071(1568482341);
                     if (var63 && var64 >= 0 && var64 < 20) {
                        var27[var62][var64] = var65;
                     }
                  }
               case 44:
                  var6 = var1.method13117(classXM.field6888.field6890, 1472752456);
                  continue;
               case 45:
                  var49 = var1.method13117(classXM.field6888.field6890, 1906716019);
                  var51 = classXY.method13039(var1, -346779531);
                  continue;
               case 46:
                  var50 = var1.method13117(classXM.field6888.field6890, 1809984855);
                  continue;
               case 47:
                  var55 = var1.method13117(classXM.field6888.field6890, 1925301324);
                  continue;
               case 48:
                  var52 = var1.method13117(classXM.field6888.field6890, 1528286961);
                  var54 = classXY.method13039(var1, -346779531);
                  continue;
               case 49:
                  var53 = var1.method13117(classXM.field6888.field6890, 1625198394);
                  continue;
               case 50:
                  var56 = var1.method13117(classXM.field6888.field6890, 1663065129);
                  continue;
               case 51:
                  var57 = var1.method13117(classXM.field6888.field6890, 1931215053);
                  continue;
               case 52:
                  var58 = var1.method13117(classXM.field6888.field6890, 1649838812);
                  continue;
               case 53:
                  var59 = var1.method13117(classXM.field6888.field6890, 1918388706);
                  continue;
               case 54:
                  var60 = var1.method13117(classXM.field6888.field6890, 1858049712);
                  continue;
               case 65:
                  var42 = true;
                  var43 = true;
                  continue;
               case 75:
                  var39 = var1.method13050((byte)16);
                  continue;
               case 94:
                  var28 = classXY.method13047(var1, 1734013249);
                  continue;
               case 95:
                  var16 = classXY.method13047(var1, 1707621308);
                  continue;
               case 97:
                  var31 = classXY.method13047(var1, -1736084497);
                  continue;
               case 98:
                  var32 = classXY.method13047(var1, -1400051452);
                  continue;
               case 100:
               case 101:
               case 102:
               case 103:
               case 104:
               case 105:
               case 106:
               case 107:
               case 108:
               case 109:
                  if (var29 == null) {
                     var29 = new int[10];
                     var30 = new int[10];
                  }

                  var29[var61 - 100] = classXY.method13047(var1, -248531488);
                  var30[var61 - 100] = classXY.method13047(var1, -541455458);
                  continue;
               case 110:
                  var33 = classXY.method13047(var1, 278666739);
                  continue;
               case 111:
                  var34 = classXY.method13047(var1, -52034166);
                  continue;
               case 112:
                  var35 = classXY.method13047(var1, -1755046705);
                  continue;
               case 113:
                  var36 = classXY.method13043(var1, (byte)17);
                  continue;
               case 114:
                  var37 = classXY.method13043(var1, (byte)17) * 5;
                  continue;
               case 115:
                  var38 = classXY.method13039(var1, -346779531);
                  continue;
               case 139:
                  var44 = classXY.method13047(var1, 1686312871);
                  continue;
               case 140:
                  var45 = classXY.method13047(var1, 1139718612);
                  continue;
               case 148:
                  var46 = classXY.method13047(var1, 1404586075);
                  continue;
               case 149:
                  var47 = classXY.method13047(var1, -113666036);
                  continue;
               case 160:
                  var19 = 2;
                  continue;
               case 249:
            }

            var40 = classQH.method9525(var1, var40, 1978086108);
         }
      } else {
         var41 = false;
      }

      if (var19 == 1) {
         var39 = 0;
      }

      if (null != var4) {
         var6 = var4.field5037 * -1092439433;
         var13 = 1694643499 * var4.field5034;
         var14 = var4.field5035 * 320831297;
         var15 = -1663465803 * var4.field5036;
         var16 = 163610477 * var4.field5054;
         var17 = 1898608961 * var4.field5038;
         var18 = var4.field5039 * -1593790933;
         if (var45 != -1) {
            var9 = var3.field5040;
            var10 = var3.field5041;
            var11 = var3.field5022;
            var12 = var3.field5017;
         } else {
            var9 = var4.field5040;
            var10 = var4.field5041;
            var11 = var4.field5022;
            var12 = var4.field5017;
         }

         if (var32 != -1) {
            var7 = var3.field5042;
            var8 = classKK.field3608;
            var24 = var3.field5016;
            var20 = 665046345 * var3.field5043;
            var41 = var3.method8709(1437914346);
            var19 = 1;
         }

         if (var45 != -1) {
            var7 = var3.field5042;
            var8 = var3.field5033;
            var24 = var3.field5016;
            var19 = 1633663665 * var3.field5055;
            var28 = var3.field5049 * -807855685;
            var21 = 1481543581 * var3.field5044;
            var22 = -1462570117 * var3.field5010;
            var23 = var3.field5021 * -1681179861;
            var49 = var3.field5031 * 1435937611;
            var50 = 1179925911 * var3.field5045;
            var55 = 1140068891 * var3.field5012;
            var52 = -1246287245 * var3.field5018;
            var53 = 1780591021 * var3.field5019;
            var56 = var3.field5026 * 1055956965;
            var57 = var3.field5029 * -270643873;
            var58 = -318962229 * var3.field5046;
            var59 = 170424773 * var3.field5015;
            var60 = var3.field5020 * -1490499797;
            var38 = var3.field5047 * -115663245;
            var25 = var3.field5048;
            var39 = var3.field5011 * -692383701;
            var26 = new String[5];
            if (null != var3.field5025) {
               for (int var67 = 0; var67 < 4; var67++) {
                  var26[var67] = var3.field5025[var67];
               }
            }

            var26[4] = classKK.field3772;
            if (null != var3.field5050) {
               var27 = new String[5][];
               System.arraycopy(var3.field5050, 0, var27, 0, 4);
            } else {
               var27 = (String[][])null;
            }

            var20 = 0;
            var41 = false;
            var42 = false;
            var43 = false;
         }

         if (var47 != -1) {
            var19 = var4.field5055 * 1633663665;
            var28 = var4.field5049 * -807855685;
            var7 = var3.field5042;
            var8 = var3.field5033;
            var20 = 0;
            var24 = false;
            var41 = false;
            var42 = false;
            var43 = false;
         }
      }

      if (!classJP.field3357 && var24) {
         if (null == var4) {
            var7 = var7 + classKK.field3606;
         }

         var8 = classKK.field3689;
         var43 = false;
         var41 = false;
         var25.method9058(-1092663845);
         var25.method9048(2, classKK.field3805, (byte)-72);

         for (int var68 = 0; var68 < var26.length; var68++) {
            if (4 != var68) {
               if (null != var27) {
                  var27[var68] = null;
               }

               var26[var68] = null;
            }
         }

         var48 = -2;
         var28 = -1;
         var38 = 0;
         if (var5 && var40 != null) {
            for (classVQ var69 = var40.method13587(); var69 != null; var69 = classYN.method13589(var40)) {
               classPN var72 = classNE.method7829((int)var69.field6552, (byte)-33);
               if (var72.field5355) {
                  var69.vmethod398();
               }
            }
         }
      }

      this.field5037 = var6 * -1068841145;
      this.field5042 = var7;
      this.field5033 = var8;
      this.field5040 = var9;
      this.field5041 = var10;
      this.field5022 = var11;
      this.field5017 = var12;
      this.field5034 = 1399644547 * var13;
      this.field5035 = var14 * 1728909505;
      this.field5036 = var15 * -1388726371;
      this.field5054 = 1973314149 * var16;
      this.field5038 = -1110501695 * var17;
      this.field5039 = var18 * -177954685;
      this.field5055 = 1880378961 * var19;
      this.field5043 = -391727879 * var20;
      this.field5044 = var21 * 1057713845;
      this.field5010 = var22 * 1065808819;
      this.field5021 = var23 * -101602429;
      this.field5016 = var24;
      this.field5048 = var25;
      this.field5025 = var26;
      this.field5050 = var27;
      this.field5049 = var28 * -1432304781;
      this.field5056 = var29;
      this.field5057 = var30;
      this.field5058 = var31 * 1761688537;
      this.field5051 = 919703251 * var32;
      this.field5023 = 1036410125 * var33;
      this.field5059 = 2142323083 * var34;
      this.field5027 = var35 * 1156537225;
      this.field5060 = var36 * -474032657;
      this.field5030 = var37 * 1805239791;
      this.field5047 = 847886011 * var38;
      this.field5011 = var39 * 1167928963;
      this.field5061 = var41;
      this.field5062 = var42;
      this.field5063 = var43;
      this.field5064 = -2107049709 * var44;
      this.field5052 = var45 * 1870012105;
      this.field5013 = 886944451 * var46;
      this.field5065 = var47 * 1534730605;
      this.field5024 = var48 * 785248463;
      this.field5031 = -249035165 * var49;
      this.field5045 = 815403559 * var50;
      this.field5066 = 1559610701 * var51;
      this.field5018 = 1374063291 * var52;
      this.field5019 = var53 * -1456496091;
      this.field5067 = 2047890095 * var54;
      this.field5012 = 999454739 * var55;
      this.field5026 = var56 * 1357022701;
      this.field5029 = 1233473183 * var57;
      this.field5046 = var58 * 1736964067;
      this.field5015 = 1282710797 * var59;
      this.field5020 = var60 * 404471683;
      if (null == var40) {
         this.field5032 = new classYN(1);
      } else {
         this.field5032 = var40;
      }

      this.method8715(var1, var2, var3, var4, var5);
   }

   public void setTextureToReplaceWith(short[] var1) {
      this.field5017 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("vy")
   @Override
   public void vmethod537(classYN var1) {
      this.field5032 = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Loz;")
   @ObfuscatedName("af")
   public classOZ method8635(byte var1) {
      try {
         return this.field5048;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.af(" + ')');
      }
   }

   public int getId() {
      return this.field5014 * 501443835;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dj")
   public int method8717() {
      return this.field5031 * 1435937611;
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("ac")
   public final classER method8656(int var1, int var2) {
      try {
         if (null != this.field5057 && var1 > 1) {
            if (var2 == 1413803387) {
               throw new IllegalStateException();
            }

            int var3 = -1;

            for (int var4 = 0; var4 < 10; var4++) {
               if (var1 >= this.field5056[var4]) {
                  if (var2 == 1413803387) {
                     throw new IllegalStateException();
                  }

                  if (0 != this.field5056[var4]) {
                     if (var2 == 1413803387) {
                        throw new IllegalStateException();
                     }

                     var3 = this.field5057[var4];
                  }
               }
            }

            if (var3 != -1) {
               if (var2 == 1413803387) {
                  throw new IllegalStateException();
               }

               return method8655(classOB.method8299(var3, (byte)-27), 1, -582229412);
            }
         }

         classER var6 = classER.method4047(classGU.field2702, this.field5037 * -1092439433, 0);
         if (null == var6) {
            return null;
         } else {
            label63: {
               if (-1567835707 * this.field5018 == 128) {
                  if (var2 == 1413803387) {
                     throw new IllegalStateException();
                  }

                  if (128 == -1367777757 * this.field5027) {
                     if (var2 == 1413803387) {
                        throw new IllegalStateException();
                     }

                     if (128 == 58165945 * this.field5045) {
                        break label63;
                     }
                  }
               }

               var6.method4013(this.field5046 * -1567835707, -1367777757 * this.field5018, this.field5029 * 58165945);
            }

            this.method8686(var6, null, 1388508531);
            return var6;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "op.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;S)Z")
   @ObfuscatedName("aj")
   public final boolean method8671(int var1, classPI var2, short var3) {
      try {
         int var4 = this.field5046 * 1435937611;
         int var5 = this.field5026 * 1179925911;
         int var6 = 1140068891 * this.field5067;
         if (var1 == 1) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            }

            var4 = -1246287245 * this.field5029;
            var5 = this.field5066 * 1780591021;
            var6 = this.field5024 * 1055956965;
         }

         if (var2 != null) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            }

            if (var2.method8904(var1, 1873480736)) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               var4 = var2.method8910(var1, (byte)-89);
            }
         }

         if (-1 == var4) {
            if (var3 == 5017) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var7 = true;
            if (!classGU.field2702.method11871(var4, 0, (byte)35)) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               var7 = false;
            }

            if (-1 != var5) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               if (!classGU.field2702.method11871(var5, 0, (byte)-53)) {
                  var7 = false;
               }
            }

            if (-1 != var6) {
               if (var3 == 5017) {
                  throw new IllegalStateException();
               }

               if (!classGU.field2702.method11871(var6, 0, (byte)101)) {
                  if (var3 == 5017) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               }
            }

            return var7;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "op.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILpi;I)Ler;")
   @ObfuscatedName("ay")
   public final classER method8682(int var1, classPI var2, int var3) {
      try {
         int var4 = this.field5020 * -270643873;
         int var5 = -318962229 * this.field5066;
         if (1 == var1) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            }

            var4 = 170424773 * this.field5014;
            var5 = this.field5012 * -1490499797;
         }

         if (null != var2) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            }

            if (var2.method8904(var1, 938234762)) {
               if (var3 != -1218924652) {
                  throw new IllegalStateException();
               }

               var4 = var2.method8914(var1, -1957028464);
            }
         }

         if (-1 == var4) {
            if (var3 != -1218924652) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classER var6 = classER.method3960(classGU.field2702, var4, 0);
            if (var5 != -1) {
               if (var3 != -1218924652) {
                  throw new IllegalStateException();
               }

               classER var7 = classER.method3959(classGU.field2702, var5, 0);
               classER[] var8 = new classER[]{var6, var7};
               var6 = new classER(var8, 2);
            }

            this.method8686(var6, var2, 946260232);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "op.ad(" + ')');
      }
   }

   public String[] getInventoryActions() {
      return this.field5025;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String method8707(int var1) {
      try {
         return this.field5042;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "op.at(" + ')');
      }
   }

   public short[] getTextureToReplaceWith() {
      return this.field5017;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   public int method8714(byte var1) {
      int var8;
      if (this.field5054 == -2) {
         classOP var4 = this;
         byte var2 = 25;

         try {
            if (var4.field5067 * 1011947055 == -1 || null == var4.field5025) {
               var1 = (byte)-1;
               var8 = var1;
            } else if (var4.field5026 * 1011947055 >= 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (null != var4.field5025[var4.field5015 * 1011947055]) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var8 = 1011947055 * var4.field5046;
               } else {
                  var8 = -1;
               }

               var1 = var8;
               var8 = var1;
            } else {
               byte var9;
               if (classKK.field3745.equalsIgnoreCase(var4.field5025[4])) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var9 = 4;
               } else {
                  var9 = -1;
               }

               byte var6 = var9;
               var8 = var6;
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "op.aw(" + 41);
         }
      } else {
         var8 = this.field5039;
      }

      return var8;
   }

   public void setShiftClickActionIndex(int var1) {
      this.field5009 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILpi;)Ler;")
   @ObfuscatedName("co")
   public final classER method8683(int var1, classPI var2) {
      int var3 = this.field5052 * -270643873;
      int var4 = -318962229 * this.field5066;
      if (1 == var1) {
         var3 = 170424773 * this.field5019;
         var4 = this.field5059 * -1490499797;
      }

      if (null != var2 && var2.method8904(var1, 938234762)) {
         var3 = var2.method8914(var1, -1413638824);
      }

      if (-1 == var3) {
         return null;
      } else {
         classER var5 = classER.method3958(classGU.field2702, var3, 0);
         if (var4 != -1) {
            classER var6 = classER.method4047(classGU.field2702, var4, 0);
            classER[] var7 = new classER[]{var5, var6};
            var5 = new classER(var7, 2);
         }

         this.method8686(var5, var2, -1469572665);
         return var5;
      }
   }
}
