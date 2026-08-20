import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rf")
public class classRF extends classRT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5662 = 1;
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ag")
   final classAAO field5660;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5663 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5661 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5664 = 400;

   @ObfuscatedSignature(descriptor = "(I)Lrr;")
   @ObfuscatedName("az")
   @Override
   classRR vmethod555(int var1) {
      try {
         return new classRS();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rf.az(" + ')');
      }
   }

   public classRF(classAAO var1) {
      super(400);
      this.field5660 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ax")
   public void method9958(classXY var1, int var2) {
      while (var1.field6955 * 702114061 < var2) {
         int var3 = classXY.method13039(var1, -346779531);
         if (4 == var3) {
            classAAE var9 = new classAAE(var1.method13071(-894833178), this.field5660);
            if (!var9.method171(572791587)) {
               throw new IllegalStateException();
            }

            boolean var10 = false;
            classQQ.field5597.method1331(var9.method164(1380916912), var10, 1466229663);
         } else {
            boolean var4 = (var3 & 1) != 0;
            classAAE var5 = new classAAE(var1.method13071(-55642484), this.field5660);
            classAAE var6 = new classAAE(var1.method13071(1667417888), this.field5660);
            var1.method13071(637208751);
            if (!var5.method171(244066639)) {
               throw new IllegalStateException();
            }

            classRS var7 = (classRS)classRT.method10209(this, var5, 781999007);
            if (var4) {
               classRS var8 = (classRS)classRT.method10209(this, var6, 1544105364);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     this.method10220(var8, 139962439);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               this.method10237(var7, var5, var6, -1617610550);
            } else if (this.method10191(-1241797278) < 400) {
               int var12 = this.method10191(-668432367);
               var7 = (classRS)this.method10226(var5, var6, (byte)-3);
               var7.field5836 = -3340741 * var12;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ab")
   @Override
   classRR vmethod556() {
      return new classRS();
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ag")
   @Override
   classRR vmethod557() {
      return new classRS();
   }

   @ObfuscatedSignature(descriptor = "(IB)[Lrr;")
   @ObfuscatedName("af")
   @Override
   classRR[] vmethod558(int var1, byte var2) {
      try {
         return new classRS[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rf.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrf;Lxy;I)V")
   @ObfuscatedName("gy")
   public static void method9959(classRF var0, classXY var1, int var2) {
      if (var0 == null) {
         var0.method9958(var1, var2);
      }

      while (var1.field6955 * 702114061 < var2) {
         int var3 = classXY.method13039(var1, -346779531);
         if (4 == var3) {
            classAAE var4 = new classAAE(var1.method13071(177483067), var0.field5660);
            if (!var4.method171(506837222)) {
               throw new IllegalStateException();
            }

            boolean var5 = false;
            classQQ.field5597.method1331(var4.method164(1541102987), var5, 1434553979);
         } else {
            boolean var9 = (var3 & 1) != 0;
            classAAE var10 = new classAAE(var1.method13071(1353230006), var0.field5660);
            classAAE var6 = new classAAE(var1.method13071(601360729), var0.field5660);
            var1.method13071(-549384224);
            if (!var10.method171(1000658932)) {
               throw new IllegalStateException();
            }

            classRS var7 = (classRS)classRT.method10209(var0, var10, -1528113242);
            if (var9) {
               classRS var8 = (classRS)classRT.method10209(var0, var6, 908692591);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     var0.method10220(var8, -39841176);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               var0.method10237(var7, var10, var6, 55745139);
            } else if (var0.method10191(-1228256686) < 400) {
               int var12 = var0.method10191(-880076749);
               var7 = (classRS)var0.method10226(var10, var6, (byte)-5);
               var7.field5836 = -3340741 * var12;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lrr;")
   @ObfuscatedName("as")
   @Override
   classRR[] vmethod559(int var1) {
      return new classRS[var1];
   }

   @ObfuscatedSignature(descriptor = "(IIIIZIIS)J")
   @ObfuscatedName("ac")
   public static long method9961(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6, short var7) {
      try {
         long var8 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
         if (var4) {
            if (var7 <= 3642) {
               throw new IllegalStateException();
            }

            var8 |= 524288L;
         }

         return var8;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "rf.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("ae")
   public void method9960(classXY var1, int var2, int var3) {
      try {
         while (var1.field6955 * 702114061 < var2) {
            if (var3 != 400186886) {
               throw new IllegalStateException();
            }

            int var4 = classXY.method13039(var1, -346779531);
            if (4 == var4) {
               if (var3 != 400186886) {
                  return;
               }

               classAAE var11 = new classAAE(var1.method13071(1363699488), this.field5660);
               if (!var11.method171(717563486)) {
                  if (var3 != 400186886) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException();
               }

               boolean var12 = false;
               classQQ.field5597.method1331(var11.method164(888944905), var12, 1519412064);
            } else {
               boolean var10000;
               if ((var4 & 1) != 0) {
                  if (var3 != 400186886) {
                     return;
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               classAAE var6 = new classAAE(var1.method13071(169997208), this.field5660);
               classAAE var7 = new classAAE(var1.method13071(1825906559), this.field5660);
               var1.method13071(2056146868);
               if (!var6.method171(1031274073)) {
                  if (var3 != 400186886) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException();
               }

               classRS var8 = (classRS)classRT.method10209(this, var6, -1470289739);
               if (var5) {
                  classRS var9 = (classRS)classRT.method10209(this, var7, 1893778780);
                  if (var9 != null) {
                     if (var3 != 400186886) {
                        throw new IllegalStateException();
                     }

                     if (var9 != var8) {
                        if (var3 != 400186886) {
                           throw new IllegalStateException();
                        }

                        if (null != var8) {
                           if (var3 != 400186886) {
                              return;
                           }

                           this.method10220(var9, 672387961);
                        } else {
                           var8 = var9;
                        }
                     }
                  }
               }

               if (null != var8) {
                  if (var3 != 400186886) {
                     throw new IllegalStateException();
                  }

                  this.method10237(var8, var6, var7, -1105072263);
               } else if (this.method10191(-1724515338) < 400) {
                  int var14 = this.method10191(-1670008609);
                  var8 = (classRS)this.method10226(var6, var7, (byte)-25);
                  var8.field5836 = -3340741 * var14;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "rf.ae(" + ')');
      }
   }
}
