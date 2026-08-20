import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class437 {
   @ObfuscatedSignature(descriptor = "Lqj;")
   @ObfuscatedName("ag")
   static final class437 field5341 = new class437();
   @ObfuscatedSignature(descriptor = "Lqj;")
   @ObfuscatedName("at")
   static final class437 field5343 = new class437();
   @ObfuscatedSignature(descriptor = "Lqj;")
   @ObfuscatedName("an")
   static final class437 field5342 = new class437();
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("ak")
   static SpritePixels sceneMinimapSprite;
   @ObfuscatedSignature(descriptor = "Lqj;")
   @ObfuscatedName("av")
   static final class437 field5340 = new class437();

   class437() {
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ho")
   static void getLoginError(int var0, int var1) {
      client.method1692(var0);

      try {
         label368: {
            int var2 = Login.loginIndex * -1614560929;
            if (var0 == -3) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               class525.setLoginResponseString(Strings.field4898, Strings.field4899, Strings.field4900, (byte)1);
            } else if (var0 == -2) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               class525.setLoginResponseString(Strings.field4901, Strings.field4935, Strings.field4903, (byte)1);
            } else if (-1 == var0) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               class525.setLoginResponseString(Strings.field4904, Strings.field4905, Strings.field5034, (byte)1);
            } else if (3 == var0) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               class30.method1308(3, 1464123851);
               Login.field399 = 1924181287;
            } else if (4 == var0) {
               class30.method1308(14, 1050061983);
               Login.Login_banType = 0;
            } else if (5 == var0) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               Login.field399 = -446604722;
               class525.setLoginResponseString(Strings.field4910, Strings.field5081, Strings.field4912, (byte)1);
            } else if (var0 == 68) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               if (!client.field868) {
                  if (var1 != 966597198) {
                     throw new IllegalStateException();
                  }

                  client.field868 = true;
                  class144.method3969((byte)-104);
                  return;
               }

               class525.setLoginResponseString(Strings.field4882, Strings.field4914, Strings.field4915, (byte)1);
            } else {
               label366: {
                  if (!client.onMobile) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     if (6 == var0) {
                        if (var1 != 966597198) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4882, Strings.field4914, Strings.field4915, (byte)1);
                        break label366;
                     }
                  }

                  if (7 == var0) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field4916, Strings.field4886, Strings.field4893, (byte)1);
                  } else if (8 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4930, Strings.field4920, Strings.field5038, (byte)1);
                  } else if (var0 == 9) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4922, Strings.field4923, Strings.field4924, (byte)1);
                  } else if (10 == var0) {
                     class525.setLoginResponseString(Strings.field4925, Strings.field4918, Strings.field4927, (byte)1);
                  } else if (11 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4928, Strings.field4929, Strings.field5043, (byte)1);
                  } else if (var0 == 12) {
                     if (var1 != 966597198) {
                        return;
                     }

                     WorldMapSectionType.updateGameState(10, (byte)45);
                     class525.setLoginResponseString(Strings.field5003, Strings.field4926, Strings.field4933, (byte)1);
                     class30.method1308(34, 1606271313);
                  } else if (13 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field5147, Strings.field4964, Strings.field4936, (byte)1);
                  } else if (var0 == 14) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4937, Strings.field4888, Strings.field4939, (byte)1);
                  } else if (16 == var0) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field4940, Strings.field4941, Strings.field4942, (byte)1);
                     class30.method1308(33, -346183537);
                  } else if (17 == var0) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field4943, Strings.field4944, Strings.field4945, (byte)1);
                  } else if (var0 == 18) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class30.method1308(14, -1558571190);
                     Login.Login_banType = -494734729;
                  } else if (var0 == 19) {
                     class525.setLoginResponseString(Strings.field5126, Strings.field4852, Strings.field4988, (byte)1);
                  } else if (var0 == 20) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4869, Strings.field4953, Strings.field4954, (byte)1);
                  } else if (var0 == 22) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field5088, Strings.field4867, Strings.field4957, (byte)1);
                  } else if (23 == var0) {
                     class525.setLoginResponseString(Strings.field4958, Strings.field5131, Strings.field4960, (byte)1);
                  } else if (24 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field5112, Strings.field4962, Strings.field4963, (byte)1);
                  } else if (var0 == 25) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field5051, Strings.field5052, Strings.field4966, (byte)1);
                  } else if (26 == var0) {
                     class525.setLoginResponseString(Strings.field4967, Strings.field4968, Strings.field5063, (byte)1);
                  } else if (27 == var0) {
                     class525.setLoginResponseString(Strings.field4917, Strings.field4971, Strings.field4949, (byte)1);
                  } else if (31 == var0) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field4979, Strings.field5078, Strings.field4981, (byte)1);
                  } else if (32 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class30.method1308(14, 163868771);
                     Login.Login_banType = -989469458;
                  } else if (37 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4985, Strings.field4986, Strings.field4987, (byte)1);
                  } else if (38 == var0) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field5108, Strings.field5103, Strings.field4990, (byte)1);
                  } else if (var0 == 74) {
                     if (var1 != 966597198) {
                        throw new IllegalStateException();
                     }

                     class525.setLoginResponseString(Strings.field4991, Strings.field4992, Strings.field4978, (byte)1);
                  } else if (var0 == 55) {
                     if (var1 != 966597198) {
                        return;
                     }

                     class30.method1308(8, -653012628);
                  } else {
                     if (var0 == 56) {
                        if (var1 != 966597198) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4998, Strings.field4989, Strings.field5000, (byte)1);
                        WorldMapSectionType.updateGameState(11, (byte)45);
                        return;
                     }

                     if (57 == var0) {
                        class525.setLoginResponseString(Strings.field4952, Strings.field5002, Strings.field5156, (byte)1);
                        WorldMapSectionType.updateGameState(11, (byte)45);
                        return;
                     }

                     if (var0 == 61) {
                        if (var1 != 966597198) {
                           throw new IllegalStateException();
                        }

                        class525.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "", (byte)1);
                        class30.method1308(7, -1663970657);
                     } else {
                        if (62 == var0) {
                           if (var1 != 966597198) {
                              throw new IllegalStateException();
                           }

                           WorldMapSectionType.updateGameState(10, (byte)45);
                           class30.method1308(9, -43725026);
                           class525.setLoginResponseString(Strings.field4895, Strings.field5040, Strings.field5006, (byte)1);
                           return;
                        }

                        if (63 == var0) {
                           if (var1 != 966597198) {
                              throw new IllegalStateException();
                           }

                           WorldMapSectionType.updateGameState(10, (byte)45);
                           class30.method1308(9, -829792325);
                           class525.setLoginResponseString(Strings.field5167, Strings.field5008, Strings.field5009, (byte)1);
                           return;
                        }

                        if (65 == var0) {
                           break label368;
                        }

                        if (67 == var0) {
                           if (var1 != 966597198) {
                              return;
                           }
                           break label368;
                        }

                        if (71 == var0) {
                           if (var1 != 966597198) {
                              throw new IllegalStateException();
                           }

                           WorldMapSectionType.updateGameState(10, (byte)45);
                           class30.method1308(7, -1008569224);
                           class525.setLoginResponseString(
                              "There was a problem updating your DOB.",
                              "Please try again later. If the problem ",
                              "persists, please contact Jagex Support.",
                              (byte)1
                           );
                        } else if (73 == var0) {
                           if (var1 != 966597198) {
                              throw new IllegalStateException();
                           }

                           WorldMapSectionType.updateGameState(10, (byte)45);
                           class30.method1308(6, 105515779);
                           class525.setLoginResponseString(Strings.field5142, Strings.field5143, Strings.field5144, (byte)1);
                        } else if (72 == var0) {
                           if (var1 != 966597198) {
                              throw new IllegalStateException();
                           }

                           WorldMapSectionType.updateGameState(10, (byte)45);
                           class30.method1308(32, 2003081511);
                        } else {
                           class525.setLoginResponseString(Strings.field5111, Strings.field5030, Strings.field5015, (byte)1);
                        }
                     }
                  }
               }
            }

            WorldMapSectionType.updateGameState(10, (byte)45);
            int var5 = -1614560929 * Login.loginIndex;
            boolean var6 = var5 != var2;
            if (!var6 && client.field889.method12440((byte)83)) {
               if (var1 != 966597198) {
                  throw new IllegalStateException();
               }

               class30.method1308(9, 368635312);
            }

            return;
         }

         WorldMapSectionType.updateGameState(10, (byte)45);
         class30.method1308(9, -212922559);
         class525.setLoginResponseString(Strings.field5010, Strings.field5011, Strings.field5012, (byte)1);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "qj.ho(" + ')');
      }
   }
}
