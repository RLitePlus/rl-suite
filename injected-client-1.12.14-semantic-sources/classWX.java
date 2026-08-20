import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wx")
final class classWX implements classWK {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6467 = 1339;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6466 = 4;

   @ObfuscatedSignature(descriptor = "(Lut;Lxa;I)V")
   @ObfuscatedName("ak")
   void method11900(DynamicArray var1, Buffer var2, int var3) {
      try {
         var1.method11242(var2, (byte)3);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wx.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod444(Object var1, Buffer var2) {
      this.method11900((DynamicArray)var1, var2, 703833178);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)Ljava/lang/Object;")
   @ObfuscatedName("at")
   @Override
   public Object vmethod443(Buffer var1, byte var2) {
      try {
         int var4 = Buffer.method12008(var1, (byte)5);
         if (var4 >= 0) {
            if (var4 <= 5000) {
               int var5 = var1.readUnsignedByte(-1228051510);
               DynamicArray var3;
               if (var5 == 0) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  int[] var6 = new int[var4];

                  for (int var7 = 0; var7 < var4; var7++) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var6[var7] = Buffer.method12015(var1, 1778226634);
                  }

                  DynamicArray var8 = new DynamicArray(class586.field6376, false);
                  var8.array = var6;
                  var8.size = -1205286309 * var6.length;
                  var8.field6106 = -1332440619 * var6.length;
                  var3 = var8;
               } else if (1 == var5) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  long[] var10 = new long[var4];

                  for (int var12 = 0; var12 < var4; var12++) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var10[var12] = Buffer.method12018(var1, -2142551994);
                  }

                  DynamicArray var14 = new DynamicArray(class586.field6377, false);
                  var14.field6110 = var10;
                  var14.size = var10.length * -1205286309;
                  var14.field6106 = -1332440619 * var10.length;
                  var3 = var14;
               } else {
                  if (var5 != 2) {
                     throw new RuntimeException();
                  }

                  String[] var11 = new String[var4];

                  for (int var13 = 0; var13 < var4; var13++) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var11[var13] = var1.readStringCp1252NullCircumfixed(568261151);
                  }

                  DynamicArray var15 = new DynamicArray(class586.field6379, false);
                  var15.field6111 = var11;
                  var15.size = var11.length * -1205286309;
                  var15.field6106 = -1332440619 * var11.length;
                  var3 = var15;
               }

               return var3;
            }

            if (var2 == -1) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "wx.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod446(Object var1, Buffer var2) {
      this.method11900((DynamicArray)var1, var2, 703833178);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lms;IIF)V")
   @ObfuscatedName("nz")
   public static void method11901(WorldMapRegion var0, AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      if (var0 == null) {
         var0.method7012();
      }

      WorldMapElement var5 = class463.WorldMapElement_get(var1.getElement(1502589952), (byte)0);
      WorldMapRegion.method7076(var0, var5, var2, var3, 176544304);
      var0.method7079(var1, var5, var2, var3, var4, 1914184916);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;I)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod447(Object var1, Buffer var2, int var3) {
      try {
         this.method11900((DynamicArray)var1, var2, 703833178);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wx.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("an")
   @Override
   public void vmethod445(Object var1, Buffer var2) {
      this.method11900((DynamicArray)var1, var2, 703833178);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   @Override
   public Object vmethod442(Buffer var1) {
      int var3 = Buffer.method12008(var1, (byte)5);
      if (var3 >= 0 && var3 <= 5000) {
         int var4 = var1.readUnsignedByte(-998669175);
         DynamicArray var2;
         if (var4 == 0) {
            int[] var5 = new int[var3];

            for (int var6 = 0; var6 < var3; var6++) {
               var5[var6] = Buffer.method12015(var1, -467049854);
            }

            DynamicArray var7 = new DynamicArray(class586.field6376, false);
            var7.array = var5;
            var7.size = -1205286309 * var5.length;
            var7.field6106 = -1332440619 * var5.length;
            var2 = var7;
         } else if (1 == var4) {
            long[] var8 = new long[var3];

            for (int var10 = 0; var10 < var3; var10++) {
               var8[var10] = Buffer.method12018(var1, -1895761057);
            }

            DynamicArray var12 = new DynamicArray(class586.field6377, false);
            var12.field6110 = var8;
            var12.size = var8.length * -1205286309;
            var12.field6106 = -1332440619 * var8.length;
            var2 = var12;
         } else {
            if (var4 != 2) {
               throw new RuntimeException();
            }

            String[] var9 = new String[var3];

            for (int var11 = 0; var11 < var3; var11++) {
               var9[var11] = var1.readStringCp1252NullCircumfixed(1414125175);
            }

            DynamicArray var13 = new DynamicArray(class586.field6379, false);
            var13.field6111 = var9;
            var13.size = var9.length * -1205286309;
            var13.field6106 = -1332440619 * var9.length;
            var2 = var13;
         }

         return var2;
      } else {
         throw new RuntimeException();
      }
   }
}
