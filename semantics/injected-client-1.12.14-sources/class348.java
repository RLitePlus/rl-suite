import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nh")
class class348 implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4291 = 17;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("an")
   public static AbstractArchive field4292;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field4290 = 13;

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("av")
   static final int method7747(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var2 * var0 + var3 * var1 >> 16;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nh.av(" + 41);
      }
   }

   class348(MidiPcmStream var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method7748(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method7749(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIII)V")
   @ObfuscatedName("lc")
   static final void updateItemPile2(WorldView var0, int var1, int var2, int var3, int var4) {
      try {
         NodeDeque var5 = var0.groundItems[var1][var2][var3];
         if (var5 == null) {
            var0.scene.removeGroundItemPile(var1, var2, var3);
            client.method2526(var0, var1, var2, var3);
         } else {
            long var6 = -99999999L;
            TileItem var8 = null;

            for (TileItem var9 = (TileItem)var5.last(); null != var9; var9 = (TileItem)var5.previous()) {
               ItemComposition var10 = class150.ItemDefinition_get(var9.visibleTime * 782226465, -376476874);
               long var11 = 1824214797 * var10.price;
               if (1 == var10.isStackable * 1515235515) {
                  if (var4 >= -1676850655) {
                     client.method2526(var0, var1, var2, var3);
                     return;
                  }

                  long var10001;
                  if (-1247866467 * var9.despawnTime < Integer.MAX_VALUE) {
                     if (var4 >= -1676850655) {
                        client.method2526(var0, var1, var2, var3);
                        return;
                     }

                     var10001 = 1 + -1247866467 * var9.despawnTime;
                  } else {
                     var10001 = var9.despawnTime * -1247866467;
                  }

                  var11 *= var10001;
               }

               if (var11 > var6) {
                  if (var4 >= -1676850655) {
                     throw new IllegalStateException();
                  }

                  var6 = var11;
                  var8 = var9;
               }
            }

            if (var8 != null) {
               var5.addLast((Node)var8);
               TileItem var17 = null;
               TileItem var18 = null;

               for (TileItem var16 = (TileItem)var5.last(); null != var16; var16 = (TileItem)var5.previous()) {
                  if (var4 >= -1676850655) {
                     throw new IllegalStateException();
                  }

                  if (var16.visibleTime * 782226465 != 782226465 * var8.visibleTime) {
                     if (var4 >= -1676850655) {
                        throw new IllegalStateException();
                     }

                     if (null == var17) {
                        if (var4 >= -1676850655) {
                           throw new IllegalStateException();
                        }

                        var17 = var16;
                     }

                     if (var16.visibleTime * 782226465 != var17.visibleTime * 782226465) {
                        if (var4 >= -1676850655) {
                           throw new IllegalStateException();
                        }

                        if (var18 == null) {
                           var18 = var16;
                        }
                     }
                  }
               }

               ProjectionCoord var12 = WorldMapSectionType.method7179(var0, var2, var3, var1, 124586281);
               var8.method3047(var12, (byte)76);
               if (var17 != null) {
                  if (var4 >= -1676850655) {
                     throw new IllegalStateException();
                  }

                  var17.method3047(var12, (byte)80);
               }

               if (var18 != null) {
                  if (var4 >= -1676850655) {
                     throw new IllegalStateException();
                  }

                  var18.method3047(var12, (byte)103);
               }

               long var13 = class236.calculateTag(var1, var2, var3, 3, false, 0, 577964535 * var0.id, -1329739818);
               var0.scene
                  .newGroundItemPile(
                     var1,
                     var2,
                     var3,
                     NPCComposition.getTileHeight(var0, Coord.method8306(var2, 248986601), Coord.method8306(var3, 248986601), var1, -253070517),
                     var8,
                     var13,
                     var17,
                     var18
                  );
               client.method2526(var0, var1, var2, var3);
            } else if (var4 >= -1676850655) {
               throw new IllegalStateException();
            } else {
               var0.scene.removeGroundItemPile(var1, var2, var3);
               client.method2526(var0, var1, var2, var3);
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "nh.lc(" + ')');
      }
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS WAV Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nh.newThread(" + ')');
      }
   }
}
