import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dh")
final class classDH implements classOR {
   @ObfuscatedSignature(descriptor = "Lwq;")
   @ObfuscatedName("gr")
   static classWQ field1359;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1358 = 50;
   @ObfuscatedName("ag")
   public static short[] field1360;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)I")
   @ObfuscatedName("vi")
   public static int method3120(ObjectSound var0) {
      return 127429897 * var0.maxY;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod157() {
      if (this.val$item.method8164((byte)-44).field4685 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method1410(this.val$item, (short)5200);
         var1.setArgs(this.val$item.method8164((byte)-82).field4685, -454653295);
         HttpQueryParams.method11268(-517386489).addFirst(var1);
      }
   }

   classDH(Widget var1) {
      this.val$item = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod158(byte var1) {
      try {
         if (this.val$item.method8164((byte)-111).field4685 != null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            ScriptEvent var2 = new ScriptEvent();
            var2.method1410(this.val$item, (short)5200);
            var2.setArgs(this.val$item.method8164((byte)-67).field4685, -1043443757);
            HttpQueryParams.method11268(913652491).addFirst(var2);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   @Override
   public void vmethod159() {
      if (this.val$item.method8164((byte)-89).field4685 != null) {
         ScriptEvent var1 = new ScriptEvent();
         var1.method1410(this.val$item, (short)5200);
         var1.setArgs(this.val$item.method8164((byte)-5).field4685, 53978562);
         HttpQueryParams.method11268(-1996076488).addFirst(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIB)Lrx;")
   @ObfuscatedName("ix")
   static ProjectionCoord method3122(WorldView var0, int var1, int var2, byte var3) {
      try {
         if (var0 != null) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            if (var0 != Occluder.topLevelWorldView) {
               WorldEntity var4 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(var0.id * 577964535));
               if (var4 == null) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  return FaceNormal.method6214(var1, 0.0F, var2, -1665013559);
               }

               return var4.getProjectionCoord(var1, var2, 1285583752);
            }

            if (var3 <= 0) {
               throw new IllegalStateException();
            }
         }

         return FaceNormal.method6214(var1, 0.0F, var2, -244409807);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dh.ix(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;II)I")
   @ObfuscatedName("to")
   public static int method3121(ObjectComposition var0, int var1, int var2) {
      return class108.method3858(var0.params, var1, var2, -369393385);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;B)V")
   @ObfuscatedName("av")
   public static void method3119(AbstractArchive var0, byte var1) {
      try {
         classGP.field2045 = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dh.av(" + ')');
      }
   }
}
