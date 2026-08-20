import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wp")
public class classWP extends classWT {
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("az")
   MidiRequest field6765 = null;
   @ObfuscatedName("af")
   int field6764 = 0;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      if (null != this.field6765 && null != this.field6765.field4641) {
         this.field6765.field4634 = true;

         try {
            if (this.field6765.field4631 < 987551761 * this.field6765.field4635 && this.field6765.field4641.method8041((byte)10)) {
               float var1 = 0 == 1635624515 * this.field6764
                  ? this.field6764 * 1635624515
                  : (float)(987551761 * this.field6765.field4635) / (this.field6764 * 1635624515);
               this.field6765.field4631 = this.field6765.field4631 + (0.0F == var1 ? 987551761 * this.field6765.field4635 : var1);
               if (this.field6765.field4631 > 987551761 * this.field6765.field4635) {
                  this.field6765.field4631 = 987551761 * this.field6765.field4635;
               }

               this.field6765.field4641.method8009((int)this.field6765.field4631, -2043763359);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)5);
            return true;
         }

         this.field6765.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      if (null != this.field6765 && null != this.field6765.field4641) {
         this.field6765.field4634 = true;

         try {
            if (this.field6765.field4631 < 1492954283 * this.field6765.field4635 && this.field6765.field4641.method8041((byte)10)) {
               float var1 = 0 == 1635624515 * this.field6764
                  ? this.field6764 * -925097286
                  : (float)(987551761 * this.field6765.field4635) / (this.field6764 * -411073265);
               this.field6765.field4631 = this.field6765.field4631 + (0.0F == var1 ? 987551761 * this.field6765.field4635 : var1);
               if (this.field6765.field4631 > 987551761 * this.field6765.field4635) {
                  this.field6765.field4631 = -1264233966 * this.field6765.field4635;
               }

               this.field6765.field4641.method8009((int)this.field6765.field4631, -913279221);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)-55);
            return true;
         }

         this.field6765.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;Lpi;)V")
   @ObfuscatedName("ro")
   public static void method12609(TileItem var0, PlayerCompositionColorTextureOverride var1) {
      if (var0 == null) {
         var0.vmethod92();
      }

      var0.field1559 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      if (null != this.field6765 && null != this.field6765.field4641) {
         this.field6765.field4634 = true;

         try {
            if (this.field6765.field4631 < 987551761 * this.field6765.field4635 && this.field6765.field4641.method8041((byte)10)) {
               float var1 = 0 == 1635624515 * this.field6764
                  ? this.field6764 * 1635624515
                  : (float)(987551761 * this.field6765.field4635) / (this.field6764 * -1429153329);
               this.field6765.field4631 = this.field6765.field4631 + (0.0F == var1 ? 987551761 * this.field6765.field4635 : var1);
               if (this.field6765.field4631 > 987551761 * this.field6765.field4635) {
                  this.field6765.field4631 = 987551761 * this.field6765.field4635;
               }

               this.field6765.field4641.method8009((int)this.field6765.field4631, -1903871003);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)-35);
            return true;
         }

         this.field6765.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         if (null != this.field6765) {
            if (null != this.field6765.field4641) {
               this.field6765.field4634 = true;

               try {
                  if (this.field6765.field4631 < 987551761 * this.field6765.field4635) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (this.field6765.field4641.method8041((byte)10)) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        float var10000;
                        if (0 == 1635624515 * this.field6764) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10000 = this.field6764 * 1635624515;
                        } else {
                           var10000 = (float)(987551761 * this.field6765.field4635) / (this.field6764 * 1635624515);
                        }

                        float var2 = var10000;
                        float var10002;
                        if (0.0F == var2) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = 987551761 * this.field6765.field4635;
                        } else {
                           var10002 = var2;
                        }

                        this.field6765.field4631 += var10002;
                        if (this.field6765.field4631 > 987551761 * this.field6765.field4635) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           this.field6765.field4631 = 987551761 * this.field6765.field4635;
                        }

                        this.field6765.field4641.method8009((int)this.field6765.field4631, -813147579);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  classWT.method12624(this, var3.getMessage(), (byte)23);
                  return true;
               }

               this.field6765.field4634 = false;
               return true;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "wp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      if (null != this.field6765 && null != this.field6765.field4641) {
         this.field6765.field4634 = true;

         try {
            if (this.field6765.field4631 < 987551761 * this.field6765.field4635 && this.field6765.field4641.method8041((byte)10)) {
               float var1 = 0 == 1635624515 * this.field6764
                  ? this.field6764 * 1635624515
                  : (float)(987551761 * this.field6765.field4635) / (this.field6764 * 263904644);
               this.field6765.field4631 = this.field6765.field4631 + (0.0F == var1 ? 987551761 * this.field6765.field4635 : var1);
               if (this.field6765.field4631 > -575862831 * this.field6765.field4635) {
                  this.field6765.field4631 = -2025388868 * this.field6765.field4635;
               }

               this.field6765.field4641.method8009((int)this.field6765.field4631, -1171100049);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)117);
            return true;
         }

         this.field6765.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   public classWP(classWT var1, int var2, boolean var3, int var4) {
      super(var1);
      this.field6777 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < classNP.field4697.size()) {
            this.field6765 = (MidiRequest)classNP.field4697.get(var2);
         } else if (!var3 && var2 < classNP.field4698.size()) {
            this.field6765 = (MidiRequest)classNP.field4698.get(var2);
         }

         this.field6764 = -2025105813 * var4;
      }
   }
}
