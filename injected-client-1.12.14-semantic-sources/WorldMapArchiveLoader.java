import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vv")
public class WorldMapArchiveLoader {
   @ObfuscatedName("ak")
   int percentLoaded = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6314 = 0;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("pj")
   static IndexedSprite[] scrollBarSprites;
   @ObfuscatedName("ae")
   String cacheName;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aj")
   AbstractArchive archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6313 = 33;
   @ObfuscatedName("aw")
   boolean loaded = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6315 = 100;

   WorldMapArchiveLoader(AbstractArchive var1) {
      this.archive = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method11635() {
      return 1654350401 * this.percentLoaded;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   int load(int var1) {
      try {
         if (null == this.cacheName) {
            if (var1 >= -769581854) {
               throw new IllegalStateException();
            }

            this.percentLoaded = 1425530724;
            this.loaded = true;
         } else {
            if (1654350401 * this.percentLoaded < 33) {
               if (var1 >= -769581854) {
                  throw new IllegalStateException();
               }

               if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3837.name, this.cacheName, -29860978)) {
                  if (var1 >= -769581854) {
                     throw new IllegalStateException();
                  }

                  return this.percentLoaded * 1654350401;
               }

               this.percentLoaded = 1458267617;
            }

            if (1654350401 * this.percentLoaded == 33) {
               if (this.archive.isValidFileName(WorldMapCacheName.field3838.name, this.cacheName, -1571498542)) {
                  if (var1 >= -769581854) {
                     throw new IllegalStateException();
                  }

                  if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3838.name, this.cacheName, -1493374851)) {
                     if (var1 >= -769581854) {
                        throw new IllegalStateException();
                     }

                     return 1654350401 * this.percentLoaded;
                  }
               }

               this.percentLoaded = -1378432062;
            }

            if (1654350401 * this.percentLoaded == 66) {
               if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3836.name, -53435775)) {
                  if (var1 >= -769581854) {
                     throw new IllegalStateException();
                  }

                  return this.percentLoaded * 1654350401;
               }

               this.percentLoaded = 1425530724;
               this.loaded = true;
            }
         }

         return 1654350401 * this.percentLoaded;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vv.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   boolean isLoaded(int var1) {
      try {
         return this.loaded;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   int getPercentLoaded(byte var1) {
      try {
         return 1654350401 * this.percentLoaded;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vv.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ae")
   void method11627(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.cacheName) {
            this.cacheName = var1;
            this.percentLoaded = 0;
            this.loaded = false;
            this.load(-1358322752);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aj")
   void method11628(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.cacheName) {
            this.cacheName = var1;
            this.percentLoaded = 0;
            this.loaded = false;
            this.load(-1807280586);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("av")
   void reset(String var1, int var2) {
      try {
         if (var1 != null) {
            if (var2 != -1506087453) {
               return;
            }

            if (!var1.isEmpty()) {
               if (var1 == this.cacheName) {
                  return;
               }

               this.cacheName = var1;
               this.percentLoaded = 0;
               this.loaded = false;
               this.load(-810735163);
               return;
            }

            if (var2 != -1506087453) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aw")
   void method11630(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.cacheName) {
            this.cacheName = var1;
            this.percentLoaded = 0;
            this.loaded = false;
            this.load(-1632032413);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method11633() {
      if (null == this.cacheName) {
         this.percentLoaded = 1425530724;
         this.loaded = true;
      } else {
         if (1654350401 * this.percentLoaded < 33) {
            if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3837.name, this.cacheName, -1370948692)) {
               return this.percentLoaded * 1654350401;
            }

            this.percentLoaded = 1458267617;
         }

         if (1654350401 * this.percentLoaded == 33) {
            if (this.archive.isValidFileName(WorldMapCacheName.field3838.name, this.cacheName, -2099223550)
               && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3838.name, this.cacheName, -1148248965)) {
               return 1654350401 * this.percentLoaded;
            }

            this.percentLoaded = -1378432062;
         }

         if (1654350401 * this.percentLoaded == 66) {
            if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3836.name, -318965026)) {
               return this.percentLoaded * 1654350401;
            }

            this.percentLoaded = 1425530724;
            this.loaded = true;
         }
      }

      return 1654350401 * this.percentLoaded;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ak")
   void method11631(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.cacheName) {
            this.cacheName = var1;
            this.percentLoaded = 0;
            this.loaded = false;
            this.load(-1678304579);
         }
      }
   }
}
