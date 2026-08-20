import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qi")
public class classQI {
   @ObfuscatedName("af")
   final HashMap field5546;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5549 = 1000;
   @ObfuscatedName("ae")
   final HashMap field5547;
   @ObfuscatedName("ab")
   final HashMap field5548;
   @ObfuscatedName("az")
   final HashMap field5545 = new HashMap();
   @ObfuscatedSignature(descriptor = "Lgp;")
   @ObfuscatedName("ck")
   static classGP field5550;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method9582() {
      this.field5545.clear();
      this.field5546.clear();
      this.field5547.clear();
      this.field5548.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("ae")
   void method9553(String var1, String var2, int var3) {
      try {
         long var4 = 0L;

         try {
            var4 = Long.parseLong(var2);
         } catch (NumberFormatException var7) {
         }

         this.field5546.put(var1, var4);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "qi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;I)Ljava/lang/Boolean;")
   @ObfuscatedName("ne")
   public static Boolean method9579(classQI var0, String var1, int var2) {
      if (var0 == null) {
         var0.method9581(var1, var2);
      }

      try {
         return (Boolean)var0.field5547.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qi.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("af")
   void method9549(String var1, int var2, int var3) {
      try {
         this.field5545.put(var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "qi.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)J")
   @ObfuscatedName("bm")
   long method9567(String var1) {
      Long var2 = (Long)this.field5546.get(var1);
      return var2 == null ? -1L : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;S)V")
   @ObfuscatedName("ab")
   void method9556(String var1, String var2, short var3) {
      try {
         int var4 = -1;

         try {
            var4 = Integer.parseInt(var2);
         } catch (NumberFormatException var6) {
         }

         switch (var4) {
            case 0:
               this.field5547.put(var1, false);
               return;
            case 1:
               this.field5547.put(var1, true);
               return;
            default:
               this.field5547.put(var1, null);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "qi.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   void method9561(String var1, String var2, int var3) {
      try {
         this.field5548.put(var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "qi.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("as")
   int method9565(String var1, int var2) {
      try {
         Integer var3 = (Integer)this.field5545.get(var1);
         int var10000;
         if (var3 == null) {
            if (var2 <= 578907746) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = var3;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "qi.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("at")
   void method9557(String var1, String var2) {
      int var3 = -1;

      try {
         var3 = Integer.parseInt(var2);
      } catch (NumberFormatException var5) {
      }

      switch (var3) {
         case 0:
            this.field5547.put(var1, false);
            return;
         case 1:
            this.field5547.put(var1, true);
            return;
         default:
            this.field5547.put(var1, null);
      }
   }

   public classQI() {
      this.field5546 = new HashMap();
      this.field5547 = new HashMap();
      this.field5548 = new HashMap();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void method9583(int var1) {
      try {
         this.field5545.clear();
         this.field5546.clear();
         this.field5547.clear();
         this.field5548.clear();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qi.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aj")
   void method9550(String var1, int var2) {
      this.field5545.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aq")
   void method9551(String var1, int var2) {
      this.field5545.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("al")
   void method9554(String var1, String var2) {
      long var3 = 0L;

      try {
         var3 = Long.parseLong(var2);
      } catch (NumberFormatException var6) {
      }

      this.field5546.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("av")
   void method9555(String var1, String var2) {
      long var3 = 0L;

      try {
         var3 = Long.parseLong(var2);
      } catch (NumberFormatException var6) {
      }

      this.field5546.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method9584() {
      this.field5545.clear();
      this.field5546.clear();
      this.field5547.clear();
      this.field5548.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("ao")
   public static int method9587(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - var3 + classOG.method8434(var0.charAt(var4), (byte)-41);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "qi.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ap")
   void method9558(String var1, String var2) {
      int var3 = -1;

      try {
         var3 = Integer.parseInt(var2);
      } catch (NumberFormatException var5) {
      }

      switch (var3) {
         case 0:
            this.field5547.put(var1, false);
            return;
         case 1:
            this.field5547.put(var1, true);
            return;
         default:
            this.field5547.put(var1, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ak")
   void method9562(String var1, String var2) {
      this.field5548.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("au")
   void method9563(String var1, String var2) {
      this.field5548.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;B)J")
   @ObfuscatedName("yx")
   public static long method9568(classQI var0, String var1, byte var2) {
      if (var0 == null) {
         return var0.method9573(var1, var2);
      } else {
         try {
            Long var3 = (Long)var0.field5546.get(var1);
            return var3 == null ? -1L : var3;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "qi.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("am")
   void method9547(String var1, String var2) {
      int var3 = 0;

      try {
         var3 = Integer.parseInt(var2);
      } catch (NumberFormatException var5) {
      }

      this.field5545.put(var1, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cy")
   public static void method9559(classQI var0, String var1, String var2) {
      if (var0 == null) {
         var0.method9562(var1, var1);
      } else {
         int var3 = -1;

         try {
            var3 = Integer.parseInt(var2);
         } catch (NumberFormatException var5) {
         }

         switch (var3) {
            case 0:
               var0.field5547.put(var1, false);
               return;
            case 1:
               var0.field5547.put(var1, true);
               return;
            default:
               var0.field5547.put(var1, null);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("aw")
   void method9564(String var1, String var2) {
      this.field5548.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bn")
   int method9566(String var1) {
      Integer var2 = (Integer)this.field5545.get(var1);
      return var2 == null ? -1 : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)J")
   @ObfuscatedName("bx")
   long method9569(String var1) {
      Long var2 = (Long)this.field5546.get(var1);
      return var2 == null ? -1L : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)J")
   @ObfuscatedName("bc")
   long method9570(String var1) {
      Long var2 = (Long)this.field5546.get(var1);
      return var2 == null ? -1L : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)J")
   @ObfuscatedName("bp")
   long method9571(String var1) {
      Long var2 = (Long)this.field5546.get(var1);
      return var2 == null ? -1L : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)J")
   @ObfuscatedName("br")
   long method9572(String var1) {
      Long var2 = (Long)this.field5546.get(var1);
      return var2 == null ? -1L : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bt")
   String method9574(String var1) {
      return (String)this.field5548.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bg")
   String method9575(String var1) {
      return (String)this.field5548.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bj")
   String method9576(String var1) {
      return (String)this.field5548.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("fx")
   public static void method9560(classQI var0, String var1, String var2) {
      if (var0 == null) {
         var0.method9563(var1, var1);
      } else {
         int var3 = -1;

         try {
            var3 = Integer.parseInt(var2);
         } catch (NumberFormatException var5) {
         }

         switch (var3) {
            case 0:
               var0.field5547.put(var1, false);
               return;
            case 1:
               var0.field5547.put(var1, true);
               return;
            default:
               var0.field5547.put(var1, null);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Boolean;")
   @ObfuscatedName("bo")
   Boolean method9580(String var1) {
      return (Boolean)this.field5547.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ay")
   void method9552(String var1, int var2) {
      this.field5545.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   String method9577(String var1, int var2) {
      try {
         return (String)this.field5548.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qi.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method9585() {
      this.field5545.clear();
      this.field5546.clear();
      this.field5547.clear();
      this.field5548.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;)V")
   @ObfuscatedName("hf")
   public static void method9586(classQI var0) {
      var0.field5545.clear();
      var0.field5546.clear();
      var0.field5547.clear();
      var0.field5548.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("az")
   void method9548(String var1, String var2, int var3) {
      try {
         int var4 = 0;

         try {
            var4 = Integer.parseInt(var2);
         } catch (NumberFormatException var6) {
         }

         this.field5545.put(var1, var4);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "qi.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("ad")
   static int method9588(int var0, classBL var1, boolean var2, byte var3) {
      try {
         boolean var4 = true;
         classLW var5;
         if (var0 >= 2000) {
            if (var3 == 2) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var5 = classLY.method7375(classWK.field6691, classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)80);
            var4 = false;
         } else {
            classLW var10000;
            if (var2) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = classDL.field1558;
            }

            var5 = var10000;
         }

         if (var0 == 1300) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               int var23 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] - 1;
               if (var23 >= 0) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var23 < 32) {
                     String var29 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
                     var29 = classUP.method11420(var29, classRR.method10179(-2032868552), classBB.field334, classBB.field333, (byte)0);
                     var5.method7207(var23, var29, (byte)-94);
                     return 1;
                  }

                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }
               }

               classBB.field338 -= 1222866659;
               return 1;
            }
         } else if (1301 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var22 = classBB.field323[classDY.field1679 * -324749371];
               int var28 = classBB.field323[1 + -324749371 * classDY.field1679];
               var5.field4311 = classLY.method7378(classWK.field6691, var22, var28, (byte)-4);
               return 1;
            }
         } else if (var0 == 1302) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               boolean var38;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  var38 = true;
               } else {
                  var38 = false;
               }

               var5.field4314 = var38;
               return 1;
            }
         } else if (var0 == 1303) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               var5.field4368 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * 230129403;
               return 1;
            }
         } else if (var0 == 1304) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               var5.field4313 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] * -2074329479;
               return 1;
            }
         } else if (var0 == 1305) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               String var20 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var20 = classUP.method11420(var20, classRR.method10179(-1357449656), classBB.field334, classBB.field333, (byte)0);
               var5.field4309 = var20;
               return 1;
            }
         } else if (var0 == 1306) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               String var18 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var18 = classUP.method11420(var18, classRR.method10179(-860122174), classBB.field334, classBB.field333, (byte)0);
               var5.field4345 = var18;
               return 1;
            }
         } else if (1307 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               var5.field4337 = null;
               var5.field4353 = (String[][])null;
               return 1;
            }
         } else if (1308 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               boolean var10001;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var5.field4373 = var10001;
               return 1;
            }
         } else if (1309 == var0) {
            classDY.field1679 -= 120041229;
            return 1;
         } else if (var0 == 1310) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               int var17 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] - 1;
               if (var17 >= 0) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var17 <= 9) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     if (var5.field4353 != null) {
                        var5.field4353[var17] = null;
                        return 1;
                     }
                  }
               }

               return 1;
            }
         } else if (var0 == 1311) {
            int var16 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] - 1;
            int var27 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] - 1;
            if (var27 >= 0) {
               if (var3 == 2) {
                  throw new IllegalStateException();
               }

               if (var27 <= 9) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var16 >= 0) {
                     String var36 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
                     var36 = classUP.method11420(var36, classRR.method10179(-77610910), classBB.field334, classBB.field333, (byte)0);
                     var5.method7210(var27, var16, var36, -512976453);
                     return 1;
                  }
               }
            }

            throw new RuntimeException();
         } else if (var0 == 1312) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               if (var15 == -1) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  var5.field4310 = 695305012;
               } else if (var15 >= 1) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var15 <= 32) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     var5.field4310 = 173826253 * (var15 - 1);
                  }
               }

               return 1;
            }
         } else if (1350 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               byte[] var14 = null;
               byte[] var26 = null;
               if (var4) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  classDY.field1679 -= 1200412290;

                  byte var33;
                  for (var33 = 0; var33 < 10; var33 += 2) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     if (classBB.field323[classDY.field1679 * -324749371 + var33] < 0) {
                        if (var3 == 2) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  if (var33 > 0) {
                     if (var3 == 2) {
                        throw new IllegalStateException();
                     }

                     var14 = new byte[var33 / 2];
                     var26 = new byte[var33 / 2];

                     for (int var34 = var33 - 2; var34 >= 0; var34 -= 2) {
                        var14[var34 / 2] = (byte)classBB.field323[classDY.field1679 * -324749371 + var34];
                        var26[var34 / 2] = (byte)classBB.field323[1 + classDY.field1679 * -324749371 + var34];
                     }
                  }
               } else {
                  classDY.field1679 -= 240082458;
                  var14 = new byte[]{(byte)classBB.field323[classDY.field1679 * -324749371]};
                  var26 = new byte[]{(byte)classBB.field323[classDY.field1679 * -324749371 + 1]};
               }

               int var35 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] - 1;
               if (var35 >= 0) {
                  if (var35 <= 9) {
                     classMK.method7595(var5, var35, var14, var26, (byte)-74);
                     return 1;
                  }

                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } else if (var0 == 1351) {
            classDY.field1679 -= 240082458;
            byte var13 = 10;
            byte[] var25 = new byte[]{(byte)classBB.field323[-324749371 * classDY.field1679]};
            byte[] var32 = new byte[]{(byte)classBB.field323[classDY.field1679 * -324749371 + 1]};
            classMK.method7595(var5, var13, var25, var32, (byte)-7);
            return 1;
         } else if (1352 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 360123687;
               int var12 = classBB.field323[classDY.field1679 * -324749371] - 1;
               int var24 = classBB.field323[1 + classDY.field1679 * -324749371];
               int var31 = classBB.field323[-324749371 * classDY.field1679 + 2];
               if (var12 >= 0) {
                  if (var12 <= 9) {
                     classGC.method5382(var5, var12, var24, var31, 2090793764);
                     return 1;
                  }

                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } else if (1353 == var0) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               byte var11 = 10;
               int var7 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int var8 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classGC.method5382(var5, var11, var7, var8, 1253285194);
               return 1;
            }
         } else if (var0 == 1354) {
            if (var3 == 2) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 120041229;
               int var10 = classBB.field323[classDY.field1679 * -324749371] - 1;
               if (var10 >= 0) {
                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var10 <= 9) {
                     classMT.method7691(var5, var10, 2052530156);
                     return 1;
                  }

                  if (var3 == 2) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } else if (var0 == 1355) {
            byte var6 = 10;
            classMT.method7691(var5, var6, 2105626186);
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "qi.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)J")
   @ObfuscatedName("ax")
   long method9573(String var1, byte var2) {
      try {
         Long var3 = (Long)this.field5545.get(var1);
         return var3 == null ? -1L : var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "qi.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/Boolean;")
   @ObfuscatedName("aa")
   Boolean method9581(String var1, int var2) {
      try {
         return (Boolean)this.field5547.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qi.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bk")
   String method9578(String var1) {
      return (String)this.field5547.get(var1);
   }
}
