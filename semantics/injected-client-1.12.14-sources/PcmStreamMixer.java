import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dr")
public class PcmStreamMixer extends PcmStream {
   @ObfuscatedName("an")
   int field1476;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("av")
   NodeDeque subStreams = new NodeDeque();
   @ObfuscatedName("ag")
   int field1473;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("at")
   NodeDeque field1475 = new NodeDeque();

   @ObfuscatedSignature(descriptor = "(Lvz;Lef;)V")
   @ObfuscatedName("an")
   void method3430(Node var1, PcmStreamMixerListener var2) {
      while (var1 != this.field1475.sentinel && ((PcmStreamMixerListener)var1).field1567 <= var2.field1567) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field1476 = ((PcmStreamMixerListener)this.field1475.sentinel.previous).field1567;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   protected int vmethod172() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("av")
   public final synchronized void addSubStream(PcmStream var1) {
      this.subStreams.addLast((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bw")
   @Override
   public final synchronized void vmethod175(int[] var1, int var2, int var3) {
      while (this.field1476 >= 0) {
         if (this.field1473 + var3 < this.field1476) {
            this.field1473 += var3;
            this.method3436(var1, var2, var3);
            return;
         }

         int var4 = this.field1476 - this.field1473;
         this.method3436(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1473 += var4;
         this.method3428();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1475.last();
         synchronized (var5) {
            int var7 = var5.method3706(this);
            if (var7 < 0) {
               var5.field1567 = 0;
               this.method3434(var5);
            } else {
               var5.field1567 = var7;
               this.method3430(var5.previous, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method3436(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ap")
   @Override
   public final synchronized void fill(int[] var1, int var2, int var3) {
      while (this.field1476 >= 0) {
         if (this.field1473 + var3 < this.field1476) {
            this.field1473 += var3;
            this.method3436(var1, var2, var3);
            return;
         }

         int var4 = this.field1476 - this.field1473;
         this.method3436(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1473 += var4;
         this.method3428();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1475.last();
         synchronized (var5) {
            int var7 = var5.method3706(this);
            if (var7 < 0) {
               var5.field1567 = 0;
               this.method3434(var5);
            } else {
               var5.field1567 = var7;
               this.method3430(var5.previous, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method3436(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lef;)V")
   @ObfuscatedName("ae")
   void method3434(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field1475.sentinel.previous;
      if (var2 == this.field1475.sentinel) {
         this.field1476 = -1;
      } else {
         this.field1476 = ((PcmStreamMixerListener)var2).field1567;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("yn")
   public void method3444(PcmStream var1) {
      this.addSubStream(var1);
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bk")
   @Override
   protected PcmStream vmethod163() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bo")
   @Override
   protected PcmStream vmethod169() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod171() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(Lef;)V")
   @ObfuscatedName("be")
   void method3435(PcmStreamMixerListener var1) {
      var1.remove();
      var1.remove2();
      Node var2 = this.field1475.sentinel.previous;
      if (var2 == this.field1475.sentinel) {
         this.field1476 = -1;
      } else {
         this.field1476 = ((PcmStreamMixerListener)var2).field1567;
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   void method3436(int[] var1, int var2, int var3) {
      for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         PcmStream.method3390(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   @Override
   public final synchronized void skip(int var1) {
      while (this.field1476 >= 0) {
         if (this.field1473 + var1 < this.field1476) {
            this.field1473 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field1476 - this.field1473;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field1473 += var2;
         this.method3428();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1475.last();
         synchronized (var3) {
            int var5 = var3.method3706(this);
            if (var5 < 0) {
               var3.field1567 = 0;
               this.method3434(var3);
            } else {
               var3.field1567 = var5;
               this.method3430(var3.previous, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.skipSubStreams(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void skipSubStreams(int var1) {
      for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ad")
   public final synchronized void method3417(PcmStream var1) {
      this.subStreams.addLast((Node)var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldr;)V")
   @ObfuscatedName("gi")
   public static void method3425(PcmStreamMixer var0) {
      if (var0.field1473 > 0) {
         for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)var0.field1475.last();
            var1 != null;
            var1 = (PcmStreamMixerListener)var0.field1475.previous()
         ) {
            var1.field1567 = var1.field1567 - var0.field1473;
         }

         var0.field1476 = var0.field1476 - var0.field1473;
         var0.field1473 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ai")
   public final synchronized void method3418(PcmStream var1) {
      this.subStreams.addLast((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("as")
   public final synchronized void method3419(PcmStream var1) {
      this.subStreams.addLast((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ac")
   public final synchronized void method3420(PcmStream var1) {
      this.subStreams.addLast((Node)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ab")
   public final synchronized void method3421(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ax")
   public final synchronized void method3422(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ar")
   public final synchronized void method3423(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("aj")
   @Override
   protected PcmStream firstSubStream() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method3426() {
      if (this.field1473 > 0) {
         for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1475.last();
            var1 != null;
            var1 = (PcmStreamMixerListener)this.field1475.previous()
         ) {
            var1.field1567 = var1.field1567 - this.field1473;
         }

         this.field1476 = this.field1476 - this.field1473;
         this.field1473 = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldr;[III)V")
   @ObfuscatedName("au")
   public static void method3437(PcmStreamMixer var0, int[] var1, int var2, int var3) {
      for (PcmStream var4 = (PcmStream)var0.subStreams.last(); var4 != null; var4 = (PcmStream)var0.subStreams.previous()) {
         PcmStream.method3390(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   public final synchronized void vmethod176(int var1) {
      while (this.field1476 >= 0) {
         if (this.field1473 + var1 < this.field1476) {
            this.field1473 += var1;
            this.skipSubStreams(var1);
            return;
         }

         int var2 = this.field1476 - this.field1473;
         this.skipSubStreams(var2);
         var1 -= var2;
         this.field1473 += var2;
         this.method3428();
         PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1475.last();
         synchronized (var3) {
            int var5 = var3.method3706(this);
            if (var5 < 0) {
               var3.field1567 = 0;
               this.method3434(var3);
            } else {
               var3.field1567 = var5;
               this.method3430(var3.previous, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.skipSubStreams(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   void method3427() {
      if (this.field1473 > 0) {
         for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1475.last();
            var1 != null;
            var1 = (PcmStreamMixerListener)this.field1475.previous()
         ) {
            var1.field1567 = var1.field1567 - this.field1473;
         }

         this.field1476 = this.field1476 - this.field1473;
         this.field1473 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvz;Lef;)V")
   @ObfuscatedName("aa")
   void method3431(Node var1, PcmStreamMixerListener var2) {
      while (var1 != this.field1475.sentinel && ((PcmStreamMixerListener)var1).field1567 <= var2.field1567) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field1476 = ((PcmStreamMixerListener)this.field1475.sentinel.previous).field1567;
   }

   @ObfuscatedSignature(descriptor = "(Lvz;Lef;)V")
   @ObfuscatedName("aq")
   void method3432(Node var1, PcmStreamMixerListener var2) {
      while (var1 != this.field1475.sentinel && ((PcmStreamMixerListener)var1).field1567 <= var2.field1567) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field1476 = ((PcmStreamMixerListener)this.field1475.sentinel.previous).field1567;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bm")
   void method3438(int[] var1, int var2, int var3) {
      for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         PcmStream.method3390(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bz")
   @Override
   protected PcmStream vmethod166() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bb")
   @Override
   protected PcmStream vmethod164() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("ak")
   @Override
   protected PcmStream nextSubStream() {
      return (PcmStream)this.subStreams.last();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method3428() {
      if (this.field1473 > 0) {
         for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1475.last();
            var1 != null;
            var1 = (PcmStreamMixerListener)this.field1475.previous()
         ) {
            var1.field1567 = var1.field1567 - this.field1473;
         }

         this.field1476 = this.field1476 - this.field1473;
         this.field1473 = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldr;I)V")
   @ObfuscatedName("yq")
   public static void method3441(PcmStreamMixer var0, int var1) {
      for (PcmStream var2 = (PcmStream)var0.subStreams.last(); var2 != null; var2 = (PcmStream)var0.subStreams.previous()) {
         var2.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bg")
   @Override
   protected PcmStream vmethod167() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bs")
   @Override
   protected PcmStream vmethod168() {
      return (PcmStream)this.subStreams.previous();
   }

   @ObfuscatedSignature(descriptor = "(Lvz;Lef;)V")
   @ObfuscatedName("ao")
   void method3433(Node var1, PcmStreamMixerListener var2) {
      while (var1 != this.field1475.sentinel && ((PcmStreamMixerListener)var1).field1567 <= var2.field1567) {
         var1 = var1.previous;
      }

      NodeDeque.NodeDeque_addBefore(var2, var1);
      this.field1476 = ((PcmStreamMixerListener)this.field1475.sentinel.previous).field1567;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ay")
   void updateSubStreams(int[] var1, int var2, int var3) {
      for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
         PcmStream.method3390(var4, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("at")
   public final synchronized void removeSubStream(PcmStream var1) {
      var1.remove();
   }

   @ObfuscatedSignature(descriptor = "()Lrt;")
   @ObfuscatedName("dp")
   public NodeDeque method3445() {
      return this.subStreams;
   }

   public PcmStreamMixer() {
      this.field1473 = 0;
      this.field1476 = -1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   void method3442(int var1) {
      for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   void method3443(int var1) {
      for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
         var2.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method3429() {
      if (this.field1473 > 0) {
         for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1475.last();
            var1 != null;
            var1 = (PcmStreamMixerListener)this.field1475.previous()
         ) {
            var1.field1567 = var1.field1567 - this.field1473;
         }

         this.field1476 = this.field1476 - this.field1473;
         this.field1473 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bf")
   @Override
   public final synchronized void vmethod174(int[] var1, int var2, int var3) {
      while (this.field1476 >= 0) {
         if (this.field1473 + var3 < this.field1476) {
            this.field1473 += var3;
            this.method3436(var1, var2, var3);
            return;
         }

         int var4 = this.field1476 - this.field1473;
         this.method3436(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1473 += var4;
         this.method3428();
         PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1475.last();
         synchronized (var5) {
            int var7 = var5.method3706(this);
            if (var7 < 0) {
               var5.field1567 = 0;
               this.method3434(var5);
            } else {
               var5.field1567 = var7;
               this.method3430(var5.previous, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.method3436(var1, var2, var3);
   }
}
