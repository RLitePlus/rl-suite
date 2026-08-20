import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wh")
public class classWH {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6682 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6683 = 0;
   @ObfuscatedSignature(descriptor = "Lgx;")
   @ObfuscatedName("ag")
   WorldMapArea field6685;
   @ObfuscatedName("ac")
   boolean field6678;
   @ObfuscatedName("ax")
   int field6679 = 0;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("as")
   AbstractArchive field6680;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field6681 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6684 = 100;

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("as")
   void method12363(WorldMapArea var1) {
      if (null != var1) {
         if (this.field6685 == null || var1.method5848(-608589044) != this.field6685.method5848(-608589044)) {
            this.field6685 = var1;
            this.field6679 = 0;
            this.field6678 = false;
            this.method12369(1747005689);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;)I")
   @ObfuscatedName("tt")
   public static int method12368(classWH var0) {
      if (var0.field6685 == null) {
         var0.field6679 = 645629804;
         var0.field6678 = true;
      } else {
         if (var0.field6679 * -1390089701 < 33) {
            if (!var0.field6680.method11871(classHE.field2778.field2773 * -1013526269, var0.field6685.method5848(-608589044), (byte)-46)) {
               return var0.field6679 * -1390089701;
            }

            var0.field6679 = 556655219;
         }

         if (33 == var0.field6679 * -1390089701) {
            if (!var0.field6680.method11871(-1013526269 * classHE.field2776.field2773, var0.field6685.method5848(-608589044), (byte)-3)) {
               return -1390089701 * var0.field6679;
            }

            var0.field6679 = 1113310438;
         }

         if (66 == -1390089701 * var0.field6679) {
            var0.field6679 = 645629804;
            var0.field6678 = true;
         }
      }

      return var0.field6679 * -1390089701;
   }

   classWH(AbstractArchive var1) {
      this.field6678 = false;
      this.field6680 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method12369(int var1) {
      try {
         if (this.field6685 == null) {
            if (var1 <= 1312733671) {
               throw new IllegalStateException();
            }

            this.field6679 = 645629804;
            this.field6678 = true;
         } else {
            if (this.field6679 * -1390089701 < 33) {
               if (var1 <= 1312733671) {
                  throw new IllegalStateException();
               }

               if (!this.field6680.method11871(classHE.field2778.field2773 * -1013526269, this.field6685.method5848(-608589044), (byte)33)) {
                  if (var1 <= 1312733671) {
                     throw new IllegalStateException();
                  }

                  return this.field6679 * -1390089701;
               }

               this.field6679 = 556655219;
            }

            if (33 == this.field6679 * -1390089701) {
               if (!this.field6680.method11871(-1013526269 * classHE.field2776.field2773, this.field6685.method5848(-608589044), (byte)-3)) {
                  return -1390089701 * this.field6679;
               }

               this.field6679 = 1113310438;
            }

            if (66 == -1390089701 * this.field6679) {
               this.field6679 = 645629804;
               this.field6678 = true;
            }
         }

         return this.field6679 * -1390089701;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wh.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   boolean method12372() {
      return this.field6678;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("ag")
   void method12364(WorldMapArea var1) {
      if (null != var1) {
         if (this.field6685 == null || var1.method5848(-608589044) != this.field6685.method5848(-608589044)) {
            this.field6685 = var1;
            this.field6679 = 0;
            this.field6678 = false;
            this.method12369(1413072693);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwh;I)I")
   @ObfuscatedName("fl")
   public static int method12375(classWH var0, int var1) {
      if (var0 == null) {
         return var0.method12376(var1);
      } else {
         try {
            return -1390089701 * var0.field6679;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "wh.ab(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method12370() {
      if (this.field6685 == null) {
         this.field6679 = 645629804;
         this.field6678 = true;
      } else {
         if (this.field6679 * -1390089701 < -1995057897) {
            if (!this.field6680.method11871(classHE.field2778.field2773 * 1655986644, this.field6685.method5848(-608589044), (byte)113)) {
               return this.field6679 * -1390089701;
            }

            this.field6679 = 556655219;
         }

         if (-350220522 == this.field6679 * 1594460078) {
            if (!this.field6680.method11871(200712732 * classHE.field2776.field2773, this.field6685.method5848(-608589044), (byte)-22)) {
               return -1390089701 * this.field6679;
            }

            this.field6679 = 2036622097;
         }

         if (-659571991 == -670497307 * this.field6679) {
            this.field6679 = -69675072;
            this.field6678 = true;
         }
      }

      return this.field6679 * -1390089701;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method12371() {
      if (this.field6685 == null) {
         this.field6679 = 645629804;
         this.field6678 = true;
      } else {
         if (this.field6679 * -1390089701 < 33) {
            if (!this.field6680.method11871(classHE.field2778.field2773 * -1013526269, this.field6685.method5848(-608589044), (byte)-16)) {
               return this.field6679 * -1390089701;
            }

            this.field6679 = 556655219;
         }

         if (33 == this.field6679 * -1390089701) {
            if (!this.field6680.method11871(-1013526269 * classHE.field2776.field2773, this.field6685.method5848(-608589044), (byte)8)) {
               return -1390089701 * this.field6679;
            }

            this.field6679 = 1113310438;
         }

         if (66 == -1390089701 * this.field6679) {
            this.field6679 = 645629804;
            this.field6678 = true;
         }
      }

      return this.field6679 * -1390089701;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;Lgx;)V")
   @ObfuscatedName("fn")
   public static void method12365(classWH var0, WorldMapArea var1) {
      if (var0 == null) {
         var0.method12372();
      }

      if (null != var1) {
         if (var0.field6685 == null || var1.method5848(-608589044) != var0.field6685.method5848(-608589044)) {
            var0.field6685 = var1;
            var0.field6679 = 0;
            var0.field6678 = false;
            var0.method12369(1719483020);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ae")
   boolean method12373(short var1) {
      try {
         return this.field6678;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wh.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwh;Lgx;B)V")
   @ObfuscatedName("ra")
   public static void method12366(classWH var0, WorldMapArea var1, byte var2) {
      if (var0 == null) {
         var0.method12367(var1, var2);
      }

      try {
         if (null == var1) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }
         } else if (var0.field6685 == null || var1.method5848(-608589044) != var0.field6685.method5848(-608589044)) {
            var0.field6685 = var1;
            var0.field6679 = 0;
            var0.field6678 = false;
            var0.method12369(1566102928);
         } else if (var2 != 1) {
            ;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "wh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   boolean method12374() {
      return this.field6678;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int method12376(int var1) {
      try {
         return -1390089701 * this.field6679;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wh.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;B)V")
   @ObfuscatedName("az")
   void method12367(WorldMapArea var1, byte var2) {
      try {
         if (null == var1) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }
         } else if (this.field6685 == null || var1.method5871(-608589044) != this.field6685.method5848(-608589044)) {
            this.field6685 = var1;
            this.field6679 = 0;
            this.field6678 = false;
            this.method12376(1566102928);
         } else if (var2 != 1) {
            ;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "wh.az(" + ')');
      }
   }
}
