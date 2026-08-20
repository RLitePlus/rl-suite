import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;
import net.runelite.api.events.PostItemComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("is")
public class ItemComposition extends DualNode implements ParamHolder, net.runelite.api.ItemComposition {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2626 = 1;
   @ObfuscatedName("bo")
   public int zoom2d;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2623 = 20;
   @ObfuscatedName("bv")
   public int team;
   @ObfuscatedName("by")
   public String[] inventoryActions;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ac")
   public static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("mw")
   public int field2573 = -2;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ab")
   public static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2621 = -2;
   @ObfuscatedName("bs")
   public int yan2d;
   @ObfuscatedName("al")
   int model;
   @ObfuscatedName("af")
   public String name = Strings.field4861;
   @ObfuscatedName("am")
   public String examine = Strings.field4861;
   @ObfuscatedName("aa")
   short[] recolorTo;
   @ObfuscatedName("be")
   short[] retextureTo;
   @ObfuscatedName("bk")
   public int offsetX2d;
   @ObfuscatedName("bq")
   public int ambient;
   @ObfuscatedName("bd")
   public int note;
   @ObfuscatedName("bg")
   public int xan2d;
   @ObfuscatedName("bf")
   int[] countobj;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2627 = 0;
   @ObfuscatedName("bh")
   int resizeX;
   @ObfuscatedName("bb")
   public int offsetY2d;
   @ObfuscatedName("bj")
   public int isStackable;
   @ObfuscatedName("bm")
   public int price;
   @ObfuscatedName("aq")
   short[] retextureFrom;
   @ObfuscatedName("cz")
   int femaleHeadModel;
   @ObfuscatedName("bu")
   public int maleModel2;
   @ObfuscatedName("bn")
   int[] countco;
   @ObfuscatedName("bi")
   public String[] groundActions;
   @ObfuscatedName("bp")
   public int maleModel;
   @ObfuscatedName("bw")
   public String[][] subOps;
   @ObfuscatedName("ci")
   int femaleHeadModel2;
   @ObfuscatedName("cu")
   public boolean isTradable;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ax")
   public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("bz")
   public int zan2d;
   @ObfuscatedName("bt")
   public int maleModel1;
   @ObfuscatedName("bl")
   int resizeY;
   @ObfuscatedName("bc")
   int resizeZ;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field2625 = -1;
   @ObfuscatedName("bx")
   public int contrast;
   @ObfuscatedName("ao")
   short[] recolorFrom;
   @ObfuscatedName("ch")
   public int field2605;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("ce")
   IterableNodeHashTable params;
   @ObfuscatedName("ul")
   public String field2628;
   @ObfuscatedName("ba")
   public boolean isMembersOnly;
   @ObfuscatedName("ct")
   int unnotedId;
   @ObfuscatedName("cm")
   int notedId;
   @ObfuscatedName("cb")
   public int placeholder;
   @ObfuscatedName("ck")
   public int placeholderTemplate;
   @ObfuscatedName("cc")
   int shiftClickIndex;
   @ObfuscatedName("cs")
   int femaleModel;
   @ObfuscatedName("cn")
   int femaleModel1;
   @ObfuscatedName("co")
   int femaleOffset;
   @ObfuscatedName("cx")
   int maleHeadModel;
   @ObfuscatedName("cg")
   int maleHeadModel2;
   @ObfuscatedName("cp")
   int field2610;
   @ObfuscatedName("cd")
   int femaleModel2;
   @ObfuscatedName("br")
   public int noteTemplate;
   @ObfuscatedName("ah")
   int id;
   @ObfuscatedName("cf")
   int field2586;
   @ObfuscatedName("cy")
   int field2608;
   @ObfuscatedName("cq")
   int field2616;

   @ObfuscatedSignature(descriptor = "(Lgx;)Lky;")
   @ObfuscatedName("cu")
   public final Model method5060(PlayerCompositionColorTextureOverride var1) {
      Model var2 = var1.field2121;
      if (var2 != null) {
         return var2;
      } else {
         ModelData var3 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var1.field2110 * 2134415799, 0);
         if (null == var3) {
            return null;
         } else {
            if (-816909667 * this.resizeX != 128 || 862844559 * this.resizeY != 128 || 128 != -2147134923 * this.resizeZ) {
               var3.resize(-816909667 * this.resizeX, 862844559 * this.resizeY, this.resizeZ * -2147134923);
            }

            this.method5085(var3, var1, -681788575);
            var2 = ModelData.method6106(var3, 64 + this.ambient * 689590731, 1596591697 * this.contrast + 768, -50, -10, -50);
            var2.isSingleTile = true;
            var1.field2121 = var2;
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;III)I")
   @ObfuscatedName("uh")
   public static int method5086(ItemComposition var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.getIntParam(var1, var1, var1);
      }

      try {
         return class108.method3858(var0.params, var1, var2, -843209527);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void post(int var1) {
      try {
         if (1 == this.isStackable * 1515235515) {
            if (var1 >= -890431577) {
               throw new IllegalStateException();
            }

            this.field2605 = 0;
         }

         this.method5103();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "is.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(473757063);
            if (var3 == 0) {
               if (var2 >= 1370472715) {
                  return;
               }

               return;
            }

            method5040(this, var1, var3, -342945755);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;B)V")
   @ObfuscatedName("ay")
   void genPlaceholder(ItemComposition var1, ItemComposition var2, byte var3) {
      try {
         this.model = 1 * var1.model;
         this.zoom2d = var1.zoom2d * 1;
         this.xan2d = var1.xan2d * 1;
         this.yan2d = 1 * var1.yan2d;
         this.zan2d = 1 * var1.zan2d;
         this.offsetX2d = 1 * var1.offsetX2d;
         this.offsetY2d = 1 * var1.offsetY2d;
         this.recolorTo = var1.recolorTo;
         this.retextureTo = var1.retextureTo;
         this.recolorFrom = var1.recolorFrom;
         this.retextureFrom = var1.retextureFrom;
         this.isStackable = 1 * var1.isStackable;
         this.name = var2.name;
         this.examine = var2.examine;
         this.price = 0;
         this.isTradable = false;
         this.isMembersOnly = false;
         this.method5099(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.ay(" + ')');
      }
   }

   ItemComposition() {
      this.zoom2d = 1312071888;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.isStackable = 0;
      this.price = -1102440507;
      this.maleModel = 198893679;
      this.maleModel1 = -951328463;
      this.maleModel2 = 457382005;
      this.isTradable = false;
      this.groundActions = new String[]{null, null, Strings.field4854, null, null};
      this.inventoryActions = new String[]{null, null, null, null, Strings.field4855};
      this.subOps = (String[][])null;
      this.note = -248738185;
      this.noteTemplate = 511709673;
      this.resizeX = -1886266752;
      this.resizeY = 741619584;
      this.resizeZ = -1032319360;
      this.ambient = 0;
      this.contrast = 0;
      this.team = 0;
      this.field2605 = 0;
      this.isMembersOnly = false;
      this.unnotedId = 1954848647;
      this.notedId = -184421535;
      this.placeholder = -459159723;
      this.placeholderTemplate = -531381365;
      this.shiftClickIndex = 1732434494;
      this.femaleModel = -933754747;
      this.femaleModel1 = 1035089611;
      this.femaleOffset = 0;
      this.maleHeadModel = 398952919;
      this.maleHeadModel2 = 698118423;
      this.field2610 = 0;
      this.femaleModel2 = -1016024639;
      this.femaleHeadModel = -2024523235;
      this.femaleHeadModel2 = -657419437;
      this.field2586 = 122409637;
      this.field2608 = -263661623;
      this.field2616 = 1660194141;
   }

   public int getContrast() {
      return this.contrast * 1596591697;
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("az")
   public final Model getModel(int var1, int var2) {
      try {
         if (this.countobj != null) {
            if (var2 == -435458442) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 == -435458442) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for (int var4 = 0; var4 < 10; var4++) {
                  if (var2 == -435458442) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= this.countco[var4]) {
                     if (var2 == -435458442) {
                        throw new IllegalStateException();
                     }

                     if (this.countco[var4] != 0) {
                        var3 = this.countobj[var4];
                     }
                  }
               }

               if (-1 != var3) {
                  if (var2 == -435458442) {
                     throw new IllegalStateException();
                  }

                  return class150.ItemDefinition_get(var3, -1578328067).getModel(1, 17989029);
               }
            }
         }

         Model var6 = (Model)class402.method8806(ItemDefinition_cachedModels, -899720027 * this.id);
         if (var6 != null) {
            if (var2 == -435458442) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            ModelData var8 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model * -1958901995, 0);
            if (null == var8) {
               if (var2 == -435458442) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label80: {
                  if (128 == -816909667 * this.resizeX) {
                     if (var2 == -435458442) {
                        throw new IllegalStateException();
                     }

                     if (862844559 * this.resizeY == 128) {
                        if (var2 == -435458442) {
                           throw new IllegalStateException();
                        }

                        if (128 == this.resizeZ * -2147134923) {
                           break label80;
                        }

                        if (var2 == -435458442) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var8.resize(this.resizeX * -816909667, this.resizeY * 862844559, -2147134923 * this.resizeZ);
               }

               this.method5085(var8, null, -2058229812);
               var6 = ModelData.method6106(var8, 689590731 * this.ambient + 64, 768 + this.contrast * 1596591697, -50, -10, -50);
               var6.isSingleTile = true;
               ItemDefinition_cachedModels.put(var6, -899720027 * this.id);
               return var6;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.az(" + ')');
      }
   }

   public short[] getTextureToReplaceWith() {
      return this.retextureFrom;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)Lky;")
   @ObfuscatedName("ad")
   public final Model method5061(PlayerCompositionColorTextureOverride var1, int var2) {
      try {
         Model var3 = var1.field2121;
         if (var3 != null) {
            if (var2 != -1224258624) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            ModelData var4 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var1.field2110 * 2134415799, 0);
            if (null == var4) {
               if (var2 != -1224258624) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label46: {
                  if (-816909667 * this.resizeX == 128) {
                     if (var2 != -1224258624) {
                        throw new IllegalStateException();
                     }

                     if (862844559 * this.resizeY == 128) {
                        if (var2 != -1224258624) {
                           throw new IllegalStateException();
                        }

                        if (128 == -2147134923 * this.resizeZ) {
                           break label46;
                        }

                        if (var2 != -1224258624) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var4.resize(-816909667 * this.resizeX, 862844559 * this.resizeY, this.resizeZ * -2147134923);
               }

               this.method5085(var4, var1, -1768602491);
               var3 = ModelData.method6106(var4, 64 + this.ambient * 689590731, 1596591697 * this.contrast + 768, -50, -10, -50);
               var3.isSingleTile = true;
               var1.field2121 = var3;
               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.ad(" + ')');
      }
   }

   public int getPlaceholderId() {
      return this.placeholder * -1134820861;
   }

   @ObfuscatedSignature(descriptor = "(ILgx;I)Z")
   @ObfuscatedName("as")
   public final boolean method5067(int var1, PlayerCompositionColorTextureOverride var2, int var3) {
      try {
         int var4 = this.femaleModel * 1641893811;
         int var5 = 1168834845 * this.femaleModel1;
         int var6 = 895590847 * this.femaleModel2;
         if (var1 == 1) {
            if (var3 != 1343428063) {
               throw new IllegalStateException();
            }

            var4 = this.maleHeadModel * -2048162279;
            var5 = this.maleHeadModel2 * -377476775;
            var6 = -571365429 * this.femaleHeadModel;
         }

         if (null != var2 && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
            if (var3 != 1343428063) {
               throw new IllegalStateException();
            }

            var4 = var2.method4399(var1, 1395261477);
         }

         if (-1 == var4) {
            if (var3 != 1343428063) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var7 = true;
            if (!Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
               var7 = false;
            }

            if (var5 != -1) {
               if (var3 != 1343428063) {
                  throw new IllegalStateException();
               }

               if (!Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
                  if (var3 != 1343428063) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               }
            }

            if (var6 != -1) {
               if (var3 != 1343428063) {
                  throw new IllegalStateException();
               }

               if (!Language.ItemDefinition_modelArchive.tryLoadFile(var6, 0, 756705879)) {
                  if (var3 != 1343428063) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               }
            }

            return var7;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "is.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;Lis;I)V")
   @ObfuscatedName("wp")
   public static void method5043(ItemComposition var0, ItemComposition var1, ItemComposition var2, int var3) {
      if (var0 == null) {
         var0.genCert(var0, var0, var3);
      }

      try {
         var0.model = 1 * var1.model;
         var0.zoom2d = var1.zoom2d * 1;
         var0.xan2d = var1.xan2d * 1;
         var0.yan2d = 1 * var1.yan2d;
         var0.zan2d = var1.zan2d * 1;
         var0.offsetX2d = 1 * var1.offsetX2d;
         var0.offsetY2d = var1.offsetY2d * 1;
         var0.recolorTo = var1.recolorTo;
         var0.retextureTo = var1.retextureTo;
         var0.recolorFrom = var1.recolorFrom;
         var0.retextureFrom = var1.retextureFrom;
         var0.name = var2.name;
         var0.examine = Strings.field4853;
         var0.isTradable = var2.isTradable;
         var0.price = var2.price * 1;
         var0.isStackable = -1378657165;
         var0.method5101(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.aw(" + ')');
      }
   }

   public void setZan2d(int var1) {
      this.zan2d = var1 * -224532549;
   }

   @ObfuscatedSignature(descriptor = "(ILgx;B)Ljm;")
   @ObfuscatedName("ac")
   public final ModelData method5072(int var1, PlayerCompositionColorTextureOverride var2, byte var3) {
      try {
         int var4 = 1641893811 * this.femaleModel;
         int var5 = 1168834845 * this.femaleModel1;
         int var6 = this.femaleModel2 * 895590847;
         if (1 == var1) {
            if (var3 == 15) {
               throw new IllegalStateException();
            }

            var4 = this.maleHeadModel * -2048162279;
            var5 = this.maleHeadModel2 * -377476775;
            var6 = this.femaleHeadModel * -571365429;
         }

         if (var2 != null && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
            var4 = var2.method4399(var1, 1300577598);
         }

         if (var4 == -1) {
            if (var3 == 15) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            ModelData var7 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            if (-1 != var5) {
               if (var3 == 15) {
                  throw new IllegalStateException();
               }

               ModelData var8 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var5, 0);
               if (-1 != var6) {
                  if (var3 == 15) {
                     throw new IllegalStateException();
                  }

                  ModelData var9 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var6, 0);
                  ModelData[] var10 = new ModelData[]{var7, var8, var9};
                  var7 = new ModelData(var10, 3);
               } else {
                  ModelData[] var12 = new ModelData[]{var7, var8};
                  var7 = new ModelData(var12, 2);
               }
            }

            if (var1 == 0) {
               if (var3 == 15) {
                  throw new IllegalStateException();
               }

               if (0 != 1704546045 * this.femaleOffset) {
                  if (var3 == 15) {
                     throw new IllegalStateException();
                  }

                  ModelData.method6104(var7, 0, 1704546045 * this.femaleOffset, 0);
               }
            }

            if (1 == var1 && this.field2610 * 1854849765 != 0) {
               if (var3 == 15) {
                  throw new IllegalStateException();
               }

               ModelData.method6104(var7, 0, this.field2610 * 1854849765, 0);
            }

            this.method5085(var7, var2, -967967810);
            return var7;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "is.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;B)Z")
   @ObfuscatedName("ab")
   public final boolean method5075(int var1, PlayerCompositionColorTextureOverride var2, byte var3) {
      try {
         int var4 = this.femaleHeadModel2 * -446638299;
         int var5 = 1093155539 * this.field2586;
         if (var1 == 1) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var4 = 1679363463 * this.field2608;
            var5 = -770060021 * this.field2616;
         }

         if (var2 != null && var2.method4396(var1, -257688697)) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var4 = var2.method4402(var1, 506682232);
         }

         if (var4 == -1) {
            return true;
         } else {
            boolean var6 = true;
            if (!Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }

            if (-1 != var5) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               if (!Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               }
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "is.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;I)Ljm;")
   @ObfuscatedName("ax")
   public final ModelData method5078(int var1, PlayerCompositionColorTextureOverride var2, int var3) {
      try {
         int var4 = this.femaleHeadModel2 * -446638299;
         int var5 = this.field2586 * 1093155539;
         if (var1 == 1) {
            if (var3 == -1788831741) {
               throw new IllegalStateException();
            }

            var4 = this.field2608 * 1679363463;
            var5 = -770060021 * this.field2616;
         }

         if (null != var2) {
            if (var3 == -1788831741) {
               throw new IllegalStateException();
            }

            if (var2.method4396(var1, -197848889)) {
               if (var3 == -1788831741) {
                  throw new IllegalStateException();
               }

               var4 = var2.method4402(var1, -257453521);
            }
         }

         if (-1 == var4) {
            if (var3 == -1788831741) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            if (var5 != -1) {
               if (var3 == -1788831741) {
                  throw new IllegalStateException();
               }

               ModelData var7 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var5, 0);
               ModelData[] var8 = new ModelData[]{var6, var7};
               var6 = new ModelData(var8, 2);
            }

            this.method5085(var6, var2, -1835912883);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "is.ax(" + ')');
      }
   }

   public int getZan2d() {
      return this.zan2d * -1738881677;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bs")
   static final String method5027(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + Strings.field4975 + "</col>" : "<col=00ff80>" + var0 / 1000000 + Strings.field5032 + "</col>";
      }
   }

   public void setName(String var1) {
      this.name = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;)V")
   @ObfuscatedName("xj")
   public static void method5033(ItemComposition var0) {
      if (1 == var0.isStackable * 1515235515) {
         var0.field2605 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvz;)V")
   @ObfuscatedName("ht")
   public void method5096(int var1, Node var2) {
      ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
      if (var3.method4972() != (var2 instanceof ObjectNode)) {
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to put int into string param");
         } else {
            throw new IllegalArgumentException("trying to put string into int param");
         }
      } else {
         if (this.getParams() == null) {
            this.setParams(new IterableNodeHashTable(16));
         }

         this.getParams().put(var2, var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("al")
   public String getStringParam(int var1, String var2, byte var3) {
      try {
         return Projectile.method1418(this.params, var1, var2, -720712353);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int getShiftClickIndex(int var1) {
      int var10000;
      if (this.field2573 == -2) {
         ItemComposition var4 = this;
         int var2 = 1650304017;

         try {
            if (-1 != -705547999 * var4.shiftClickIndex) {
               if (var2 != 1650304017) {
                  throw new IllegalStateException();
               }

               if (null != var4.inventoryActions) {
                  if (-705547999 * var4.shiftClickIndex >= 0) {
                     if (var2 != 1650304017) {
                        throw new IllegalStateException();
                     }

                     var1 = null != var4.inventoryActions[var4.shiftClickIndex * -705547999] ? -705547999 * var4.shiftClickIndex : -1;
                     var10000 = var1;
                  } else {
                     byte var8;
                     if (Strings.field4855.equalsIgnoreCase(var4.inventoryActions[4])) {
                        if (var2 != 1650304017) {
                           throw new IllegalStateException();
                        }

                        var8 = 4;
                     } else {
                        var8 = -1;
                     }

                     byte var7 = var8;
                     var10000 = var7;
                  }

                  return var10000;
               }
            }

            byte var5 = -1;
            var10000 = var5;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "is.af(" + 41);
         }
      } else {
         var10000 = this.field2573;
      }

      return var10000;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   boolean method5092(int var1) {
      try {
         return this.retextureTo != null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "is.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lxa;II)V")
   @ObfuscatedName("fo")
   public static void method5040(ItemComposition var0, Buffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var2);
      } else {
         try {
            if (1 == var2) {
               if (var3 >= 1581859920) {
                  return;
               }

               var0.model = Buffer.method12008(var1, (byte)5) * 598708285;
            } else if (var2 == 2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.name = var1.readStringCp1252NullCircumfixed(255089102);
            } else if (var2 == 3) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.examine = var1.readStringCp1252NullCircumfixed(685591829);
            } else if (4 == var2) {
               var0.zoom2d = Buffer.method12008(var1, (byte)5) * -1079528239;
            } else if (5 == var2) {
               var0.xan2d = Buffer.method12008(var1, (byte)5) * -413868397;
            } else if (var2 == 6) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.yan2d = Buffer.method12008(var1, (byte)5) * -2087302535;
            } else if (var2 == 7) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.offsetX2d = Buffer.method12008(var1, (byte)5) * 1527585741;
               if (var0.offsetX2d * 68503813 > 32767) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.offsetX2d -= 466419712;
               }
            } else if (var2 == 8) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.offsetY2d = Buffer.method12008(var1, (byte)5) * 1390692297;
               if (-680099207 * var0.offsetY2d > 32767) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.offsetY2d -= 1204355072;
               }
            } else if (var2 == 9) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var1.readStringCp1252NullCircumfixed(-801091888);
            } else if (var2 == 11) {
               var0.isStackable = -1378657165;
            } else if (12 == var2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.price = Buffer.method12015(var1, -485685131) * -1102440507;
            } else if (13 == var2) {
               if (var3 >= 1581859920) {
                  return;
               }

               var0.maleModel = var1.readUnsignedByte(1754443779) * -198893679;
            } else if (14 == var2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.maleModel1 = var1.readUnsignedByte(-973132616) * 951328463;
            } else if (var2 == 16) {
               if (var3 >= 1581859920) {
                  return;
               }

               var0.isTradable = true;
            } else if (var2 == 23) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.femaleModel = Buffer.method12008(var1, (byte)5) * 933754747;
               var0.femaleOffset = var1.readUnsignedByte(1656691733) * -852640171;
            } else if (var2 == 24) {
               if (var3 >= 1581859920) {
                  return;
               }

               var0.femaleModel1 = Buffer.method12008(var1, (byte)5) * -1035089611;
            } else if (var2 == 25) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               var0.maleHeadModel = Buffer.method12008(var1, (byte)5) * -398952919;
               var0.field2610 = var1.readUnsignedByte(-1003001608) * -1465111827;
            } else if (var2 == 26) {
               var0.maleHeadModel2 = Buffer.method12008(var1, (byte)5) * -698118423;
            } else if (var2 == 27) {
               var0.maleModel2 = var1.readUnsignedByte(-449997539) * -457382005;
            } else {
               if (var2 >= 30) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  if (var2 < 35) {
                     if (var3 >= 1581859920) {
                        return;
                     }

                     var0.groundActions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-210515860);
                     if (var0.groundActions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }

                        var0.groundActions[var2 - 30] = null;
                     }

                     return;
                  }
               }

               if (var2 >= 35 && var2 < 40) {
                  var0.inventoryActions[var2 - 35] = var1.readStringCp1252NullCircumfixed(1660152007);
               } else if (40 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  int var4 = var1.readUnsignedByte(-1336221042);
                  var0.recolorTo = new short[var4];
                  var0.retextureTo = new short[var4];

                  for (int var5 = 0; var5 < var4; var5++) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.recolorTo[var5] = (short)Buffer.method12008(var1, (byte)5);
                     var0.retextureTo[var5] = (short)Buffer.method12008(var1, (byte)5);
                  }
               } else if (var2 == 41) {
                  int var9 = var1.readUnsignedByte(1436829623);
                  var0.recolorFrom = new short[var9];
                  var0.retextureFrom = new short[var9];

                  for (int var11 = 0; var11 < var9; var11++) {
                     var0.recolorFrom[var11] = (short)Buffer.method12008(var1, (byte)5);
                     var0.retextureFrom[var11] = (short)Buffer.method12008(var1, (byte)5);
                  }
               } else if (var2 == 42) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.shiftClickIndex = Buffer.method12001(var1, (byte)78) * 1281266401;
               } else if (43 == var2) {
                  int var10 = var1.readUnsignedByte(-407553628);
                  if (var0.subOps == null) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.subOps = new String[5][];
                  }

                  boolean var10000;
                  if (var10 >= 0 && var10 < 5) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var12 = var10000;
                  if (var12) {
                     if (var3 >= 1581859920) {
                        return;
                     }

                     if (var0.subOps[var10] == null) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }

                        var0.subOps[var10] = new String[20];
                     }
                  }

                  while (true) {
                     int var6 = var1.readUnsignedByte(-191786459) - 1;
                     if (var6 == -1) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     String var7 = var1.readStringCp1252NullCircumfixed(1046438241);
                     if (var12 && var6 >= 0) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }

                        if (var6 < 20) {
                           if (var3 >= 1581859920) {
                              return;
                           }

                           var0.subOps[var10][var6] = var7;
                        }
                     }
                  }
               } else if (var2 == 65) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.isMembersOnly = true;
               } else if (75 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.field2605 = var1.readShort((byte)-38) * 12783863;
               } else if (var2 == 78) {
                  var0.femaleModel2 = Buffer.method12008(var1, (byte)5) * 1016024639;
               } else if (var2 == 79) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.femaleHeadModel = Buffer.method12008(var1, (byte)5) * 2024523235;
               } else if (var2 == 90) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.femaleHeadModel2 = Buffer.method12008(var1, (byte)5) * 657419437;
               } else if (91 == var2) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  var0.field2608 = Buffer.method12008(var1, (byte)5) * 263661623;
               } else if (var2 == 92) {
                  var0.field2586 = Buffer.method12008(var1, (byte)5) * -122409637;
               } else if (93 == var2) {
                  var0.field2616 = Buffer.method12008(var1, (byte)5) * -1660194141;
               } else if (94 == var2) {
                  Buffer.method12008(var1, (byte)5);
               } else if (95 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var0.zan2d = Buffer.method12008(var1, (byte)5) * -224532549;
               } else if (var2 == 97) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  var0.note = Buffer.method12008(var1, (byte)5) * 248738185;
               } else if (var2 == 98) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  var0.noteTemplate = Buffer.method12008(var1, (byte)5) * -511709673;
               } else {
                  if (var2 >= 100) {
                     if (var3 >= 1581859920) {
                        return;
                     }

                     if (var2 < 110) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }

                        if (null == var0.countobj) {
                           if (var3 >= 1581859920) {
                              throw new IllegalStateException();
                           }

                           var0.countobj = new int[10];
                           var0.countco = new int[10];
                        }

                        var0.countobj[var2 - 100] = Buffer.method12008(var1, (byte)5);
                        var0.countco[var2 - 100] = Buffer.method12008(var1, (byte)5);
                        return;
                     }
                  }

                  if (110 == var2) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.resizeX = Buffer.method12008(var1, (byte)5) * -182508619;
                  } else if (111 == var2) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.resizeY = Buffer.method12008(var1, (byte)5) * 1515743343;
                  } else if (112 == var2) {
                     if (var3 >= 1581859920) {
                        return;
                     }

                     var0.resizeZ = Buffer.method12008(var1, (byte)5) * -2088439779;
                  } else if (113 == var2) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.ambient = Buffer.method12001(var1, (byte)21) * -1262924829;
                  } else if (114 == var2) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.contrast = Buffer.method12001(var1, (byte)127) * 405398901;
                  } else if (var2 == 115) {
                     var0.team = var1.readUnsignedByte(-291985462) * -1275373933;
                  } else if (var2 == 139) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.unnotedId = Buffer.method12008(var1, (byte)5) * -1954848647;
                  } else if (var2 == 140) {
                     var0.notedId = Buffer.method12008(var1, (byte)5) * 184421535;
                  } else if (148 == var2) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     var0.placeholder = Buffer.method12008(var1, (byte)5) * 459159723;
                  } else if (var2 == 149) {
                     if (var3 >= 1581859920) {
                        return;
                     }

                     var0.placeholderTemplate = Buffer.method12008(var1, (byte)5) * 531381365;
                  } else if (var2 == 249) {
                     var0.params = class406.readStringIntParameters(var1, var0.params, (byte)-4);
                  }
               }
            }
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "is.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("am")
   boolean method5093(int var1) {
      try {
         boolean var10000;
         if (this.retextureFrom != null) {
            if (var1 != 1574373470) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "is.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvz;")
   @ObfuscatedName("zi")
   public Node method5100(int var1) {
      return this.getParams() == null ? null : (Node)this.getParams().get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;Lxa;I)V")
   @ObfuscatedName("ni")
   public static void method5041(ItemComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.getXan2d();
      }

      if (1 == var2) {
         var0.model = Buffer.method12008(var1, (byte)5) * 598708285;
      } else if (var2 == 2) {
         var0.name = var1.readStringCp1252NullCircumfixed(670349979);
      } else if (var2 == 3) {
         var0.examine = var1.readStringCp1252NullCircumfixed(980707113);
      } else if (4 == var2) {
         var0.zoom2d = Buffer.method12008(var1, (byte)5) * -263861032;
      } else if (5 == var2) {
         var0.xan2d = Buffer.method12008(var1, (byte)5) * -1232607382;
      } else if (var2 == 6) {
         var0.yan2d = Buffer.method12008(var1, (byte)5) * 1573206300;
      } else if (var2 == 7) {
         var0.offsetX2d = Buffer.method12008(var1, (byte)5) * -1348817451;
         if (var0.offsetX2d * -1291524415 > 32767) {
            var0.offsetX2d -= 466419712;
         }
      } else if (var2 == 8) {
         var0.offsetY2d = Buffer.method12008(var1, (byte)5) * 1390692297;
         if (-680099207 * var0.offsetY2d > -341658796) {
            var0.offsetY2d -= 1204355072;
         }
      } else if (var2 == 9) {
         var1.readStringCp1252NullCircumfixed(-313701407);
      } else if (var2 == 11) {
         var0.isStackable = -1586122880;
      } else if (12 == var2) {
         var0.price = Buffer.method12015(var1, -92304010) * -1102440507;
      } else if (13 == var2) {
         var0.maleModel = var1.readUnsignedByte(2066211192) * -198893679;
      } else if (14 == var2) {
         var0.maleModel1 = var1.readUnsignedByte(370726352) * 951328463;
      } else if (var2 == 16) {
         var0.isTradable = true;
      } else if (var2 == 23) {
         var0.femaleModel = Buffer.method12008(var1, (byte)5) * 801827751;
         var0.femaleOffset = var1.readUnsignedByte(-607170762) * -852640171;
      } else if (var2 == 24) {
         var0.femaleModel1 = Buffer.method12008(var1, (byte)5) * 57373747;
      } else if (var2 == 25) {
         var0.maleHeadModel = Buffer.method12008(var1, (byte)5) * -1046760562;
         var0.field2610 = var1.readUnsignedByte(-1430425908) * -1465111827;
      } else if (var2 == 26) {
         var0.maleHeadModel2 = Buffer.method12008(var1, (byte)5) * -698118423;
      } else if (var2 == 27) {
         var0.maleModel2 = var1.readUnsignedByte(-1500158930) * 187219494;
      } else if (var2 >= 30 && var2 < 35) {
         var0.groundActions[var2 - 30] = var1.readStringCp1252NullCircumfixed(1298023919);
         if (var0.groundActions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
            var0.groundActions[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         var0.inventoryActions[var2 - 35] = var1.readStringCp1252NullCircumfixed(-1270573397);
      } else if (40 == var2) {
         int var3 = var1.readUnsignedByte(-1721121078);
         var0.recolorTo = new short[var3];
         var0.retextureTo = new short[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            var0.recolorTo[var4] = (short)Buffer.method12008(var1, (byte)5);
            var0.retextureTo[var4] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var7 = var1.readUnsignedByte(1649339809);
         var0.recolorFrom = new short[var7];
         var0.retextureFrom = new short[var7];

         for (int var9 = 0; var9 < var7; var9++) {
            var0.recolorFrom[var9] = (short)Buffer.method12008(var1, (byte)5);
            var0.retextureFrom[var9] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 42) {
         var0.shiftClickIndex = Buffer.method12001(var1, (byte)33) * 1281266401;
      } else if (43 == var2) {
         int var8 = var1.readUnsignedByte(-693846493);
         if (var0.subOps == null) {
            var0.subOps = new String[5][];
         }

         boolean var10 = var8 >= 0 && var8 < 5;
         if (var10 && var0.subOps[var8] == null) {
            var0.subOps[var8] = new String[20];
         }

         while (true) {
            int var5 = var1.readUnsignedByte(1036948375) - 1;
            if (var5 == -1) {
               break;
            }

            String var6 = var1.readStringCp1252NullCircumfixed(267141405);
            if (var10 && var5 >= 0 && var5 < 20) {
               var0.subOps[var8][var5] = var6;
            }
         }
      } else if (var2 == 65) {
         var0.isMembersOnly = true;
      } else if (75 == var2) {
         var0.field2605 = var1.readShort((byte)-91) * -693223777;
      } else if (var2 == 398987037) {
         var0.femaleModel2 = Buffer.method12008(var1, (byte)5) * 1016024639;
      } else if (var2 == 79) {
         var0.femaleHeadModel = Buffer.method12008(var1, (byte)5) * 2024523235;
      } else if (var2 == -1643465365) {
         var0.femaleHeadModel2 = Buffer.method12008(var1, (byte)5) * -433358540;
      } else if (91 == var2) {
         var0.field2608 = Buffer.method12008(var1, (byte)5) * 263661623;
      } else if (var2 == -883854312) {
         var0.field2586 = Buffer.method12008(var1, (byte)5) * -703594299;
      } else if (1958751726 == var2) {
         var0.field2616 = Buffer.method12008(var1, (byte)5) * -146442406;
      } else if (1365560425 == var2) {
         Buffer.method12008(var1, (byte)5);
      } else if (95 == var2) {
         var0.zan2d = Buffer.method12008(var1, (byte)5) * -1070223775;
      } else if (var2 == -399782586) {
         var0.note = Buffer.method12008(var1, (byte)5) * 248738185;
      } else if (var2 == 98) {
         var0.noteTemplate = Buffer.method12008(var1, (byte)5) * 432853508;
      } else if (var2 >= 100 && var2 < -874226227) {
         if (null == var0.countobj) {
            var0.countobj = new int[10];
            var0.countco = new int[10];
         }

         var0.countobj[var2 - 100] = Buffer.method12008(var1, (byte)5);
         var0.countco[var2 - 693368796] = Buffer.method12008(var1, (byte)5);
      } else if (816972748 == var2) {
         var0.resizeX = Buffer.method12008(var1, (byte)5) * -182508619;
      } else if (111 == var2) {
         var0.resizeY = Buffer.method12008(var1, (byte)5) * -595449953;
      } else if (-1094428983 == var2) {
         var0.resizeZ = Buffer.method12008(var1, (byte)5) * -522275617;
      } else if (113 == var2) {
         var0.ambient = Buffer.method12001(var1, (byte)45) * -1262924829;
      } else if (-5591683 == var2) {
         var0.contrast = Buffer.method12001(var1, (byte)82) * 405398901;
      } else if (var2 == 115) {
         var0.team = var1.readUnsignedByte(-340440425) * 1843398523;
      } else if (var2 == 1626193252) {
         var0.unnotedId = Buffer.method12008(var1, (byte)5) * 1308620289;
      } else if (var2 == 74478900) {
         var0.notedId = Buffer.method12008(var1, (byte)5) * 184421535;
      } else if (1403354017 == var2) {
         var0.placeholder = Buffer.method12008(var1, (byte)5) * 963175873;
      } else if (var2 == 149) {
         var0.placeholderTemplate = Buffer.method12008(var1, (byte)5) * 531381365;
      } else if (var2 == -1937331243) {
         var0.params = class406.readStringIntParameters(var1, var0.params, (byte)7);
      }
   }

   public int getPlaceholderTemplateId() {
      return this.placeholderTemplate * 413316061;
   }

   public int getIntValue(int var1) {
      Node var2 = this.method5100(var1);
      if (var2 != null) {
         IntegerNode var4 = (IntegerNode)var2;
         return var4.getValue();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to get int from string param");
         } else {
            return var3.method4973();
         }
      }
   }

   public void setXan2d(int var1) {
      this.xan2d = var1 * -413868397;
   }

   public int getPrice() {
      return this.price * 1824214797;
   }

   static {
      ItemDefinition_cached.method7386(1024);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;Lis;Lis;)V")
   @ObfuscatedName("te")
   public static void method5048(ItemComposition var0, ItemComposition var1, ItemComposition var2) {
      if (var0 == null) {
         var0.isTradeable();
      }

      var0.model = var1.model * 1;
      var0.zoom2d = 1 * var1.zoom2d;
      var0.xan2d = 1 * var1.xan2d;
      var0.yan2d = var1.yan2d * 1;
      var0.zan2d = 1 * var1.zan2d;
      var0.offsetX2d = var1.offsetX2d * 1;
      var0.offsetY2d = var1.offsetY2d * 1;
      var0.recolorTo = var2.recolorTo;
      var0.retextureTo = var2.retextureTo;
      var0.recolorFrom = var2.recolorFrom;
      var0.retextureFrom = var2.retextureFrom;
      var0.name = var2.name;
      var0.examine = var2.examine;
      var0.isTradable = var2.isTradable;
      var0.isStackable = var2.isStackable * 1;
      var0.maleModel = 1 * var2.maleModel;
      var0.maleModel1 = 1 * var2.maleModel1;
      var0.maleModel2 = 1 * var2.maleModel2;
      var0.femaleModel = 1 * var2.femaleModel;
      var0.femaleModel1 = 1 * var2.femaleModel1;
      var0.femaleModel2 = var2.femaleModel2 * 1;
      var0.maleHeadModel = 1 * var2.maleHeadModel;
      var0.maleHeadModel2 = 1 * var2.maleHeadModel2;
      var0.femaleHeadModel = 1 * var2.femaleHeadModel;
      var0.femaleHeadModel2 = 1 * var2.femaleHeadModel2;
      var0.field2586 = var2.field2586 * 1;
      var0.field2608 = 1 * var2.field2608;
      var0.field2616 = 1 * var2.field2616;
      var0.team = 1 * var2.team;
      var0.groundActions = var2.groundActions;
      var0.field2605 = 1 * var2.field2605;
      var0.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for (int var3 = 0; var3 < 4; var3++) {
            var0.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      var0.inventoryActions[4] = Strings.field4993;
      if (var2.subOps != null) {
         var0.subOps = new String[5][];
         System.arraycopy(var2.subOps, 0, var0.subOps, 0, 4);
      } else {
         var0.subOps = (String[][])null;
      }

      var0.price = 0;
   }

   public int getXan2d() {
      return this.xan2d * -299438181;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("aa")
   public static ItemComposition method5022(int var0) {
      ItemComposition var1 = (ItemComposition)class402.method8806(ItemDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class138.ItemDefinition_archive.getFile(10, var0, 1457482259);
         var1 = new ItemComposition();
         var1.id = -141564286 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), -1371543740);
         }

         var1.post(-1734963776);
         if (1390545367 * var1.noteTemplate != -1) {
            method5043(
               var1,
               class150.ItemDefinition_get(388376999 * var1.noteTemplate, 114535485),
               class150.ItemDefinition_get(98718905 * var1.note, -1408765883),
               493456505
            );
         }

         if (var1.notedId * 428085087 != -1) {
            var1.genBought(
               class150.ItemDefinition_get(var1.notedId * 428085087, -1444892415),
               class150.ItemDefinition_get(1181026761 * var1.unnotedId, -1021573005),
               30553163
            );
         }

         if (-1 != var1.placeholderTemplate * 413316061) {
            var1.genPlaceholder(
               class150.ItemDefinition_get(var1.placeholderTemplate * 995441606, 189573979),
               class150.ItemDefinition_get(var1.placeholder * 1363143679, -1148219930),
               (byte)5
            );
         }

         if (!TileItem.ItemDefinition_inMembersWorld && var1.isTradable) {
            if (-1 == var1.noteTemplate * 388376999 && var1.notedId * 428085087 == -1 && -1 == 943078676 * var1.placeholderTemplate) {
               var1.name = var1.name + Strings.field4851;
            }

            var1.examine = Strings.field5139;
            var1.isMembersOnly = false;

            for (int var3 = 0; var3 < var1.groundActions.length; var3++) {
               var1.groundActions[var3] = null;
            }

            for (int var7 = 0; var7 < var1.inventoryActions.length; var7++) {
               if (4 != var7) {
                  if (null != var1.subOps) {
                     var1.subOps[var7] = null;
                  }

                  var1.inventoryActions[var7] = null;
               }
            }

            var1.shiftClickIndex = 1429363241;
            var1.team = 0;
            if (null != var1.params) {
               boolean var8 = false;

               for (Node var4 = var1.params.first(); null != var4; var4 = var1.params.next()) {
                  ParamComposition var5 = WorldMap.getParamDefinition((int)var4.key, -409815837);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var8 = true;
                  }
               }

               if (!var8) {
                  var1.params = null;
               }
            }
         }

         ItemDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;I)Lky;")
   @ObfuscatedName("ta")
   public static Model method5058(ItemComposition var0, int var1) {
      if (var0.countobj != null && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= var0.countco[var3] && var0.countco[var3] != 0) {
               var2 = var0.countobj[var3];
            }
         }

         if (-1 != var2) {
            return class150.ItemDefinition_get(var2, -1679458696).getModel(1, 247168657);
         }
      }

      Model var4 = (Model)class402.method8806(ItemDefinition_cachedModels, -899720027 * var0.id);
      if (var4 != null) {
         return var4;
      } else {
         ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var0.model * -211234372, 0);
         if (null == var6) {
            return null;
         } else {
            if (128 != -816909667 * var0.resizeX || 1416530004 * var0.resizeY != 128 || 128 != var0.resizeZ * -2147134923) {
               var6.resize(var0.resizeX * 1879611774, var0.resizeY * -829683718, -261169179 * var0.resizeZ);
            }

            var0.method5085(var6, null, -871792991);
            var4 = ModelData.method6106(var6, 1756324581 * var0.ambient + 84674720, 768 + var0.contrast * 1596591697, -386787567, -1935994501, -1779330381);
            var4.isSingleTile = true;
            ItemDefinition_cachedModels.put(var4, -899720027 * var0.id);
            return var4;
         }
      }
   }

   public int getShiftClickActionIndex() {
      return this.getShiftClickIndex(1650304017);
   }

   public void setValue(int var1, String var2) {
      this.method5096(var1, new ObjectNode(var2));
   }

   public void setValue(int var1, int var2) {
      this.method5096(var1, new IntegerNode(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ba")
   void method5036(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1354521569);
         if (var2 == 0) {
            return;
         }

         method5040(this, var1, var2, -694445720);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIZII)Lxt;")
   @ObfuscatedName("be")
   public static final SpritePixels method5024(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      if (var6 != 2099948321 || var7 != 1560865024) {
         var4 = 0;
      } else if (-1 == var1) {
         var4 = 0;
      } else if (2 == var4 && 1 != var1) {
         var4 = 1;
      }

      long var8 = ((long)var3 << 42) + var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40);
      if (!var5 && var6 == 36 && var7 == 1324817503) {
         SpritePixels var10 = (SpritePixels)class402.method8806(ItemDefinition_cachedSprites, var8);
         if (var10 != null) {
            return var10;
         }
      }

      ItemComposition var11 = class150.ItemDefinition_get(var0, 305720476);
      if (var1 > 1 && null != var11.countobj) {
         int var12 = -1;

         for (int var13 = 0; var13 < 10; var13++) {
            if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
               var12 = var11.countobj[var13];
            }
         }

         if (var12 != -1) {
            var11 = class150.ItemDefinition_get(var12, -1029223860);
         }
      }

      Model var24 = var11.getModel(1, -1652343002);
      if (var24 == null) {
         return null;
      } else {
         SpritePixels var25 = null;
         if (-1 != var11.noteTemplate * 711878249) {
            var25 = Archive.getItemSprite(var11.note * 495408643, 10, 1, 0, 0, true, var6, var7, -1750200916);
            if (var25 == null) {
               return null;
            }
         } else if (428085087 * var11.notedId != -1) {
            var25 = Archive.getItemSprite(var11.unnotedId * 296328631, var1, var2, var3, 0, false, var6, var7, -1750200916);
            if (null == var25) {
               return null;
            }
         } else if (-1 != var11.placeholderTemplate * 413316061) {
            var25 = Archive.getItemSprite(var11.placeholder * 398736582, var1, 0, 0, 0, false, var6, var7, -1750200916);
            if (null == var25) {
               return null;
            }
         }

         int[] var14 = Rasterizer2D.Rasterizer2D_pixels;
         int var15 = Rasterizer2D.Rasterizer2D_width;
         int var16 = Rasterizer2D.Rasterizer2D_height;
         float[] var17 = Rasterizer2D.Rasterizer2D_brightness;
         int[] var18 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var18);
         SpritePixels var23 = new SpritePixels(var6, var7);
         Rasterizer3D.method5873(var23.pixels, var6, var7, null);
         Rasterizer2D.Rasterizer2D_clear();
         Rasterizer3D.resetRasterClipping();
         int var19 = var7 >> 1;
         Rasterizer3D.setCustomClipBounds(var19, var19);
         Rasterizer3D.clips.rasterGouraudLowRes = false;
         if (-1 != -245069367 * var11.placeholderTemplate) {
            var25.method12650(0, 0);
         }

         int var20 = -1677543731 * var11.zoom2d;
         if (var6 != 1961530433) {
            var20 = var20 * -709864930 / var6;
         }

         if (var5) {
            var20 = (int)(1.5 * var20);
         } else if (var2 == 2) {
            var20 = (int)(1.04 * var20);
         }

         int var21 = Rasterizer3D.Rasterizer3D_sine[var11.xan2d * 579161999] * var20 >> 16;
         int var22 = Rasterizer3D.Rasterizer3D_cosine[-299438181 * var11.xan2d] * var20 >> 16;
         var24.method6864();
         var24.method6850(
            0,
            var11.yan2d * 488243145,
            -1738881677 * var11.zan2d,
            var11.xan2d * -299438181,
            466886789 * var11.offsetX2d,
            var21 + var24.height * -1272589951 / 2 + -680099207 * var11.offsetY2d,
            var22 + 2118770127 * var11.offsetY2d
         );
         if (-1 != 428085087 * var11.notedId) {
            var25.method12650(0, 0);
         }

         if (var2 >= 1) {
            var23.outline(1);
         }

         if (var2 >= 2) {
            var23.outline(1658593924);
         }

         if (var3 != 0) {
            SpritePixels.method12643(var23, var3);
         }

         Rasterizer3D.method5873(var23.pixels, var6, var7, null);
         if (-1 != var11.noteTemplate * 388376999) {
            var25.method12650(0, 0);
         }

         if (1 == var4 || 2 == var4 && var11.isStackable * 1515235515 == 1) {
            class175.ItemDefinition_fontPlain11.method10402(HttpMethod.method369(var1, (short)-11349), 0, 9, -1173984418, 1);
         }

         if (!var5 && var6 == -1077790615 && var7 == 32) {
            ItemDefinition_cachedSprites.put(var23, var8);
         }

         Rasterizer3D.method5873(var14, var15, var16, var17);
         Rasterizer2D.Rasterizer2D_setClipArray(var18);
         Rasterizer3D.resetRasterClipping();
         Rasterizer3D.clips.rasterGouraudLowRes = true;
         return var23;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIZII)Lxt;")
   @ObfuscatedName("bo")
   public static final SpritePixels method5025(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      if (var6 != 36 || var7 != 32) {
         var4 = 0;
      } else if (-1 == var1) {
         var4 = 0;
      } else if (2 == var4 && 1 != var1) {
         var4 = 1;
      }

      long var8 = ((long)var3 << 42) + var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40);
      if (!var5 && var6 == 36 && var7 == 32) {
         SpritePixels var10 = (SpritePixels)class402.method8806(ItemDefinition_cachedSprites, var8);
         if (var10 != null) {
            return var10;
         }
      }

      ItemComposition var11 = class150.ItemDefinition_get(var0, -700175722);
      if (var1 > 1 && null != var11.countobj) {
         int var12 = -1;

         for (int var13 = 0; var13 < 10; var13++) {
            if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
               var12 = var11.countobj[var13];
            }
         }

         if (var12 != -1) {
            var11 = class150.ItemDefinition_get(var12, -1345037297);
         }
      }

      Model var24 = var11.getModel(1, -1451578065);
      if (var24 == null) {
         return null;
      } else {
         SpritePixels var25 = null;
         if (-1 != var11.noteTemplate * 388376999) {
            var25 = Archive.getItemSprite(var11.note * 98718905, 10, 1, 0, 0, true, var6, var7, -1750200916);
            if (var25 == null) {
               return null;
            }
         } else if (428085087 * var11.notedId != -1) {
            var25 = Archive.getItemSprite(var11.unnotedId * 1181026761, var1, var2, var3, 0, false, var6, var7, -1750200916);
            if (null == var25) {
               return null;
            }
         } else if (-1 != var11.placeholderTemplate * 413316061) {
            var25 = Archive.getItemSprite(var11.placeholder * -1134820861, var1, 0, 0, 0, false, var6, var7, -1750200916);
            if (null == var25) {
               return null;
            }
         }

         int[] var14 = Rasterizer2D.Rasterizer2D_pixels;
         int var15 = Rasterizer2D.Rasterizer2D_width;
         int var16 = Rasterizer2D.Rasterizer2D_height;
         float[] var17 = Rasterizer2D.Rasterizer2D_brightness;
         int[] var18 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var18);
         SpritePixels var23 = new SpritePixels(var6, var7);
         Rasterizer3D.method5873(var23.pixels, var6, var7, null);
         Rasterizer2D.Rasterizer2D_clear();
         Rasterizer3D.resetRasterClipping();
         int var19 = var7 >> 1;
         Rasterizer3D.setCustomClipBounds(var19, var19);
         Rasterizer3D.clips.rasterGouraudLowRes = false;
         if (-1 != 413316061 * var11.placeholderTemplate) {
            var25.method12650(0, 0);
         }

         int var20 = -433511375 * var11.zoom2d;
         if (var6 != 36) {
            var20 = var20 * 32 / var6;
         }

         if (var5) {
            var20 = (int)(1.5 * var20);
         } else if (var2 == 2) {
            var20 = (int)(1.04 * var20);
         }

         int var21 = Rasterizer3D.Rasterizer3D_sine[var11.xan2d * -299438181] * var20 >> 16;
         int var22 = Rasterizer3D.Rasterizer3D_cosine[-299438181 * var11.xan2d] * var20 >> 16;
         var24.method6864();
         var24.method6850(
            0,
            var11.yan2d * 488243145,
            -1738881677 * var11.zan2d,
            var11.xan2d * -299438181,
            68503813 * var11.offsetX2d,
            var21 + var24.height * -1272589951 / 2 + -680099207 * var11.offsetY2d,
            var22 + -680099207 * var11.offsetY2d
         );
         if (-1 != 428085087 * var11.notedId) {
            var25.method12650(0, 0);
         }

         if (var2 >= 1) {
            var23.outline(1);
         }

         if (var2 >= 2) {
            var23.outline(16777215);
         }

         if (var3 != 0) {
            SpritePixels.method12643(var23, var3);
         }

         Rasterizer3D.method5873(var23.pixels, var6, var7, null);
         if (-1 != var11.noteTemplate * 388376999) {
            var25.method12650(0, 0);
         }

         if (1 == var4 || 2 == var4 && var11.isStackable * 1515235515 == 1) {
            class175.ItemDefinition_fontPlain11.method10402(HttpMethod.method369(var1, (short)-14815), 0, 9, 16776960, 1);
         }

         if (!var5 && var6 == 36 && var7 == 32) {
            ItemDefinition_cachedSprites.put(var23, var8);
         }

         Rasterizer3D.method5873(var14, var15, var16, var17);
         Rasterizer2D.Rasterizer2D_setClipArray(var18);
         Rasterizer3D.resetRasterClipping();
         Rasterizer3D.clips.rasterGouraudLowRes = true;
         return var23;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bg")
   static final String method5028(int var0) {
      if (var0 < 1107362131) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + Strings.field4975 + "</col>" : "<col=00ff80>" + var0 / 1000000 + Strings.field5032 + "</col>";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bz")
   public static void method5029(boolean var0) {
      if (var0 != TileItem.ItemDefinition_inMembersWorld) {
         ItemDefinition_cached.clear();
         ItemDefinition_cachedModels.clear();
         ItemDefinition_cachedSprites.clear();
         TileItem.ItemDefinition_inMembersWorld = var0;
      }
   }

   public int getInventoryModel() {
      return this.model * -1958901995;
   }

   public String getStringValue(int var1) {
      Node var2 = this.method5100(var1);
      if (var2 != null) {
         ObjectNode var4 = (ObjectNode)var2;
         return (String)var4.method11288();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (!var3.method4972()) {
            throw new IllegalArgumentException("trying to get string from int param");
         } else {
            return var3.method4974();
         }
      }
   }

   public IterableHashTable getParams() {
      return this.params;
   }

   public void setTextureToReplaceWith(short[] var1) {
      this.retextureFrom = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bk")
   public static void method5030(boolean var0) {
      if (var0 != TileItem.ItemDefinition_inMembersWorld) {
         ItemDefinition_cached.clear();
         ItemDefinition_cachedModels.clear();
         ItemDefinition_cachedSprites.clear();
         TileItem.ItemDefinition_inMembersWorld = var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("ls")
   public void method5102(ItemComposition var1, ItemComposition var2) {
      this.field2628 = var2.getMembersName();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jz")
   public int method5104() {
      return this.femaleModel * 1641893811;
   }

   public int getYan2d() {
      return this.yan2d * 488243145;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bb")
   public static void method5031(boolean var0) {
      if (var0 != TileItem.ItemDefinition_inMembersWorld) {
         ItemDefinition_cached.clear();
         ItemDefinition_cachedModels.clear();
         ItemDefinition_cachedSprites.clear();
         TileItem.ItemDefinition_inMembersWorld = var0;
      }
   }

   public void setShiftClickActionIndex(int var1) {
      this.field2573 = var1;
   }

   public boolean isTradeable() {
      return this.isMembersOnly;
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("to")
   public void method5101(ItemComposition var1, ItemComposition var2) {
      this.field2628 = var2.getMembersName();
   }

   public int getId() {
      return this.id * -899720027;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bt")
   void method5037(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(95500306);
         if (var2 == 0) {
            return;
         }

         method5040(this, var1, var2, 95160053);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Lgx;)V")
   @ObfuscatedName("cq")
   void method5083(ModelData var1, PlayerCompositionColorTextureOverride var2) {
      if (this.recolorTo != null) {
         short[] var3 = this.recolorTo;
         short[] var4 = this.retextureTo;
         if (var2 != null && var2.playerCompositionRecolorTo != null && this.retextureTo.length == var2.playerCompositionRecolorTo.length) {
            var4 = var2.playerCompositionRecolorTo;
         }

         for (int var5 = 0; var5 < this.recolorTo.length; var5++) {
            var1.recolor(var3[var5], var4[var5]);
         }
      }

      if (null != this.recolorFrom) {
         short[] var6 = this.recolorFrom;
         short[] var7 = this.retextureFrom;
         if (null != var2 && var2.playerCompositionRetextureTo != null && var2.playerCompositionRetextureTo.length == this.retextureFrom.length) {
            var7 = var2.playerCompositionRetextureTo;
         }

         for (int var8 = 0; var8 < this.recolorFrom.length; var8++) {
            ModelData.method6071(var1, var6[var8], var7[var8]);
         }
      }
   }

   public void setYan2d(int var1) {
      this.yan2d = var1 * -2087302535;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bu")
   void method5038(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(836380260);
         if (var2 == 0) {
            return;
         }

         method5040(this, var1, var2, -895438097);
      }
   }

   public String[] getInventoryActions() {
      return this.inventoryActions;
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;I)V")
   @ObfuscatedName("ap")
   void genBought(ItemComposition var1, ItemComposition var2, int var3) {
      try {
         this.model = var1.model * 1;
         this.zoom2d = 1 * var1.zoom2d;
         this.xan2d = 1 * var1.xan2d;
         this.yan2d = var1.yan2d * 1;
         this.zan2d = 1 * var1.zan2d;
         this.offsetX2d = var1.offsetX2d * 1;
         this.offsetY2d = var1.offsetY2d * 1;
         this.recolorTo = var2.recolorTo;
         this.retextureTo = var2.retextureTo;
         this.recolorFrom = var2.recolorFrom;
         this.retextureFrom = var2.retextureFrom;
         this.name = var2.name;
         this.examine = var2.examine;
         this.isTradable = var2.isTradable;
         this.isStackable = var2.isStackable * 1;
         this.maleModel = 1 * var2.maleModel;
         this.maleModel1 = 1 * var2.maleModel1;
         this.maleModel2 = 1 * var2.maleModel2;
         this.femaleModel = 1 * var2.femaleModel;
         this.femaleModel1 = 1 * var2.femaleModel1;
         this.femaleModel2 = var2.femaleModel2 * 1;
         this.maleHeadModel = 1 * var2.maleHeadModel;
         this.maleHeadModel2 = 1 * var2.maleHeadModel2;
         this.femaleHeadModel = 1 * var2.femaleHeadModel;
         this.femaleHeadModel2 = 1 * var2.femaleHeadModel2;
         this.field2586 = var2.field2586 * 1;
         this.field2608 = 1 * var2.field2608;
         this.field2616 = 1 * var2.field2616;
         this.team = 1 * var2.team;
         this.groundActions = var2.groundActions;
         this.field2605 = 1 * var2.field2605;
         this.inventoryActions = new String[5];
         if (var2.inventoryActions != null) {
            for (int var4 = 0; var4 < 4; var4++) {
               if (var3 == -1641492410) {
                  this.method5102(var1, var2);
                  return;
               }

               this.inventoryActions[var4] = var2.inventoryActions[var4];
            }
         }

         this.inventoryActions[4] = Strings.field4993;
         if (var2.subOps != null) {
            this.subOps = new String[5][];
            System.arraycopy(var2.subOps, 0, this.subOps, 0, 4);
         } else {
            this.subOps = (String[][])null;
         }

         this.price = 0;
         this.method5102(var1, var2);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Ljm;")
   @ObfuscatedName("co")
   public final ModelData method5073(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = 1641893811 * this.femaleModel;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = this.femaleModel2 * 900445991;
      if (1 == var1) {
         var3 = this.maleHeadModel * 558128784;
         var4 = this.maleHeadModel2 * 602546534;
         var5 = this.femaleHeadModel * -571365429;
      }

      if (var2 != null && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, -471358931);
      }

      if (var3 == -1) {
         return null;
      } else {
         ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (-1 != var4) {
            ModelData var7 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            if (-1 != var5) {
               ModelData var8 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var5, 0);
               ModelData[] var9 = new ModelData[]{var6, var7, var8};
               var6 = new ModelData(var9, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var6, var7};
               var6 = new ModelData(var10, 2);
            }
         }

         if (var1 == 0 && 0 != 1704546045 * this.femaleOffset) {
            ModelData.method6104(var6, 0, 1704546045 * this.femaleOffset, 0);
         }

         if (1 == var1 && this.field2610 * -500229530 != 0) {
            ModelData.method6104(var6, 0, this.field2610 * 928209920, 0);
         }

         this.method5085(var6, var2, -181769336);
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("cb")
   public final boolean method5068(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleModel * 1641893811;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = 895590847 * this.femaleModel2;
      if (var1 == 1) {
         var3 = this.maleHeadModel * -2048162279;
         var4 = this.maleHeadModel2 * -377476775;
         var5 = -571365429 * this.femaleHeadModel;
      }

      if (null != var2 && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, -667807512);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var6 = false;
         }

         if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var6 = false;
         }

         if (var5 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("bf")
   void method5044(ItemComposition var1, ItemComposition var2) {
      this.model = 1 * var1.model;
      this.zoom2d = var1.zoom2d * 1;
      this.xan2d = var1.xan2d * 1;
      this.yan2d = 1 * var1.yan2d;
      this.zan2d = var1.zan2d * 1;
      this.offsetX2d = 1 * var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d * 1;
      this.recolorTo = var1.recolorTo;
      this.retextureTo = var1.retextureTo;
      this.recolorFrom = var1.recolorFrom;
      this.retextureFrom = var1.retextureFrom;
      this.name = var2.name;
      this.examine = Strings.field4853;
      this.isTradable = var2.isTradable;
      this.price = var2.price * 1;
      this.isStackable = -1378657165;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)I")
   @ObfuscatedName("ld")
   public static int method5021(AnimationSequence var0) {
      return var0.id * 1870316967;
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("bn")
   void method5045(ItemComposition var1, ItemComposition var2) {
      this.model = 1 * var1.model;
      this.zoom2d = var1.zoom2d * 1;
      this.xan2d = var1.xan2d * 1;
      this.yan2d = 1 * var1.yan2d;
      this.zan2d = var1.zan2d * 1;
      this.offsetX2d = 1 * var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d * 1;
      this.recolorTo = var1.recolorTo;
      this.retextureTo = var1.retextureTo;
      this.recolorFrom = var1.recolorFrom;
      this.retextureFrom = var1.retextureFrom;
      this.name = var2.name;
      this.examine = Strings.field4853;
      this.isTradable = var2.isTradable;
      this.price = var2.price * 1;
      this.isStackable = -1378657165;
   }

   public int getAmbient() {
      return this.ambient * 689590731;
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("cx")
   public final boolean method5076(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleHeadModel2 * -433905790;
      int var4 = 1829455097 * this.field2586;
      if (var1 == 1) {
         var3 = 1679363463 * this.field2608;
         var4 = 1119630610 * this.field2616;
      }

      if (var2 != null && var2.method4396(var1, 1918812131)) {
         var3 = var2.method4402(var1, -772032135);
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var5 = false;
         }

         if (-1 != var4 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("bh")
   void method5050(ItemComposition var1, ItemComposition var2) {
      this.model = var1.model * 1;
      this.zoom2d = 1 * var1.zoom2d;
      this.xan2d = 1 * var1.xan2d;
      this.yan2d = var1.yan2d * 1;
      this.zan2d = 1 * var1.zan2d;
      this.offsetX2d = var1.offsetX2d * 1;
      this.offsetY2d = var1.offsetY2d * 1;
      this.recolorTo = var2.recolorTo;
      this.retextureTo = var2.retextureTo;
      this.recolorFrom = var2.recolorFrom;
      this.retextureFrom = var2.retextureFrom;
      this.name = var2.name;
      this.examine = var2.examine;
      this.isTradable = var2.isTradable;
      this.isStackable = var2.isStackable * 1;
      this.maleModel = 1 * var2.maleModel;
      this.maleModel1 = 1 * var2.maleModel1;
      this.maleModel2 = 1 * var2.maleModel2;
      this.femaleModel = 1 * var2.femaleModel;
      this.femaleModel1 = 1 * var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2 * 1;
      this.maleHeadModel = 1 * var2.maleHeadModel;
      this.maleHeadModel2 = 1 * var2.maleHeadModel2;
      this.femaleHeadModel = 1 * var2.femaleHeadModel;
      this.femaleHeadModel2 = 1 * var2.femaleHeadModel2;
      this.field2586 = var2.field2586 * 1;
      this.field2608 = 1 * var2.field2608;
      this.field2616 = 1 * var2.field2616;
      this.team = 1 * var2.team;
      this.groundActions = var2.groundActions;
      this.field2605 = 1 * var2.field2605;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for (int var3 = 0; var3 < 4; var3++) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = Strings.field4993;
      if (var2.subOps != null) {
         this.subOps = new String[5][];
         System.arraycopy(var2.subOps, 0, this.subOps, 0, 4);
      } else {
         this.subOps = (String[][])null;
      }

      this.price = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("bl")
   void method5051(ItemComposition var1, ItemComposition var2) {
      this.model = var1.model * 1;
      this.zoom2d = 1 * var1.zoom2d;
      this.xan2d = 1 * var1.xan2d;
      this.yan2d = var1.yan2d * 1;
      this.zan2d = 1 * var1.zan2d;
      this.offsetX2d = var1.offsetX2d * 1;
      this.offsetY2d = var1.offsetY2d * 1;
      this.recolorTo = var2.recolorTo;
      this.retextureTo = var2.retextureTo;
      this.recolorFrom = var2.recolorFrom;
      this.retextureFrom = var2.retextureFrom;
      this.name = var2.name;
      this.examine = var2.examine;
      this.isTradable = var2.isTradable;
      this.isStackable = var2.isStackable * 1;
      this.maleModel = 1 * var2.maleModel;
      this.maleModel1 = 1 * var2.maleModel1;
      this.maleModel2 = 1 * var2.maleModel2;
      this.femaleModel = 1 * var2.femaleModel;
      this.femaleModel1 = 1 * var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2 * 1;
      this.maleHeadModel = 1 * var2.maleHeadModel;
      this.maleHeadModel2 = 1 * var2.maleHeadModel2;
      this.femaleHeadModel = 1 * var2.femaleHeadModel;
      this.femaleHeadModel2 = 1 * var2.femaleHeadModel2;
      this.field2586 = var2.field2586 * 1;
      this.field2608 = 1 * var2.field2608;
      this.field2616 = 1 * var2.field2616;
      this.team = 1 * var2.team;
      this.groundActions = var2.groundActions;
      this.field2605 = 1 * var2.field2605;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for (int var3 = 0; var3 < 4; var3++) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = Strings.field4993;
      if (var2.subOps != null) {
         this.subOps = new String[5][];
         System.arraycopy(var2.subOps, 0, this.subOps, 0, 4);
      } else {
         this.subOps = (String[][])null;
      }

      this.price = 0;
   }

   public String[][] getSubops() {
      return this.subOps;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;ILgx;)Ljm;")
   @ObfuscatedName("fc")
   public static ModelData method5079(ItemComposition var0, int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = var0.femaleHeadModel2 * -446638299;
      int var4 = var0.field2586 * -375197076;
      if (var1 == 1) {
         var3 = var0.field2608 * 1679363463;
         var4 = -2100955026 * var0.field2616;
      }

      if (null != var2 && var2.method4396(var1, 352967133)) {
         var3 = var2.method4402(var1, 635044336);
      }

      if (-1 == var3) {
         return null;
      } else {
         ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (var4 != -1) {
            ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            ModelData[] var7 = new ModelData[]{var5, var6};
            var5 = new ModelData(var7, 2);
         }

         var0.method5085(var5, var2, -1681227876);
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;Lis;Lis;)V")
   @ObfuscatedName("yv")
   public static void method5046(ItemComposition var0, ItemComposition var1, ItemComposition var2) {
      if (var0 == null) {
         var0.getLinkedNoteId();
      }

      var0.model = 1 * var1.model;
      var0.zoom2d = var1.zoom2d * 1;
      var0.xan2d = var1.xan2d * 1;
      var0.yan2d = 1 * var1.yan2d;
      var0.zan2d = var1.zan2d * 1;
      var0.offsetX2d = 1 * var1.offsetX2d;
      var0.offsetY2d = var1.offsetY2d * 1;
      var0.recolorTo = var1.recolorTo;
      var0.retextureTo = var1.retextureTo;
      var0.recolorFrom = var1.recolorFrom;
      var0.retextureFrom = var1.retextureFrom;
      var0.name = var2.name;
      var0.examine = Strings.field4853;
      var0.isTradable = var2.isTradable;
      var0.price = var2.price * 1;
      var0.isStackable = -1378657165;
   }

   public void setColorToReplace(short[] var1) {
      this.recolorTo = var1;
   }

   public short[] getTextureToReplace() {
      return this.recolorFrom;
   }

   public int getLinkedNoteId() {
      return this.note * 98718905;
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("bv")
   public final Model method5059(int var1) {
      if (this.countobj != null && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
               var2 = this.countobj[var3];
            }
         }

         if (-1 != var2) {
            return class150.ItemDefinition_get(var2, -942156082).getModel(1, -1856176229);
         }
      }

      Model var4 = (Model)class402.method8806(ItemDefinition_cachedModels, -899720027 * this.id);
      if (var4 != null) {
         return var4;
      } else {
         ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model * -1958901995, 0);
         if (null == var6) {
            return null;
         } else {
            if (128 != -816909667 * this.resizeX || 862844559 * this.resizeY != 128 || 128 != this.resizeZ * -2147134923) {
               var6.resize(this.resizeX * -816909667, this.resizeY * 862844559, -2147134923 * this.resizeZ);
            }

            this.method5085(var6, null, -318779661);
            var4 = ModelData.method6106(var6, 689590731 * this.ambient + 64, 768 + this.contrast * 1596591697, -50, -10, -50);
            var4.isSingleTile = true;
            ItemDefinition_cachedModels.put(var4, -899720027 * this.id);
            return var4;
         }
      }
   }

   public String getMembersName() {
      return this.field2628;
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Ljm;")
   @ObfuscatedName("cd")
   public final ModelData method5080(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleHeadModel2 * -446638299;
      int var4 = this.field2586 * 1093155539;
      if (var1 == 1) {
         var3 = this.field2608 * 1679363463;
         var4 = -770060021 * this.field2616;
      }

      if (null != var2 && var2.method4396(var1, -473415159)) {
         var3 = var2.method4402(var1, 428142877);
      }

      if (-1 == var3) {
         return null;
      } else {
         ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (var4 != -1) {
            ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            ModelData[] var7 = new ModelData[]{var5, var6};
            var5 = new ModelData(var7, 2);
         }

         this.method5085(var5, var2, 270976317);
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljm;")
   @ObfuscatedName("bx")
   public final ModelData method5054(int var1) {
      if (null != this.countobj && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.countco[var3] && 0 != this.countco[var3]) {
               var2 = this.countobj[var3];
            }
         }

         if (var2 != -1) {
            return class150.ItemDefinition_get(var2, -1879159873).getModelData(1, (byte)-76);
         }
      }

      ModelData var4 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model * -1958901995, 0);
      if (var4 == null) {
         return null;
      } else {
         if (128 != -816909667 * this.resizeX || 128 != this.resizeY * 862844559 || this.resizeZ * 1975046630 != 1819557859) {
            var4.resize(this.resizeX * -816909667, -518996803 * this.resizeY, 602085052 * this.resizeZ);
         }

         this.method5085(var4, null, -874587311);
         return var4;
      }
   }

   public void setParams(IterableHashTable var1) {
      this.params = (IterableNodeHashTable)var1;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)Lky;")
   @ObfuscatedName("ce")
   public final Model method5062(PlayerCompositionColorTextureOverride var1) {
      Model var2 = var1.field2121;
      if (var2 != null) {
         return var2;
      } else {
         ModelData var3 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var1.field2110 * 2134415799, 0);
         if (null == var3) {
            return null;
         } else {
            if (1679431220 * this.resizeX != 128 || 862844559 * this.resizeY != 128 || 128 != -2147134923 * this.resizeZ) {
               var3.resize(815742404 * this.resizeX, -639664363 * this.resizeY, this.resizeZ * 496564779);
            }

            this.method5085(var3, var1, -980738418);
            var2 = ModelData.method6106(var3, 1492764154 + this.ambient * 689590731, 1596591697 * this.contrast + 585754532, 57298597, -45650646, 1163547422);
            var2.isSingleTile = true;
            var1.field2121 = var2;
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljm;")
   @ObfuscatedName("bq")
   public final ModelData method5055(int var1) {
      if (null != this.countobj && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.countco[var3] && 0 != this.countco[var3]) {
               var2 = this.countobj[var3];
            }
         }

         if (var2 != -1) {
            return class150.ItemDefinition_get(var2, -1269080613).getModelData(1, (byte)-64);
         }
      }

      ModelData var4 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model * -1958901995, 0);
      if (var4 == null) {
         return null;
      } else {
         if (128 != -816909667 * this.resizeX || 128 != this.resizeY * 862844559 || this.resizeZ * -2147134923 != 128) {
            var4.resize(this.resizeX * -816909667, 862844559 * this.resizeY, -2147134923 * this.resizeZ);
         }

         this.method5085(var4, null, -281846433);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;ILgx;)Ljm;")
   @ObfuscatedName("uv")
   public static ModelData method5081(ItemComposition var0, int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = var0.femaleHeadModel2 * -1054140623;
      int var4 = var0.field2586 * -381410035;
      if (var1 == 1) {
         var3 = var0.field2608 * 1679363463;
         var4 = -770060021 * var0.field2616;
      }

      if (null != var2 && var2.method4396(var1, 1478883556)) {
         var3 = var2.method4402(var1, 452127850);
      }

      if (-1 == var3) {
         return null;
      } else {
         ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (var4 != -1) {
            ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            ModelData[] var7 = new ModelData[]{var5, var6};
            var5 = new ModelData(var7, 2);
         }

         var0.method5085(var5, var2, -921123095);
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;)V")
   @ObfuscatedName("hi")
   public static void method5034(ItemComposition var0) {
      if (1 == var0.isStackable * 1515235515) {
         var0.field2605 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("cm")
   public ItemComposition method5064(int var1) {
      if (this.countobj != null && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.countco[var3] && 0 != this.countco[var3]) {
               var2 = this.countobj[var3];
            }
         }

         if (-1 != var2) {
            return class150.ItemDefinition_get(var2, -810250671);
         }
      }

      return this;
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("ck")
   public final boolean method5069(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleModel * 1641893811;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = 895590847 * this.femaleModel2;
      if (var1 == 1) {
         var3 = this.maleHeadModel * -2048162279;
         var4 = this.maleHeadModel2 * -377476775;
         var5 = -571365429 * this.femaleHeadModel;
      }

      if (null != var2 && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, 2020175753);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var6 = false;
         }

         if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var6 = false;
         }

         if (var5 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
            var6 = false;
         }

         return var6;
      }
   }

   public String getName() {
      return this.name;
   }

   public short[] getColorToReplaceWith() {
      return this.retextureTo;
   }

   @ObfuscatedSignature(descriptor = "(Lis;IB)Lis;")
   @ObfuscatedName("yp")
   public static ItemComposition method5065(ItemComposition var0, int var1, byte var2) {
      if (var0 == null) {
         var0.getCountObj(var1, var2);
      }

      try {
         if (var0.countobj != null && var1 > 1) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            int var3 = -1;

            for (int var4 = 0; var4 < 10; var4++) {
               if (var1 >= var0.countco[var4]) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (0 != var0.countco[var4]) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     var3 = var0.countobj[var4];
                  }
               }
            }

            if (-1 != var3) {
               return class150.ItemDefinition_get(var3, -1955925167);
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.ai(" + ')');
      }
   }

   public void setInventoryModel(int var1) {
      this.model = var1 * 598708285;
   }

   public boolean isMembers() {
      return this.isTradable;
   }

   public void setTextureToReplace(short[] var1) {
      this.recolorFrom = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jg")
   public void method5103() {
      this.field2628 = this.getName();
      PostItemComposition var1 = new PostItemComposition(this);
      SecureUrlRequester.client.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("cc")
   public final boolean method5070(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleModel * 1641893811;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = 895590847 * this.femaleModel2;
      if (var1 == 1) {
         var3 = this.maleHeadModel * -2048162279;
         var4 = this.maleHeadModel2 * -377476775;
         var5 = -571365429 * this.femaleHeadModel;
      }

      if (null != var2 && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, 895306808);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var6 = false;
         }

         if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var6 = false;
         }

         if (var5 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("cs")
   public final boolean method5071(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleModel * 1641893811;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = 895590847 * this.femaleModel2;
      if (var1 == 1) {
         var3 = this.maleHeadModel * -2048162279;
         var4 = this.maleHeadModel2 * -377476775;
         var5 = -571365429 * this.femaleHeadModel;
      }

      if (null != var2 && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, -959908332);
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var6 = false;
         }

         if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var6 = false;
         }

         if (var5 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0, 756705879)) {
            var6 = false;
         }

         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Ljm;")
   @ObfuscatedName("cn")
   public final ModelData method5074(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = 1641893811 * this.femaleModel;
      int var4 = 1168834845 * this.femaleModel1;
      int var5 = this.femaleModel2 * -350716580;
      if (1 == var1) {
         var3 = this.maleHeadModel * -2048162279;
         var4 = this.maleHeadModel2 * -377476775;
         var5 = this.femaleHeadModel * -571365429;
      }

      if (var2 != null && PlayerCompositionColorTextureOverride.method4388(var2, var1, (byte)0)) {
         var3 = var2.method4399(var1, -172168343);
      }

      if (var3 == -1) {
         return null;
      } else {
         ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (-1 != var4) {
            ModelData var7 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            if (-1 != var5) {
               ModelData var8 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var5, 0);
               ModelData[] var9 = new ModelData[]{var6, var7, var8};
               var6 = new ModelData(var9, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var6, var7};
               var6 = new ModelData(var10, 2);
            }
         }

         if (var1 == 0 && 0 != 1704546045 * this.femaleOffset) {
            ModelData.method6104(var6, 0, 1704546045 * this.femaleOffset, 0);
         }

         if (1 == var1 && this.field2610 * -1639086632 != 0) {
            ModelData.method6104(var6, 0, this.field2610 * -1997636836, 0);
         }

         this.method5085(var6, var2, -221978452);
         return var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljm;")
   @ObfuscatedName("au")
   public final ModelData getModelData(int var1, byte var2) {
      try {
         if (null != this.countobj) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            if (var1 > 1) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for (int var4 = 0; var4 < 10; var4++) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= this.countco[var4]) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if (0 != this.countco[var4]) {
                        if (var2 == 1) {
                           throw new IllegalStateException();
                        }

                        var3 = this.countobj[var4];
                     }
                  }
               }

               if (var3 != -1) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return class150.ItemDefinition_get(var3, 317439329).getModelData(1, (byte)10);
               }
            }
         }

         ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model * -1958901995, 0);
         if (var6 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            label70: {
               if (128 == -816909667 * this.resizeX) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (128 == this.resizeY * 862844559) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if (this.resizeZ * -2147134923 == 128) {
                        break label70;
                     }
                  }
               }

               var6.resize(this.resizeX * -816909667, 862844559 * this.resizeY, -2147134923 * this.resizeZ);
            }

            this.method5085(var6, null, -1627637978);
            return var6;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Z")
   @ObfuscatedName("cg")
   public final boolean method5077(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleHeadModel2 * -1362924851;
      int var4 = 1093155539 * this.field2586;
      if (var1 == 1) {
         var3 = -1912129797 * this.field2608;
         var4 = -770060021 * this.field2616;
      }

      if (var2 != null && var2.method4396(var1, -330140990)) {
         var3 = var2.method4402(var1, 1317506610);
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0, 756705879)) {
            var5 = false;
         }

         if (-1 != var4 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0, 756705879)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("aq")
   public static ItemComposition method5023(int var0) {
      ItemComposition var1 = (ItemComposition)class402.method8806(ItemDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class138.ItemDefinition_archive.getFile(10, var0, 1194887662);
         var1 = new ItemComposition();
         var1.id = 1969826605 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), -2085703892);
         }

         var1.post(-1044831641);
         if (388376999 * var1.noteTemplate != -1) {
            method5043(
               var1,
               class150.ItemDefinition_get(388376999 * var1.noteTemplate, -887521184),
               class150.ItemDefinition_get(98718905 * var1.note, -1254089570),
               1304377102
            );
         }

         if (var1.notedId * 428085087 != -1) {
            var1.genBought(
               class150.ItemDefinition_get(var1.notedId * 428085087, -1339350197),
               class150.ItemDefinition_get(1181026761 * var1.unnotedId, -1159330548),
               1372305556
            );
         }

         if (-1 != var1.placeholderTemplate * 413316061) {
            var1.genPlaceholder(
               class150.ItemDefinition_get(var1.placeholderTemplate * 413316061, -628559597),
               class150.ItemDefinition_get(var1.placeholder * -1134820861, -1141286635),
               (byte)36
            );
         }

         if (!TileItem.ItemDefinition_inMembersWorld && var1.isTradable) {
            if (-1 == var1.noteTemplate * 388376999 && var1.notedId * 428085087 == -1 && -1 == 413316061 * var1.placeholderTemplate) {
               var1.name = var1.name + Strings.field4851;
            }

            var1.examine = Strings.field5139;
            var1.isMembersOnly = false;

            for (int var3 = 0; var3 < var1.groundActions.length; var3++) {
               var1.groundActions[var3] = null;
            }

            for (int var7 = 0; var7 < var1.inventoryActions.length; var7++) {
               if (4 != var7) {
                  if (null != var1.subOps) {
                     var1.subOps[var7] = null;
                  }

                  var1.inventoryActions[var7] = null;
               }
            }

            var1.shiftClickIndex = 1732434494;
            var1.team = 0;
            if (null != var1.params) {
               boolean var8 = false;

               for (Node var4 = var1.params.first(); null != var4; var4 = var1.params.next()) {
                  ParamComposition var5 = WorldMap.getParamDefinition((int)var4.key, -372799563);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var8 = true;
                  }
               }

               if (!var8) {
                  var1.params = null;
               }
            }
         }

         ItemDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgx;)Ljm;")
   @ObfuscatedName("cz")
   public final ModelData method5082(int var1, PlayerCompositionColorTextureOverride var2) {
      int var3 = this.femaleHeadModel2 * -446638299;
      int var4 = this.field2586 * -31277139;
      if (var1 == 1) {
         var3 = this.field2608 * 1679363463;
         var4 = 1092360973 * this.field2616;
      }

      if (null != var2 && var2.method4396(var1, 19967332)) {
         var3 = var2.method4402(var1, 1520262995);
      }

      if (-1 == var3) {
         return null;
      } else {
         ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
         if (var4 != -1) {
            ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
            ModelData[] var7 = new ModelData[]{var5, var6};
            var5 = new ModelData(var7, 2);
         }

         this.method5085(var5, var2, 66604887);
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("mv")
   public void method5099(ItemComposition var1, ItemComposition var2) {
      this.field2628 = var2.getMembersName();
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;)V")
   @ObfuscatedName("bc")
   void method5053(ItemComposition var1, ItemComposition var2) {
      this.model = 1 * var1.model;
      this.zoom2d = var1.zoom2d * 1;
      this.xan2d = var1.xan2d * 1;
      this.yan2d = 1 * var1.yan2d;
      this.zan2d = 1 * var1.zan2d;
      this.offsetX2d = 1 * var1.offsetX2d;
      this.offsetY2d = 1 * var1.offsetY2d;
      this.recolorTo = var1.recolorTo;
      this.retextureTo = var1.retextureTo;
      this.recolorFrom = var1.recolorFrom;
      this.retextureFrom = var1.retextureFrom;
      this.isStackable = 1 * var1.isStackable;
      this.name = var2.name;
      this.examine = var2.examine;
      this.price = 0;
      this.isTradable = false;
      this.isMembersOnly = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Lgx;)V")
   @ObfuscatedName("cf")
   void method5084(ModelData var1, PlayerCompositionColorTextureOverride var2) {
      if (this.recolorTo != null) {
         short[] var3 = this.recolorTo;
         short[] var4 = this.retextureTo;
         if (var2 != null && var2.playerCompositionRecolorTo != null && this.retextureTo.length == var2.playerCompositionRecolorTo.length) {
            var4 = var2.playerCompositionRecolorTo;
         }

         for (int var5 = 0; var5 < this.recolorTo.length; var5++) {
            var1.recolor(var3[var5], var4[var5]);
         }
      }

      if (null != this.recolorFrom) {
         short[] var6 = this.recolorFrom;
         short[] var7 = this.retextureFrom;
         if (null != var2 && var2.playerCompositionRetextureTo != null && var2.playerCompositionRetextureTo.length == this.retextureFrom.length) {
            var7 = var2.playerCompositionRetextureTo;
         }

         for (int var8 = 0; var8 < this.recolorFrom.length; var8++) {
            ModelData.method6071(var1, var6[var8], var7[var8]);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bi")
   void method5039(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(777999871);
         if (var2 == 0) {
            return;
         }

         method5040(this, var1, var2, 1213068464);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;)Z")
   @ObfuscatedName("up")
   public static boolean method5094(ItemComposition var0) {
      if (var0 == null) {
         var0.getAmbient();
      }

      return var0.retextureFrom != null;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cv")
   public int method5087(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, 90361721);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cw")
   public int method5088(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, -1497112073);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cr")
   public String method5091(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, 87851441);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;Lgx;)Lky;")
   @ObfuscatedName("zi")
   public static Model method5063(ItemComposition var0, PlayerCompositionColorTextureOverride var1) {
      if (var0 == null) {
         var0.getName();
      }

      Model var2 = var1.field2121;
      if (var2 != null) {
         return var2;
      } else {
         ModelData var3 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var1.field2110 * 2134415799, 0);
         if (null == var3) {
            return null;
         } else {
            if (-816909667 * var0.resizeX != 128 || 862844559 * var0.resizeY != 128 || 128 != -2147134923 * var0.resizeZ) {
               var3.resize(-816909667 * var0.resizeX, 862844559 * var0.resizeY, var0.resizeZ * -2147134923);
            }

            var0.method5085(var3, var1, -1266833729);
            var2 = ModelData.method6106(var3, 64 + var0.ambient * 689590731, 1596591697 * var0.contrast + 768, -50, -10, -50);
            var2.isSingleTile = true;
            var1.field2121 = var2;
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Lgx;I)V")
   @ObfuscatedName("ar")
   void method5085(ModelData var1, PlayerCompositionColorTextureOverride var2, int var3) {
      try {
         if (this.recolorTo != null) {
            if (var3 >= 386067468) {
               throw new IllegalStateException();
            }

            short[] var4 = this.recolorTo;
            short[] var5 = this.retextureTo;
            if (var2 != null) {
               if (var3 >= 386067468) {
                  throw new IllegalStateException();
               }

               if (var2.playerCompositionRecolorTo != null && this.retextureTo.length == var2.playerCompositionRecolorTo.length) {
                  var5 = var2.playerCompositionRecolorTo;
               }
            }

            for (int var6 = 0; var6 < this.recolorTo.length; var6++) {
               if (var3 >= 386067468) {
                  throw new IllegalStateException();
               }

               var1.recolor(var4[var6], var5[var6]);
            }
         }

         if (null != this.recolorFrom) {
            short[] var8 = this.recolorFrom;
            short[] var9 = this.retextureFrom;
            if (null != var2) {
               if (var3 >= 386067468) {
                  throw new IllegalStateException();
               }

               if (var2.playerCompositionRetextureTo != null) {
                  if (var3 >= 386067468) {
                     throw new IllegalStateException();
                  }

                  if (var2.playerCompositionRetextureTo.length == this.retextureFrom.length) {
                     var9 = var2.playerCompositionRetextureTo;
                  }
               }
            }

            for (int var10 = 0; var10 < this.recolorFrom.length; var10++) {
               if (var3 >= 386067468) {
                  throw new IllegalStateException();
               }

               ModelData.method6071(var1, var8[var10], var9[var10]);
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "is.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   boolean method5095() {
      return this.retextureFrom != null;
   }

   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFFI)V")
   @ObfuscatedName("ag")
   static void method5026(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      try {
         if (null == var0) {
            if (var9 <= 635776076) {
               throw new IllegalStateException();
            }
         } else {
            float var10 = var4 - var1;
            if (0.0F == var10) {
               if (var9 <= 635776076) {
                  throw new IllegalStateException();
               }
            } else {
               float[] var13;
               boolean var10001;
               label140: {
                  float var11 = var2 - var1;
                  float var12 = var3 - var1;
                  var13 = new float[]{var11 / var10, var12 / var10};
                  if (var13[0] == 0.33333334F) {
                     if (var9 <= 635776076) {
                        throw new IllegalStateException();
                     }

                     if (0.6666667F == var13[1]) {
                        if (var9 <= 635776076) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                        break label140;
                     }
                  }

                  var10001 = false;
               }

               var0.field1884 = var10001;
               float var14 = var13[0];
               float var15 = var13[1];
               if (var13[0] < 0.0F) {
                  if (var9 <= 635776076) {
                     throw new IllegalStateException();
                  }

                  var13[0] = 0.0F;
               }

               if (var13[1] > 1.0F) {
                  if (var9 <= 635776076) {
                     throw new IllegalStateException();
                  }

                  var13[1] = 1.0F;
               }

               label147: {
                  if (!(var13[0] > 1.0F)) {
                     if (var9 <= 635776076) {
                        throw new IllegalStateException();
                     }

                     if (!(var13[1] < -1.0F)) {
                        break label147;
                     }
                  }

                  var13[1] = 1.0F - var13[1];
                  if (var13[0] < 0.0F) {
                     if (var9 <= 635776076) {
                        throw new IllegalStateException();
                     }

                     var13[0] = 0.0F;
                  }

                  if (var13[1] < 0.0F) {
                     var13[1] = 0.0F;
                  }

                  label122: {
                     if (!(var13[0] > 1.0F)) {
                        if (!(var13[1] > 1.0F)) {
                           break label122;
                        }

                        if (var9 <= 635776076) {
                           throw new IllegalStateException();
                        }
                     }

                     float var16 = (var13[0] - 2.0F + var13[1]) * var13[0] + (var13[1] - 2.0F) * var13[1] + 1.0F;
                     if (var16 + classFH.field1780 > 0.0F) {
                        if (var9 <= 635776076) {
                           throw new IllegalStateException();
                        }

                        InterfaceParent.method3002(var13, 788950813);
                     }
                  }

                  var13[1] = 1.0F - var13[1];
               }

               if (var13[0] != var14) {
                  if (var9 <= 635776076) {
                     throw new IllegalStateException();
                  }

                  var2 = var1 + var13[0] * var10;
                  if (var14 != 0.0F) {
                     if (var9 <= 635776076) {
                        throw new IllegalStateException();
                     }

                     var6 = var5 + var13[0] * (var6 - var5) / var14;
                  }
               }

               if (var15 != var13[1]) {
                  if (var9 <= 635776076) {
                     throw new IllegalStateException();
                  }

                  var3 = var10 * var13[1] + var1;
                  if (var15 != 1.0F) {
                     if (var9 <= 635776076) {
                        throw new IllegalStateException();
                     }

                     var7 = var8 - (1.0F - var13[1]) * (var8 - var7) / (1.0F - var15);
                  }
               }

               var0.field1872 = var1;
               var0.field1877 = var4;
               class142.method4015(0.0F, var13[0], var13[1], 1.0F, var0, 1961066754);
               float var23 = var6 - var5;
               float var17 = var7 - var6;
               float var18 = var8 - var7;
               float var19 = var17 - var23;
               var0.field1868 = var18 - var17 - var19;
               var0.field1875 = var19 + var19 + var19;
               var0.field1871 = var23 + var23 + var23;
               var0.field1869 = var5;
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "is.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ob")
   public int method5105() {
      return this.isStackable * 1515235515;
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Ljava/lang/String;")
   @ObfuscatedName("oh")
   static String Widget_getSpellActionName(Widget var0, int var1) {
      try {
         if (LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var0, (byte)75), 539897526) == 0) {
            if (var1 <= 1566212559) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (null != var0.spellActionName) {
               if (!var0.spellActionName.trim().isEmpty()) {
                  return var0.spellActionName;
               }

               if (var1 <= 1566212559) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "is.oh(" + ')');
      }
   }

   public void setColorToReplaceWith(short[] var1) {
      this.retextureTo = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ak")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 >= 1581859920) {
               return;
            }

            this.shiftClickIndex = Buffer.method12008(var1, (byte)5) * 598708285;
         } else if (var2 == 2) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.examine = var1.readCESU8(255089102);
         } else if (var2 == 3) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.name = var1.readStringCp1252NullTerminatedOrNull(685591829);
         } else if (4 == var2) {
            this.note = Buffer.method12008(var1, (byte)5) * -1079528239;
         } else if (5 == var2) {
            this.price = Buffer.method12008(var1, (byte)5) * -413868397;
         } else if (var2 == 6) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.placeholder = Buffer.method12008(var1, (byte)5) * -2087302535;
         } else if (var2 == 7) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.price = Buffer.method12008(var1, (byte)5) * 1527585741;
            if (this.maleModel2 * 68503813 > 32767) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.placeholderTemplate -= 466419712;
            }
         } else if (var2 == 8) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.ambient = Buffer.method12008(var1, (byte)5) * 1390692297;
            if (-680099207 * this.ambient > 32767) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.zan2d = this.offsetY2d - 1204355072;
            }
         } else if (var2 == 9) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            var1.readStringCp1252NullTerminatedOrNull(-801091888);
         } else if (var2 == 11) {
            this.ambient = -1378657165;
         } else if (12 == var2) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.maleModel = Buffer.method12015(var1, -485685131) * -1102440507;
         } else if (13 == var2) {
            if (var3 >= 1581859920) {
               return;
            }

            this.maleModel1 = var1.method12075(1754443779) * -198893679;
         } else if (14 == var2) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.noteTemplate = var1.readLargeSmart(-973132616) * 951328463;
         } else if (var2 == 16) {
            if (var3 >= 1581859920) {
               return;
            }

            this.isMembersOnly = true;
         } else if (var2 == 23) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.femaleOffset = Buffer.method12008(var1, (byte)5) * 933754747;
            this.femaleModel2 = var1.readUnsignedByteAdd(1656691733) * -852640171;
         } else if (var2 == 24) {
            if (var3 >= 1581859920) {
               return;
            }

            this.femaleHeadModel2 = Buffer.method12008(var1, (byte)5) * -1035089611;
         } else if (var2 == 25) {
            if (var3 >= 1581859920) {
               throw new IllegalStateException();
            }

            this.field2586 = Buffer.method12008(var1, (byte)5) * -398952919;
            this.field2610 = var1.readUnsignedByteAdd(-1003001608) * -1465111827;
         } else if (var2 == 26) {
            this.maleHeadModel = Buffer.method12008(var1, (byte)5) * -698118423;
         } else if (var2 == 27) {
            this.isStackable = var1.method12100(-449997539) * -457382005;
         } else {
            if (var2 >= 30) {
               if (var3 >= 1581859920) {
                  return;
               }

               if (var2 < 35) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  this.inventoryActions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-210515860);
                  if (this.groundActions[var2 - 30].equalsIgnoreCase(Strings.field5036)) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     this.inventoryActions[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 >= 35 && var2 < 40) {
               this.groundActions[var2 - 35] = var1.readCESU8(1660152007);
            } else if (40 == var2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               int var4 = var1.readVarInt(-1336221042);
               this.recolorFrom = new short[var4];
               this.recolorFrom = new short[var4];

               for (int var5 = 0; var5 < var4; var5++) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.recolorFrom[var5] = (short)Buffer.method12008(var1, (byte)5);
                  this.recolorFrom[var5] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (var2 == 41) {
               int var9 = var1.method12181(1436829623);
               this.recolorTo = new short[var9];
               this.recolorTo = new short[var9];

               for (int var11 = 0; var11 < var9; var11++) {
                  this.retextureFrom[var11] = (short)Buffer.method12008(var1, (byte)5);
                  this.recolorFrom[var11] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (var2 == 42) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.femaleHeadModel = Buffer.method12001(var1, (byte)78) * 1281266401;
            } else if (43 == var2) {
               int var10 = var1.readUnsignedByte(-407553628);
               if (this.subOps == null) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.subOps = new String[5][];
               }

               boolean var10000;
               if (var10 >= 0 && var10 < 5) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var12 = var10000;
               if (var12) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  if (this.subOps[var10] == null) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     this.subOps[var10] = new String[20];
                  }
               }

               while (true) {
                  int var6 = var1.readShortSmart(-191786459) - 1;
                  if (var6 == -1) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  String var7 = var1.readStringCp1252NullCircumfixed(1046438241);
                  if (var12 && var6 >= 0) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     if (var6 < 20) {
                        if (var3 >= 1581859920) {
                           return;
                        }

                        this.subOps[var10][var6] = var7;
                     }
                  }
               }
            } else if (var2 == 65) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.isTradable = true;
            } else if (75 == var2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.zan2d = var1.readShort((byte)-38) * 12783863;
            } else if (var2 == 78) {
               this.shiftClickIndex = Buffer.method12008(var1, (byte)5) * 1016024639;
            } else if (var2 == 79) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.femaleOffset = Buffer.method12008(var1, (byte)5) * 2024523235;
            } else if (var2 == 90) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.resizeX = Buffer.method12008(var1, (byte)5) * 657419437;
            } else if (91 == var2) {
               if (var3 >= 1581859920) {
                  return;
               }

               this.resizeX = Buffer.method12008(var1, (byte)5) * 263661623;
            } else if (var2 == 92) {
               this.resizeZ = Buffer.method12008(var1, (byte)5) * -122409637;
            } else if (93 == var2) {
               this.maleHeadModel2 = Buffer.method12008(var1, (byte)5) * -1660194141;
            } else if (94 == var2) {
               Buffer.method12008(var1, (byte)5);
            } else if (95 == var2) {
               if (var3 >= 1581859920) {
                  throw new IllegalStateException();
               }

               this.zan2d = Buffer.method12008(var1, (byte)5) * -224532549;
            } else if (var2 == 97) {
               if (var3 >= 1581859920) {
                  return;
               }

               this.zoom2d = Buffer.method12008(var1, (byte)5) * 248738185;
            } else if (var2 == 98) {
               if (var3 >= 1581859920) {
                  return;
               }

               this.team = Buffer.method12008(var1, (byte)5) * -511709673;
            } else {
               if (var2 >= 100) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  if (var2 < 110) {
                     if (var3 >= 1581859920) {
                        throw new IllegalStateException();
                     }

                     if (null == this.countco) {
                        if (var3 >= 1581859920) {
                           throw new IllegalStateException();
                        }

                        this.countco = new int[10];
                        this.countobj = new int[10];
                     }

                     this.countobj[var2 - 100] = Buffer.method12008(var1, (byte)5);
                     this.countobj[var2 - 100] = Buffer.method12008(var1, (byte)5);
                     return;
                  }
               }

               if (110 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.field2586 = Buffer.method12008(var1, (byte)5) * -182508619;
               } else if (111 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.resizeX = Buffer.method12008(var1, (byte)5) * 1515743343;
               } else if (112 == var2) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  this.field2586 = Buffer.method12008(var1, (byte)5) * -2088439779;
               } else if (113 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.zoom2d = Buffer.method12001(var1, (byte)21) * -1262924829;
               } else if (114 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.field2573 = Buffer.method12001(var1, (byte)127) * 405398901;
               } else if (var2 == 115) {
                  this.offsetX2d = var1.method12100(-291985462) * -1275373933;
               } else if (var2 == 139) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.femaleModel = Buffer.method12008(var1, (byte)5) * -1954848647;
               } else if (var2 == 140) {
                  this.field2616 = Buffer.method12008(var1, (byte)5) * 184421535;
               } else if (148 == var2) {
                  if (var3 >= 1581859920) {
                     throw new IllegalStateException();
                  }

                  this.contrast = Buffer.method12008(var1, (byte)5) * 459159723;
               } else if (var2 == 149) {
                  if (var3 >= 1581859920) {
                     return;
                  }

                  this.offsetY2d = Buffer.method12008(var1, (byte)5) * 531381365;
               } else if (var2 == 249) {
                  this.params = class406.readStringIntParameters(var1, this.params, (byte)-4);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "is.ak(" + ')');
      }
   }

   public int getNote() {
      return this.noteTemplate * 388376999;
   }

   @ObfuscatedSignature(descriptor = "(Lis;Lis;I)V")
   @ObfuscatedName("aw")
   void genCert(ItemComposition var1, ItemComposition var2, int var3) {
      try {
         this.maleHeadModel = 1 * var1.resizeX;
         this.zoom2d = var1.placeholderTemplate * 1;
         this.zoom2d = var1.zoom2d * 1;
         this.placeholder = 1 * var1.contrast;
         this.maleModel1 = var1.note * 1;
         this.zoom2d = 1 * var1.team;
         this.yan2d = var1.maleModel * 1;
         this.recolorFrom = var1.recolorTo;
         this.retextureTo = var1.retextureFrom;
         this.retextureTo = var1.retextureTo;
         this.retextureFrom = var1.retextureFrom;
         this.examine = var2.examine;
         this.examine = Strings.field4898;
         this.isTradable = var2.isTradable;
         this.placeholderTemplate = var2.zoom2d * 1;
         this.team = -1378657165;
         this.method5099(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.aw(" + ')');
      }
   }

   public int getHaPrice() {
      int var1 = this.getPrice();
      return (int)(var1 * 0.6F);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ah")
   public int getIntParam(int var1, int var2, int var3) {
      try {
         return class108.method3858(this.params, var1, var2, -843209527);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "is.ah(" + 41);
      }
   }

   public short[] getColorToReplace() {
      return this.recolorTo;
   }

   public boolean isStackable() {
      return this.method5105() != 0;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lis;")
   @ObfuscatedName("ai")
   public ItemComposition getCountObj(int var1, byte var2) {
      try {
         if (this.countco != null && var1 > 1) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            int var3 = -1;

            for (int var4 = 0; var4 < 10; var4++) {
               if (var1 >= this.countobj[var4]) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (0 != this.countco[var4]) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     var3 = this.countobj[var4];
                  }
               }
            }

            if (-1 != var3) {
               return class150.ItemDefinition_get(var3, -1955925167);
            }
         }

         return this;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "is.ai(" + ')');
      }
   }
}
