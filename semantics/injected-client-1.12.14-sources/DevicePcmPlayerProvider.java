import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("am")
public class DevicePcmPlayerProvider implements class105 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field38 = 32;
   @ObfuscatedName("ou")
   static int[] field43;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field39 = 24;
   @ObfuscatedName("sz")
   static int field42;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field41 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   public static final int field40 = 1024;

   @ObfuscatedSignature(descriptor = "(IIIILcv;B)Lrx;")
   @ObfuscatedName("aw")
   static ProjectionCoord method147(int var0, int var1, int var2, int var3, WorldViewManager var4, byte var5) {
      try {
         ProjectionCoord var6 = null;
         WorldView var7 = null;
         boolean var10000;
         if (0 != var0) {
            if (var5 <= 25) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         if (var8) {
            if (var5 <= 25) {
               throw new IllegalStateException();
            }

            boolean var10 = var0 > 0;
            Object var9;
            if (var10) {
               if (var5 <= 25) {
                  throw new IllegalStateException();
               }

               int var11 = classBC.method402(var0, -933848389);
               var7 = WallDecoration.method6327(var11, var4, (byte)-10);
               var9 = (Actor)var7.players.get(var11);
            } else {
               int var19 = class27.method925(var0, -275627793);
               var7 = classLI.method7182(var19, var4, (byte)3);
               var9 = WorldView.method3073(var7, var19, 1204537326);
            }

            if (var9 != null) {
               if (var5 <= 25) {
                  throw new IllegalStateException();
               }

               Coord var20 = ((Actor)var9).method2810(var7, (byte)54);
               ProjectionCoord var12;
               synchronized (ProjectionCoord.field5722) {
                  if (1970955523 * ProjectionCoord.field5720 == 0) {
                     if (var5 <= 25) {
                        throw new IllegalStateException();
                     }

                     var12 = new ProjectionCoord();
                  } else {
                     ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9878(1701153650);
                     var12 = ProjectionCoord.field5722[1970955523 * ProjectionCoord.field5720];
                  }
               }

               var6 = var12;
               var12.x = var20.x * -1931160809;
               var12.y = -263036313 * var20.y;
            }
         }

         if (var6 == null) {
            var7 = WorldViewManager.method2912(var4, var1, var2, -3288740);
            int var17 = var1 - var7.baseX * 825809917;
            int var18 = var2 - 1279964673 * var7.baseY;
            WorldEntity var21 = (WorldEntity)var4.method2905((byte)-41).worldEntities.get((long)(577964535 * var7.id));
            if (null != var21) {
               var6 = var21.getProjectionCoord(Coord.method8306(var17, 248986601), Coord.method8306(var18, 248986601), 1131080985);
            } else {
               var6 = FaceNormal.method6214(Coord.method8306(var17, 248986601), 0.0F, Coord.method8306(var18, 248986601), -39419732);
            }
         }

         int var22 = (int)var6.x;
         int var23 = (int)var6.y;
         int var24 = NPCComposition.getTileHeight(var7, var22, var23, var3, -253070517);
         WorldEntity var14 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(var7.id * 577964535));
         if (var14 != null) {
            if (var5 <= 25) {
               throw new IllegalStateException();
            }

            var24 += NPCComposition.getTileHeight(
               Occluder.topLevelWorldView, var14.getY(-590411288), var14.getX(-727737924), var14.getPlane(-1900341496), -253070517
            );
         }

         var6.z = var24;
         return var6;
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "am.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method145(int var0) {
      try {
         EnumComposition.EnumDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "am.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldm;")
   @ObfuscatedName("at")
   @Override
   public PcmPlayer vmethod31() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedSignature(descriptor = "()Ldm;")
   @ObfuscatedName("ag")
   @Override
   public PcmPlayer vmethod32() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedSignature(descriptor = "()Ldm;")
   @ObfuscatedName("an")
   @Override
   public PcmPlayer vmethod33() {
      return new DevicePcmPlayer();
   }

   DevicePcmPlayerProvider() {
   }

   @ObfuscatedSignature(descriptor = "(II)D")
   @ObfuscatedName("ae")
   public static double method146(int var0, int var1) {
      try {
         int var2 = classUD.field6022[var0 & 2047];
         return var2 / 65536.0;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "am.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ldm;")
   @ObfuscatedName("av")
   @Override
   public PcmPlayer player(short var1) {
      try {
         return new DevicePcmPlayer();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "am.av(" + ')');
      }
   }
}
