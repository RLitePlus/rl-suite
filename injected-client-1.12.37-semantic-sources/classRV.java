import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rv")
public class classRV {
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("az")
   classVP field5857;
   @ObfuscatedSignature(descriptor = "Lao;")
   @ObfuscatedName("af")
   classAO field5855;
   @ObfuscatedSignature(descriptor = "[Lwc;")
   @ObfuscatedName("ag")
   final classWC[] field5849 = new classWC[8];
   @ObfuscatedName("ab")
   boolean field5858;
   @ObfuscatedName("ax")
   long[] field5859;
   @ObfuscatedSignature(descriptor = "[Lwc;")
   @ObfuscatedName("as")
   final classWC[] field5848 = new classWC[8];
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   static final int field5854 = 70;
   @ObfuscatedName("ac")
   final ArrayList field5850 = new ArrayList();
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5853 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field5851 = 33;
   @ObfuscatedSignature(descriptor = "Lpg;")
   @ObfuscatedName("ae")
   classPG field5856;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5852 = 1024;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrv;Lwc;)V")
   @ObfuscatedName("kv")
   public static void method10305(classRV var0, classWC var1) {
      if (var0 == null) {
         var0.method10307(var1);
      }

      var1.method12294(
         0,
         var1.method12298(737960846),
         var0.field5856.method8880(-1294237009).method12333((byte)-19),
         classWD.method12332(var0.field5856.method8880(2134314988), 1120761904),
         -1545970898
      );
      var1.method12297((byte)-24);
      var0.field5850.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lpg;ZZ)V")
   @ObfuscatedName("ac")
   public void method10292(classPG var1, boolean var2, boolean var3) {
      if (this.field5856 != null) {
         if (var1.method8866((byte)2) == this.field5856.method8866((byte)2)) {
            return;
         }

         this.method10296(var2, 387864771);
      }

      this.field5856 = var1;
      this.field5858 = var3;

      for (int var4 = 0; var4 < var1.method8869((byte)124); var4++) {
         this.field5849[var4] = null;
      }

      if (var1.method8875(-192129905) > 0) {
         this.field5859 = new long[var1.method8875(-192129905)];
         long var8 = classDD.method2983(16711680);

         for (int var6 = 0; var6 < var1.method8875(-192129905); var6++) {
            int var7 = classIT.method6315(
               var1.method8877(var6, (byte)0).field6784 * 1662242418, var1.method8877(var6, (byte)0).field6783 * -1823764067, -1925061547
            );
            this.field5859[var6] = var7 + var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Lao;I)V")
   @ObfuscatedName("az")
   public void method10290(classVP var1, classAO var2, int var3) {
      try {
         this.field5857 = var1;
         this.field5855 = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpg;ZZI)V")
   @ObfuscatedName("af")
   public void method10293(classPG var1, boolean var2, boolean var3, int var4) {
      try {
         if (this.field5856 != null) {
            if (var4 != 2053173530) {
               throw new IllegalStateException();
            }

            if (var1.method8866((byte)2) == this.field5856.method8866((byte)2)) {
               if (var4 != 2053173530) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method10296(var2, 2047124406);
         }

         this.field5856 = var1;
         this.field5858 = var3;

         for (int var5 = 0; var5 < var1.method8869((byte)85); var5++) {
            if (var4 != 2053173530) {
               throw new IllegalStateException();
            }

            this.field5849[var5] = null;
         }

         if (var1.method8875(-192129905) > 0) {
            if (var4 != 2053173530) {
               throw new IllegalStateException();
            }

            this.field5859 = new long[var1.method8875(-192129905)];
            long var10 = classDD.method2983(16711680);

            for (int var7 = 0; var7 < var1.method8875(-192129905); var7++) {
               if (var4 != 2053173530) {
                  throw new IllegalStateException();
               }

               int var8 = classIT.method6315(
                  var1.method8877(var7, (byte)0).field6784 * 1861224747, var1.method8877(var7, (byte)0).field6783 * -1823764067, 309965552
               );
               this.field5859[var7] = var8 + var10;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "rv.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ae")
   public void method10296(boolean var1, int var2) {
      try {
         if (null != this.field5856) {
            for (int var3 = 0; var3 < this.field5856.method8869((byte)70); var3++) {
               if (var2 == -1025573428) {
                  return;
               }

               if (null != this.field5849[var3]) {
                  if (var2 == -1025573428) {
                     throw new IllegalStateException();
                  }

                  if (var1) {
                     if (var2 == -1025573428) {
                        throw new IllegalStateException();
                     }

                     this.method10306(this.field5849[var3], -1401181198);
                  } else if (classWC.method12304(this.field5849[var3], 120041229) != null) {
                     this.field5855.method618(classWC.method12304(this.field5849[var3], 120041229));
                  }

                  this.field5849[var3] = null;
               }
            }

            for (int var5 = 0; var5 < this.field5856.method8875(-192129905); var5++) {
               if (var2 == -1025573428) {
                  throw new IllegalStateException();
               }

               if (null != this.field5848[var5]) {
                  if (var2 == -1025573428) {
                     throw new IllegalStateException();
                  }

                  if (var1) {
                     if (var2 == -1025573428) {
                        throw new IllegalStateException();
                     }

                     this.method10306(this.field5848[var5], 1852675166);
                  } else if (classWC.method12304(this.field5848[var5], 120041229) != null) {
                     if (var2 == -1025573428) {
                        return;
                     }

                     this.field5855.method618(classWC.method12304(this.field5848[var5], 120041229));
                  }

                  this.field5848[var5] = null;
               }
            }

            this.field5856 = null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ab")
   public void method10299(int var1, byte var2) {
      try {
         if (!this.field5850.isEmpty()) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               Iterator var12 = this.field5850.iterator();

               while (var12.hasNext()) {
                  classWC var14 = (classWC)var12.next();
                  if (var14.method12298(-433946480) == 0) {
                     if (classWC.method12304(var14, 120041229) != null) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        this.field5855.method618(classWC.method12304(var14, 120041229));
                     }

                     var12.remove();
                  } else {
                     var14.method12297((byte)-79);
                  }
               }
            }
         } else if (this.field5856 != null) {
            for (int var3 = 0; var3 < this.field5856.method8869((byte)65); var3++) {
               if (var2 <= 0) {
                  return;
               }

               classWC var4 = this.field5849[var3];
               if (var4 != null) {
                  if (var2 <= 0) {
                     return;
                  }

                  if (classWC.method12304(var4, 120041229) != null) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     var4.method12289(var1, var1, this.field5856.method8880(530502105), 1874267267);
                     var4.method12297((byte)43);
                     continue;
                  }
               }

               this.field5849[var3] = this.method10303(this.field5856.method8873(var3, -21568319), var1, -1, -1721476862);
            }

            for (int var11 = 0; var11 < this.field5856.method8875(-192129905); var11++) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               classWC var13 = this.field5848[var11];
               if (var13 != null) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (classWC.method12304(var13, 120041229) != null) {
                     if (var2 <= 0) {
                        return;
                     }

                     var13.method12289(var1, var1, this.field5856.method8880(881848896), 2020061076);
                     var13.method12297((byte)50);
                     continue;
                  }
               }

               classWW var5 = this.field5856.method8877(var11, (byte)0);
               if (var5 != null) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (null != var5.field6785) {
                     if (var2 <= 0) {
                        return;
                     }

                     long var6 = classDD.method2983(16711680);
                     if (var6 >= this.field5859[var11]) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1 > 0) {
                           if (var2 <= 0) {
                              return;
                           }

                           int var8 = var5.field6785[(int)(Math.random() * var5.field6785.length)];
                           this.field5848[var11] = this.method10303(var8, var1, 0, -1822202006);
                           if (null != this.field5848[var11]) {
                              this.field5848[var11]
                                 .method12294(
                                    var1,
                                    var1,
                                    this.field5856.method8880(804985711).method12327(-1095100093),
                                    this.field5856.method8880(854698690).method12325((byte)33),
                                    1596960535
                                 );
                              this.field5848[var11].method12297((byte)4);
                           }

                           int var9 = classIT.method6315(1861224747 * var5.field6784, var5.field6783 * -1823764067, 1921385445);
                           this.field5859[var11] = var9 + var6;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "rv.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lwc;")
   @ObfuscatedName("ag")
   classWC method10303(int var1, int var2, int var3, int var4) {
      try {
         int var5 = this.field5857.method11868(var1, -1845183590) - 1;
         classAL var6 = classAL.method435(this.field5857, var1, var5);
         if (null != var6) {
            if (var4 >= 988361718) {
               throw new IllegalStateException();
            } else {
               classAJ var7;
               if (0 == var5) {
                  if (var4 >= 988361718) {
                     throw new IllegalStateException();
                  }

                  var7 = var6.method438(this.field5858);
               } else {
                  if (1 != var5) {
                     return null;
                  }

                  if (var4 >= 988361718) {
                     throw new IllegalStateException();
                  }

                  var7 = var6.method443();
               }

               classWC var8 = new classWC(var7, var2, var3);
               if (classWC.method12304(var8, 120041229) == null) {
                  if (var4 >= 988361718) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  this.field5855.method617(classWC.method12304(var8, 120041229));
                  return var8;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "rv.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrv;III)Lwc;")
   @ObfuscatedName("ut")
   public static classWC method10304(classRV var0, int var1, int var2, int var3) {
      int var4 = var0.field5857.method11868(var1, -1476236100) - 1;
      classAL var5 = classAL.method435(var0.field5857, var1, var4);
      if (null != var5) {
         classAJ var6;
         if (0 == var4) {
            var6 = var5.method438(var0.field5858);
         } else {
            if (1 != var4) {
               return null;
            }

            var6 = var5.method443();
         }

         classWC var7 = new classWC(var6, var2, var3);
         if (classWC.method12304(var7, 120041229) == null) {
            return null;
         } else {
            var0.field5855.method617(classWC.method12304(var7, 120041229));
            return var7;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;I)V")
   @ObfuscatedName("as")
   void method10306(classWC var1, int var2) {
      try {
         var1.method12294(
            0,
            var1.method12298(-1755472270),
            this.field5856.method8880(1318887486).method12333((byte)76),
            classWD.method12332(this.field5856.method8880(1701894842), -145399264),
            -777956723
         );
         var1.method12297((byte)55);
         this.field5850.add(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rv.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Lao;)V")
   @ObfuscatedName("ax")
   public void method10291(classVP var1, classAO var2) {
      this.field5857 = var1;
      this.field5855 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public void method10300(int var1) {
      if (!this.field5850.isEmpty()) {
         Iterator var10 = this.field5850.iterator();

         while (var10.hasNext()) {
            classWC var12 = (classWC)var10.next();
            if (var12.method12298(-1627845312) == 0) {
               if (classWC.method12304(var12, 120041229) != null) {
                  this.field5855.method618(classWC.method12304(var12, 120041229));
               }

               var10.remove();
            } else {
               var12.method12297((byte)-57);
            }
         }
      } else if (this.field5856 != null) {
         for (int var2 = 0; var2 < this.field5856.method8869((byte)124); var2++) {
            classWC var3 = this.field5849[var2];
            if (var3 != null && classWC.method12304(var3, 120041229) != null) {
               var3.method12289(var1, var1, this.field5856.method8880(463810449), 1884656411);
               var3.method12297((byte)-78);
            } else {
               this.field5849[var2] = this.method10303(this.field5856.method8873(var2, 1774885302), var1, -1, -1840289314);
            }
         }

         for (int var9 = 0; var9 < this.field5856.method8875(-192129905); var9++) {
            classWC var11 = this.field5848[var9];
            if (var11 != null && classWC.method12304(var11, 120041229) != null) {
               var11.method12289(var1, var1, this.field5856.method8880(2050403053), 2142096633);
               var11.method12297((byte)-41);
            } else {
               classWW var4 = this.field5856.method8877(var9, (byte)0);
               if (var4 != null && null != var4.field6785) {
                  long var5 = classDD.method2983(16711680);
                  if (var5 >= this.field5859[var9] && var1 > 0) {
                     int var7 = var4.field6785[(int)(Math.random() * var4.field6785.length)];
                     this.field5848[var9] = this.method10303(var7, var1, 0, 894732604);
                     if (null != this.field5848[var9]) {
                        this.field5848[var9]
                           .method12294(
                              var1,
                              var1,
                              this.field5856.method8880(1701400838).method12327(-1174354542),
                              this.field5856.method8880(-1064782206).method12325((byte)74),
                              1135225719
                           );
                        this.field5848[var9].method12297((byte)10);
                     }

                     int var8 = classIT.method6315(1861224747 * var4.field6784, var4.field6783 * -1823764067, 1459813555);
                     this.field5859[var9] = var8 + var5;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpg;ZZ)V")
   @ObfuscatedName("aa")
   public void method10294(classPG var1, boolean var2, boolean var3) {
      if (this.field5856 != null) {
         if (var1.method8866((byte)2) == this.field5856.method8866((byte)2)) {
            return;
         }

         this.method10296(var2, 1436660051);
      }

      this.field5856 = var1;
      this.field5858 = var3;

      for (int var4 = 0; var4 < var1.method8869((byte)75); var4++) {
         this.field5849[var4] = null;
      }

      if (var1.method8875(-192129905) > 0) {
         this.field5859 = new long[var1.method8875(-192129905)];
         long var8 = classDD.method2983(16711680);

         for (int var6 = 0; var6 < var1.method8875(-192129905); var6++) {
            int var7 = classIT.method6315(
               var1.method8877(var6, (byte)0).field6784 * 1861224747, var1.method8877(var6, (byte)0).field6783 * -1823764067, -1371640211
            );
            this.field5859[var6] = var7 + var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("al")
   public void method10297(boolean var1) {
      if (null != this.field5856) {
         for (int var2 = 0; var2 < this.field5856.method8869((byte)84); var2++) {
            if (null != this.field5849[var2]) {
               if (var1) {
                  this.method10306(this.field5849[var2], -682134017);
               } else if (classWC.method12304(this.field5849[var2], 120041229) != null) {
                  this.field5855.method618(classWC.method12304(this.field5849[var2], 120041229));
               }

               this.field5849[var2] = null;
            }
         }

         for (int var3 = 0; var3 < this.field5856.method8875(-192129905); var3++) {
            if (null != this.field5848[var3]) {
               if (var1) {
                  this.method10306(this.field5848[var3], 2025263114);
               } else if (classWC.method12304(this.field5848[var3], 120041229) != null) {
                  this.field5855.method618(classWC.method12304(this.field5848[var3], 120041229));
               }

               this.field5848[var3] = null;
            }
         }

         this.field5856 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   public void method10301(int var1) {
      if (!this.field5850.isEmpty()) {
         Iterator var10 = this.field5850.iterator();

         while (var10.hasNext()) {
            classWC var12 = (classWC)var10.next();
            if (var12.method12298(-40593813) == 0) {
               if (classWC.method12304(var12, 120041229) != null) {
                  this.field5855.method618(classWC.method12304(var12, 120041229));
               }

               var10.remove();
            } else {
               var12.method12297((byte)-53);
            }
         }
      } else if (this.field5856 != null) {
         for (int var2 = 0; var2 < this.field5856.method8869((byte)87); var2++) {
            classWC var3 = this.field5849[var2];
            if (var3 != null && classWC.method12304(var3, 120041229) != null) {
               var3.method12289(var1, var1, this.field5856.method8880(-1791054698), 1841381729);
               var3.method12297((byte)114);
            } else {
               this.field5849[var2] = this.method10303(this.field5856.method8873(var2, -1522190981), var1, -1, -1082416350);
            }
         }

         for (int var9 = 0; var9 < this.field5856.method8875(-192129905); var9++) {
            classWC var11 = this.field5848[var9];
            if (var11 != null && classWC.method12304(var11, 120041229) != null) {
               var11.method12289(var1, var1, this.field5856.method8880(-528275792), 2078769831);
               var11.method12297((byte)55);
            } else {
               classWW var4 = this.field5856.method8877(var9, (byte)0);
               if (var4 != null && null != var4.field6785) {
                  long var5 = classDD.method2983(16711680);
                  if (var5 >= this.field5859[var9] && var1 > 0) {
                     int var7 = var4.field6785[(int)(Math.random() * var4.field6785.length)];
                     this.field5848[var9] = this.method10303(var7, var1, 0, 954404396);
                     if (null != this.field5848[var9]) {
                        this.field5848[var9]
                           .method12294(
                              var1,
                              var1,
                              this.field5856.method8880(-1282030007).method12327(-3680128),
                              this.field5856.method8880(-149596976).method12325((byte)56),
                              -1594457878
                           );
                        this.field5848[var9].method12297((byte)-77);
                     }

                     int var8 = classIT.method6315(1861224747 * var4.field6784, var4.field6783 * -1823764067, 2110517802);
                     this.field5859[var9] = var8 + var5;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aj")
   public void method10298(boolean var1) {
      if (null != this.field5856) {
         for (int var2 = 0; var2 < this.field5856.method8869((byte)96); var2++) {
            if (null != this.field5849[var2]) {
               if (var1) {
                  this.method10306(this.field5849[var2], 1690745559);
               } else if (classWC.method12304(this.field5849[var2], 120041229) != null) {
                  this.field5855.method618(classWC.method12304(this.field5849[var2], 120041229));
               }

               this.field5849[var2] = null;
            }
         }

         for (int var3 = 0; var3 < this.field5856.method8875(-192129905); var3++) {
            if (null != this.field5848[var3]) {
               if (var1) {
                  this.method10306(this.field5848[var3], 1335840193);
               } else if (classWC.method12304(this.field5848[var3], 120041229) != null) {
                  this.field5855.method618(classWC.method12304(this.field5848[var3], 120041229));
               }

               this.field5848[var3] = null;
            }
         }

         this.field5856 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpg;ZZ)V")
   @ObfuscatedName("ao")
   public void method10295(classPG var1, boolean var2, boolean var3) {
      if (this.field5856 != null) {
         if (var1.method8866((byte)2) == this.field5856.method8866((byte)2)) {
            return;
         }

         this.method10296(var2, 638031046);
      }

      this.field5856 = var1;
      this.field5858 = var3;

      for (int var4 = 0; var4 < var1.method8869((byte)88); var4++) {
         this.field5849[var4] = null;
      }

      if (var1.method8875(-192129905) > 0) {
         this.field5859 = new long[var1.method8875(-192129905)];
         long var8 = classDD.method2983(16711680);

         for (int var6 = 0; var6 < var1.method8875(-192129905); var6++) {
            int var7 = classIT.method6315(
               var1.method8877(var6, (byte)0).field6784 * -1296940717, var1.method8877(var6, (byte)0).field6783 * -1823764067, -358676291
            );
            this.field5859[var6] = var7 + var8;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)Z")
   @ObfuscatedName("kr")
   public static boolean method10308(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method9438();
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method10302(int var1) {
      if (!this.field5850.isEmpty()) {
         Iterator var10 = this.field5850.iterator();

         while (var10.hasNext()) {
            classWC var12 = (classWC)var10.next();
            if (var12.method12298(-468597562) == 0) {
               if (classWC.method12304(var12, 120041229) != null) {
                  this.field5855.method618(classWC.method12304(var12, 120041229));
               }

               var10.remove();
            } else {
               var12.method12297((byte)-52);
            }
         }
      } else if (this.field5856 != null) {
         for (int var2 = 0; var2 < this.field5856.method8869((byte)115); var2++) {
            classWC var3 = this.field5849[var2];
            if (var3 != null && classWC.method12304(var3, 120041229) != null) {
               var3.method12289(var1, var1, this.field5856.method8880(-1612172406), 2087623526);
               var3.method12297((byte)1);
            } else {
               this.field5849[var2] = this.method10303(this.field5856.method8873(var2, -254296276), var1, -1, 716533035);
            }
         }

         for (int var9 = 0; var9 < this.field5856.method8875(-192129905); var9++) {
            classWC var11 = this.field5848[var9];
            if (var11 != null && classWC.method12304(var11, 120041229) != null) {
               var11.method12289(var1, var1, this.field5856.method8880(515509743), 1993251071);
               var11.method12297((byte)-76);
            } else {
               classWW var4 = this.field5856.method8877(var9, (byte)0);
               if (var4 != null && null != var4.field6785) {
                  long var5 = classDD.method2983(16711680);
                  if (var5 >= this.field5859[var9] && var1 > 0) {
                     int var7 = var4.field6785[(int)(Math.random() * var4.field6785.length)];
                     this.field5848[var9] = this.method10303(var7, var1, 0, -166637560);
                     if (null != this.field5848[var9]) {
                        this.field5848[var9]
                           .method12294(
                              var1,
                              var1,
                              this.field5856.method8880(-6662426).method12327(672291611),
                              this.field5856.method8880(1372424398).method12325((byte)45),
                              844571001
                           );
                        this.field5848[var9].method12297((byte)-26);
                     }

                     int var8 = classIT.method6315(1861224747 * var4.field6784, var4.field6783 * -1200249787, 1937377641);
                     this.field5859[var9] = var8 + var5;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;)V")
   @ObfuscatedName("ai")
   void method10307(classWC var1) {
      var1.method12294(
         0,
         var1.method12298(252402109),
         this.field5856.method8880(1263011861).method12333((byte)71),
         classWD.method12332(this.field5856.method8880(1601755666), 205116196),
         -2125913153
      );
      var1.method12297((byte)-15);
      this.field5850.add(var1);
   }
}
