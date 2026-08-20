import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oe")
public class WidgetConfigNode extends Node implements net.runelite.api.widgets.WidgetConfigNode {
   @ObfuscatedName("av")
   final int start;
   @ObfuscatedName("at")
   final int end;
   @ObfuscatedName("an")
   final int opMask;
   @ObfuscatedName("ag")
   final int clickMask;
   @ObfuscatedSignature(descriptor = "Loe;")
   @ObfuscatedName("ae")
   WidgetConfigNode nextWidgetConfigNode;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final byte field4425 = 4;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("ci")
   static IndexedSprite options_buttons_2Sprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field4426 = 262144;

   public int getOpMask() {
      return this.opMask * 2063023149;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;IIII)Loe;")
   @ObfuscatedName("ay")
   public static WidgetConfigNode method7985(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
      WidgetConfigNode var5 = var0;

      for (WidgetConfigNode var6 = null; null != var5; var5 = var5.nextWidgetConfigNode) {
         if (1508033891 * var5.end >= var1 && var5.start * -1247489297 <= var2) {
            if (var6 != null) {
               var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
            } else {
               var0 = var5.nextWidgetConfigNode;
            }

            if (-1247489297 * var5.start < var1) {
               WidgetConfigNode var7 = new WidgetConfigNode(var5.start * -1247489297, var1 - 1, 1825652171 * var5.clickMask, 2063023149 * var5.opMask);
               if (null != var6) {
                  var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var7.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.end * 1508033891 > var2) {
               WidgetConfigNode var11 = new WidgetConfigNode(var2 + 1, 1508033891 * var5.end, 1825652171 * var5.clickMask, var5.opMask * 2063023149);
               if (null != var6) {
                  var11.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var11.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var11;
               } else {
                  var0 = var11;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for (WidgetConfigNode var9 = var0; null != var9 && -1247489297 * var9.start <= var1; var9 = var9.nextWidgetConfigNode) {
         var5 = var9;
      }

      WidgetConfigNode var10 = new WidgetConfigNode(var1, var2, var3, var4);
      if (var5 != null) {
         var10.nextWidgetConfigNode = var5.nextWidgetConfigNode;
      } else {
         var10.nextWidgetConfigNode = var0;
      }

      if (var5 != null) {
         var5.nextWidgetConfigNode = var10;
      } else {
         var0 = var10;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public int method7979(int var1) {
      try {
         return this.clickMask * 1825652171;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oe.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method7980() {
      return this.clickMask * 1825652171;
   }

   public int getClickMask() {
      return this.clickMask * 1825652171;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method7981() {
      return this.clickMask * -2060720101;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;IIII)Loe;")
   @ObfuscatedName("ap")
   public static WidgetConfigNode method7986(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
      WidgetConfigNode var5 = var0;

      for (WidgetConfigNode var6 = null; null != var5; var5 = var5.nextWidgetConfigNode) {
         if (1508033891 * var5.end >= var1 && var5.start * -1247489297 <= var2) {
            if (var6 != null) {
               var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
            } else {
               var0 = var5.nextWidgetConfigNode;
            }

            if (-1247489297 * var5.start < var1) {
               WidgetConfigNode var7 = new WidgetConfigNode(var5.start * -1247489297, var1 - 1, 1825652171 * var5.clickMask, 2063023149 * var5.opMask);
               if (null != var6) {
                  var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var7.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.end * 1508033891 > var2) {
               WidgetConfigNode var11 = new WidgetConfigNode(var2 + 1, 1508033891 * var5.end, 1825652171 * var5.clickMask, var5.opMask * 2063023149);
               if (null != var6) {
                  var11.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var11.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var11;
               } else {
                  var0 = var11;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for (WidgetConfigNode var9 = var0; null != var9 && -1247489297 * var9.start <= var1; var9 = var9.nextWidgetConfigNode) {
         var5 = var9;
      }

      WidgetConfigNode var10 = new WidgetConfigNode(var1, var2, var3, var4);
      if (var5 != null) {
         var10.nextWidgetConfigNode = var5.nextWidgetConfigNode;
      } else {
         var10.nextWidgetConfigNode = var0;
      }

      if (var5 != null) {
         var5.nextWidgetConfigNode = var10;
      } else {
         var0 = var10;
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;)I")
   @ObfuscatedName("sx")
   public static int method7982(WidgetConfigNode var0) {
      return var0.opMask * 2063023149;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;I)Loe;")
   @ObfuscatedName("ai")
   public static WidgetConfigNode method7988(WidgetConfigNode var0, int var1) {
      for (WidgetConfigNode var2 = var0; null != var2; var2 = var2.nextWidgetConfigNode) {
         if (var1 >= -1247489297 * var2.start && var1 <= var2.end * 1508033891) {
            return var2;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;IIII)Loe;")
   @ObfuscatedName("au")
   public static WidgetConfigNode method7987(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
      WidgetConfigNode var5 = var0;

      for (WidgetConfigNode var6 = null; null != var5; var5 = var5.nextWidgetConfigNode) {
         if (277193140 * var5.end >= var1 && var5.start * 2116087976 <= var2) {
            if (var6 != null) {
               var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
            } else {
               var0 = var5.nextWidgetConfigNode;
            }

            if (-744656374 * var5.start < var1) {
               WidgetConfigNode var7 = new WidgetConfigNode(var5.start * 1328107448, var1 - 1, 1146014297 * var5.clickMask, 878283978 * var5.opMask);
               if (null != var6) {
                  var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var7.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.end * 1508033891 > var2) {
               WidgetConfigNode var11 = new WidgetConfigNode(var2 + 1, -1826123744 * var5.end, 981463708 * var5.clickMask, var5.opMask * 2063023149);
               if (null != var6) {
                  var11.nextWidgetConfigNode = var6.nextWidgetConfigNode;
               } else {
                  var11.nextWidgetConfigNode = var0;
               }

               if (null != var6) {
                  var6.nextWidgetConfigNode = var11;
               } else {
                  var0 = var11;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for (WidgetConfigNode var9 = var0; null != var9 && -1988159385 * var9.start <= var1; var9 = var9.nextWidgetConfigNode) {
         var5 = var9;
      }

      WidgetConfigNode var10 = new WidgetConfigNode(var1, var2, var3, var4);
      if (var5 != null) {
         var10.nextWidgetConfigNode = var5.nextWidgetConfigNode;
      } else {
         var10.nextWidgetConfigNode = var0;
      }

      if (var5 != null) {
         var5.nextWidgetConfigNode = var10;
      } else {
         var0 = var10;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(Loe;B)I")
   @ObfuscatedName("wf")
   public static int method7983(WidgetConfigNode var0, byte var1) {
      if (var0 == null) {
         return var0.method7984(var1);
      } else {
         try {
            return var0.opMask * 2063023149;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "oe.at(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;I)Loe;")
   @ObfuscatedName("az")
   public static WidgetConfigNode method7989(WidgetConfigNode var0, int var1) {
      for (WidgetConfigNode var2 = var0; null != var2; var2 = var2.nextWidgetConfigNode) {
         if (var1 >= -662703887 * var2.start && var1 <= var2.end * -1665381539) {
            return var2;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;I)Loe;")
   @ObfuscatedName("ad")
   public static WidgetConfigNode method7990(WidgetConfigNode var0, int var1) {
      for (WidgetConfigNode var2 = var0; null != var2; var2 = var2.nextWidgetConfigNode) {
         if (var1 >= -1247489297 * var2.start && var1 <= var2.end * 1508033891) {
            return var2;
         }
      }

      return null;
   }

   WidgetConfigNode(int var1, int var2, int var3, int var4) {
      this.start = var1 * 1242733583;
      this.end = -278076341 * var2;
      this.clickMask = var3 * -2070151197;
      this.opMask = var4 * -2049543259;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("lm")
   static final boolean method7991(byte var0) {
      try {
         return client.isMenuOpen;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "oe.lm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   public int method7984(byte var1) {
      try {
         return this.start * 2063023149;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oe.at(" + 41);
      }
   }
}
