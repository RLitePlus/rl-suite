import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mg")
public final class DemotingHashTable {
   @ObfuscatedName("at")
   int remaining;
   @ObfuscatedName("av")
   int capacity;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("ag")
   IterableNodeHashTable hashTable;
   @ObfuscatedSignature(descriptor = "Lrn;")
   @ObfuscatedName("an")
   IterableDualNodeQueue queue = new IterableDualNodeQueue();
   @ObfuscatedSignature(descriptor = "Lmq;")
   @ObfuscatedName("ae")
   classMQ field3843;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;JI)V")
   @ObfuscatedName("ah")
   public void method7414(Object var1, long var2, int var4) {
      if (var4 > this.capacity) {
         throw new IllegalStateException();
      } else {
         this.method7403(var2);
         this.remaining -= var4;

         while (this.remaining < 0) {
            Wrapper var5 = (Wrapper)IterableDualNodeQueue.method9708(this.queue);
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.isSoft()) {
            }

            this.removeWrapper(var5);
            if (this.field3843 != null) {
               this.field3843.method7458(var5.get());
            }
         }

         DirectWrapper var6 = new DirectWrapper(var1, var4);
         this.hashTable.put((Node)var6, var2);
         this.queue.add(var6);
         var6.keyDual = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmd;)V")
   @ObfuscatedName("ad")
   void method7406(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.remaining = this.remaining + var1.size;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object get(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            this.remaining = this.remaining + var3.size;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.size);
               this.hashTable.put((Node)var5, var3.key);
               this.queue.add(var5);
               var5.keyDual = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               this.queue.add(var3);
               var3.keyDual = 0L;
            }

            return var4;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;)Ltz;")
   @ObfuscatedName("vi")
   public static User method7416(UserList var0, Username var1) {
      if (var0 == null) {
         var0.method10743(var1);
      }

      return var0.addLast(var1, null, -1142342067);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("az")
   void method7403(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      this.removeWrapper(var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmg;J)Ljava/lang/Object;")
   @ObfuscatedName("yu")
   public static Object method7400(DemotingHashTable var0, long var1) {
      Wrapper var3 = (Wrapper)var0.hashTable.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            var0.remaining = var0.remaining + var3.size;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.size);
               var0.hashTable.put((Node)var5, var3.key);
               var0.queue.add(var5);
               var5.keyDual = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               var0.queue.add(var3);
               var3.keyDual = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("an")
   public void method7410(Object var1, long var2) {
      this.put(var1, var2, 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;JI)V")
   @ObfuscatedName("ae")
   public void put(Object var1, long var2, int var4) {
      if (var4 > this.capacity) {
         throw new IllegalStateException();
      } else {
         this.method7403(var2);
         this.remaining -= var4;

         while (this.remaining < 0) {
            Wrapper var5 = (Wrapper)IterableDualNodeQueue.method9708(this.queue);
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.isSoft()) {
            }

            this.removeWrapper(var5);
            if (this.field3843 != null) {
               this.field3843.method7458(var5.get());
            }
         }

         DirectWrapper var6 = new DirectWrapper(var1, var4);
         this.hashTable.put((Node)var6, var2);
         this.queue.add(var6);
         var6.keyDual = 0L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIII)I")
   @ObfuscatedName("oq")
   public static int method7425(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method5587(var1, var1, var1, var1);
      }

      return var0.method5567(var1, var2, var3) - var0.method5567(var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("ax")
   public void method7411(Object var1, long var2) {
      this.put(var1, var2, 1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void clear() {
      this.queue.clear();
      this.hashTable.clear();
      this.remaining = this.capacity;
   }

   @ObfuscatedSignature(descriptor = "(Lmd;)V")
   @ObfuscatedName("ag")
   void removeWrapper(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.remaining = this.remaining + var1.size;
      }
   }

   public DemotingHashTable(int var1) {
      this(var1, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lmd;)V")
   @ObfuscatedName("ai")
   void method7408(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.remaining = this.remaining + var1.size;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmg;J)Ljava/lang/Object;")
   @ObfuscatedName("we")
   public static Object method7401(DemotingHashTable var0, long var1) {
      Wrapper var3 = (Wrapper)var0.hashTable.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            var0.remaining = var0.remaining + var3.size;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.size);
               var0.hashTable.put((Node)var5, var3.key);
               var0.queue.add(var5);
               var5.keyDual = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               var0.queue.add(var3);
               var3.keyDual = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("au")
   void method7404(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      this.removeWrapper(var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Z")
   @ObfuscatedName("mj")
   public static boolean method7424(classOO var0) {
      return var0 == null ? var0.method8544() : var0.method8538((byte)0) && var0.field4663 * 480497051 % 60 < 30;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method7422() {
      this.queue.clear();
      this.hashTable.clear();
      this.remaining = this.capacity;
   }

   @ObfuscatedSignature(descriptor = "(Lmd;)V")
   @ObfuscatedName("as")
   void method7409(Wrapper var1) {
      if (var1 != null) {
         var1.remove();
         var1.removeDual();
         this.remaining = this.remaining + var1.size;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("ab")
   public void method7412(Object var1, long var2) {
      this.put(var1, var2, 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmg;)V")
   @ObfuscatedName("wd")
   public static void method7423(DemotingHashTable var0) {
      var0.queue.clear();
      var0.hashTable.clear();
      var0.remaining = var0.capacity;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("at")
   void remove(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      this.removeWrapper(var3);
   }

   @ObfuscatedSignature(descriptor = "(Lmg;I)V")
   @ObfuscatedName("ds")
   public static void method7417(DemotingHashTable var0, int var1) {
      if (var0 == null) {
         var0.demote(var1);
      } else {
         for (Wrapper var2 = (Wrapper)var0.queue.method9710(); var2 != null; var2 = (Wrapper)var0.queue.last()) {
            if (var2.isSoft()) {
               if (var2.get() == null) {
                  var2.remove();
                  var2.removeDual();
                  var0.remaining = var0.remaining + var2.size;
               }
            } else if (++var2.keyDual > var1) {
               SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size);
               var0.hashTable.put((Node)var3, var2.key);
               IterableDualNodeQueue.DualNodeDeque_addBefore(var3, var2);
               var2.remove();
               var2.removeDual();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("ar")
   public void method7413(Object var1, long var2) {
      this.put(var1, var2, 1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method7418(int var1) {
      for (Wrapper var2 = (Wrapper)this.queue.method9710(); var2 != null; var2 = (Wrapper)this.queue.last()) {
         if (var2.isSoft()) {
            if (var2.get() == null) {
               var2.remove();
               var2.removeDual();
               this.remaining = this.remaining + var2.size;
            }
         } else if (++var2.keyDual > var1) {
            SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size);
            this.hashTable.put((Node)var3, var2.key);
            IterableDualNodeQueue.DualNodeDeque_addBefore(var3, var2);
            var2.remove();
            var2.removeDual();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmg;I)V")
   @ObfuscatedName("rr")
   public static void method7419(DemotingHashTable var0, int var1) {
      if (var0 == null) {
         var0.method7422();
      } else {
         for (Wrapper var2 = (Wrapper)var0.queue.method9710(); var2 != null; var2 = (Wrapper)var0.queue.last()) {
            if (var2.isSoft()) {
               if (var2.get() == null) {
                  var2.remove();
                  var2.removeDual();
                  var0.remaining = var0.remaining + var2.size;
               }
            } else if (++var2.keyDual > var1) {
               SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size);
               var0.hashTable.put((Node)var3, var2.key);
               IterableDualNodeQueue.DualNodeDeque_addBefore(var3, var2);
               var2.remove();
               var2.removeDual();
            }
         }
      }
   }

   public DemotingHashTable(int var1, int var2) {
      this.capacity = var1;
      this.remaining = var1;
      byte var3 = 1;

      while (var3 + var3 < var1 && var3 < var2) {
         var3 += var3;
      }

      this.hashTable = new IterableNodeHashTable(var3);
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("aw")
   public Object method7402(long var1) {
      Wrapper var3 = (Wrapper)this.hashTable.get(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.get();
         if (var4 == null) {
            var3.remove();
            var3.removeDual();
            this.remaining = this.remaining + var3.size;
            return null;
         } else {
            if (var3.isSoft()) {
               DirectWrapper var5 = new DirectWrapper(var4, var3.size);
               this.hashTable.put((Node)var5, var3.key);
               this.queue.add(var5);
               var5.keyDual = 0L;
               var3.remove();
               var3.removeDual();
            } else {
               this.queue.add(var3);
               var3.keyDual = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void demote(int var1) {
      for (Wrapper var2 = (Wrapper)this.queue.last(); var2 != null; var2 = (Wrapper)this.queue.method9707()) {
         if (var2.vmethod301()) {
            if (var2.vmethod306() == null) {
               var2.vmethod138();
               var2.method11344();
               this.remaining = this.remaining + var2.size;
            }
         } else if (++var2.keyDual > var1) {
            SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size);
            this.hashTable.method8942(var3, var2.key);
            IterableDualNodeQueue.method9698(var3, var2);
            var2.method11657();
            var2.method11347();
         }
      }
   }
}
