import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dp")
public class classDP extends classDA {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field1597 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("cf")
   static final int field1599 = 600;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field1598 = 68;
   @ObfuscatedName("ag")
   final boolean field1596;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldp;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("kx")
   public static URLConnection method3517(classDP var0, classEY var1) throws IOException {
      if (var0 == null) {
         var0.method3519(var1);
      }

      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1981.openConnection();
      if (!var0.field1596) {
         var2.setSSLSocketFactory(classQL.method9610(29970527));
      }

      var0.method2862(var2, (byte)72);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod300(classEY var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.field1981.getProtocol();
            if (var3.equals("http")) {
               var2 = this.method3513(var1, -644650576);
            } else {
               if (!var3.equals("https")) {
                  var1.field1982 = 679570904 * classEY.field1980;
                  return;
               }

               var2 = this.method3518(var1, -418808270);
            }

            this.method2867(var2, var1, -1722750605);
         } catch (IOException var9) {
            var1.field1982 = -1773963680 * classEY.field1980;
         }
      } finally {
         if (var2 != null && var2 instanceof HttpURLConnection) {
            HttpURLConnection var6 = (HttpURLConnection)var2;
            var6.disconnect();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ley;I)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod299(classEY var1, int var2) throws IOException {
      try {
         URLConnection var3 = null;
         boolean var11 = false /* VF: Semaphore variable */;

         label155: {
            label146: {
               try {
                  label152: {
                     var11 = true;
                     String var15 = var1.field1981.getProtocol();
                     if (var15.equals("http")) {
                        var3 = this.method3513(var1, -644650576);
                     } else {
                        if (!var15.equals("https")) {
                           var1.field1982 = -2125110057 * classEY.field1980;
                           var11 = false;
                           break label152;
                        }

                        if (var2 <= -1694968878) {
                           throw new IllegalStateException();
                        }

                        var3 = this.method3518(var1, -774737563);
                     }

                     this.method2867(var3, var1, -1722750605);
                     var11 = false;
                     break label155;
                  }
               } catch (IOException var12) {
                  var1.field1982 = -2125110057 * classEY.field1980;
                  var11 = false;
                  break label146;
               } finally {
                  if (var11) {
                     if (var3 != null) {
                        if (var2 <= -1694968878) {
                           throw new IllegalStateException();
                        }

                        if (var3 instanceof HttpURLConnection) {
                           if (var2 <= -1694968878) {
                              throw new IllegalStateException();
                           }

                           HttpURLConnection var7 = (HttpURLConnection)var3;
                           var7.disconnect();
                        }
                     }
                  }
               }

               if (var3 != null && var3 instanceof HttpURLConnection) {
                  if (var2 <= -1694968878) {
                     throw new IllegalStateException();
                  }

                  HttpURLConnection var5 = (HttpURLConnection)var3;
                  var5.disconnect();
               }

               return;
            }

            if (var3 != null) {
               if (var2 <= -1694968878) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof HttpURLConnection) {
                  if (var2 <= -1694968878) {
                     throw new IllegalStateException();
                  }

                  HttpURLConnection var4 = (HttpURLConnection)var3;
                  var4.disconnect();
                  return;
               }
            }

            return;
         }

         if (var3 != null) {
            if (var2 <= -1694968878) {
               throw new IllegalStateException();
            }

            if (var3 instanceof HttpURLConnection) {
               HttpURLConnection var16 = (HttpURLConnection)var3;
               var16.disconnect();
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "dp.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldp;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("mx")
   public static URLConnection method3512(classDP var0, classEY var1) throws IOException {
      if (var0 == null) {
         return var0.method3514(var1);
      } else {
         URLConnection var2 = var1.field1981.openConnection();
         var0.method2862(var2, (byte)72);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;I)Ljava/net/URLConnection;")
   @ObfuscatedName("bx")
   URLConnection method3513(classEY var1, int var2) throws IOException {
      try {
         URLConnection var3 = var1.field1981.openConnection();
         this.method2862(var3, (byte)29);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dp.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltq;I)V")
   @ObfuscatedName("ak")
   static void method3520(classTQ var0, int var1) {
      try {
         classFA var2 = client.field931;
         classFA var3 = var2;

         while (var3.method4531((short)11528)) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (var3.field2181 * 1363213817 == 13) {
               classEM.method3928(Integer.MAX_VALUE);
               return;
            }

            if (var3.field2181 * 1363213817 == 96) {
               if (var1 != -644062932) {
                  return;
               }

               if (classBF.field408 * -942812997 > 0) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (classBV.field590 != null) {
                     if (var1 != -644062932) {
                        throw new IllegalStateException();
                     }

                     classBF.field408 -= -1581517709;
                  }
               }
            } else if (1363213817 * var3.field2181 == 97 && -942812997 * classBF.field408 < classBF.field409 * -343302073 && classUR.field6374 != null) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               classBF.field408 += -1581517709;
            }
         }

         if (1229235359 * classTZ.field6261 != 1) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (classON.field4995) {
               return;
            }

            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (4 != classTZ.field6261 * 1229235359) {
               return;
            }

            if (var1 != -644062932) {
               return;
            }
         }

         int var4 = -329898575 * classBF.field385 + 280;
         if (classTZ.field6266 * 1422993977 >= var4) {
            if (var1 != -644062932) {
               return;
            }

            if (classTZ.field6266 * 1422993977 <= var4 + 14) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (1243590197 * classTZ.field6257 >= 4) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (1243590197 * classTZ.field6257 <= 18) {
                     classJJ.method6373(0, 0, (byte)-55);
                     return;
                  }
               }
            }
         }

         if (1422993977 * classTZ.field6266 >= var4 + 15) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (classTZ.field6266 * 1422993977 <= var4 + 80 && 1243590197 * classTZ.field6257 >= 4) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (classTZ.field6257 * 1243590197 <= 18) {
                  if (var1 != -644062932) {
                     return;
                  }

                  classJJ.method6373(0, 1, (byte)108);
                  return;
               }
            }
         }

         int var5 = classBF.field385 * -329898575 + 390;
         if (classTZ.field6266 * 1422993977 >= var5) {
            if (var1 != -644062932) {
               return;
            }

            if (1422993977 * classTZ.field6266 <= 14 + var5) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (1243590197 * classTZ.field6257 >= 4) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (1243590197 * classTZ.field6257 <= 18) {
                     if (var1 != -644062932) {
                        return;
                     }

                     classJJ.method6373(1, 0, (byte)-18);
                     return;
                  }
               }
            }
         }

         if (1422993977 * classTZ.field6266 >= var5 + 15) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (1422993977 * classTZ.field6266 <= var5 + 80) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (1243590197 * classTZ.field6257 >= 4) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (1243590197 * classTZ.field6257 <= 18) {
                     if (var1 != -644062932) {
                        throw new IllegalStateException();
                     }

                     classJJ.method6373(1, 1, (byte)85);
                     return;
                  }
               }
            }
         }

         int var6 = classBF.field385 * -329898575 + 500;
         if (classTZ.field6266 * 1422993977 >= var6) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (classTZ.field6266 * 1422993977 <= 14 + var6 && classTZ.field6257 * 1243590197 >= 4 && 1243590197 * classTZ.field6257 <= 18) {
               if (var1 != -644062932) {
                  return;
               }

               classJJ.method6373(2, 0, (byte)14);
               return;
            }
         }

         if (1422993977 * classTZ.field6266 >= 15 + var6) {
            if (var1 != -644062932) {
               return;
            }

            if (classTZ.field6266 * 1422993977 <= var6 + 80 && classTZ.field6257 * 1243590197 >= 4) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (1243590197 * classTZ.field6257 <= 18) {
                  classJJ.method6373(2, 1, (byte)41);
                  return;
               }
            }
         }

         int var7 = classBF.field385 * -329898575 + 610;
         if (classTZ.field6266 * 1422993977 >= var7) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (1422993977 * classTZ.field6266 <= var7 + 14) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               if (classTZ.field6257 * 1243590197 >= 4) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (1243590197 * classTZ.field6257 <= 18) {
                     if (var1 != -644062932) {
                        return;
                     }

                     classJJ.method6373(3, 0, (byte)29);
                     return;
                  }
               }
            }
         }

         if (classTZ.field6266 * 1422993977 >= var7 + 15) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (classTZ.field6266 * 1422993977 <= 80 + var7 && 1243590197 * classTZ.field6257 >= 4) {
               if (var1 != -644062932) {
                  return;
               }

               if (classTZ.field6257 * 1243590197 <= 18) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  classJJ.method6373(3, 1, (byte)-27);
                  return;
               }
            }
         }

         if (classTZ.field6266 * 1422993977 >= 708 + classBF.field385 * -329898575
            && 1243590197 * classTZ.field6257 >= 4
            && classTZ.field6266 * 1422993977 <= classBF.field385 * -329898575 + 708 + 50) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            }

            if (1243590197 * classTZ.field6257 <= 20) {
               if (var1 != -644062932) {
                  throw new IllegalStateException();
               }

               classEM.method3928(Integer.MAX_VALUE);
               return;
            }
         }

         if (-1 != classBF.field400 * -2105609177) {
            if (var1 != -644062932) {
               throw new IllegalStateException();
            } else {
               classCM var8 = classCM.field1170[classBF.field400 * -2105609177];
               int var10 = client.field883 * -2024190683;
               classXE var11 = classXE.field6844;
               boolean var9 = (var10 & var11.vmethod8((byte)1)) != 0;
               boolean var13 = classCM.method2487(var8, -1921739361);
               classAC.field135 = var13;
               String var10001;
               if (var13) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  var10001 = "beta";
               } else {
                  var10001 = var8.field1168;
               }

               var8.field1168 = var10001;
               classDB.method2886(var8, 1660308192);
               classEM.method3928(Integer.MAX_VALUE);
               if (var9 != var13) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  classAC.method325((byte)11);
               }
            }
         } else {
            if (classBF.field408 * -942812997 > 0) {
               if (var1 != -644062932) {
                  return;
               }

               if (classBV.field590 != null) {
                  if (var1 != -644062932) {
                     return;
                  }

                  if (classTZ.field6266 * 1422993977 >= 0 && classTZ.field6266 * 1422993977 <= classBV.field590.field7121) {
                     if (var1 != -644062932) {
                        throw new IllegalStateException();
                     }

                     if (1243590197 * classTZ.field6257 >= 8379747 * classEU.field1938 / 2 - 50) {
                        if (var1 != -644062932) {
                           throw new IllegalStateException();
                        }

                        if (classTZ.field6257 * 1243590197 <= 50 + 8379747 * classEU.field1938 / 2) {
                           if (var1 != -644062932) {
                              return;
                           }

                           classBF.field408 -= -1581517709;
                        }
                     }
                  }
               }
            }

            if (-942812997 * classBF.field408 < classBF.field409 * -343302073) {
               if (var1 != -644062932) {
                  return;
               }

               if (classUR.field6374 != null) {
                  if (var1 != -644062932) {
                     throw new IllegalStateException();
                  }

                  if (1422993977 * classTZ.field6266 >= 773246731 * classSA.field5897 - classUR.field6374.field7121 - 5) {
                     if (var1 != -644062932) {
                        return;
                     }

                     if (1422993977 * classTZ.field6266 <= classSA.field5897 * 773246731) {
                        if (var1 != -644062932) {
                           throw new IllegalStateException();
                        }

                        if (classTZ.field6257 * 1243590197 >= classEU.field1938 * 8379747 / 2 - 50) {
                           if (var1 != -644062932) {
                              throw new IllegalStateException();
                           }

                           if (classTZ.field6257 * 1243590197 <= 50 + classEU.field1938 * 8379747 / 2) {
                              classBF.field408 += -1581517709;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "dp.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("al")
   @Override
   void vmethod301(classEY var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.field1981.getProtocol();
            if (var3.equals("http")) {
               var2 = this.method3513(var1, -644650576);
            } else {
               if (!var3.equals("https")) {
                  var1.field1982 = -90917604 * classEY.field1980;
                  return;
               }

               var2 = this.method3518(var1, 961254465);
            }

            this.method2867(var2, var1, -1722750605);
         } catch (IOException var9) {
            var1.field1982 = 37132127 * classEY.field1980;
         }
      } finally {
         if (var2 != null && var2 instanceof HttpURLConnection) {
            HttpURLConnection var6 = (HttpURLConnection)var2;
            var6.disconnect();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("bp")
   URLConnection method3514(classEY var1) throws IOException {
      URLConnection var2 = var1.field1981.openConnection();
      this.method2862(var2, (byte)34);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ley;I)Ljava/net/URLConnection;")
   @ObfuscatedName("bc")
   URLConnection method3518(classEY var1, int var2) throws IOException {
      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.field1981.openConnection();
         if (!this.field1596) {
            if (var2 == -631917988) {
               throw new IllegalStateException();
            }

            var3.setSSLSocketFactory(classQL.method9610(828442215));
         }

         this.method2862(var3, (byte)50);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dp.bc(" + ')');
      }
   }

   public classDP(boolean var1, int var2) {
      super(var2);
      this.field1596 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("bj")
   URLConnection method3519(classEY var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1981.openConnection();
      if (!this.field1596) {
         var2.setSSLSocketFactory(classQL.method9610(1975161598));
      }

      this.method2862(var2, (byte)103);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("bm")
   URLConnection method3515(classEY var1) throws IOException {
      URLConnection var2 = var1.field1981.openConnection();
      this.method2862(var2, (byte)106);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldp;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("ps")
   public static URLConnection method3516(classDP var0, classEY var1) throws IOException {
      if (var0 == null) {
         return var0.method3515(var1);
      } else {
         URLConnection var2 = var1.field1981.openConnection();
         var0.method2862(var2, (byte)29);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("af")
   static int method3511(String var0, int var1) {
      try {
         if (var0.equals("centre")) {
            return 1;
         } else {
            if (!var0.equals("bottom")) {
               if (var1 == -190072026) {
                  throw new IllegalStateException();
               }

               if (!var0.equals("right")) {
                  return 0;
               }
            }

            return 2;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dp.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method3510(classVA var0, int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dp.az(" + ')');
      }
   }
}
