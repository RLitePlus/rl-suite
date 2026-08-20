import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eq")
public class class107 extends Node {
   @ObfuscatedSignature(descriptor = "Ldo;")
   @ObfuscatedName("av")
   class101 field1632;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1633 = 3;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("dz")
   static IndexedSprite[] worldSelectFlagSprites;

   class107(VorbisSample var1) {
      if (var1 != null) {
         this.field1632 = new class101(var1, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ldq;")
   @ObfuscatedName("at")
   public RawSound method3819(int var1) {
      try {
         if (this.field1632 != null) {
            if (var1 >= -1248013015) {
               throw new IllegalStateException();
            }

            if (this.field1632.field1452.tryLock()) {
               if (var1 >= -1248013015) {
                  throw new IllegalStateException();
               }

               RawSound var2;
               try {
                  var2 = this.method3829(-226875568);
               } finally {
                  this.field1632.field1452.unlock();
               }

               return var2;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "eq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method3816(int var1) {
      try {
         return this.field1632 == null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "eq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("aw")
   public RawSound method3820() {
      if (this.field1632 != null && this.field1632.field1452.tryLock()) {
         RawSound var1;
         try {
            var1 = this.method3829(1210208446);
         } finally {
            this.field1632.field1452.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Leq;S)Ldq;")
   @ObfuscatedName("hg")
   public static RawSound method3822(class107 var0, short var1) {
      if (var0 == null) {
         var0.method3825(var1);
      }

      try {
         if (var0.field1632 != null) {
            var0.field1632.field1452.lock();

            RawSound var2;
            try {
               var2 = var0.method3829(-142184698);
            } finally {
               var0.field1632.field1452.unlock();
            }

            return var2;
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "eq.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leq;)Ldq;")
   @ObfuscatedName("cz")
   public static RawSound method3826(class107 var0) {
      if (null == var0.field1632.field1451) {
         var0.field1632.field1451 = VorbisSample.method3854(var0.field1632.field1453, null);
         var0.field1632.field1453 = null;
      }

      return var0.field1632.field1451;
   }

   public class107() {
      this.field1632 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leq;)Ldq;")
   @ObfuscatedName("is")
   public static RawSound method3827(class107 var0) {
      if (null == var0.field1632.field1451) {
         var0.field1632.field1451 = VorbisSample.method3854(var0.field1632.field1453, null);
         var0.field1632.field1453 = null;
      }

      return var0.field1632.field1451;
   }

   public class107(RawSound var1) {
      this.field1632 = new class101(null, var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method3817() {
      return this.field1632 == null;
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("ak")
   public RawSound method3821() {
      if (this.field1632 != null && this.field1632.field1452.tryLock()) {
         RawSound var1;
         try {
            var1 = this.method3829(-522338919);
         } finally {
            this.field1632.field1452.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("ap")
   public RawSound method3823() {
      if (this.field1632 != null) {
         this.field1632.field1452.lock();

         RawSound var1;
         try {
            var1 = this.method3829(2029656559);
         } finally {
            this.field1632.field1452.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("ay")
   public RawSound method3824() {
      if (this.field1632 != null) {
         this.field1632.field1452.lock();

         RawSound var1;
         try {
            var1 = this.method3829(891580961);
         } finally {
            this.field1632.field1452.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("au")
   RawSound method3828() {
      if (null == this.field1632.field1451) {
         this.field1632.field1451 = VorbisSample.method3854(this.field1632.field1453, null);
         this.field1632.field1453 = null;
      }

      return this.field1632.field1451;
   }

   @ObfuscatedSignature(descriptor = "(I)Ldq;")
   @ObfuscatedName("an")
   RawSound method3829(int var1) {
      try {
         if (null == this.field1632.field1451) {
            if (var1 <= -652154314) {
               throw new IllegalStateException();
            }

            this.field1632.field1451 = VorbisSample.method3854(this.field1632.field1453, null);
            this.field1632.field1453 = null;
         }

         return this.field1632.field1451;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "eq.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/io/File;I)V")
   @ObfuscatedName("av")
   static void method3815(File var0, int var1) {
      try {
         FileSystem.FileSystem_cacheDir = var0;
         if (!FileSystem.FileSystem_cacheDir.exists()) {
            if (var1 == 499759561) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            FileSystem.FileSystem_hasPermissions = true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "eq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZI)I")
   @ObfuscatedName("ak")
   static int compareWorlds(World var0, World var1, int var2, boolean var3, int var4) {
      try {
         if (var2 == 1) {
            if (var4 <= 965338282) {
               throw new IllegalStateException();
            } else {
               int var5 = var0.properties * 2054822665;
               int var6 = 2054822665 * var1.properties;
               if (!var3) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  if (-1 == var5) {
                     var5 = 2001;
                  }

                  if (-1 == var6) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var6 = 2001;
                  }
               }

               return var5 - var6;
            }
         } else if (2 == var2) {
            if (var4 <= 965338282) {
               throw new IllegalStateException();
            } else {
               return var0.index * -428025341 - -428025341 * var1.index;
            }
         } else if (var2 == 3) {
            if (var0.activity.equals("-")) {
               if (var4 <= 965338282) {
                  throw new IllegalStateException();
               } else if (var1.activity.equals("-")) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  } else {
                     return 0;
                  }
               } else {
                  byte var12;
                  if (var3) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var12 = -1;
                  } else {
                     var12 = 1;
                  }

                  return var12;
               }
            } else if (var1.activity.equals("-")) {
               if (var4 <= 965338282) {
                  throw new IllegalStateException();
               } else {
                  byte var11;
                  if (var3) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var11 = 1;
                  } else {
                     var11 = -1;
                  }

                  return var11;
               }
            } else {
               return var0.activity.compareTo(var1.activity);
            }
         } else if (4 == var2) {
            byte var10;
            if (var0.method899(1849323913)) {
               if (var4 <= 965338282) {
                  throw new IllegalStateException();
               }

               if (var1.method899(1767855514)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  var10 = 0;
               } else {
                  var10 = 1;
               }
            } else if (var1.method899(2039183204)) {
               if (var4 <= 965338282) {
                  throw new IllegalStateException();
               }

               var10 = -1;
            } else {
               var10 = 0;
            }

            return var10;
         } else if (var2 == 5) {
            if (var4 <= 965338282) {
               throw new IllegalStateException();
            } else {
               byte var9;
               if (var0.method894(-351408165)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  if (var1.method894(715577153)) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var9 = 0;
                  } else {
                     var9 = 1;
                  }
               } else if (var1.method894(-307440404)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  var9 = -1;
               } else {
                  var9 = 0;
               }

               return var9;
            }
         } else if (var2 == 6) {
            if (var4 <= 965338282) {
               throw new IllegalStateException();
            } else {
               byte var8;
               if (var0.isPvp(1889493156)) {
                  if (var1.isPvp(1598897841)) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var8 = 0;
                  } else {
                     var8 = 1;
                  }
               } else if (var1.isPvp(889020901)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  var8 = -1;
               } else {
                  var8 = 0;
               }

               return var8;
            }
         } else if (7 == var2) {
            if (var4 <= 965338282) {
               throw new IllegalStateException();
            } else {
               byte var10000;
               if (var0.isMembersOnly(-1663419126)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  if (var1.isMembersOnly(-537491334)) {
                     if (var4 <= 965338282) {
                        throw new IllegalStateException();
                     }

                     var10000 = 0;
                  } else {
                     var10000 = 1;
                  }
               } else if (var1.isMembersOnly(-518806545)) {
                  if (var4 <= 965338282) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 0;
               }

               return var10000;
            }
         } else {
            return 789563243 * var0.population - 789563243 * var1.population;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "eq.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   public boolean method3818() {
      return this.field1632 == null;
   }

   @ObfuscatedSignature(descriptor = "(S)Ldq;")
   @ObfuscatedName("ag")
   public RawSound method3825(short var1) {
      try {
         if (this.field1632 != null) {
            this.field1632.field1452.lock();

            RawSound var2;
            try {
               var2 = this.method3829(-142184698);
            } finally {
               this.field1632.field1452.unlock();
            }

            return var2;
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "eq.ag(" + ')');
      }
   }
}
