import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cr")
public final class classCR extends classDW {
   @ObfuscatedName("ae")
   final int field1225;
   @ObfuscatedName("af")
   final int field1224;
   @ObfuscatedSignature(descriptor = "Lom;")
   @ObfuscatedName("az")
   final classOM field1226;
   @ObfuscatedName("ab")
   final int field1223;
   @ObfuscatedName("ag")
   final int field1222;
   @ObfuscatedName("ai")
   static int[] field1229;
   @ObfuscatedSignature(descriptor = "Lxc;")
   @ObfuscatedName("ls")
   static classXC field1228;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final String field1227 = "time_";
   @ObfuscatedSignature(descriptor = "[Lym;")
   @ObfuscatedName("dr")
   static classYM[] field1230;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod189(int var1) {
      try {
         if (this.field1226 != null) {
            classOM var2 = classOM.method8553(this.field1226, 536945921);
            if (var2 == null) {
               if (var1 < 832295818) {
                  this.field1643 = true;
               }
            } else {
               int var3 = this.field1653.field6689 * -1727985133;
               classDW.method3648(this, var2.method8573(-1791192545), classOM.method8577(var2, -505192310), (byte)-115);
               if (var3 != this.field1653.field6689 * -1727985133) {
                  if (var1 >= 832295818) {
                     return;
                  }

                  this.field1643 = true;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cr.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   int vmethod206() {
      return -1463897325 * this.field1225;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   @Override
   int vmethod194(int var1) {
      try {
         return this.field1222 * 1554998417;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cr.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   int vmethod197(int var1) {
      try {
         return -1695959623 * this.field1224;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cr.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   int vmethod198() {
      return -296194605 * this.field1224;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   @Override
   int vmethod202(int var1) {
      try {
         return -272166519 * this.field1223;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cr.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   @Override
   int vmethod201() {
      return -1695959623 * this.field1224;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   @Override
   void vmethod191() {
      if (this.field1226 != null) {
         classOM var1 = classOM.method8553(this.field1226, -2110577582);
         if (var1 == null) {
            this.field1643 = true;
         } else {
            int var2 = this.field1653.field6689 * -1727985133;
            classDW.method3648(this, var1.method8573(-1965626288), classOM.method8577(var1, 1434627516), (byte)-14);
            if (var2 != this.field1653.field6689 * -1727985133) {
               this.field1643 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   int vmethod205(int var1) {
      try {
         return -1463897325 * this.field1225;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cr.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("rw")
   public static void method2574(classER var0) {
      if (var0 == null) {
         var0.method4050();
      }

      for (int var1 = 0; var1 < var0.field1848; var1++) {
         int var2 = (int)var0.field1855[var1];
         var0.field1855[var1] = var0.field1857[var1];
         var0.field1857[var1] = -var2;
      }

      var0.method4018();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   @Override
   void vmethod192() {
      if (this.field1226 != null) {
         classOM var1 = classOM.method8553(this.field1226, -442636602);
         if (var1 == null) {
            this.field1643 = true;
         } else {
            int var2 = this.field1653.field6689 * -1727985133;
            classDW.method3648(this, var1.method8573(-1500222471), classOM.method8577(var1, -185001088), (byte)-13);
            if (var2 != this.field1653.field6689 * -1727985133) {
               this.field1643 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   int vmethod196() {
      return this.field1222 * 1554998417;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   @Override
   int vmethod195() {
      return this.field1222 * 1554998417;
   }

   classCR(int var1, int var2, int var3, int var4, int var5, classOM var6) {
      super(var1, var6.field4963, var6.field4934);
      this.field1222 = var2 * 229170289;
      this.field1223 = var3 * -1773095751;
      this.field1224 = var4 * -415514487;
      this.field1225 = var5 * -1297674469;
      if (var6.field4930 != null) {
         this.field1226 = var6;
      } else {
         this.field1226 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   int vmethod203() {
      return -272166519 * this.field1223;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   @Override
   int vmethod199() {
      return -1695959623 * this.field1224;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   @Override
   void vmethod193() {
      if (this.field1226 != null) {
         classOM var1 = classOM.method8553(this.field1226, 1692920758);
         if (var1 == null) {
            this.field1643 = true;
         } else {
            int var2 = this.field1653.field6689 * -1727985133;
            classDW.method3648(this, var1.method8573(-1417431927), classOM.method8577(var1, 1018823552), (byte)-32);
            if (var2 != this.field1653.field6689 * -1727985133) {
               this.field1643 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   @Override
   void vmethod190() {
      if (this.field1226 != null) {
         classOM var1 = classOM.method8553(this.field1226, -319127228);
         if (var1 == null) {
            this.field1643 = true;
         } else {
            int var2 = this.field1653.field6689 * 1592687841;
            classDW.method3648(this, var1.method8573(-1210954853), classOM.method8577(var1, 1705588069), (byte)-81);
            if (var2 != this.field1653.field6689 * -1727985133) {
               this.field1643 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   int vmethod200() {
      return -1695959623 * this.field1224;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   int vmethod204() {
      return -1463897325 * this.field1225;
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)Z")
   @ObfuscatedName("ga")
   static final boolean method2575(classLW var0, int var1) {
      try {
         int var2 = var0.field4334 * -90794217;
         if (205 == var2) {
            if (var1 <= -1935244272) {
               throw new IllegalStateException();
            } else {
               client.field820 = -878412626;
               return true;
            }
         } else {
            if (var2 >= 300) {
               if (var1 <= -1935244272) {
                  throw new IllegalStateException();
               }

               if (var2 <= 313) {
                  if (var1 <= -1935244272) {
                     throw new IllegalStateException();
                  }

                  int var3 = (var2 - 300) / 2;
                  int var4 = var2 & 1;
                  boolean var10002;
                  if (1 == var4) {
                     if (var1 <= -1935244272) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  classLC.method6684(client.field992, var3, var10002, (short)6341);
               }
            }

            if (var2 >= 314) {
               if (var1 <= -1935244272) {
                  throw new IllegalStateException();
               }

               if (var2 <= 323) {
                  if (var1 <= -1935244272) {
                     throw new IllegalStateException();
                  }

                  int var6 = (var2 - 314) / 2;
                  int var8 = var2 & 1;
                  boolean var9;
                  if (1 == var8) {
                     if (var1 <= -1935244272) {
                        throw new IllegalStateException();
                     }

                     var9 = true;
                  } else {
                     var9 = false;
                  }

                  classLC.method6687(client.field992, var6, var9, (byte)-22);
               }
            }

            if (324 == var2) {
               if (var1 <= -1935244272) {
                  throw new IllegalStateException();
               }

               client.field992.method6690(0, 2028089891);
            }

            if (325 == var2) {
               if (var1 <= -1935244272) {
                  throw new IllegalStateException();
               }

               client.field992.method6690(1, -390820530);
            }

            if (var2 == 326) {
               if (var1 <= -1935244272) {
                  throw new IllegalStateException();
               } else {
                  classJL var7 = classEF.method3849(classJS.UPDATE_PLAYER_MODEL_V2, client.field795.field1535, (byte)-9);
                  client.field992.method6693(var7.field3343, 840149137);
                  client.field795.method3367(var7, -1301097035);
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cr.ga(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("ag")
   static final void method2573(String var0, int var1, int var2) {
      try {
         classJL var3 = classEF.method3849(classJS.FRIENDCHAT_SETRANK, client.field795.field1535, (byte)-61);
         classXY.method12971(var3.field3343, classAU.method712(var0, (byte)59) + 1, (byte)-3);
         var3.field3343.method13153(var1, (byte)72);
         classXY.method12997(var3.field3343, var0, (short)12406);
         client.field795.method3367(var3, -1301097035);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cr.ag(" + ')');
      }
   }
}
