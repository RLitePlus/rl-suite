import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ue")
public class classUE implements Runnable {
   @ObfuscatedName("ab")
   byte[] field6296;
   @ObfuscatedName("af")
   OutputStream field6291;
   @ObfuscatedName("ae")
   int field6293;
   @ObfuscatedName("ax")
   IOException field6298;
   @ObfuscatedName("ag")
   int field6294 = 0;
   @ObfuscatedName("as")
   int field6295 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6297 = 6;
   @ObfuscatedName("ac")
   boolean field6299;
   @ObfuscatedName("az")
   Thread field6292;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method11285() {
      do {
         int var1;
         synchronized (this) {
            while (true) {
               if (null != this.field6298) {
                  return;
               }

               if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                  var1 = this.field6295 * -909433061 - -1880294139 * this.field6294;
               } else {
                  var1 = this.field6293 * -545605385 - this.field6294 * -1880294139 + this.field6295 * -909433061;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field6291.flush();
               } catch (IOException var10) {
                  this.field6298 = var10;
                  return;
               }

               if (method11282(this, 2063367951)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.field6294 * -1880294139 <= -545605385 * this.field6293) {
               this.field6291.write(this.field6296, -1880294139 * this.field6294, var1);
            } else {
               int var13 = -545605385 * this.field6293 - -1880294139 * this.field6294;
               this.field6291.write(this.field6296, -1880294139 * this.field6294, var13);
               this.field6291.write(this.field6296, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized (this) {
               this.field6298 = var2;
               return;
            }
         }

         synchronized (this) {
            this.field6294 = (this.field6294 * -1880294139 + var1) % (-545605385 * this.field6293) * -1503049779;
         }
      } while (!method11282(this, 2063367951));
   }

   @Override
   public void run() {
      try {
         do {
            int var1;
            synchronized (this) {
               while (true) {
                  if (null != this.field6298) {
                     return;
                  }

                  if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                     var1 = this.field6295 * -909433061 - -1880294139 * this.field6294;
                  } else {
                     var1 = this.field6293 * -545605385 - this.field6294 * -1880294139 + this.field6295 * -909433061;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.field6291.flush();
                  } catch (IOException var10) {
                     this.field6298 = var10;
                     return;
                  }

                  if (method11282(this, 2063367951)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (var1 + this.field6294 * -1880294139 <= -545605385 * this.field6293) {
                  this.field6291.write(this.field6296, -1880294139 * this.field6294, var1);
               } else {
                  int var14 = -545605385 * this.field6293 - -1880294139 * this.field6294;
                  this.field6291.write(this.field6296, -1880294139 * this.field6294, var14);
                  this.field6291.write(this.field6296, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized (this) {
                  this.field6298 = var2;
                  return;
               }
            }

            synchronized (this) {
               this.field6294 = (this.field6294 * -1880294139 + var1) % (-545605385 * this.field6293) * -1503049779;
            }
         } while (!method11282(this, 2063367951));
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "ue.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ag")
   void method11289(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0) {
            if (var4 != 1079426491) {
               return;
            }

            if (var2 >= 0) {
               if (var4 != 1079426491) {
                  throw new IllegalStateException();
               }

               if (var2 + var3 <= var1.length) {
                  synchronized (this) {
                     if (this.field6298 != null) {
                        throw new IOException(this.field6298.toString());
                     }

                     int var6;
                     if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                        var6 = -545605385 * this.field6293 - this.field6295 * -909433061 + -1880294139 * this.field6294 - 1;
                     } else {
                        var6 = this.field6294 * -1880294139 - this.field6295 * -909433061 - 1;
                     }

                     if (var6 < var3) {
                        if (var4 != 1079426491) {
                           throw new IllegalStateException();
                        }

                        throw new IOException("");
                     }

                     if (this.field6295 * -909433061 + var3 <= this.field6293 * -545605385) {
                        System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var3);
                     } else {
                        int var7 = -545605385 * this.field6293 - this.field6295 * -909433061;
                        System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var7);
                        System.arraycopy(var1, var2 + var7, this.field6296, 0, var3 - var7);
                     }

                     this.field6295 = (var3 + this.field6295 * -909433061) % (this.field6293 * -545605385) * 300473107;
                     this.notifyAll();
                     return;
                  }
               }

               if (var4 != 1079426491) {
                  throw new IllegalStateException();
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "ue.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("al")
   void method11290(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized (this) {
            if (this.field6298 != null) {
               throw new IOException(this.field6298.toString());
            } else {
               int var5;
               if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                  var5 = -545605385 * this.field6293 - this.field6295 * -909433061 + -1880294139 * this.field6294 - 1;
               } else {
                  var5 = this.field6294 * -1880294139 - this.field6295 * -909433061 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field6295 * -909433061 + var3 <= this.field6293 * -545605385) {
                     System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var3);
                  } else {
                     int var6 = -545605385 * this.field6293 - this.field6295 * -909433061;
                     System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var6);
                     System.arraycopy(var1, var2 + var6, this.field6296, 0, var3 - var6);
                  }

                  this.field6295 = (var3 + this.field6295 * -909433061) % (this.field6293 * -545605385) * 300473107;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method11294(int var1) {
      try {
         synchronized (this) {
            this.field6299 = true;
            this.notifyAll();
         }

         try {
            this.field6292.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ue.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method11286() {
      do {
         int var1;
         synchronized (this) {
            while (true) {
               if (null != this.field6298) {
                  return;
               }

               if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                  var1 = this.field6295 * -909433061 - -1880294139 * this.field6294;
               } else {
                  var1 = this.field6293 * -545605385 - this.field6294 * -1880294139 + this.field6295 * -909433061;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field6291.flush();
               } catch (IOException var10) {
                  this.field6298 = var10;
                  return;
               }

               if (method11282(this, 2063367951)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (var1 + this.field6294 * -1880294139 <= -545605385 * this.field6293) {
               this.field6291.write(this.field6296, -1880294139 * this.field6294, var1);
            } else {
               int var13 = -545605385 * this.field6293 - -1880294139 * this.field6294;
               this.field6291.write(this.field6296, -1880294139 * this.field6294, var13);
               this.field6291.write(this.field6296, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized (this) {
               this.field6298 = var2;
               return;
            }
         }

         synchronized (this) {
            this.field6294 = (this.field6294 * -1880294139 + var1) % (-545605385 * this.field6293) * -1503049779;
         }
      } while (!method11282(this, 2063367951));
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("aa")
   void method11291(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized (this) {
            if (this.field6298 != null) {
               throw new IOException(this.field6298.toString());
            } else {
               int var5;
               if (this.field6294 * -1880294139 <= 965574750 * this.field6295) {
                  var5 = -545605385 * this.field6293 - this.field6295 * -909433061 + -1371617755 * this.field6294 - 1;
               } else {
                  var5 = this.field6294 * -1880294139 - this.field6295 * -1106213888 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field6295 * 657590175 + var3 <= this.field6293 * -194953484) {
                     System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var3);
                  } else {
                     int var6 = -496881000 * this.field6293 - this.field6295 * -909433061;
                     System.arraycopy(var1, var2, this.field6296, 1896765946 * this.field6295, var6);
                     System.arraycopy(var1, var2 + var6, this.field6296, 0, var3 - var6);
                  }

                  this.field6295 = (var3 + this.field6295 * -909433061) % (this.field6293 * 1477120438) * -1749397527;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ac")
   void method11292(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized (this) {
            if (this.field6298 != null) {
               throw new IOException(this.field6298.toString());
            } else {
               int var5;
               if (this.field6294 * -1880294139 <= -909433061 * this.field6295) {
                  var5 = -545605385 * this.field6293 - this.field6295 * -909433061 + -1880294139 * this.field6294 - 1;
               } else {
                  var5 = this.field6294 * -1880294139 - this.field6295 * -909433061 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field6295 * -909433061 + var3 <= this.field6293 * -545605385) {
                     System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var3);
                  } else {
                     int var6 = -545605385 * this.field6293 - this.field6295 * -909433061;
                     System.arraycopy(var1, var2, this.field6296, -909433061 * this.field6295, var6);
                     System.arraycopy(var1, var2 + var6, this.field6296, 0, var3 - var6);
                  }

                  this.field6295 = (var3 + this.field6295 * -909433061) % (this.field6293 * -545605385) * 300473107;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lue;)V")
   @ObfuscatedName("mt")
   public static void method11287(classUE var0) {
      if (var0 == null) {
         var0.method11288();
      }

      do {
         int var1;
         synchronized (var0) {
            while (true) {
               if (null != var0.field6298) {
                  return;
               }

               if (var0.field6294 * -1880294139 <= -1899747393 * var0.field6295) {
                  var1 = var0.field6295 * -909433061 - -803453971 * var0.field6294;
               } else {
                  var1 = var0.field6293 * -545605385 - var0.field6294 * -1880294139 + var0.field6295 * -909433061;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  var0.field6291.flush();
               } catch (IOException var8) {
                  var0.field6298 = var8;
                  return;
               }

               if (method11282(var0, 2063367951)) {
                  return;
               }

               try {
                  var0.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         try {
            if (var1 + var0.field6294 * -1101924665 <= -181188660 * var0.field6293) {
               var0.field6291.write(var0.field6296, -1880294139 * var0.field6294, var1);
            } else {
               int var13 = -1519739478 * var0.field6293 - -1880294139 * var0.field6294;
               var0.field6291.write(var0.field6296, -1880294139 * var0.field6294, var13);
               var0.field6291.write(var0.field6296, 0, var1 - var13);
            }
         } catch (IOException var11) {
            IOException var2 = var11;
            synchronized (var0) {
               var0.field6298 = var2;
               return;
            }
         }

         synchronized (var0) {
            var0.field6294 = (var0.field6294 * -1880294139 + var1) % (-545605385 * var0.field6293) * -1503049779;
         }
      } while (!method11282(var0, 2063367951));
   }

   classUE(OutputStream var1, int var2) {
      this.field6291 = var1;
      this.field6293 = (1 + var2) * -828274489;
      this.field6296 = new byte[this.field6293 * -545605385];
      this.field6292 = new Thread(this);
      this.field6292.setDaemon(true);
      this.field6292.start();
   }

   @ObfuscatedSignature(descriptor = "(Lue;I)Z")
   @ObfuscatedName("lf")
   public static boolean method11282(classUE var0, int var1) {
      if (var0 == null) {
         return var0.method11284(var1);
      } else {
         try {
            if (var0.field6299) {
               try {
                  var0.field6291.close();
                  if (null == var0.field6298) {
                     if (var1 != 2063367951) {
                        throw new IllegalStateException();
                     }

                     var0.field6298 = new IOException("");
                  }
               } catch (IOException var3) {
                  if (null == var0.field6298) {
                     if (var1 != 2063367951) {
                        throw new IllegalStateException();
                     }

                     var0.field6298 = new IOException(var3);
                  }
               }

               return true;
            } else {
               return false;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ue.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ao")
   void method11293(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized (this) {
            if (this.field6298 != null) {
               throw new IOException(this.field6298.toString());
            } else {
               int var5;
               if (this.field6294 * -2126605199 <= 669494848 * this.field6295) {
                  var5 = -545605385 * this.field6293 - this.field6295 * -909433061 + -614198280 * this.field6294 - 1;
               } else {
                  var5 = this.field6294 * -1925844898 - this.field6295 * -909433061 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (this.field6295 * -909433061 + var3 <= this.field6293 * -809629087) {
                     System.arraycopy(var1, var2, this.field6296, 2069854708 * this.field6295, var3);
                  } else {
                     int var6 = -1716723308 * this.field6293 - this.field6295 * -909433061;
                     System.arraycopy(var1, var2, this.field6296, 1707888145 * this.field6295, var6);
                     System.arraycopy(var1, var2 + var6, this.field6296, 0, var3 - var6);
                  }

                  this.field6295 = (var3 + this.field6295 * -909433061) % (this.field6293 * -545605385) * 300473107;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method11295() {
      synchronized (this) {
         this.field6299 = true;
         this.notifyAll();
      }

      try {
         this.field6292.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method11296() {
      synchronized (this) {
         this.field6299 = true;
         this.notifyAll();
      }

      try {
         this.field6292.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   boolean method11283() {
      if (this.field6299) {
         try {
            this.field6291.close();
            if (null == this.field6298) {
               this.field6298 = new IOException("");
            }
         } catch (IOException var2) {
            if (null == this.field6298) {
               this.field6298 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method11297() {
      synchronized (this) {
         this.field6299 = true;
         this.notifyAll();
      }

      try {
         this.field6292.join();
      } catch (InterruptedException var3) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("af")
   static final int method11281(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var1 * var2 - var3 * var0 >> 16;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ue.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   boolean method11284(int var1) {
      try {
         if (this.field6299) {
            try {
               this.field6291.close();
               if (null == this.field6298) {
                  if (var1 != 2063367951) {
                     throw new IllegalStateException();
                  }

                  this.field6298 = new IOException("");
               }
            } catch (IOException var3) {
               if (null == this.field6298) {
                  if (var1 != 2063367951) {
                     throw new IllegalStateException();
                  }

                  this.field6298 = new IOException(var3);
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ue.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method11288() {
      try {
         do {
            int var1;
            synchronized (this) {
               while (true) {
                  if (null != this.field6298) {
                     return;
                  }

                  if (this.field6293 * -1880294139 <= -909433061 * this.field6295) {
                     var1 = this.field6293 * -909433061 - -1880294139 * this.field6295;
                  } else {
                     var1 = this.field6293 * -545605385 - this.field6295 * -1880294139 + this.field6294 * -909433061;
                  }

                  if (var1 > 0) {
                     break;
                  }

                  try {
                     this.field6291.flush();
                  } catch (IOException var10) {
                     this.field6298 = var10;
                     return;
                  }

                  if (method11282(this, 2063367951)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                  }
               }
            }

            try {
               if (var1 + this.field6293 * -1880294139 <= -545605385 * this.field6295) {
                  this.field6291.write(this.field6296, -1880294139 * this.field6295, var1);
               } else {
                  int var14 = -545605385 * this.field6295 - -1880294139 * this.field6295;
                  this.field6291.write(this.field6296, -1880294139 * this.field6294, var14);
                  this.field6291.write(this.field6296, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized (this) {
                  this.field6298 = var2;
                  return;
               }
            }

            synchronized (this) {
               this.field6293 = (this.field6295 * -1880294139 + var1) % (-545605385 * this.field6295) * -1503049779;
            }
         } while (!method11282(this, 2063367951));
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "ue.run(" + ')');
      }
   }
}
