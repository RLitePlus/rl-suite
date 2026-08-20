import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qf")
public class ArchiveDiskActionHandler implements Runnable {
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("ae")
   public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();
   @ObfuscatedName("at")
   static final Object field5317 = new Object();
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5320 = 600;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5322 = 100;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("av")
   public static final NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();
   @ObfuscatedName("aj")
   static int field5319 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field5321 = 12;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   static void method8876() {
      synchronized (field5317) {
         if (0 == field5319 * -412991015) {
            class179.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            class179.ArchiveDiskActionHandler_thread.setDaemon(true);
            class179.ArchiveDiskActionHandler_thread.start();
            class179.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         field5319 = 1228719640;
      }
   }

   ArchiveDiskActionHandler() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   static void method8877() {
      synchronized (field5317) {
         if (0 == field5319 * -412991015) {
            class179.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            class179.ArchiveDiskActionHandler_thread.setDaemon(true);
            class179.ArchiveDiskActionHandler_thread.start();
            class179.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         field5319 = 1228719640;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method8882() {
      try {
         while (true) {
            ArchiveDiskAction var1;
            synchronized (ArchiveDiskActionHandler_requestQueue) {
               var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
            }

            if (null != var1) {
               if (var1.type * 1892501129 == 0) {
                  ArchiveDisk.method10610(var1.archiveDisk, (int)var1.key, var1.data, var1.data.length, (byte)75);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     var1.remove();
                  }
               } else if (1 == var1.type * 601812074) {
                  var1.data = var1.archiveDisk.read((int)var1.key, -2082368928);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                  }
               }

               synchronized (field5317) {
                  if (field5319 * 642360069 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 = -2042664958;
               }
            } else {
               LoginState.method484(100L);
               synchronized (field5317) {
                  if (-412991015 * field5319 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 -= -1732122006;
               }
            }
         }
      } catch (Exception var13) {
         PlayerType.RunException_sendStackTrace(null, var13, 550601832);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method8883() {
      try {
         while (true) {
            ArchiveDiskAction var1;
            synchronized (ArchiveDiskActionHandler_requestQueue) {
               var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
            }

            if (null != var1) {
               if (var1.type * 1892501129 == 0) {
                  ArchiveDisk.method10610(var1.archiveDisk, (int)var1.key, var1.data, var1.data.length, (byte)44);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     var1.remove();
                  }
               } else if (1 == var1.type * 1892501129) {
                  var1.data = var1.archiveDisk.read((int)var1.key, 683813084);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                  }
               }

               synchronized (field5317) {
                  if (field5319 * -412991015 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 = 1228719640;
               }
            } else {
               LoginState.method484(100L);
               synchronized (field5317) {
                  if (-412991015 * field5319 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 -= 789458537;
               }
            }
         }
      } catch (Exception var13) {
         PlayerType.RunException_sendStackTrace(null, var13, 1436266013);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method8884() {
      try {
         while (true) {
            ArchiveDiskAction var1;
            synchronized (ArchiveDiskActionHandler_requestQueue) {
               var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
            }

            if (null != var1) {
               if (var1.type * 1892501129 == 0) {
                  ArchiveDisk.method10610(var1.archiveDisk, (int)var1.key, var1.data, var1.data.length, (byte)5);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     var1.remove();
                  }
               } else if (1 == var1.type * 1892501129) {
                  var1.data = var1.archiveDisk.read((int)var1.key, -1064090447);
                  synchronized (ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                  }
               }

               synchronized (field5317) {
                  if (field5319 * -412991015 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 = 1228719640;
               }
            } else {
               LoginState.method484(100L);
               synchronized (field5317) {
                  if (-412991015 * field5319 <= 1) {
                     field5319 = 0;
                     field5317.notifyAll();
                     return;
                  }

                  field5319 -= 789458537;
               }
            }
         }
      } catch (Exception var13) {
         PlayerType.RunException_sendStackTrace(null, var13, 1745246636);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   static void method8878() {
      synchronized (field5317) {
         if (0 == field5319 * -412991015) {
            class179.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            class179.ArchiveDiskActionHandler_thread.setDaemon(true);
            class179.ArchiveDiskActionHandler_thread.start();
            class179.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         field5319 = 1228719640;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public static void method8880() {
      synchronized (field5317) {
         if (field5319 * 529796359 != 0) {
            field5319 = -1551528039;

            try {
               field5317.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized (ArchiveDiskActionHandler_requestQueue) {
         NodeDeque.method9797(ArchiveDiskActionHandler_requestQueue);
         NodeDeque.method9797(ArchiveDiskActionHandler_responseQueue);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[BLtf;)V")
   @ObfuscatedName("an")
   static void method8875(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 0;
      var3.key = var0;
      var3.data = var1;
      var3.archiveDisk = var2;
      synchronized (ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class228.method4852(205934648);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   static void method8879() {
      synchronized (field5317) {
         if (0 == field5319 * -412991015) {
            class179.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
            class179.ArchiveDiskActionHandler_thread.setDaemon(true);
            class179.ArchiveDiskActionHandler_thread.start();
            class179.ArchiveDiskActionHandler_thread.setPriority(5);
         }

         field5319 = 1228719640;
      }
   }

   @Override
   public void run() {
      try {
         try {
            while (true) {
               ArchiveDiskAction var1;
               synchronized (ArchiveDiskActionHandler_requestQueue) {
                  var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
               }

               if (null != var1) {
                  if (var1.type * 1892501129 == 0) {
                     ArchiveDisk.method10610(var1.archiveDisk, (int)var1.key, var1.data, var1.data.length, (byte)10);
                     synchronized (ArchiveDiskActionHandler_requestQueue) {
                        var1.remove();
                     }
                  } else if (1 == var1.type * 1892501129) {
                     var1.data = var1.archiveDisk.read((int)var1.key, -306233939);
                     synchronized (ArchiveDiskActionHandler_requestQueue) {
                        ArchiveDiskActionHandler_responseQueue.addFirst(var1);
                     }
                  }

                  synchronized (field5317) {
                     if (field5319 * -412991015 <= 1) {
                        field5319 = 0;
                        field5317.notifyAll();
                        return;
                     }

                     field5319 = 1228719640;
                  }
               } else {
                  LoginState.method484(100L);
                  synchronized (field5317) {
                     if (-412991015 * field5319 <= 1) {
                        field5319 = 0;
                        field5317.notifyAll();
                        return;
                     }

                     field5319 -= 789458537;
                  }
               }
            }
         } catch (Exception var13) {
            PlayerType.RunException_sendStackTrace(null, var13, -1861899314);
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "qf.run(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method8881() {
      synchronized (field5317) {
         if (field5319 * -412991015 != 0) {
            field5319 = 789458537;

            try {
               field5317.wait();
            } catch (InterruptedException var5) {
            }
         }
      }

      synchronized (ArchiveDiskActionHandler_requestQueue) {
         NodeDeque.method9797(ArchiveDiskActionHandler_requestQueue);
         NodeDeque.method9797(ArchiveDiskActionHandler_responseQueue);
      }
   }

   @ObfuscatedSignature(descriptor = "([FIFB)F")
   @ObfuscatedName("at")
   static float method8885(float[] var0, int var1, float var2, byte var3) {
      try {
         float var4 = var0[var1];

         for (int var5 = var1 - 1; var5 >= 0; var5--) {
            var4 = var0[var5] + var4 * var2;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qf.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("cc")
   static int method8887(int var0, Script var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qf.cc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;Lwh;I)V")
   @ObfuscatedName("aq")
   static void method8886(DynamicArray var0, class586 var1, int var2) {
      try {
         class461.method9338(var0, var1, true, -928498657);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qf.aq(" + ')');
      }
   }
}
