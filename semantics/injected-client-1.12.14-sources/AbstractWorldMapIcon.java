import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ms")
public abstract class AbstractWorldMapIcon implements WorldMapIcon {
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("qj")
   static Model field3996;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("aw")
   public final Coord coord1;
   @ObfuscatedName("ap")
   int screenX;
   @ObfuscatedName("ay")
   int screenY;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   public static final int field3995 = 8192;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("ak")
   public final Coord coord2;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("je")
   static Archive field3997;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public abstract int vmethod288();

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ab")
   boolean fitsScreen(int var1, int var2, int var3) {
      try {
         if (this.elementFitsScreen(var1, var2, 1582551589)) {
            if (var3 >= 1688363826) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (this.labelFitsScreen(var1, var2, (byte)44)) {
            if (var3 >= 1688363826) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ms.ab(" + ')');
      }
   }

   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public abstract int vmethod289();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   abstract int getSubWidth(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   abstract int getSubHeight(int var1);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   boolean method7519() {
      return this.getElement(792455801) >= 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ny")
   public static void method7533(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method12029();
      }

      var1 = var1 << 1 ^ var1 >> 31;
      var0.method11989(var1, -1309558031);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ar")
   boolean elementFitsScreen(int var1, int var2, int var3) {
      try {
         if (!method7521(this, -970546821)) {
            if (var3 <= 871988641) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            WorldMapElement var4 = class463.WorldMapElement_get(this.getElement(1333987997), (byte)0);
            int var5 = this.getSubWidth(1815290607);
            int var6 = this.getSubHeight(-184663833);
            switch (-747709277 * var4.horizontalAlignment.value) {
               case 0:
                  if (var1 < -1481714301 * this.screenX - var5 / 2) {
                     return false;
                  }

                  if (var3 <= 871988641) {
                     throw new IllegalStateException();
                  }

                  if (var1 > var5 / 2 + this.screenX * -1481714301) {
                     if (var3 <= 871988641) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 1:
                  if (var1 <= this.screenX * -1481714301 - var5) {
                     return false;
                  }

                  if (var3 <= 871988641) {
                     throw new IllegalStateException();
                  }

                  if (var1 > this.screenX * -1481714301) {
                     if (var3 <= 871988641) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 2:
                  if (var1 < this.screenX * -1481714301) {
                     return false;
                  }

                  if (var3 <= 871988641) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= var5 + -1481714301 * this.screenX) {
                     if (var3 <= 871988641) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
            }

            switch (-1167722475 * var4.verticalAlignment.value) {
               case 0:
                  if (var2 < 915727541 * this.screenY - var6 / 2) {
                     return false;
                  }

                  if (var3 <= 871988641) {
                     throw new IllegalStateException();
                  }

                  if (var2 > var6 / 2 + this.screenY * 915727541) {
                     if (var3 <= 871988641) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 1:
                  if (var2 < this.screenY * 915727541) {
                     return false;
                  }

                  if (var2 >= var6 + this.screenY * 915727541) {
                     if (var3 <= 871988641) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 2:
                  if (var2 <= this.screenY * 915727541 - var6) {
                     return false;
                  }

                  if (var3 <= 871988641) {
                     throw new IllegalStateException();
                  }

                  if (var2 > 915727541 * this.screenY) {
                     return false;
                  }
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ms.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ah")
   boolean labelFitsScreen(int var1, int var2, byte var3) {
      try {
         WorldMapLabel var4 = this.getLabel((byte)118);
         if (null == var4) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var1 >= this.screenX * -1481714301 - var4.height * -1322204423 / 2) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               if (var1 <= -1481714301 * this.screenX + var4.height * -1322204423 / 2) {
                  if (var2 >= 915727541 * this.screenY) {
                     if (var2 <= this.screenY * 915727541 + -1989742749 * var4.width) {
                        return true;
                     }

                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }

               if (var3 <= 0) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ms.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("af")
   boolean method7516(int var1, int var2) {
      return this.elementFitsScreen(var1, var2, 1351664878) ? true : this.labelFitsScreen(var1, var2, (byte)82);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public abstract int getElement(int var1);

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("ay")
   abstract WorldMapLabel vmethod293();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lms;II)Z")
   @ObfuscatedName("ae")
   public static boolean method7524(AbstractWorldMapIcon var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7517(var1, var1);
      }

      if (!method7521(var0, -1775524314)) {
         return false;
      } else {
         WorldMapElement var3 = class463.WorldMapElement_get(var0.getElement(-1900947020), (byte)0);
         int var4 = var0.getSubWidth(-1352600843);
         int var5 = var0.getSubHeight(-184663833);
         switch (-747709277 * var3.horizontalAlignment.value) {
            case 0:
               if (var1 < -385457259 * var0.screenX - var4 / 2 || var1 > var4 / 2 + var0.screenX * -1481714301) {
                  return false;
               }
               break;
            case 1:
               if (var1 <= var0.screenX * 185687249 - var4 || var1 > var0.screenX * -1481714301) {
                  return false;
               }
               break;
            case 2:
               if (var1 < var0.screenX * -1725558805 || var1 >= var4 + -1481714301 * var0.screenX) {
                  return false;
               }
         }

         switch (-1145834540 * var3.verticalAlignment.value) {
            case 0:
               if (var2 >= 915727541 * var0.screenY - var5 / 2 && var2 <= var5 / 2 + var0.screenY * -1778829493) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= var0.screenY * 181488943 && var2 < var5 + var0.screenY * 915727541) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= var0.screenY * -1377707767 - var5 || var2 > 915727541 * var0.screenY) {
                  return false;
               }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("au")
   abstract WorldMapLabel vmethod292();

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("az")
   abstract WorldMapLabel vmethod294();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   abstract int vmethod295();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   abstract int vmethod298();

   @ObfuscatedSignature(descriptor = "()Loj;")
   @ObfuscatedName("sa")
   public Coord method7534() {
      return this.coord2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   boolean method7520() {
      return this.getElement(-1464362593) >= 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   abstract int vmethod299();

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("al")
   boolean method7517(int var1, int var2) {
      return this.elementFitsScreen(var1, var2, 2081081346) ? true : this.labelFitsScreen(var1, var2, (byte)61);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bz")
   boolean method7529(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel((byte)25);
      if (null == var3) {
         return false;
      } else {
         return var1 < this.screenX * -1481714301 - var3.height * -1322204423 / 2 || var1 > -1481714301 * this.screenX + var3.height * -1322204423 / 2
            ? false
            : var2 >= 915727541 * this.screenY && var2 <= this.screenY * 915727541 + -1989742749 * var3.width;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lms;I)Z")
   @ObfuscatedName("dr")
   public static boolean method7521(AbstractWorldMapIcon var0, int var1) {
      if (var0 == null) {
         return var0.hasValidElement(var1);
      } else {
         try {
            return var0.getElement(-584058643) >= 0;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ms.ax(" + ')');
         }
      }
   }

   public WorldPoint getCoordinate() {
      Coord var1 = this.method7534();
      return new WorldPoint(var1.x * -1931160809, var1.y * -263036313, var1.plane * 370217423);
   }

   @ObfuscatedSignature(descriptor = "(B)Llv;")
   @ObfuscatedName("ag")
   abstract WorldMapLabel getLabel(byte var1);

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bk")
   boolean method7530(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel((byte)61);
      if (null == var3) {
         return false;
      } else {
         return var1 < this.screenX * -1481714301 - var3.height * -1322204423 / 2 || var1 > -1481714301 * this.screenX + var3.height * -1322204423 / 2
            ? false
            : var2 >= 915727541 * this.screenY && var2 <= this.screenY * 915727541 + -1989742749 * var3.width;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bo")
   boolean method7525(int var1, int var2) {
      if (!method7521(this, 1843555947)) {
         return false;
      } else {
         WorldMapElement var3 = class463.WorldMapElement_get(this.getElement(-442585301), (byte)0);
         int var4 = this.getSubWidth(-306513470);
         int var5 = this.getSubHeight(-184663833);
         switch (-747709277 * var3.horizontalAlignment.value) {
            case 0:
               if (var1 < -1481714301 * this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX * -1481714301) {
                  return false;
               }
               break;
            case 1:
               if (var1 <= this.screenX * -1481714301 - var4 || var1 > this.screenX * -1481714301) {
                  return false;
               }
               break;
            case 2:
               if (var1 < this.screenX * -1481714301 || var1 >= var4 + -1481714301 * this.screenX) {
                  return false;
               }
         }

         switch (-1167722475 * var3.verticalAlignment.value) {
            case 0:
               if (var2 >= 915727541 * this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY * 915727541) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= this.screenY * 915727541 && var2 < var5 + this.screenY * 915727541) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= this.screenY * 915727541 - var5 || var2 > 915727541 * this.screenY) {
                  return false;
               }
         }

         return true;
      }
   }

   public int getType() {
      return this.getElement(-1022817339);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bg")
   boolean method7526(int var1, int var2) {
      if (!method7521(this, 610350075)) {
         return false;
      } else {
         WorldMapElement var3 = class463.WorldMapElement_get(this.getElement(-1011819532), (byte)0);
         int var4 = this.getSubWidth(-2092330944);
         int var5 = this.getSubHeight(-184663833);
         switch (1236306139 * var3.horizontalAlignment.value) {
            case 0:
               if (var1 < -1678510156 * this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX * -1481714301) {
                  return false;
               }
               break;
            case 1:
               if (var1 <= this.screenX * -1481714301 - var4 || var1 > this.screenX * 169134970) {
                  return false;
               }
               break;
            case 2:
               if (var1 < this.screenX * -1252353215 || var1 >= var4 + 1542400336 * this.screenX) {
                  return false;
               }
         }

         switch (-1552890049 * var3.verticalAlignment.value) {
            case 0:
               if (var2 >= 915727541 * this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY * 1718036272) {
                  break;
               }

               return false;
            case 1:
               if (var2 >= this.screenY * 915727541 && var2 < var5 + this.screenY * 828337950) {
                  break;
               }

               return false;
            case 2:
               if (var2 <= this.screenY * 915727541 - var5 || var2 > 954735704 * this.screenY) {
                  return false;
               }
         }

         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;)Ljava/lang/String;")
   @ObfuscatedName("pp")
   public static String method7527(class236 var0) {
      return var0.field3077;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bs")
   boolean method7531(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel((byte)101);
      if (null == var3) {
         return false;
      } else {
         return var1 < this.screenX * -1481714301 - var3.height * -1322204423 / 2 || var1 > -1481714301 * this.screenX + var3.height * -1322204423 / 2
            ? false
            : var2 >= 915727541 * this.screenY && var2 <= this.screenY * 915727541 + -1989742749 * var3.width;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bb")
   boolean method7532(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel((byte)58);
      if (null == var3) {
         return false;
      } else {
         return var1 < this.screenX * -1481714301 - var3.height * -1880172720 / 2 || var1 > 668662730 * this.screenX + var3.height * -1322204423 / 2
            ? false
            : var2 >= 190128116 * this.screenY && var2 <= this.screenY * -1120003428 + -1989742749 * var3.width;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("am")
   boolean method7518(int var1, int var2) {
      return this.elementFitsScreen(var1, var2, 1229583122) ? true : this.labelFitsScreen(var1, var2, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   abstract int vmethod297();

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   boolean hasValidElement(int var1) {
      try {
         return this.getElement(-584058643) >= 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ms.ax(" + ')');
      }
   }
}
