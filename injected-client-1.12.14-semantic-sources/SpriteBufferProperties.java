import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aw")
public class SpriteBufferProperties {
   @ObfuscatedName("an")
   Future field92;
   @ObfuscatedName("og")
   static int[][] xteaKeys;
   @ObfuscatedName("ag")
   ExecutorService field86 = Executors.newSingleThreadExecutor();
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field87 = 5000;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("av")
   final Buffer field84;
   @ObfuscatedSignature(descriptor = "Lan;")
   @ObfuscatedName("at")
   final classAN field85;
   @ObfuscatedName("pe")
   static int field90;
   @ToRemove(unused = "true")
   @ObfuscatedName("dh")
   static final String field91 = "JX_CHARACTER_ID";
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field88 = 26;
   @ObfuscatedName("lq")
   static int cameraX;

   @ObfuscatedSignature(descriptor = "(Ldd;I)V")
   @ObfuscatedName("lp")
   static final void method298(WorldView var0, int var1) {
      try {
         for (PendingSpawn var2 = (PendingSpawn)var0.pendingSpawns.last(); null != var2; var2 = (PendingSpawn)var0.pendingSpawns.previous()) {
            if (var1 <= -822826545) {
               return;
            }

            if (var2.hitpoints * 517473543 > 0) {
               if (var1 <= -822826545) {
                  throw new IllegalStateException();
               }

               var2.hitpoints -= 316037303;
            }

            if (0 == 517473543 * var2.hitpoints) {
               if (var1 <= -822826545) {
                  throw new IllegalStateException();
               }

               if (847037549 * var2.objectId >= 0) {
                  if (var1 <= -822826545) {
                     throw new IllegalStateException();
                  }

                  if (!classSY.method10525(var2.objectId * 847037549, var2.field1245 * -123256363, (byte)0)) {
                     continue;
                  }

                  if (var1 <= -822826545) {
                     throw new IllegalStateException();
                  }
               }

               class150.addPendingSpawnToScene(
                  var0,
                  var2.plane * 1465889165,
                  var2.type * 1527879103,
                  var2.x * 1691331269,
                  -7912037 * var2.y,
                  var2.objectId * 847037549,
                  var2.field1239 * -1747226177,
                  var2.field1245 * -123256363,
                  var2.field1247 * -1226895039,
                  -1704342885
               );
               var2.remove();
            } else {
               if (var2.delay * 524219655 > 0) {
                  if (var1 <= -822826545) {
                     throw new IllegalStateException();
                  }

                  var2.delay -= 753690807;
               }

               if (524219655 * var2.delay == 0) {
                  if (var1 <= -822826545) {
                     throw new IllegalStateException();
                  }

                  if (1691331269 * var2.x >= 1) {
                     if (var1 <= -822826545) {
                        return;
                     }

                     if (var2.y * -7912037 >= 1) {
                        if (var1 <= -822826545) {
                           return;
                        }

                        if (1691331269 * var2.x <= 102) {
                           if (var1 <= -822826545) {
                              return;
                           }

                           if (-7912037 * var2.y <= 102) {
                              if (var2.objectId2 * -1096388433 >= 0) {
                                 if (var1 <= -822826545) {
                                    throw new IllegalStateException();
                                 }

                                 if (!classSY.method10525(-1096388433 * var2.objectId2, var2.field1243 * 1575345691, (byte)0)) {
                                    continue;
                                 }

                                 if (var1 <= -822826545) {
                                    throw new IllegalStateException();
                                 }
                              }

                              class150.addPendingSpawnToScene(
                                 var0,
                                 var2.plane * 1465889165,
                                 var2.type * 1527879103,
                                 var2.x * 1691331269,
                                 -7912037 * var2.y,
                                 var2.objectId2 * -1096388433,
                                 var2.field1246 * -912982729,
                                 1575345691 * var2.field1243,
                                 -1226895039 * var2.field1247,
                                 85499519
                              );
                              var2.delay = -753690807;
                              if (var2.objectId2 * -1096388433 == var2.objectId * 847037549) {
                                 if (var1 <= -822826545) {
                                    throw new IllegalStateException();
                                 }

                                 if (var2.objectId * 847037549 == -1) {
                                    if (var1 <= -822826545) {
                                       return;
                                    }

                                    var2.remove();
                                    continue;
                                 }
                              }

                              if (847037549 * var2.objectId == var2.objectId2 * -1096388433) {
                                 if (var1 <= -822826545) {
                                    throw new IllegalStateException();
                                 }

                                 if (var2.field1239 * -1747226177 == var2.field1246 * -912982729) {
                                    if (var1 <= -822826545) {
                                       return;
                                    }

                                    if (-123256363 * var2.field1245 == var2.field1243 * 1575345691) {
                                       if (var1 <= -822826545) {
                                          throw new IllegalStateException();
                                       }

                                       var2.remove();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aw.lp(" + ')');
      }
   }

   public SpriteBufferProperties(Buffer var1, classAN var2) {
      this.field84 = var1;
      this.field85 = var2;
      this.method293(817077716);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method288(int var1) {
      try {
         this.field86.shutdown();
         this.field86 = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method289() {
      this.field86.shutdown();
      this.field86 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void method293(int var1) {
      try {
         this.field92 = this.field86.submit(new class1(this, this.field84, this.field85));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aw.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method290() {
      this.field86.shutdown();
      this.field86 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method286(int var1) {
      try {
         return this.field92.isDone();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxa;")
   @ObfuscatedName("ag")
   public Buffer method291(int var1) {
      try {
         try {
            return (Buffer)this.field92.get();
         } catch (Exception var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "aw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("ap")
   public Buffer method292() {
      try {
         return (Buffer)this.field92.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method294() {
      this.field92 = this.field86.submit(new class1(this, this.field84, this.field85));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   void method295() {
      this.field92 = this.field86.submit(new class1(this, this.field84, this.field85));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method296() {
      this.field92 = this.field86.submit(new class1(this, this.field84, this.field85));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method297() {
      this.field92 = this.field86.submit(new class1(this, this.field84, this.field85));
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("nz")
   static void method299(int var0, int var1, int var2) {
      try {
         classFY.method4187(WorldMapSection2.tempMenuAction, var0, var1, 1143496681);
         WorldMapSection2.tempMenuAction = null;
         client.method2372(-1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "aw.nz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   public boolean method287() {
      return this.field92.isDone();
   }
}
