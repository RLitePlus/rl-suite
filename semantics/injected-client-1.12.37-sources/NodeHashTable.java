import java.util.Iterator;
import net.runelite.api.HashTable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yi")
public final class NodeHashTable implements HashTable {
   @ObfuscatedName("ag")
   int field6988 = 0;
   @ObfuscatedSignature(descriptor = "[Lvq;")
   @ObfuscatedName("af")
   Node[] field6986;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ae")
   Node field6990;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ab")
   Node field6989;
   @ObfuscatedName("az")
   int field6987;

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ap")
   public Node method13374() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("az")
   public Node method13363(long var1) {
      Node var3 = this.field6986[(int)(var1 & this.field6987 - 1)];

      for (this.field6990 = var3.field6554; this.field6990 != var3; this.field6990 = this.field6990.field6554) {
         if (this.field6990.field6552 == var1) {
            Node var4 = this.field6990;
            this.field6990 = this.field6990.field6554;
            return var4;
         }
      }

      this.field6990 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lyi;)I")
   @ObfuscatedName("ys")
   public static int method13368(NodeHashTable var0) {
      if (var0 == null) {
         var0.method13371();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < var0.field6987; var2++) {
         Node var3 = var0.field6986[var2];

         for (Node var4 = var3.field6554; var4 != var3; var4 = var4.field6554) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("ae")
   public void method13372(Node var1, long var2) {
      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      Node var4 = this.field6986[(int)(var2 & this.field6987 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;J)Lvq;")
   @ObfuscatedName("eo")
   public static Node method13364(NodeHashTable var0, long var1) {
      Node var3 = var0.field6986[(int)(var1 & var0.field6987 - 1)];

      for (var0.field6990 = var3.field6554; var0.field6990 != var3; var0.field6990 = var0.field6990.field6554) {
         if (var0.field6990.field6552 == var1) {
            Node var4 = var0.field6990;
            var0.field6990 = var0.field6990.field6554;
            return var4;
         }
      }

      var0.field6990 = null;
      return null;
   }

   public Iterator iterator() {
      return new rl14(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ab")
   public Node method13375() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   public NodeHashTable(int var1) {
      this.field6987 = var1;
      this.field6986 = new Node[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         Node var3 = this.field6986[var2] = new Node();
         var3.field6554 = var3;
         var3.field6553 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("ax")
   public Node method13365(long var1) {
      Node var3 = this.field6986[(int)(var1 & this.field6987 - 1)];

      for (this.field6990 = var3.field6554; this.field6990 != var3; this.field6990 = this.field6990.field6554) {
         if (this.field6990.field6552 == var1) {
            Node var4 = this.field6990;
            this.field6990 = this.field6990.field6554;
            return var4;
         }
      }

      this.field6990 = null;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;)I")
   @ObfuscatedName("go")
   public static int method13369(NodeHashTable var0) {
      if (var0 == null) {
         var0.method13378();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < var0.field6987; var2++) {
         Node var3 = var0.field6986[var2];

         for (Node var4 = var3.field6554; var4 != var3; var4 = var4.field6554) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("gv")
   public Node method13383(long var1) {
      return this.method13363(var1);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvq;")
   @ObfuscatedName("as")
   public Node method13366(long var1) {
      Node var3 = this.field6986[(int)(var1 & this.field6987 - 1)];

      for (this.field6990 = var3.field6554; this.field6990 != var3; this.field6990 = this.field6990.field6554) {
         if (this.field6990.field6552 == var1) {
            Node var4 = this.field6990;
            this.field6990 = this.field6990.field6554;
            return var4;
         }
      }

      this.field6990 = null;
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ad")
   public Node method13376() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public int method13370() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.field6987; var2++) {
         Node var3 = this.field6986[var2];

         for (Node var4 = var3.field6554; var4 != var3; var4 = var4.field6554) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ai")
   public Node method13377() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;J)Lvq;")
   @ObfuscatedName("zf")
   public static Node method13367(NodeHashTable var0, long var1) {
      if (var0 == null) {
         return var0.method13363(var1);
      } else {
         Node var3 = var0.field6986[(int)(var1 & var0.field6987 - 1)];

         for (var0.field6990 = var3.field6554; var0.field6990 != var3; var0.field6990 = var0.field6990.field6554) {
            if (var0.field6990.field6552 == var1) {
               Node var4 = var0.field6990;
               var0.field6990 = var0.field6990.field6554;
               return var4;
            }
         }

         var0.field6990 = null;
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvq;J)V")
   @ObfuscatedName("kj")
   public void method13384(Node var1, long var2) {
      this.method13372(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("au")
   public Node method13378() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("aw")
   public Node method13380() {
      if (this.field6988 > 0 && this.field6989 != this.field6986[this.field6988 - 1]) {
         Node var2 = this.field6989;
         this.field6989 = var2.field6554;
         return var2;
      } else {
         while (this.field6988 < this.field6987) {
            Node var1 = this.field6986[this.field6988++].field6554;
            if (var1 != this.field6986[this.field6988 - 1]) {
               this.field6989 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("av")
   public Node method13381() {
      if (this.field6988 > 0 && this.field6989 != this.field6986[this.field6988 - 1]) {
         Node var2 = this.field6989;
         this.field6989 = var2.field6554;
         return var2;
      } else {
         while (this.field6988 < this.field6987) {
            Node var1 = this.field6986[this.field6988++].field6554;
            if (var1 != this.field6986[this.field6988 - 1]) {
               this.field6989 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ag")
   public Node method13379() {
      this.field6988 = 0;
      return IndexedObjectSet.method13401(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;Lvq;J)V")
   @ObfuscatedName("ar")
   public static void method13373(NodeHashTable var0, Node var1, long var2) {
      if (var0 == null) {
         var0.method13365(var2);
      }

      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      Node var4 = var0.field6986[(int)(var2 & var0.field6987 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;)Lvq;")
   @ObfuscatedName("dj")
   public static Node method13382(NodeHashTable var0) {
      if (var0.field6988 > 0 && var0.field6989 != var0.field6986[var0.field6988 - 1]) {
         Node var2 = var0.field6989;
         var0.field6989 = var2.field6554;
         return var2;
      } else {
         while (var0.field6988 < var0.field6987) {
            Node var1 = var0.field6986[var0.field6988++].field6554;
            if (var1 != var0.field6986[var0.field6988 - 1]) {
               var0.field6989 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method13371() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.field6988; var2++) {
         Node var3 = this.field6986[var2];

         for (Node var4 = var3.field6554; var4 != var3; var4 = var4.field6554) {
            var1++;
         }
      }

      return var1;
   }
}
