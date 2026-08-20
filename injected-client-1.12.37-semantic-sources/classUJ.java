import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uj")
public class classUJ implements Runnable {
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ag")
   public static classNN field6316 = new classNN();
   @ObfuscatedName("af")
   static final Object field6315 = new Object();
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6319 = 600;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("az")
   public static final classNN field6313 = new classNN();
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6318 = 100;
   @ObfuscatedName("as")
   static int field6314 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field6317 = 3;

   @Override
   public void run() {
      try {
         try {
            while (true) {
               classVU var1;
               synchronized (field6313) {
                  var1 = (classVU)field6313.method7915();
               }

               if (var1 != null) {
                  if (0 == var1.field6607 * -1312025255) {
                     classUS.method11531(var1.field6608, (int)var1.field6552, var1.field6610, var1.field6610.length, -1758944047);
                     synchronized (field6313) {
                        var1.vmethod398();
                     }
                  } else if (var1.field6607 * -1312025255 == 1) {
                     var1.field6610 = var1.field6608.method11527((int)var1.field6552, -1142684788);
                     synchronized (field6313) {
                        classNN.method7900(field6316, var1);
                     }
                  }

                  synchronized (field6315) {
                     if (field6314 * 508619279 <= 1) {
                        field6314 = 0;
                        field6315.notifyAll();
                        return;
                     }

                     field6314 = 69046312;
                  }
               } else {
                  Friend.method10149(100L);
                  synchronized (field6315) {
                     if (508619279 * field6314 <= 1) {
                        field6314 = 0;
                        field6315.notifyAll();
                        return;
                     }

                     field6314 -= 379503855;
                  }
               }
            }
         } catch (Exception var13) {
            classAAU.method275(null, var13, (byte)52);
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "uj.run(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luj;)V")
   @ObfuscatedName("mt")
   public static void method11335(classUJ var0) {
      if (var0 == null) {
         var0.method11336();
      }

      try {
         while (true) {
            classVU var1;
            synchronized (field6313) {
               var1 = (classVU)field6313.method7915();
            }

            if (var1 != null) {
               if (0 == var1.field6607 * -1312025255) {
                  classUS.method11531(var1.field6608, (int)var1.field6552, var1.field6610, var1.field6610.length, -538211867);
                  synchronized (field6313) {
                     var1.vmethod398();
                  }
               } else if (var1.field6607 * -1312025255 == 1) {
                  var1.field6610 = var1.field6608.method11527((int)var1.field6552, -1142684788);
                  synchronized (field6313) {
                     classNN.method7900(field6316, var1);
                  }
               }

               synchronized (field6315) {
                  if (field6314 * 508619279 <= 1) {
                     field6314 = 0;
                     field6315.notifyAll();
                     return;
                  }

                  field6314 = 69046312;
               }
            } else {
               Friend.method10149(100L);
               synchronized (field6315) {
                  if (-979027664 * field6314 <= 1) {
                     field6314 = 0;
                     field6315.notifyAll();
                     return;
                  }

                  field6314 -= 379503855;
               }
            }
         }
      } catch (Exception var13) {
         classAAU.method275(null, var13, (byte)85);
      }
   }

   classUJ() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leo;I)V")
   @ObfuscatedName("ob")
   public static void method11331(FloorDecoration var0, int var1) {
      if (var0 == null) {
         var0.method3941();
      }

      var0.field1809 = -845194935 * var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method11336() {
      try {
         while (true) {
            classVU var1;
            synchronized (field6313) {
               var1 = (classVU)field6313.method7915();
            }

            if (var1 != null) {
               if (0 == var1.field6607 * -1312025255) {
                  classUS.method11531(var1.field6608, (int)var1.field6552, var1.field6610, var1.field6610.length, 410444381);
                  synchronized (field6313) {
                     var1.vmethod398();
                  }
               } else if (var1.field6607 * -1312025255 == 1) {
                  var1.field6610 = var1.field6608.method11527((int)var1.field6552, -1142684788);
                  synchronized (field6313) {
                     classNN.method7900(field6316, var1);
                  }
               }

               synchronized (field6315) {
                  if (field6314 * 508619279 <= 1) {
                     field6314 = 0;
                     field6315.notifyAll();
                     return;
                  }

                  field6314 = 69046312;
               }
            } else {
               Friend.method10149(100L);
               synchronized (field6315) {
                  if (508619279 * field6314 <= 1) {
                     field6314 = 0;
                     field6315.notifyAll();
                     return;
                  }

                  field6314 -= 379503855;
               }
            }
         }
      } catch (Exception var13) {
         classAAU.method275(null, var13, (byte)52);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method11332() {
      synchronized (field6315) {
         if (field6314 * 508619279 != 0) {
            field6314 = 379503855;

            try {
               field6315.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized (field6313) {
         field6313.method7895();
         field6316.method7895();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method11333() {
      synchronized (field6315) {
         if (field6314 * 508619279 != 0) {
            field6314 = 371289217;

            try {
               field6315.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized (field6313) {
         field6313.method7895();
         field6316.method7895();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method11334() {
      synchronized (field6315) {
         if (field6314 * 508619279 != 0) {
            field6314 = 1691652418;

            try {
               field6315.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized (field6313) {
         field6313.method7895();
         field6316.method7895();
      }
   }
}
