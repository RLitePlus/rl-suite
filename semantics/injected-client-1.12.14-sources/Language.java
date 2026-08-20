import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@classRV
@ObfuscatedName("qd")
@classNN
public class Language implements Enum {
   @ObfuscatedName("aw")
   final String field5297;
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("at")
   static final Language Language_DE = new Language("DE", "de", "German", ModeWhere.field5278, 1, "DE");
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("ag")
   public static final Language Language_FR = new Language("FR", "fr", "French", ModeWhere.field5278, 2, "FR");
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("an")
   static final Language Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field5278, 3, "BR");
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field5307 = 45;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field5306 = 12;
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("ak")
   static final Language Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field5278, 6, "MX");
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("aj")
   public static final Language Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field5277, 5, "ES");
   @ObfuscatedSignature(descriptor = "[Lqd;")
   @ObfuscatedName("ap")
   public static final Language[] Language_valuesOrdered;
   @ObfuscatedName("ay")
   final int id;
   @ObfuscatedName("au")
   final String language;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ai")
   public static AbstractArchive ItemDefinition_modelArchive;
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("av")
   public static final Language Language_EN = new Language("EN", "en", "English", ModeWhere.field5278, 0, "GB");
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("ae")
   static final Language Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field5277, 4, "NL");

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aj")
   String getLanguage(int var1) {
      try {
         return this.language;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qd.aj(" + ')');
      }
   }

   Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
      this.field5297 = var1;
      this.language = var2;
      this.id = -1665268575 * var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }
   }

   @Override
   public String toString() {
      try {
         return this.getLanguage(1737140580).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "qd.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljh;Lkz;IIFFFFFFFFFFFFI)V")
   @ObfuscatedName("rw")
   public static void method8873(
      Projection var0,
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      int var17
   ) {
      if (var0 == null) {
         var0.drawSceneTilePaint(var1, var2, var3, var3, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var3);
      } else {
         try {
            Clips var18 = Rasterizer3D.clips;
            int var19 = var18.zoom;
            int var20 = var18.clipMidY;
            int var21 = var18.clipCenterX;
            float var22 = var20 + var5 * var19 / var13;
            float var23 = var21 + var9 * var19 / var13;
            float var24 = var20 + var6 * var19 / var14;
            float var25 = var21 + var10 * var19 / var14;
            float var26 = var20 + var7 * var19 / var15;
            float var27 = var21 + var11 * var19 / var15;
            float var28 = var20 + var8 * var19 / var16;
            float var29 = var21 + var12 * var19 / var16;
            float var30 = AbstractRasterizer.method5448(var13);
            float var31 = AbstractRasterizer.method5448(var14);
            float var32 = AbstractRasterizer.method5448(var15);
            float var33 = AbstractRasterizer.method5448(var16);
            var18.clipX = 0;
            rl8 var34 = var1.field2886[var1.field3023.plane * 2115028565][var3 + var1.field3014][var4 + var1.field3014];
            if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0.0F) {
               if (Scene.method5811(
                  var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var27, (int)var29, (int)var25, (int)var26, (int)var28, (int)var24
               )) {
                  float var35 = Projection.method6234(
                     var1.Scene_selectedScreenX,
                     var1.Scene_selectedScreenY,
                     (int)var26,
                     (int)var28,
                     (int)var24,
                     (int)var27,
                     (int)var29,
                     (int)var25,
                     var32,
                     var33,
                     var31
                  );
                  if (var35 > var1.field2929 && Projection.field3248 <= var1.field3023.plane * 2115028565) {
                     var1.method5755(var3, var4, var35);
                  }

                  if (var1.Scene_selectedScreenX >= SecureUrlRequester.client.getViewportXOffset()
                     && var1.Scene_selectedScreenX < SecureUrlRequester.client.getViewportXOffset() + SecureUrlRequester.client.getViewportWidth()
                     && var1.Scene_selectedScreenY >= SecureUrlRequester.client.getViewportYOffset()
                     && var1.Scene_selectedScreenY < SecureUrlRequester.client.getViewportYOffset() + SecureUrlRequester.client.getViewportHeight()
                     && var34 != null
                     && var2 == var34.method9622()) {
                     var1.method5751(var3, var4, var34.method9624());
                  }
               }

               if (!SecureUrlRequester.client.isGpu()) {
                  var18.clipping = false;
                  int var38 = var18.clipNegativeMidX;
                  if (var26 < 0.0F || var28 < 0.0F || var24 < 0.0F || var26 > var38 || var28 > var38 || var24 > var38) {
                     var18.clipping = true;
                  }

                  if (var2.texture * -699583661 == -1) {
                     if (var2.neColor * -120051743 != 12345678) {
                        AbstractRasterizer.method5458(
                           var27,
                           var29,
                           var25,
                           var26,
                           var28,
                           var24,
                           var32,
                           var33,
                           var31,
                           var2.neColor * -120051743,
                           var2.nwColor * 94297073,
                           var2.seColor * -1789756031
                        );
                     }
                  } else if (!Scene.Scene_isLowDetail) {
                     if (var2.isFlat) {
                        AbstractRasterizer.method5456(
                           var27,
                           var29,
                           var25,
                           var26,
                           var28,
                           var24,
                           var32,
                           var33,
                           var31,
                           var2.neColor * -120051743,
                           var2.nwColor * 94297073,
                           var2.seColor * -1789756031,
                           (int)var5,
                           (int)var6,
                           (int)var8,
                           (int)var9,
                           (int)var10,
                           (int)var12,
                           (int)var13,
                           (int)var14,
                           (int)var16,
                           var2.texture * -699583661
                        );
                     } else {
                        AbstractRasterizer.method5456(
                           var27,
                           var29,
                           var25,
                           var26,
                           var28,
                           var24,
                           var32,
                           var33,
                           var31,
                           var2.neColor * -120051743,
                           var2.nwColor * 94297073,
                           var2.seColor * -1789756031,
                           (int)var7,
                           (int)var8,
                           (int)var6,
                           (int)var11,
                           (int)var12,
                           (int)var10,
                           (int)var15,
                           (int)var16,
                           (int)var14,
                           var2.texture * -699583661
                        );
                     }
                  } else {
                     int var36 = var18.Rasterizer3D_textureLoader.method6347(var2.texture * -699583661);
                     AbstractRasterizer.method5458(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        Scene.method5475(var36, var2.neColor * -120051743),
                        Scene.method5475(var36, var2.nwColor * 94297073),
                        Scene.method5475(var36, var2.seColor * -1789756031)
                     );
                  }
               }
            }

            if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0.0F) {
               if (Scene.method5811(
                  var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var23, (int)var25, (int)var29, (int)var22, (int)var24, (int)var28
               )) {
                  float var39 = Projection.method6234(
                     var1.Scene_selectedScreenX,
                     var1.Scene_selectedScreenY,
                     (int)var22,
                     (int)var24,
                     (int)var28,
                     (int)var23,
                     (int)var25,
                     (int)var29,
                     var30,
                     var31,
                     var33
                  );
                  if (var39 > var1.field2929 && Projection.field3248 <= var1.field3023.plane * 2115028565) {
                     var1.method5755(var3, var4, var39);
                  }

                  if (var1.Scene_selectedScreenX >= SecureUrlRequester.client.getViewportXOffset()
                     && var1.Scene_selectedScreenX < SecureUrlRequester.client.getViewportXOffset() + SecureUrlRequester.client.getViewportWidth()
                     && var1.Scene_selectedScreenY >= SecureUrlRequester.client.getViewportYOffset()
                     && var1.Scene_selectedScreenY < SecureUrlRequester.client.getViewportYOffset() + SecureUrlRequester.client.getViewportHeight()
                     && var34 != null
                     && var2 == var34.method9622()) {
                     var1.method5751(var3, var4, var34.method9624());
                  }
               }

               if (!SecureUrlRequester.client.isGpu()) {
                  var18.clipping = false;
                  int var40 = var18.clipNegativeMidX;
                  if (var22 < 0.0F || var24 < 0.0F || var28 < 0.0F || var22 > var40 || var24 > var40 || var28 > var40) {
                     var18.clipping = true;
                  }

                  if (var2.texture * -699583661 == -1) {
                     if (var2.swColor * -1705968521 != 12345678) {
                        AbstractRasterizer.method5458(
                           var23,
                           var25,
                           var29,
                           var22,
                           var24,
                           var28,
                           var30,
                           var31,
                           var33,
                           var2.swColor * -1705968521,
                           var2.seColor * -1789756031,
                           var2.nwColor * 94297073
                        );
                     }
                  } else if (!Scene.Scene_isLowDetail) {
                     AbstractRasterizer.method5456(
                        var23,
                        var25,
                        var29,
                        var22,
                        var24,
                        var28,
                        var30,
                        var31,
                        var33,
                        var2.swColor * -1705968521,
                        var2.seColor * -1789756031,
                        var2.nwColor * 94297073,
                        (int)var5,
                        (int)var6,
                        (int)var8,
                        (int)var9,
                        (int)var10,
                        (int)var12,
                        (int)var13,
                        (int)var14,
                        (int)var16,
                        var2.texture * -699583661
                     );
                  } else {
                     int var41 = var18.Rasterizer3D_textureLoader.method6347(var2.texture * -699583661);
                     AbstractRasterizer.method5458(
                        var23,
                        var25,
                        var29,
                        var22,
                        var24,
                        var28,
                        var30,
                        var31,
                        var33,
                        Scene.method5475(var41, var2.swColor * -1705968521),
                        Scene.method5475(var41, var2.seColor * -1789756031),
                        Scene.method5475(var41, var2.nwColor * 94297073)
                     );
                  }
               }
            }
         } catch (Exception var37) {
            client.field938.warn("error during underlay rendering", var37);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("az")
   String method8863() {
      return this.language;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 1526259553 * this.id;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qd.av(" + 41);
      }
   }

   static {
      Language[] var0 = method8860(694448490);
      Language_valuesOrdered = new Language[var0.length];
      Language[] var1 = var0;

      for (int var2 = 0; var2 < var1.length; var2++) {
         Language var3 = var1[var2];
         if (Language_valuesOrdered[var3.id * 1526259553] != null) {
            throw new IllegalStateException();
         }

         Language_valuesOrdered[var3.id * 1526259553] = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method8867() {
      return this.getLanguage(1737140580).toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 1526259553 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 1526259553 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method8868() {
      return this.getLanguage(1737140580).toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method8869() {
      return this.getLanguage(1737140580).toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V")
   @ObfuscatedName("mk")
   static final void method8872(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (!client.isMenuOpen) {
            if (!HttpRequestTask.method91(var8, var3, -964899533)) {
               if (var9 <= 1878210869) {
                  throw new IllegalStateException();
               }
            } else {
               if (var0 >= 0) {
                  if (var0 < client.menu.subMenus.length) {
                     if (null == client.menu.subMenus[var0]) {
                        if (var9 <= 1878210869) {
                           throw new IllegalStateException();
                        }

                        client.menu.subMenus[var0] = new Menu(false);
                     }

                     client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8, 1769262527);
                     return;
                  }

                  if (var9 <= 1878210869) {
                     throw new IllegalStateException();
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "qd.mk(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lqd;")
   @ObfuscatedName("ak")
   static Language[] method8859() {
      return new Language[]{Language_ES, Language_NL, Language_ES_MX, Language_FR, Language_PT, Language_DE, Language_EN};
   }

   @ObfuscatedSignature(descriptor = "(I)[Lqd;")
   @ObfuscatedName("ae")
   static Language[] method8860(int var0) {
      try {
         return new Language[]{Language_ES, Language_NL, Language_ES_MX, Language_FR, Language_PT, Language_DE, Language_EN};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "qd.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   String method8864() {
      return this.language;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   String method8865() {
      return this.language;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("au")
   String method8866() {
      return this.language;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llt;)I")
   @ObfuscatedName("zz")
   public static int method8870(WorldMapData_1 var0) {
      return var0.chunkXLow * 1442319505;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lqd;")
   @ObfuscatedName("aw")
   static Language[] method8861() {
      return new Language[]{Language_ES, Language_NL, Language_ES_MX, Language_FR, Language_PT, Language_DE, Language_EN};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -71107051 * this.id;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("aa")
   static int method8871(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 <= -1913203047) {
               throw new IllegalStateException();
            }

            var10000 = UserComparator3.scriptDotWidget;
         } else {
            var10000 = class222.scriptActiveWidget;
         }

         Widget var4 = var10000;
         if (var0 == 1800) {
            if (var3 <= -1913203047) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = LoginPacket.Widget_unpackTargetMask(
                  class191.getWidgetFlags(var4, (byte)75), 116571108
               );
               return 1;
            }
         } else if (var0 == 1801) {
            if (var3 <= -1913203047) {
               throw new IllegalStateException();
            } else {
               int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               var5--;
               if (null != var4.actions) {
                  if (var3 <= -1913203047) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.actions.length) {
                     if (var3 <= -1913203047) {
                        throw new IllegalStateException();
                     }

                     if (null != var4.actions[var5]) {
                        Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.actions[var5];
                        return 1;
                     }

                     if (var3 <= -1913203047) {
                        throw new IllegalStateException();
                     }
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (1802 == var0) {
            if (var3 <= -1913203047) {
               throw new IllegalStateException();
            } else {
               if (null == var4.dataText) {
                  if (var3 <= -1913203047) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.dataText;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qd.aa(" + 41);
      }
   }
}
