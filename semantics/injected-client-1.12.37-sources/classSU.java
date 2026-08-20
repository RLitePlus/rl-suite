import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("su")
public class classSU {
   @ObfuscatedName("ar")
   float[] field6067;
   @ObfuscatedName("av")
   float field6056;
   @ObfuscatedName("ai")
   int field6046;
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("ab")
   classSE field6062;
   @ObfuscatedName("ay")
   float field6058;
   @ObfuscatedName("az")
   boolean field6066;
   @ObfuscatedName("ax")
   float field6057;
   @ObfuscatedName("ac")
   float field6048;
   @ObfuscatedName("ao")
   float field6052;
   @ObfuscatedSignature(descriptor = "[Lsy;")
   @ObfuscatedName("ag")
   classSY[] field6068;
   @ObfuscatedName("aa")
   float field6047;
   @ObfuscatedName("aj")
   float field6050;
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("ae")
   classSE field6063;
   @ObfuscatedName("aq")
   float field6054;
   @ObfuscatedName("ad")
   float field6049;
   @ObfuscatedName("ap")
   float field6053;
   @ObfuscatedName("as")
   boolean field6045 = true;
   @ObfuscatedName("au")
   boolean field6065;
   @ObfuscatedName("al")
   float field6051;
   @ObfuscatedName("aw")
   int field6060;
   @ObfuscatedName("ak")
   int field6059;
   @ObfuscatedName("af")
   boolean field6064;
   @ObfuscatedName("at")
   float field6055;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field6061 = 43;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;)V")
   @ObfuscatedName("wp")
   public static void method10655(classSU var0) {
      var0.field6060 = 1062926601 * var0.field6068[0].field6103;
      var0.field6059 = var0.field6068[var0.method10685((byte)-10) - 1].field6103 * -2049065071;
      var0.field6067 = new float[var0.method10672(1841746750) + 1];

      for (int var1 = method10662(var0, (byte)-78); var1 <= var0.method10666(2112203563); var1++) {
         var0.field6067[var1 - method10662(var0, (byte)-79)] = classGL.method5489(var0, var1, (byte)127);
      }

      var0.field6068 = null;
      var0.field6056 = classGL.method5489(var0, method10662(var0, (byte)-30) - 1, (byte)127);
      var0.field6055 = classGL.method5489(var0, var0.method10666(2112203563) + 1, (byte)127);
   }

   @ObfuscatedSignature(descriptor = "(F)Lsy;")
   @ObfuscatedName("bj")
   classSY method10681(float var1) {
      int var2 = method10676(this, var1, 1056549537);
      return var2 >= 0 && var2 < this.field6068.length ? this.field6068[var2] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)I")
   @ObfuscatedName("az")
   int method10651(Buffer var1, int var2, int var3) {
      try {
         int var4 = Buffer.method13047(var1, 461953608);
         classJR.method6406(Buffer.method13039(var1, -346779531), -1726225436);
         this.field6063 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
         this.field6062 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
         this.field6064 = Buffer.method13039(var1, -346779531) != 0;
         this.field6068 = new classSY[var4];
         classSY var5 = null;

         for (int var6 = 0; var6 < var4; var6++) {
            classSY var7 = new classSY();
            var7.method10715(var1, var2, -968542288);
            this.field6068[var6] = var7;
            if (null != var5) {
               if (var3 >= -239626205) {
                  throw new IllegalStateException();
               }

               var5.field6104 = var7;
            }

            var5 = var7;
         }

         return var4;
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "su.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method10656(int var1) {
      try {
         this.field6060 = 1062926601 * this.field6068[0].field6103;
         this.field6059 = this.field6068[this.method10685((byte)-82) - 1].field6103 * -2049065071;
         this.field6067 = new float[this.method10672(1841746750) + 1];

         for (int var2 = method10662(this, (byte)-53); var2 <= this.method10666(2112203563); var2++) {
            if (var1 == -203474865) {
               throw new IllegalStateException();
            }

            this.field6067[var2 - method10662(this, (byte)6)] = classGL.method5489(this, var2, (byte)127);
         }

         this.field6068 = null;
         this.field6056 = classGL.method5489(this, method10662(this, (byte)38) - 1, (byte)127);
         this.field6055 = classGL.method5489(this, this.method10666(2112203563) + 1, (byte)127);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "su.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("ae")
   public float method10658(int var1, int var2) {
      try {
         if (var1 < method10662(this, (byte)29)) {
            if (var2 >= -449100855) {
               throw new IllegalStateException();
            } else {
               return this.field6056;
            }
         } else if (var1 > this.method10666(2112203563)) {
            if (var2 >= -449100855) {
               throw new IllegalStateException();
            } else {
               return this.field6055;
            }
         } else {
            return this.field6067[var1 - method10662(this, (byte)-11)];
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "su.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;I)F")
   @ObfuscatedName("tx")
   public static float method10659(classSU var0, int var1) {
      if (var0 == null) {
         var0.method10661(var1);
      }

      if (var1 < method10662(var0, (byte)-8)) {
         return var0.field6056;
      } else {
         return var1 > var0.method10666(2112203563) ? var0.field6055 : var0.field6067[var1 - method10662(var0, (byte)106)];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;I)F")
   @ObfuscatedName("qg")
   public static float method10660(classSU var0, int var1) {
      if (var0 == null) {
         var0.method10672(var1);
      }

      if (var1 < method10662(var0, (byte)4)) {
         return var0.field6056;
      } else {
         return var1 > var0.method10666(2112203563) ? var0.field6055 : var0.field6067[var1 - method10662(var0, (byte)103)];
      }
   }

   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("bm")
   int method10675(float var1) {
      if (this.field6046 * -150645242 < 0
         || !(this.field6068[this.field6046 * -140518255].field6103 * 1826620491 <= var1)
         || null != this.field6068[1675896408 * this.field6046].field6104
            && !(this.field6068[-140518255 * this.field6046].field6104.field6103 * -1024343040 > var1)) {
         if (!(var1 < method10662(this, (byte)-70)) && !(var1 > this.method10666(2112203563))) {
            int var2 = this.method10685((byte)-58);
            int var3 = -140518255 * this.field6046;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < 1663788557 * this.field6068[var6].field6103) {
                     if (var1 > -1313790553 * this.field6068[var6 - 1].field6103) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > -464025976 * this.field6068[var6].field6103)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < 1186255148 * this.field6068[var6 + 1].field6103) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while (var4 <= var5);
            }

            if (-140518255 * this.field6046 != var3) {
               this.field6046 = -1321120036 * var3;
               this.field6045 = true;
            }

            return this.field6046 * -140518255;
         } else {
            return -1;
         }
      } else {
         return this.field6046 * 1244266308;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int method10666(int var1) {
      try {
         return 1286089593 * this.field6059;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "su.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)Lsy;")
   @ObfuscatedName("ac")
   classSY method10682(float var1, int var2) {
      try {
         int var3 = method10676(this, var1, 1056549537);
         if (var3 >= 0) {
            if (var2 != 1391304917) {
               throw new IllegalStateException();
            }

            if (var3 < this.field6068.length) {
               if (var2 != 1391304917) {
                  throw new IllegalStateException();
               }

               return this.field6068[var3];
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "su.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("al")
   int method10652(Buffer var1, int var2) {
      int var3 = Buffer.method13047(var1, -199029456);
      classJR.method6406(Buffer.method13039(var1, -346779531), -2106840990);
      this.field6063 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      this.field6062 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      this.field6064 = Buffer.method13039(var1, -346779531) != 0;
      this.field6068 = new classSY[var3];
      classSY var4 = null;

      for (int var5 = 0; var5 < var3; var5++) {
         classSY var6 = new classSY();
         var6.method10715(var1, var2, -968542288);
         this.field6068[var5] = var6;
         if (null != var4) {
            var4.field6104 = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("aj")
   int method10653(Buffer var1, int var2) {
      int var3 = Buffer.method13047(var1, 1229038560);
      classJR.method6406(Buffer.method13039(var1, -346779531), -694550972);
      this.field6063 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      this.field6062 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      this.field6064 = Buffer.method13039(var1, -346779531) != 0;
      this.field6068 = new classSY[var3];
      classSY var4 = null;

      for (int var5 = 0; var5 < var3; var5++) {
         classSY var6 = new classSY();
         var6.method10715(var1, var2, -968542288);
         this.field6068[var5] = var6;
         if (null != var4) {
            var4.field6104 = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method10657() {
      this.field6060 = 1062926601 * this.field6068[0].field6103;
      this.field6059 = this.field6068[this.method10685((byte)-19) - 1].field6103 * -2049065071;
      this.field6067 = new float[this.method10672(1841746750) + 1];

      for (int var1 = method10662(this, (byte)-76); var1 <= this.method10666(2112203563); var1++) {
         this.field6067[var1 - method10662(this, (byte)9)] = classGL.method5489(this, var1, (byte)127);
      }

      this.field6068 = null;
      this.field6056 = classGL.method5489(this, method10662(this, (byte)-65) - 1, (byte)127);
      this.field6055 = classGL.method5489(this, this.method10666(2112203563) + 1, (byte)127);
   }

   @ObfuscatedSignature(descriptor = "(Lsu;B)I")
   @ObfuscatedName("az")
   public static int method10662(classSU var0, byte var1) {
      if (var0 == null) {
         var0.method10665(var1);
      }

      try {
         return var0.field6060 * -1666621055;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "su.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   int method10670() {
      return this.method10666(2112203563) - method10662(this, (byte)3);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method10663() {
      return this.field6060 * 1541446983;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   int method10667() {
      return 1286089593 * this.field6059;
   }

   classSU() {
      this.field6046 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   int method10664() {
      return this.field6060 * -1666621055;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   int method10668() {
      return 1286089593 * this.field6059;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   int method10671() {
      return this.method10666(2112203563) - method10662(this, (byte)-75);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method10672(int var1) {
      try {
         return this.method10666(2112203563) - method10662(this, (byte)37);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "su.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsu;FI)I")
   @ObfuscatedName("bi")
   public static int method10676(classSU var0, float var1, int var2) {
      if (var0 == null) {
         return var0.method10679(var1, var2);
      } else {
         try {
            if (var0.field6046 * -140518255 >= 0 && var0.field6068[var0.field6046 * -140518255].field6103 * 1210377865 <= var1) {
               if (var2 != 1056549537) {
                  throw new IllegalStateException();
               }

               if (null == var0.field6068[-140518255 * var0.field6046].field6104) {
                  return var0.field6046 * -140518255;
               }

               if (var0.field6068[-140518255 * var0.field6046].field6104.field6103 * 1210377865 > var1) {
                  if (var2 != 1056549537) {
                     throw new IllegalStateException();
                  }

                  return var0.field6046 * -140518255;
               }
            }

            if (!(var1 < method10662(var0, (byte)15))) {
               if (var2 != 1056549537) {
                  throw new IllegalStateException();
               }

               if (!(var1 > var0.method10666(2112203563))) {
                  int var3 = var0.method10685((byte)-109);
                  int var4 = -140518255 * var0.field6046;
                  if (var3 > 0) {
                     if (var2 != 1056549537) {
                        throw new IllegalStateException();
                     }

                     int var5 = 0;
                     int var6 = var3 - 1;

                     while (true) {
                        int var7 = var5 + var6 >> 1;
                        if (var1 < 1210377865 * var0.field6068[var7].field6103) {
                           if (var2 != 1056549537) {
                              throw new IllegalStateException();
                           }

                           if (var1 > 1210377865 * var0.field6068[var7 - 1].field6103) {
                              if (var2 != 1056549537) {
                                 throw new IllegalStateException();
                              }

                              var4 = var7 - 1;
                              break;
                           }

                           var6 = var7 - 1;
                        } else {
                           if (!(var1 > 1210377865 * var0.field6068[var7].field6103)) {
                              var4 = var7;
                              break;
                           }

                           if (var2 != 1056549537) {
                              throw new IllegalStateException();
                           }

                           if (var1 < 1210377865 * var0.field6068[var7 + 1].field6103) {
                              var4 = var7;
                              break;
                           }

                           var5 = var7 + 1;
                        }

                        if (var5 > var6) {
                           if (var2 != 1056549537) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }
                  }

                  if (-140518255 * var0.field6046 != var4) {
                     if (var2 != 1056549537) {
                        throw new IllegalStateException();
                     }

                     var0.field6046 = 458712177 * var4;
                     var0.field6045 = true;
                  }

                  return var0.field6046 * -140518255;
               }

               if (var2 != 1056549537) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         } catch (RuntimeException var8) {
            throw classEG.newRunException(var8, "su.ax(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(F)Lsy;")
   @ObfuscatedName("bg")
   classSY method10683(float var1) {
      int var2 = method10676(this, var1, 1056549537);
      return var2 >= 0 && var2 < this.field6068.length ? this.field6068[var2] : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   int method10673() {
      return this.method10666(2112203563) - method10662(this, (byte)-3);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int method10669() {
      return 1286089593 * this.field6059;
   }

   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("bt")
   int method10677(float var1) {
      if (this.field6046 * 1960684384 < 0
         || !(this.field6068[this.field6046 * -695120208].field6103 * 1210377865 <= var1)
         || null != this.field6068[-140518255 * this.field6046].field6104
            && !(this.field6068[1809739930 * this.field6046].field6104.field6103 * 1759980431 > var1)) {
         if (!(var1 < method10662(this, (byte)32)) && !(var1 > this.method10666(2112203563))) {
            int var2 = this.method10685((byte)-10);
            int var3 = -140518255 * this.field6046;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < 1503302405 * this.field6068[var6].field6103) {
                     if (var1 > -765743235 * this.field6068[var6 - 1].field6103) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > 1210377865 * this.field6068[var6].field6103)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < -719361413 * this.field6068[var6 + 1].field6103) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while (var4 <= var5);
            }

            if (-645984073 * this.field6046 != var3) {
               this.field6046 = 458712177 * var3;
               this.field6045 = true;
            }

            return this.field6046 * 1377126748;
         } else {
            return -1;
         }
      } else {
         return this.field6046 * -2016388855;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bh")
   static int method10688(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (6500 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int[] var32 = classBB.field323;
               int var33 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var34;
               if (classKB.method6447(210701286)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var34 = 1;
               } else {
                  var34 = 0;
               }

               var32[var33] = var34;
               return 1;
            }
         } else if (var0 == 6501) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               World var17 = classIV.method6319(-126674783);
               if (var17 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 851246551 * var17.field1162;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var17.field1163;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var17.field1167;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var17.field1160;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var17.field1161;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var17.field1169;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               }

               return 1;
            }
         } else if (6502 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               World var16 = classSX.method10711(-1953402072);
               if (null != var16) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var16.field1162 * 851246551;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var16.field1163 * -458552905;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var16.field1167;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var16.field1160;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var16.field1161 * 597852065;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var16.field1169;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               }

               return 1;
            }
         } else if (var0 == 6506) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               World var24 = null;

               for (int var30 = 0; var30 < World.field1153 * -622036481; var30++) {
                  if (World.field1170[var30].field1162 * 851246551 == var15) {
                     var24 = World.field1170[var30];
                     break;
                  }
               }

               if (var24 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var24.field1162 * 851246551;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var24.field1163;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var24.field1167;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var24.field1160;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var24.field1161;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var24.field1169;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               }

               return 1;
            }
         } else if (6507 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 480164916;
               int var14 = classBB.field323[DynamicObject.field1679 * -324749371];
               boolean var23 = classBB.field323[DynamicObject.field1679 * -324749371 + 1] == 1;
               int var29 = classBB.field323[2 + DynamicObject.field1679 * -324749371];
               boolean var31;
               if (classBB.field323[3 + -324749371 * DynamicObject.field1679] == 1) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var31 = true;
               } else {
                  var31 = false;
               }

               boolean var7 = var31;
               classRD.method9948(var14, var23, var29, var7, -1753404561);
               return 1;
            }
         } else if (6511 != var0) {
            if (6512 == var0) {
               client.field1003 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
               return 1;
            } else if (var0 == 6513) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  DynamicObject.field1679 -= 240082458;
                  int var13 = classBB.field323[-324749371 * DynamicObject.field1679];
                  int var22 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
                  classPN var28 = classNE.method7829(var22, (byte)95);
                  if (classPN.method9026(var28, (byte)2)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classOH.method8448(var13, -507551289)
                        .method8967(var22, var28.field5351, -1931341831);
                  } else if (var28.method9028((byte)45)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOH.method8448(var13, -621792759)
                        .method8963(var22, 3335646069137558745L * var28.field5354);
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPL.method8961(
                        classOH.method8448(var13, -1919145862), var22, var28.field5352 * -1601970641, 199627827
                     );
                  }

                  return 1;
               }
            } else if (var0 == 6514) {
               DynamicObject.field1679 -= 240082458;
               int var12 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var21 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               classPN var27 = classNE.method7829(var21, (byte)-109);
               if (classPN.method9026(var27, (byte)2)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classMU.method7729(var12, 2013377934)
                     .method8563(var21, var27.field5351, 1238797461);
               } else if (var27.method9028((byte)94)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classMU.method7729(var12, 1412304112)
                     .method8558(var21, var27.field5354 * 3335646069137558745L);
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMU.method7729(var12, 2031921184)
                     .method8556(var21, -1601970641 * var27.field5352, 238072989);
               }

               return 1;
            } else if (var0 == 6515) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  DynamicObject.field1679 -= 240082458;
                  int var11 = classBB.field323[-324749371 * DynamicObject.field1679];
                  int var20 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
                  classPN var26 = classNE.method7829(var20, (byte)-42);
                  if (classPN.method9026(var26, (byte)2)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classOB.method8299(var11, (byte)8)
                        .method8694(var20, var26.field5351, 1410603517);
                  } else if (var26.method9028((byte)19)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOB.method8299(var11, (byte)77)
                        .method8691(var20, 3335646069137558745L * var26.field5354);
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var11, (byte)39)
                        .method8687(var20, -1601970641 * var26.field5352, 1513363876);
                  }

                  return 1;
               }
            } else if (6516 == var0) {
               DynamicObject.field1679 -= 240082458;
               int var10 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var19 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               classPN var25 = classNE.method7829(var19, (byte)61);
               if (classPN.method9026(var25, (byte)2)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classUY.method11710(var10, 64572192)
                     .method9177(var19, var25.field5351, (short)-2821);
               } else if (var25.method9028((byte)89)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classPR.method9173(
                     classUY.method11710(var10, 64572192), var19, 3335646069137558745L * var25.field5354
                  );
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classUY.method11710(var10, 64572192)
                     .method9169(var19, var25.field5352 * -1601970641, (byte)92);
               }

               return 1;
            } else if (6518 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  int[] var10000 = classBB.field323;
                  int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var10002;
                  if (client.field890) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }
            } else if (var0 == 6519) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field888 * 461082519;
                  return 1;
               }
            } else if (var0 == 6520) {
               return 1;
            } else if (6521 == var0) {
               return 1;
            } else if (var0 == 6522) {
               classBB.field338 -= 1222866659;
               DynamicObject.field1679 -= 120041229;
               return 1;
            } else if (6523 == var0) {
               classBB.field338 -= 1222866659;
               DynamicObject.field1679 -= 120041229;
               return 1;
            } else if (6524 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  return 1;
               }
            } else if (6525 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  return 1;
               }
            } else if (var0 == 6526) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  return 1;
               }
            } else if (6527 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -372108587 * client.field889;
                  return 1;
               }
            } else if (var0 == 6528) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  DynamicObject.field1679 -= 240082458;
                  int var9 = classBB.field323[-324749371 * DynamicObject.field1679];
                  int var18 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
                  classPN var6 = classNE.method7829(var18, (byte)-61);
                  if (classPN.method9026(var6, (byte)2)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classMR.method7647(var9, (byte)-5)
                        .method8308(var18, var6.field5351, (byte)-92);
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMR.method7647(var9, (byte)2)
                        .method8306(var18, -1601970641 * var6.field5352, (byte)-111);
                  }

                  return 1;
               }
            } else if (var0 == 6531) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 240;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (var4 >= 0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (var4 < -622036481 * World.field1153) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  World var5 = World.field1170[var4];
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.field1162 * 851246551;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var5.field1163;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var5.field1167;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var5.field1160;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var5.field1161;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var5.field1169;
                  return 1;
               }
            }

            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
            return 1;
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "su.bh(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("br")
   int method10678(float var1) {
      if (this.field6046 * -1691494996 < 0
         || !(this.field6068[this.field6046 * 1462367808].field6103 * 846099456 <= var1)
         || null != this.field6068[-977017365 * this.field6046].field6104
            && !(this.field6068[-840621513 * this.field6046].field6104.field6103 * 1359655238 > var1)) {
         if (!(var1 < method10662(this, (byte)-61)) && !(var1 > this.method10666(2112203563))) {
            int var2 = this.method10685((byte)-68);
            int var3 = -67131809 * this.field6046;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < 1210377865 * this.field6068[var6].field6103) {
                     if (var1 > -549718150 * this.field6068[var6 - 1].field6103) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > 178611407 * this.field6068[var6].field6103)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < 1210377865 * this.field6068[var6 + 1].field6103) {
                        var3 = var6;
                        break;
                     }

                     var4 = var6 + 1;
                  }
               } while (var4 <= var5);
            }

            if (-1409367975 * this.field6046 != var3) {
               this.field6046 = -1959130335 * var3;
               this.field6045 = true;
            }

            return this.field6046 * -140518255;
         } else {
            return -1;
         }
      } else {
         return this.field6046 * -140518255;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   int method10684() {
      return null == this.field6068 ? 0 : this.field6068.length;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   int method10685(byte var1) {
      try {
         if (null == this.field6068) {
            if (var1 >= 8) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.field6068.length;
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "su.aa(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;)I")
   @ObfuscatedName("ec")
   public static int method10686(classSU var0) {
      if (var0 == null) {
         var0.method10657();
      }

      return null == var0.field6068 ? 0 : var0.field6068.length;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;Lxy;I)I")
   @ObfuscatedName("po")
   public static int method10654(classSU var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method10666(var2);
      }

      int var3 = Buffer.method13047(var1, 439261380);
      classJR.method6406(Buffer.method13039(var1, -346779531), -121571945);
      var0.field6063 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      var0.field6062 = classOB.method8298(Buffer.method13039(var1, -346779531), -47642443);
      var0.field6064 = Buffer.method13039(var1, -346779531) != 0;
      var0.field6068 = new classSY[var3];
      classSY var4 = null;

      for (int var5 = 0; var5 < var3; var5++) {
         classSY var6 = new classSY();
         var6.method10715(var1, var2, -968542288);
         var0.field6068[var5] = var6;
         if (null != var4) {
            var4.field6104 = var6;
         }

         var4 = var6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   int method10687() {
      return null == this.field6068 ? 0 : this.field6068.length;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   int method10674() {
      return this.method10666(2112203563) - method10662(this, (byte)94);
   }

   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;I)Lyz;")
   @ObfuscatedName("ag")
   public static IndexedSprite method10680(AbstractArchive var0, String var1, String var2, int var3) {
      try {
         if (!AbstractArchive.method11853(var0, var1, var2, -578231059)) {
            return null;
         } else {
            int var4 = var0.method11848(var1, -240675144);
            int var5 = var0.method11851(var4, var2, (byte)-110);
            return classTH.method10812(var0, var4, var5, -704867707);
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "su.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)I")
   @ObfuscatedName("ax")
   int method10679(float var1, int var2) {
      try {
         if (this.field6046 * -140518255 >= 0 && this.field6068[this.field6046 * -140518255].field6103 * 1210377865 <= var1) {
            if (var2 != 1056549537) {
               throw new IllegalStateException();
            }

            if (null == this.field6068[-140518255 * this.field6046].field6104) {
               return this.field6060 * -140518255;
            }

            if (this.field6068[-140518255 * this.field6046].field6104.field6103 * 1210377865 > var1) {
               if (var2 != 1056549537) {
                  throw new IllegalStateException();
               }

               return this.field6060 * -140518255;
            }
         }

         if (!(var1 < method10662(this, (byte)15))) {
            if (var2 != 1056549537) {
               throw new IllegalStateException();
            }

            if (!(var1 > this.method10672(2112203563))) {
               int var3 = this.method10685((byte)-109);
               int var4 = -140518255 * this.field6046;
               if (var3 > 0) {
                  if (var2 != 1056549537) {
                     throw new IllegalStateException();
                  }

                  int var5 = 0;
                  int var6 = var3 - 1;

                  while (true) {
                     int var7 = var5 + var6 >> 1;
                     if (var1 < 1210377865 * this.field6068[var7].field6103) {
                        if (var2 != 1056549537) {
                           throw new IllegalStateException();
                        }

                        if (var1 > 1210377865 * this.field6068[var7 - 1].field6103) {
                           if (var2 != 1056549537) {
                              throw new IllegalStateException();
                           }

                           var4 = var7 - 1;
                           break;
                        }

                        var6 = var7 - 1;
                     } else {
                        if (!(var1 > 1210377865 * this.field6068[var7].field6103)) {
                           var4 = var7;
                           break;
                        }

                        if (var2 != 1056549537) {
                           throw new IllegalStateException();
                        }

                        if (var1 < 1210377865 * this.field6068[var7 + 1].field6103) {
                           var4 = var7;
                           break;
                        }

                        var5 = var7 + 1;
                     }

                     if (var5 > var6) {
                        if (var2 != 1056549537) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }
               }

               if (-140518255 * this.field6046 != var4) {
                  if (var2 != 1056549537) {
                     throw new IllegalStateException();
                  }

                  this.field6060 = 458712177 * var4;
                  this.field6064 = true;
               }

               return this.field6060 * -140518255;
            }

            if (var2 != 1056549537) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "su.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aa")
   int method10665(byte var1) {
      try {
         return this.field6046 * -1666621055;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "su.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ap")
   public float method10661(int var1) {
      if (var1 < method10662(this, (byte)-8)) {
         return this.field6057;
      } else {
         return var1 > this.method10672(2112203563) ? this.field6049 : this.field6067[var1 - method10662(this, (byte)106)];
      }
   }
}
