import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sv")
public class ConcurrentMidiTask extends SongTask {
   @ObfuscatedName("av")
   ArrayList field5865;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5866 = 54;

   public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
      super(var1);
      this.field5865 = var2;
      this.field5881 = "ConcurrentMidiTask";
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field5865.size(); var2++) {
            SongTask var3 = (SongTask)this.field5865.get(var2);
            if (null == var3) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               this.field5865.remove(var2);
               var2--;
            } else if (var3.vmethod325((byte)22)) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var3.method10527(-1791553927)) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  SongTask.method10541(this, var3.method10533((short)17792), (byte)-65);
                  this.field5865.clear();
                  return true;
               }

               if (var3.method10538((byte)-44) != null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.field5865.add(var3.method10538((byte)-89));
               }

               this.field5882 = var3.field5882;
               this.field5865.remove(var2);
               var2--;
            }
         }

         if (!this.field5865.isEmpty()) {
            return false;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      for (int var1 = 0; var1 < this.field5865.size(); var1++) {
         SongTask var2 = (SongTask)this.field5865.get(var1);
         if (null == var2) {
            this.field5865.remove(var1);
            var1--;
         } else if (var2.vmethod325((byte)48)) {
            if (var2.method10527(-1753348740)) {
               SongTask.method10541(this, var2.method10533((short)5392), (byte)-111);
               this.field5865.clear();
               return true;
            }

            if (var2.method10538((byte)-81) != null) {
               this.field5865.add(var2.method10538((byte)-7));
            }

            this.field5882 = var2.field5882;
            this.field5865.remove(var1);
            var1--;
         }
      }

      return this.field5865.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      for (int var1 = 0; var1 < this.field5865.size(); var1++) {
         SongTask var2 = (SongTask)this.field5865.get(var1);
         if (null == var2) {
            this.field5865.remove(var1);
            var1--;
         } else if (var2.vmethod325((byte)125)) {
            if (var2.method10527(-1846441886)) {
               SongTask.method10541(this, var2.method10533((short)3782), (byte)-109);
               this.field5865.clear();
               return true;
            }

            if (var2.method10538((byte)3) != null) {
               this.field5865.add(var2.method10538((byte)3));
            }

            this.field5882 = var2.field5882;
            this.field5865.remove(var1);
            var1--;
         }
      }

      return this.field5865.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "(Ldd;III)V")
   @ObfuscatedName("lh")
   static final void updateItemPile3(WorldView var0, int var1, int var2, int var3) {
      try {
         class348.updateItemPile2(var0, var0.plane * 2115028565, var1, var2, -1949644682);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sv.lh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("as")
   static void SpriteBuffer_decode(byte[] var0, int var1) {
      try {
         Buffer var2 = new Buffer(var0);
         var2.offset = 1741769013 * (var0.length - 2);
         class615.SpriteBuffer_spriteCount = Buffer.method12008(var2, (byte)5) * 956565963;
         class615.SpriteBuffer_xOffsets = new int[class615.SpriteBuffer_spriteCount * 1626067939];
         class615.SpriteBuffer_yOffsets = new int[class615.SpriteBuffer_spriteCount * 1626067939];
         IntHashTable.SpriteBuffer_spriteWidths = new int[1626067939 * class615.SpriteBuffer_spriteCount];
         class615.SpriteBuffer_spriteHeights = new int[1626067939 * class615.SpriteBuffer_spriteCount];
         class320.SpriteBuffer_pixels = new byte[1626067939 * class615.SpriteBuffer_spriteCount][];
         var2.offset = 1741769013 * (var0.length - 7 - 123641624 * class615.SpriteBuffer_spriteCount);
         class208.SpriteBuffer_spriteWidth = Buffer.method12008(var2, (byte)5) * -1663153789;
         class144.SpriteBuffer_spriteHeight = Buffer.method12008(var2, (byte)5) * -305266351;
         int var3 = (var2.readUnsignedByte(-471311763) & 0xFF) + 1;

         for (int var4 = 0; var4 < 1626067939 * class615.SpriteBuffer_spriteCount; var4++) {
            if (var1 >= -38510667) {
               throw new IllegalStateException();
            }

            class615.SpriteBuffer_xOffsets[var4] = Buffer.method12008(var2, (byte)5);
         }

         for (int var15 = 0; var15 < class615.SpriteBuffer_spriteCount * 1626067939; var15++) {
            if (var1 >= -38510667) {
               throw new IllegalStateException();
            }

            class615.SpriteBuffer_yOffsets[var15] = Buffer.method12008(var2, (byte)5);
         }

         for (int var16 = 0; var16 < 1626067939 * class615.SpriteBuffer_spriteCount; var16++) {
            if (var1 >= -38510667) {
               throw new IllegalStateException();
            }

            IntHashTable.SpriteBuffer_spriteWidths[var16] = Buffer.method12008(var2, (byte)5);
         }

         for (int var17 = 0; var17 < class615.SpriteBuffer_spriteCount * 1626067939; var17++) {
            class615.SpriteBuffer_spriteHeights[var17] = Buffer.method12008(var2, (byte)5);
         }

         var2.offset = (var0.length - 7 - class615.SpriteBuffer_spriteCount * 123641624 - 3 * (var3 - 1)) * 1741769013;
         BufferedSource.SpriteBuffer_spritePalette = new int[var3];

         for (int var18 = 1; var18 < var3; var18++) {
            if (var1 >= -38510667) {
               throw new IllegalStateException();
            }

            BufferedSource.SpriteBuffer_spritePalette[var18] = var2.readMedium(-998997191);
            if (BufferedSource.SpriteBuffer_spritePalette[var18] == 0) {
               BufferedSource.SpriteBuffer_spritePalette[var18] = 1;
            }
         }

         var2.offset = 0;

         for (int var19 = 0; var19 < 1626067939 * class615.SpriteBuffer_spriteCount; var19++) {
            if (var1 >= -38510667) {
               throw new IllegalStateException();
            }

            int var5 = IntHashTable.SpriteBuffer_spriteWidths[var19];
            int var6 = class615.SpriteBuffer_spriteHeights[var19];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            class320.SpriteBuffer_pixels[var19] = var8;
            int var9 = var2.readUnsignedByte(-121242382);
            boolean var10000;
            if (1 == (var9 & 1)) {
               if (var1 >= -38510667) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var10 = var10000;
            if (2 == (var9 & 2)) {
               if (var1 >= -38510667) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (!var10) {
               if (var1 >= -38510667) {
                  throw new IllegalStateException();
               }

               for (int var20 = 0; var20 < var7; var20++) {
                  if (var1 >= -38510667) {
                     throw new IllegalStateException();
                  }

                  var8[var20] = Buffer.method12001(var2, (byte)29);
               }
            } else {
               for (int var12 = 0; var12 < var5; var12++) {
                  if (var1 >= -38510667) {
                     return;
                  }

                  for (int var13 = 0; var13 < var6; var13++) {
                     var8[var5 * var13 + var12] = Buffer.method12001(var2, (byte)72);
                  }
               }
            }

            if (var11) {
               var2.offset += 1741769013 * var7;
            }
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "sv.as(" + ')');
      }
   }
}
