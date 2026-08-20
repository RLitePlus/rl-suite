import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("le")
public class classLE {
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field4125 = 72;
   @ObfuscatedName("as")
   long field4113;
   @ObfuscatedName("ae")
   long field4115;
   @ObfuscatedName("ab")
   long field4116;
   @ObfuscatedName("ag")
   long field4117;
   @ObfuscatedName("ax")
   int field4118;
   @ObfuscatedName("af")
   long field4114;
   @ObfuscatedName("ac")
   int field4120;
   @ObfuscatedName("aa")
   int field4119;
   @ObfuscatedName("ao")
   int field4122;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4124 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field4123 = 18;
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("ea")
   static classKU field4126;
   @ObfuscatedName("az")
   public boolean field4121 = false;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("de")
   public static void method6753(classLE var0) {
      if (var0 == null) {
         var0.method6762();
      } else {
         if (-1L != 7273805839578160459L * var0.field4114) {
            var0.field4117 = (classDD.method2983(16711680) - var0.field4114 * 7273805839578160459L) * 7337258472556907519L;
            var0.field4114 = -4380477302914991203L;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method6754() {
      if (-1L != 7273805839578160459L * this.field4114) {
         this.field4117 = (classDD.method2983(16711680) - this.field4114 * 7273805839578160459L) * 7337258472556907519L;
         this.field4114 = -4380477302914991203L;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method6755(int var1) {
      try {
         if (-1L != 7273805839578160459L * this.field4114) {
            this.field4117 = (classDD.method2983(16711680) - this.field4114 * 7273805839578160459L) * 7337258472556907519L;
            this.field4114 = -4380477302914991203L;
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   public void method6758(int var1, int var2) {
      try {
         this.field4115 = classDD.method2983(16711680) * -7767324811451944647L;
         this.field4118 = var1 * 1692844975;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "le.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   public void method6759(int var1) {
      this.field4115 = classDD.method2983(16711680) * -7767324811451944647L;
      this.field4118 = var1 * 1692844975;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method6766(int var1) {
      try {
         this.field4121 = false;
         this.field4120 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;C)Z")
   @ObfuscatedName("pu")
   public static boolean method6777(EnumComposition var0, char var1) {
      return var1 == var0.field4822;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method6769(int var1) {
      try {
         method6764(this, -811545557);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;I)V")
   @ObfuscatedName("pt")
   public static void method6760(classLE var0, int var1) {
      if (var0 == null) {
         var0.method6773(var1);
      } else {
         var0.field4115 = classDD.method2983(16711680) * -7767324811451944647L;
         var0.field4118 = var1 * 1692844975;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;)V")
   @ObfuscatedName("og")
   public static void method6757(classKQ var0) {
      if (var0 == null) {
         var0.method6536();
      }

      var0.field3999 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lle;I)V")
   @ObfuscatedName("ql")
   public static void method6749(classLE var0, int var1) {
      if (var0 == null) {
         var0.method6772(var1);
      } else {
         try {
            var0.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "le.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method6750() {
      this.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   public void method6761(int var1) {
      this.field4115 = classDD.method2983(16711680) * -7767324811451944647L;
      this.field4118 = var1 * 94990176;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method6762() {
      if (-1L != this.field4115 * -487073909452215031L) {
         this.field4116 = (classDD.method2983(16711680) - -487073909452215031L * this.field4115) * 2788183836609794057L;
         this.field4115 = 7767324811451944647L;
      }

      this.field4119 += -1618845627;
      this.field4121 = true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method6751() {
      this.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method6752() {
      this.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("ax")
   public void method6774(Buffer var1, byte var2) {
      try {
         long var3 = 8891344905762583551L * this.field4117;
         var3 /= 10L;
         if (var3 < 0L) {
            if (var2 != 8) {
               throw new IllegalStateException();
            }

            var3 = 0L;
         } else if (var3 > 65535L) {
            if (var2 != 8) {
               throw new IllegalStateException();
            }

            var3 = 65535L;
         }

         var1.method12973((int)var3, -1542382992);
         long var5 = -1605016655774630343L * this.field4116;
         var5 /= 10L;
         if (var5 < 0L) {
            var5 = 0L;
         } else if (var5 > 65535L) {
            if (var2 != 8) {
               return;
            }

            var5 = 65535L;
         }

         var1.method12973((int)var5, -1542382992);
         long var7 = this.field4113 * 1011984226548346587L;
         var7 /= 10L;
         if (var7 < 0L) {
            if (var2 != 8) {
               return;
            }

            var7 = 0L;
         } else if (var7 > 65535L) {
            if (var2 != 8) {
               return;
            }

            var7 = 65535L;
         }

         var1.method12973((int)var7, -1542382992);
         var1.method12973(968782671 * this.field4118, -1542382992);
         var1.method12973(-1694632695 * this.field4120, -1542382992);
         var1.method12973(-1144147315 * this.field4119, -1542382992);
         var1.method12973(this.field4122 * -154512739, -1542382992);
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "le.ax(" + ')');
      }
   }

   public classLE() {
      this.field4114 = -4380477302914991203L;
      this.field4115 = 7767324811451944647L;
      this.field4116 = 0L;
      this.field4117 = 0L;
      this.field4113 = 0L;
      this.field4118 = 0;
      this.field4120 = 0;
      this.field4119 = 0;
      this.field4122 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method6763() {
      if (-1L != this.field4115 * -487073909452215031L) {
         this.field4116 = (classDD.method2983(16711680) - -487073909452215031L * this.field4115) * 2788183836609794057L;
         this.field4115 = 7767324811451944647L;
      }

      this.field4119 += -1618845627;
      this.field4121 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("wz")
   public static void method6770(classLE var0) {
      if (var0 == null) {
         var0.method6763();
      } else {
         method6764(var0, 1715663530);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void method6767() {
      this.field4121 = false;
      this.field4120 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public void method6768() {
      this.field4121 = false;
      this.field4120 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method6771() {
      method6764(this, -714468882);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("pw")
   public static void method6756(classLE var0) {
      if (-1L != 7273805839578160459L * var0.field4114) {
         var0.field4117 = (classDD.method2983(16711680) - var0.field4114 * 7273805839578160459L) * 7337258472556907519L;
         var0.field4114 = -4380477302914991203L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("am")
   public void method6775(Buffer var1) {
      long var2 = 8891344905762583551L * this.field4117;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.method12973((int)var2, -1542382992);
      long var4 = -1605016655774630343L * this.field4116;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.method12973((int)var4, -1542382992);
      long var6 = this.field4113 * 1011984226548346587L;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.method12973((int)var6, -1542382992);
      var1.method12973(968782671 * this.field4118, -1542382992);
      var1.method12973(-1694632695 * this.field4120, -1542382992);
      var1.method12973(-1144147315 * this.field4119, -1542382992);
      var1.method12973(this.field4122 * -154512739, -1542382992);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ah")
   public void method6776(Buffer var1) {
      long var2 = 8891344905762583551L * this.field4117;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.method12973((int)var2, -1542382992);
      long var4 = -1605016655774630343L * this.field4116;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.method12973((int)var4, -1542382992);
      long var6 = this.field4113 * 1011984226548346587L;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.method12973((int)var6, -1542382992);
      var1.method12973(968782671 * this.field4118, -1542382992);
      var1.method12973(-843119933 * this.field4120, -1542382992);
      var1.method12973(916013409 * this.field4119, -1542382992);
      var1.method12973(this.field4122 * -1474712660, -1542382992);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)V")
   @ObfuscatedName("ao")
   public static void method6778(AbstractArchive var0, int var1, int var2) {
      try {
         if (classNP.field4699.isEmpty()) {
            if (var2 != 124181514) {
               throw new IllegalStateException();
            }
         } else {
            ArrayList var3 = new ArrayList();
            Iterator var4 = classNP.field4699.iterator();

            while (var4.hasNext()) {
               if (var2 != 124181514) {
                  throw new IllegalStateException();
               }

               MidiRequest var5 = (MidiRequest)var4.next();
               var5.field4643 = false;
               var5.field4644 = false;
               var5.field4634 = false;
               var5.field4633 = false;
               var5.field4642 = var0;
               var5.field4635 = var1 * -1016653583;
               var5.field4631 = 0.0F;
               var3.add(var5);
            }

            classIJ.method6215(
               var3,
               classNP.field4703 * -1331669075,
               classNP.field4702 * 1784906769,
               -1350272915 * classNP.field4696,
               classNP.field4701 * 396217257,
               false,
               -2064319880
            );
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "le.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   public void method6772(int var1) {
      try {
         method6764(this, -811545557);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   public void method6773(int var1) {
      try {
         method6764(this, -811545557);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lle;I)V")
   @ObfuscatedName("ej")
   public static void method6764(classLE var0, int var1) {
      if (var0 == null) {
         var0.method6765(var1);
      } else {
         try {
            if (-1L != var0.field4115 * -487073909452215031L) {
               if (var1 == -404014210) {
                  return;
               }

               var0.field4116 = (classDD.method2983(16711680) - -487073909452215031L * var0.field4115) * 2788183836609794057L;
               var0.field4115 = 7767324811451944647L;
            }

            var0.field4119 += -1618845627;
            var0.field4121 = true;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "le.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public void method6765(int var1) {
      try {
         if (-1L != this.field4113 * -487073909452215031L) {
            if (var1 == -404014210) {
               return;
            }

            this.field4113 = (classDD.method2983(16711680) - -487073909452215031L * this.field4114) * 2788183836609794057L;
            this.field4114 = 7767324811451944647L;
         }

         this.field4120 = this.field4118 + -1618845627;
         this.field4121 = true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "le.ab(" + ')');
      }
   }
}
