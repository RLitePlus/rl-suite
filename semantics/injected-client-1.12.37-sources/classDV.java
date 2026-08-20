import java.util.Iterator;
import net.runelite.api.Hitsplat;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dv")
public class classDV implements Hitsplat {
   @ObfuscatedName("ae")
   int field1636;
   @ObfuscatedName("af")
   int field1637;
   @ObfuscatedSignature(descriptor = "Ldv;")
   @ObfuscatedName("qn")
   public static classDV field1640;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   public static final int field1639 = 29;
   @ObfuscatedName("az")
   int field1635 = -714249401;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1638 = 2;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method3613() {
      return this.field1635 * 1682911625;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method3614() {
      return this.field1635 * 1682911625;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   int method3615(int var1) {
      try {
         return this.field1635 * 1682911625;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dv.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method3619(int var1) {
      try {
         return -660838951 * this.field1636;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dv.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("az")
   void method3611(int var1, int var2, int var3, byte var4) {
      this.method3628(var1, var2, var3);

      try {
         this.field1635 = var1 * 714249401;
         this.field1637 = var2 * -1749090343;
         this.field1636 = 742771305 * var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dv.az(" + ')');
      }
   }

   classDV() {
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ab")
   int method3622(short var1) {
      try {
         return 1616351337 * this.field1637;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dv.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method3616() {
      return this.field1635 * 1682911625;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IZI)V")
   @ObfuscatedName("cd")
   static void method3627(WorldView var0, int var1, boolean var2, int var3) {
      try {
         Player var4 = (Player)var0.field1694.method13404(var1);
         if (null != var4) {
            if (var3 <= 1222866659) {
               throw new IllegalStateException();
            }

            if (var4.vmethod262((byte)76) && !var4.field1259) {
               if (var3 <= 1222866659) {
                  throw new IllegalStateException();
               }

               int var5;
               label118: {
                  label128: {
                     var5 = -426380455 * var4.field1274;
                     var4.field1264 = false;
                     if (client.field885) {
                        if (var3 <= 1222866659) {
                           throw new IllegalStateException();
                        }

                        if (client.field837.field1419 * -2087374717 > 50) {
                           break label128;
                        }

                        if (var3 <= 1222866659) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-2087374717 * client.field837.field1419 <= 200) {
                        break label118;
                     }

                     if (var3 <= 1222866659) {
                        throw new IllegalStateException();
                     }
                  }

                  if (var2) {
                     if (var3 <= 1222866659) {
                        throw new IllegalStateException();
                     }

                     if (var4.method3083(-872807456) == var4.field1436 * 1457308725) {
                        if (var3 <= 1222866659) {
                           return;
                        }

                        var4.field1264 = true;
                     }
                  }
               }

               int var6 = var4.field1487 * -1547553299 >> 7;
               int var7 = var4.field1489 * -1272026483 >> 7;
               if (var0.method3729(var6, var7, (byte)1)) {
                  if (var3 <= 1222866659) {
                     throw new IllegalStateException();
                  }

                  long var8;
                  boolean var12;
                  label131: {
                     var8 = classRF.method9961(0, 0, 0, 0, false, -1315528093 * var4.field1480, var0.field1699 * 2140889407, (short)9495);
                     var12 = false;
                     if (var4.field1284 != null && client.field855 * 1612595797 >= 1411153905 * var4.field1258) {
                        if (var3 <= 1222866659) {
                           throw new IllegalStateException();
                        }

                        if (1612595797 * client.field855 < var4.field1263 * -1847262755) {
                           if (var3 <= 1222866659) {
                              throw new IllegalStateException();
                           }

                           var4.field1264 = false;
                           var4.field1282 = classKC.method6460(
                                 var0, var4.field1487 * -1547553299, var4.field1489 * -1272026483, var5, var4.vmethod267(-1423776655), (short)-3175
                              )
                              * -1668547461;
                           var4.field1490 = 1311089481 * client.field855;
                           var12 = var0.scene
                              .method4183(
                                 var5,
                                 -1547553299 * var4.field1487,
                                 -1272026483 * var4.field1489,
                                 var4.field1282 * -617053517,
                                 60,
                                 var4,
                                 var4.field1488 * 1457033841,
                                 var8,
                                 -633555803 * var4.field1278,
                                 752753039 * var4.field1276,
                                 var4.field1277 * -1556408309,
                                 2015178417 * var4.field1275
                              );
                           break label131;
                        }
                     }

                     if (64 == (var4.field1487 * -1547553299 & 127)) {
                        if (var3 <= 1222866659) {
                           throw new IllegalStateException();
                        }

                        if ((var4.field1489 * -1272026483 & 127) == 64) {
                           if (var3 <= 1222866659) {
                              throw new IllegalStateException();
                           }

                           if (var0.field1703[var6][var7] == client.field956 * 834768165) {
                              if (var3 <= 1222866659) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }

                           var0.field1703[var6][var7] = 834768165 * client.field956;
                        }
                     }

                     var4.field1282 = classKC.method6460(
                           var0, var4.field1487 * -1547553299, var4.field1489 * -1272026483, var5, var4.vmethod267(-1423776655), (short)-413
                        )
                        * -1668547461;
                     var4.field1490 = client.field855 * 1311089481;
                     var12 = Scene.method4477(
                        var0.scene,
                        var5,
                        -1547553299 * var4.field1487,
                        -1272026483 * var4.field1489,
                        var4.field1282 * -617053517,
                        60,
                        var4,
                        var4.field1488 * 1457033841,
                        var8,
                        var4.field1440
                     );
                  }

                  if (var12) {
                     if (var3 <= 1222866659) {
                        throw new IllegalStateException();
                     }

                     classHH.method6055(var0, var4, var5, -617053517 * var4.field1282, var8);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "dv.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method3617() {
      return this.field1635 * 1682911625;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method3620() {
      return -660838951 * this.field1636;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method3623() {
      return 1616351337 * this.field1637;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method3624() {
      return 1616351337 * this.field1637;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method3625() {
      return 1616351337 * this.field1637;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;III)V")
   @ObfuscatedName("kk")
   public static void method3612(classDV var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3617();
      }

      var0.field1635 = var1 * 714249401;
      var0.field1637 = var2 * -1749090343;
      var0.field1636 = 742771305 * var3;
   }

   public int getHitsplatType() {
      return this.field1635 * 1682911625;
   }

   public int getAmount() {
      return this.field1637 * 1616351337;
   }

   @ObfuscatedSignature(descriptor = "(Ldv;III)V")
   @ObfuscatedName("ee")
   public static void method3629(classDV var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3614();
      }

      var0.method3611(var1, var2, var3, (byte)16);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("nc")
   public void method3628(int var1, int var2, int var3) {
      field1640 = this;
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("ae")
   public static void method3626(int var0, short var1) {
      try {
         if (!classNP.field4698.isEmpty()) {
            if (var1 != -9107) {
               throw new IllegalStateException();
            }

            Iterator var2 = classNP.field4698.iterator();

            while (var2.hasNext()) {
               if (var1 != -9107) {
                  throw new IllegalStateException();
               }

               MidiRequest var3 = (MidiRequest)var2.next();
               if (null != var3) {
                  var3.field4635 = var0 * -1016653583;
               }
            }

            MidiRequest var5 = (MidiRequest)classNP.field4698.get(0);
            if (var5 != null) {
               if (var1 != -9107) {
                  throw new IllegalStateException();
               }

               if (null != var5.field4641) {
                  if (var1 != -9107) {
                     throw new IllegalStateException();
                  }

                  if (var5.field4641.method8041((byte)10)) {
                     if (var1 != -9107) {
                        return;
                     }

                     if (!var5.field4634) {
                        if (var1 != -9107) {
                           return;
                        }

                        var5.field4641.method8009(var0, -530242251);
                        var5.field4631 = var0;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method3621() {
      return -1403792956 * this.field1636;
   }

   public int getDisappearsOnGameCycle() {
      return this.field1636 * -660838951;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method3618() {
      return this.field1636 * 1682911625;
   }
}
