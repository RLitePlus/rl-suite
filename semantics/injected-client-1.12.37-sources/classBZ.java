import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bz")
public class classBZ {
   @ObfuscatedSignature(descriptor = "[Llu;")
   @ObfuscatedName("ay")
   static final classLU[] field621;
   @ObfuscatedSignature(descriptor = "Llu;")
   @ObfuscatedName("af")
   classLU field624;
   @ObfuscatedName("ae")
   boolean field622;
   @ObfuscatedSignature(descriptor = "Llj;")
   @ObfuscatedName("ab")
   classLJ field623;
   @ObfuscatedName("as")
   int field632;
   @ObfuscatedName("ac")
   int field629;
   @ObfuscatedSignature(descriptor = "Llv;")
   @ObfuscatedName("az")
   classLV field625 = classLV.field4234;
   @ObfuscatedName("aa")
   int field627;
   @ObfuscatedName("ag")
   int field630;
   @ObfuscatedName("al")
   int field628;
   @ObfuscatedName("ax")
   int field633;
   @ObfuscatedSignature(descriptor = "[Llv;")
   @ObfuscatedName("aj")
   static final classLV[] field620 = client.method1641(-158713787);
   @ObfuscatedName("ao")
   int field631;
   @ObfuscatedSignature(descriptor = "[Llj;")
   @ObfuscatedName("aq")
   static final classLJ[] field626 = classBM.method1149(-1511394908);
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   static final int field634 = 147;

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("az")
   static boolean method1381(int var0, byte var1) {
      try {
         return var0 != 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "bz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void method1376(byte var1) {
      try {
         this.field625 = classLV.field4234;
         this.field624 = classLU.field4227;
         this.field622 = false;
         this.field623 = classLJ.field4174;
         this.field632 = -2126001287;
         this.field629 = 1502303207;
         this.field628 = -1858000903;
         this.field631 = 366774729;
         this.field630 = -1256957799;
         this.field633 = 156281219;
         this.field627 = 689558257;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "bz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbz;I)V")
   @ObfuscatedName("af")
   void method1378(classBZ var1, int var2) {
      try {
         if (var1 == this) {
            if (var2 >= -652197050) {
               throw new IllegalStateException();
            }
         } else {
            this.field625 = var1.field625;
            this.field624 = var1.field624;
            this.field622 = var1.field622;
            switch (-1494362127 * this.field624.field4230) {
               case 0:
                  this.field627 = 1 * var1.field627;
               case 1:
               default:
                  break;
               case 2:
                  this.field628 = var1.field628 * 1;
                  this.field631 = var1.field631 * 1;
                  this.field630 = 1 * var1.field630;
                  this.field633 = var1.field633 * 1;
                  break;
               case 3:
                  this.field623 = var1.field623;
                  this.field632 = var1.field632 * 1;
                  this.field629 = 1 * var1.field629;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "bz.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;B)V")
   @ObfuscatedName("ae")
   void method1382(int var1, PacketBuffer var2, byte var3) {
      try {
         this.field625 = (classLV)classOF.method8404(field620, var1 & 7, 1332157492);
         this.field624 = (classLU)classOF.method8404(field621, var1 >> 3 & 7, -31616315);
         boolean var10001;
         if ((var1 >> 6 & 1) == 1) {
            if (var3 != 2) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field622 = var10001;
         switch (-1494362127 * this.field624.field4230) {
            case 0:
               this.field627 = var2.method13094((short)2340) * -689558257;
            case 1:
            default:
               break;
            case 2:
               this.field628 = var2.method13094((short)26208) * 1858000903;
               this.field631 = var2.method13094((short)4087) * -366774729;
               int var4 = var2.method13094((short)3941);
               this.field630 = (var4 & 15) * 1256957799;
               this.field633 = -156281219 * (var4 >> 4 & 15);
               break;
            case 3:
               this.field623 = (classLJ)classOF.method8404(field626, var2.method13094((short)28779), -1210266373);
               this.field632 = Buffer.method13110(var2, -324749371) * 2126001287;
               this.field629 = var2.method13094((short)17673) * -1502303207;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "bz.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method1386(int var1) {
      try {
         this.field623 = classLJ.field4174;
         this.field632 = -2126001287;
         this.field629 = 1502303207;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "bz.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method1387() {
      this.field623 = classLJ.field4174;
      this.field632 = -2126001287;
      this.field629 = 1502303207;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method1377() {
      this.field625 = classLV.field4234;
      this.field624 = classLU.field4227;
      this.field622 = false;
      this.field623 = classLJ.field4174;
      this.field632 = -2126001287;
      this.field629 = 1502303207;
      this.field628 = -1858000903;
      this.field631 = 366774729;
      this.field630 = 793568035;
      this.field633 = 156281219;
      this.field627 = -620499189;
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("as")
   void method1379(classBZ var1) {
      if (var1 != this) {
         this.field625 = var1.field625;
         this.field624 = var1.field624;
         this.field622 = var1.field622;
         switch (-243258814 * this.field624.field4230) {
            case 0:
               this.field627 = 1 * var1.field627;
            case 1:
            default:
               break;
            case 2:
               this.field628 = var1.field628 * 1;
               this.field631 = var1.field631 * 1;
               this.field630 = 1 * var1.field630;
               this.field633 = var1.field633 * 1;
               break;
            case 3:
               this.field623 = var1.field623;
               this.field632 = var1.field632 * 1;
               this.field629 = 1 * var1.field629;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("ax")
   void method1380(classBZ var1) {
      if (var1 != this) {
         this.field625 = var1.field625;
         this.field624 = var1.field624;
         this.field622 = var1.field622;
         switch (-1849309130 * this.field624.field4230) {
            case 0:
               this.field627 = 1 * var1.field627;
            case 1:
            default:
               break;
            case 2:
               this.field628 = var1.field628 * 1;
               this.field631 = var1.field631 * 1;
               this.field630 = 1 * var1.field630;
               this.field633 = var1.field633 * 1;
               break;
            case 3:
               this.field623 = var1.field623;
               this.field632 = var1.field632 * 1;
               this.field629 = 1 * var1.field629;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("aa")
   void method1383(int var1, PacketBuffer var2) {
      this.field625 = (classLV)classOF.method8404(field620, var1 & 7, -809198840);
      this.field624 = (classLU)classOF.method8404(field621, var1 >> 3 & 7, -511391138);
      this.field622 = (var1 >> 6 & 1) == 1;
      switch (-1253733206 * this.field624.field4230) {
         case 0:
            this.field627 = var2.method13094((short)8946) * -689558257;
         case 1:
         default:
            break;
         case 2:
            this.field628 = var2.method13094((short)20946) * 1895927539;
            this.field631 = var2.method13094((short)23772) * -366774729;
            int var3 = var2.method13094((short)32221);
            this.field630 = (var3 & 15) * 1256957799;
            this.field633 = 1584290030 * (var3 >> 4 & 15);
            break;
         case 3:
            this.field623 = (classLJ)classOF.method8404(field626, var2.method13094((short)3798), 1500962346);
            this.field632 = Buffer.method13110(var2, -324749371) * 1568671516;
            this.field629 = var2.method13094((short)19978) * 794530686;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method1388() {
      this.field623 = classLJ.field4174;
      this.field632 = -2126001287;
      this.field629 = 1502303207;
   }

   static {
      classLU[] var0 = new classLU[]{classLU.field4228, classLU.field4227, classLU.field4226, classLU.field4225};
      field621 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbz;)V")
   @ObfuscatedName("ug")
   public static void method1389(classBZ var0) {
      if (var0 == null) {
         var0.method1377();
      }

      var0.field623 = classLJ.field4174;
      var0.field632 = -1007916979;
      var0.field629 = 1502303207;
   }

   classBZ() {
      this.field624 = classLU.field4227;
      this.field623 = classLJ.field4174;
      this.field628 = -1858000903;
      this.field627 = 689558257;
   }

   @ObfuscatedSignature(descriptor = "(IIZI)Ljava/lang/String;")
   @ObfuscatedName("aa")
   static String method1390(int var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var1 <= 36) {
               if (var2) {
                  if (var3 >= -1875058743) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 0) {
                     int var4 = 2;

                     for (int var5 = var0 / var1; var5 != 0; var4++) {
                        if (var3 >= -1875058743) {
                           throw new IllegalStateException();
                        }

                        var5 /= var1;
                     }

                     char[] var6 = new char[var4];
                     var6[0] = '+';

                     for (int var7 = var4 - 1; var7 > 0; var7--) {
                        int var8 = var0;
                        var0 /= var1;
                        int var9 = var8 - var1 * var0;
                        if (var9 >= 10) {
                           var6[var7] = (char)(var9 + 87);
                        } else {
                           var6[var7] = (char)(48 + var9);
                        }
                     }

                     return new String(var6);
                  }

                  if (var3 >= -1875058743) {
                     throw new IllegalStateException();
                  }
               }

               return Integer.toString(var0, var1);
            }

            if (var3 >= -1875058743) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "bz.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbz;ILxs;)V")
   @ObfuscatedName("mb")
   public static void method1384(classBZ var0, int var1, PacketBuffer var2) {
      if (var0 == null) {
         var0.method1387();
      } else {
         var0.field625 = (classLV)classOF.method8404(field620, var1 & 7, 1381179409);
         var0.field624 = (classLU)classOF.method8404(field621, var1 >> 3 & 7, 175731456);
         var0.field622 = (var1 >> 6 & 1) == 1;
         switch (300470661 * var0.field624.field4230) {
            case 0:
               var0.field627 = var2.method13094((short)11487) * 2050504962;
            case 1:
            default:
               break;
            case 2:
               var0.field628 = var2.method13094((short)17080) * 1434065805;
               var0.field631 = var2.method13094((short)1342) * -366774729;
               int var3 = var2.method13094((short)19436);
               var0.field630 = (var3 & 15) * 1022014113;
               var0.field633 = 950159477 * (var3 >> 4 & 15);
               break;
            case 3:
               var0.field623 = (classLJ)classOF.method8404(field626, var2.method13094((short)29938), -2137650693);
               var0.field632 = Buffer.method13110(var2, -324749371) * 2126001287;
               var0.field629 = var2.method13094((short)11308) * -957594990;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("ag")
   public static void method1391(Buffer var0, int var1, int var2) {
      try {
         if (classME.field4490 != null) {
            if (var2 != -1038651980) {
               return;
            }

            try {
               classME.field4490.method138(0L);
               classME.field4490.method153(var0.array, var1, 24, -1523322060);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "bz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   public static int method1385(int var0, int var1) {
      try {
         var0 = --var0 | var0 >>> 1;
         var0 |= var0 >>> 2;
         var0 |= var0 >>> 4;
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return var0 + 1;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "bz.aa(" + 41);
      }
   }
}
