import java.util.IdentityHashMap;
import java.util.Map;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl22")
public class rl22 extends Renderable {
   @ObfuscatedName("ig")
   public final RuneLiteObjectController field5617;
   @ObfuscatedName("xb")
   public int field5619;
   @ObfuscatedName("eq")
   public static Map field5618 = new IdentityHashMap();

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("av")
   public static void method9565(WorldView var0) {
      for (WorldEntity var2 : var0.worldEntities()) {
         method9565(var2.worldView);
      }

      for (rl22 var3 = (rl22)var0.field1308.method9830(); var3 != null; var3 = (rl22)var0.field1308.method9827()) {
         var3.method9566(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)Z")
   @ObfuscatedName("ce")
   public static boolean method9562(RuneLiteObjectController var0) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return field5618.containsKey(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V")
   @ObfuscatedName("je")
   public static void method9563(RuneLiteObjectController var0) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         if (!field5618.containsKey(var0)) {
            rl22 var1 = new rl22(var0);
            field5618.put(var0, var1);
            WorldView var2 = SecureUrlRequester.client.method2062(var0.getWorldView());
            var2.field1308.method9826(var1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;)Z")
   @ObfuscatedName("wq")
   public static boolean method9560(class225 var0) {
      return null != var0.field2761;
   }

   public rl22(RuneLiteObjectController var1) {
      this.field5617 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V")
   @ObfuscatedName("ic")
   public static void method9564(RuneLiteObjectController var0) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         rl22 var1 = (rl22)field5618.remove(var0);
         if (var1 != null) {
            var1.method11660();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("sb")
   public void method9566(WorldView var1) {
      try {
         this.field5617.tick(client.graphicsCycle * -1533995753);
         if (this.method11658() == null) {
            return;
         }

         var1.scene
            .method5790(
               this.field5617.getLevel(),
               this.field5617.getX(),
               this.field5617.getY(),
               this.field5617.getZ(),
               this.field5617.getRadius(),
               this,
               this.field5617.getOrientation(),
               -1L,
               this.field5617.isDrawFrontTilesFirst()
            );
      } catch (Exception var3) {
         if (this.field5619 < 10) {
            this.field5619++;
            client.field938.warn("Exception ticking RuneLiteObjectController {}", this.field5617, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   public Model getModel(int var1) {
      try {
         return (Model)this.field5617.getModel();
      } catch (Exception var3) {
         if (this.field5619 < 10) {
            this.field5619++;
            client.field938.warn("Exception rendering RuneLiteObjectController {}", this.field5617, var3);
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrm;Lvz;)Z")
   @ObfuscatedName("dp")
   public static boolean method9561(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         return var0.method9672(var1);
      } else {
         var0.addFirst(var1);
         return true;
      }
   }
}
