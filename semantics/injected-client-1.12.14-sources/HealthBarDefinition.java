import net.runelite.api.events.PostHealthBarConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hj")
public class HealthBarDefinition extends DualNode implements net.runelite.api.HealthBarConfig {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("aj")
   public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2239 = 30;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2240 = 70;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ae")
   public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ag")
   public static AbstractArchive HealthBarDefinition_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field2237 = 20;
   @ObfuscatedName("aw")
   public int int1 = 1024984501;
   @ObfuscatedName("ap")
   public int int2 = 583013309;
   @ObfuscatedName("ay")
   public int int3 = -334013137;
   @ObfuscatedName("au")
   public int field2226 = 275585499;
   @ObfuscatedName("az")
   public int int5 = -1876808038;
   @ObfuscatedName("ad")
   int frontSpriteID;
   @ObfuscatedName("ai")
   int backSpriteID = -575432375;
   @ObfuscatedName("as")
   public int width;
   @ObfuscatedName("ac")
   public int widthPadding;
   @ObfuscatedName("ak")
   public int field2238;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cf")
   static IndexedSprite field2243;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field2241 = 61;

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aw")
   void method4575(Buffer var1, int var2) {
      if (1 == var2) {
         Buffer.method12008(var1, (byte)5);
      } else if (2 == var2) {
         this.int1 = var1.readUnsignedByte(-811295828) * -265468597;
      } else if (3 == var2) {
         this.int2 = var1.readUnsignedByte(-478973020) * 1282355011;
      } else if (var2 == 4) {
         this.int3 = 0;
      } else if (5 == var2) {
         this.int5 = Buffer.method12008(var1, (byte)5) * -456308273;
      } else if (6 == var2) {
         var1.readUnsignedByte(2000236126);
      } else if (var2 == 7) {
         this.backSpriteID = var1.readNullableLargeSmart(-1792539611) * 575432375;
      } else if (var2 == 8) {
         this.frontSpriteID = var1.readNullableLargeSmart(-781348494) * 1676880915;
      } else if (11 == var2) {
         this.int3 = Buffer.method12008(var1, (byte)5) * 334013137;
      } else if (14 == var2) {
         this.width = var1.readUnsignedByte(-280466988) * -84746469;
      } else if (15 == var2) {
         this.widthPadding = var1.readUnsignedByte(-1593339990) * -1196160415;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("at")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 <= -233411669) {
               return;
            }

            Buffer.method12008(var1, (byte)5);
         } else if (2 == var2) {
            if (var3 <= -233411669) {
               throw new IllegalStateException();
            }

            this.int1 = var1.readUnsignedByte(-1566244065) * -265468597;
         } else if (3 == var2) {
            if (var3 <= -233411669) {
               throw new IllegalStateException();
            }

            this.int2 = var1.readUnsignedByte(944998158) * 1282355011;
         } else if (var2 == 4) {
            this.int3 = 0;
         } else if (5 == var2) {
            if (var3 <= -233411669) {
               return;
            }

            this.int5 = Buffer.method12008(var1, (byte)5) * -456308273;
         } else if (6 == var2) {
            if (var3 <= -233411669) {
               throw new IllegalStateException();
            }

            var1.readUnsignedByte(367483005);
         } else if (var2 == 7) {
            this.backSpriteID = var1.readNullableLargeSmart(-1691009100) * 575432375;
         } else if (var2 == 8) {
            if (var3 <= -233411669) {
               throw new IllegalStateException();
            }

            this.frontSpriteID = var1.readNullableLargeSmart(-229156402) * 1676880915;
         } else if (11 == var2) {
            if (var3 <= -233411669) {
               throw new IllegalStateException();
            }

            this.int3 = Buffer.method12008(var1, (byte)5) * 334013137;
         } else if (14 == var2) {
            if (var3 <= -233411669) {
               return;
            }

            this.width = var1.readUnsignedByte(-249832700) * -84746469;
         } else if (15 == var2) {
            this.widthPadding = var1.readUnsignedByte(204779849) * -1196160415;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hj.at(" + ')');
      }
   }

   public HealthBarDefinition() {
      this.frontSpriteID = -1676880915;
      this.width = 1752573226;
      this.widthPadding = 0;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("jh")
   public SpritePixels method4591() {
      return this.getFrontSprite(-1226768215);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("az")
   public void method4590(Buffer var1) {
      PostHealthBarConfig var2 = new PostHealthBarConfig();
      var2.setHealthBarConfig(this);
      SecureUrlRequester.client.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("ag")
   public SpritePixels getFrontSprite(int var1) {
      try {
         if (this.backSpriteID * 101144327 < 0) {
            if (var1 == -1747310679) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, 101144327 * this.backSpriteID);
            if (null != var2) {
               return var2;
            } else {
               var2 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.backSpriteID * 101144327, 0, -2139672119);
               if (null != var2) {
                  if (var1 == -1747310679) {
                     throw new IllegalStateException();
                  }

                  HealthBarDefinition_cachedSprites.put(var2, 101144327 * this.backSpriteID);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method4592() {
      return this.width * 1815503635;
   }

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("an")
   public SpritePixels getBackSprite(byte var1) {
      try {
         if (this.frontSpriteID * 114523675 < 0) {
            if (var1 >= 24) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, this.frontSpriteID * 114523675);
            if (var2 != null) {
               if (var1 >= 24) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.frontSpriteID * 114523675, 0, -2139672119);
               if (null != var2) {
                  if (var1 >= 24) {
                     throw new IllegalStateException();
                  }

                  HealthBarDefinition_cachedSprites.put(var2, this.frontSpriteID * 114523675);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hj.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("lq")
   public SpritePixels method4593() {
      return this.getBackSprite((byte)-23);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   public void method4571(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1856667658);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 2146266416);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ap")
   void method4577(Buffer var1, int var2) {
      if (1 == var2) {
         Buffer.method12008(var1, (byte)5);
      } else if (2 == var2) {
         this.int1 = var1.readUnsignedByte(-1292759484) * -265468597;
      } else if (3 == var2) {
         this.int2 = var1.readUnsignedByte(199084572) * 1906400643;
      } else if (var2 == 4) {
         this.int3 = 0;
      } else if (5 == var2) {
         this.int5 = Buffer.method12008(var1, (byte)5) * 223005470;
      } else if (6 == var2) {
         var1.readUnsignedByte(-1238184067);
      } else if (var2 == 7) {
         this.backSpriteID = var1.readNullableLargeSmart(-59071118) * 575432375;
      } else if (var2 == 8) {
         this.frontSpriteID = var1.readNullableLargeSmart(-1015287826) * 283700290;
      } else if (11 == var2) {
         this.int3 = Buffer.method12008(var1, (byte)5) * 334013137;
      } else if (14 == var2) {
         this.width = var1.readUnsignedByte(1688751813) * -84746469;
      } else if (15 == var2) {
         this.widthPadding = var1.readUnsignedByte(-1523147745) * -1196160415;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ak")
   public void method4572(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-889060774);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 1203670863);
      }
   }

   public void setPadding(int var1) {
      this.widthPadding = var1 * -1196160415;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   public void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-222620745);
            if (0 == var3) {
               if (var2 >= 1127338736) {
                  throw new IllegalStateException();
               }

               this.method4590(var1);
               return;
            }

            this.decodeNext(var1, var3, 1574037665);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aj")
   public void method4574(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1548463593);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 652029601);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("ay")
   public SpritePixels method4579() {
      if (this.backSpriteID * 101144327 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, 101144327 * this.backSpriteID);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.backSpriteID * 101144327, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, 101144327 * this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("au")
   public SpritePixels method4580() {
      if (this.backSpriteID * 101144327 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, -725559912 * this.backSpriteID);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.backSpriteID * -1143104022, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, 101144327 * this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhj;)Lxt;")
   @ObfuscatedName("ss")
   public static SpritePixels method4581(HealthBarDefinition var0) {
      if (var0.backSpriteID * -2036863987 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, 101144327 * var0.backSpriteID);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, var0.backSpriteID * 101144327, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, -1840455950 * var0.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("az")
   public SpritePixels method4582() {
      if (this.backSpriteID * 101144327 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, 101144327 * this.backSpriteID);
         if (null != var1) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.backSpriteID * 101144327, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, 101144327 * this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("as")
   public SpritePixels method4584() {
      if (this.frontSpriteID * 114523675 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, this.frontSpriteID * 114523675);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.frontSpriteID * 114523675, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, this.frontSpriteID * 114523675);
            }

            return var1;
         }
      }
   }

   public int getHealthBarFrontSpriteId() {
      return this.backSpriteID * 101144327;
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("ai")
   public SpritePixels method4585() {
      if (this.frontSpriteID * 114523675 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, this.frontSpriteID * 114523675);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.frontSpriteID * 114523675, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, this.frontSpriteID * 114523675);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("ac")
   public SpritePixels method4586() {
      if (this.frontSpriteID * 114523675 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)class402.method8806(HealthBarDefinition_cachedSprites, this.frontSpriteID * 114523675);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class387.SpriteBuffer_getSprite(UserComparator1.field6484, this.frontSpriteID * 114523675, 0, -2139672119);
            if (null != var1) {
               HealthBarDefinition_cachedSprites.put(var1, this.frontSpriteID * 114523675);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("aw")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         Scene var6 = Occluder.topLevelWorldView.scene;
         long var7 = Scene.method5731(var6, var0, var1, var2);
         if (var7 != 0L) {
            if (var5 <= 432940563) {
               throw new IllegalStateException();
            }

            int var9 = var6.method5784(var0, var1, var2, var7);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = var3;
            if (WorldMapLabelSize.method7220(var7)) {
               var12 = var4;
            }

            int[] var13 = class437.sceneMinimapSprite.pixels;
            int var14 = 24624 + var1 * 4 + (103 - var2) * 2048;
            int var15 = HorizontalAlignment.Entity_unpackID(var7);
            ObjectComposition var16 = AsyncHttpResponse.getObjectDefinition(var15, 2118162612);
            if (-1 != 93759001 * var16.mapSceneId) {
               if (var5 <= 432940563) {
                  throw new IllegalStateException();
               }

               IndexedSprite var17 = class499.mapSceneSprites[var16.mapSceneId * 93759001];
               if (var17 != null) {
                  int var18 = (-1336500124 * var16.sizeX - var17.subWidth) / 2;
                  int var19 = (-1410019452 * var16.sizeY - var17.subHeight) / 2;
                  var17.drawAt(48 + var1 * 4 + var18, 48 + 4 * (104 - var2 - var16.sizeY * -352504863) + var19);
               }
            } else {
               label220: {
                  if (var11 != 0) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     if (2 != var11) {
                        break label220;
                     }
                  }

                  if (var10 == 0) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     var13[var14] = var12;
                     var13[var14 + 512] = var12;
                     var13[var14 + 1024] = var12;
                     var13[1536 + var14] = var12;
                  } else if (1 == var10) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     var13[var14] = var12;
                     var13[var14 + 1] = var12;
                     var13[var14 + 2] = var12;
                     var13[3 + var14] = var12;
                  } else if (var10 == 2) {
                     if (var5 <= 432940563) {
                        return;
                     }

                     var13[var14 + 3] = var12;
                     var13[512 + 3 + var14] = var12;
                     var13[1024 + 3 + var14] = var12;
                     var13[1536 + 3 + var14] = var12;
                  } else if (var10 == 3) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     var13[var14 + 1536] = var12;
                     var13[var14 + 1536 + 1] = var12;
                     var13[var14 + 1536 + 2] = var12;
                     var13[var14 + 1536 + 3] = var12;
                  }
               }

               if (3 == var11) {
                  if (var5 <= 432940563) {
                     throw new IllegalStateException();
                  }

                  if (0 == var10) {
                     var13[var14] = var12;
                  } else if (var10 == 1) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     var13[3 + var14] = var12;
                  } else if (2 == var10) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     var13[1536 + 3 + var14] = var12;
                  } else if (3 == var10) {
                     if (var5 <= 432940563) {
                        return;
                     }

                     var13[var14 + 1536] = var12;
                  }
               }

               if (2 == var11) {
                  if (var5 <= 432940563) {
                     throw new IllegalStateException();
                  }

                  if (3 == var10) {
                     var13[var14] = var12;
                     var13[var14 + 512] = var12;
                     var13[var14 + 1024] = var12;
                     var13[var14 + 1536] = var12;
                  } else if (var10 == 0) {
                     var13[var14] = var12;
                     var13[1 + var14] = var12;
                     var13[2 + var14] = var12;
                     var13[3 + var14] = var12;
                  } else if (var10 == 1) {
                     var13[3 + var14] = var12;
                     var13[3 + var14 + 512] = var12;
                     var13[1024 + 3 + var14] = var12;
                     var13[3 + var14 + 1536] = var12;
                  } else if (2 == var10) {
                     var13[1536 + var14] = var12;
                     var13[1536 + var14 + 1] = var12;
                     var13[var14 + 1536 + 2] = var12;
                     var13[var14 + 1536 + 3] = var12;
                  }
               }
            }
         }

         var7 = var6.getWallDecorationTag(var0, var1, var2);
         if (0L != var7) {
            if (var5 <= 432940563) {
               throw new IllegalStateException();
            }

            int var23 = var6.method5784(var0, var1, var2, var7);
            int var25 = var23 >> 6 & 3;
            int var27 = var23 & 31;
            int var29 = HorizontalAlignment.Entity_unpackID(var7);
            ObjectComposition var31 = AsyncHttpResponse.getObjectDefinition(var29, 2079295960);
            if (var31.mapSceneId * 93759001 != -1) {
               if (var5 <= 432940563) {
                  throw new IllegalStateException();
               }

               IndexedSprite var33 = class499.mapSceneSprites[93759001 * var31.mapSceneId];
               if (null != var33) {
                  int var35 = (var31.sizeX * -1336500124 - var33.subWidth) / 2;
                  int var37 = (-1410019452 * var31.sizeY - var33.subHeight) / 2;
                  var33.drawAt(var35 + 4 * var1 + 48, var37 + 48 + (104 - var2 - -352504863 * var31.sizeY) * 4);
               }
            } else {
               label211:
               if (9 == var27) {
                  if (var5 <= 432940563) {
                     throw new IllegalStateException();
                  }

                  int var34 = 15658734;
                  if (WorldMapLabelSize.method7220(var7)) {
                     var34 = 15597568;
                  }

                  int[] var36 = class437.sceneMinimapSprite.pixels;
                  int var38 = 4 * var1 + 24624 + (103 - var2) * 2048;
                  if (var25 != 0) {
                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }

                     if (var25 != 2) {
                        var36[var38] = var34;
                        var36[1 + var38 + 512] = var34;
                        var36[2 + 1024 + var38] = var34;
                        var36[3 + 1536 + var38] = var34;
                        break label211;
                     }

                     if (var5 <= 432940563) {
                        throw new IllegalStateException();
                     }
                  }

                  var36[1536 + var38] = var34;
                  var36[var38 + 1024 + 1] = var34;
                  var36[2 + var38 + 512] = var34;
                  var36[var38 + 3] = var34;
               }
            }
         }

         var7 = var6.getBoundaryObjectTag(var0, var1, var2);
         if (0L != var7) {
            int var24 = HorizontalAlignment.Entity_unpackID(var7);
            ObjectComposition var26 = AsyncHttpResponse.getObjectDefinition(var24, 2012654320);
            if (93759001 * var26.mapSceneId != -1) {
               if (var5 <= 432940563) {
                  throw new IllegalStateException();
               }

               IndexedSprite var28 = class499.mapSceneSprites[var26.mapSceneId * 93759001];
               if (null != var28) {
                  if (var5 <= 432940563) {
                     throw new IllegalStateException();
                  }

                  int var30 = (-1336500124 * var26.sizeX - var28.subWidth) / 2;
                  int var32 = (-1410019452 * var26.sizeY - var28.subHeight) / 2;
                  var28.drawAt(48 + 4 * var1 + var30, var32 + 48 + (104 - var2 - var26.sizeY * -352504863) * 4);
               }
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "hj.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("iq")
   static final void method4588(short var0) {
      try {
         if (DefaultsGroup.field6076) {
            for (WorldView var2 : client.worldViewManager) {
               for (int var3 = 0; var3 < 1320060371 * client.playerUpdateManager.field1538; var3++) {
                  Player var4 = (Player)Occluder.topLevelWorldView.npcs.get(client.playerUpdateManager.playerIndices[var3]);
                  if (null != var4) {
                     if (var0 == 128) {
                        throw new IllegalStateException();
                     }

                     var4.updateIsInClanChat(-1309903654);
                  }
               }
            }

            DefaultsGroup.field6076 = false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hj.iq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("mw")
   static void resumePauseWidget(int var0, int var1, int var2) {
      try {
         PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3930, client.packetWriter.isaacCipher, -1775254307);
         var3.packetBuffer.writeShortLE(var1, 1813047000);
         Buffer.method12187(var3.packetBuffer, var0, -861307390);
         PacketWriter.method3330(client.packetWriter, var3, -1771370198);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hj.mw(" + ')');
      }
   }
}
