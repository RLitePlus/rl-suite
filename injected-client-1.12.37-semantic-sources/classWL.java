import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wl")
public class classWL extends classWT {
   @ObfuscatedName("az")
   ArrayList field6692;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      if (this.field6692.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field6692) {
            try {
               if (classNP.field4698.contains(var2)) {
                  if (null == var2) {
                     classNP.field4698.remove(var2);
                  } else {
                     if (var2.field4641.field4751 * 917328323 > 0) {
                        var2.field4641.field4751 -= 16852715;
                     }

                     if (0 == 917328323 * var2.field4641.field4751) {
                        var2.field4641.method8040((byte)36);
                        var2.field4641.method8026((byte)0);
                        var2.field4641.method8009(0, -755079536);
                     }

                     classAC.method316(var2.field4632 * 1942111947, var2.field4630 * 450234221, 1776810699);
                     classNP.field4698.remove(var2);
                  }
               }
            } catch (Exception var4) {
               classAAU.method275(null, var4, (byte)32);
               classWT.method12624(this, var4.getMessage(), (byte)15);
               classNP.field4698.clear();
               return true;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         if (this.field6692.isEmpty()) {
            return true;
         } else {
            Iterator var2 = this.field6692.iterator();

            while (var2.hasNext()) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               MidiRequest var3 = (MidiRequest)var2.next();

               try {
                  if (classNP.field4698.contains(var3)) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (null == var3) {
                        classNP.field4698.remove(var3);
                     } else {
                        if (var3.field4641.field4751 * 917328323 > 0) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.field4641.field4751 -= 16852715;
                        }

                        if (0 == 917328323 * var3.field4641.field4751) {
                           var3.field4641.method8040((byte)-20);
                           var3.field4641.method8026((byte)0);
                           var3.field4641.method8009(0, -1059042597);
                        }

                        classAC.method316(var3.field4632 * 1942111947, var3.field4630 * 450234221, 469369778);
                        classNP.field4698.remove(var3);
                     }
                  }
               } catch (Exception var5) {
                  classAAU.method275(null, var5, (byte)122);
                  classWT.method12624(this, var5.getMessage(), (byte)48);
                  classNP.field4698.clear();
                  return true;
               }
            }

            return true;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wl.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("id")
   public static int method12379(classGN var0) {
      return var0.field2627.length;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      if (this.field6692.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field6692) {
            try {
               if (classNP.field4698.contains(var2)) {
                  if (null == var2) {
                     classNP.field4698.remove(var2);
                  } else {
                     if (var2.field4641.field4751 * 917328323 > 0) {
                        var2.field4641.field4751 -= 16852715;
                     }

                     if (0 == 917328323 * var2.field4641.field4751) {
                        var2.field4641.method8040((byte)-64);
                        var2.field4641.method8026((byte)0);
                        var2.field4641.method8009(0, -730811034);
                     }

                     classAC.method316(var2.field4632 * 1942111947, var2.field4630 * 450234221, 824226375);
                     classNP.field4698.remove(var2);
                  }
               }
            } catch (Exception var4) {
               classAAU.method275(null, var4, (byte)69);
               classWT.method12624(this, var4.getMessage(), (byte)-10);
               classNP.field4698.clear();
               return true;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      if (this.field6692.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field6692) {
            try {
               if (classNP.field4698.contains(var2)) {
                  if (null == var2) {
                     classNP.field4698.remove(var2);
                  } else {
                     if (var2.field4641.field4751 * 917328323 > 0) {
                        var2.field4641.field4751 -= 16852715;
                     }

                     if (0 == 917328323 * var2.field4641.field4751) {
                        var2.field4641.method8040((byte)-27);
                        var2.field4641.method8026((byte)0);
                        var2.field4641.method8009(0, -1611185541);
                     }

                     classAC.method316(var2.field4632 * 1942111947, var2.field4630 * 450234221, 1863757659);
                     classNP.field4698.remove(var2);
                  }
               }
            } catch (Exception var4) {
               classAAU.method275(null, var4, (byte)64);
               classWT.method12624(this, var4.getMessage(), (byte)74);
               classNP.field4698.clear();
               return true;
            }
         }

         return true;
      }
   }

   public classWL(classWT var1, ArrayList var2) {
      super(var1);
      this.field6777 = "ClearRequestTask";
      this.field6692 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      if (this.field6692.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field6692) {
            try {
               if (classNP.field4698.contains(var2)) {
                  if (null == var2) {
                     classNP.field4698.remove(var2);
                  } else {
                     if (var2.field4641.field4751 * 917328323 > 0) {
                        var2.field4641.field4751 -= 16852715;
                     }

                     if (0 == 917328323 * var2.field4641.field4751) {
                        var2.field4641.method8040((byte)8);
                        var2.field4641.method8026((byte)0);
                        var2.field4641.method8009(0, -2083927480);
                     }

                     classAC.method316(var2.field4632 * 1942111947, var2.field4630 * 450234221, 1445320128);
                     classNP.field4698.remove(var2);
                  }
               }
            } catch (Exception var4) {
               classAAU.method275(null, var4, (byte)59);
               classWT.method12624(this, var4.getMessage(), (byte)-17);
               classNP.field4698.clear();
               return true;
            }
         }

         return true;
      }
   }
}
