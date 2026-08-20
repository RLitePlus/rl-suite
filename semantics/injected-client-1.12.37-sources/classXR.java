import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xr")
public class classXR extends classUY implements classUT {
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("af")
   final classID field6924 = new classID(64);
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   final AbstractArchive field6923;
   @ObfuscatedName("ab")
   final int field6922;
   @ObfuscatedName("dc")
   static int field6925;

   @ObfuscatedSignature(descriptor = "(II)Lur;")
   @ObfuscatedName("az")
   @Override
   protected classUR vmethod606(int var1, int var2) {
      try {
         synchronized (this.field6924) {
            classUF var3 = (classUF)this.field6924.method6147(var1);
            if (null == var3) {
               if (var2 == -600712840) {
                  throw new IllegalStateException();
               }

               var3 = this.method12877(var1, -684085159);
               this.field6924.method6154(var3, var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "xr.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("ag")
   @Override
   protected classUR vmethod607(int var1) {
      synchronized (this.field6924) {
         classUF var2 = (classUF)this.field6924.method6147(var1);
         if (null == var2) {
            var2 = this.method12877(var1, 504848329);
            this.field6924.method6154(var2, var1);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Luf;")
   @ObfuscatedName("aq")
   classUF method12877(int var1, int var2) {
      try {
         byte[] var3 = this.field6923.method11867(1925511657 * this.field6922, var1, -1784809144);
         classUF var4 = new classUF(var1);
         if (null != var3) {
            var4.method11510(new Buffer(var3), -1830946202);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "xr.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("as")
   @Override
   protected classUR vmethod608(int var1) {
      synchronized (this.field6924) {
         classUF var2 = (classUF)this.field6924.method6147(var1);
         if (null == var2) {
            var2 = this.method12877(var1, 294972746);
            this.field6924.method6154(var2, var1);
         }

         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxr;)Ljava/util/Iterator;")
   @ObfuscatedName("oa")
   public static Iterator method12890(classXR var0) {
      if (var0 == null) {
         var0.method12883();
      }

      return new classXI(var0);
   }

   @Override
   public Iterator iterator() {
      try {
         return new classXI(this);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "xr.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method12891() {
      return new classXI(this);
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("ax")
   @Override
   protected classUR vmethod609(int var1) {
      synchronized (this.field6924) {
         classUF var2 = (classUF)this.field6924.method6147(var1);
         if (null == var2) {
            var2 = this.method12877(var1, -438976494);
            this.field6924.method6154(var2, var1);
         }

         return var2;
      }
   }

   public classXR(classKX var1, int var2, classXO var3, AbstractArchive var4) {
      super(var1, var3, var4 != null ? var4.method11868(var2, -785956127) : 0);
      this.field6923 = var4;
      this.field6922 = 472608345 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void method12883() {
      synchronized (this.field6924) {
         this.field6924.method6167();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luf;")
   @ObfuscatedName("aw")
   classUF method12878(int var1) {
      byte[] var2 = this.field6923.method11867(1925511657 * this.field6922, var1, -2084427893);
      classUF var3 = new classUF(var1);
      if (null != var2) {
         var3.method11510(new Buffer(var2), -1830946202);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxr;I)Luf;")
   @ObfuscatedName("ml")
   public static classUF method12879(classXR var0, int var1) {
      byte[] var2 = var0.field6923.method11867(1925511657 * var0.field6922, var1, -1887504987);
      classUF var3 = new classUF(var1);
      if (null != var2) {
         var3.method11510(new Buffer(var2), -1830946202);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxr;I)Luf;")
   @ObfuscatedName("ik")
   public static classUF method12880(classXR var0, int var1) {
      byte[] var2 = var0.field6923.method11867(1925511657 * var0.field6922, var1, -1404446809);
      classUF var3 = new classUF(var1);
      if (null != var2) {
         var3.method11510(new Buffer(var2), -1830946202);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxr;B)V")
   @ObfuscatedName("ra")
   public static void method12884(classXR var0, byte var1) {
      if (var0 == null) {
         var0.method12889(var1);
      } else {
         try {
            synchronized (var0.field6924) {
               var0.field6924.method6167();
            }
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "xr.ad(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luf;")
   @ObfuscatedName("ai")
   classUF method12881(int var1) {
      byte[] var2 = this.field6923.method11867(1925511657 * this.field6922, var1, -1046223987);
      classUF var3 = new classUF(var1);
      if (null != var2) {
         var3.method11510(new Buffer(var2), -1830946202);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public void method12885() {
      synchronized (this.field6924) {
         this.field6924.method6167();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method12886() {
      synchronized (this.field6924) {
         this.field6924.method6167();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public void method12887() {
      synchronized (this.field6924) {
         this.field6924.method6167();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method12888() {
      synchronized (this.field6924) {
         this.field6924.method6167();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxr;I)Luf;")
   @ObfuscatedName("ff")
   public static classUF method12882(classXR var0, int var1) {
      byte[] var2 = var0.field6923.method11867(-324184084 * var0.field6922, var1, -1908654534);
      classUF var3 = new classUF(var1);
      if (null != var2) {
         var3.method11510(new Buffer(var2), -1830946202);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ad")
   public void method12889(byte var1) {
      try {
         synchronized (this.field6924) {
            this.field6924.method6168();
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "xr.ad(" + ')');
      }
   }
}
