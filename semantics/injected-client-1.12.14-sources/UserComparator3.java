import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ed")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("sv")
   static int field1559;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1556 = 18;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field1557 = 36;
   @ObfuscatedName("av")
   final boolean reversed;
   @ToRemove(unused = "true")
   @ObfuscatedName("dr")
   static final int field1558 = 1;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("ah")
   static Widget scriptDotWidget;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;I)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, int var3) {
      try {
         if (var2.world * 1914416777 != var1.world * 1914416777) {
            if (var3 == 721221853) {
               throw new IllegalStateException();
            } else {
               return this.reversed ? var1.world * 1914416777 - var2.world * 1914416777 : 1914416777 * var2.world - 1914416777 * var1.world;
            }
         } else {
            return this.compareUser(var1, var2, (byte)-21);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ed.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3678(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1999651921);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3679(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, 1051621885);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3680(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1544071794);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, -791236030);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ed.compare(" + 41);
      }
   }

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3676(Buddy var1, Buddy var2) {
      if (var2.world * 1914416777 != var1.world * 1914416777) {
         return this.reversed ? var1.world * 1914416777 - var2.world * 1914416777 : 1914416777 * var2.world - 1914416777 * var1.world;
      } else {
         return this.compareUser(var1, var2, (byte)6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lru;)Lvo;")
   @ObfuscatedName("ua")
   public static DualNode method3682(DualNodeDeque var0) {
      if (var0 == null) {
         return var0.removeLast();
      } else {
         DualNode var1 = var0.sentinel.previousDual;
         return var1 == var0.sentinel ? null : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method3677(Buddy var1, Buddy var2) {
      if (var2.world * -1915857241 != var1.world * 1914416777) {
         return this.reversed ? var1.world * 1123141975 - var2.world * 2092700305 : -1124826896 * var2.world - 799223488 * var1.world;
      } else {
         return this.compareUser(var1, var2, (byte)-45);
      }
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("nm")
   static final void method3684(double var0) {
      try {
         Rasterizer3D.buildPalette(var0);
         TextureProvider.method6454((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader, var0);
         if (Skills.worldMap != null) {
            Skills.worldMap.method11443(1221055265);
         }

         ItemComposition.ItemDefinition_cachedSprites.clear();
         class468.clientPreferences.updateBrightness(var0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ed.nm(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Led;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("fl")
   public static int method3681(UserComparator3 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3678(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, 1148195800);
   }

   @ObfuscatedSignature(descriptor = "([BI)Lcu;")
   @ObfuscatedName("an")
   static Script newScript(byte[] var0, int var1) {
      try {
         Script var2 = new Script();
         Buffer var3 = new Buffer(var0);
         var3.offset = 1741769013 * (var3.array.length - 2);
         int var4 = Buffer.method12008(var3, (byte)5);
         int var5 = var3.array.length - 2 - var4 - 12;
         var3.offset = 1741769013 * var5;
         int var6 = Buffer.method12015(var3, 688316001);
         var2.localIntCount = Buffer.method12008(var3, (byte)5) * -266484779;
         var2.localStringCount = Buffer.method12008(var3, (byte)5) * 1498454301;
         var2.intArgumentCount = Buffer.method12008(var3, (byte)5) * 425264795;
         var2.stringArgumentCount = Buffer.method12008(var3, (byte)5) * 1556700137;
         int var7 = var3.readUnsignedByte(402570103);
         if (var7 > 0) {
            if (var1 == 915153619) {
               throw new IllegalStateException();
            }

            var2.switches = var2.newIterableNodeHashTable(var7, -1702266709);

            for (int var8 = 0; var8 < var7; var8++) {
               if (var1 == 915153619) {
                  throw new IllegalStateException();
               }

               int var9 = Buffer.method12008(var3, (byte)5);
               IterableNodeHashTable var10000 = new IterableNodeHashTable;
               int var10002;
               if (var9 > 0) {
                  if (var1 == 915153619) {
                     throw new IllegalStateException();
                  }

                  var10002 = class161.method4253(var9, (byte)0);
               } else {
                  var10002 = 1;
               }

               var10000./* $VF: Unable to resugar constructor */<init>(var10002);
               IterableNodeHashTable var10 = var10000;
               var2.switches[var8] = var10;

               while (var9-- > 0) {
                  if (var1 == 915153619) {
                     throw new IllegalStateException();
                  }

                  int var11 = Buffer.method12015(var3, 867769601);
                  int var12 = Buffer.method12015(var3, -410634273);
                  var10.put((Node)(new IntegerNode(var12)), (long)var11);
               }
            }
         }

         var3.offset = 0;
         var2.field1216 = var3.readCESU8(792604665);
         var2.opcodes = new int[var6];
         var2.intOperands = new int[var6];
         var2.stringOperands = new String[var6];
         int var14 = 0;

         while (2108391709 * var3.offset < var5) {
            if (var1 == 915153619) {
               throw new IllegalStateException();
            }

            int var15 = Buffer.method12008(var3, (byte)5);
            switch (var15) {
               case 3:
                  var2.stringOperands[var14] = var3.readStringCp1252NullCircumfixed(-1268108397);
                  break;
               case 21:
               case 38:
               case 39:
               case 63:
                  var2.intOperands[var14] = var3.readUnsignedByte(-1689693145);
                  break;
               default:
                  if (var15 <= 99) {
                     if (var1 == 915153619) {
                        throw new IllegalStateException();
                     }

                     var2.intOperands[var14] = Buffer.method12015(var3, -172671732);
                  } else {
                     var2.intOperands[var14] = var3.readUnsignedByte(1490139573);
                  }
            }

            var2.opcodes[var14++] = var15;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ed.an(" + ')');
      }
   }
}
