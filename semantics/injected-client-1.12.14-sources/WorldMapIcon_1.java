import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lj")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
   @ObfuscatedName("ae")
   int subWidth;
   @ObfuscatedSignature(descriptor = "Llc;")
   @ObfuscatedName("at")
   final WorldMapRegion region;
   @ObfuscatedName("av")
   final int objectDefId;
   @ObfuscatedSignature(descriptor = "Llv;")
   @ObfuscatedName("an")
   WorldMapLabel label;
   @ObfuscatedName("ag")
   int element;
   @ObfuscatedName("aj")
   int subHeight;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod288() {
      return this.element * 932941725;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   void init(byte var1) {
      try {
         this.element = AsyncHttpResponse.getObjectDefinition(this.objectDefId * 2021936591, 2142395029).transform(1691955713).mapIconId * 1609250781;
         this.label = WorldMapRegion.method7098(this.region, class463.WorldMapElement_get(this.element * 932941725, (byte)0), -1695158136);
         WorldMapElement var2 = class463.WorldMapElement_get(this.getElement(1992417669), (byte)0);
         SpritePixels var3 = var2.getSpriteBool(false, -511317243);
         if (var3 != null) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            this.subWidth = -168657635 * var3.subWidth;
            this.subHeight = var3.subHeight * 1871861601;
         } else {
            this.subWidth = 0;
            this.subHeight = 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   int vmethod295() {
      return 1688612149 * this.subWidth;
   }

   @ObfuscatedSignature(descriptor = "(B)Llv;")
   @ObfuscatedName("ag")
   @Override
   WorldMapLabel getLabel(byte var1) {
      try {
         return this.label;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   @Override
   int getSubWidth(int var1) {
      try {
         return 1688612149 * this.subWidth;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lj.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   int vmethod297() {
      return -665785192 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void method7188() {
      this.element = AsyncHttpResponse.getObjectDefinition(this.objectDefId * 2021936591, 2002564317).transform(-90753396).mapIconId * 1609250781;
      this.label = WorldMapRegion.method7098(this.region, class463.WorldMapElement_get(this.element * 932941725, (byte)0), -803344785);
      WorldMapElement var1 = class463.WorldMapElement_get(this.getElement(1228015641), (byte)0);
      SpritePixels var2 = var1.getSpriteBool(false, 1679280395);
      if (var2 != null) {
         this.subWidth = -168657635 * var2.subWidth;
         this.subHeight = var2.subHeight * 1871861601;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod289() {
      return this.element * 932941725;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llj;)V")
   @ObfuscatedName("yg")
   public static void method7189(WorldMapIcon_1 var0) {
      var0.element = AsyncHttpResponse.getObjectDefinition(var0.objectDefId * 2021936591, 2064787606).transform(308408528).mapIconId * 1609250781;
      var0.label = WorldMapRegion.method7098(var0.region, class463.WorldMapElement_get(var0.element * 932941725, (byte)0), 480469842);
      WorldMapElement var1 = class463.WorldMapElement_get(var0.getElement(-1529680629), (byte)0);
      SpritePixels var2 = var1.getSpriteBool(false, 1353265789);
      if (var2 != null) {
         var0.subWidth = -168657635 * var2.subWidth;
         var0.subHeight = var2.subHeight * 1871861601;
      } else {
         var0.subWidth = 0;
         var0.subHeight = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("au")
   @Override
   WorldMapLabel vmethod292() {
      return this.label;
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("ay")
   @Override
   WorldMapLabel vmethod293() {
      return this.label;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   @Override
   public int getElement(int var1) {
      try {
         return this.element * 932941725;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lj.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("az")
   @Override
   WorldMapLabel vmethod294() {
      return this.label;
   }

   WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.objectDefId = 1505466671 * var3;
      this.region = var4;
      this.init((byte)96);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   int vmethod298() {
      return -373611258 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqd;B)I")
   @ObfuscatedName("av")
   public static int compareStrings(CharSequence var0, CharSequence var1, Language var2, byte var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         byte var8 = 0;
         char var9 = 0;

         while (true) {
            if (var6 - var8 >= var4) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               if (var7 - var9 >= var5) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  int var22 = Math.min(var4, var5);

                  for (int var25 = 0; var25 < var22; var25++) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     if (var2 == Language.Language_FR) {
                        if (var3 == 2) {
                           throw new IllegalStateException();
                        }

                        var6 = var4 - 1 - var25;
                        var7 = var5 - 1 - var25;
                     } else {
                        var7 = var25;
                        var6 = var25;
                     }

                     char var27 = var0.charAt(var6);
                     char var13 = var1.charAt(var7);
                     if (var13 != var27) {
                        if (var3 == 2) {
                           throw new IllegalStateException();
                        }

                        if (Character.toUpperCase(var27) != Character.toUpperCase(var13)) {
                           if (var3 == 2) {
                              throw new IllegalStateException();
                           }

                           var27 = Character.toLowerCase(var27);
                           var13 = Character.toLowerCase(var13);
                           if (var27 != var13) {
                              if (var3 == 2) {
                                 throw new IllegalStateException();
                              }

                              return class329.lowercaseChar(var27, var2, (byte)70) - class329.lowercaseChar(var13, var2, (byte)-55);
                           }
                        }
                     }
                  }

                  int var26 = var4 - var5;
                  if (var26 != 0) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     return var26;
                  }

                  for (int var29 = 0; var29 < var22; var29++) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     char var31 = var0.charAt(var29);
                     char var14 = var1.charAt(var29);
                     if (var14 != var31) {
                        if (var3 == 2) {
                           throw new IllegalStateException();
                        }

                        return class329.lowercaseChar(var31, var2, (byte)-65) - class329.lowercaseChar(var14, var2, (byte)2);
                     }
                  }

                  return 0;
               }
            }

            if (var6 - var8 >= var4) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if (var7 - var9 >= var5) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               return 1;
            }

            char var10;
            if (0 != var8) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var10 = (char)var8;
               boolean var18 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var11;
            if (var9 != 0) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var11 = var9;
               boolean var19 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            byte var12;
            if (var10 == 198) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (230 == var10) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else if (var10 == 223) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var12 = 115;
            } else if (338 == var10) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (339 == var10) {
               var12 = 101;
            } else {
               var12 = 0;
            }

            var8 = var12;
            var9 = Sound.method4250(var11, -2129166637);
            var10 = Actor.standardizeChar(var10, var2, -166188);
            var11 = Actor.standardizeChar(var11, var2, -551374597);
            if (var11 != var10) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               if (Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                  var10 = Character.toLowerCase(var10);
                  var11 = Character.toLowerCase(var11);
                  if (var11 != var10) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     return class329.lowercaseChar(var10, var2, (byte)51) - class329.lowercaseChar(var11, var2, (byte)-46);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lj.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   int vmethod299() {
      return 837717153 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIISISIII)V")
   @ObfuscatedName("kd")
   static void method7190(WorldView var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10, int var11) {
      try {
         NodeDeque var12 = var0.groundItems[var1][var2][var3];
         if (var12 != null) {
            if (var11 >= -1512540503) {
               throw new IllegalStateException();
            }

            for (TileItem var13 = (TileItem)var12.last(); var13 != null; var13 = (TileItem)var12.previous()) {
               if (var11 >= -1512540503) {
                  throw new IllegalStateException();
               }

               if (var4 == var13.visibleTime * 782226465) {
                  if (var11 >= -1512540503) {
                     throw new IllegalStateException();
                  }

                  if (var5 == -1247866467 * var13.despawnTime) {
                     if (var11 >= -1512540503) {
                        throw new IllegalStateException();
                     }

                     PlayerCompositionColorTextureOverride var14 = var13.method3040(1883102579);
                     if (null == var14) {
                        if (var11 >= -1512540503) {
                           throw new IllegalStateException();
                        }

                        var14 = new PlayerCompositionColorTextureOverride(var4);
                     }

                     if (var14.method4377(533098139)) {
                        if (var11 >= -1512540503) {
                           throw new IllegalStateException();
                        }

                        if (var7 > -1 && var7 < var14.playerCompositionRecolorTo.length) {
                           if (var11 >= -1512540503) {
                              throw new IllegalStateException();
                           }

                           var14.playerCompositionRecolorTo[var7] = var6;
                        }
                     }

                     if (PlayerCompositionColorTextureOverride.method4385(var14, (byte)-47)) {
                        if (var11 >= -1512540503) {
                           throw new IllegalStateException();
                        }

                        if (var9 > -1) {
                           if (var11 >= -1512540503) {
                              throw new IllegalStateException();
                           }

                           if (var9 < var14.playerCompositionRetextureTo.length) {
                              var14.playerCompositionRetextureTo[var9] = var8;
                           }
                        }
                     }

                     if (var10 > -1) {
                        if (var11 >= -1512540503) {
                           throw new IllegalStateException();
                        }

                        var14.field2110 = 1343919111 * var10;
                        var14.field2121 = null;
                     }

                     var13.method3042(var14, (byte)0);
                     break;
                  }
               }
            }

            class157.updateItemPile(var1, var2, var3, 799845992);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lj.kd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   int getSubHeight(int var1) {
      try {
         return 837717153 * this.subHeight;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lj.ae(" + 41);
      }
   }
}
