import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gg")
public class classGG extends classGK {
   @ObfuscatedName("av")
   String field2000;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2002 = 3;
   @ObfuscatedName("ag")
   byte field2001;
   @ObfuscatedName("at")
   int field2005;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field2003 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field2004 = 9;

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod191(ClanChannel var1, byte var2) {
      try {
         ClanChannelMember var3 = new ClanChannelMember();
         var3.username = new Username(this.field2000);
         var3.world = this.field2005 * -1958544685;
         var3.rank = this.field2001;
         ClanChannel.method4420(var1, var3, 1065052685);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gg.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod189(Buffer var1, byte var2) {
      try {
         if (var1.readUnsignedByte(-685721838) != 255) {
            if (var2 != 23) {
               return;
            }

            var1.offset -= 1741769013;
            Buffer.method12018(var1, -1951981605);
         }

         this.field2000 = var1.readCESU8(792604665);
         this.field2005 = Buffer.method12008(var1, (byte)5) * -1206546287;
         this.field2001 = Buffer.method12001(var1, (byte)59);
         Buffer.method12018(var1, -1936187526);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gg.av(" + ')');
      }
   }

   classGG(classGT var1) {
      this.this$0 = var1;
      this.field2000 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod188(Buffer var1) {
      if (var1.readUnsignedByte(-905754543) != 255) {
         var1.offset -= 1741769013;
         Buffer.method12018(var1, -1883583166);
      }

      this.field2000 = var1.readCESU8(792604665);
      this.field2005 = Buffer.method12008(var1, (byte)5) * -1206546287;
      this.field2001 = Buffer.method12001(var1, (byte)81);
      Buffer.method12018(var1, -1978262864);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod190(Buffer var1) {
      if (var1.readUnsignedByte(-1691844547) != 255) {
         var1.offset -= 1741769013;
         Buffer.method12018(var1, -2035409674);
      }

      this.field2000 = var1.readCESU8(792604665);
      this.field2005 = Buffer.method12008(var1, (byte)5) * -1206546287;
      this.field2001 = Buffer.method12001(var1, (byte)48);
      Buffer.method12018(var1, -2015218353);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)I")
   @ObfuscatedName("ql")
   public static int method4236(ClientPreferences var0) {
      return -1162225527 * var0.eula;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod187(Buffer var1) {
      if (var1.readUnsignedByte(-1372768153) != 255) {
         var1.offset -= 1330494219;
         Buffer.method12018(var1, -1978272920);
      }

      this.field2000 = var1.readCESU8(792604665);
      this.field2005 = Buffer.method12008(var1, (byte)5) * 1644166708;
      this.field2001 = Buffer.method12001(var1, (byte)126);
      Buffer.method12018(var1, -1917871674);
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod193(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field2000);
      var2.world = this.field2005 * -1958544685;
      var2.rank = this.field2001;
      ClanChannel.method4420(var1, var2, -350129366);
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod192(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field2000);
      var2.world = this.field2005 * 2020654404;
      var2.rank = this.field2001;
      ClanChannel.method4420(var1, var2, -1071045615);
   }

   @ObfuscatedSignature(descriptor = "(Loe;IIIII)Loe;")
   @ObfuscatedName("ag")
   public static WidgetConfigNode method4235(WidgetConfigNode var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         WidgetConfigNode var6 = var0;

         for (WidgetConfigNode var7 = null; null != var6; var6 = var6.nextWidgetConfigNode) {
            if (var5 != 49319) {
               throw new IllegalStateException();
            }

            if (1508033891 * var6.end >= var1) {
               if (var5 != 49319) {
                  throw new IllegalStateException();
               }

               if (var6.start * -1247489297 <= var2) {
                  if (var5 != 49319) {
                     throw new IllegalStateException();
                  }

                  if (var7 != null) {
                     if (var5 != 49319) {
                        throw new IllegalStateException();
                     }

                     var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
                  } else {
                     var0 = var6.nextWidgetConfigNode;
                  }

                  if (-1247489297 * var6.start < var1) {
                     if (var5 != 49319) {
                        throw new IllegalStateException();
                     }

                     WidgetConfigNode var8 = new WidgetConfigNode(var6.start * -1247489297, var1 - 1, 1825652171 * var6.clickMask, 2063023149 * var6.opMask);
                     if (null != var7) {
                        if (var5 != 49319) {
                           throw new IllegalStateException();
                        }

                        var8.nextWidgetConfigNode = var7.nextWidgetConfigNode;
                     } else {
                        var8.nextWidgetConfigNode = var0;
                     }

                     if (null != var7) {
                        if (var5 != 49319) {
                           throw new IllegalStateException();
                        }

                        var7.nextWidgetConfigNode = var8;
                     } else {
                        var0 = var8;
                     }

                     var7 = var8;
                  }

                  if (var6.end * 1508033891 > var2) {
                     if (var5 != 49319) {
                        throw new IllegalStateException();
                     }

                     WidgetConfigNode var13 = new WidgetConfigNode(var2 + 1, 1508033891 * var6.end, 1825652171 * var6.clickMask, var6.opMask * 2063023149);
                     if (null != var7) {
                        var13.nextWidgetConfigNode = var7.nextWidgetConfigNode;
                     } else {
                        var13.nextWidgetConfigNode = var0;
                     }

                     if (null != var7) {
                        if (var5 != 49319) {
                           throw new IllegalStateException();
                        }

                        var7.nextWidgetConfigNode = var13;
                     } else {
                        var0 = var13;
                     }
                  }
               }
            }

            var7 = var6;
         }

         var6 = null;

         for (WidgetConfigNode var11 = var0; null != var11; var11 = var11.nextWidgetConfigNode) {
            if (-1247489297 * var11.start > var1) {
               if (var5 != 49319) {
                  throw new IllegalStateException();
               }
               break;
            }

            var6 = var11;
         }

         WidgetConfigNode var12 = new WidgetConfigNode(var1, var2, var3, var4);
         if (var6 != null) {
            var12.nextWidgetConfigNode = var6.nextWidgetConfigNode;
         } else {
            var12.nextWidgetConfigNode = var0;
         }

         if (var6 != null) {
            var6.nextWidgetConfigNode = var12;
         } else {
            var0 = var12;
         }

         return var0;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "gg.ag(" + ')');
      }
   }
}
