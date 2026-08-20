import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aax")
public class classAAX implements classQV {
   @ObfuscatedName("af")
   int field112;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field110 = 2;
   @ObfuscatedName("ae")
   int field111;
   @ObfuscatedName("ab")
   boolean field114;
   @ObfuscatedSignature(descriptor = "Lsm;")
   @ObfuscatedName("ag")
   final classSM field109;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("az")
   WorldView field113;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laax;Ldz;IIZ)V")
   @ObfuscatedName("xo")
   public static void method285(classAAX var0, WorldView var1, int var2, int var3, boolean var4) {
      if (var0 == null) {
         var0.method296();
      }

      var0.field113 = var1;
      var0.field112 = 1408887245 * var2;
      var0.field111 = -727384762 * var3;
      var0.field114 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIZ)V")
   @ObfuscatedName("zj")
   public void method295(WorldView var1, int var2, int var3, boolean var4) {
      this.method286(var1, var2, var3, var4, -1511523960);
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod12(SequenceDefinition var1, int var2) {
      if (null != this.field113) {
         if (!this.field109.method10499(1966526081)) {
            if (null != var1.field5120 && var1.field5120.containsKey(var2)) {
               ArrayList var3 = (ArrayList)var1.field5120.get(var2);
               if (!var3.isEmpty()) {
                  int var4 = 0;
                  if (var3.size() > 1) {
                     int var5 = 1 + (int)(Math.random() * 100.0);
                     int var6 = 0;

                     for (classOT var8 : var3) {
                        int var9 = var6;
                        var6 += var8.field5110 * -205688617;
                        if (var9 <= var5 && var5 < var6) {
                           break;
                        }

                        var4++;
                     }

                     if (var4 >= var3.size()) {
                        return;
                     }
                  }

                  classOT var10 = (classOT)var3.get(var4);
                  if (var10 != null) {
                     if (0 == var10.field5111 * 1382715435) {
                        if (!this.field114) {
                           return;
                        }

                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           -690040570 * var10.field5113,
                           0,
                           0,
                           0,
                           var10.field5112 * 748688647,
                           var10.field5114 * 1116708389,
                           0,
                           var1.field5123,
                           749537377
                        );
                     } else {
                        int var11 = classKY.method6608(259431506 * this.field112 - 1465673007, (byte)-80);
                        int var12 = classKY.method6608(1136899564 * this.field111 - 129519862, (byte)8);
                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           var10.field5113 * -1025839375,
                           var11,
                           var12,
                           1382715435 * var10.field5111,
                           -352746225 * var10.field5112,
                           -73044783 * var10.field5114,
                           0,
                           var1.field5123,
                           1996338157
                        );
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnv;)Lvq;")
   @ObfuscatedName("bq")
   public static Node method294(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method8174();
      }

      Node var1 = var0.field4783;
      if (var1 == var0.field4782) {
         var0.field4783 = null;
         return null;
      } else {
         var0.field4783 = var1.field6554;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIZI)V")
   @ObfuscatedName("as")
   public void method286(WorldView var1, int var2, int var3, boolean var4, int var5) {
      try {
         this.field113 = var1;
         this.field112 = 1408887245 * var2;
         this.field111 = -1743370353 * var3;
         this.field114 = var4;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "aax.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;II)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod13(SequenceDefinition var1, int var2, int var3) {
      try {
         if (null == this.field113) {
            if (var3 > -969970217) {
               ;
            }
         } else if (!this.field109.method10499(1966526081)) {
            if (null != var1.field5120) {
               if (var3 <= -969970217) {
                  throw new IllegalStateException();
               }

               if (var1.field5120.containsKey(var2)) {
                  ArrayList var4 = (ArrayList)var1.field5120.get(var2);
                  if (var4.isEmpty()) {
                     if (var3 <= -969970217) {
                        return;
                     }

                     return;
                  }

                  int var5 = 0;
                  if (var4.size() > 1) {
                     if (var3 <= -969970217) {
                        throw new IllegalStateException();
                     }

                     int var6 = 1 + (int)(Math.random() * 100.0);
                     int var7 = 0;

                     for (Iterator var8 = var4.iterator(); var8.hasNext(); var5++) {
                        if (var3 <= -969970217) {
                           throw new IllegalStateException();
                        }

                        classOT var9 = (classOT)var8.next();
                        int var10 = var7;
                        var7 += var9.field5110 * 1626478387;
                        if (var10 <= var6) {
                           if (var3 <= -969970217) {
                              throw new IllegalStateException();
                           }

                           if (var6 < var7) {
                              break;
                           }
                        }
                     }

                     if (var5 >= var4.size()) {
                        if (var3 <= -969970217) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  classOT var12 = (classOT)var4.get(var5);
                  if (var12 == null) {
                     if (var3 <= -969970217) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  if (0 == var12.field5111 * 1382715435) {
                     if (var3 <= -969970217) {
                        return;
                     }

                     if (!this.field114) {
                        if (var3 <= -969970217) {
                           throw new IllegalStateException();
                        }

                        return;
                     }

                     classSM.method10484(
                        this.field109,
                        2140889407 * this.field113.field1699,
                        1499339563 * var12.field5113,
                        0,
                        0,
                        0,
                        var12.field5112 * 748688647,
                        var12.field5114 * 1116708389,
                        0,
                        var1.field5123,
                        865611520
                     );
                  } else {
                     int var13 = classKY.method6608(1547512581 * this.field112 - 64, (byte)-67);
                     int var14 = classKY.method6608(1978988399 * this.field111 - 64, (byte)-117);
                     classSM.method10484(
                        this.field109,
                        2140889407 * this.field113.field1699,
                        var12.field5113 * 1499339563,
                        var13,
                        var14,
                        1382715435 * var12.field5111,
                        748688647 * var12.field5112,
                        1116708389 * var12.field5114,
                        0,
                        var1.field5123,
                        -1876940219
                     );
                  }

                  return;
               }

               if (var3 <= -969970217) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "aax.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod14(SequenceDefinition var1, int var2) {
      if (null != this.field113) {
         if (!this.field109.method10499(1966526081)) {
            if (null != var1.field5120 && var1.field5120.containsKey(var2)) {
               ArrayList var3 = (ArrayList)var1.field5120.get(var2);
               if (!var3.isEmpty()) {
                  int var4 = 0;
                  if (var3.size() > 1) {
                     int var5 = 1 + (int)(Math.random() * 100.0);
                     int var6 = 0;

                     for (classOT var8 : var3) {
                        int var9 = var6;
                        var6 += var8.field5110 * 1626478387;
                        if (var9 <= var5 && var5 < var6) {
                           break;
                        }

                        var4++;
                     }

                     if (var4 >= var3.size()) {
                        return;
                     }
                  }

                  classOT var10 = (classOT)var3.get(var4);
                  if (var10 != null) {
                     if (0 == var10.field5111 * 1382715435) {
                        if (!this.field114) {
                           return;
                        }

                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           1499339563 * var10.field5113,
                           0,
                           0,
                           0,
                           var10.field5112 * 748688647,
                           var10.field5114 * 1116708389,
                           0,
                           var1.field5123,
                           1179966525
                        );
                     } else {
                        int var11 = classKY.method6608(1547512581 * this.field112 - 64, (byte)-74);
                        int var12 = classKY.method6608(1978988399 * this.field111 - 64, (byte)-47);
                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           var10.field5113 * 1499339563,
                           var11,
                           var12,
                           1382715435 * var10.field5111,
                           748688647 * var10.field5112,
                           1116708389 * var10.field5114,
                           0,
                           var1.field5123,
                           -542561062
                        );
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laax;)V")
   @ObfuscatedName("cz")
   public static void method289(classAAX var0) {
      if (var0 == null) {
         var0.method292();
      }

      var0.field113 = null;
   }

   public classAAX(classSM var1) {
      this.field109 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("kp")
   @Override
   public void vmethod15(SequenceDefinition var1, int var2) {
      if (null != this.field113) {
         if (!this.field109.method10499(1966526081)) {
            if (null != var1.field5120 && var1.field5120.containsKey(var2)) {
               ArrayList var3 = (ArrayList)var1.field5120.get(var2);
               if (!var3.isEmpty()) {
                  int var4 = 0;
                  if (var3.size() > 1) {
                     int var5 = 1 + (int)(Math.random() * 100.0);
                     int var6 = 0;

                     for (classOT var8 : var3) {
                        int var9 = var6;
                        var6 += var8.field5110 * 1626478387;
                        if (var9 <= var5 && var5 < var6) {
                           break;
                        }

                        var4++;
                     }

                     if (var4 >= var3.size()) {
                        return;
                     }
                  }

                  classOT var10 = (classOT)var3.get(var4);
                  if (var10 != null) {
                     if (0 == var10.field5111 * 1382715435) {
                        if (!this.field114) {
                           return;
                        }

                        classSM.method10484(
                           this.field109,
                           -1728460310 * this.field113.field1699,
                           999304595 * var10.field5113,
                           0,
                           0,
                           0,
                           var10.field5112 * 1985475422,
                           var10.field5114 * 675853014,
                           0,
                           var1.field5123,
                           -2092856096
                        );
                     } else {
                        int var11 = classKY.method6608(1547512581 * this.field112 - 64, (byte)-110);
                        int var12 = classKY.method6608(-1942371594 * this.field111 - 64, (byte)-71);
                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           var10.field5113 * 1499339563,
                           var11,
                           var12,
                           -310398061 * var10.field5111,
                           -67897357 * var10.field5112,
                           1116708389 * var10.field5114,
                           0,
                           var1.field5123,
                           696730442
                        );
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Laax;I)V")
   @ObfuscatedName("ew")
   public static void method290(classAAX var0, int var1) {
      if (var0 == null) {
         var0.method293(var1);
      } else {
         try {
            var0.field113 = null;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "aax.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod16(SequenceDefinition var1, int var2) {
      if (null != this.field113) {
         if (!this.field109.method10499(1966526081)) {
            if (null != var1.field5120 && var1.field5120.containsKey(var2)) {
               ArrayList var3 = (ArrayList)var1.field5120.get(var2);
               if (!var3.isEmpty()) {
                  int var4 = 0;
                  if (var3.size() > 1) {
                     int var5 = 1 + (int)(Math.random() * 100.0);
                     int var6 = 0;

                     for (classOT var8 : var3) {
                        int var9 = var6;
                        var6 += var8.field5110 * 1626478387;
                        if (var9 <= var5 && var5 < var6) {
                           break;
                        }

                        var4++;
                     }

                     if (var4 >= var3.size()) {
                        return;
                     }
                  }

                  classOT var10 = (classOT)var3.get(var4);
                  if (var10 != null) {
                     if (0 == var10.field5111 * 1382715435) {
                        if (!this.field114) {
                           return;
                        }

                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           1499339563 * var10.field5113,
                           0,
                           0,
                           0,
                           var10.field5112 * 748688647,
                           var10.field5114 * 1116708389,
                           0,
                           var1.field5123,
                           545476015
                        );
                     } else {
                        int var11 = classKY.method6608(-2103673679 * this.field112 - 64, (byte)-91);
                        int var12 = classKY.method6608(1978988399 * this.field111 - 1705886511, (byte)-109);
                        classSM.method10484(
                           this.field109,
                           2140889407 * this.field113.field1699,
                           var10.field5113 * -850593939,
                           var11,
                           var12,
                           534203496 * var10.field5111,
                           748688647 * var10.field5112,
                           1116708389 * var10.field5114,
                           0,
                           var1.field5123,
                           -2092360487
                        );
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laax;)V")
   @ObfuscatedName("tm")
   public static void method291(classAAX var0) {
      if (var0 == null) {
         var0.method296();
      } else {
         var0.field113 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dm")
   public void method296() {
      method290(this, -2109643982);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIZ)V")
   @ObfuscatedName("ao")
   public void method287(WorldView var1, int var2, int var3, boolean var4) {
      this.field113 = var1;
      this.field112 = 1408887245 * var2;
      this.field111 = -1743370353 * var3;
      this.field114 = var4;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method292() {
      this.field113 = null;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIZ)V")
   @ObfuscatedName("ac")
   public void method288(WorldView var1, int var2, int var3, boolean var4) {
      this.field113 = var1;
      this.field112 = 1408887245 * var2;
      this.field111 = -1743370353 * var3;
      this.field114 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod17(SequenceDefinition var1, int var2) {
      this.vmethod13(var1, var2, 895142418);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   public void method293(int var1) {
      try {
         this.field113 = null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aax.ax(" + ')');
      }
   }
}
