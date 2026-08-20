import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fp")
public class AABB implements net.runelite.api.AABB {
   @ObfuscatedName("az")
   final int field2364;
   @ObfuscatedName("af")
   int field2367;
   @ObfuscatedName("ae")
   int field2366;
   @ObfuscatedName("ab")
   int field2369;
   @ObfuscatedName("ag")
   int field2368;
   @ObfuscatedName("ax")
   int field2370;
   @ObfuscatedName("as")
   int field2365;
   @ObfuscatedSignature(descriptor = "Lfp;")
   @ObfuscatedName("ac")
   AABB field2371;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("ck")
   static IndexedSprite field2372;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("mj")
   static IndexedSprite[] field2373;

   public int getExtremeX() {
      return this.field2368 * 1301855055;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int method4914() {
      return 2105673973 * this.field2370 + this.field2369 * -81102275;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   int method4900(int var1) {
      try {
         return -915116879 * this.field2367 - this.field2368 * 1301855055;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int method4902(int var1) {
      try {
         return this.field2368 * 1301855055 + -915116879 * this.field2367;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method4905(int var1) {
      try {
         return this.field2366 * -1027280203 - this.field2365 * -623192411;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfp;B)I")
   @ObfuscatedName("xz")
   public static int method4909(AABB var0, byte var1) {
      if (var0 == null) {
         return var0.method4911(var1);
      } else {
         try {
            return -623192411 * var0.field2365 + var0.field2366 * -1027280203;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "fp.ab(" + 41);
         }
      }
   }

   public int getCenterY() {
      return this.field2366 * -1027280203;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   int method4912(int var1) {
      try {
         return -81102275 * this.field2369 - 2105673973 * this.field2370;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.ag(" + 41);
      }
   }

   public int getExtremeZ() {
      return this.field2370 * 2105673973;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   int method4915(byte var1) {
      try {
         return 2105673973 * this.field2370 + this.field2369 * -81102275;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method4916() {
      return 2105673973 * this.field2370 + this.field2369 * -81102275;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method4906() {
      return this.field2366 * -1027280203 - this.field2365 * -623192411;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("zk")
   public static void method4917(Player var0) {
      if (var0 == null) {
         var0.isClanMember();
      }

      var0.field1268 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "([BIIIIS)Z")
   @ObfuscatedName("al")
   static boolean method4918(byte[] var0, int var1, int var2, int var3, int var4, short var5) {
      try {
         boolean var6 = true;
         Buffer var7 = new Buffer(var0);
         int var8 = -1;

         label124:
         while (true) {
            int var9 = var7.method13100((byte)27);
            if (var9 == 0) {
               return var6;
            }

            var8 += var9;
            int var10 = 0;
            boolean var11 = false;

            while (true) {
               while (!var11) {
                  int var12 = var7.method13094((short)11060);
                  if (0 == var12) {
                     if (var5 == 16384) {
                        throw new IllegalStateException();
                     }
                     continue label124;
                  }

                  var10 += var12 - 1;
                  int var13 = var10 & 63;
                  int var14 = var10 >> 6 & 63;
                  int var15 = Buffer.method13039(var7, -346779531) >> 2;
                  int var16 = var1 + var14;
                  int var17 = var2 + var13;
                  if (var16 >= 0) {
                     if (var5 == 16384) {
                        throw new IllegalStateException();
                     }

                     if (var17 >= 0 && var16 <= var3) {
                        if (var5 == 16384) {
                           throw new IllegalStateException();
                        }

                        if (var17 <= var4) {
                           if (var5 == 16384) {
                              throw new IllegalStateException();
                           }

                           classOM var18 = classMU.method7729(var8, 2001168762);
                           boolean var10000;
                           if (classKB.field3537.field3538 * 78062377 == var15) {
                              if (var5 == 16384) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           boolean var19 = var10000;
                           if (var19) {
                              if (var5 == 16384) {
                                 throw new IllegalStateException();
                              }

                              if (client.field885) {
                                 if (var5 == 16384) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == 1663954033 * var18.field4923 && var18.field4946 * -2040437663 != 1) {
                                    if (var5 == 16384) {
                                       throw new IllegalStateException();
                                    }

                                    if (!var18.field4933) {
                                       continue;
                                    }
                                 }
                              }
                           }

                           if (!classOM.method8538(var18, -874336012)) {
                              if (var5 == 16384) {
                                 throw new IllegalStateException();
                              }

                              client.field816 += -1004880473;
                              var6 = false;
                           }

                           var11 = true;
                        }
                     }
                  }
               }

               int var21 = var7.method13094((short)21120);
               if (var21 == 0) {
                  if (var5 == 16384) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               Buffer.method13039(var7, -346779531);
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.newRunException(var20, "fp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method4907() {
      return this.field2366 * -1027280203 - this.field2365 * -623192411;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method4908() {
      return this.field2366 * -1027280203 - this.field2365 * -623192411;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method4901() {
      return -732726773 * this.field2367 - this.field2368 * 1512821760;
   }

   public int getCenterX() {
      return this.field2367 * -915116879;
   }

   public int getExtremeY() {
      return this.field2365 * -623192411;
   }

   public int getCenterZ() {
      return this.field2369 * -81102275;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method4910() {
      return -1573099654 * this.field2365 + this.field2366 * -1027280203;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int method4913() {
      return -81102275 * this.field2369 - 2105673973 * this.field2370;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method4903() {
      return this.field2368 * 1301855055 + -915116879 * this.field2367;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method4904() {
      return this.field2368 * -1071915259 + 2125240123 * this.field2367;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eq")
   static void method4919(int var0) {
      try {
         client.menu.field6797 = 0;
         client.menu.method12696(-1);
         client.field973 = false;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "fp.eq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method4899(AbstractArchive var0, int var1) {
      try {
         classPH.field5254 = var0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.az(" + ')');
      }
   }

   AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field2364 = -640752131 * var1;
      this.field2367 = 993680465 * var2;
      this.field2366 = 1956637597 * var3;
      this.field2369 = -1663537899 * var4;
      this.field2368 = -1181254737 * var5;
      this.field2365 = var6 * -522641107;
      this.field2370 = var7 * 1704747869;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("as")
   int method4911(byte var1) {
      try {
         return -623192411 * this.field2367 + this.field2370 * -1027280203;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fp.ab(" + 41);
      }
   }
}
