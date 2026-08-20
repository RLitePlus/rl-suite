import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vp")
public class classVP {
   @ObfuscatedName("at")
   public final Object field6228;
   @ObfuscatedName("av")
   public final Object field6227;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6229 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("el")
   static final int field6230 = 100;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvp;Ljava/lang/Object;)Z")
   @ObfuscatedName("qa")
   public static boolean method11351(classVP var0, Object var1) {
      if (var0 == null) {
         var0.toString();
      }

      if (null != var1 && var1 instanceof classVP) {
         classVP var2 = (classVP)var1;
         if (null == var0.field6227) {
            if (null != var2.field6227) {
               return false;
            }
         } else if (!var0.field6227.equals(var2.field6227)) {
            return false;
         }

         if (var0.field6228 == null) {
            if (null != var2.field6228) {
               return false;
            }
         } else if (!var0.field6228.equals(var2.field6228)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method11354() {
      int var1 = 0;
      if (null != this.field6227) {
         var1 += this.field6227.hashCode();
      }

      if (null != this.field6228) {
         var1 += 31 * this.field6228.hashCode();
      }

      return var1;
   }

   public classVP(Object var1, Object var2) {
      this.field6227 = var1;
      this.field6228 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (null != var1 && var1 instanceof classVP) {
            classVP var2 = (classVP)var1;
            if (null == this.field6227) {
               if (null != var2.field6227) {
                  return false;
               }
            } else if (!this.field6227.equals(var2.field6227)) {
               return false;
            }

            if (this.field6228 == null) {
               if (null != var2.field6228) {
                  return false;
               }
            } else if (!this.field6228.equals(var2.field6228)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vp.equals(" + ')');
      }
   }

   @Override
   public int hashCode() {
      try {
         int var1 = 0;
         if (null != this.field6227) {
            var1 += this.field6227.hashCode();
         }

         if (null != this.field6228) {
            var1 += 31 * this.field6228.hashCode();
         }

         return var1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vp.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method11352(Object var1) {
      if (null != var1 && var1 instanceof classVP) {
         classVP var2 = (classVP)var1;
         if (null == this.field6227) {
            if (null != var2.field6227) {
               return false;
            }
         } else if (!this.field6227.equals(var2.field6227)) {
            return false;
         }

         if (this.field6228 == null) {
            if (null != var2.field6228) {
               return false;
            }
         } else if (!this.field6228.equals(var2.field6228)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method11348() {
      return this.field6227 + ", " + this.field6228;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method11349() {
      return this.field6227 + ", " + this.field6228;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method11350() {
      return this.field6227 + ", " + this.field6228;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvp;Ljava/lang/Object;)Z")
   @ObfuscatedName("wz")
   public static boolean method11353(classVP var0, Object var1) {
      if (var0 == null) {
         var0.method11352(var1);
      }

      if (null != var1 && var1 instanceof classVP) {
         classVP var2 = (classVP)var1;
         if (null == var0.field6227) {
            if (null != var2.field6227) {
               return false;
            }
         } else if (!var0.field6227.equals(var2.field6227)) {
            return false;
         }

         if (var0.field6228 == null) {
            if (null != var2.field6228) {
               return false;
            }
         } else if (!var0.field6228.equals(var2.field6228)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      try {
         return this.field6227 + ", " + this.field6228;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "vp.toString(" + ')');
      }
   }
}
