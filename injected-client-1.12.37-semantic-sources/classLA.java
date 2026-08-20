import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("la")
public class classLA {
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field4084 = 101;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   public static boolean method6653(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dj")
   static final void method6657(int var0) {
      try {
         for (classCD var1 = (classCD)classIS.field3053.field1690.method7915(); var1 != null; var1 = (classCD)classNN.method7924(classIS.field3053.field1690)) {
            if (var0 != 2071628700) {
               throw new IllegalStateException();
            }

            if (-356773341 * var1.field672 == -1) {
               if (var0 != 2071628700) {
                  return;
               }

               var1.field673 = 0;
               classCU.method2677(classIS.field3053, var1, -324749371);
            } else {
               var1.vmethod398();
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "la.dj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public static int method6649(int var0) {
      return var0 >> 11 & 1735224219;
   }

   classLA() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method6650(int var0) {
      return var0 >> 11 & 63;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public static boolean method6654(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method6651(int var0) {
      return var0 >> 17 & 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   public static boolean method6655(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public static int method6652(int var0) {
      return var0 >> 17 & 7;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/StringBuilder;Lqi;I)Ljava/lang/String;")
   @ObfuscatedName("af")
   static String method6656(String var0, int var1, StringBuilder var2, classQI var3, int var4) {
      try {
         while (true) {
            int var6 = classXQ.method12872(var0, 2085261109);
            if (var6 == -1) {
               if (var4 == -767533558) {
                  throw new IllegalStateException();
               }

               if (var2.length() == 0) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  return var0;
               }

               if (!var0.isEmpty()) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var2.append(var0);
               }
               break;
            }

            String var7 = var0.substring(0, var6);
            var0 = var0.substring(1 + var6);
            if (!var7.isEmpty()) {
               if (var4 == -767533558) {
                  throw new IllegalStateException();
               }

               var2.append(var7);
            }

            int var8;
            if (var0.startsWith("cond")) {
               if (var4 == -767533558) {
                  throw new IllegalStateException();
               }

               int var9 = var0.indexOf(44);
               var9 = var0.indexOf(44, var9 + 1);
               if (var9 == -1) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var8 = var9;
               } else {
                  int var11 = 1 + var9;
                  int var12 = var11;
                  int var13 = 1;

                  int var10;
                  while (true) {
                     if (var13 <= 0) {
                        var10 = var12 - 1;
                        break;
                     }

                     int var15;
                     for (var15 = var0.indexOf(60, var12); -1 != var15; var15 = var0.indexOf(60, var15 + 1)) {
                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var15 <= 0) {
                           break;
                        }

                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var0.charAt(var15 - 1) != '\\') {
                           break;
                        }

                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }
                     }

                     int var17;
                     for (var17 = var0.indexOf(62, var12); var17 != -1; var17 = var0.indexOf(62, 1 + var17)) {
                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var17 <= 0) {
                           break;
                        }

                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var0.charAt(var17 - 1) != '\\') {
                           break;
                        }

                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-1 == var17) {
                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        var10 = -1;
                        break;
                     }

                     if (var15 > -1) {
                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var15 < var17) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           var12 = 1 + var15;
                           var13++;
                           continue;
                        }
                     }

                     var12 = var17 + 1;
                     var13--;
                  }

                  var8 = var10;
               }
            } else {
               int var25 = 0;
               int var27 = 1;

               int var23;
               while (true) {
                  if (var27 <= 0) {
                     var23 = var25 - 1;
                     break;
                  }

                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  int var30;
                  for (var30 = var0.indexOf(60, var25); -1 != var30; var30 = var0.indexOf(60, 1 + var30)) {
                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }

                     if (var30 <= 0) {
                        break;
                     }

                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }

                     if (var0.charAt(var30 - 1) != '\\') {
                        break;
                     }

                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }
                  }

                  int var39;
                  for (var39 = var0.indexOf(62, var25); -1 != var39 && var39 > 0 && var0.charAt(var39 - 1) == '\\'; var39 = var0.indexOf(62, 1 + var39)) {
                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }
                  }

                  if (-1 == var39) {
                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }

                     var23 = -1;
                     break;
                  }

                  if (var30 > -1) {
                     if (var4 == -767533558) {
                        throw new IllegalStateException();
                     }

                     if (var30 < var39) {
                        var25 = 1 + var30;
                        var27++;
                        continue;
                     }
                  }

                  var25 = var39 + 1;
                  var27--;
               }

               var8 = var23;
            }

            if (var8 == -1) {
               if (var4 == -767533558) {
                  throw new IllegalStateException();
               }
               break;
            }

            String var24 = var0.substring(0, var8);
            var0 = var0.substring(var8 + 1);
            if (AbstractFont.method11(var24)) {
               if (var4 == -767533558) {
                  throw new IllegalStateException();
               }

               var2.append("<").append(var24).append(">");
            } else {
               classRX var26;
               if (var24.startsWith("int")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5871;
               } else if (var24.startsWith("long")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5875;
               } else if (var24.startsWith("str")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5872;
               } else if (var24.startsWith("bool")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5874;
               } else if (var24.startsWith("switch")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5873;
               } else if (var24.startsWith("cond")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  var26 = classRX.field5870;
               } else {
                  var26 = classRX.field5869;
               }

               if (classRX.field5869 != var26) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  switch (var26.field5868 * 2061130823) {
                     case 0:
                        String[] var29 = var24.split("=");
                        if (1 == var29.length) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           Boolean var33 = classQI.method9579(var3, var24, 230969171);
                           if (null == var33) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              var2.append(-1);
                           } else {
                              byte var10001;
                              if (var33) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var10001 = 1;
                              } else {
                                 var10001 = 0;
                              }

                              var2.append((int)var10001);
                           }
                        } else {
                           var3.method9556(var29[0], var29[1], (short)11668);
                        }
                     case 1:
                     default:
                        break;
                     case 2:
                        classFC.method4589(var24, var2, var3, var1, 2073705266);
                        break;
                     case 3:
                        classML.method7597(var24, var2, var3, var1, -147277838);
                        break;
                     case 4:
                        NPC.method3495(var24, var2, var3, -93707284);
                        break;
                     case 5:
                        String[] var28 = classKD.method6464(var24, (byte)-98);
                        if (4 != var28.length) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        Boolean var32 = null;
                        var28[1] = var28[1].trim();
                        if (var28[1].startsWith("bool")) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           String[] var34 = var28[1].split("[<>=!]+");
                           if (1 == var34.length) {
                              var32 = classQI.method9579(var3, var28[1], -832828789);
                           } else {
                              Boolean var41 = classQI.method9579(var3, var34[0].trim(), 220952603);
                              Boolean var43 = classQI.method9579(var3, var34[1].trim(), -555618873);
                              String var46 = var28[1].substring(var34[0].length());
                              var46 = var46.substring(0, var46.length() - var34[1].length());
                              if (var46.equals("=")) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var32 = var41 == var43;
                              } else if (var46.equals("!")) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var10000;
                                 if (var41 != var43) {
                                    if (var4 == -767533558) {
                                       throw new IllegalStateException();
                                    }

                                    var10000 = true;
                                 } else {
                                    var10000 = false;
                                 }

                                 var32 = var10000;
                              }
                           }
                        } else if (var28[1].startsWith("!")) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           Boolean var35 = classQI.method9579(var3, var28[1].substring(1), -39149092);
                           if (var35 != null) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var50;
                              if (!var35) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var50 = true;
                              } else {
                                 var50 = false;
                              }

                              var32 = var50;
                           }
                        } else if (var28[1].startsWith("str")) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           boolean var51;
                           label477: {
                              String var36 = var3.method9577(var28[1], 2145269203);
                              if (null != var36) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 if (!var36.isEmpty()) {
                                    var51 = true;
                                    break label477;
                                 }
                              }

                              var51 = false;
                           }

                           var32 = var51;
                        } else {
                           String[] var37 = var28[1].split("[<>=!]+");
                           int var42 = var3.method9565(var37[0].trim(), 1819863315);
                           String var48 = var37[1].trim();
                           int var44;
                           if (var48.startsWith("int")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              var44 = var3.method9565(var48, 1907393946);
                           } else {
                              try {
                                 var44 = classJF.method6360(var48, -321869012);
                              } catch (Exception var19) {
                                 var44 = -1;
                              }
                           }

                           String var18 = var28[1].substring(var37[0].length());
                           var18 = var18.substring(0, var18.length() - var37[1].length());
                           if (var18.equals("=")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var52;
                              if (var44 == var42) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var52 = true;
                              } else {
                                 var52 = false;
                              }

                              var32 = var52;
                           } else if (var18.equals("!")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var53;
                              if (var42 != var44) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var53 = true;
                              } else {
                                 var53 = false;
                              }

                              var32 = var53;
                           } else if (var18.equals("<")) {
                              boolean var54;
                              if (var42 < var44) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var54 = true;
                              } else {
                                 var54 = false;
                              }

                              var32 = var54;
                           } else if (var18.equals("<=")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var55;
                              if (var42 <= var44) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var55 = true;
                              } else {
                                 var55 = false;
                              }

                              var32 = var55;
                           } else if (var18.equals(">")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var56;
                              if (var42 > var44) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var56 = true;
                              } else {
                                 var56 = false;
                              }

                              var32 = var56;
                           } else if (var18.equals(">=")) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              boolean var57;
                              if (var42 >= var44) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var57 = true;
                              } else {
                                 var57 = false;
                              }

                              var32 = var57;
                           }
                        }

                        if (var32 == null) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           var32 = false;
                        }

                        String var58;
                        if (var32) {
                           if (var4 == -767533558) {
                              throw new IllegalStateException();
                           }

                           var58 = var28[2];
                        } else {
                           var58 = var28[3];
                        }

                        String var38 = var58;
                        var2.append(method6656(var38, var1, new StringBuilder(var38.length()), var3, -506295280));
                        break;
                     case 6:
                        classKS.method6560(var24, var2, var3, (byte)23);
                  }
               } else if (var24.startsWith("text_pronoun(")) {
                  if (var4 == -767533558) {
                     throw new IllegalStateException();
                  }

                  String var31;
                  label495: {
                     if (var1 >= 0) {
                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }

                        if (var1 <= 2) {
                           int var40 = var24.indexOf(40);
                           if (classRK.field5682 * -610948571 != var40) {
                              if (var4 == -767533558) {
                                 throw new IllegalStateException();
                              }

                              var31 = "";
                           } else {
                              int var16 = var24.lastIndexOf(41);
                              if (var16 != var24.length() - 1) {
                                 if (var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var31 = "";
                              } else {
                                 String var14 = var24.substring(var40 + 1, var16);
                                 String[] var45 = classKD.method6464(var14, (byte)-59);
                                 if (var45.length != 3 && var4 == -767533558) {
                                    throw new IllegalStateException();
                                 }

                                 var31 = var45[var1];
                              }
                           }
                           break label495;
                        }

                        if (var4 == -767533558) {
                           throw new IllegalStateException();
                        }
                     }

                     var31 = "";
                  }

                  var2.append(var31);
               } else {
                  var2.append("<").append(var24).append(">");
               }
            }
         }

         return var2.toString();
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "la.af(" + ')');
      }
   }
}
