import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ig")
public class classIG extends classHB {
   @ObfuscatedName("az")
   long field2967;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2968 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field2969 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field2970 = 114;
   @ObfuscatedName("af")
   String field2966;

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(classIQ var1) {
      var1.method6264(-2076329511100161443L * this.field2967, this.field2966, (byte)69);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         if (classXY.method13039(var1, -346779531) != 255) {
            if (var2 >= -989877912) {
               throw new IllegalStateException();
            }

            var1.field6955 -= -1095856699;
            this.field2967 = var1.method13059(-810938496) * -148600610369633803L;
         }

         this.field2966 = var1.method13069((byte)3);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ig.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(classIQ var1, byte var2) {
      try {
         var1.method6264(-2076329511100161443L * this.field2967, this.field2966, (byte)44);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ig.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      if (classXY.method13039(var1, -346779531) != 255) {
         var1.field6955 -= -1095856699;
         this.field2967 = var1.method13059(-1534093694) * -148600610369633803L;
      }

      this.field2966 = var1.method13069((byte)-64);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(classIQ var1) {
      var1.method6264(-2076329511100161443L * this.field2967, this.field2966, (byte)45);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(classIQ var1) {
      var1.method6264(-2076329511100161443L * this.field2967, this.field2966, (byte)-80);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      if (classXY.method13039(var1, -346779531) != -1087359743) {
         var1.field6955 -= -1095856699;
         this.field2967 = var1.method13059(1083767445) * -148600610369633803L;
      }

      this.field2966 = var1.method13069((byte)-70);
   }

   classIG(classIF var1) {
      this.this$0 = var1;
      this.field2967 = 148600610369633803L;
      this.field2966 = null;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("aj")
   static int method6210(int var0, classBL var1, boolean var2, int var3) {
      try {
         classLW var4;
         if (var0 >= 2000) {
            if (var3 != -1306305670) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            int var5 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            var4 = classLY.method7375(classWK.field6691, var5, (byte)109);
         } else {
            classLW var10000;
            if (var2) {
               if (var3 != -1306305670) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = classDL.field1558;
            }

            var4 = var10000;
         }

         if (1000 == var0) {
            if (var3 != -1306305670) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 480164916;
               var4.field4248 = classBB.field323[classDY.field1679 * -324749371] * -1076753689;
               var4.field4285 = 1989424741 * classBB.field323[1 + classDY.field1679 * -324749371];
               var4.field4264 = 1632281619 * classBB.field323[classDY.field1679 * -324749371 + 2];
               var4.field4250 = classBB.field323[3 + classDY.field1679 * -324749371] * 454876301;
               classCD.method1430(var4, classSA.field5897 * 773246731, classEU.field1938 * 8379747, classWK.field6691, client.field823, -2055866783);
               if (-1510882375 * var4.field4375 == 0) {
                  if (var3 != -1306305670) {
                     throw new IllegalStateException();
                  }

                  classLW[] var12;
                  if (-1 == var4.field4260 * 63131743) {
                     if (var3 != -1306305670) {
                        throw new IllegalStateException();
                     }

                     var12 = classWK.field6691.field4440[var4.field4329 * -1163656551 >> 16];
                  } else {
                     var12 = classLY.method7375(classWK.field6691, var4.field4342 * -1502647899, (byte)120).field4340;
                  }

                  classLW[] var9 = var12;
                  classFC.method4586(var9, var4, false, classWK.field6691, client.field823, 1225806495);
               }

               return 1;
            }
         } else if (1001 == var0) {
            if (var3 != -1306305670) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 480164916;
               var4.field4255 = classBB.field323[classDY.field1679 * -324749371] * 1034606045;
               var4.field4335 = -259501473 * classBB.field323[1 + classDY.field1679 * -324749371];
               var4.field4251 = classBB.field323[2 + classDY.field1679 * -324749371] * -1430539503;
               var4.field4252 = classBB.field323[classDY.field1679 * -324749371 + 3] * -565540095;
               classCD.method1430(var4, 773246731 * classSA.field5897, classEU.field1938 * 8379747, classWK.field6691, client.field823, -1983695323);
               if (0 == var4.field4375 * -1510882375) {
                  if (var3 != -1306305670) {
                     throw new IllegalStateException();
                  }

                  classLW[] var11;
                  if (-1 == 63131743 * var4.field4260) {
                     if (var3 != -1306305670) {
                        throw new IllegalStateException();
                     }

                     var11 = classWK.field6691.field4440[var4.field4329 * -1163656551 >> 16];
                  } else {
                     var11 = classLY.method7375(classWK.field6691, -1502647899 * var4.field4342, (byte)82).field4340;
                  }

                  classLW[] var8 = var11;
                  classFC.method4586(var8, var4, false, classWK.field6691, client.field823, -1742273654);
               }

               return 1;
            }
         } else if (var0 == 1003) {
            boolean var10;
            if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 != -1306305670) {
                  throw new IllegalStateException();
               }

               var10 = true;
            } else {
               var10 = false;
            }

            boolean var7 = var10;
            if (var4.field4289 != var7) {
               if (var3 != -1306305670) {
                  throw new IllegalStateException();
               }

               var4.field4289 = var7;
            }

            return 1;
         } else if (var0 == 1005) {
            if (var3 != -1306305670) {
               throw new IllegalStateException();
            } else {
               boolean var13;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 != -1306305670) {
                     throw new IllegalStateException();
                  }

                  var13 = true;
               } else {
                  var13 = false;
               }

               var4.field4403 = var13;
               return 1;
            }
         } else if (1006 == var0) {
            boolean var10001;
            if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 != -1306305670) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var4.field4328 = var10001;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ig.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(JIIZLrz;I)Ljava/lang/String;")
   @ObfuscatedName("ab")
   static String method6209(long var0, int var2, int var3, boolean var4, classRZ var5, int var6) {
      try {
         boolean var7 = var0 < 0L;
         long var8 = Math.abs(var0);
         if (Long.toString(var8).length() <= var2) {
            if (var6 <= 722349416) {
               throw new IllegalStateException();
            } else {
               return Long.toString(var0);
            }
         } else {
            long var10 = -1L;
            String var12 = "";
            if (var8 >= classRE.field5647) {
               if (var6 <= 722349416) {
                  throw new IllegalStateException();
               }

               long var13 = var8 / classRE.field5646;
               if (Long.toString(var13).length() <= var2) {
                  if (var6 <= 722349416) {
                     throw new IllegalStateException();
                  }

                  var10 = classRE.field5646;
                  var12 = "K";
               } else if (var8 >= classRE.field5651) {
                  long var15 = var8 / classRE.field5649;
                  if (Long.toString(var15).length() <= var2) {
                     if (var6 <= 722349416) {
                        throw new IllegalStateException();
                     }

                     var10 = classRE.field5649;
                     var12 = "M";
                  } else if (var8 >= classRE.field5648) {
                     if (var6 <= 722349416) {
                        throw new IllegalStateException();
                     }

                     long var17 = var8 / classRE.field5650;
                     if (Long.toString(var17).length() <= var2) {
                        if (var6 <= 722349416) {
                           throw new IllegalStateException();
                        }

                        var10 = classRE.field5650;
                        var12 = "B";
                     }
                  }
               }
            }

            if (-1L == var10) {
               return Long.toString(var0);
            } else {
               long var20 = var8;

               for (int var22 = 0; var22 < var3; var22++) {
                  if (var6 <= 722349416) {
                     throw new IllegalStateException();
                  }

                  var20 *= 10L;
               }

               var20 /= var10;
               String var23 = classXW.method12950(var20, var3, false, var4, var5, (byte)10);
               StringBuilder var10000 = new StringBuilder();
               String var10001;
               if (var7) {
                  if (var6 <= 722349416) {
                     throw new IllegalStateException();
                  }

                  var10001 = "-";
               } else {
                  var10001 = "";
               }

               return var10000.append(var10001).append(var23).append(var12).toString();
            }
         }
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "ig.ab(" + ')');
      }
   }
}
