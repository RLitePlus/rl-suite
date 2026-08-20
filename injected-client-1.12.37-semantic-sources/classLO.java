import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lo")
public class classLO {
   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("az")
   static int method7132(int var0, byte var1) {
      try {
         return classGV.field2705[var0 & 2047];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lo.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llr;)V")
   @ObfuscatedName("ab")
   public static void method7128(classLR var0) {
      classLF.field4133 = var0;
   }

   classLO() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("ct")
   static void method7134(WorldView var0, byte var1) {
      try {
         if (null != classIY.field3098 && 1272389989 * client.field838 > 0) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            int var2 = -1017414016 * client.field988;
            classCI.method1508(var0, var2, classIY.field3098, (byte)94);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lo.ct(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method7130(classXY var0) {
      String var1;
      try {
         int var2 = var0.method13094((short)25770);
         if (var2 > 825621970) {
            var2 = 534556402;
         }

         byte[] var3 = new byte[var2];
         var0.field6955 = var0.field6955
            + classLR.method7145(classLF.field4133, var0.field6954, -1185599464 * var0.field6955, var3, 0, var2, 989641049) * -1095856699;
         String var4 = classKQ.method6552(var3, 0, var2, (byte)-106);
         var1 = var4;
      } catch (Exception var5) {
         var1 = "Cabbage";
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)I")
   @ObfuscatedName("md")
   public static int method7133(classQR var0) {
      return var0.field5598 * 1684838611;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/lang/String;)I")
   @ObfuscatedName("ag")
   public static int method7129(classXY var0, String var1) {
      int var2 = var0.field6955 * 702114061;
      byte[] var3 = classVX.method12262(var1, -1987071451);
      var0.method13026(var3.length, 1699258130);
      var0.field6955 = var0.field6955 + classLF.field4133.method7143(var3, 0, var3.length, var0.field6954, var0.field6955 * 702114061, 951974267) * -1095856699;
      return var0.field6955 * 702114061 - var2;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bv")
   static int method7135(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 6200) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               client.field867 = (short)classZL.method14064(classBB.field323[-324749371 * DynamicObject.field1679], -2001374514);
               if (client.field867 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field867 = 256;
               }

               client.field868 = (short)classZL.method14064(classBB.field323[1 + DynamicObject.field1679 * -324749371], -2033994976);
               if (client.field868 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field868 = 256;
               }

               return 1;
            }
         } else if (6201 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               client.field869 = (short)classBB.field323[-324749371 * DynamicObject.field1679];
               if (client.field869 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field869 = 256;
               }

               client.field862 = (short)classBB.field323[DynamicObject.field1679 * -324749371 + 1];
               if (client.field862 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field862 = 320;
               }

               return 1;
            }
         } else if (6202 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 480164916;
               client.field876 = (short)classBB.field323[DynamicObject.field1679 * -324749371];
               if (client.field876 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field876 = 1;
               }

               client.field872 = (short)classBB.field323[DynamicObject.field1679 * -324749371 + 1];
               if (client.field872 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field872 = 32767;
               } else if (client.field872 < client.field876) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field872 = client.field876;
               }

               client.field873 = (short)classBB.field323[2 + -324749371 * DynamicObject.field1679];
               if (client.field873 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field873 = 1;
               }

               client.field874 = (short)classBB.field323[DynamicObject.field1679 * -324749371 + 3];
               if (client.field874 <= 0) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field874 = 32767;
               } else if (client.field874 < client.field873) {
                  if (var3 != -1503643048) {
                     throw new IllegalStateException();
                  }

                  client.field874 = client.field873;
               }

               return 1;
            }
         } else if (var0 == 6203) {
            if (null != classWK.field6691.field6620) {
               classRL.method10027(
                  0, 0, 1115597881 * classWK.field6691.field6620.field4249, classWK.field6691.field6620.field4259 * 293773697, false, 317527437
               );
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field990 * 27064125;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1158148203 * client.field982;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            }

            return 1;
         } else if (6204 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field869;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field862;
               return 1;
            }
         } else if (6205 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIK.method6220(client.field867, (byte)-1);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIK.method6220(client.field868, (byte)-1);
               return 1;
            }
         } else if (6220 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 6221) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (6222 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 773246731 * classSA.field5897;
               return 1;
            }
         } else if (6223 == var0) {
            if (var3 != -1503643048) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = IntProjection.field1938 * 8379747;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lo.bv(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/String;")
   @ObfuscatedName("as")
   public static String method7131(classXY var0) {
      String var1;
      try {
         int var2 = var0.method13094((short)18047);
         if (var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.field6955 = var0.field6955
            + classLR.method7145(classLF.field4133, var0.field6954, -1035352745 * var0.field6955, var3, 0, var2, -1937684609) * 295953285;
         String var4 = classKQ.method6552(var3, 0, var2, (byte)-6);
         var1 = var4;
      } catch (Exception var5) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
