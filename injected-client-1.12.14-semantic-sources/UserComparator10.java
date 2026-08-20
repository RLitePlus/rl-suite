import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eb")
public class UserComparator10 extends AbstractUserComparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field1550 = 33;
   @ObfuscatedName("av")
   final boolean reversed;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field1549 = 1;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;I)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, int var3) {
      try {
         if (var1.world * 1914416777 == client.worldId * 1312022025) {
            if (var3 != -1161103436) {
               throw new IllegalStateException();
            }

            if (var2.world * 1914416777 == 1312022025 * client.worldId) {
               if (var3 != -1161103436) {
                  throw new IllegalStateException();
               }

               return this.reversed ? -529820201 * var1.int2 - var2.int2 * -529820201 : var2.int2 * -529820201 - -529820201 * var1.int2;
            }
         }

         return this.compareUser(var1, var2, (byte)-11);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eb.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lld;Ljava/util/List;)V")
   @ObfuscatedName("st")
   public static void method3671(WorldMapRegion var0, WorldMapData_0 var1, List var2) {
      if (var0 == null) {
         var0.method7000(var1, var2);
      }

      var0.iconMap.clear();
      var0.worldMapData_0 = var1;
      var0.addAllToIconList(var2, (byte)5);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, -1161103436);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "eb.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3667(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1161103436);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3668(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1161103436);
   }

   public UserComparator10(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3669(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1161103436);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leb;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("me")
   public static int method3670(UserComparator10 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3667(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, -1161103436);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3666(Buddy var1, Buddy var2) {
      if (var1.world * -895071286 == client.worldId * 100243394 && var2.world * -1270592808 == -1840728634 * client.worldId) {
         return this.reversed ? -529820201 * var1.int2 - var2.int2 * -529820201 : var2.int2 * -529820201 - 612153723 * var1.int2;
      } else {
         return this.compareUser(var1, var2, (byte)-122);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ir")
   static final void method3672(int var0, int var1, int var2, int var3) {
      try {
         if (-201184013 * SpriteBufferProperties.cameraX < var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            }

            SpriteBufferProperties.cameraX = SpriteBufferProperties.cameraX
               + 1830472763
                  * (1021621853 * classSX.field5875 * (var0 - -201184013 * SpriteBufferProperties.cameraX) / 1000 + -1784452011 * FloatProjection.field3083);
            if (-201184013 * SpriteBufferProperties.cameraX > var0) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               }

               SpriteBufferProperties.cameraX = 1830472763 * var0;
            }
         }

         if (-201184013 * SpriteBufferProperties.cameraX > var0) {
            if (var3 == 2108391709) {
               return;
            }

            SpriteBufferProperties.cameraX = SpriteBufferProperties.cameraX
               - ((SpriteBufferProperties.cameraX * -201184013 - var0) * 1021621853 * classSX.field5875 / 1000 + -1784452011 * FloatProjection.field3083)
                  * 1830472763;
            if (SpriteBufferProperties.cameraX * -201184013 < var0) {
               if (var3 == 2108391709) {
                  return;
               }

               SpriteBufferProperties.cameraX = 1830472763 * var0;
            }
         }

         if (2001367751 * ScriptFrame.cameraY < var1) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            }

            ScriptFrame.cameraY = ScriptFrame.cameraY
               + -1583829257 * ((var1 - ScriptFrame.cameraY * 2001367751) * 1021621853 * classSX.field5875 / 1000 + FloatProjection.field3083 * -1784452011);
            if (ScriptFrame.cameraY * 2001367751 > var1) {
               if (var3 == 2108391709) {
                  return;
               }

               ScriptFrame.cameraY = -1583829257 * var1;
            }
         }

         if (ScriptFrame.cameraY * 2001367751 > var1) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            }

            ScriptFrame.cameraY = ScriptFrame.cameraY
               - -1583829257 * (FloatProjection.field3083 * -1784452011 + classSX.field5875 * 1021621853 * (2001367751 * ScriptFrame.cameraY - var1) / 1000);
            if (ScriptFrame.cameraY * 2001367751 < var1) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               }

               ScriptFrame.cameraY = -1583829257 * var1;
            }
         }

         if (class528.cameraZ * 1084219535 < var2) {
            class528.cameraZ = class528.cameraZ
               + ((var2 - class528.cameraZ * 1084219535) * 1021621853 * classSX.field5875 / 1000 + -1784452011 * FloatProjection.field3083) * -393920913;
            if (1084219535 * class528.cameraZ > var2) {
               class528.cameraZ = -393920913 * var2;
            }
         }

         if (1084219535 * class528.cameraZ > var2) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            }

            class528.cameraZ = class528.cameraZ
               - (1021621853 * classSX.field5875 * (class528.cameraZ * 1084219535 - var2) / 1000 + -1784452011 * FloatProjection.field3083) * -393920913;
            if (class528.cameraZ * 1084219535 < var2) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               }

               class528.cameraZ = var2 * -393920913;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eb.ir(" + ')');
      }
   }
}
