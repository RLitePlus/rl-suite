import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dt")
final class class85 implements classOR {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1485 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field1484 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;II)V")
   @ObfuscatedName("bc")
   public static void method3475(WorldMap var0, int var1, int var2) {
      if (var0.mainMapArea != null) {
         WorldMap.method11396(
            var0, var1 - var0.mainMapArea.getRegionLowX(-1057143413) * 64, var2 - WorldMapArea.method6961(var0.mainMapArea, (byte)-7) * 64, true, -1372849234
         );
         var0.field6238 = -1482342113;
         var0.minCachedTileX = -2104342031;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod158(byte var1) {
      try {
         if (this.val$item.method8164((byte)-111).field4683 != null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            ScriptEvent var2 = new ScriptEvent();
            var2.method1410(this.val$item, (short)5200);
            var2.setArgs(this.val$item.method8164((byte)-17).field4683, -2009834778);
            HttpQueryParams.method11268(1345180108).addFirst(var2);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dt.av(" + ')');
      }
   }

   class85(Widget var1) {
      this.val$item = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   @Override
   public void vmethod159() {
      if (this.val$item.method8164((byte)-37).field4683 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method1410(this.val$item, (short)5200);
         var1.setArgs(this.val$item.method8164((byte)-79).field4683, 1804604497);
         HttpQueryParams.method11268(530353228).addFirst(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod157() {
      if (this.val$item.method8164((byte)-95).field4683 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method1410(this.val$item, (short)5200);
         var1.setArgs(this.val$item.method8164((byte)-43).field4683, -820980105);
         HttpQueryParams.method11268(1995854205).addFirst(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;II)V")
   @ObfuscatedName("iy")
   static final void updateActorSequence(WorldView var0, Actor var1, int var2, int var3) {
      Actor.method2831(var0, var1, var2);

      try {
         if (-1 != var1.targetIndex * -998106409) {
            if (var3 >= -92078254) {
               throw new IllegalStateException();
            }

            Object var4 = null;
            Object var5 = null;
            int var6 = 65536;
            if (var1.targetIndex * -998106409 < var6) {
               if (var3 >= -92078254) {
                  Actor.method2827(var0, var1, var2);
                  return;
               }

               int var8 = -998106409 * var1.targetIndex;
               WorldViewManager var9 = client.worldViewManager;

               WorldView var7;
               label325: {
                  for (WorldView var11 : var9) {
                     if (var3 >= -92078254) {
                        Actor.method2827(var0, var1, var2);
                        return;
                     }

                     if (var11.players.get(var8) != null) {
                        var7 = var11;
                        break label325;
                     }
                  }

                  var7 = var9.method2905((byte)-81);
               }

               var4 = var7;
               var5 = (Actor)var7.players.get(var1.targetIndex * -998106409);
            } else {
               int var19 = var1.targetIndex * -998106409 - var6;
               var4 = classLI.method7182(var19, client.worldViewManager, (byte)3);
               var5 = (Actor)((WorldView)var4).npcs.get(var19);
            }

            if (null != var5) {
               if (var3 >= -92078254) {
                  Actor.method2827(var0, var1, var2);
                  return;
               }

               ProjectionCoord var20 = FaceNormal.method6214(var1.x * 340712311, 0.0F, var1.y * -1747310679, 1059475789);
               ProjectionCoord var22;
               if (var0.id * 577964535 != ((WorldView)var4).id * 577964535) {
                  if (var3 >= -92078254) {
                     throw new IllegalStateException();
                  }

                  if (var0.id * 577964535 == -1) {
                     if (var3 >= -92078254) {
                        throw new IllegalStateException();
                     }

                     WorldEntity var24 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(((WorldView)var4).id * 577964535));
                     var22 = var24.getProjectionCoord(((Actor)var5).x * 340712311, -1747310679 * ((Actor)var5).y, 1681741960);
                  } else if (577964535 * ((WorldView)var4).id == -1) {
                     if (var3 >= -92078254) {
                        Actor.method2827(var0, var1, var2);
                        return;
                     }

                     WorldEntity var25 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(var0.id * 577964535));
                     var22 = var25.method10885(((Actor)var5).x * 340712311, ((Actor)var5).y * -1747310679, 1074005120);
                  } else {
                     WorldEntity var26 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(577964535 * ((WorldView)var4).id));
                     WorldEntity var28 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(var0.id * 577964535));
                     ProjectionCoord var30 = var26.getProjectionCoord(340712311 * ((Actor)var5).x, -1747310679 * ((Actor)var5).y, 1661896456);
                     var22 = var28.method10885((int)var30.x, (int)var30.y, 1074005120);
                     var30.release(-804947546);
                  }
               } else {
                  var22 = FaceNormal.method6214(340712311 * ((Actor)var5).x, 0.0F, ((Actor)var5).y * -1747310679, 562524015);
               }

               label304: {
                  int var27 = (int)(var20.x - var22.x);
                  int var29 = (int)(var20.y - var22.y);
                  if (0 == var27) {
                     if (var3 >= -92078254) {
                        throw new IllegalStateException();
                     }

                     if (var29 == 0) {
                        break label304;
                     }

                     if (var3 >= -92078254) {
                        throw new IllegalStateException();
                     }
                  }

                  var1.orientation = class101.method3396(var27, var29, (byte)-41) * -731948309;
               }

               var20.release(-804947546);
               var22.release(-804947546);
            } else if (var1.false0) {
               if (var3 >= -92078254) {
                  throw new IllegalStateException();
               }

               var1.targetIndex = 92047129;
               var1.method2838(-1);
               var1.false0 = false;
            }
         }

         if (var1.pathLength * -1921456255 == 0 || var1.field1145 * 888202597 > 0) {
            int var14 = -1;
            if (var1.field1123 * -335130577 != -1) {
               if (var3 >= -92078254) {
                  throw new IllegalStateException();
               }

               var14 = -335130577 * var1.field1123;
            }

            if (-1 != var14) {
               var1.orientation = var14 * -731948309;
               if (var1.field1185) {
                  if (var3 >= -92078254) {
                     throw new IllegalStateException();
                  }

                  var1.rotation = 1559750685 * var1.orientation;
               }
            }

            var1.method2804(-172768829);
         }

         int var15 = -1817477693 * var1.orientation - 1777129311 * var1.rotation & 2047;
         if (var15 != 0) {
            if (var3 >= -92078254) {
               throw new IllegalStateException();
            }

            byte var17 = -1;
            boolean var18 = true;
            var1.field1130 += -2089084389;
            byte var10000;
            if (var15 > 1024) {
               if (var3 >= -92078254) {
                  Actor.method2827(var0, var1, var2);
                  return;
               }

               var10000 = -1;
            } else {
               var10000 = 1;
            }

            byte var21;
            boolean var23;
            label346: {
               var21 = var10000;
               var1.rotation = var1.rotation + -1511045985 * var21 * 662711013 * var1.field1158;
               var23 = true;
               if (var15 >= 662711013 * var1.field1158) {
                  if (var3 >= -92078254) {
                     Actor.method2827(var0, var1, var2);
                     return;
                  }

                  if (var15 <= 2048 - var1.field1158 * 662711013) {
                     break label346;
                  }

                  if (var3 >= -92078254) {
                     Actor.method2827(var0, var1, var2);
                     return;
                  }
               }

               var1.rotation = 1559750685 * var1.orientation;
               var23 = false;
            }

            label279:
            if (var1.field1158 * 662711013 > 0 && Actor.method2743(var1, 1356161355) == 1683244579 * var1.idleSequence) {
               if (-1972883437 * var1.field1130 <= 25) {
                  if (var3 >= -92078254) {
                     throw new IllegalStateException();
                  }

                  if (!var23) {
                     break label279;
                  }

                  if (var3 >= -92078254) {
                     Actor.method2827(var0, var1, var2);
                     return;
                  }
               }

               if (var21 == -1) {
                  if (var3 >= -92078254) {
                     Actor.method2827(var0, var1, var2);
                     return;
                  }

                  if (-1 != -1787008585 * var1.turnLeftSequence) {
                     var1.method2747(-1787008585 * var1.turnLeftSequence, 633565955);
                     break label279;
                  }
               }

               if (var21 == 1) {
                  if (var3 >= -92078254) {
                     throw new IllegalStateException();
                  }

                  if (-878052923 * var1.turnRightSequence != -1) {
                     if (var3 >= -92078254) {
                        throw new IllegalStateException();
                     }

                     var1.method2747(-878052923 * var1.turnRightSequence, 1252480495);
                     break label279;
                  }
               }

               var1.method2747(-1691426581 * var1.walkSequence, 1630159220);
            }

            var1.rotation = -1511045985 * (var1.rotation * 1777129311 & 2047);
         } else {
            if (var1.false0) {
               if (var3 >= -92078254) {
                  Actor.method2827(var0, var1, var2);
                  return;
               }

               var1.targetIndex = 92047129;
               var1.method2838(-1);
               var1.false0 = false;
            }

            var1.field1130 = 0;
         }

         class134.method4024(var0, var1, 1878721480);
         Actor.method2827(var0, var1, var2);
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "dt.iy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lpw;")
   @ObfuscatedName("ae")
   public static WorldEntityOwnerType[] method3474(int var0) {
      try {
         return new WorldEntityOwnerType[]{WorldEntityOwnerType.field5256, WorldEntityOwnerType.field5257, WorldEntityOwnerType.field5258};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "dt.ae(" + ')');
      }
   }
}
