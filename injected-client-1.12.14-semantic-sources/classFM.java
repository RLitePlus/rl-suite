import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fm")
public abstract class classFM extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field1822 = 1;

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   abstract void vmethod182(Buffer var1, byte var2);

   @ObfuscatedSignature(descriptor = "(DDD)I")
   @ObfuscatedName("av")
   public static final int method4025(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if (0.0 != var2) {
            double var12;
            if (var4 < 0.5) {
               var12 = (var2 + 1.0) * var4;
            } else {
               var12 = var4 + var2 - var4 * var2;
            }

            double var14 = 2.0 * var4 - var12;
            double var16 = var0 + 0.3333333333333333;
            if (var16 > 1.0) {
               var16--;
            }

            double var20 = var0 - 0.3333333333333333;
            if (var20 < 0.0) {
               var20++;
            }

            if (6.0 * var16 < 1.0) {
               var6 = var16 * ((var12 - var14) * 6.0) + var14;
            } else if (var16 * 2.0 < 1.0) {
               var6 = var12;
            } else if (3.0 * var16 < 2.0) {
               var6 = (0.6666666666666666 - var16) * (var12 - var14) * 6.0 + var14;
            } else {
               var6 = var14;
            }

            if (var0 * 6.0 < 1.0) {
               var8 = (var12 - var14) * 6.0 * var0 + var14;
            } else if (2.0 * var0 < 1.0) {
               var8 = var12;
            } else if (3.0 * var0 < 2.0) {
               var8 = (var12 - var14) * (0.6666666666666666 - var0) * 6.0 + var14;
            } else {
               var8 = var14;
            }

            if (var20 * 6.0 < 1.0) {
               var10 = var14 + 6.0 * (var12 - var14) * var20;
            } else if (var20 * 2.0 < 1.0) {
               var10 = var12;
            } else if (3.0 * var20 < 2.0) {
               var10 = var14 + 6.0 * ((0.6666666666666666 - var20) * (var12 - var14));
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(var6 * 256.0);
         int var13 = (int)(var8 * 256.0);
         int var24 = (int)(var10 * 256.0);
         return var24 + (var23 << 16) + (var13 << 8);
      } catch (RuntimeException var22) {
         throw RestClientThreadFactory.newRunException(var22, "fm.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   abstract void vmethod185(ClanSettings var1, byte var2);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   abstract void vmethod184(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   abstract void vmethod183(Buffer var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   static void method4028(int var0) {
      try {
         Iterator var1 = class345.midiRequests.iterator();

         while (var1.hasNext()) {
            if (var0 == 205505544) {
               throw new IllegalStateException();
            }

            MidiRequest var2 = (MidiRequest)var1.next();
            if (null == var2) {
               if (var0 == 205505544) {
                  throw new IllegalStateException();
               }
            } else {
               var2.midiPcmStream.clear(1806462691);
               var2.midiPcmStream.method7640((byte)9);
               MidiPcmStream.method7621(var2.midiPcmStream, 0, (byte)-15);
               var2.midiPcmStream.field4208 = 0;
               int var3 = -1778393937 * var2.musicTrackGroupId;
               int var4 = var2.musicTrackFileId * -1740472291;

               for (classNE var6 : class345.field4305) {
                  var6.vmethod129(var3, var4, (byte)8);
               }
            }
         }

         class345.midiRequests.clear();
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "fm.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lra;")
   @ObfuscatedName("av")
   public static class461 method4026(int var0) {
      try {
         synchronized (class461.field5498) {
            if (-603351739 * class461.field5496 == 0) {
               if (var0 == 1101374545) {
                  throw new IllegalStateException();
               } else {
                  return new class461();
               }
            } else {
               class461.method9313(class461.field5498[(class461.field5496 -= -1125927539) * -603351739], -1845539078);
               return class461.field5498[class461.field5496 * -603351739];
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvu;IIIIB)Z")
   @ObfuscatedName("an")
   static boolean method4027(classVU var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var7 = classVU.method11618(var0, (byte)-97);
         int var8 = var0.method11614((byte)63);
         int var9 = var0.method11616(-1412419434);
         int var10 = var8 - var1;
         int var11 = var9 - var2;
         int var12 = var10 * var10;
         int var13 = var11 * var11;
         boolean var6;
         if (var12 + var13 <= var7) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            var6 = true;
         } else {
            int var14 = var8 - var3;
            int var15 = var14 * var14;
            if (var15 + var13 <= var7) {
               if (var5 != 0) {
                  throw new IllegalStateException();
               }

               var6 = true;
            } else {
               int var16 = var9 - var4;
               int var17 = var16 * var16;
               if (var17 + var12 <= var7) {
                  var6 = true;
               } else {
                  var6 = var17 + var15 <= var7;
               }
            }
         }

         return var6;
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "fm.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;I)V")
   @ObfuscatedName("ll")
   static void method4030(NPC var0, int var1) {
      try {
         var0.size = var0.definition.size * -1901835949;
         var0.field1158 = 1666184505 * var0.definition.rotation;
         var0.walkSequence = var0.definition.walkSequence * 93189339;
         var0.walkBackSequence = 650487725 * var0.definition.walkBackSequence;
         var0.walkLeftSequence = var0.definition.walkLeftSequence * 719945105;
         var0.walkRightSequence = -1675120777 * var0.definition.walkRightSequence;
         var0.idleSequence = -1249502057 * var0.definition.idleSequence;
         var0.turnLeftSequence = var0.definition.turnLeftSequence * -1265256995;
         var0.turnRightSequence = var0.definition.turnRightSequence * 439988313;
         var0.runSequence = -1869969605 * var0.definition.field2348;
         var0.field1160 = 1291878125 * var0.definition.field2325;
         var0.field1154 = var0.definition.field2326 * -1708433833;
         var0.field1138 = var0.definition.field2340 * -652243923;
         var0.field1139 = -309955177 * var0.definition.field2328;
         var0.field1140 = var0.definition.field2339 * 1188776937;
         var0.field1141 = var0.definition.field2330 * 374920771;
         var0.field1142 = var0.definition.field2344 * 115366583;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fm.ll(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;III)V")
   @ObfuscatedName("bg")
   static void method4029(Object[] var0, int var1, int var2, int var3) {
      try {
         while (var1 < var2) {
            if (var3 != 2108391709) {
               return;
            }

            Object var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fm.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   abstract void vmethod186(ClanSettings var1);

   classFM() {
   }
}
