import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lg")
public class WidgetConfigNode extends Node implements net.runelite.api.widgets.WidgetConfigNode {
   @ObfuscatedName("im")
   static String field4139;
   @ObfuscatedName("af")
   final int field4136;
   @ObfuscatedName("ab")
   final int field4135;
   @ObfuscatedName("az")
   final int field4134;
   @ObfuscatedSignature(descriptor = "Llg;")
   @ObfuscatedName("ag")
   WidgetConfigNode field4140;
   @ObfuscatedName("al")
   public static int field4138;
   @ObfuscatedName("lt")
   static byte[][] field4141;
   @ObfuscatedName("ae")
   final int field4137;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public int method6781() {
      return 1532468272 * this.field4137;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   public int method6782(byte var1) {
      try {
         return -802457829 * this.field4137;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lg.az(" + 41);
      }
   }

   WidgetConfigNode(int var1, int var2, int var3, int var4) {
      this.field4134 = -1674878451 * var1;
      this.field4136 = -56432033 * var2;
      this.field4137 = 779619091 * var3;
      this.field4135 = var4 * -1747432713;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method6783() {
      return -802457829 * this.field4137;
   }

   public int getClickMask() {
      return this.field4137 * -802457829;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   static final void method6792(int var0) {
      try {
         if (classYY.field7118) {
            if (var0 != 293773697) {
               throw new IllegalStateException();
            }

            Iterator var1 = client.field814.iterator();

            while (var1.hasNext()) {
               if (var0 != 293773697) {
                  throw new IllegalStateException();
               }

               WorldView var2 = (WorldView)var1.next();

               for (int var3 = 0; var3 < client.field837.field1419 * -2087374717; var3++) {
                  if (var0 != 293773697) {
                     throw new IllegalStateException();
                  }

                  Player var4 = (Player)classIS.field3053.field1694.method13404(client.field837.field1423[var3]);
                  if (var4 != null) {
                     if (var0 != 293773697) {
                        throw new IllegalStateException();
                     }

                     Player.method2642(var4, (byte)-4);
                  }
               }
            }

            classYY.field7118 = false;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "lg.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public int method6784() {
      return this.field4135 * 123180743;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llg;IIII)Llg;")
   @ObfuscatedName("aa")
   public static WidgetConfigNode method6787(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
      WidgetConfigNode var5 = var0;

      for (WidgetConfigNode var6 = null; null != var5; var5 = var5.field4140) {
         if (-1057754721 * var5.field4136 >= var1 && 1443675333 * var5.field4134 <= var2) {
            if (null != var6) {
               var6.field4140 = var5.field4140;
            } else {
               var0 = var5.field4140;
            }

            if (var5.field4134 * 1443675333 < var1) {
               WidgetConfigNode var7 = new WidgetConfigNode(var5.field4134 * 1443675333, var1 - 1, var5.field4137 * -802457829, 123180743 * var5.field4135);
               if (var6 != null) {
                  var7.field4140 = var6.field4140;
               } else {
                  var7.field4140 = var0;
               }

               if (null != var6) {
                  var6.field4140 = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.field4136 * -1057754721 > var2) {
               WidgetConfigNode var11 = new WidgetConfigNode(var2 + 1, var5.field4136 * -1057754721, var5.field4137 * -802457829, var5.field4135 * 123180743);
               if (var6 != null) {
                  var11.field4140 = var6.field4140;
               } else {
                  var11.field4140 = var0;
               }

               if (null != var6) {
                  var6.field4140 = var11;
               } else {
                  var0 = var11;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for (WidgetConfigNode var9 = var0; null != var9 && var9.field4134 * 1443675333 <= var1; var9 = var9.field4140) {
         var5 = var9;
      }

      WidgetConfigNode var10 = new WidgetConfigNode(var1, var2, var3, var4);
      if (var5 != null) {
         var10.field4140 = var5.field4140;
      } else {
         var10.field4140 = var0;
      }

      if (var5 != null) {
         var5.field4140 = var10;
      } else {
         var0 = var10;
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)I")
   @ObfuscatedName("ja")
   public static int method6791(Scene var0) {
      return var0.field2064;
   }

   public int getOpMask() {
      return this.field4135 * 123180743;
   }

   @ObfuscatedSignature(descriptor = "(Llg;I)I")
   @ObfuscatedName("mp")
   public static int method6785(WidgetConfigNode var0, int var1) {
      if (var0 == null) {
         var0.method6786(var1);
      }

      try {
         return var0.field4135 * 123180743;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lg.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llg;I)Llg;")
   @ObfuscatedName("ao")
   public static WidgetConfigNode method6789(WidgetConfigNode var0, int var1) {
      for (WidgetConfigNode var2 = var0; null != var2; var2 = var2.field4140) {
         if (var1 >= 1443675333 * var2.field4134 && var1 <= var2.field4136 * -1057754721) {
            return var2;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llg;I)Llg;")
   @ObfuscatedName("al")
   public static WidgetConfigNode method6790(WidgetConfigNode var0, int var1) {
      for (WidgetConfigNode var2 = var0; null != var2; var2 = var2.field4140) {
         if (var1 >= 1443675333 * var2.field4134 && var1 <= var2.field4136 * -1057754721) {
            return var2;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llg;IIII)Llg;")
   @ObfuscatedName("ac")
   public static WidgetConfigNode method6788(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
      WidgetConfigNode var5 = var0;

      for (WidgetConfigNode var6 = null; null != var5; var5 = var5.field4140) {
         if (-1057754721 * var5.field4136 >= var1 && 1443675333 * var5.field4134 <= var2) {
            if (null != var6) {
               var6.field4140 = var5.field4140;
            } else {
               var0 = var5.field4140;
            }

            if (var5.field4134 * 1443675333 < var1) {
               WidgetConfigNode var7 = new WidgetConfigNode(var5.field4134 * 1443675333, var1 - 1, var5.field4137 * -802457829, 123180743 * var5.field4135);
               if (var6 != null) {
                  var7.field4140 = var6.field4140;
               } else {
                  var7.field4140 = var0;
               }

               if (null != var6) {
                  var6.field4140 = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.field4136 * -1057754721 > var2) {
               WidgetConfigNode var11 = new WidgetConfigNode(var2 + 1, var5.field4136 * -1057754721, var5.field4137 * -802457829, var5.field4135 * 123180743);
               if (var6 != null) {
                  var11.field4140 = var6.field4140;
               } else {
                  var11.field4140 = var0;
               }

               if (null != var6) {
                  var6.field4140 = var11;
               } else {
                  var0 = var11;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for (WidgetConfigNode var9 = var0; null != var9 && var9.field4134 * 1443675333 <= var1; var9 = var9.field4140) {
         var5 = var9;
      }

      WidgetConfigNode var10 = new WidgetConfigNode(var1, var2, var3, var4);
      if (var5 != null) {
         var10.field4140 = var5.field4140;
      } else {
         var10.field4140 = var0;
      }

      if (var5 != null) {
         var5.field4140 = var10;
      } else {
         var0 = var10;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method6786(int var1) {
      try {
         return this.field4135 * 123180743;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lg.af(" + 41);
      }
   }
}
