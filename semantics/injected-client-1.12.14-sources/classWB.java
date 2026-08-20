import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wb")
public class classWB implements classVE {
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field6352 = 21;
   @ObfuscatedName("at")
   Map field6353;
   @ObfuscatedSignature(descriptor = "Lxr;")
   @ObfuscatedName("av")
   final classXR field6351;

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method11671() {
      return null == this.field6353 ? Collections.emptyList().iterator() : this.field6353.values().iterator();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltm;II)V")
   @ObfuscatedName("jp")
   public static void method11670(Buddy var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10778(var1, var1);
      } else {
         var0.world = var1 * 1697130425;
         var0.int2 = -484594278 * var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod433(int var1, int var2) {
      try {
         if (null != this.field6353) {
            classXX var3 = (classXX)this.field6353.get(var1);
            if (var3 != null) {
               if (var2 <= -1020773049) {
                  throw new IllegalStateException();
               }

               return (Integer)var3.field6647;
            }
         }

         return (Integer)this.field6351.vmethod411(var1, -1807762460);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wb.av(" + 41);
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return null == this.field6353 ? Collections.emptyList().iterator() : this.field6353.values().iterator();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wb.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod429(int var1) {
      if (null != this.field6353) {
         classXX var2 = (classXX)this.field6353.get(var1);
         if (var2 != null) {
            return (Integer)var2.field6647;
         }
      }

      return (Integer)this.field6351.vmethod411(var1, -2020945210);
   }

   public classWB(classXR var1) {
      this.field6351 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("aw")
   @Override
   public void vmethod435(int var1, Object var2) {
      if (null == this.field6353) {
         this.field6353 = new HashMap();
         this.field6353.put(var1, new classXX(var1, var2));
      } else {
         classXX var3 = (classXX)this.field6353.get(var1);
         if (null == var3) {
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            var3.field6647 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   @Override
   public int vmethod432(int var1) {
      if (null != this.field6353) {
         classXX var2 = (classXX)this.field6353.get(var1);
         if (var2 != null) {
            return (Integer)var2.field6647;
         }
      }

      return (Integer)this.field6351.vmethod411(var1, -2086685498);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod431(int var1) {
      if (null != this.field6353) {
         classXX var2 = (classXX)this.field6353.get(var1);
         if (var2 != null) {
            return (Integer)var2.field6647;
         }
      }

      return (Integer)this.field6351.vmethod411(var1, -1864119890);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("aj")
   @Override
   public void vmethod434(int var1, Object var2) {
      if (null == this.field6353) {
         this.field6353 = new HashMap();
         this.field6353.put(var1, new classXX(var1, var2));
      } else {
         classXX var3 = (classXX)this.field6353.get(var1);
         if (null == var3) {
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            var3.field6647 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ak")
   @Override
   public void vmethod436(int var1, Object var2) {
      if (null == this.field6353) {
         this.field6353 = new HashMap();
         this.field6353.put(var1, new classXX(var1, var2));
      } else {
         classXX var3 = (classXX)this.field6353.get(var1);
         if (null == var3) {
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            var3.field6647 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ay")
   @Override
   public void vmethod438(int var1, Object var2) {
      if (null == this.field6353) {
         this.field6353 = new HashMap();
         this.field6353.put(var1, new classXX(var1, var2));
      } else {
         classXX var3 = (classXX)this.field6353.get(var1);
         if (null == var3) {
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            var3.field6647 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod437(int var1, Object var2) {
      if (null == this.field6353) {
         this.field6353 = new HashMap();
         this.field6353.put(var1, new classXX(var1, var2));
      } else {
         classXX var3 = (classXX)this.field6353.get(var1);
         if (null == var3) {
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            var3.field6647 = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V")
   @ObfuscatedName("at")
   @Override
   public void vmethod430(int var1, Object var2, int var3) {
      try {
         if (null == this.field6353) {
            if (var3 >= -499519244) {
               throw new IllegalStateException();
            }

            this.field6353 = new HashMap();
            this.field6353.put(var1, new classXX(var1, var2));
         } else {
            classXX var4 = (classXX)this.field6353.get(var1);
            if (null == var4) {
               this.field6353.put(var1, new classXX(var1, var2));
            } else {
               var4.field6647 = var2;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wb.at(" + ')');
      }
   }
}
