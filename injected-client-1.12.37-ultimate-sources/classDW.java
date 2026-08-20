import net.runelite.api.AmbientSoundEffect;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dw")
public abstract class classDW extends classVQ implements AmbientSoundEffect {
   @ObfuscatedSignature(descriptor = "Lzl;")
   @ObfuscatedName("au")
   static final classZL field1646 = classZL.field7194;
   @ObfuscatedName("ax")
   int field1648;
   @ObfuscatedName("ac")
   int field1647;
   @ObfuscatedSignature(descriptor = "Lww;")
   @ObfuscatedName("aj")
   classWW field1642;
   @ObfuscatedSignature(descriptor = "Lwj;")
   @ObfuscatedName("ao")
   classWJ field1653;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("aa")
   classWC field1651;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ad")
   static final classNN field1645 = new classNN();
   @ObfuscatedName("ay")
   int field1644;
   @ObfuscatedName("aq")
   boolean field1643 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field1649 = 62;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field1650 = 77;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("al")
   classWC field1652;
   @ObfuscatedName("as")
   final int field1641;

   @ObfuscatedSignature(descriptor = "(IIIIIIIZI)V")
   @ObfuscatedName("ak")
   void method3638(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      try {
         int var10 = classEA.method3800((byte)18);
         if (this.field1643) {
            if (var9 != -317896765) {
               throw new IllegalStateException();
            } else {
               if (this.method3634(2028765609)) {
                  if (var9 != -317896765) {
                     throw new IllegalStateException();
                  }

                  this.field1643 = false;
               }
            }
         } else {
            if (-1 == -1727985133 * this.field1653.field6689) {
               if (var9 != -317896765) {
                  throw new IllegalStateException();
               }

               if (null != this.field1642) {
                  if (var9 != -317896765) {
                     throw new IllegalStateException();
                  }

                  if (this.field1642.field6785 == null) {
                     if (var9 != -317896765) {
                        return;
                     }

                     return;
                  }
               }
            }

            if (var10 != 0) {
               if (var9 != -317896765) {
                  throw new IllegalStateException();
               }

               if (var8) {
                  int var11 = classCL.method1628(var1, var2, var3, var4, var5, var6, -2135106240);
                  if (var11 > this.field1648 * -1766162897) {
                     this.method3654(1940029505);
                     return;
                  }

                  double var12;
                  if (this.field1647 * -875852501 < this.field1648 * -1766162897) {
                     if (var9 != -317896765) {
                        return;
                     }

                     var12 = classIC.method6141(
                        this.field1648 * -1766162897 - var11,
                        this.field1648 * -1766162897 - this.field1647 * -875852501,
                        this.field1653.field6687.method12338(900016178),
                        (byte)64
                     );
                  } else {
                     var12 = 1.0;
                  }

                  int var14 = (int)Math.ceil(var12 * var10);
                  if (null != this.field1652) {
                     if (var9 != -317896765) {
                        throw new IllegalStateException();
                     }

                     this.method3652(this.field1652, var14, var10, (byte)117);
                  } else if (this.field1653.field6689 * -1727985133 >= 0) {
                     if (var9 != -317896765) {
                        return;
                     }

                     if (var14 > 0) {
                        if (var9 != -317896765) {
                           throw new IllegalStateException();
                        }

                        this.field1652 = this.method3650(-1727985133 * this.field1653.field6689, var14, -1, (byte)-22);
                     }
                  }

                  if (this.field1651 != null) {
                     if (var9 != -317896765) {
                        return;
                     }

                     if (classWC.method12304(this.field1651, 120041229) != null) {
                        if (var9 != -317896765) {
                           return;
                        }

                        this.method3652(this.field1651, var14, var10, (byte)9);
                        return;
                     }
                  }

                  if (null != this.field1642) {
                     if (var9 != -317896765) {
                        return;
                     }

                     if (this.field1642.field6785 != null) {
                        if (var9 != -317896765) {
                           throw new IllegalStateException();
                        }

                        if ((this.field1644 -= var7 * 1652054587) * 371683059 <= 0) {
                           if (var9 != -317896765) {
                              throw new IllegalStateException();
                           }

                           if (var14 > 0) {
                              int var15 = this.field1642.field6785[(int)(Math.random() * this.field1642.field6785.length)];
                              this.field1651 = this.method3650(var15, var14, 0, (byte)102);
                              if (null != this.field1651) {
                                 this.field1651
                                    .method12294(
                                       var14,
                                       var10,
                                       this.field1653.field6687.method12327(-651765444),
                                       this.field1653.field6687.method12325((byte)31),
                                       1100996272
                                    );
                                 this.field1651.method12297((byte)-69);
                              }

                              this.field1644 = classIT.method6315(this.field1642.field6784 * 1861224747, -1823764067 * this.field1642.field6783, -1658390328)
                                 * 1652054587;
                           }
                        }
                     }
                  }

                  return;
               }

               if (var9 != -317896765) {
                  throw new IllegalStateException();
               }
            }

            if (null != this.field1652) {
               this.field1652.method12294(0, var10, 150, field1646, 2053763897);
               this.field1652.method12297((byte)-47);
            }

            if (null != this.field1651) {
               this.field1651.method12294(0, var10, 150, field1646, -137855803);
               this.field1651.method12297((byte)-88);
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "dw.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   boolean method3634(int var1) {
      try {
         this.method3654(1411566915);
         if (null != this.field1652 && this.field1652.method12298(332372396) == 0) {
            this.method3659(this.field1652, 826643967);
            this.field1652 = null;
         }

         if (null != this.field1651) {
            if (var1 <= 836200180) {
               throw new IllegalStateException();
            }

            if (this.field1651.method12298(-97982290) == 0) {
               if (var1 <= 836200180) {
                  throw new IllegalStateException();
               }

               this.method3659(this.field1651, 826643967);
               this.field1651 = null;
            }
         }

         if (null == this.field1652) {
            if (var1 <= 836200180) {
               throw new IllegalStateException();
            }

            if (this.field1651 == null) {
               if (var1 <= 836200180) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.aw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("bf")
   static int method3643(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = classIZ.method6338(var0, var1, var2, var3, var4, var5, -1589544329);
      return Math.max(var6 - 64, 0);
   }

   @ObfuscatedSignature(descriptor = "(Lwc;II)V")
   @ObfuscatedName("bv")
   void method3651(classWC var1, int var2, int var3) {
      var1.method12297((byte)-7);
      var1.method12289(var2, var3, this.field1653.field6687, 2008698017);
      var1.method12297((byte)-3);
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Lwc;")
   @ObfuscatedName("an")
   classWC method3650(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = classTZ.field6273.method11868(var1, -1637846082) - 1;
         classAL var6 = classAL.method435(classTZ.field6273, var1, var5);
         if (null != var6) {
            classAJ var7;
            if (var5 == 0) {
               if (var4 == 56) {
                  throw new IllegalStateException();
               }

               var7 = var6.method438(classCY.method2824(classAB.field122, 197040242));
            } else {
               if (var5 != 1) {
                  return null;
               }

               var7 = var6.method443();
            }

            classWC var8 = new classWC(var7, var2, var3);
            if (classWC.method12304(var8, 120041229) == null) {
               if (var4 == 56) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               classQO.field5580.method617(classWC.method12304(var8, 120041229));
               return var8;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "dw.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;IIB)V")
   @ObfuscatedName("am")
   void method3652(classWC var1, int var2, int var3, byte var4) {
      try {
         var1.method12297((byte)36);
         var1.method12289(var2, var3, this.field1653.field6687, 1877069434);
         var1.method12297((byte)11);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dw.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   void method3654(int var1) {
      try {
         if (this.field1653 == null) {
            if (var1 > 721877044) {
               ;
            }
         } else {
            classWD var2 = this.field1653.field6687;
            if (null != this.field1652) {
               if (var1 <= 721877044) {
                  throw new IllegalStateException();
               }

               this.field1652
                  .method12294(0, this.field1652.method12298(-2079214722), var2.method12333((byte)-26), classWD.method12332(var2, -1868524944), -667286928);
               this.field1652.method12297((byte)-38);
            }

            if (null != this.field1651) {
               if (var1 <= 721877044) {
                  throw new IllegalStateException();
               }

               this.field1651
                  .method12294(0, this.field1651.method12298(-36021692), var2.method12333((byte)57), classWD.method12332(var2, 358370578), -372632873);
               this.field1651.method12297((byte)23);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dw.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;I)V")
   @ObfuscatedName("bn")
   void method3659(classWC var1, int var2) {
      try {
         if (null != var1) {
            if (var2 != 826643967) {
               throw new IllegalStateException();
            }

            if (classWC.method12304(var1, 120041229) != null) {
               classQO.field5580.method618(classWC.method12304(var1, 120041229));
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dw.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   void method3662(int var1) {
      try {
         classNN.method7900(field1645, this);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   void method3655() {
      if (this.field1653 != null) {
         classWD var1 = this.field1653.field6687;
         if (null != this.field1652) {
            this.field1652
               .method12294(0, this.field1652.method12298(-1321201890), var1.method12333((byte)-50), classWD.method12332(var1, 1305296700), 366127353);
            this.field1652.method12297((byte)-83);
         }

         if (null != this.field1651) {
            this.field1651
               .method12294(0, this.field1651.method12298(-1924792783), var1.method12333((byte)-60), classWD.method12332(var1, 637590000), -802230290);
            this.field1651.method12297((byte)-65);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   abstract int vmethod194(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   abstract int vmethod197(int var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   abstract void vmethod193();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   int method3665(int var1) {
      try {
         return this.field1653 != null ? this.field1653.field6689 * -1727985133 : -1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.bc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;)V")
   @ObfuscatedName("ct")
   void method3660(classWC var1) {
      if (null != var1 && classWC.method12304(var1, 120041229) != null) {
         classQO.field5580.method618(classWC.method12304(var1, 120041229));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("br")
   int method3669(int var1) {
      try {
         return this.field1648 * -1766162897;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.br(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   abstract int vmethod205(int var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gr")
   @Override
   public void vmethod398() {
      try {
         super.vmethod398();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dw.gr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   abstract int vmethod202(int var1);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   boolean method3635() {
      this.method3654(1062476384);
      if (null != this.field1652 && this.field1652.method12298(-873369617) == 0) {
         this.method3659(this.field1652, 826643967);
         this.field1652 = null;
      }

      if (null != this.field1651 && this.field1651.method12298(-44216448) == 0) {
         this.method3659(this.field1651, 826643967);
         this.field1651 = null;
      }

      return null == this.field1652 && this.field1651 == null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bm")
   int method3671(int var1) {
      try {
         return this.field1647 * -875852501;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.bm(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)Ljava/lang/String;")
   @ObfuscatedName("qp")
   public static String method3673(classDW var0) {
      return var0 == null ? var0.method3674() : var0.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method3674() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   abstract void vmethod190();

   public int getSoundEffectId() {
      return this.field1653.field6689 * -1727985133;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   abstract void vmethod191();

   @Override
   public String toString() {
      try {
         return super.toString();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dw.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   abstract void vmethod192();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   abstract int vmethod196();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   int method3666() {
      return 1995575523 * this.field1641;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   abstract int vmethod195();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   abstract int vmethod199();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   abstract int vmethod200();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)V")
   @ObfuscatedName("ap")
   public static void method3656(classDW var0) {
      if (var0.field1653 != null) {
         classWD var1 = var0.field1653.field6687;
         if (null != var0.field1652) {
            var0.field1652
               .method12294(0, var0.field1652.method12298(-1620503145), var1.method12333((byte)-45), classWD.method12332(var1, 388328350), -676047776);
            var0.field1652.method12297((byte)-35);
         }

         if (null != var0.field1651) {
            var0.field1651.method12294(0, var0.field1651.method12298(1251441133), var1.method12333((byte)8), classWD.method12332(var1, 760323860), -1426355550);
            var0.field1651.method12297((byte)31);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   abstract int vmethod203();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   abstract int vmethod206();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   abstract int vmethod204();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   static void method3630() {
      for (classDW var0 = (classDW)field1645.method7915(); var0 != null; var0 = (classDW)classNN.method7924(field1645)) {
         if (var0.method3634(1040567269)) {
            var0.vmethod398();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   static void method3631() {
      for (classDW var0 = (classDW)field1645.method7915(); var0 != null; var0 = (classDW)classNN.method7924(field1645)) {
         if (var0.method3634(1389470177)) {
            var0.vmethod398();
         }
      }
   }

   public int[] getBackgroundSoundEffectIds() {
      return this.field1642.field6785;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   static void method3632() {
      for (classDW var0 = (classDW)field1645.method7915(); var0 != null; var0 = (classDW)classNN.method7924(field1645)) {
         if (var0.method3634(931809131)) {
            var0.vmethod398();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   static void method3633() {
      for (classDW var0 = (classDW)field1645.method7915(); var0 != null; var0 = (classDW)classNN.method7924(field1645)) {
         if (var0.method3634(1046166903)) {
            var0.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bo")
   boolean method3636() {
      this.method3654(1086047683);
      if (null != this.field1652 && this.field1652.method12298(-612117624) == 0) {
         this.method3659(this.field1652, 826643967);
         this.field1652 = null;
      }

      if (null != this.field1651 && this.field1651.method12298(-1424071566) == 0) {
         this.method3659(this.field1651, 826643967);
         this.field1651 = null;
      }

      return null == this.field1652 && this.field1651 == null;
   }

   public int getPlane() {
      return this.field1641 * 1995575523;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("by")
   static int method3644(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = classIZ.method6338(var0, var1, var2, var3, var4, var5, -1277969903);
      return Math.max(var6 - 232842550, 0);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIZ)V")
   @ObfuscatedName("bw")
   void method3639(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = classEA.method3800((byte)-7);
      if (this.field1643) {
         if (this.method3634(978640030)) {
            this.field1643 = false;
         }
      } else if (-1 != -1727985133 * this.field1653.field6689 || null == this.field1642 || this.field1642.field6785 != null) {
         if (var9 != 0 && var8) {
            int var10 = classCL.method1628(var1, var2, var3, var4, var5, var6, -1877872796);
            if (var10 > this.field1648 * -1766162897) {
               this.method3654(2038043865);
            } else {
               double var11;
               if (this.field1647 * -875852501 < this.field1648 * -1766162897) {
                  var11 = classIC.method6141(
                     this.field1648 * -1766162897 - var10,
                     this.field1648 * -1766162897 - this.field1647 * -875852501,
                     this.field1653.field6687.method12338(984296783),
                     (byte)64
                  );
               } else {
                  var11 = 1.0;
               }

               int var13 = (int)Math.ceil(var11 * var9);
               if (null != this.field1652) {
                  this.method3652(this.field1652, var13, var9, (byte)12);
               } else if (this.field1653.field6689 * -1727985133 >= 0 && var13 > 0) {
                  this.field1652 = this.method3650(-1727985133 * this.field1653.field6689, var13, -1, (byte)61);
               }

               if (this.field1651 != null && classWC.method12304(this.field1651, 120041229) != null) {
                  this.method3652(this.field1651, var13, var9, (byte)23);
               } else if (null != this.field1642 && this.field1642.field6785 != null && (this.field1644 -= var7 * 1652054587) * 371683059 <= 0 && var13 > 0) {
                  int var14 = this.field1642.field6785[(int)(Math.random() * this.field1642.field6785.length)];
                  this.field1651 = this.method3650(var14, var13, 0, (byte)-12);
                  if (null != this.field1651) {
                     this.field1651
                        .method12294(var13, var9, this.field1653.field6687.method12327(-100460695), this.field1653.field6687.method12325((byte)8), -587619717);
                     this.field1651.method12297((byte)-107);
                  }

                  this.field1644 = classIT.method6315(this.field1642.field6784 * 1861224747, -1823764067 * this.field1642.field6783, 1840907776) * 1652054587;
               }
            }
         } else {
            if (null != this.field1652) {
               this.field1652.method12294(0, var9, 150, field1646, -356348602);
               this.field1652.method12297((byte)-94);
            }

            if (null != this.field1651) {
               this.field1651.method12294(0, var9, 150, field1646, 876507658);
               this.field1651.method12297((byte)24);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   abstract int vmethod198();

   @ObfuscatedSignature(descriptor = "(IIIIIIIZ)V")
   @ObfuscatedName("bi")
   void method3640(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = classEA.method3800((byte)59);
      if (this.field1643) {
         if (this.method3634(1293879766)) {
            this.field1643 = false;
         }
      } else if (-1 != -1727985133 * this.field1653.field6689 || null == this.field1642 || this.field1642.field6785 != null) {
         if (var9 != 0 && var8) {
            int var10 = classCL.method1628(var1, var2, var3, var4, var5, var6, -1699666983);
            if (var10 > this.field1648 * -1766162897) {
               this.method3654(1903028359);
            } else {
               double var11;
               if (this.field1647 * -875852501 < this.field1648 * -1766162897) {
                  var11 = classIC.method6141(
                     this.field1648 * -1766162897 - var10,
                     this.field1648 * -1766162897 - this.field1647 * -875852501,
                     this.field1653.field6687.method12338(2069009348),
                     (byte)64
                  );
               } else {
                  var11 = 1.0;
               }

               int var13 = (int)Math.ceil(var11 * var9);
               if (null != this.field1652) {
                  this.method3652(this.field1652, var13, var9, (byte)50);
               } else if (this.field1653.field6689 * -1727985133 >= 0 && var13 > 0) {
                  this.field1652 = this.method3650(-1727985133 * this.field1653.field6689, var13, -1, (byte)69);
               }

               if (this.field1651 != null && classWC.method12304(this.field1651, 120041229) != null) {
                  this.method3652(this.field1651, var13, var9, (byte)79);
               } else if (null != this.field1642 && this.field1642.field6785 != null && (this.field1644 -= var7 * 1652054587) * 371683059 <= 0 && var13 > 0) {
                  int var14 = this.field1642.field6785[(int)(Math.random() * this.field1642.field6785.length)];
                  this.field1651 = this.method3650(var14, var13, 0, (byte)-18);
                  if (null != this.field1651) {
                     this.field1651
                        .method12294(var13, var9, this.field1653.field6687.method12327(528015592), this.field1653.field6687.method12325((byte)14), -224308325);
                     this.field1651.method12297((byte)-77);
                  }

                  this.field1644 = classIT.method6315(this.field1642.field6784 * 1861224747, -1823764067 * this.field1642.field6783, -913992954) * 1652054587;
               }
            }
         } else {
            if (null != this.field1652) {
               this.field1652.method12294(0, var9, 150, field1646, 321215234);
               this.field1652.method12297((byte)-20);
            }

            if (null != this.field1651) {
               this.field1651.method12294(0, var9, 150, field1646, 1681895998);
               this.field1651.method12297((byte)12);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   abstract void vmethod189(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   abstract int vmethod201();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("bq")
   static int method3645(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = classIZ.method6338(var0, var1, var2, var3, var4, var5, -1373185982);
      return Math.max(var6 - 64, 0);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIZ)V")
   @ObfuscatedName("be")
   void method3641(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = classEA.method3800((byte)97);
      if (this.field1643) {
         if (this.method3634(2112160538)) {
            this.field1643 = false;
         }
      } else if (-1 != 1161259135 * this.field1653.field6689 || null == this.field1642 || this.field1642.field6785 != null) {
         if (var9 != 0 && var8) {
            int var10 = classCL.method1628(var1, var2, var3, var4, var5, var6, 1047750096);
            if (var10 > this.field1648 * -1766162897) {
               this.method3654(1676105596);
            } else {
               double var11;
               if (this.field1647 * 1973474334 < this.field1648 * 2074955993) {
                  var11 = classIC.method6141(
                     this.field1648 * -1616992666 - var10,
                     this.field1648 * -918204251 - this.field1647 * -875852501,
                     this.field1653.field6687.method12338(1809335950),
                     (byte)64
                  );
               } else {
                  var11 = 1.0;
               }

               int var13 = (int)Math.ceil(var11 * var9);
               if (null != this.field1652) {
                  this.method3652(this.field1652, var13, var9, (byte)32);
               } else if (this.field1653.field6689 * -1727985133 >= 0 && var13 > 0) {
                  this.field1652 = this.method3650(-1727985133 * this.field1653.field6689, var13, -1, (byte)11);
               }

               if (this.field1651 != null && classWC.method12304(this.field1651, 120041229) != null) {
                  this.method3652(this.field1651, var13, var9, (byte)4);
               } else if (null != this.field1642 && this.field1642.field6785 != null && (this.field1644 -= var7 * 1652054587) * 371683059 <= 0 && var13 > 0) {
                  int var14 = this.field1642.field6785[(int)(Math.random() * this.field1642.field6785.length)];
                  this.field1651 = this.method3650(var14, var13, 0, (byte)5);
                  if (null != this.field1651) {
                     this.field1651
                        .method12294(var13, var9, this.field1653.field6687.method12327(1655368514), this.field1653.field6687.method12325((byte)19), -1330803375);
                     this.field1651.method12297((byte)-2);
                  }

                  this.field1644 = classIT.method6315(this.field1642.field6784 * 1861224747, -1823764067 * this.field1642.field6783, -1694781495) * 1493326758;
               }
            }
         } else {
            if (null != this.field1652) {
               this.field1652.method12294(0, var9, 150, field1646, 147272855);
               this.field1652.method12297((byte)-56);
            }

            if (null != this.field1651) {
               this.field1651.method12294(0, var9, 150, field1646, 119456063);
               this.field1651.method12297((byte)8);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwj;Lww;)V")
   @ObfuscatedName("bs")
   void method3646(classWJ var1, classWW var2) {
      if (null != var1) {
         this.field1653 = var1;
         this.field1648 = classKY.method6605(1535961601 * var1.field6686, -182725428) * -1362786097;
         this.field1647 = classKY.method6605(-2063946921 * var1.field6688, 1850738940) * 788580739;
      }

      if (var2 != null) {
         this.field1642 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwj;Lww;)V")
   @ObfuscatedName("bd")
   void method3647(classWJ var1, classWW var2) {
      if (null != var1) {
         this.field1653 = var1;
         this.field1648 = classKY.method6605(1535961601 * var1.field6686, 217170018) * -1362786097;
         this.field1647 = classKY.method6605(-2063946921 * var1.field6688, -200153630) * 788580739;
      }

      if (var2 != null) {
         this.field1642 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldw;Lwj;Lww;B)V")
   @ObfuscatedName("kn")
   public static void method3648(classDW var0, classWJ var1, classWW var2, byte var3) {
      if (var0 == null) {
         var0.method3649(var1, var2, var3);
      } else {
         try {
            if (null != var1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var0.field1653 = var1;
               var0.field1648 = classKY.method6605(1535961601 * var1.field6686, 346918112) * -1362786097;
               var0.field1647 = classKY.method6605(-2063946921 * var1.field6688, 1426498609) * 788580739;
            }

            if (var2 != null) {
               var0.field1642 = var2;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "dw.at(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)Ljava/lang/String;")
   @ObfuscatedName("cs")
   public static String method3675(classDW var0) {
      if (var0 == null) {
         var0.method3677();
      }

      return var0.toString();
   }

   @ObfuscatedSignature(descriptor = "(Lwc;)V")
   @ObfuscatedName("cb")
   void method3661(classWC var1) {
      if (null != var1 && classWC.method12304(var1, 120041229) != null) {
         classQO.field5580.method618(classWC.method12304(var1, 120041229));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)Z")
   @ObfuscatedName("qy")
   public static boolean method3637(classDW var0) {
      if (var0 == null) {
         var0.vmethod400();
      }

      var0.method3654(1572990823);
      if (null != var0.field1652 && var0.field1652.method12298(1017513061) == 0) {
         var0.method3659(var0.field1652, 826643967);
         var0.field1652 = null;
      }

      if (null != var0.field1651 && var0.field1651.method12298(-1439076916) == 0) {
         var0.method3659(var0.field1651, 826643967);
         var0.field1651 = null;
      }

      return null == var0.field1652 && var0.field1651 == null;
   }

   classDW(int var1, classWJ var2, classWW var3) {
      this.field1641 = -2052082485 * var1;
      method3648(this, var2, var3, (byte)-49);
      if (this.field1642 != null && null != this.field1642.field6785) {
         this.field1644 = classIT.method6315(var3.field6784 * 1861224747, var3.field6783 * -1823764067, 749176852) * 1652054587;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;II)V")
   @ObfuscatedName("bl")
   void method3653(classWC var1, int var2, int var3) {
      var1.method12297((byte)5);
      var1.method12289(var2, var3, this.field1653.field6687, 1921728525);
      var1.method12297((byte)16);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("on")
   public void method3677() {
      this.vmethod189(-380921692);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   void method3657() {
      if (this.field1653 != null) {
         classWD var1 = this.field1653.field6687;
         if (null != this.field1652) {
            this.field1652.method12294(0, this.field1652.method12298(1338975808), var1.method12333((byte)60), classWD.method12332(var1, 255981186), -875112930);
            this.field1652.method12297((byte)-54);
         }

         if (null != this.field1651) {
            this.field1651
               .method12294(0, this.field1651.method12298(-1909691864), var1.method12333((byte)-22), classWD.method12332(var1, -689636019), 1811085276);
            this.field1651.method12297((byte)19);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   void method3658() {
      if (this.field1653 != null) {
         classWD var1 = this.field1653.field6687;
         if (null != this.field1652) {
            this.field1652
               .method12294(0, this.field1652.method12298(-1061610803), var1.method12333((byte)71), classWD.method12332(var1, -1034878819), 1959552651);
            this.field1652.method12297((byte)-10);
         }

         if (null != this.field1651) {
            this.field1651.method12294(0, this.field1651.method12298(-604338632), var1.method12333((byte)4), classWD.method12332(var1, -769246965), 90498914);
            this.field1651.method12297((byte)0);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   int method3667(int var1) {
      try {
         return 1995575523 * this.field1641;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dw.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   void method3663() {
      classNN.method7900(field1645, this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cq")
   void method3664() {
      classNN.method7900(field1645, this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   int method3668() {
      return 1995575523 * this.field1641;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIZ)V")
   @ObfuscatedName("bb")
   void method3642(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = classEA.method3800((byte)45);
      if (this.field1643) {
         if (this.method3634(905272872)) {
            this.field1643 = false;
         }
      } else if (-1 != -1727985133 * this.field1653.field6689 || null == this.field1642 || this.field1642.field6785 != null) {
         if (var9 != 0 && var8) {
            int var10 = classCL.method1628(var1, var2, var3, var4, var5, var6, 201966252);
            if (var10 > this.field1648 * -1766162897) {
               this.method3654(1808612347);
            } else {
               double var11;
               if (this.field1647 * -875852501 < this.field1648 * -1331620499) {
                  var11 = classIC.method6141(
                     this.field1648 * -1766162897 - var10,
                     this.field1648 * 49196164 - this.field1647 * -875852501,
                     this.field1653.field6687.method12338(730244766),
                     (byte)64
                  );
               } else {
                  var11 = 1.0;
               }

               int var13 = (int)Math.ceil(var11 * var9);
               if (null != this.field1652) {
                  this.method3652(this.field1652, var13, var9, (byte)90);
               } else if (this.field1653.field6689 * -1615483551 >= 0 && var13 > 0) {
                  this.field1652 = this.method3650(-1989997505 * this.field1653.field6689, var13, -1, (byte)107);
               }

               if (this.field1651 != null && classWC.method12304(this.field1651, 120041229) != null) {
                  this.method3652(this.field1651, var13, var9, (byte)82);
               } else if (null != this.field1642 && this.field1642.field6785 != null && (this.field1644 -= var7 * 1652054587) * -861698674 <= 0 && var13 > 0) {
                  int var14 = this.field1642.field6785[(int)(Math.random() * this.field1642.field6785.length)];
                  this.field1651 = this.method3650(var14, var13, 0, (byte)-71);
                  if (null != this.field1651) {
                     this.field1651
                        .method12294(
                           var13, var9, this.field1653.field6687.method12327(-1398242749), this.field1653.field6687.method12325((byte)62), -1389908939
                        );
                     this.field1651.method12297((byte)-63);
                  }

                  this.field1644 = classIT.method6315(this.field1642.field6784 * 1380628973, -1823764067 * this.field1642.field6783, 1414496214) * -1511514849;
               }
            }
         } else {
            if (null != this.field1652) {
               this.field1652.method12294(0, var9, 1239063122, field1646, 676113529);
               this.field1652.method12297((byte)-89);
            }

            if (null != this.field1651) {
               this.field1651.method12294(0, var9, -1611420403, field1646, -195666947);
               this.field1651.method12297((byte)26);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   int method3672() {
      return this.field1647 * 267687475;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gu")
   @Override
   public void vmethod399() {
      super.vmethod398();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gf")
   @Override
   public void vmethod400() {
      super.vmethod398();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gh")
   @Override
   public void vmethod401() {
      super.vmethod398();
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lte;IIII)V")
   @ObfuscatedName("aj")
   public static void method3676(classTE var0, classTE var1, int var2, int var3, int var4, int var5) {
      try {
         classCQ.method2572(var0, 301090434);
         classHO.method6078(var1, var0.field6128, (byte)-22);
         int var6 = var0.method10756(-2137488650);
         int var7 = var1.method10756(-214843922);
         if (-1 == var4) {
            if (var5 <= 664753940) {
               throw new IllegalStateException();
            }

            var4 = var0.method10756(-1337154478) - var2;
         }

         if (0 != var4) {
            if (var5 > 664753940) {
               if (var1 == var0) {
                  if (var5 <= 664753940) {
                     return;
                  }

                  if (var2 == var3) {
                     if (var5 <= 664753940) {
                        return;
                     }

                     return;
                  }
               }

               if (var2 >= 0 && var4 + var2 <= var6) {
                  if (var5 <= 664753940) {
                     throw new IllegalStateException();
                  }

                  if (var3 >= 0) {
                     if (var5 <= 664753940) {
                        throw new IllegalStateException();
                     }

                     if (var4 + var3 <= var7) {
                        classMX.method7739(var0, var2, var1, var3, var4, -2142246254);
                        var1.field6133 = true;
                        return;
                     }

                     if (var5 <= 664753940) {
                        return;
                     }
                  }
               }

               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dw.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)I")
   @ObfuscatedName("bv")
   public static int method3670(classDW var0) {
      return var0.field1648 * 55320627;
   }

   @ObfuscatedSignature(descriptor = "(Lwj;Lww;B)V")
   @ObfuscatedName("at")
   void method3649(classWJ var1, classWW var2, byte var3) {
      try {
         if (null != var1) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            this.field1653 = var1;
            this.field1647 = classKY.method6582(1535961601 * var1.field6686, 346918112) * -1362786097;
            this.field1644 = classKY.method6612(-2063946921 * var1.field6688, 1426498609) * 788580739;
         }

         if (var2 != null) {
            this.field1642 = var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   int method3678() {
      return this.field1641 * 1995575523;
   }
}
