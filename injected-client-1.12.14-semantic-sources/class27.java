import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bo")
public class class27 {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field291 = 17;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field292 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field290 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field287 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field289 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field295 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field297 = -117;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field288 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field296 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field298 = 36;
   @ToRemove(unused = "true")
   @ObfuscatedName("cs")
   public static final int field299 = 82;
   @ObfuscatedName("dh")
   static int[] KeyHandler_keyCodes = new int[]{
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      85,
      80,
      84,
      -1,
      91,
      -1,
      -1,
      -1,
      81,
      82,
      86,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      13,
      -1,
      -1,
      -1,
      -1,
      83,
      104,
      105,
      103,
      102,
      96,
      98,
      97,
      99,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      25,
      16,
      17,
      18,
      19,
      20,
      21,
      22,
      23,
      24,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      48,
      68,
      66,
      50,
      34,
      51,
      52,
      53,
      39,
      54,
      55,
      56,
      70,
      69,
      40,
      41,
      32,
      35,
      49,
      36,
      38,
      67,
      33,
      65,
      37,
      64,
      -1,
      -1,
      -1,
      -1,
      -1,
      228,
      231,
      227,
      233,
      224,
      219,
      225,
      230,
      226,
      232,
      89,
      87,
      -1,
      88,
      229,
      90,
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      11,
      12,
      -1,
      -1,
      -1,
      101,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      100,
      -1,
      87,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field294 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field293 = 10;

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   public static void method923(byte var0) {
      try {
         class117.reflectionChecks = new IterableNodeDeque();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bo.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   static boolean method927(int var0) {
      return (var0 & 128) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   static boolean method928(int var0) {
      return (var0 & 128) != 0;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   static int method925(int var0, int var1) {
      try {
         return -var0 - 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bo.at(" + 41);
      }
   }

   class27() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   static boolean method929(int var0) {
      return (var0 & 128) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   static boolean method930(int var0) {
      return (var0 & 128) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   static boolean method931(int var0) {
      return (var0 & 128) != 0;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String base37DecodeLong(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for (long var3 = var0; var3 != 0L; var3 /= 37L) {
                  var2++;
               }

               StringBuilder var5 = new StringBuilder(var2);

               while (0L != var0) {
                  long var6 = var0;
                  var0 /= 37L;
                  char var8 = class455.base37Table[(int)(var6 - var0 * 37L)];
                  if ('_' == var8) {
                     int var9 = var5.length() - 1;
                     var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                     var8 = 160;
                  }

                  var5.append(var8);
               }

               var5.reverse();
               var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
               return var5.toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "bo.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("at")
   static void queueSoundEffect(int var0, int var1, int var2, int var3) {
      try {
         if (ClientPreferences.method1620(class468.clientPreferences, 126164792) != 0) {
            if (var3 != -1645689313) {
               throw new IllegalStateException();
            }

            if (var1 != 0) {
               if (var3 != -1645689313) {
                  throw new IllegalStateException();
               }

               if (1548103253 * class57.soundEffectCount < 50) {
                  if (var3 != -1645689313) {
                     throw new IllegalStateException();
                  }

                  GrandExchangeOffer.method8889(-1, var0, 0, 0, 0, 0, var1, var2, false, -808677151);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bo.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;ZI)V")
   @ObfuscatedName("aw")
   static void method932(ArrayList var0, boolean var1, int var2) {
      try {
         if (!var1) {
            if (var2 == -686711829) {
               throw new IllegalStateException();
            }

            class345.field4309.clear();
         }

         Iterator var3 = var0.iterator();

         while (var3.hasNext()) {
            if (var2 == -686711829) {
               return;
            }

            MidiRequest var4 = (MidiRequest)var3.next();
            if (-1 != var4.musicTrackGroupId * -1778393937) {
               if (var2 == -686711829) {
                  throw new IllegalStateException();
               }

               if (-1 != var4.musicTrackFileId * -1740472291) {
                  if (!var1) {
                     if (var2 == -686711829) {
                        return;
                     }

                     class345.field4309.add(var4);
                  }

                  class345.field4308.add(var4);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bo.aw(" + ')');
      }
   }
}
