import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ig")
public class class210 {
   @ObfuscatedSignature(descriptor = "Lig;")
   @ObfuscatedName("ag")
   static final class210 field2473 = new class210(2);
   @ObfuscatedSignature(descriptor = "Lig;")
   @ObfuscatedName("at")
   static final class210 field2474 = new class210(1);
   @ObfuscatedSignature(descriptor = "Lig;")
   @ObfuscatedName("av")
   static final class210 field2471 = new class210(0);
   @ObfuscatedSignature(descriptor = "Lig;")
   @ObfuscatedName("an")
   static final class210 field2472 = new class210(3);
   @ObfuscatedSignature(descriptor = "Lig;")
   @ObfuscatedName("ae")
   static final class210 field2475 = new class210(4);
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field2477 = 5;
   @ObfuscatedName("od")
   static int[] regionLandArchiveIds;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field2478 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field2476 = 61;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lce;)Z")
   @ObfuscatedName("ud")
   public static boolean method4888(SecureRandomFuture var0) {
      return var0.future.isDone();
   }

   class210(int var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxe;)[S")
   @ObfuscatedName("yw")
   public static short[] method4889(NPCOverheadIcons var0) {
      return var0.overheadSpriteIds;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;)Lgx;")
   @ObfuscatedName("la")
   public static PlayerCompositionColorTextureOverride method4890(TileItem var0) {
      return var0.field1297;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIIII)Lrx;")
   @ObfuscatedName("ax")
   public static final ProjectionCoord method4891(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         float var9 = 1.0E-5F;
         ModelData0.method6707((byte)-115);
         WorldMapEvent.method7540(var0.field2970, var0.field2969, var0.field2972, var0.field2971, var5, var6, var7, -475423693);
         ProjectionCoord var10 = FaceNormal.method6214(0.0F, 1.0F, 0.0F, -672697281);
         ProjectionCoord var12 = ViewportMouse.field3473;
         float var11 = var10.method9897(var12, 1156197694);
         if (Math.abs(var11) < 1.0E-5F) {
            var10.release(-804947546);
            return null;
         } else {
            ProjectionCoord var14 = FaceNormal.method6214(var2, var3, var4, -989686142);
            ProjectionCoord var15 = FaceNormal.method6214(var14.x, var14.z - var1, var14.y, 249287182);
            float var16 = var10.method9897(var15, -1285623954);
            float var17 = -var16 / var11;
            var10.release(-804947546);
            if (var17 < 0.0F) {
               if (var8 == 682845965) {
                  throw new IllegalStateException();
               } else {
                  var15.release(-804947546);
                  var14.release(-804947546);
                  return null;
               }
            } else {
               ProjectionCoord var18 = ViewportMouse.method6670(ViewportMouse.field3473, var17, -197067365);
               ProjectionCoord var20 = class30.method1304(var14, 742787141);
               var20.method9884(var18, (byte)-17);
               var18.release(-804947546);
               var15.release(-804947546);
               var14.release(-804947546);
               return var20;
            }
         }
      } catch (RuntimeException var21) {
         throw RestClientThreadFactory.newRunException(var21, "ig.ax(" + ')');
      }
   }
}
