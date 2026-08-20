import java.util.IdentityHashMap;
import java.util.Map;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl24")
public class rl24 extends Renderable {
   @ObfuscatedName("ba")
   public int field5754;
   @ObfuscatedName("pk")
   public static Map field5753 = new IdentityHashMap();
   @ObfuscatedName("xq")
   public final RuneLiteObjectController field5752;

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)Z")
   @ObfuscatedName("gg")
   public static boolean method10075(RuneLiteObjectController var0) {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return field5753.containsKey(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldu;)Ljava/lang/Object;")
   @ObfuscatedName("xd")
   public static Object method10073(classDU var0) {
      if (var0 == null) {
         var0.call();
      }

      return classGP.method5547((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("ux")
   public void method10078(WorldView var1) {
      try {
         this.field5752.tick(client.field949 * -322689719);
         if (this.method12064() == null) {
            return;
         }

         var1.scene
            .method4508(
               this.field5752.getLevel(),
               this.field5752.getX(),
               this.field5752.getY(),
               this.field5752.getZ(),
               this.field5752.getRadius(),
               this,
               this.field5752.getOrientation(),
               -1L,
               this.field5752.isDrawFrontTilesFirst()
            );
      } catch (Exception var3) {
         if (this.field5754 < 10) {
            this.field5754++;
            client.logger.warn("Exception ticking RuneLiteObjectController {}", this.field5752, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   public Model vmethod104(int var1) {
      try {
         return (Model)this.field5752.getModel();
      } catch (Exception var3) {
         if (this.field5754 < 10) {
            this.field5754++;
            client.logger.warn("Exception rendering RuneLiteObjectController {}", this.field5752, var3);
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("kr")
   public static void method10074(WorldView var0) {
      for (WorldEntity var2 : var0.worldEntities()) {
         method10074(var2.field6012);
      }

      for (rl24 var3 = (rl24)var0.field1685.method7931(); var3 != null; var3 = (rl24)var0.field1685.method7935()) {
         var3.method10078(var0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lco;I)Lcv;")
   @ObfuscatedName("ys")
   public static classCV method10072(classCO var0, int var1) {
      if (var0 == null) {
         return var0.method2563(var1);
      } else {
         classCV var2 = (classCV)var0.field1176.method8167();
         if (var2 != null && 1576496181 * var2.field1300 <= var1) {
            for (classCV var3 = (classCV)classAAX.method294(var0.field1176);
               null != var3 && var3.field1300 * 1576496181 <= var1;
               var3 = (classCV)classAAX.method294(var0.field1176)
            ) {
               var2.vmethod398();
               var2 = var3;
            }

            if (var0.field1177.field5480 * -1486866911 + 1576496181 * var2.field1300 + -425086145 * var2.field1297 > var1) {
               return var2;
            } else {
               var2.vmethod398();
               return null;
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V")
   @ObfuscatedName("or")
   public static void method10076(RuneLiteObjectController var0) {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         rl24 var1 = (rl24)field5753.remove(var0);
         if (var1 != null) {
            var1.method12065();
         }
      }
   }

   @Override
   public int getRenderMode() {
      return this.field5752.getRenderMode();
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/RuneLiteObjectController;)V")
   @ObfuscatedName("ad")
   public static void method10077(RuneLiteObjectController var0) {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         if (!field5753.containsKey(var0)) {
            rl24 var1 = new rl24(var0);
            field5753.put(var0, var1);
            WorldView var2 = classOE.client.method2314(var0.getWorldView());
            var2.field1685.method7932(var1);
         }
      }
   }

   public rl24(RuneLiteObjectController var1) {
      this.field5752 = var1;
   }
}
