import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ib")
public class classIB extends classIS {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field2930 = 16;
   @ObfuscatedName("af")
   byte field2929;
   @ObfuscatedName("az")
   int field2931;
   @ObfuscatedName("ab")
   String field2933;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field2932 = 1076101408;
   @ObfuscatedName("ae")
   int field2928;
   @ObfuscatedSignature(descriptor = "Lrw;")
   @ObfuscatedName("ec")
   static classRW field2935;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final String field2934 = "d";

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod507(classXY var1, int var2) {
      try {
         classXY.method13039(var1, -346779531);
         this.field2928 = classXY.method13047(var1, 1225577849) * -1162888885;
         this.field2929 = classXY.method13043(var1, (byte)17);
         this.field2931 = classXY.method13047(var1, 1375876317) * 1069804709;
         var1.method13059(961837390);
         this.field2933 = var1.method13071(2084487682);
         classXY.method13039(var1, -346779531);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ib.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod509(classIE var1, int var2) {
      try {
         classHN var3 = (classHN)var1.field2955.get(287508579 * this.field2928);
         var3.field2841 = this.field2929;
         var3.field2842 = this.field2931 * 735809615;
         var3.field2846 = new classAAE(this.field2933);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ib.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod508(classIE var1) {
      classHN var2 = (classHN)var1.field2955.get(287508579 * this.field2928);
      var2.field2841 = this.field2929;
      var2.field2842 = this.field2931 * 735809615;
      var2.field2846 = new classAAE(this.field2933);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod506(classXY var1) {
      classXY.method13039(var1, -346779531);
      this.field2928 = classXY.method13047(var1, 447793970) * -1162888885;
      this.field2929 = classXY.method13043(var1, (byte)17);
      this.field2931 = classXY.method13047(var1, 1660926076) * -1340994134;
      var1.method13059(1430153815);
      this.field2933 = var1.method13071(531729326);
      classXY.method13039(var1, -346779531);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod505(classXY var1) {
      classXY.method13039(var1, -346779531);
      this.field2928 = classXY.method13047(var1, -1090619147) * -1162888885;
      this.field2929 = classXY.method13043(var1, (byte)17);
      this.field2931 = classXY.method13047(var1, 1897556601) * -1804201015;
      var1.method13059(938421225);
      this.field2933 = var1.method13071(-153802279);
      classXY.method13039(var1, -346779531);
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod511(classIE var1) {
      classHN var2 = (classHN)var1.field2955.get(287508579 * this.field2928);
      var2.field2841 = this.field2929;
      var2.field2842 = this.field2931 * 735809615;
      var2.field2846 = new classAAE(this.field2933);
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod510(classIE var1) {
      classHN var2 = (classHN)var1.field2955.get(287508579 * this.field2928);
      var2.field2841 = this.field2929;
      var2.field2842 = this.field2931 * 735809615;
      var2.field2846 = new classAAE(this.field2933);
   }

   classIB(classIX var1) {
      this.this$0 = var1;
      this.field2928 = 1162888885;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;IIZZ)V")
   @ObfuscatedName("uf")
   public static void method6140(classLH var0, int var1, int var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method6976(var1);
      }

      int var5 = 0;
      if (!var0.field4147) {
         var5 = 0;
      } else {
         var1 += var0.field4154 * -1184890025;
         var2 += -457263387 * var0.field4160;
         classWB var6 = classLH.method7099(var0, -1079082866);
         var5 = var0.field4159.method13898(var1 - (Integer)var6.field6654, var2 - (Integer)var6.field6655, 272125167);
      }

      if (var3 && var4) {
         var0.field4149 = 328689669;
         classWB var14 = var0.method7064(var5, 1436579323);
         classWB var7 = var0.method7064(var0.field4151 * -1558750221, 1781407754);
         classLH.method7060(var0, var7, var14, 1801667578);
      } else if (var3) {
         var0.field4149 = 328689669;
         classWB var11 = var0.method7064(var5, 946604564);
         classLH.method6882(var0, (Integer)var11.field6654, (Integer)var11.field6655, 1122842785);
         var0.field4151 = (Integer)var11.field6654 * -2118535877;
      } else if (var4) {
         classLH.method6882(var0, var0.field4151 * -1558750221, var5, 1122842785);
      } else {
         if (var0.field4156 * 1398532195 <= 0 || -1558750221 * var0.field4151 != var5) {
            var0.field4149 = 0;
            classLH.method6882(var0, var5, var5, 1122842785);
            var0.field4151 = -2118535877 * var5;
         } else if (1072642345 * var0.field4152 == -698145269 * var0.field4157) {
            var0.field4149 = 328689669;
            classWB var12 = var0.method7064(var5, 1950114081);
            classLH.method6882(var0, (Integer)var12.field6654, (Integer)var12.field6655, 1122842785);
         } else {
            var0.field4149 = 657379338;
            classWB var13 = var0.method7068(var5, -443098235);
            classLH.method6882(var0, (Integer)var13.field6654, (Integer)var13.field6655, 1122842785);
         }

         var0.field4156 = -745916333;
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ae")
   public static boolean method6139(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 == 229606951) {
               throw new IllegalStateException();
            }

            if (var0 < 127) {
               return true;
            }
         }

         if (var0 > 127) {
            if (var1 == 229606951) {
               throw new IllegalStateException();
            }

            if (var0 < 160) {
               return true;
            }

            if (var1 == 229606951) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 160) {
            if (var1 == 229606951) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 == 229606951) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 != 0) {
            if (var1 == 229606951) {
               throw new IllegalStateException();
            }

            char[] var2 = classOH.field4869;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 == 229606951) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var0 == var4) {
                  if (var1 == 229606951) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ib.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("af")
   public static void method6138(classXS var0, int var1) {
      try {
         classZQ var2 = (classZQ)classZJ.field7189.method8167();
         if (var2 == null) {
            if (var1 != 1238864384) {
               throw new IllegalStateException();
            }
         } else {
            int var3 = 702114061 * var0.field6955;
            var0.method12979(var2.field7236 * -1199814365, 1528983391);

            for (int var4 = 0; var4 < var2.field7235 * 569821081; var4++) {
               if (var1 != 1238864384) {
                  return;
               }

               if (0 != var2.field7239[var4]) {
                  if (var1 != 1238864384) {
                     throw new IllegalStateException();
                  }

                  classXY.method12971(var0, var2.field7239[var4], (byte)-12);
               } else {
                  try {
                     int var5 = var2.field7237[var4];
                     if (0 == var5) {
                        if (var1 != 1238864384) {
                           throw new IllegalStateException();
                        }

                        Field var6 = var2.field7240[var4];
                        int var7 = var6.getInt(null);
                        classXY.method12971(var0, 0, (byte)-78);
                        var0.method12979(var7, 1670772688);
                     } else if (1 == var5) {
                        if (var1 != 1238864384) {
                           throw new IllegalStateException();
                        }

                        Field var24 = var2.field7240[var4];
                        var24.setInt(null, var2.field7238[var4]);
                        classXY.method12971(var0, 0, (byte)-75);
                     } else if (var5 == 2) {
                        if (var1 != 1238864384) {
                           throw new IllegalStateException();
                        }

                        Field var25 = var2.field7240[var4];
                        int var28 = var25.getModifiers();
                        classXY.method12971(var0, 0, (byte)-27);
                        var0.method12979(var28, -242961672);
                     }

                     if (var5 != 3) {
                        if (4 == var5) {
                           Method var27 = var2.field7241[var4];
                           int var30 = var27.getModifiers();
                           classXY.method12971(var0, 0, (byte)-54);
                           var0.method12979(var30, 1483575624);
                        }
                     } else {
                        if (var1 != 1238864384) {
                           throw new IllegalStateException();
                        }

                        Method var26 = var2.field7241[var4];
                        byte[][] var29 = var2.field7242[var4];
                        Object[] var8 = new Object[var29.length];

                        for (int var9 = 0; var9 < var29.length; var9++) {
                           if (var1 != 1238864384) {
                              return;
                           }

                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var29[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var31 = var26.invoke(null, var8);
                        if (null == var31) {
                           if (var1 != 1238864384) {
                              throw new IllegalStateException();
                           }

                           classXY.method12971(var0, 0, (byte)-59);
                        } else if (var31 instanceof Number) {
                           if (var1 != 1238864384) {
                              throw new IllegalStateException();
                           }

                           classXY.method12971(var0, 1, (byte)-105);
                           var0.method12987(((Number)var31).longValue());
                        } else if (var31 instanceof String) {
                           classXY.method12971(var0, 2, (byte)-1);
                           classXY.method12997(var0, (String)var31, (short)29215);
                        } else {
                           classXY.method12971(var0, 4, (byte)-93);
                        }
                     }
                  } catch (ClassNotFoundException var11) {
                     classXY.method12971(var0, -10, (byte)-62);
                  } catch (InvalidClassException var12) {
                     classXY.method12971(var0, -11, (byte)-60);
                  } catch (StreamCorruptedException var13) {
                     classXY.method12971(var0, -12, (byte)-29);
                  } catch (OptionalDataException var14) {
                     classXY.method12971(var0, -13, (byte)-75);
                  } catch (IllegalAccessException var15) {
                     classXY.method12971(var0, -14, (byte)-47);
                  } catch (IllegalArgumentException var16) {
                     classXY.method12971(var0, -15, (byte)-73);
                  } catch (InvocationTargetException var17) {
                     classXY.method12971(var0, -16, (byte)-62);
                  } catch (SecurityException var18) {
                     classXY.method12971(var0, -17, (byte)-124);
                  } catch (IOException var19) {
                     classXY.method12971(var0, -18, (byte)-1);
                  } catch (NullPointerException var20) {
                     classXY.method12971(var0, -19, (byte)-95);
                  } catch (Exception var21) {
                     classXY.method12971(var0, -20, (byte)-14);
                  } catch (Throwable var22) {
                     classXY.method12971(var0, -21, (byte)-53);
                  }
               }
            }

            var0.method13145(var3, -1669758824);
            var2.vmethod398();
         }
      } catch (RuntimeException var23) {
         throw classEG.method3884(var23, "ib.af(" + ')');
      }
   }
}
