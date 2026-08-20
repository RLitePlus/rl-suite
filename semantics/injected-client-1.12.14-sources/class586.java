import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wh")
public class class586 implements Enum {
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("av")
   public static final class586 field6376 = new class586(3, 0, Integer.class, new classWD());
   @ObfuscatedName("aj")
   public final int field6372;
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("ag")
   public static final class586 field6379 = new class586(0, 2, String.class, new classWF());
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("an")
   static final class586 field6378 = new class586(1, 5, DynamicArray.class, new classWX());
   @ObfuscatedName("ae")
   public final int field6375;
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("at")
   public static final class586 field6377 = new class586(2, 1, Long.class, new classWJ());
   @ObfuscatedName("ak")
   public final Class field6373;
   @ObfuscatedSignature(descriptor = "Lwk;")
   @ObfuscatedName("aw")
   final classWK field6374;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6380 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field6381 = 15574765;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field6372 * 50478497;
   }

   class586(int var1, int var2, Class var3, classWK var4) {
      this.field6375 = -1247742243 * var1;
      this.field6372 = var2 * -741808543;
      this.field6373 = var3;
      this.field6374 = var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;Z)Ldq;")
   @ObfuscatedName("jj")
   public static RawSound method11703(SoundEffect var0, boolean var1) {
      return var0.field1516 == 0 ? var0.method3580(var1) : var0.field1518.method3875((byte)-85);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;B)V")
   @ObfuscatedName("aj")
   public static void method11708(Object var0, Buffer var1, byte var2) {
      try {
         Class var4 = var0.getClass();
         class586[] var6 = method11705((byte)-27);
         int var7 = 0;

         class586 var5;
         while (true) {
            if (var7 >= var6.length) {
               var5 = null;
               break;
            }

            if (var2 == 1) {
               return;
            }

            class586 var8 = var6[var7];
            if (var4 == var8.field6373) {
               var5 = var8;
               break;
            }

            var7++;
         }

         if (var5 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            classWK var3 = var5.field6374;
            var3.vmethod447(var0, var1, -1722278579);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "wh.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field6372 * 50478497;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wh.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   public Object method11713(Buffer var1) {
      return this.field6374.vmethod443(var1, (byte)-40);
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ac")
   static void updateLoginStatusUsernameRemembered(boolean var0, int var1) {
      try {
         byte var2 = 0;
         boolean var10000;
         if (class468.clientPreferences.getEULA((byte)-124) >= 744188887 * client.field715) {
            if (var1 >= 225322252) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (!var3) {
            var2 = 12;
         } else {
            label76: {
               if (!SecureUrlRequester.client.containsAccessAndRefreshToken(-2137392313)) {
                  if (var1 >= 225322252) {
                     throw new IllegalStateException();
                  }

                  if (!SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-56)) {
                     if (var1 >= 225322252) {
                        throw new IllegalStateException();
                     }

                     if (!SecureUrlRequester.client.containsSessionAndCharacterId(1950212571)) {
                        break label76;
                     }

                     if (var1 >= 225322252) {
                        return;
                     }
                  }
               }

               var2 = 10;
            }
         }

         class30.method1308(var2, 1169646524);
         if (var0) {
            if (var1 >= 225322252) {
               throw new IllegalStateException();
            }

            Login.Login_username = "";
            client.method2115(-1);
            Login.Login_password = "";
            class28.otpMedium = 0;
            UserComparator6.otp = "";
         }

         label66: {
            if (Login.Login_username != null) {
               if (var1 >= 225322252) {
                  return;
               }

               if (!Login.Login_username.isEmpty()) {
                  if (var1 >= 225322252) {
                     throw new IllegalStateException();
                  }
                  break label66;
               }
            }

            if (class468.clientPreferences.getRememberedUsername(1387249513) != null) {
               if (var1 >= 225322252) {
                  throw new IllegalStateException();
               }

               Login.Login_username = class468.clientPreferences.getRememberedUsername(1999439209);
               client.method2115(-1);
               client.Login_isUsernameRemembered = true;
            } else {
               client.Login_isUsernameRemembered = false;
            }
         }

         WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wh.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field6372 * 50478497;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lwh;")
   @ObfuscatedName("aw")
   public static class586[] method11704() {
      return new class586[]{field6377, field6376, field6378, field6379};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ad")
   public static void method11709(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class586[] var5 = method11705((byte)-82);
      int var6 = 0;

      class586 var4;
      while (true) {
         if (var6 >= var5.length) {
            var4 = null;
            break;
         }

         class586 var7 = var5[var6];
         if (var3 == var7.field6373) {
            var4 = var7;
            break;
         }

         var6++;
      }

      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classWK var2 = var4.field6374;
         var2.vmethod447(var0, var1, 1966969717);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("az")
   public static void method11710(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class586[] var5 = method11705((byte)-30);
      int var6 = 0;

      class586 var4;
      while (true) {
         if (var6 >= var5.length) {
            var4 = null;
            break;
         }

         class586 var7 = var5[var6];
         if (var3 == var7.field6373) {
            var4 = var7;
            break;
         }

         var6++;
      }

      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classWK var2 = var4.field6374;
         var2.vmethod447(var0, var1, 1375556583);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("au")
   public static void method11711(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class586[] var5 = method11705((byte)-5);
      int var6 = 0;

      class586 var4;
      while (true) {
         if (var6 >= var5.length) {
            var4 = null;
            break;
         }

         class586 var7 = var5[var6];
         if (var3 == var7.field6373) {
            var4 = var7;
            break;
         }

         var6++;
      }

      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classWK var2 = var4.field6374;
         var2.vmethod447(var0, var1, -788898396);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIILci;I)V")
   @ObfuscatedName("kn")
   static void method11718(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      Player var13,
      int var14
   ) {
      try {
         ObjectComposition var15;
         int var16;
         int var17;
         label66: {
            var15 = AsyncHttpResponse.getObjectDefinition(var6, 2045194027);
            if (1 != var4) {
               if (var14 != 72748354) {
                  return;
               }

               if (3 != var4) {
                  var16 = var15.sizeX * 1813358617;
                  var17 = -352504863 * var15.sizeY;
                  break label66;
               }

               if (var14 != 72748354) {
                  throw new IllegalStateException();
               }
            }

            var16 = var15.sizeY * -352504863;
            var17 = var15.sizeX * 1813358617;
         }

         int var18 = var1 + (var16 >> 1);
         int var19 = (1 + var16 >> 1) + var1;
         int var20 = (var17 >> 1) + var2;
         int var21 = var2 + (var17 + 1 >> 1);
         int[][] var22 = AsyncHttpResponse.worldView.tileHeights[var0];
         int var23 = var22[var19][var21] + var22[var18][var21] + var22[var18][var20] + var22[var19][var20] >> 2;
         int var24 = (var16 << 6) + (var1 << 7);
         int var25 = (var17 << 6) + (var2 << 7);
         Model var26 = var15.getModel(var3, var4, var22, var24, var23, var25, -1306349006);
         if (var26 != null) {
            if (var14 != 72748354) {
               throw new IllegalStateException();
            }

            HttpRequest.method281(AsyncHttpResponse.worldView, var0, var1, var2, var5, -1, 0, 0, 31, null, 1 + var7, var8 + 1, (byte)1);
            var13.animationCycleStart = (var7 + 1759706017 * client.cycle) * 791162105;
            var13.animationCycleEnd = (1759706017 * client.cycle + var8) * -2067706253;
            var13.model0 = var26;
            var13.field581 = var1 * -216814976 + var16 * 2039076160;
            var13.field579 = -1875513536 * var17 + 543940224 * var2;
            var13.tileHeight2 = var23 * -648770891;
            if (var9 > var11) {
               if (var14 != 72748354) {
                  throw new IllegalStateException();
               }

               int var27 = var9;
               var9 = var11;
               var11 = var27;
            }

            if (var10 > var12) {
               if (var14 != 72748354) {
                  throw new IllegalStateException();
               }

               int var29 = var10;
               var10 = var12;
               var12 = var29;
            }

            var13.minX = (var1 + var9) * -740228383;
            var13.maxX = (var1 + var11) * 184883939;
            var13.minY = (var10 + var2) * -777255183;
            var13.maxY = 204173829 * (var12 + var2);
         }
      } catch (RuntimeException var28) {
         throw RestClientThreadFactory.newRunException(var28, "wh.kn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field6372 * 50478497;
   }

   @ObfuscatedSignature(descriptor = "(Lwh;Lxa;I)Ljava/lang/Object;")
   @ObfuscatedName("sj")
   public static Object method11714(class586 var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method11716(var1, var2);
      }

      try {
         return var0.field6374.vmethod443(var1, (byte)-20);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wh.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ai")
   public static void method11712(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      class586[] var5 = method11705((byte)-47);
      int var6 = 0;

      class586 var4;
      while (true) {
         if (var6 >= var5.length) {
            var4 = null;
            break;
         }

         class586 var7 = var5[var6];
         if (var3 == var7.field6373) {
            var4 = var7;
            break;
         }

         var6++;
      }

      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classWK var2 = var4.field6374;
         var2.vmethod447(var0, var1, -164755058);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("ab")
   public Object method11715(Buffer var1) {
      return this.field6374.vmethod443(var1, (byte)-56);
   }

   @ObfuscatedSignature(descriptor = "(B)[Lwh;")
   @ObfuscatedName("ae")
   public static class586[] method11705(byte var0) {
      try {
         return new class586[]{field6377, field6376, field6378, field6379};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wh.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lwh;")
   @ObfuscatedName("ap")
   public static class586[] method11706() {
      return new class586[]{field6377, field6376, field6378, field6379};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lwh;")
   @ObfuscatedName("ay")
   public static class586[] method11707() {
      return new class586[]{field6377, field6376, field6378, field6379};
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)Ljava/lang/Object;")
   @ObfuscatedName("ak")
   public Object method11716(Buffer var1, int var2) {
      try {
         return this.field6374.vmethod443(var1, (byte)-20);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wh.ak(" + ')');
      }
   }
}
