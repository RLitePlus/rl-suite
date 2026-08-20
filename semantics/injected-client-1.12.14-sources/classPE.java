import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pe")
public class classPE {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4797 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4799 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4798 = 1;

   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;III)I")
   @ObfuscatedName("ag")
   public static int method8718(DynamicArray var0, Object var1, int var2, int var3, int var4) {
      try {
         if (var2 < 0) {
            if (var4 != 703900950) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         label117: {
            if (var3 >= 0) {
               if (var4 != 703900950) {
                  throw new IllegalStateException();
               }

               if (var3 <= var0.method11215((byte)94)) {
                  break label117;
               }

               if (var4 != 703900950) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.method11215((byte)80);
         }

         if (var0.field6107 == class586.field6376) {
            if (var4 != 703900950) {
               throw new IllegalStateException();
            }

            int[] var11 = var0.method11207(2053374425);
            int var13 = (Integer)var1;

            for (int var7 = var3 - 1; var7 >= var2; var7--) {
               if (var13 == var11[var7]) {
                  if (var4 != 703900950) {
                     throw new IllegalStateException();
                  }

                  return var7;
               }
            }
         } else if (class586.field6377 == var0.field6107) {
            if (var4 != 703900950) {
               throw new IllegalStateException();
            }

            long[] var10 = DynamicArray.method11211(var0, (byte)116);
            long var12 = (Long)var1;

            for (int var8 = var3 - 1; var8 >= var2; var8--) {
               if (var4 != 703900950) {
                  throw new IllegalStateException();
               }

               if (var12 == var10[var8]) {
                  if (var4 != 703900950) {
                     throw new IllegalStateException();
                  }

                  return var8;
               }
            }
         } else {
            Object[] var5 = var0.method11214((byte)34);
            int var6 = var3 - 1;

            while (true) {
               if (var6 < var2) {
                  return -1;
               }

               if (var4 != 703900950) {
                  throw new IllegalStateException();
               }

               if (var1 == var5[var6]) {
                  break;
               }

               if (var5[var6] != null && var5[var6].equals(var1)) {
                  if (var4 != 703900950) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               var6--;
            }

            return var6;
         }

         return -1;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "pe.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("lz")
   static boolean method8719(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Scene.method5622(var0, var1, var2, var3, var4, var5, var6);

      try {
         Scene var8 = AsyncHttpResponse.worldView.scene;
         if (var5 == class405.field4828.field4827 * -922772659) {
            if (var7 <= 326788589) {
               throw new IllegalStateException();
            }

            BoundaryObject var9 = classXR.method12494(var8, var0, var1, var2);
            if (null != var9) {
               if (var7 <= 326788589) {
                  throw new IllegalStateException();
               }

               int var10 = HorizontalAlignment.Entity_unpackID(var9.tag * -4972732868916429537L);
               if (var3 == -13030657 * WorldMapDecorationType.field4703.id) {
                  var9.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var10, 2, 4 + var4, var0, var1, var2, var6, false, var9.renderable1);
                  var9.renderable2 = new DynamicObject(AsyncHttpResponse.worldView, var10, 2, 1 + var4 & 3, var0, var1, var2, var6, false, var9.renderable2);
               } else {
                  var9.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var10, var3, var4, var0, var1, var2, var6, false, var9.renderable1);
               }

               Scene.method5712(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (-922772659 * class405.field4829.field4827 == var5) {
            if (var7 <= 326788589) {
               throw new IllegalStateException();
            }

            WallDecoration var12 = Scene.method5788(var8, var0, var1, var2);
            if (var12 != null) {
               if (var7 <= 326788589) {
                  throw new IllegalStateException();
               }

               label97: {
                  int var15 = HorizontalAlignment.Entity_unpackID(var12.tag * -7524770072208173231L);
                  if (var3 != -13030657 * WorldMapDecorationType.field4718.id) {
                     if (-13030657 * WorldMapDecorationType.field4707.id != var3) {
                        if (WorldMapDecorationType.field4708.id * -13030657 == var3) {
                           if (var7 <= 326788589) {
                              throw new IllegalStateException();
                           }

                           var12.renderable1 = new DynamicObject(
                              AsyncHttpResponse.worldView, var15, 4, var4 + 4, var0, var1, var2, var6, false, var12.renderable1
                           );
                        } else if (var3 == WorldMapDecorationType.field4709.id * -13030657) {
                           var12.renderable1 = new DynamicObject(
                              AsyncHttpResponse.worldView, var15, 4, 4 + (var4 + 2 & 3), var0, var1, var2, var6, false, var12.renderable1
                           );
                        } else if (WorldMapDecorationType.field4710.id * -13030657 == var3) {
                           var12.renderable1 = new DynamicObject(
                              AsyncHttpResponse.worldView, var15, 4, var4 + 4, var0, var1, var2, var6, false, var12.renderable1
                           );
                           var12.renderable2 = new DynamicObject(
                              AsyncHttpResponse.worldView, var15, 4, 4 + (2 + var4 & 3), var0, var1, var2, var6, false, var12.renderable2
                           );
                        }
                        break label97;
                     }

                     if (var7 <= 326788589) {
                        throw new IllegalStateException();
                     }
                  }

                  var12.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var15, 4, var4, var0, var1, var2, var6, false, var12.renderable1);
               }

               Scene.method5712(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (var5 == class405.field4830.field4827 * -922772659) {
            if (var7 <= 326788589) {
               throw new IllegalStateException();
            }

            GameObject var13 = Scene.method5734(var8, var0, var1, var2);
            if (-13030657 * WorldMapDecorationType.field4722.id == var3) {
               if (var7 <= 326788589) {
                  throw new IllegalStateException();
               }

               var3 = -13030657 * WorldMapDecorationType.field4723.id;
            }

            if (var13 != null) {
               var13.renderable = new DynamicObject(
                  AsyncHttpResponse.worldView,
                  HorizontalAlignment.Entity_unpackID(1608625415500949283L * var13.tag),
                  var3,
                  var4,
                  var0,
                  var1,
                  var2,
                  var6,
                  false,
                  var13.renderable
               );
               Scene.method5712(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (var5 == -922772659 * class405.field4831.field4827) {
            if (var7 <= 326788589) {
               throw new IllegalStateException();
            }

            FloorDecoration var14 = var8.method5778(var0, var1, var2);
            if (null != var14) {
               var14.renderable = new DynamicObject(
                  AsyncHttpResponse.worldView, HorizontalAlignment.Entity_unpackID(var14.tag), 22, var4, var0, var1, var2, var6, false, var14.renderable
               );
               Scene.method5712(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         }

         Scene.method5712(var0, var1, var2, var3, var4, var5, var6);
         return false;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "pe.lz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;I)V")
   @ObfuscatedName("kp")
   static void method8720(WorldView var0, int var1) {
      int var2 = SecureUrlRequester.client.method2562();
      if (!client.$assertionsDisabled && var2 != 25 && var2 != 30) {
         throw new AssertionError();
      } else if (!client.$assertionsDisabled && !client.field778) {
         throw new AssertionError();
      } else if (client.field1030 != null) {
         if (client.field1030.method9585()) {
            rl4 var4 = client.field1030;
            client.field1030 = null;
            client.field1042 = false;
            client.method2439(var4);
            client.field778 = false;
            ClientPacket.field3962 = null;
         }
      } else {
         rl4 var3 = new rl4(client.field1025, 0, var0, rl2.method9552(false));
         var0.field1337 = var3.field5637.field5592;
         var0.field1334 = var3.field5637.field5591;
         var0.field1335 = var3.field5637.field5594;
         var0.field1336 = var3.field5637.field5593;
         if (!client.$assertionsDisabled && AsyncHttpResponse.worldView != var0) {
            throw new AssertionError();
         } else {
            var3.field5648 = AsyncHttpResponse.worldView.plane * 2115028565;
            if (!client.$assertionsDisabled && ClientPacket.field3962 != var0) {
               throw new AssertionError();
            } else if (!client.$assertionsDisabled && client.field1042) {
               throw new AssertionError();
            } else {
               client.field1042 = true;
               if (!client.$assertionsDisabled && client.field1030 != null) {
                  throw new AssertionError();
               } else {
                  client.field1030 = var3;
                  var3.method9592();
               }
            }
         }
      }
   }

   classPE() throws Throwable {
      throw new Error();
   }
}
