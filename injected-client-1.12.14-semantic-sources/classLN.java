import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ln")
public class classLN {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final String field3727 = "DD/MM/YYYY and is after 01/01/1900";
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field3726 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Lkb;II)V")
   @ObfuscatedName("ae")
   public static void method7202(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
      var1.method6266(Coord.method8301(var2, -355008838), Coord.method8301(var3, -355008838), 1099070455);
      var1.setZ(0, (byte)-56);
      var1.setOrientation(0, 1974206564);
      byte var4 = Buffer.method12001(var0, (byte)14);
      if (var4 != 0) {
         int var5 = HttpRequestTask.method83(var0, var4, 0, 566490357);
         int var6 = HttpRequestTask.method83(var0, var4, 2, 513227230);
         int var7 = HttpRequestTask.method83(var0, var4, 4, -1408098259);
         int var8 = HttpRequestTask.method83(var0, var4, 6, -1834343863);
         WorldEntityCoord.method6278(var1, var5, var6, var7, var8, (byte)-6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Lkb;II)V")
   @ObfuscatedName("ag")
   public static void method7203(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
      var1.method6266(Coord.method8301(var2, -355008838), Coord.method8301(var3, -355008838), 866938022);
      var1.setZ(0, (byte)-16);
      var1.setOrientation(0, 1981655251);
      byte var4 = Buffer.method12001(var0, (byte)99);
      if (var4 != 0) {
         int var5 = HttpRequestTask.method83(var0, var4, 0, 2063473396);
         int var6 = HttpRequestTask.method83(var0, var4, 2, 458334134);
         int var7 = HttpRequestTask.method83(var0, var4, 4, 1270529441);
         int var8 = HttpRequestTask.method83(var0, var4, 6, 187621288);
         WorldEntityCoord.method6278(var1, var5, var6, var7, var8, (byte)-22);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Lkb;II)V")
   @ObfuscatedName("an")
   public static void method7204(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
      var1.method6266(Coord.method8301(var2, -355008838), Coord.method8301(var3, -355008838), 427155916);
      var1.setZ(0, (byte)-89);
      var1.setOrientation(0, 2008349188);
      byte var4 = Buffer.method12001(var0, (byte)101);
      if (var4 != 0) {
         int var5 = HttpRequestTask.method83(var0, var4, 0, 425439802);
         int var6 = HttpRequestTask.method83(var0, var4, 2, 1043159110);
         int var7 = HttpRequestTask.method83(var0, var4, 4, 415973772);
         int var8 = HttpRequestTask.method83(var0, var4, 6, -869150979);
         WorldEntityCoord.method6278(var1, var5, var6, var7, var8, (byte)-44);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;I)V")
   @ObfuscatedName("mm")
   public static void method7212(class46 var0, int var1) {
      var0.coord.plane = var1 * 969692463;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;BI)I")
   @ObfuscatedName("aj")
   public static int method7206(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (3 == var3) {
         return Buffer.method12015(var0, 492934294);
      } else if (2 == var3) {
         return var0.readShort((byte)-40);
      } else {
         return 1 == var3 ? Buffer.method12001(var0, (byte)73) : 0;
      }
   }

   classLN() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;BI)I")
   @ObfuscatedName("ak")
   public static int method7207(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (3 == var3) {
         return Buffer.method12015(var0, 1961839524);
      } else if (2 == var3) {
         return var0.readShort((byte)-15);
      } else {
         return 1 == var3 ? Buffer.method12001(var0, (byte)74) : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;BI)I")
   @ObfuscatedName("ap")
   public static int method7208(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (3 == var3) {
         return Buffer.method12015(var0, 1754677085);
      } else if (2 == var3) {
         return var0.readShort((byte)-68);
      } else {
         return 1 == var3 ? Buffer.method12001(var0, (byte)103) : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("is")
   static final void method7214(int var0) {
      try {
         int[] var1 = client.playerUpdateManager.playerIndices;
         Iterator var2 = client.worldViewManager.iterator();

         while (var2.hasNext()) {
            if (var0 <= -44992105) {
               throw new IllegalStateException();
            }

            WorldView var3 = (WorldView)var2.next();

            for (int var4 = 0; var4 < 1320060371 * client.playerUpdateManager.field1538; var4++) {
               Player var5 = (Player)var3.npcs.get(var1[var4]);
               if (null != var5) {
                  if (var0 <= -44992105) {
                     throw new IllegalStateException();
                  }

                  if (421730673 * var5.overheadTextCyclesRemaining > 0) {
                     if (var0 <= -44992105) {
                        throw new IllegalStateException();
                     }

                     var5.overheadTextCyclesRemaining -= -1846245487;
                     if (0 == 421730673 * var5.overheadTextCyclesRemaining) {
                        if (var0 <= -44992105) {
                           return;
                        }

                        var5.overheadText = null;
                        var5.method2825(-1);
                     }
                  }
               }
            }

            for (NPC var8 : var3.players) {
               if (null != var8) {
                  if (var0 <= -44992105) {
                     throw new IllegalStateException();
                  }

                  if (421730673 * var8.overheadTextCyclesRemaining > 0) {
                     if (var0 <= -44992105) {
                        throw new IllegalStateException();
                     }

                     var8.overheadTextCyclesRemaining -= -1846245487;
                     if (0 == var8.overheadTextCyclesRemaining * 421730673) {
                        var8.overheadText = null;
                        var8.method2825(-1);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ln.is(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;BI)I")
   @ObfuscatedName("ay")
   public static int method7209(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (3 == var3) {
         return Buffer.method12015(var0, 1940581582);
      } else if (2 == var3) {
         return var0.readShort((byte)-44);
      } else {
         return 1 == var3 ? Buffer.method12001(var0, (byte)11) : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;)[I")
   @ObfuscatedName("kz")
   public static int[] method7211(class380 var0) {
      return Arrays.copyOf(var0.field4607, 117389541 * var0.field4613);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Ljava/lang/String;I)I")
   @ObfuscatedName("at")
   public static int method7205(Buffer var0, String var1, int var2) {
      try {
         int var3 = var0.offset * 2108391709;
         byte[] var4 = classLI.method7185(var1, (short)-10623);
         Buffer.method11983(var0, var4.length, (byte)44);
         var0.offset = var0.offset + Huffman.method8646(class365.huffman, var4, 0, var4.length, var0.array, var0.offset * 2108391709, (byte)-1) * 1741769013;
         return 2108391709 * var0.offset - var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ln.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;BI)I")
   @ObfuscatedName("aw")
   public static int method7210(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (3 == var3) {
         return Buffer.method12015(var0, 1854096934);
      } else if (2 == var3) {
         return var0.readShort((byte)-61);
      } else {
         return 1 == var3 ? Buffer.method12001(var0, (byte)105) : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/util/ArrayList;")
   @ObfuscatedName("ay")
   static ArrayList method7213(byte var0) {
      try {
         ArrayList var1 = new ArrayList();

         for (MidiRequest var3 : class345.midiRequests) {
            var1.add(var3);
         }

         return var1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ln.ay(" + ')');
      }
   }
}
