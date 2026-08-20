import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ub")
public class classUB implements Runnable {
   @ObfuscatedName("as")
   int field6281;
   @ObfuscatedName("af")
   InputStream field6279;
   @ObfuscatedName("az")
   Thread field6278;
   @ObfuscatedName("ab")
   byte[] field6277;
   @ObfuscatedName("ag")
   int field6280 = 0;
   @ObfuscatedName("ae")
   int field6276;
   @ObfuscatedName("ax")
   IOException field6283;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field6282 = 2048;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method11257() {
      synchronized (this) {
         if (null == this.field6283) {
            this.field6283 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field6278.join();
      } catch (InterruptedException var3) {
      }
   }

   @Override
   public void run() {
      try {
         while (true) {
            int var1;
            synchronized (this) {
               while (true) {
                  if (null != this.field6283) {
                     return;
                  }

                  if (0 == 1764480657 * this.field6280) {
                     var1 = this.field6276 * -593120253 - 1284385685 * this.field6281 - 1;
                  } else if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
                     var1 = this.field6276 * -593120253 - 1284385685 * this.field6281;
                  } else {
                     var1 = this.field6280 * 1764480657 - this.field6281 * 1284385685 - 1;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var9) {
                  }
               }
            }

            int var2;
            try {
               var2 = this.field6279.read(this.field6277, this.field6281 * 1284385685, var1);
               if (var2 == -1) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized (this) {
                  this.field6283 = var3;
                  return;
               }
            }

            synchronized (this) {
               this.field6281 = (1284385685 * this.field6281 + var2) % (this.field6276 * -593120253) * 1480968125;
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "ub.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ab")
   boolean method11244(int var1, int var2) throws IOException {
      try {
         if (var1 == 0) {
            if (var2 >= 446505856) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 > 0) {
               if (var2 >= 446505856) {
                  throw new IllegalStateException();
               }

               if (var1 < -593120253 * this.field6276) {
                  synchronized (this) {
                     int var4;
                     if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
                        if (var2 >= 446505856) {
                           throw new IllegalStateException();
                        }

                        var4 = 1284385685 * this.field6281 - 1764480657 * this.field6280;
                     } else {
                        var4 = -593120253 * this.field6276 - 1764480657 * this.field6280 + this.field6281 * 1284385685;
                     }

                     if (var4 < var1) {
                        if (var2 >= 446505856) {
                           throw new IllegalStateException();
                        }

                        if (this.field6283 != null) {
                           if (var2 >= 446505856) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.field6283.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if (var2 >= 446505856) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ub.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ag")
   int method11246(short var1) throws IOException {
      try {
         synchronized (this) {
            int var3;
            if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
               if (var1 >= 153) {
                  throw new IllegalStateException();
               }

               var3 = 1284385685 * this.field6281 - this.field6280 * 1764480657;
            } else {
               var3 = this.field6276 * -593120253 - 1764480657 * this.field6280 + this.field6281 * 1284385685;
            }

            if (var3 <= 0) {
               if (var1 >= 153) {
                  throw new IllegalStateException();
               }

               if (null != this.field6283) {
                  throw new IOException(this.field6283.toString());
               }
            }

            this.notifyAll();
            return var3;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "ub.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("as")
   int method11249(short var1) throws IOException {
      try {
         synchronized (this) {
            if (1284385685 * this.field6281 == this.field6280 * 1764480657) {
               if (var1 != 252) {
                  throw new IllegalStateException();
               } else if (null != this.field6283) {
                  if (var1 != 252) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException(this.field6283.toString());
                  }
               } else {
                  return -1;
               }
            } else {
               int var3 = this.field6277[1764480657 * this.field6280] & 255;
               this.field6280 = (1 + 1764480657 * this.field6280) % (-593120253 * this.field6276) * 2106239601;
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "ub.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)I")
   @ObfuscatedName("ax")
   int method11253(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 == 0) {
               throw new IllegalStateException();
            }

            if (var2 >= 0) {
               if (var3 + var2 <= var1.length) {
                  synchronized (this) {
                     int var6;
                     if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
                        if (var4 == 0) {
                           throw new IllegalStateException();
                        }

                        var6 = 1284385685 * this.field6281 - 1764480657 * this.field6280;
                     } else {
                        var6 = -593120253 * this.field6276 - 1764480657 * this.field6280 + 1284385685 * this.field6281;
                     }

                     if (var3 > var6) {
                        if (var4 == 0) {
                           throw new IllegalStateException();
                        }

                        var3 = var6;
                     }

                     if (var3 == 0 && null != this.field6283) {
                        if (var4 == 0) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.field6283.toString());
                     }

                     if (var3 + 1764480657 * this.field6280 <= -593120253 * this.field6276) {
                        if (var4 == 0) {
                           throw new IllegalStateException();
                        }

                        System.arraycopy(this.field6277, 1764480657 * this.field6280, var1, var2, var3);
                     } else {
                        int var7 = this.field6276 * -593120253 - 1764480657 * this.field6280;
                        System.arraycopy(this.field6277, this.field6280 * 1764480657, var1, var2, var7);
                        System.arraycopy(this.field6277, 0, var1, var7 + var2, var3 - var7);
                     }

                     this.field6280 = 2106239601 * ((1764480657 * this.field6280 + var3) % (-593120253 * this.field6276));
                     this.notifyAll();
                     return var3;
                  }
               }

               if (var4 == 0) {
                  throw new IllegalStateException();
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "ub.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method11241() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (null != this.field6283) {
                  return;
               }

               if (0 == 1764480657 * this.field6280) {
                  var1 = this.field6276 * 1570463866 - -1982251652 * this.field6281 - 1;
               } else if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
                  var1 = this.field6276 * -593120253 - -1347495268 * this.field6281;
               } else {
                  var1 = this.field6280 * 1764480657 - this.field6281 * -1613010788 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.field6279.read(this.field6277, this.field6281 * 1471194558, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.field6283 = var3;
               return;
            }
         }

         synchronized (this) {
            this.field6281 = (2060761038 * this.field6281 + var2) % (this.field6276 * -593120253) * 599018609;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lub;)V")
   @ObfuscatedName("bo")
   public static void method11258(classUB var0) {
      if (var0 == null) {
         var0.method11257();
      }

      synchronized (var0) {
         if (null == var0.field6283) {
            var0.field6283 = new IOException("");
         }

         var0.notifyAll();
      }

      try {
         var0.field6278.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("au")
   int method11254(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (this) {
            int var5;
            if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
               var5 = 1284385685 * this.field6281 - 1764480657 * this.field6280;
            } else {
               var5 = -593120253 * this.field6276 - 1764480657 * this.field6280 + 1284385685 * this.field6281;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && null != this.field6283) {
               throw new IOException(this.field6283.toString());
            } else {
               if (var3 + 1764480657 * this.field6280 <= -593120253 * this.field6276) {
                  System.arraycopy(this.field6277, 1764480657 * this.field6280, var1, var2, var3);
               } else {
                  int var6 = this.field6276 * -593120253 - 1764480657 * this.field6280;
                  System.arraycopy(this.field6277, this.field6280 * 1764480657, var1, var2, var6);
                  System.arraycopy(this.field6277, 0, var1, var6 + var2, var3 - var6);
               }

               this.field6280 = 2106239601 * ((1764480657 * this.field6280 + var3) % (-593120253 * this.field6276));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method11250() throws IOException {
      synchronized (this) {
         if (1284385685 * this.field6281 == this.field6280 * 1764480657) {
            if (null != this.field6283) {
               throw new IOException(this.field6283.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field6277[1764480657 * this.field6280] & 255;
            this.field6280 = (1 + 1764480657 * this.field6280) % (-593120253 * this.field6276) * 2106239601;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lub;[BII)I")
   @ObfuscatedName("fj")
   public static int method11255(classUB var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method11241();
      }

      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (var0) {
            int var5;
            if (-761697526 * var0.field6280 <= var0.field6281 * 848893177) {
               var5 = 45474276 * var0.field6281 - 48814611 * var0.field6280;
            } else {
               var5 = -593120253 * var0.field6276 - -472877594 * var0.field6280 + 197734362 * var0.field6281;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && null != var0.field6283) {
               throw new IOException(var0.field6283.toString());
            } else {
               if (var3 + 1764480657 * var0.field6280 <= -593120253 * var0.field6276) {
                  System.arraycopy(var0.field6277, -685683258 * var0.field6280, var1, var2, var3);
               } else {
                  int var6 = var0.field6276 * 1355884563 - 57237275 * var0.field6280;
                  System.arraycopy(var0.field6277, var0.field6280 * -1860272871, var1, var2, var6);
                  System.arraycopy(var0.field6277, 0, var1, var6 + var2, var3 - var6);
               }

               var0.field6280 = -1755240019 * ((1764480657 * var0.field6280 + var3) % (285025182 * var0.field6276));
               var0.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   boolean method11245(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < -593120253 * this.field6276) {
         synchronized (this) {
            int var3;
            if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
               var3 = 1284385685 * this.field6281 - 1764480657 * this.field6280;
            } else {
               var3 = -593120253 * this.field6276 - 1764480657 * this.field6280 + this.field6281 * 1284385685;
            }

            if (var3 >= var1) {
               return true;
            } else if (this.field6283 != null) {
               throw new IOException(this.field6283.toString());
            } else {
               this.notifyAll();
               return false;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method11247() throws IOException {
      synchronized (this) {
         int var2;
         if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
            var2 = 1284385685 * this.field6281 - this.field6280 * 1764480657;
         } else {
            var2 = this.field6276 * -593120253 - 1764480657 * this.field6280 + this.field6281 * 1284385685;
         }

         if (var2 <= 0 && null != this.field6283) {
            throw new IOException(this.field6283.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method11248() throws IOException {
      synchronized (this) {
         int var2;
         if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
            var2 = 1284385685 * this.field6281 - this.field6280 * 1764480657;
         } else {
            var2 = this.field6276 * -593120253 - 1764480657 * this.field6280 + this.field6281 * 1284385685;
         }

         if (var2 <= 0 && null != this.field6283) {
            throw new IOException(this.field6283.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method11242() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (null != this.field6283) {
                  return;
               }

               if (0 == -2044153773 * this.field6280) {
                  var1 = this.field6276 * -593120253 - -1783292031 * this.field6281 - 1;
               } else if (1764480657 * this.field6280 <= this.field6281 * -1430053238) {
                  var1 = this.field6276 * -593120253 - 1870005289 * this.field6281;
               } else {
                  var1 = this.field6280 * -1708699296 - this.field6281 * 1284385685 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.field6279.read(this.field6277, this.field6281 * 1284385685, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.field6283 = var3;
               return;
            }
         }

         synchronized (this) {
            this.field6281 = (1284385685 * this.field6281 + var2) % (this.field6276 * 636417095) * -372175066;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method11251() throws IOException {
      synchronized (this) {
         if (1284385685 * this.field6281 == this.field6280 * 1764480657) {
            if (null != this.field6283) {
               throw new IOException(this.field6283.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field6277[1764480657 * this.field6280] & 255;
            this.field6280 = (1 + 1764480657 * this.field6280) % (-593120253 * this.field6276) * 2106239601;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method11252() throws IOException {
      synchronized (this) {
         if (1284385685 * this.field6281 == this.field6280 * 1764480657) {
            if (null != this.field6283) {
               throw new IOException(this.field6283.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field6277[1764480657 * this.field6280] & 255;
            this.field6280 = (1 + 1764480657 * this.field6280) % (-593120253 * this.field6276) * 2106239601;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ap")
   int method11256(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized (this) {
            int var5;
            if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
               var5 = -1406324550 * this.field6281 - 1983238676 * this.field6280;
            } else {
               var5 = -593120253 * this.field6276 - 1246877050 * this.field6280 + 1284385685 * this.field6281;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && null != this.field6283) {
               throw new IOException(this.field6283.toString());
            } else {
               if (var3 + 1526952513 * this.field6280 <= -1796038494 * this.field6276) {
                  System.arraycopy(this.field6277, 1764480657 * this.field6280, var1, var2, var3);
               } else {
                  int var6 = this.field6276 * -770109152 - 1764480657 * this.field6280;
                  System.arraycopy(this.field6277, this.field6280 * 1764480657, var1, var2, var6);
                  System.arraycopy(this.field6277, 0, var1, var6 + var2, var3 - var6);
               }

               this.field6280 = 2106239601 * ((1377153218 * this.field6280 + var3) % (-593120253 * this.field6276));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lub;B)V")
   @ObfuscatedName("uk")
   public static void method11259(classUB var0, byte var1) {
      if (var0 == null) {
         var0.method11260(var1);
      } else {
         try {
            synchronized (var0) {
               if (null == var0.field6283) {
                  if (var1 != 4) {
                     throw new IllegalStateException();
                  }

                  var0.field6283 = new IOException("");
               }

               var0.notifyAll();
            }

            try {
               var0.field6278.join();
            } catch (InterruptedException var4) {
            }
         } catch (RuntimeException var6) {
            throw classEG.newRunException(var6, "ub.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method11243() {
      while (true) {
         int var1;
         synchronized (this) {
            while (true) {
               if (null != this.field6283) {
                  return;
               }

               if (0 == 1764480657 * this.field6280) {
                  var1 = this.field6276 * -593120253 - 1284385685 * this.field6281 - 1;
               } else if (1764480657 * this.field6280 <= this.field6281 * 1284385685) {
                  var1 = this.field6276 * -593120253 - 1284385685 * this.field6281;
               } else {
                  var1 = this.field6280 * 1764480657 - this.field6281 * 1284385685 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.field6279.read(this.field6277, this.field6281 * 1284385685, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized (this) {
               this.field6283 = var3;
               return;
            }
         }

         synchronized (this) {
            this.field6281 = (1284385685 * this.field6281 + var2) % (this.field6276 * -593120253) * 1480968125;
         }
      }
   }

   classUB(InputStream var1, int var2) {
      this.field6281 = 0;
      this.field6279 = var1;
      this.field6276 = (var2 + 1) * 1620940459;
      this.field6277 = new byte[-593120253 * this.field6276];
      this.field6278 = new Thread(this);
      this.field6278.setDaemon(true);
      this.field6278.start();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   void method11260(byte var1) {
      try {
         synchronized (this) {
            if (null == this.field6283) {
               if (var1 != 4) {
                  throw new IllegalStateException();
               }

               this.field6283 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field6278.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "ub.ac(" + ')');
      }
   }
}
