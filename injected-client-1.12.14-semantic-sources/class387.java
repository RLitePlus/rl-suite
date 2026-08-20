import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oh")
public class class387 {
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   public static final int field4625 = 71;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4617 = -3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4620 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field4618 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   public static final int field4624 = 56;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field4616 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4621 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field4622 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field4619 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("ey")
   static final int field4626 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4623 = 10;

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SIIB)V")
   @ObfuscatedName("at")
   static void sortItemsByName(String[] var0, short[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 >= 1) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 >= 1) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (null == var0[var9]) {
                     continue;
                  }

                  if (var4 >= 1) {
                     return;
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 >= 1) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            sortItemsByName(var0, var1, var2, var6 - 1, (byte)-30);
            sortItemsByName(var0, var1, 1 + var6, var3, (byte)-101);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "oh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZIZB)V")
   @ObfuscatedName("ae")
   static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5, byte var6) {
      try {
         if (var0 < var1) {
            if (var6 >= 10) {
               throw new IllegalStateException();
            }

            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            World var9 = World.World_worlds[var7];
            World.World_worlds[var7] = World.World_worlds[var1];
            World.World_worlds[var1] = var9;

            for (int var10 = var0; var10 < var1; var10++) {
               if (var6 >= 10) {
                  throw new IllegalStateException();
               }

               if (MouseHandler.method971(World.World_worlds[var10], var9, var2, var3, var4, var5, 93619784) <= 0) {
                  if (var6 >= 10) {
                     throw new IllegalStateException();
                  }

                  World var11 = World.World_worlds[var10];
                  World.World_worlds[var10] = World.World_worlds[var8];
                  World.World_worlds[var8++] = var11;
               }
            }

            World.World_worlds[var1] = World.World_worlds[var8];
            World.World_worlds[var8] = var9;
            doWorldSorting(var0, var8 - 1, var2, var3, var4, var5, (byte)-116);
            doWorldSorting(1 + var8, var1, var2, var3, var4, var5, (byte)-120);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "oh.ae(" + ')');
      }
   }

   class387() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Lqm;III)Lxt;")
   @ObfuscatedName("an")
   public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2, int var3) {
      net.runelite.api.SpritePixels var4 = (net.runelite.api.SpritePixels)client.field782.get(var1);
      if (var4 != null) {
         return ((SpritePixels)var4).method12700();
      } else {
         int var7 = var2;
         int var6 = var1;
         AbstractArchive var5 = var0;
         int var8 = -2139672119;

         try {
            SpritePixels var10000;
            if (!FloorOverlayDefinition.method5355(var5, var6, var7, -1366279867)) {
               var5 = null;
               var10000 = var5;
            } else {
               SpritePixels var11 = classIO.method4945(-1486769056);
               var10000 = var11;
            }

            return var10000;
         } catch (RuntimeException var9) {
            throw RestClientThreadFactory.newRunException(var9, "oh.an(" + ')');
         }
      }
   }
}
