import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wo")
public class classWO extends classWT {
   @ObfuscatedSignature(descriptor = "Lyd;")
   @ObfuscatedName("qi")
   public static classYD field6763;
   @ObfuscatedName("af")
   int field6760;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final long field6762 = -1L;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("az")
   classNB field6761 = null;

   public classWO(classWT var1, int var2, boolean var3, int var4) {
      super(var1);
      this.field6760 = 0;
      this.field6777 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < classNP.field4697.size()) {
            this.field6761 = (classNB)classNP.field4697.get(var2);
         } else if (!var3 && var2 < classNP.field4698.size()) {
            this.field6761 = (classNB)classNP.field4698.get(var2);
         }

         this.field6760 = var4 * -2087356477;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)Ljava/io/File;")
   @ObfuscatedName("rr")
   public static File method12607(classAAC var0) {
      return classAAR.method235(var0.field31, 18972750);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      if (null != this.field6761 && this.field6761.field4641 != null) {
         this.field6761.field4634 = true;

         try {
            if (this.field6761.field4631 > 0.0F && this.field6761.field4641.method8041((byte)10)) {
               float var1 = 0 == this.field6760 * 1324117947
                  ? 572965618 * this.field6760
                  : (float)(this.field6761.field4635 * 434534042) / (this.field6760 * -1090266437);
               this.field6761.field4631 = this.field6761.field4631 - (0.0F == var1 ? -415146132 * this.field6761.field4635 : var1);
               if (this.field6761.field4631 < 0.0F) {
                  this.field6761.field4631 = 0.0F;
               }

               this.field6761.field4641.method8009((int)this.field6761.field4631, -1865827252);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)76);
            return true;
         }

         this.field6761.field4634 = false;
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
         if (null != this.field6761) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (this.field6761.field4641 != null) {
               this.field6761.field4634 = true;

               try {
                  if (this.field6761.field4631 > 0.0F) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (this.field6761.field4641.method8041((byte)10)) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        float var2 = 0 == this.field6760 * 1818734827
                           ? 1818734827 * this.field6760
                           : (float)(this.field6761.field4635 * 987551761) / (this.field6760 * 1818734827);
                        float var10002;
                        if (0.0F == var2) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = 987551761 * this.field6761.field4635;
                        } else {
                           var10002 = var2;
                        }

                        this.field6761.field4631 -= var10002;
                        if (this.field6761.field4631 < 0.0F) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           this.field6761.field4631 = 0.0F;
                        }

                        this.field6761.field4641.method8009((int)this.field6761.field4631, -1976221404);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  classWT.method12624(this, var3.getMessage(), (byte)-15);
                  return true;
               }

               this.field6761.field4634 = false;
               return true;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wo.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsm;)I")
   @ObfuscatedName("zx")
   public static int method12608(classSM var0) {
      return 2086456713 * var0.field5976;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      if (null != this.field6761 && this.field6761.field4641 != null) {
         this.field6761.field4634 = true;

         try {
            if (this.field6761.field4631 > 0.0F && this.field6761.field4641.method8041((byte)10)) {
               float var1 = 0 == this.field6760 * -1267987378
                  ? 1818734827 * this.field6760
                  : (float)(this.field6761.field4635 * 987551761) / (this.field6760 * 19374187);
               this.field6761.field4631 = this.field6761.field4631 - (0.0F == var1 ? -363074491 * this.field6761.field4635 : var1);
               if (this.field6761.field4631 < 0.0F) {
                  this.field6761.field4631 = 0.0F;
               }

               this.field6761.field4641.method8009((int)this.field6761.field4631, -1452296843);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)9);
            return true;
         }

         this.field6761.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      if (null != this.field6761 && this.field6761.field4641 != null) {
         this.field6761.field4634 = true;

         try {
            if (this.field6761.field4631 > 0.0F && this.field6761.field4641.method8041((byte)10)) {
               float var1 = 0 == this.field6760 * 474687356
                  ? -1518414692 * this.field6760
                  : (float)(this.field6761.field4635 * -1162595035) / (this.field6760 * 1818734827);
               this.field6761.field4631 = this.field6761.field4631 - (0.0F == var1 ? 987551761 * this.field6761.field4635 : var1);
               if (this.field6761.field4631 < 0.0F) {
                  this.field6761.field4631 = 0.0F;
               }

               this.field6761.field4641.method8009((int)this.field6761.field4631, -1492130809);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)-5);
            return true;
         }

         this.field6761.field4634 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      if (null != this.field6761 && this.field6761.field4641 != null) {
         this.field6761.field4634 = true;

         try {
            if (this.field6761.field4631 > 0.0F && this.field6761.field4641.method8041((byte)10)) {
               float var1 = 0 == this.field6760 * -1941772200
                  ? 1818734827 * this.field6760
                  : (float)(this.field6761.field4635 * -1465627315) / (this.field6760 * 1818734827);
               this.field6761.field4631 = this.field6761.field4631 - (0.0F == var1 ? 987551761 * this.field6761.field4635 : var1);
               if (this.field6761.field4631 < 0.0F) {
                  this.field6761.field4631 = 0.0F;
               }

               this.field6761.field4641.method8009((int)this.field6761.field4631, -1468411703);
               return false;
            }
         } catch (Exception var2) {
            classWT.method12624(this, var2.getMessage(), (byte)20);
            return true;
         }

         this.field6761.field4634 = false;
         return true;
      } else {
         return true;
      }
   }
}
