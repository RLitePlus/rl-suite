import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hd")
public abstract class AbstractWorldMapIcon implements WorldMapIcon {
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ac")
   public final classKY field2769;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ax")
   public final classKY field2770;
   @ObfuscatedName("aa")
   int field2771;
   @ObfuscatedName("ao")
   int field2772;

   public WorldPoint getCoordinate() {
      classKY var1 = this.method6004();
      return new WorldPoint(var1.field4055 * 1870919123, var1.field4056 * 819227381, var1.field4057 * -210579119);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   public abstract int vmethod486(byte var1);

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("au")
   boolean method5993(int var1, int var2, byte var3) {
      try {
         if (this.method5999(var1, var2, -1042187112)) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.method6001(var1, var2, 196548377);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hd.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("am")
   boolean method5994(int var1, int var2) {
      return this.method5999(var1, var2, -1042187112) ? true : this.method6001(var1, var2, 1672440760);
   }

   @ObfuscatedSignature(descriptor = "(B)Lhw;")
   @ObfuscatedName("ae")
   abstract classHW vmethod491(byte var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   abstract int vmethod493(int var1);

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ag")
   abstract int vmethod494(short var1);

   @ObfuscatedSignature(descriptor = "()Lhw;")
   @ObfuscatedName("aj")
   abstract classHW vmethod490();

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("wt")
   public classKY method6004() {
      return this.field2769;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   abstract int vmethod492();

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("aw")
   boolean method6001(int var1, int var2, int var3) {
      try {
         classHW var4 = this.vmethod491((byte)-71);
         if (var4 == null) {
            if (var3 == -1902233820) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var1 >= this.field2771 * 797816725 - 2116737063 * var4.field2902 / 2) {
               if (var3 == -1902233820) {
                  throw new IllegalStateException();
               }

               if (var1 <= var4.field2902 * 2116737063 / 2 + 797816725 * this.field2771) {
                  if (var2 >= this.field2772 * 655244251) {
                     if (var2 <= var4.field2899 * -737746087 + this.field2772 * 655244251) {
                        return true;
                     }

                     if (var3 == -1902233820) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }

               if (var3 == -1902233820) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hd.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public abstract int vmethod488();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public abstract int vmethod487();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public abstract int vmethod489();

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ar")
   boolean method5999(int var1, int var2, int var3) {
      try {
         if (!this.method5997((byte)-13)) {
            if (var3 != -1042187112) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            WorldMapElement var4 = SceneTilePaint.method4796(this.vmethod486((byte)-34), (byte)-12);
            int var5 = this.vmethod493(-1358808218);
            int var6 = this.vmethod494((short)16349);
            switch (var4.field5402.field5231 * 1700578181) {
               case 0:
                  if (var1 <= this.field2771 * 797816725 - var5) {
                     return false;
                  }

                  if (var3 != -1042187112) {
                     throw new IllegalStateException();
                  }

                  if (var1 > this.field2771 * 797816725) {
                     if (var3 != -1042187112) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 1:
                  if (var1 < this.field2771 * 797816725 - var5 / 2 || var1 > var5 / 2 + 797816725 * this.field2771) {
                     return false;
                  }
                  break;
               case 2:
                  if (var1 < 797816725 * this.field2771) {
                     return false;
                  }

                  if (var3 != -1042187112) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= var5 + this.field2771 * 797816725) {
                     if (var3 != -1042187112) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
            }

            switch (-1205275063 * var4.field5397.field4917) {
               case 0:
                  if (var2 < 655244251 * this.field2772 - var6 / 2) {
                     return false;
                  }

                  if (var3 != -1042187112) {
                     throw new IllegalStateException();
                  }

                  if (var2 > this.field2772 * 655244251 + var6 / 2) {
                     if (var3 != -1042187112) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 1:
                  if (var2 <= 655244251 * this.field2772 - var6) {
                     return false;
                  }

                  if (var2 > this.field2772 * 655244251) {
                     if (var3 != -1042187112) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
                  break;
               case 2:
                  if (var2 < this.field2772 * 655244251) {
                     return false;
                  }

                  if (var2 >= var6 + this.field2772 * 655244251) {
                     if (var3 != -1042187112) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "hd.ar(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lac;)Z")
   @ObfuscatedName("kp")
   public static boolean method5995(classAC var0) {
      return var0.field133.isDone();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("av")
   boolean method5996() {
      return this.vmethod486((byte)7) >= 0;
   }

   public int getType() {
      return this.vmethod486((byte)-119);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhd;II)Z")
   @ObfuscatedName("ni")
   public static boolean method6000(AbstractWorldMapIcon var0, int var1, int var2) {
      if (var0 == null) {
         var0.getType();
      }

      if (!var0.method5997((byte)-103)) {
         return false;
      } else {
         WorldMapElement var3 = SceneTilePaint.method4796(var0.vmethod486((byte)-114), (byte)-81);
         int var4 = var0.vmethod493(-1468528891);
         int var5 = var0.vmethod494((short)5677);
         switch (var3.field5402.field5231 * 1700578181) {
            case 0:
               if (var1 <= var0.field2771 * 797816725 - var4 || var1 > var0.field2771 * 797816725) {
                  return false;
               }
               break;
            case 1:
               if (var1 < var0.field2771 * 797816725 - var4 / 2 || var1 > var4 / 2 + 797816725 * var0.field2771) {
                  return false;
               }
               break;
            case 2:
               if (var1 < 797816725 * var0.field2771 || var1 >= var4 + var0.field2771 * 797816725) {
                  return false;
               }
         }

         switch (-1205275063 * var3.field5397.field4917) {
            case 0:
               if (var2 >= 655244251 * var0.field2772 - var5 / 2 && var2 <= var0.field2772 * 655244251 + var5 / 2) {
                  break;
               }

               return false;
            case 1:
               if (var2 > 655244251 * var0.field2772 - var5 && var2 <= var0.field2772 * 655244251) {
                  break;
               }

               return false;
            case 2:
               if (var2 < var0.field2772 * 655244251 || var2 >= var5 + var0.field2772 * 655244251) {
                  return false;
               }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   abstract int vmethod497();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   abstract int vmethod496();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   abstract int vmethod495();

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ai")
   boolean method5997(byte var1) {
      try {
         boolean var10000;
         if (this.vmethod486((byte)-66) >= 0) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "hd.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ak")
   boolean method6002(int var1, int var2) {
      classHW var3 = this.vmethod491((byte)40);
      if (var3 == null) {
         return false;
      } else {
         return var1 < this.field2771 * 797816725 - 2116737063 * var3.field2902 / 2 || var1 > var3.field2902 * 2116737063 / 2 + 797816725 * this.field2771
            ? false
            : var2 >= this.field2772 * 655244251 && var2 <= var3.field2899 * -737746087 + this.field2772 * 655244251;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("at")
   boolean method5998() {
      return this.vmethod486((byte)-101) >= 0;
   }

   AbstractWorldMapIcon(classKY var1, classKY var2) {
      this.field2770 = var1;
      this.field2769 = var2;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bw")
   static final void method6003(byte var0) {
      try {
         if (!client.field959) {
            if (var0 <= 64) {
               throw new IllegalStateException();
            }

            int var1 = classKY.method6612(GameObject.field2199 * -1584251835, -1889906639);
            int var2 = classKY.method6612(-214044967 * GraphicsObject.field474, 1693229959);
            int var3 = classKV.method6571(classIS.field3053, var1, var2, classIS.field3053.field1710 * -483624883, (byte)122) - classBQ.field530 * 1492293289;
            classHA.method5988(var1, var3, var2, 885661509);
         } else if (null != client.field943) {
            if (var0 <= 64) {
               throw new IllegalStateException();
            }

            classKI.field3598 = client.field943.vmethod614(1736248623) * -1197566029;
            classAI.field167 = client.field943.vmethod618(-1326078651) * -337711351;
            if (client.field1001) {
               if (var0 <= 64) {
                  throw new IllegalStateException();
               }

               classNL.field4684 = client.field943.vmethod620(1122221346) * -477405995;
            } else {
               classNL.field4684 = (
                     classKV.method6571(
                           classIS.field3053,
                           -325062789 * classKI.field3598,
                           1343311673 * classAI.field167,
                           -483624883 * classIS.field3053.field1710,
                           (byte)122
                        )
                        - client.field943.vmethod620(593117606)
                  )
                  * -477405995;
            }

            client.field943.method12265((byte)-56);
         }

         if (!client.field991) {
            int var13;
            int var14;
            int var15;
            label118: {
               if (client.field830) {
                  if (var0 <= 64) {
                     throw new IllegalStateException();
                  }

                  if (client.field996 != null) {
                     if (var0 <= 64) {
                        throw new IllegalStateException();
                     }

                     var13 = client.field996.vmethod614(1795660463);
                     var14 = client.field996.vmethod618(-1326078651);
                     var15 = classKV.method6571(classIS.field3053, var13, var14, -483624883 * classIS.field3053.field1710, (byte)122)
                        - client.field996.vmethod620(1205980509);
                     client.field996.method12265((byte)-57);
                     classHE.field2781 = classCQ.field1205 * -856235905;
                     if (client.field996.method12268((byte)120)) {
                        if (var0 <= 64) {
                           throw new IllegalStateException();
                        }

                        client.field830 = false;
                        client.field996 = null;
                     }
                     break label118;
                  }
               }

               var13 = classKY.method6612(classOR.field5104 * -1861237657, -142680752);
               var14 = classKY.method6612(742819657 * classCQ.field1219, 1302326797);
               var15 = classKV.method6571(classIS.field3053, var13, var14, -483624883 * classIS.field3053.field1710, (byte)122)
                  - 1218236279 * classMD.field4486;
            }

            int var4 = var13 - classKI.field3598 * -325062789;
            int var5 = var15 - 1615527037 * classNL.field4684;
            int var6 = var14 - 1343311673 * classAI.field167;
            int var7 = (int)Math.sqrt(var4 * var4 + var6 * var6);
            int var8 = classIU.method6316(Math.atan2(var5, var7));
            short var10 = 8192;
            if (var8 > var10) {
               if (var0 <= 64) {
                  throw new IllegalStateException();
               }

               var8 -= classKG.method6472(787321987);
            }

            int var11 = -classIU.method6316(Math.atan2(var4, var6));
            classMH.method7571(var8, var11, (short)19447);
         } else {
            if (client.field995 != null) {
               if (var0 <= 64) {
                  throw new IllegalStateException();
               }

               client.field914.method11434(client.field995.method11937((byte)-91), -1749416718);
               client.field914.method11434(classKC.method6458(client.field914.method11436((short)-7662), -181998943), -1582187546);
               client.field995.method12265((byte)-37);
            }

            if (null != client.field813) {
               if (var0 <= 64) {
                  return;
               }

               client.field796.method11434(client.field813.method11937((byte)-61), -1765419919);
               client.field813.method12265((byte)-16);
            }

            if (client.field993) {
               if (var0 <= 64) {
                  throw new IllegalStateException();
               }

               if (client.field995 != null) {
                  if (!client.field995.method12268((byte)105)) {
                     return;
                  }

                  if (var0 <= 64) {
                     throw new IllegalStateException();
                  }
               }

               if (client.field813 != null) {
                  if (var0 <= 64) {
                     return;
                  }

                  if (!client.field813.method12268((byte)5)) {
                     return;
                  }

                  if (var0 <= 64) {
                     throw new IllegalStateException();
                  }
               }

               client.field995 = null;
               client.field813 = null;
               client.field991 = false;
               classHE.field2781 = classCQ.field1205 * -856235905;
               client.field993 = false;
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "hd.bw(" + ')');
      }
   }
}
