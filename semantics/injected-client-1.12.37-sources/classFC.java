import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fc")
public class classFC implements classTL {
   @ObfuscatedName("ae")
   boolean field2201;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field2207 = 1076101603;
   @ObfuscatedName("af")
   boolean field2202;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("az")
   Widget field2203 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2205 = 39;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2206 = 5;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hy")
   static classVP field2208;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2204 = 40;

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("az")
   public Widget method4571(int var1) {
      try {
         return this.field2203;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("aj")
   public void method4575(Widget var1) {
      if (var1 != null) {
         if (this.field2203 != var1) {
            this.method4582((byte)46);
            this.field2203 = var1;
         }

         classLX var2 = var1.method7294(-2139383269);
         if (var2 != null) {
            if (!var2.field4419.method6982(1270661639) && var2.field4426 != null) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var1, 1995815078).method14145(var2.field4426, (byte)2), (byte)89);
               client.field823.method9658(var3, 1697206599);
            }

            var2.field4419.method6798(true, 1530556286);
         }
      } else {
         this.method4582((byte)109);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)V")
   @ObfuscatedName("af")
   public void method4576(Widget var1, byte var2) {
      try {
         if (var1 != null) {
            if (var2 == 2) {
               throw new IllegalStateException();
            }

            if (this.field2203 != var1) {
               if (var2 == 2) {
                  return;
               }

               this.method4582((byte)51);
               this.field2203 = var1;
            }

            classLX var3 = var1.method7294(-1453299098);
            if (var3 != null) {
               if (var2 == 2) {
                  return;
               }

               if (!var3.field4419.method6982(1570032005)) {
                  if (var2 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var3.field4426 != null) {
                     if (var2 == 2) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent var4 = classZS.method14182(classUQ.method11465(var1, 19062755).method14145(var3.field4426, (byte)2), (byte)68);
                     client.field823.method9658(var4, 1697206599);
                  }
               }

               var3.field4419.method6798(true, 2013040570);
            }
         } else {
            this.method4582((byte)8);
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "fc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public void method4582(byte var1) {
      try {
         if (null == this.field2203) {
            if (var1 <= 3) {
               throw new IllegalStateException();
            }
         } else {
            classLX var2 = this.field2203.method7294(-1336148185);
            Widget var3 = this.field2203;
            this.field2203 = null;
            if (var2 != null) {
               if (var2.field4419.method6982(1936314001)) {
                  if (var1 <= 3) {
                     throw new IllegalStateException();
                  }

                  if (null != var2.field4426) {
                     if (var1 <= 3) {
                        return;
                     }

                     ScriptEvent var4 = classZS.method14182(classUQ.method11465(var3, 873340457).method14145(var2.field4426, (byte)2), (byte)80);
                     client.field823.method9658(var4, 1697206599);
                  }
               }

               var2.field4419.method6798(false, 1653515093);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "fc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod446(int var1, byte var2) {
      try {
         if (this.field2203 == null) {
            if (var2 != 2) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classTT var3 = Widget.method7287(this.field2203, 1289741507);
            if (var3 == null) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               if (var3.method11149(var1, -2115143667)) {
                  switch (var1) {
                     case 81:
                        this.field2202 = true;
                        break;
                     case 82:
                        this.field2201 = true;
                        break;
                     default:
                        this.method4588(var1, (byte)4);
                  }
               }

               return classTT.method11144(var3, var1, -1831933183);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod447(int var1, byte var2) {
      try {
         switch (var1) {
            case 81:
               this.field2202 = false;
               return false;
            case 82:
               this.field2201 = false;
               return false;
            default:
               return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "fc.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwd;Lzl;)V")
   @ObfuscatedName("yx")
   public static void method4581(classWD var0, classZL var1) {
      if (var0 == null) {
         var0.method12340();
      }

      var0.field6668 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("ky")
   public static void method4585(Message var0) {
      var0.field723 = classQQ.field5597.field593.method10202(var0.field728, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ah")
   boolean method4587(int var1) {
      if (this.field2203 == null) {
         return false;
      } else {
         classLH var2 = this.field2203.method7283(-926237410);
         if (var2 != null && var2.method6998((byte)-26)) {
            switch (var1) {
               case 13:
                  this.method4582((byte)118);
                  return true;
               case 48:
                  if (this.field2201) {
                     var2.method6879((byte)-52);
                  }

                  return true;
               case 65:
                  if (this.field2201) {
                     Clipboard var7 = GameEngine.method10966(classOE.client, (byte)-77);
                     var2.method6950(var7, -1969797108);
                  }

                  return true;
               case 66:
                  if (this.field2201) {
                     Clipboard var6 = GameEngine.method10966(classOE.client, (byte)-97);
                     var2.method6946(var6, -887645341);
                  }

                  return true;
               case 67:
                  if (this.field2201) {
                     Clipboard var5 = GameEngine.method10966(classOE.client, (byte)-22);
                     classLH.method6954(var2, var5, -87014864);
                  }

                  return true;
               case 84:
                  if (var2.method7018(1617848039) == 0) {
                     var2.method6854(10, 532262135);
                  } else if (this.field2202 && var2.method7045((byte)0)) {
                     var2.method6854(10, 1823632524);
                  } else {
                     classLX var3 = this.field2203.method7294(-1245103605);
                     ScriptEvent var4 = classZS.method14182(classUQ.method11465(this.field2203, 121484135).method14145(var3.field4428, (byte)2), (byte)14);
                     client.field823.method9658(var4, 1697206599);
                     this.method4582((byte)15);
                  }

                  return true;
               case 85:
                  if (this.field2201) {
                     classLH.method6869(var2, (byte)19);
                  } else {
                     var2.method6862(-2045553548);
                  }

                  return true;
               case 96:
                  if (this.field2201) {
                     var2.method6906(this.field2202, (byte)-49);
                  } else {
                     var2.method6899(this.field2202, 1708762862);
                  }

                  return true;
               case 97:
                  if (this.field2201) {
                     var2.method6908(this.field2202, 1295536453);
                  } else {
                     var2.method6903(this.field2202, (byte)11);
                  }

                  return true;
               case 98:
                  if (this.field2201) {
                     classLH.method6956(var2, (byte)0);
                  } else {
                     var2.method6910(this.field2202, (byte)78);
                  }

                  return true;
               case 99:
                  if (this.field2201) {
                     classLH.method6958(var2, (byte)33);
                  } else {
                     var2.method6916(this.field2202, 1071340814);
                  }

                  return true;
               case 101:
                  if (this.field2201) {
                     var2.method6870(1487431897);
                  } else {
                     var2.method6865((byte)94);
                  }

                  return true;
               case 102:
                  if (this.field2201) {
                     var2.method6894(this.field2202, (byte)40);
                  } else {
                     var2.method6886(this.field2202, (byte)113);
                  }

                  return true;
               case 103:
                  if (this.field2201) {
                     var2.method6897(this.field2202, -665535259);
                  } else {
                     var2.method6888(this.field2202, -1262860432);
                  }

                  return true;
               case 104:
                  if (this.field2201) {
                     classLH.method6928(var2, this.field2202, 173697590);
                  } else {
                     var2.method6922(this.field2202, 1596149983);
                  }

                  return true;
               case 105:
                  if (this.field2201) {
                     var2.method6933(this.field2202, -1545688886);
                  } else {
                     classLH.method6924(var2, this.field2202, 988636327);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("ax")
   @Override
   public boolean vmethod444(boolean var1, int var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "fc.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bf")
   static int method4590(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 5504) {
            if (var3 != -1165804573) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var7 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var5 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               if (!client.graphicsGuard) {
                  if (var3 != -1165804573) {
                     throw new IllegalStateException();
                  }

                  client.field942.method11434(classEG.method3882(var7, (byte)39), -1345215934);
                  client.field994.method11434(classEG.method3882(var5, (byte)31), -1739806269);
               }

               return 1;
            }
         } else if (5505 == var0) {
            if (var3 != -1165804573) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field942.method11454(-2071860481);
               return 1;
            }
         } else if (var0 == 5506) {
            if (var3 != -1165804573) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field994.method11454(-952996512);
               return 1;
            }
         } else if (var0 == 5530) {
            if (var3 != -1165804573) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (var4 < 0) {
                  if (var3 != -1165804573) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               client.field840 = var4 * 643105531;
               return 1;
            }
         } else if (var0 == 5531) {
            if (var3 != -1165804573) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -184240077 * client.field840;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "fc.bf(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod448(char var1, int var2) {
      try {
         if (this.field2203 == null) {
            if (var2 != 1791336663) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (!classIB.method6139(var1, -1608469876)) {
            if (var2 != 1791336663) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classLH var3 = this.field2203.method7283(-416361573);
            if (null != var3) {
               if (var2 != 1791336663) {
                  throw new IllegalStateException();
               }

               if (var3.method6998((byte)-55)) {
                  classTT var4 = Widget.method7287(this.field2203, 1289741507);
                  if (var4 == null) {
                     return false;
                  }

                  if (var4.method11151(var1, 731299091)) {
                     var3.method6854(var1, 779015235);
                  }

                  return var4.method11147(var1, -2071087427);
               }

               if (var2 != 1791336663) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "fc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("ao")
   public Widget method4572() {
      return this.field2203;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("al")
   public Widget method4573() {
      return this.field2203;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method4583() {
      if (null != this.field2203) {
         classLX var1 = this.field2203.method7294(1725460326);
         Widget var2 = this.field2203;
         this.field2203 = null;
         if (var1 != null) {
            if (var1.field4419.method6982(1037802945) && null != var1.field4426) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var2, -3732236).method14145(var1.field4426, (byte)2), (byte)60);
               client.field823.method9658(var3, 1697206599);
            }

            var1.field4419.method6798(false, 1567522650);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("aq")
   public void method4577(Widget var1) {
      if (var1 != null) {
         if (this.field2203 != var1) {
            this.method4582((byte)103);
            this.field2203 = var1;
         }

         classLX var2 = var1.method7294(-1007933513);
         if (var2 != null) {
            if (!var2.field4419.method6982(1042511688) && var2.field4426 != null) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var1, 477128989).method14145(var2.field4426, (byte)2), (byte)30);
               client.field823.method9658(var3, 1697206599);
            }

            var2.field4419.method6798(true, 1893640975);
         }
      } else {
         this.method4582((byte)40);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("ad")
   public void method4578(Widget var1) {
      if (var1 != null) {
         if (this.field2203 != var1) {
            this.method4582((byte)89);
            this.field2203 = var1;
         }

         classLX var2 = var1.method7294(-1859797915);
         if (var2 != null) {
            if (!var2.field4419.method6982(1418404830) && var2.field4426 != null) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var1, -18973962).method14145(var2.field4426, (byte)2), (byte)17);
               client.field823.method9658(var3, 1697206599);
            }

            var2.field4419.method6798(true, 1949755012);
         }
      } else {
         this.method4582((byte)125);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ac")
   boolean method4588(int var1, byte var2) {
      try {
         if (this.field2203 == null) {
            if (var2 == 8) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classLH var3 = this.field2203.method7283(-710547776);
            if (var3 != null) {
               if (var2 == 8) {
                  throw new IllegalStateException();
               }

               if (var3.method6998((byte)4)) {
                  switch (var1) {
                     case 13:
                        this.method4582((byte)115);
                        return true;
                     case 48:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6879((byte)-82);
                        }

                        return true;
                     case 65:
                        if (this.field2201) {
                           Clipboard var9 = GameEngine.method10966(classOE.client, (byte)-5);
                           var3.method6950(var9, -1743371418);
                        }

                        return true;
                     case 66:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           Clipboard var8 = GameEngine.method10966(classOE.client, (byte)-34);
                           var3.method6946(var8, -887645341);
                        }

                        return true;
                     case 67:
                        if (this.field2201) {
                           Clipboard var7 = GameEngine.method10966(classOE.client, (byte)-79);
                           classLH.method6954(var3, var7, 971324073);
                        }

                        return true;
                     case 84:
                        if (var3.method7018(-636173591) == 0) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6854(10, 1471322356);
                        } else {
                           if (this.field2202) {
                              if (var2 == 8) {
                                 throw new IllegalStateException();
                              }

                              if (var3.method7045((byte)0)) {
                                 var3.method6854(10, -2052003972);
                                 return true;
                              }
                           }

                           classLX var4 = this.field2203.method7294(1425325542);
                           ScriptEvent var5 = classZS.method14182(classUQ.method11465(this.field2203, 870533817).method14145(var4.field4428, (byte)2), (byte)38);
                           client.field823.method9658(var5, 1697206599);
                           this.method4582((byte)62);
                        }

                        return true;
                     case 85:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           classLH.method6869(var3, (byte)3);
                        } else {
                           var3.method6862(-2061291396);
                        }

                        return true;
                     case 96:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6906(this.field2202, (byte)-24);
                        } else {
                           var3.method6899(this.field2202, 868396801);
                        }

                        return true;
                     case 97:
                        if (this.field2201) {
                           var3.method6908(this.field2202, 866082776);
                        } else {
                           var3.method6903(this.field2202, (byte)62);
                        }

                        return true;
                     case 98:
                        if (this.field2201) {
                           classLH.method6956(var3, (byte)0);
                        } else {
                           var3.method6910(this.field2202, (byte)-72);
                        }

                        return true;
                     case 99:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           classLH.method6958(var3, (byte)104);
                        } else {
                           var3.method6916(this.field2202, -1506955074);
                        }

                        return true;
                     case 101:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6870(506101956);
                        } else {
                           var3.method6865((byte)91);
                        }

                        return true;
                     case 102:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6894(this.field2202, (byte)32);
                        } else {
                           var3.method6886(this.field2202, (byte)30);
                        }

                        return true;
                     case 103:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6897(this.field2202, -665535259);
                        } else {
                           var3.method6888(this.field2202, -1660850042);
                        }

                        return true;
                     case 104:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           classLH.method6928(var3, this.field2202, 173697590);
                        } else {
                           var3.method6922(this.field2202, 1162981241);
                        }

                        return true;
                     case 105:
                        if (this.field2201) {
                           if (var2 == 8) {
                              throw new IllegalStateException();
                           }

                           var3.method6933(this.field2202, -1545688886);
                        } else {
                           classLH.method6924(var3, this.field2202, 988636327);
                        }

                        return true;
                     default:
                        return false;
                  }
               }

               if (var2 == 8) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "fc.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("ay")
   public void method4579(Widget var1) {
      if (var1 != null) {
         if (this.field2203 != var1) {
            this.method4582((byte)59);
            this.field2203 = var1;
         }

         classLX var2 = var1.method7294(1910315408);
         if (var2 != null) {
            if (!var2.field4419.method6982(982716387) && var2.field4426 != null) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var1, 594079630).method14145(var2.field4426, (byte)2), (byte)19);
               client.field823.method9658(var3, 1697206599);
            }

            var2.field4419.method6798(true, 1588806639);
         }
      } else {
         this.method4582((byte)91);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("aa")
   public Widget method4574() {
      return this.field2203;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("am")
   @Override
   public boolean vmethod445(boolean var1) {
      return false;
   }

   public classFC() {
      this.field2201 = false;
      this.field2202 = false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   @Override
   public boolean vmethod439(int var1) {
      if (this.field2203 == null) {
         return false;
      } else {
         classTT var2 = Widget.method7287(this.field2203, 1289741507);
         if (var2 == null) {
            return false;
         } else {
            if (var2.method11149(var1, -1501551007)) {
               switch (var1) {
                  case 81:
                     this.field2202 = true;
                     break;
                  case 82:
                     this.field2201 = true;
                     break;
                  default:
                     this.method4588(var1, (byte)-64);
               }
            }

            return classTT.method11144(var2, var1, -1825274409);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   @Override
   public boolean vmethod440(int var1) {
      switch (var1) {
         case 81:
            this.field2202 = false;
            return false;
         case 82:
            this.field2201 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("ap")
   public void method4580(Widget var1) {
      if (var1 != null) {
         if (this.field2203 != var1) {
            this.method4582((byte)13);
            this.field2203 = var1;
         }

         classLX var2 = var1.method7294(1426850858);
         if (var2 != null) {
            if (!var2.field4419.method6982(1419512645) && var2.field4426 != null) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var1, 314397734).method14145(var2.field4426, (byte)2), (byte)109);
               client.field823.method9658(var3, 1697206599);
            }

            var2.field4419.method6798(true, 1447369405);
         }
      } else {
         this.method4582((byte)123);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   @Override
   public boolean vmethod441(int var1) {
      switch (var1) {
         case 81:
            this.field2202 = false;
            return false;
         case 82:
            this.field2201 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod443(char var1) {
      if (this.field2203 == null) {
         return false;
      } else if (!classIB.method6139(var1, 1284636004)) {
         return false;
      } else {
         classLH var2 = this.field2203.method7283(-1566426096);
         if (null != var2 && var2.method6998((byte)-68)) {
            classTT var3 = Widget.method7287(this.field2203, 1289741507);
            if (var3 == null) {
               return false;
            } else {
               if (var3.method11151(var1, 731299091)) {
                  var2.method6854(var1, -532908386);
               }

               return var3.method11147(var1, -2022070801);
            }
         } else {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfc;)V")
   @ObfuscatedName("ps")
   public static void method4584(classFC var0) {
      if (null != var0.field2203) {
         classLX var1 = var0.field2203.method7294(-1526634917);
         Widget var2 = var0.field2203;
         var0.field2203 = null;
         if (var1 != null) {
            if (var1.field4419.method6982(1264639224) && null != var1.field4426) {
               ScriptEvent var3 = classZS.method14182(classUQ.method11465(var2, -132233407).method14145(var1.field4426, (byte)2), (byte)81);
               client.field823.method9658(var3, 1697206599);
            }

            var1.field4419.method6798(false, 2100103659);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   @Override
   public boolean vmethod438(int var1) {
      if (this.field2203 == null) {
         return false;
      } else {
         classTT var2 = Widget.method7287(this.field2203, 1289741507);
         if (var2 == null) {
            return false;
         } else {
            if (var2.method11149(var1, 121037862)) {
               switch (var1) {
                  case 81:
                     this.field2202 = true;
                     break;
                  case 82:
                     this.field2201 = true;
                     break;
                  default:
                     this.method4588(var1, (byte)35);
               }
            }

            return classTT.method11144(var2, var1, -2050129091);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod442(int var1) {
      switch (var1) {
         case 81:
            this.field2202 = false;
            return false;
         case 82:
            this.field2201 = false;
            return false;
         default:
            return false;
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;Llw;ZLvv;Lqn;I)V")
   @ObfuscatedName("af")
   public static void method4586(Widget[] var0, Widget var1, boolean var2, classVV var3, classQN var4, int var5) {
      try {
         int var6 = 0 != -842862191 * var1.field4258 ? var1.field4258 * -842862191 : var1.field4249 * 1115597881;
         int var10000;
         if (0 != var1.field4269 * -714521463) {
            if (var5 == -1037162862) {
               throw new IllegalStateException();
            }

            var10000 = var1.field4269 * -714521463;
         } else {
            var10000 = 293773697 * var1.field4259;
         }

         int var7 = var10000;
         NpcOverrides.method9086(
            var0,
            -1210177335 * var1.field4265,
            var1.field4266 * 379541057,
            var1.field4329 * -1163656551,
            63131743 * var1.field4260,
            var6,
            var7,
            var2,
            var3,
            var4,
            1717101466
         );
         if (var1.field4340 != null) {
            if (var5 == -1037162862) {
               return;
            }

            NpcOverrides.method9086(var1.field4340, 0, var1.field4340.length - 1, var1.field4329 * -1163656551, -1, var6, var7, var2, var3, var4, 819056711);
         }

         if (-1 == var1.field4260 * 63131743) {
            if (var5 == -1037162862) {
               throw new IllegalStateException();
            }

            InterfaceParent var8 = (InterfaceParent)var3.field6613.method13363(var1.field4329 * -1163656551);
            if (null != var8) {
               if (var5 == -1037162862) {
                  return;
               }

               classCN.method2551(2023647411 * var8.field5276, var6, var7, var2, var3, var4, (short)217);
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "fc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/StringBuilder;Lqi;II)V")
   @ObfuscatedName("ae")
   static void method4589(String var0, StringBuilder var1, classQI var2, int var3, int var4) {
      try {
         String[] var5 = var0.split("=");
         if (var5.length == 1) {
            if (var4 != 2073705266) {
               throw new IllegalStateException();
            }

            var5 = var0.split(":");
            int var6 = var2.method9565(var5[0], 1849728926);
            String var7 = Integer.toString(var6);
            if (var5.length > 1) {
               if (var4 != 2073705266) {
                  throw new IllegalStateException();
               }

               String var8 = var5[1].toLowerCase();
               classRZ var9 = classAI.method370(classXO.field6892, 1883191353);
               if (var8.equals("spacer")) {
                  if (var4 != 2073705266) {
                     throw new IllegalStateException();
                  }

                  var7 = classXW.method12950(var6, 0, true, true, var9, (byte)30);
               } else if (var8.equals("percent")) {
                  var7 = classXW.method12950(var6, 0, false, true, var9, (byte)38);
                  var7 = var7 + "%";
               } else if (var8.equals("date")) {
                  var7 = classGQ.method5603(var6, (byte)19);
               } else if (var8.startsWith("spacer_")) {
                  if (var4 != 2073705266) {
                     throw new IllegalStateException();
                  }

                  classRA var34 = Projectile.method1207(var8.substring("spacer_".length()), 763367599);
                  var7 = classXW.method12950(var6, 618506607 * var34.field5631, true, var34.field5630, var9, (byte)29);
               } else if (var8.startsWith("decimal_")) {
                  classRA var33 = Projectile.method1207(var8.substring("decimal_".length()), 633990357);
                  var7 = classXW.method12950(var6, 618506607 * var33.field5631, false, var33.field5630, var9, (byte)-84);
               } else if (var8.startsWith("scale_")) {
                  if (var4 != 2073705266) {
                     throw new IllegalStateException();
                  }

                  String var35 = var8.substring("scale_".length());
                  boolean var36 = true;
                  if (var35.endsWith("_z")) {
                     if (var4 != 2073705266) {
                        return;
                     }

                     var36 = false;
                     var35 = var35.substring(0, var35.length() - "_z".length());
                  }

                  String[] var37 = var35.split("_");
                  int var39 = Integer.parseInt(var37[0]);
                  int var10000;
                  if (var37.length > 1) {
                     if (var4 != 2073705266) {
                        return;
                     }

                     var10000 = Integer.parseInt(var37[1]);
                  } else {
                     var10000 = 0;
                  }

                  int var41 = var10000;
                  classRL var32 = new classRL(var39, var41, var36);
                  var7 = classIG.method6209(var6, var32.field5685 * -527595341, -212446981 * var32.field5687, var32.field5686, var9, 1711827676);
               } else if (var8.startsWith("percent_")) {
                  classRA var31 = Projectile.method1207(var8.substring("percent_".length()), -1110347053);
                  var7 = classYY.method13778(var6, var31.field5631 * 618506607, var31.field5630, var9, (byte)8);
               } else if (var8.startsWith("zeropad_")) {
                  if (var4 != 2073705266) {
                     throw new IllegalStateException();
                  }

                  int var30 = Integer.parseInt(var8.substring("zeropad_".length()));
                  if (var6 >= 0) {
                     var7 = String.format("%0" + var30 + "d", var6);
                  }
               } else if (var8.startsWith("time_")) {
                  if (var4 != 2073705266) {
                     throw new IllegalStateException();
                  }

                  String var11 = var8.substring("time_".length());
                  String[] var13 = var11.split("_");
                  classRM var14 = new classRM();
                  var14.field5808 = var13[0];
                  var14.field5807 = var13[1];
                  classRM var12;
                  if (var14.field5807.equals("clk")) {
                     if (var4 != 2073705266) {
                        return;
                     }

                     var12 = var14;
                  } else {
                     String var15 = var13[2];
                     if (var15.equals("dt")) {
                        if (var4 != 2073705266) {
                           throw new IllegalStateException();
                        }

                        var14.field5806 = "d";
                        var14.field5810 = true;
                     } else if (var15.equals("ht")) {
                        if (var4 != 2073705266) {
                           throw new IllegalStateException();
                        }

                        var14.field5806 = "h";
                        var14.field5810 = true;
                     } else {
                        var14.field5806 = var15;
                     }

                     boolean var10001;
                     label268: {
                        if (var13.length > 3) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           if (var13[3].equals("ms")) {
                              if (var4 != 2073705266) {
                                 throw new IllegalStateException();
                              }

                              var10001 = true;
                              break label268;
                           }
                        }

                        var10001 = false;
                     }

                     var14.field5811 = var10001;
                     var12 = var14;
                  }

                  classQO var38 = classMT.method7688((byte)40);
                  String var17 = var12.field5808;
                  long var40;
                  if ("c".equals(var17)) {
                     if (var4 != 2073705266) {
                        throw new IllegalStateException();
                     }

                     var40 = 600L * var6;
                  } else if ("s".equals(var17)) {
                     if (var4 != 2073705266) {
                        throw new IllegalStateException();
                     }

                     var40 = 1000L * var6;
                  } else if ("m".equals(var17)) {
                     if (var4 != 2073705266) {
                        throw new IllegalStateException();
                     }

                     var40 = 60000L * var6;
                  } else {
                     var40 = var6;
                  }

                  String var10;
                  label261: {
                     if (var12.field5807.equals("w")) {
                        if (var4 != 2073705266) {
                           return;
                        }

                        label257: {
                           if (!var12.field5808.equals("s")) {
                              if (var4 != 2073705266) {
                                 throw new IllegalStateException();
                              }

                              if (!var12.field5808.equals("c")) {
                                 break label257;
                              }

                              if (var4 != 2073705266) {
                                 return;
                              }
                           }

                           if (var40 < 2000L) {
                              if (var4 != 2073705266) {
                                 throw new IllegalStateException();
                              }

                              var10 = "a moment";
                              break label261;
                           }
                        }

                        if (var12.field5808.equals("m")) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           if (var40 <= 60000L) {
                              if (var4 != 2073705266) {
                                 throw new IllegalStateException();
                              }

                              var10 = "a minute";
                              break label261;
                           }
                        }
                     }

                     if (var12.field5807.equals("clk")) {
                        if (var4 != 2073705266) {
                           throw new IllegalStateException();
                        }

                        long var21 = var40 / 60000L % 1440L;
                        if (var21 < 0L) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           var21 += 1440L;
                        }

                        long var23 = var21 / 60L;
                        long var25 = var21 % 60L;
                        String var20 = classGK.method5485(var23) + ":" + classGK.method5485(var25);
                        var10 = var20;
                     } else {
                        classRY var42 = classDE.method2993(var40, var12.field5806, -765485579);
                        if (var12.field5807.equals("n")) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           var10 = classIR.method6311(var42, var12.field5806, var12.field5811, (byte)47);
                        } else if (var12.field5807.equals("w")) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           var10 = classQO.method9690(var38, var42, var12.field5806, false, var12.field5810, 329825058);
                        } else if (var12.field5807.equals("wm")) {
                           if (var4 != 2073705266) {
                              throw new IllegalStateException();
                           }

                           var10 = classQO.method9690(var38, var42, var12.field5806, true, var12.field5810, 329825058);
                        } else {
                           var10 = Long.toString(var6);
                        }
                     }
                  }

                  var7 = var10;
               }
            }

            var1.append(var7);
         } else if (var5[1].equals("pronoun")) {
            if (var4 != 2073705266) {
               throw new IllegalStateException();
            }

            var2.method9549(var5[0], var3, 1711641727);
         } else {
            var2.method9548(var5[0], var5[1], 81802972);
         }
      } catch (RuntimeException var27) {
         throw classEG.newRunException(var27, "fc.ae(" + ')');
      }
   }
}
