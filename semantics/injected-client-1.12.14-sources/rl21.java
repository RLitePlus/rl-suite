import net.runelite.api.TileObject;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl21")
class rl21 extends Thread {
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("xo")
   public static final NodeDeque field5610 = new NodeDeque();
   @ObfuscatedSignature(descriptor = "[Lrl21;")
   @ObfuscatedName("hz")
   public static rl21[] field5616;
   @ObfuscatedSignature(descriptor = "Lrl19;")
   @ObfuscatedName("aw")
   public final rl19 field5607;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("lp")
   public static final NodeDeque field5611 = new NodeDeque();
   @ObfuscatedName("mr")
   public static int field5613;
   @ObfuscatedName("pz")
   public final int field5608;
   @ObfuscatedName("bf")
   public volatile boolean field5606 = true;
   @ObfuscatedName("te")
   public static final Object field5612 = new Object();
   @ObfuscatedSignature(descriptor = "Lka;")
   @ObfuscatedName("yd")
   public static Projection field5615;
   @ObfuscatedSignature(descriptor = "Ljh;")
   @ObfuscatedName("ao")
   public static Scene field5614;

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/TileObject;Lct;IIII)V")
   @ObfuscatedName("ne")
   public static void method9555(TileObject var0, DynamicObject var1, int var2, int var3, int var4, int var5) {
      assert field5614 != null;

      rl20 var6;
      synchronized (field5611) {
         var6 = (rl20)field5611.method9829();
      }

      if (var6 == null) {
         var6 = new rl20();
      }

      var6.field5605 = var0;
      var6.field5604 = var1;
      var6.field5600 = var2;
      var6.field5602 = var3;
      var6.field5601 = var4;
      var6.field5603 = var5;
      synchronized (field5610) {
         field5610.method9826(var6);
         field5610.notify();
      }

      synchronized (field5612) {
         field5613++;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pm")
   public static void method9559(int var0) {
      if (field5616 != null) {
         if (field5616.length == var0) {
            return;
         }

         for (rl21 var4 : field5616) {
            var4.field5606 = false;
         }

         synchronized (field5610) {
            field5610.notifyAll();
         }
      }

      field5616 = new rl21[var0];

      for (int var8 = 0; var8 < var0; var8++) {
         field5616[var8] = new rl21(var8, "RenderThread" + var8);
         field5616[var8].start();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljh;)V")
   @ObfuscatedName("qo")
   public static void method9557(Projection var0, Scene var1) {
      field5615 = var0;
      field5614 = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("we")
   public static void method9556() {
      while (true) {
         rl20 var0;
         synchronized (field5610) {
            var0 = (rl20)field5610.method9829();
         }

         if (var0 == null) {
            while (true) {
               synchronized (field5612) {
                  if (field5613 == 0) {
                     return;
                  }

                  try {
                     field5612.wait();
                  } catch (InterruptedException var4) {
                  }
               }
            }
         }

         method9553(-1, rl19.field5583, var0);
         method9558(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("tz")
   public static void method9554() {
      field5615 = null;
      field5614 = null;
   }

   public rl21(int var1, String var2) {
      super(var2);
      this.field5607 = new rl19();
      this.field5608 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrl20;)V")
   @ObfuscatedName("wh")
   public static void method9558(rl20 var0) {
      synchronized (field5611) {
         field5611.method9826(var0);
      }

      synchronized (field5612) {
         field5613--;
         if (field5613 == 0) {
            field5612.notify();
         }
      }
   }

   @Override
   public void run() {
      client.field938.trace("{} start", this.getName());

      while (this.field5606) {
         rl20 var1;
         synchronized (field5610) {
            var1 = (rl20)field5610.method9829();
            if (var1 == null) {
               try {
                  field5610.wait();
               } catch (InterruptedException var5) {
               }
               continue;
            }
         }

         method9553(this.field5608, this.field5607, var1);
         method9558(var1);
      }

      client.field938.trace("{} stop", this.getName());
   }

   @ObfuscatedSignature(descriptor = "(ILrl19;Lrl20;)V")
   @ObfuscatedName("ze")
   public static void method9553(int var0, rl19 var1, rl20 var2) {
      DynamicObject var3 = var2.field5604;
      TileObject var4 = var2.field5605;
      int var5 = var2.field5600;
      int var6 = var2.field5602;
      int var7 = var2.field5601;
      int var8 = var2.field5603;

      Model var9;
      try {
         var9 = var3.method2868(var1);
      } catch (Exception var11) {
         client.field938.debug("exception drawing dynamic game entity", var11);
         return;
      }

      if (var9 != null) {
         var3.setModelHeight(var9.getModelHeight());
         int var10 = var3.getAnimationHeightOffset();
         client.field1025.drawDynamic(var0, field5615, field5614, var4, var3, var9, var5, var6, var7 - var10, var8);
      }
   }
}
