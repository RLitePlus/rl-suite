import net.runelite.api.TileObject;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl23")
class rl23 extends Thread {
   @ObfuscatedName("it")
   public volatile boolean field5741 = true;
   @ObfuscatedName("tp")
   public final int field5743;
   @ObfuscatedSignature(descriptor = "Lrl21;")
   @ObfuscatedName("ff")
   public final rl21 field5742 = new rl21();
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ef")
   public static final classNN field5746 = new classNN();
   @ObfuscatedName("jg")
   public static int field5748;
   @ObfuscatedName("sn")
   public static final Object field5747 = new Object();
   @ObfuscatedSignature(descriptor = "Lfv;")
   @ObfuscatedName("mg")
   public static classFV field5750;
   @ObfuscatedSignature(descriptor = "Lez;")
   @ObfuscatedName("el")
   public static classEZ field5749;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("ny")
   public static final classNN field5745 = new classNN();
   @ObfuscatedSignature(descriptor = "[Lrl23;")
   @ObfuscatedName("sf")
   public static rl23[] field5751;

   @ObfuscatedSignature(descriptor = "(Lrl22;)V")
   @ObfuscatedName("vg")
   public static void method10068(rl22 var0) {
      synchronized (field5746) {
         field5746.method7932(var0);
      }

      synchronized (field5747) {
         field5748--;
         if (field5748 == 0) {
            field5747.notify();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lez;)V")
   @ObfuscatedName("ti")
   public static void method10064(classFV var0, classEZ var1) {
      field5750 = var0;
      field5749 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/TileObject;Ldy;IIII)V")
   @ObfuscatedName("uk")
   public static void method10070(TileObject var0, classDY var1, int var2, int var3, int var4, int var5) {
      assert field5749 != null;

      rl22 var6;
      synchronized (field5746) {
         var6 = (rl22)field5746.method7933();
      }

      if (var6 == null) {
         var6 = new rl22();
      }

      var6.field5740 = var0;
      var6.field5739 = var1;
      var6.field5737 = var2;
      var6.field5738 = var3;
      var6.field5735 = var4;
      var6.field5736 = var5;
      synchronized (field5745) {
         field5745.method7932(var6);
         field5745.notify();
      }

      synchronized (field5747) {
         field5748++;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pc")
   public static void method10069(int var0) {
      if (field5751 != null) {
         if (field5751.length == var0) {
            return;
         }

         for (rl23 var4 : field5751) {
            var4.field5741 = false;
         }

         synchronized (field5745) {
            field5745.notifyAll();
         }
      }

      field5751 = new rl23[var0];

      for (int var8 = 0; var8 < var0; var8++) {
         field5751[var8] = new rl23(var8, "RenderThread" + var8);
         field5751[var8].start();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("he")
   public static void method10071() {
      field5750 = null;
      field5749 = null;
   }

   @ObfuscatedSignature(descriptor = "(Luu;Luu;B)V")
   @ObfuscatedName("es")
   public static void method10067(classUU var0, classUU var1, byte var2) {
      if (var0 == null) {
         var0.method11646(var0, var2);
      }

      var0.field6385 = var1.field6385;
      var0.field6392 = var1.field6392;
      var0.field6394 = var1.field6394;
      var0.field6396 = var1.field6396;
      var0.field6398 = var1.field6398;
      var0.field6386 = var1.field6386;
      var0.field6391 = var1.field6391;
      var0.field6397 = var1.field6397;
      var0.field6401 = var1.field6401;
      var0.field6389 = var1.field6389;
      var0.field6387 = var1.field6387;
      var0.field6393 = var1.field6393;
      var0.field6400 = var1.field6400;
      var0.field6399 = var1.field6399;
      var0.field6395 = var1.field6395;
      var0.field6388 = var1.field6388;
   }

   public rl23(int var1, String var2) {
      super(var2);
      this.field5743 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILrl21;Lrl22;)V")
   @ObfuscatedName("ih")
   public static void method10066(int var0, rl21 var1, rl22 var2) {
      classDY var3 = var2.field5739;
      TileObject var4 = var2.field5740;
      int var5 = var2.field5737;
      int var6 = var2.field5738;
      int var7 = var2.field5735;
      int var8 = var2.field5736;

      classFX var9;
      try {
         var9 = var3.method3707(var1);
      } catch (Exception var11) {
         client.field1026.debug("exception drawing dynamic game entity", var11);
         return;
      }

      if (var9 != null) {
         var3.setModelHeight(var9.getModelHeight());
         int var10 = var3.getAnimationHeightOffset();
         client.field1118.drawDynamic(var0, field5750, field5749, var4, var3, var9, var5, var6, var7 - var10, var8);
      }
   }

   @Override
   public void run() {
      client.field1026.trace("{} start", this.getName());

      while (this.field5741) {
         rl22 var1;
         synchronized (field5745) {
            var1 = (rl22)field5745.method7933();
            if (var1 == null) {
               try {
                  field5745.wait();
               } catch (InterruptedException var5) {
               }
               continue;
            }
         }

         method10066(this.field5743, this.field5742, var1);
         method10068(var1);
      }

      client.field1026.trace("{} stop", this.getName());
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kv")
   public static void method10065() {
      while (true) {
         rl22 var0;
         synchronized (field5745) {
            var0 = (rl22)field5745.method7933();
         }

         if (var0 == null) {
            while (true) {
               synchronized (field5747) {
                  if (field5748 == 0) {
                     return;
                  }

                  try {
                     field5747.wait();
                  } catch (InterruptedException var4) {
                  }
               }
            }
         }

         method10066(-1, rl21.field5728, var0);
         method10068(var0);
      }
   }
}
