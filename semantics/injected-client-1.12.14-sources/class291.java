import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ls")
public class class291 {
   @ToRemove(unused = "true")
   @ObfuscatedName("dy")
   public static final int field3773 = 104;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3768 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3771 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field3769 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3770 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field3767 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   public static final int field3772 = 29;
   @ObfuscatedName("io")
   static Iterator field3774;

   class291() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bv")
   static int method7263(int var0, Script var1, boolean var2, int var3) {
      try {
         if (6600 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var40 = 2115028565 * Occluder.topLevelWorldView.plane;
               int var58 = 825809917 * Occluder.topLevelWorldView.baseX + (340712311 * class330.localPlayer.x >> 7);
               int var63 = (class330.localPlayer.y * -1747310679 >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
               WorldMap.method11413(class455.getWorldMap(-630590717), var40, var58, var63, true, -1091228177);
               return 1;
            }
         } else if (6601 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var39 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               String var57 = "";
               WorldMapArea var62 = class455.getWorldMap(-1507534810).getMapArea(var39, (byte)4);
               if (var62 != null) {
                  var57 = WorldMapArea.method6941(var62, -1905370245);
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var57;
               return 1;
            }
         } else if (var0 == 6602) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var38 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               class455.getWorldMap(-211515487).setMaxFlashCount(var38, 1265471425);
               return 1;
            }
         } else if (6603 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-284929003)
                  .getZoomLevel((byte)-114);
               return 1;
            }
         } else if (var0 == 6604) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var37 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               class455.getWorldMap(-858575125).setCurrentMapAreaId(var37, -1601929789);
               return 1;
            }
         } else if (var0 == 6605) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int[] var71 = Interpreter.Interpreter_intStack;
               int var75 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var79;
               if (class455.getWorldMap(-78263094).method11474(-1669773073)) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  var79 = 1;
               } else {
                  var79 = 0;
               }

               var71[var75] = var79;
               return 1;
            }
         } else if (var0 == 6606) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var36 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               WorldMap.method11479(class455.getWorldMap(-962148733), -1931160809 * var36.x, var36.y * -263036313, 622690859);
               return 1;
            }
         } else if (var0 == 6607) {
            Coord var35 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
            WorldMap.method11482(class455.getWorldMap(-85181508), var35.x * -1931160809, -263036313 * var35.y, (byte)66);
            return 1;
         } else if (6608 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var34 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               WorldMap.method11484(class455.getWorldMap(-321282726), var34.plane * 370217423, -1931160809 * var34.x, var34.y * -263036313, (byte)0);
               return 1;
            }
         } else if (var0 == 6609) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var33 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               class455.getWorldMap(-709156699).method11486(var33.plane * 370217423, -1931160809 * var33.x, -263036313 * var33.y, 687160933);
               return 1;
            }
         } else if (6610 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-477851158)
                  .getDisplayX(-1980152167);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMap.method11492(
                  class455.getWorldMap(-5012283), (byte)-83
               );
               return 1;
            }
         } else if (var0 == 6611) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var32 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapArea var56 = class455.getWorldMap(-369516115).getMapArea(var32, (byte)4);
               if (null == var56) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var56.getOrigin(-1710904857)
                     .packed(-1078622148);
               }

               return 1;
            }
         } else if (6612 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var31 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapArea var55 = class455.getWorldMap(-77872518).getMapArea(var31, (byte)4);
               if (null == var55) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                        WorldMapArea.method6955(var55, (byte)0) - var55.getRegionLowX(-609367334) + 1
                     )
                     * 64;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                        var55.getRegionHighY(219246473) - WorldMapArea.method6961(var55, (byte)0) + 1
                     )
                     * 64;
               }

               return 1;
            }
         } else if (var0 == 6613) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var30 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapArea var54 = class455.getWorldMap(-1154968936).getMapArea(var30, (byte)4);
               if (null == var54) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54.getRegionLowX(-1117453754) * 64;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6961(
                        var54, (byte)-41
                     )
                     * 64;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6955(var54, (byte)0)
                        * 64
                     + 64
                     - 1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54.getRegionHighY(219246473) * 64
                     + 64
                     - 1;
               }

               return 1;
            }
         } else if (var0 == 6614) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var29 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapArea var53 = class455.getWorldMap(-1895749424).getMapArea(var29, (byte)4);
               if (var53 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var53.getZoom((byte)18);
               }

               return 1;
            }
         } else if (6615 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var28 = class455.getWorldMap(-1247771171).getDisplayCoord((byte)97);
               if (null == var28) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1931160809 * var28.x;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var28.y * -263036313;
               }

               return 1;
            }
         } else if (var0 == 6616) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-2037080814)
                  .currentMapAreaId((byte)18);
               return 1;
            }
         } else if (6617 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var27 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               WorldMapArea var52 = WorldMap.method11425(class455.getWorldMap(-1788621728), -532273443);
               if (var52 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                     return 1;
                  }
               } else {
                  int[] var61 = WorldMapArea.method6923(var52, 370217423 * var27.plane, -1931160809 * var27.x, var27.y * -263036313, 2080036943);
                  if (var61 == null) {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var61[0];
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var61[1];
                  }

                  return 1;
               }
            }
         } else if (6618 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var26 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               WorldMapArea var51 = WorldMap.method11425(class455.getWorldMap(-1725814413), -1366230423);
               if (null == var51) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  return 1;
               } else {
                  Coord var60 = var51.coord(-1931160809 * var26.x, var26.y * -263036313, (byte)122);
                  if (var60 == null) {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var60.packed(-704822444);
                  }

                  return 1;
               }
            }
         } else if (var0 == 6619) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var25 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               Coord var50 = new Coord(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]);
               classLX.method7328(var25, var50, false, (byte)-67);
               return 1;
            }
         } else if (6620 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               Coord var49 = new Coord(Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]);
               classLX.method7328(var24, var49, true, (byte)-16);
               return 1;
            }
         } else if (var0 == 6621) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var23 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               Coord var48 = new Coord(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]);
               WorldMapArea var59 = class455.getWorldMap(-1665116364).getMapArea(var23, (byte)4);
               if (var59 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else {
                  int[] var70 = Interpreter.Interpreter_intStack;
                  int var74 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var78;
                  if (var59.containsCoord(370217423 * var48.plane, var48.x * -1931160809, var48.y * -263036313, 2136870681)) {
                     if (var3 >= 346923226) {
                        throw new IllegalStateException();
                     }

                     var78 = 1;
                  } else {
                     var78 = 0;
                  }

                  var70[var74] = var78;
                  return 1;
               }
            }
         } else if (6622 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(79378718)
                  .getDisplayWith(-1612861675);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1657217175)
                  .getDisplayHeight((byte)44);
               return 1;
            }
         } else if (var0 == 6623) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Coord var22 = new Coord(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
               WorldMapArea var47 = class455.getWorldMap(-1995073343)
                  .mapAreaAtCoord(370217423 * var22.plane, -1931160809 * var22.x, -263036313 * var22.y, -398549647);
               if (var47 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6931(
                     var47, -1661874398
                  );
               }

               return 1;
            }
         } else if (var0 == 6624) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               WorldMap.method11505(
                  class455.getWorldMap(-2121013378),
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
                  -613194778
               );
               return 1;
            }
         } else if (6625 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               WorldMap.method11512(class455.getWorldMap(164978173), (byte)114);
               return 1;
            }
         } else if (var0 == 6626) {
            class455.getWorldMap(-1446062964)
               .setCyclesPerFlash(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)-88);
            return 1;
         } else if (6627 == var0) {
            class455.getWorldMap(-1104242317).resetCyclesPerFlash(-1651290660);
            return 1;
         } else if (6628 == var0) {
            boolean var69;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               var69 = true;
            } else {
               var69 = false;
            }

            boolean var21 = var69;
            class455.getWorldMap(-979675079).setPerpetualFlash(var21, -2047611332);
            return 1;
         } else if (var0 == 6629) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               class455.getWorldMap(-1494035394).flashElement(var20, (byte)-59);
               return 1;
            }
         } else if (var0 == 6630) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               class455.getWorldMap(230393570).setZoomPercentage(var19, 1636648980);
               return 1;
            }
         } else if (6631 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               WorldMap.method11531(class455.getWorldMap(-1480309547), 1363879254);
               return 1;
            }
         } else if (6632 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               boolean var68;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  var68 = true;
               } else {
                  var68 = false;
               }

               boolean var18 = var68;
               class455.getWorldMap(122763439).setElementsDisabled(var18, (byte)47);
               return 1;
            }
         } else if (6633 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            boolean var67;
            if (Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] == 1) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               var67 = true;
            } else {
               var67 = false;
            }

            boolean var46 = var67;
            class455.getWorldMap(-810050702).disableElement(var17, var46, (byte)12);
            return 1;
         } else if (var0 == 6634) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var16 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               boolean var66;
               if (1 == Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  var66 = true;
               } else {
                  var66 = false;
               }

               boolean var45 = var66;
               class455.getWorldMap(91115281).setCategoryDisabled(var16, var45, -193845648);
               return 1;
            }
         } else if (6635 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int[] var65 = Interpreter.Interpreter_intStack;
               int var73 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var77;
               if (class455.getWorldMap(-655284502).getElementsDisabled((byte)95)) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  var77 = 1;
               } else {
                  var77 = 0;
               }

               var65[var73] = var77;
               return 1;
            }
         } else if (var0 == 6636) {
            int var15 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int[] var64 = Interpreter.Interpreter_intStack;
            int var72 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var76;
            if (class455.getWorldMap(28613375).isElementDisabled(var15, 1925063833)) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               var76 = 1;
            } else {
               var76 = 0;
            }

            var64[var72] = var76;
            return 1;
         } else if (6637 == var0) {
            int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int[] var10000 = Interpreter.Interpreter_intStack;
            int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var10002;
            if (class455.getWorldMap(-465758355).isCategoryDisabled(var14, 1329960301)) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var10001] = var10002;
            return 1;
         } else if (var0 == 6638) {
            class408.Interpreter_intStackSize -= 708726074;
            int var13 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            Coord var44 = new Coord(Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]);
            Coord var6 = class455.getWorldMap(-1449365511).method11555(var13, var44, 1247496424);
            if (var6 == null) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var6.packed(607808715);
            }

            return 1;
         } else if (var0 == 6639) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               AbstractWorldMapIcon var12 = WorldMap.method11563(class455.getWorldMap(-1721324686), 1905763545);
               if (var12 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12.getElement(-1580242759);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12.coord2.packed(1481817139);
               }

               return 1;
            }
         } else if (var0 == 6640) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               AbstractWorldMapIcon var11 = class455.getWorldMap(-2087977897).iconStart(270944498);
               if (var11 == null) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var11.getElement(-1318360512);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var11.coord2.packed(1475473896);
               }

               return 1;
            }
         } else if (var0 == 6693) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapElement var43 = class463.WorldMapElement_get(var10, (byte)0);
               if (null == var43.menuTargetName) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var43.menuTargetName;
               }

               return 1;
            }
         } else if (var0 == 6694) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapElement var42 = class463.WorldMapElement_get(var9, (byte)0);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var42.textSize * 1000629255;
               return 1;
            }
         } else if (6695 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               int var8 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               WorldMapElement var41 = class463.WorldMapElement_get(var8, (byte)0);
               if (var41 == null) {
                  if (var3 >= 346923226) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -629421571 * var41.category;
               }

               return 1;
            }
         } else if (6696 == var0) {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            WorldMapElement var5 = class463.WorldMapElement_get(var4, (byte)0);
            if (var5 == null) {
               if (var3 >= 346923226) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.sprite1 * -393425597;
            }

            return 1;
         } else if (6697 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.mapElement
                  * -1281703535;
               return 1;
            }
         } else if (var0 == 6698) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent
                  .coord1
                  .packed(-1810851123);
               return 1;
            }
         } else if (6699 == var0) {
            if (var3 >= 346923226) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent
                  .coord2
                  .packed(-301919914);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ls.bv(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lhp;I)V")
   @ObfuscatedName("jv")
   static final void addNpcsToScene(WorldView var0, class201 var1, int var2) {
      try {
         for (int var3 = 0; var3 < var0.field1313.method10502(-2038505847); var3++) {
            if (var2 <= -2113220935) {
               throw new IllegalStateException();
            }

            NPC var4 = (NPC)var0.players.get(var0.field1313.method10498(var3, (byte)12));
            if (null != var4) {
               if (var2 <= -2113220935) {
                  throw new IllegalStateException();
               }

               if (var4.isVisible(-1080514395)) {
                  if (var2 <= -2113220935) {
                     throw new IllegalStateException();
                  }

                  if (var1 == var4.definition.field2352 && NPCComposition.method4690(var4.definition, 195711422)) {
                     if (var2 <= -2113220935) {
                        return;
                     }

                     int var5 = 2115028565 * var0.plane;
                     int var6 = Coord.method8304(340712311 * var4.x, (byte)-43);
                     int var7 = Coord.method8304(var4.y * -1747310679, (byte)-9);
                     if (var6 >= 0 && var6 < var0.sizeX * 2010544793) {
                        if (var2 <= -2113220935) {
                           throw new IllegalStateException();
                        }

                        if (var7 >= 0) {
                           if (var2 <= -2113220935) {
                              throw new IllegalStateException();
                           }

                           if (var7 < var0.sizeY * 1823353167) {
                              if (var2 <= -2113220935) {
                                 throw new IllegalStateException();
                              }

                              if (-919874483 * var4.size == 1) {
                                 if (var2 <= -2113220935) {
                                    throw new IllegalStateException();
                                 }

                                 if (64 == (340712311 * var4.x & 127) && 64 == (-1747310679 * var4.y & 127)) {
                                    if (var2 <= -2113220935) {
                                       return;
                                    }

                                    if (client.viewportDrawCount * 424038787 == var0.tileLastDrawnActor[var6][var7]) {
                                       if (var2 <= -2113220935) {
                                          throw new IllegalStateException();
                                       }
                                       continue;
                                    }

                                    var0.tileLastDrawnActor[var6][var7] = 424038787 * client.viewportDrawCount;
                                 }
                              }

                              boolean var10004;
                              if (!var4.definition.isInteractable) {
                                 if (var2 <= -2113220935) {
                                    throw new IllegalStateException();
                                 }

                                 var10004 = true;
                              } else {
                                 var10004 = false;
                              }

                              long var8 = class236.calculateTag(0, 0, 0, 1, var10004, -1903023775 * var4.index, 577964535 * var0.id, -1329739818);
                              var4.playerCycle = client.cycle * 1910844849;
                              int var10 = class67.method3009(var0, 340712311 * var4.x, -1747310679 * var4.y, var5, var4.vmethod115(-1453498696), -643103427);
                              int var11 = 60 + (1257575232 * var4.size - 64);
                              boolean var12 = classBC.method403(var4, (byte)2);
                              var4.field1508 = var12;
                              var0.scene
                                 .method5503(
                                    var5, 340712311 * var4.x, var4.y * -1747310679, var10, var11, var4, var4.rotation * 1777129311, var8, var4.isWalking
                                 );
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ls.jv(" + ')');
      }
   }
}
