import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ny")
@classNN
public final class class339 {
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field4373 = 57;
   @ObfuscatedName("bp")
   static int field4374;
   @ObfuscatedName("ag")
   static final HashMap field4367 = new HashMap();
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4368 = 27;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4371 = 76;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("dr")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("ab")
   public static int field4369;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4370 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final long field4375 = 86400000L;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4372 = 11745;

   @ObfuscatedSignature(descriptor = "([Lof;Lof;ZI)V")
   @ObfuscatedName("ml")
   static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2, int var3) {
      try {
         int var10000;
         if (0 != -111672215 * var1.scrollWidth) {
            if (var3 >= 369664896) {
               throw new IllegalStateException();
            }

            var10000 = -111672215 * var1.scrollWidth;
         } else {
            var10000 = var1.width * -1946208531;
         }

         int var4 = var10000;
         if (var1.scrollHeight * -1963554889 != 0) {
            if (var3 >= 369664896) {
               throw new IllegalStateException();
            }

            var10000 = var1.scrollHeight * -1963554889;
         } else {
            var10000 = var1.height * -905446999;
         }

         int var5 = var10000;
         class452.resizeInterface(
            var0, -1516264759 * var1.field4453, -86298045 * var1.field4454, var1.id * 278777747, 2077538819 * var1.childIndex, var4, var5, var2, -1999685430
         );
         if (null != var1.children) {
            class452.resizeInterface(var1.children, 0, var1.children.length - 1, var1.id * 278777747, -1, var4, var5, var2, -1913574657);
         }

         if (-1 == 2077538819 * var1.childIndex) {
            if (var3 >= 369664896) {
               throw new IllegalStateException();
            }

            InterfaceParent var6 = (InterfaceParent)client.interfaceParents.method8915(var1.id * 278777747);
            if (var6 != null) {
               if (var3 >= 369664896) {
                  throw new IllegalStateException();
               }

               ActorSpotAnim.method11200(-1385287145 * var6.group, var4, var5, var2, (short)8211);
            }
         }

         if (1337 == 1889823193 * var1.contentType && var3 >= 369664896) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ny.ml(" + ')');
      }
   }

   static {
      TimeZone var0;
      synchronized (field4367) {
         TimeZone var2 = (TimeZone)field4367.get("Europe/London");
         if (null == var2) {
            var2 = TimeZone.getTimeZone("Europe/London");
            field4367.put("Europe/London", var2);
         }

         var0 = var2;
      }

      Calendar.getInstance(var0);
   }

   @ObfuscatedSignature(descriptor = "(I)Lbn;")
   @ObfuscatedName("aw")
   static World worldListStart(int var0) {
      try {
         World.World_listCount = 0;
         return class217.getNextWorldListWorld(-1689253204);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ny.aw(" + ')');
      }
   }

   class339() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Lof;IIIIIII)V")
   @ObfuscatedName("nv")
   static final void method7871(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (client.field830) {
            if (var7 >= 142919431) {
               throw new IllegalStateException();
            }

            client.alternativeScrollbarWidth = -132438688;
         } else {
            client.alternativeScrollbarWidth = 0;
         }

         label150: {
            client.field830 = false;
            if (1 != MouseHandler.MouseHandler_currentButton * -233863237) {
               if (UrlRequest.mouseCam) {
                  break label150;
               }

               if (var7 >= 142919431) {
                  throw new IllegalStateException();
               }

               if (MouseHandler.MouseHandler_currentButton * -233863237 != 4) {
                  break label150;
               }

               if (var7 >= 142919431) {
                  return;
               }
            }

            if (var5 >= var1) {
               if (var7 >= 142919431) {
                  return;
               }

               if (var5 < var1 + 16) {
                  if (var7 >= 142919431) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= var2) {
                     if (var7 >= 142919431) {
                        throw new IllegalStateException();
                     }

                     if (var6 < 16 + var2) {
                        if (var7 >= 142919431) {
                           throw new IllegalStateException();
                        }

                        var0.scrollY -= 2117943364;
                        class376.invalidateWidget(var0, (byte)5);
                        break label150;
                     }
                  }
               }
            }

            if (var5 >= var1) {
               if (var7 >= 142919431) {
                  throw new IllegalStateException();
               }

               if (var5 < var1 + 16) {
                  if (var7 >= 142919431) {
                     return;
                  }

                  if (var6 >= var3 + var2 - 16) {
                     if (var7 >= 142919431) {
                        throw new IllegalStateException();
                     }

                     if (var6 < var2 + var3) {
                        if (var7 >= 142919431) {
                           return;
                        }

                        var0.scrollY += 2117943364;
                        class376.invalidateWidget(var0, (byte)5);
                        break label150;
                     }
                  }
               }
            }

            if (var5 >= var1 - 497360259 * client.alternativeScrollbarWidth && var5 < 16 + var1 + client.alternativeScrollbarWidth * 497360259) {
               if (var7 >= 142919431) {
                  return;
               }

               if (var6 >= 16 + var2 && var6 < var2 + var3 - 16) {
                  if (var7 >= 142919431) {
                     throw new IllegalStateException();
                  }

                  int var8 = (var3 - 32) * var3 / var4;
                  if (var8 < 8) {
                     var8 = 8;
                  }

                  int var9 = var6 - var2 - 16 - var8 / 2;
                  int var10 = var3 - 32 - var8;
                  var0.scrollY = 1603227665 * (var9 * (var4 - var3) / var10);
                  class376.invalidateWidget(var0, (byte)5);
                  client.field830 = true;
               }
            }
         }

         if (client.mouseWheelRotation * -2138892451 != 0) {
            if (var7 >= 142919431) {
               throw new IllegalStateException();
            }

            int var12 = -1946208531 * var0.width;
            if (var5 >= var1 - var12 && var6 >= var2) {
               if (var7 >= 142919431) {
                  return;
               }

               if (var5 < var1 + 16) {
                  if (var7 >= 142919431) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= var2 + var3) {
                     if (var7 >= 142919431) {
                        throw new IllegalStateException();
                     }

                     var0.scrollY = var0.scrollY + client.mouseWheelRotation * -838885143;
                     class376.invalidateWidget(var0, (byte)5);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ny.nv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   public static boolean method7868(int var0, int var1) {
      try {
         boolean var10000;
         if ((var0 >> 23 & 1) != 0) {
            if (var1 >= 1687041549) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ny.ae(" + ')');
      }
   }
}
