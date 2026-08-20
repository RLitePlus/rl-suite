import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wq")
public class classWQ extends classUM implements classMK {
   @ObfuscatedName("an")
   final int field6440;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field6442 = 9;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ag")
   final AbstractArchive field6441;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field6443 = 9;
   @ObfuscatedSignature(descriptor = "Lmg;")
   @ObfuscatedName("at")
   final DemotingHashTable field6439 = new DemotingHashTable(64);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)[S")
   @ObfuscatedName("cv")
   public static short[] method11844(NPCComposition var0) {
      return var0.recolorFrom;
   }

   @ObfuscatedSignature(descriptor = "(II)Lue;")
   @ObfuscatedName("av")
   @Override
   protected classUE vmethod414(int var1, int var2) {
      try {
         synchronized (this.field6439) {
            class535 var3 = (class535)this.field6439.get(var1);
            if (null == var3) {
               var3 = this.method11832(var1, (byte)-81);
               this.field6439.method7410(var3, var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "wq.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwq;I)Luo;")
   @ObfuscatedName("zk")
   public static class535 method11831(classWQ var0, int var1) {
      byte[] var2 = var0.field6441.getFile(208173160 * var0.field6440, var1, 1274395278);
      class535 var3 = new class535(var1);
      if (null != var2) {
         var3.method11119(new Buffer(var2), 673987007);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(IB)Luo;")
   @ObfuscatedName("as")
   class535 method11832(int var1, byte var2) {
      try {
         byte[] var3 = this.field6441.getFile(-469179985 * this.field6440, var1, 269531577);
         class535 var4 = new class535(var1);
         if (null != var3) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var4.method11119(new Buffer(var3), 558607637);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   public void method11837(byte var1) {
      try {
         synchronized (this.field6439) {
            this.field6439.clear();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wq.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwq;I)Luo;")
   @ObfuscatedName("ic")
   public static class535 method11833(classWQ var0, int var1) {
      byte[] var2 = var0.field6441.getFile(-469179985 * var0.field6440, var1, -1451993704);
      class535 var3 = new class535(var1);
      if (null != var2) {
         var3.method11119(new Buffer(var2), 2025653584);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;)Ldd;")
   @ObfuscatedName("sj")
   public static WorldView method11843(Actor var0) {
      return var0.worldViewId * -1495112917 != -1
         ? WorldViewManager.method2901(client.worldViewManager, var0.worldViewId * 1753020269, (byte)1)
         : Occluder.topLevelWorldView;
   }

   @Override
   public Iterator iterator() {
      try {
         return new classWZ(this);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wq.iterator(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwq;I)Luo;")
   @ObfuscatedName("se")
   public static class535 method11834(classWQ var0, int var1) {
      byte[] var2 = var0.field6441.getFile(-469179985 * var0.field6440, var1, -1757753987);
      class535 var3 = new class535(var1);
      if (null != var2) {
         var3.method11119(new Buffer(var2), 997638631);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Luo;")
   @ObfuscatedName("ah")
   class535 method11835(int var1) {
      byte[] var2 = this.field6441.getFile(892708494 * this.field6440, var1, 488128314);
      class535 var3 = new class535(var1);
      if (null != var2) {
         var3.method11119(new Buffer(var2), -2064860522);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cp")
   public Iterator method11839() {
      return new classWZ(this);
   }

   @ObfuscatedSignature(descriptor = "(I)Lue;")
   @ObfuscatedName("ae")
   @Override
   protected classUE vmethod415(int var1) {
      synchronized (this.field6439) {
         class535 var2 = (class535)this.field6439.get(var1);
         if (null == var2) {
            var2 = this.method11832(var1, (byte)-5);
            this.field6439.method7410(var2, var1);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lue;")
   @ObfuscatedName("aj")
   @Override
   protected classUE vmethod416(int var1) {
      synchronized (this.field6439) {
         class535 var2 = (class535)this.field6439.get(var1);
         if (null == var2) {
            var2 = this.method11832(var1, (byte)-95);
            this.field6439.method7410(var2, var1);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luo;")
   @ObfuscatedName("ab")
   class535 method11836(int var1) {
      byte[] var2 = this.field6441.getFile(-674676042 * this.field6440, var1, -1504932381);
      class535 var3 = new class535(var1);
      if (null != var2) {
         var3.method11119(new Buffer(var2), -61627658);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;)Lvz;")
   @ObfuscatedName("lb")
   public static Node method11842(IterableNodeHashTable var0) {
      if (var0.index > 0 && var0.current != var0.buckets[var0.index - 1]) {
         Node var2 = var0.current;
         var0.current = var2.previous;
         return var2;
      } else {
         while (var0.index < var0.size) {
            Node var1 = var0.buckets[var0.index++].previous;
            if (var1 != var0.buckets[var0.index - 1]) {
               var0.current = var1.previous;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cg")
   public Iterator method11840() {
      return new classWZ(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;I)S")
   @ObfuscatedName("yf")
   public static short method11845(NPCComposition var0, int var1) {
      return null != var0.recolorFrom && var1 < var0.recolorFrom.length ? var0.recolorFrom[var1] : -1;
   }

   public classWQ(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
      super(var1, var3, null != var4 ? AbstractArchive.method9046(var4, var2, (byte)-61) : 0);
      this.field6441 = var4;
      this.field6440 = var2 * -537848497;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method11841() {
      return new classWZ(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method11838() {
      synchronized (this.field6439) {
         this.field6439.clear();
      }
   }
}
