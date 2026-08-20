import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wx")
public class classWX implements classWI {
   @ObfuscatedName("af")
   Map field6789;
   @ObfuscatedSignature(descriptor = "Laaj;")
   @ObfuscatedName("az")
   final classAAJ field6787;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6788 = 8;

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod641(int var1, byte var2) {
      try {
         if (null != this.field6789) {
            if (var2 != 8) {
               throw new IllegalStateException();
            }

            classAAZ var3 = (classAAZ)this.field6789.get(var1);
            if (var3 != null) {
               if (var2 != 8) {
                  throw new IllegalStateException();
               }

               return (Integer)var3.field120;
            }
         }

         return (Integer)this.field6787.vmethod6(var1, (byte)-58);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wx.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnh;)Lvj;")
   @ObfuscatedName("ta")
   public static classVJ method12633(classNH var0) {
      classVJ var1 = var0.field4671.field6515;
      return var1 == var0.field4671 ? null : var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod644(int var1, Object var2) {
      if (null == this.field6789) {
         this.field6789 = new HashMap();
         this.field6789.put(var1, new classAAZ(var1, var2));
      } else {
         classAAZ var3 = (classAAZ)this.field6789.get(var1);
         if (null == var3) {
            this.field6789.put(var1, new classAAZ(var1, var2));
         } else {
            var3.field120 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod640(int var1, Object var2, int var3) {
      try {
         if (null == this.field6789) {
            if (var3 >= -1097503454) {
               throw new IllegalStateException();
            }

            this.field6789 = new HashMap();
            this.field6789.put(var1, new classAAZ(var1, var2));
         } else {
            classAAZ var4 = (classAAZ)this.field6789.get(var1);
            if (null == var4) {
               if (var3 >= -1097503454) {
                  return;
               }

               this.field6789.put(var1, new classAAZ(var1, var2));
            } else {
               var4.field120 = var2;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wx.af(" + ')');
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return this.field6789 == null ? Collections.emptyList().iterator() : this.field6789.values().iterator();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "wx.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method12634() {
      return this.field6789 == null ? Collections.emptyList().iterator() : this.field6789.values().iterator();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod645(int var1) {
      if (null != this.field6789) {
         classAAZ var2 = (classAAZ)this.field6789.get(var1);
         if (var2 != null) {
            return (Integer)var2.field120;
         }
      }

      return (Integer)this.field6787.vmethod6(var1, (byte)-67);
   }

   public classWX(classAAJ var1) {
      this.field6787 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod642(int var1) {
      if (null != this.field6789) {
         classAAZ var2 = (classAAZ)this.field6789.get(var1);
         if (var2 != null) {
            return (Integer)var2.field120;
         }
      }

      return (Integer)this.field6787.vmethod6(var1, (byte)-22);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod643(int var1) {
      if (null != this.field6789) {
         classAAZ var2 = (classAAZ)this.field6789.get(var1);
         if (var2 != null) {
            return (Integer)var2.field120;
         }
      }

      return (Integer)this.field6787.vmethod6(var1, (byte)-2);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method12635() {
      return this.field6789 == null ? Collections.emptyList().iterator() : this.field6789.values().iterator();
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("as")
   @Override
   public void vmethod639(int var1, Object var2) {
      if (null == this.field6789) {
         this.field6789 = new HashMap();
         this.field6789.put(var1, new classAAZ(var1, var2));
      } else {
         classAAZ var3 = (classAAZ)this.field6789.get(var1);
         if (null == var3) {
            this.field6789.put(var1, new classAAZ(var1, var2));
         } else {
            var3.field120 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ax")
   @Override
   public void vmethod646(int var1, Object var2) {
      if (null == this.field6789) {
         this.field6789 = new HashMap();
         this.field6789.put(var1, new classAAZ(var1, var2));
      } else {
         classAAZ var3 = (classAAZ)this.field6789.get(var1);
         if (null == var3) {
            this.field6789.put(var1, new classAAZ(var1, var2));
         } else {
            var3.field120 = var2;
         }
      }
   }
}
