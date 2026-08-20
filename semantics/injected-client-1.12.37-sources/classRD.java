import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rd")
public abstract class classRD implements Comparator {
   @ObfuscatedName("af")
   Comparator field5644;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("ax")
   static SpritePixels field5645;

   @ObfuscatedSignature(descriptor = "(IZIZI)V")
   @ObfuscatedName("ab")
   static void method9948(int var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         if (World.field1170 != null) {
            if (var4 == 379541057) {
               return;
            }

            classLV.method7155(0, World.field1170.length - 1, var0, var1, var2, var3, (byte)1);
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "rd.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Llx;")
   @ObfuscatedName("jw")
   public static classLX method9949(Widget var0) {
      return var0.field4369;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;)V")
   @ObfuscatedName("ao")
   final void method9939(Comparator var1) {
      if (this.field5644 == null) {
         this.field5644 = var1;
      } else if (this.field5644 instanceof classRD) {
         ((classRD)this.field5644).method9940(var1, 1072642345);
      }
   }

   protected classRD() {
   }

   @ObfuscatedSignature(descriptor = "(Lrd;Lrr;Lrr;I)I")
   @ObfuscatedName("ga")
   public static int method9942(classRD var0, User var1, User var2, int var3) {
      if (var0 == null) {
         var0.method9945(var1, var1, var3);
      }

      try {
         if (null == var0.field5644) {
            if (var3 <= 1195995055) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var0.field5644.compare(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "rd.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V")
   @ObfuscatedName("ac")
   final void method9940(Comparator var1, int var2) {
      try {
         if (this.field5644 == null) {
            this.field5644 = var1;
         } else if (this.field5644 instanceof classRD) {
            if (var2 != 1072642345) {
               throw new IllegalStateException();
            }

            ((classRD)this.field5644).method9940(var1, 1072642345);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "rd.ac(" + ')');
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "rd.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrd;Lrr;Lrr;)I")
   @ObfuscatedName("rx")
   public static int method9943(classRD var0, User var1, User var2) {
      return null == var0.field5644 ? 0 : var0.field5644.compare(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("aj")
   protected final int method9944(User var1, User var2) {
      return null == this.field5644 ? 0 : this.field5644.compare(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrd;Ljava/lang/Object;)Z")
   @ObfuscatedName("xh")
   public static boolean method9946(classRD var0, Object var1) {
      if (var0 == null) {
         var0.equals(var1);
      }

      return var0.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrd;Ljava/lang/Object;)Z")
   @ObfuscatedName("ij")
   public static boolean method9947(classRD var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;I)I")
   @ObfuscatedName("az")
   public static int method9941(classQR var0, int var1, classQV var2, int var3) {
      try {
         int var4 = 0;
         if (!var0.method9726(374233424)) {
            classQR.method9759(var0, 0, 198333171);
            return var4;
         } else {
            SequenceDefinition var5 = var0.method9731((byte)51);
            if (-1 == var5.field5134 * 1665914959) {
               if (var3 >= -113951151) {
                  throw new IllegalStateException();
               }

               var4 |= 8;
            }

            if (var5.method8785((byte)-87)) {
               if (var3 >= -113951151) {
                  throw new IllegalStateException();
               }

               classQR.method9759(var0, 0, 1128422573);
            } else {
               classQR.method9759(var0, var0.method9755((byte)-76) + var1, 8925726);
            }

            if (!var5.method8768((byte)0)) {
               if (var3 >= -113951151) {
                  throw new IllegalStateException();
               }

               int var8 = var1;
               byte var9 = 0;
               SequenceDefinition var10 = var0.method9731((byte)96);
               if (1665914959 * var10.field5134 > 0) {
                  if (var3 >= -113951151) {
                     throw new IllegalStateException();
                  }

                  if (var10.field5133 * -826664243 > 0) {
                     var8 = var1 % (var10.field5133 * -826664243);
                  }
               }

               int var11 = var0.method9738(1719962113);
               int var12 = var0.method9739(929233716);
               int var13 = classQR.method9743(var0, 22636646);
               if (var11 >= var10.field5127.length) {
                  if (var3 >= -113951151) {
                     throw new IllegalStateException();
                  }

                  var11 = 0;
                  var12 = 0;
               }

               var12 += var8;

               while (var12 > var10.field5125[var11]) {
                  var12 -= var10.field5125[var11];
                  var11++;
                  var9 |= 4;
                  if (0 == (var9 & 2)) {
                     if (var3 >= -113951151) {
                        throw new IllegalStateException();
                     }

                     if (null != var2) {
                        if (var3 >= -113951151) {
                           throw new IllegalStateException();
                        }

                        var2.vmethod13(var10, var11, 895142418);
                     }
                  }

                  if (var11 >= var10.field5127.length) {
                     if (var3 >= -113951151) {
                        throw new IllegalStateException();
                     }

                     var13++;
                     var9 |= 1;
                     var11 -= var10.field5134 * 1665914959;
                     if (var13 >= 2035920365 * var10.field5124) {
                        if (var3 >= -113951151) {
                           throw new IllegalStateException();
                        }

                        var9 |= 2;
                     }

                     label119: {
                        if (var11 >= 0) {
                           if (var3 >= -113951151) {
                              throw new IllegalStateException();
                           }

                           if (var11 < var10.field5127.length) {
                              break label119;
                           }

                           if (var3 >= -113951151) {
                              throw new IllegalStateException();
                           }
                        }

                        var9 |= 2;
                        var11 = 0;
                     }

                     if (0 == (var9 & 2)) {
                        if (var3 >= -113951151) {
                           throw new IllegalStateException();
                        }

                        if (null != var2) {
                           if (var3 >= -113951151) {
                              throw new IllegalStateException();
                           }

                           var2.vmethod13(var10, var11, 1479355802);
                        }
                     }
                  }
               }

               var0.method9769(var11, var12, var13, 1587600500);
               var4 |= var9;
            } else {
               var4 |= classEJ.method3903(var0, var1, var2, 1289411290);
            }

            return var4;
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "rd.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;I)I")
   @ObfuscatedName("aa")
   protected final int method9945(User var1, User var2, int var3) {
      try {
         if (null == this.field5644) {
            if (var3 <= 1195995055) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.field5644.compare(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "rd.aa(" + 41);
      }
   }
}
