import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vq")
public class Node implements net.runelite.api.Node {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("hu")
   public Node field6554;
   @ObfuscatedName("ho")
   public long field6552;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("hj")
   public Node field6553;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvq;)Z")
   @ObfuscatedName("hi")
   public static boolean method12057(Node var0) {
      return var0.field6553 != null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ai")
   public Node method12063() {
      return this.field6553;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("id")
   public Node method12064() {
      return this.field6554;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lsp;IIII)V")
   @ObfuscatedName("uy")
   public static void method12061(WorldView var0, WorldEntity var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method3758(var1, var2, var2, var2, var2);
      } else {
         for (ObjectSound var6 = (ObjectSound)var0.field1695.method7915(); var6 != null; var6 = (ObjectSound)classNN.method7924(var0.field1695)) {
            boolean var7 = WorldView.method3753(var0, var1, var2, var6, -12900460);
            classUZ var8 = classYY.method13790(var0, var6.vmethod194(996455154), var6.vmethod202(-1912391592), (byte)103);
            classUZ var9 = classYY.method13790(var0, var6.vmethod197(-2045925366), var6.vmethod205(24841222), (byte)101);
            int var10 = (int)var8.field6427;
            int var11 = (int)var8.field6426;
            int var12 = (int)var9.field6427;
            int var13 = (int)var9.field6426;
            var6.method3638(var3, var4, var10, var11, var12, var13, var5, var7, -317896765);
            classUZ.method11727(var8, 2019549796);
            classUZ.method11727(var9, 2064159509);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("mo")
   public boolean method12058() {
      return this.field6553 != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gu")
   public void vmethod399() {
      if (this.field6553 != null) {
         this.field6553.field6554 = this.field6554;
         this.field6554.field6553 = this.field6553;
         this.field6554 = null;
         this.field6553 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gf")
   public void vmethod400() {
      if (this.field6553 != null) {
         this.field6553.field6554 = this.field6554;
         this.field6554.field6553 = this.field6553;
         this.field6554 = null;
         this.field6553 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("po")
   public void vmethod387() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("so")
   public void method12065() {
      this.vmethod398();
   }

   public long getHash() {
      return this.field6552;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gr")
   public void vmethod398() {
      this.method12062();
      if (this.field6553 != null) {
         this.field6553.field6554 = this.field6554;
         this.field6554.field6553 = this.field6553;
         this.field6554 = null;
         this.field6553 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xq")
   public void method12062() {
      this.vmethod387();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("mx")
   public boolean method12059() {
      return this.field6553 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("mr")
   public boolean method12060() {
      return this.field6553 != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gh")
   public void vmethod401() {
      if (this.field6553 != null) {
         this.field6553.field6554 = this.field6554;
         this.field6554.field6553 = this.field6553;
         this.field6554 = null;
         this.field6553 = null;
      }
   }
}
