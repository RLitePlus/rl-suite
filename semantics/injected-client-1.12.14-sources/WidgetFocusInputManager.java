import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kh")
public class WidgetFocusInputManager implements classBS {
   @ObfuscatedName("at")
   boolean field3304;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("av")
   Widget inputField = null;
   @ObfuscatedName("ag")
   boolean field3306;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aj")
   public static AbstractArchive field3309;
   @ObfuscatedName("up")
   static int field3308;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field3307 = 29;

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ap")
   @Override
   public boolean vmethod100(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ad")
   public Widget method6348(int var1) {
      try {
         return this.inputField;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kh.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)V")
   @ObfuscatedName("ai")
   public void method6353(Widget var1, byte var2) {
      try {
         if (var1 != null) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (var1 != this.inputField) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               this.method6358(50402221);
               this.inputField = var1;
            }

            class376 var3 = var1.method8164((byte)-6);
            if (null != var3) {
               if (var2 <= 0) {
                  return;
               }

               if (!var3.field4678.method8538((byte)0)) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var3.field4682 != null) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent var4 = new ScriptEvent();
                     var4.method1410(var1, (short)5200);
                     var4.setArgs(var3.field4682, -1602233747);
                     HttpQueryParams.method11268(-750875820).addFirst(var4);
                  }
               }

               var3.field4678.method8371(true, 1485355144);
            }
         } else {
            this.method6358(-1794958599);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kh.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method6358(int var1) {
      try {
         if (this.inputField == null) {
            if (var1 == 1891519610) {
               throw new IllegalStateException();
            }
         } else {
            class376 var2 = this.inputField.method8164((byte)-68);
            Widget var3 = this.inputField;
            this.inputField = null;
            if (var2 == null) {
               if (var1 == 1891519610) {
                  throw new IllegalStateException();
               }
            } else {
               if (var2.field4678.method8538((byte)0)) {
                  if (var1 == 1891519610) {
                     throw new IllegalStateException();
                  }

                  if (null != var2.field4682) {
                     if (var1 == 1891519610) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent var4 = new ScriptEvent();
                     var4.method1410(var3, (short)5200);
                     var4.setArgs(var2.field4682, -1276808227);
                     HttpQueryParams.method11268(-793948568).addFirst(var4);
                  }
               }

               var2.field4678.method8371(false, 1485355144);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod96(int var1, int var2) {
      try {
         if (null == this.inputField) {
            if (var2 == -1931673031) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            class28 var3 = this.inputField.method8162((byte)13);
            if (null == var3) {
               if (var2 == -1931673031) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               if (var3.method508(var1, -379544307)) {
                  switch (var1) {
                     case 81:
                        this.field3306 = true;
                        break;
                     case 82:
                        this.field3304 = true;
                        break;
                     default:
                        if (this.method6362(var1, (byte)36)) {
                           if (var2 == -1931673031) {
                              throw new IllegalStateException();
                           }

                           class376.invalidateWidget(this.inputField, (byte)5);
                        }
                  }
               }

               return var3.method500(var1, 292724588);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kh.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkh;)V")
   @ObfuscatedName("lt")
   public static void method6359(WidgetFocusInputManager var0) {
      if (var0.inputField != null) {
         class376 var1 = var0.inputField.method8164((byte)-84);
         Widget var2 = var0.inputField;
         var0.inputField = null;
         if (var1 != null) {
            if (var1.field4678.method8538((byte)0) && null != var1.field4682) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var2, (short)5200);
               var3.setArgs(var1.field4682, 1393100010);
               HttpQueryParams.method11268(1372813709).addFirst(var3);
            }

            var1.field4678.method8371(false, 1485355144);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("am")
   public void method6354(Widget var1) {
      if (var1 != null) {
         if (var1 != this.inputField) {
            this.method6358(-1595155456);
            this.inputField = var1;
         }

         class376 var2 = var1.method8164((byte)-116);
         if (null != var2) {
            if (!var2.field4678.method8538((byte)0) && var2.field4682 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var1, (short)5200);
               var3.setArgs(var2.field4682, -1512565303);
               HttpQueryParams.method11268(664139697).addFirst(var3);
            }

            var2.field4678.method8371(true, 1485355144);
         }
      } else {
         this.method6358(165389611);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod94(int var1) {
      if (null == this.inputField) {
         return false;
      } else {
         class28 var2 = this.inputField.method8162((byte)13);
         if (null == var2) {
            return false;
         } else {
            if (var2.method508(var1, 1430334981)) {
               switch (var1) {
                  case 81:
                     this.field3306 = true;
                     break;
                  case 82:
                     this.field3304 = true;
                     break;
                  default:
                     if (this.method6362(var1, (byte)41)) {
                        class376.invalidateWidget(this.inputField, (byte)5);
                     }
               }
            }

            return var2.method500(var1, -391764245);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod92(boolean var1, int var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kh.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ac")
   boolean method6362(int var1, byte var2) {
      try {
         if (null == this.inputField) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classOO var3 = this.inputField.method8156(2099296239);
            if (var3 != null) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               if (var3.method8557((byte)50)) {
                  switch (var1) {
                     case 13:
                        this.method6358(2084631842);
                        return true;
                     case 48:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8442(1492942189);
                        }

                        return true;
                     case 65:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           Clipboard var9 = SecureUrlRequester.client.method712(-318851747);
                           var3.method8512(var9, (byte)-45);
                        }

                        return true;
                     case 66:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           Clipboard var8 = SecureUrlRequester.client.method712(802623332);
                           var3.method8510(var8, (byte)-24);
                        }

                        return true;
                     case 67:
                        if (this.field3304) {
                           Clipboard var7 = SecureUrlRequester.client.method712(821954852);
                           var3.method8515(var7, 1205453202);
                        }

                        return true;
                     case 84:
                        if (classOO.method8573(var3, (byte)-58) == 0) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8417(10, 1604076627);
                        } else {
                           if (this.field3306) {
                              if (var2 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (classOO.method8595(var3, -2024894629)) {
                                 if (var2 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var3.method8417(10, 2069043000);
                                 return true;
                              }
                           }

                           class376 var4 = this.inputField.method8164((byte)-21);
                           ScriptEvent var5 = new ScriptEvent();
                           var5.method1410(this.inputField, (short)5200);
                           var5.setArgs(var4.field4684, 579641692);
                           HttpQueryParams.method11268(-1757567313).addFirst(var5);
                           this.method6358(1473443044);
                        }

                        return true;
                     case 85:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8433((byte)36);
                        } else {
                           var3.method8422((byte)60);
                        }

                        return true;
                     case 96:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8471(this.field3306, -900931832);
                        } else {
                           classOO.method8464(var3, this.field3306, -1612551013);
                        }

                        return true;
                     case 97:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8478(this.field3306, -1145064746);
                        } else {
                           classOO.method8465(var3, this.field3306, -327983032);
                        }

                        return true;
                     case 98:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8521((byte)127);
                        } else {
                           var3.method8479(this.field3306, (byte)75);
                        }

                        return true;
                     case 99:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8523(1108154501);
                        } else {
                           var3.method8481(this.field3306, -680518357);
                        }

                        return true;
                     case 101:
                        if (this.field3304) {
                           var3.method8437(1492606201);
                        } else {
                           var3.method8428(2101183389);
                        }

                        return true;
                     case 102:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8457(this.field3306, 832672929);
                        } else {
                           var3.method8451(this.field3306, 1674472240);
                        }

                        return true;
                     case 103:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8458(this.field3306, -1509478464);
                        } else {
                           var3.method8454(this.field3306, -1480375003);
                        }

                        return true;
                     case 104:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8494(this.field3306, (byte)-20);
                        } else {
                           classOO.method8486(var3, this.field3306, (byte)-52);
                        }

                        return true;
                     case 105:
                        if (this.field3304) {
                           if (var2 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.method8496(this.field3306, (byte)-92);
                        } else {
                           var3.method8491(this.field3306, 2014172463);
                        }

                        return true;
                     default:
                        return false;
                  }
               }

               if (var2 <= 1) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kh.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   @Override
   public boolean vmethod95(int var1) {
      switch (var1) {
         case 81:
            this.field3306 = false;
            return false;
         case 82:
            this.field3304 = false;
            return false;
         default:
            return false;
      }
   }

   public WidgetFocusInputManager() {
      this.field3304 = false;
      this.field3306 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method6360() {
      if (this.inputField != null) {
         class376 var1 = this.inputField.method8164((byte)-54);
         Widget var2 = this.inputField;
         this.inputField = null;
         if (var1 != null) {
            if (var1.field4678.method8538((byte)0) && null != var1.field4682) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var2, (short)5200);
               var3.setArgs(var1.field4682, -1034971733);
               HttpQueryParams.method11268(-1147455880).addFirst(var3);
            }

            var1.field4678.method8371(false, 1485355144);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aw")
   @Override
   public boolean vmethod99(char var1) {
      if (this.inputField == null) {
         return false;
      } else if (!AbstractWorldMapData.method7256(var1, -580673349)) {
         return false;
      } else {
         classOO var2 = this.inputField.method8156(1923751476);
         if (var2 != null && var2.method8557((byte)-16)) {
            class28 var3 = this.inputField.method8162((byte)13);
            if (null == var3) {
               return false;
            } else {
               if (class28.method512(var3, var1, 270578131) && var2.method8417(var1, 2111532322)) {
                  class376.invalidateWidget(this.inputField, (byte)5);
               }

               return var3.method503(var1, -1577034588);
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod89(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod93(int var1) {
      if (null == this.inputField) {
         return false;
      } else {
         class28 var2 = this.inputField.method8162((byte)13);
         if (null == var2) {
            return false;
         } else {
            if (var2.method508(var1, -844246639)) {
               switch (var1) {
                  case 81:
                     this.field3306 = true;
                     break;
                  case 82:
                     this.field3304 = true;
                     break;
                  default:
                     if (this.method6362(var1, (byte)112)) {
                        class376.invalidateWidget(this.inputField, (byte)5);
                     }
               }
            }

            return var2.method500(var1, -1853511043);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod97(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("ab")
   public Widget method6349() {
      return this.inputField;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("ax")
   public Widget method6350() {
      return this.inputField;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod90(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("ah")
   public Widget method6351() {
      return this.inputField;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("ar")
   public Widget method6352() {
      return this.inputField;
   }

   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("af")
   public void method6355(Widget var1) {
      if (var1 != null) {
         if (var1 != this.inputField) {
            this.method6358(-1779283327);
            this.inputField = var1;
         }

         class376 var2 = var1.method8164((byte)-70);
         if (null != var2) {
            if (!var2.field4678.method8538((byte)0) && var2.field4682 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var1, (short)5200);
               var3.setArgs(var2.field4682, -570461514);
               HttpQueryParams.method11268(633573438).addFirst(var3);
            }

            var2.field4678.method8371(true, 1485355144);
         }
      } else {
         this.method6358(-864097256);
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod91(char var1, byte var2) {
      try {
         if (this.inputField == null) {
            if (var2 >= 30) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (!AbstractWorldMapData.method7256(var1, -580673349)) {
            if (var2 >= 30) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classOO var3 = this.inputField.method8156(1996503341);
            if (var3 != null) {
               if (var2 >= 30) {
                  throw new IllegalStateException();
               }

               if (var3.method8557((byte)-26)) {
                  class28 var4 = this.inputField.method8162((byte)13);
                  if (null == var4) {
                     if (var2 >= 30) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  if (class28.method512(var4, var1, 931181298)) {
                     if (var2 >= 30) {
                        throw new IllegalStateException();
                     }

                     if (var3.method8417(var1, 1503787921)) {
                        if (var2 >= 30) {
                           throw new IllegalStateException();
                        }

                        class376.invalidateWidget(this.inputField, (byte)5);
                     }
                  }

                  return var4.method503(var1, -565327984);
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kh.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkh;I)Z")
   @ObfuscatedName("fl")
   public static boolean method6363(WidgetFocusInputManager var0, int var1) {
      if (null == var0.inputField) {
         return false;
      } else {
         classOO var2 = var0.inputField.method8156(1564454448);
         if (var2 != null && var2.method8557((byte)58)) {
            switch (var1) {
               case 13:
                  var0.method6358(-2125042762);
                  return true;
               case 48:
                  if (var0.field3304) {
                     var2.method8442(-1036744582);
                  }

                  return true;
               case 65:
                  if (var0.field3304) {
                     Clipboard var7 = SecureUrlRequester.client.method712(1580227493);
                     var2.method8512(var7, (byte)1);
                  }

                  return true;
               case 66:
                  if (var0.field3304) {
                     Clipboard var6 = SecureUrlRequester.client.method712(1950613544);
                     var2.method8510(var6, (byte)-11);
                  }

                  return true;
               case 67:
                  if (var0.field3304) {
                     Clipboard var5 = SecureUrlRequester.client.method712(-955590744);
                     var2.method8515(var5, 1205453202);
                  }

                  return true;
               case 84:
                  if (classOO.method8573(var2, (byte)-27) == 0) {
                     var2.method8417(10, 1996316089);
                  } else if (var0.field3306 && classOO.method8595(var2, -1570998537)) {
                     var2.method8417(10, 2140532806);
                  } else {
                     class376 var3 = var0.inputField.method8164((byte)-117);
                     ScriptEvent var4 = new ScriptEvent();
                     var4.method1410(var0.inputField, (short)5200);
                     var4.setArgs(var3.field4684, 176158512);
                     HttpQueryParams.method11268(-1879228765).addFirst(var4);
                     var0.method6358(131528035);
                  }

                  return true;
               case 85:
                  if (var0.field3304) {
                     var2.method8433((byte)-40);
                  } else {
                     var2.method8422((byte)86);
                  }

                  return true;
               case 96:
                  if (var0.field3304) {
                     var2.method8471(var0.field3306, -900931832);
                  } else {
                     classOO.method8464(var2, var0.field3306, -1013167979);
                  }

                  return true;
               case 97:
                  if (var0.field3304) {
                     var2.method8478(var0.field3306, -2119209724);
                  } else {
                     classOO.method8465(var2, var0.field3306, -327983032);
                  }

                  return true;
               case 98:
                  if (var0.field3304) {
                     var2.method8521((byte)54);
                  } else {
                     var2.method8479(var0.field3306, (byte)37);
                  }

                  return true;
               case 99:
                  if (var0.field3304) {
                     var2.method8523(1889133451);
                  } else {
                     var2.method8481(var0.field3306, -680518357);
                  }

                  return true;
               case 101:
                  if (var0.field3304) {
                     var2.method8437(1642650165);
                  } else {
                     var2.method8428(2089163193);
                  }

                  return true;
               case 102:
                  if (var0.field3304) {
                     var2.method8457(var0.field3306, 832672929);
                  } else {
                     var2.method8451(var0.field3306, 1674472240);
                  }

                  return true;
               case 103:
                  if (var0.field3304) {
                     var2.method8458(var0.field3306, -1509478464);
                  } else {
                     var2.method8454(var0.field3306, -927893648);
                  }

                  return true;
               case 104:
                  if (var0.field3304) {
                     var2.method8494(var0.field3306, (byte)-13);
                  } else {
                     classOO.method8486(var2, var0.field3306, (byte)-112);
                  }

                  return true;
               case 105:
                  if (var0.field3304) {
                     var2.method8496(var0.field3306, (byte)-80);
                  } else {
                     var2.method8491(var0.field3306, 2014172463);
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

   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("ao")
   public void method6356(Widget var1) {
      if (var1 != null) {
         if (var1 != this.inputField) {
            this.method6358(-1135836410);
            this.inputField = var1;
         }

         class376 var2 = var1.method8164((byte)-76);
         if (null != var2) {
            if (!var2.field4678.method8538((byte)0) && var2.field4682 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var1, (short)5200);
               var3.setArgs(var2.field4682, -1036003504);
               HttpQueryParams.method11268(90948114).addFirst(var3);
            }

            var2.field4678.method8371(true, 1485355144);
         }
      } else {
         this.method6358(-1131228552);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("aa")
   public void method6357(Widget var1) {
      if (var1 != null) {
         if (var1 != this.inputField) {
            this.method6358(-1066695441);
            this.inputField = var1;
         }

         class376 var2 = var1.method8164((byte)-52);
         if (null != var2) {
            if (!var2.field4678.method8538((byte)0) && var2.field4682 != null) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var1, (short)5200);
               var3.setArgs(var2.field4682, 1417557322);
               HttpQueryParams.method11268(2059602791).addFirst(var3);
            }

            var2.field4678.method8371(true, 1485355144);
         }
      } else {
         this.method6358(-713322751);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean vmethod98(int var1, byte var2) {
      try {
         switch (var1) {
            case 81:
               this.field3306 = false;
               return false;
            case 82:
               this.field3304 = false;
               return false;
            default:
               return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void method6361() {
      if (this.inputField != null) {
         class376 var1 = this.inputField.method8164((byte)-42);
         Widget var2 = this.inputField;
         this.inputField = null;
         if (var1 != null) {
            if (var1.field4678.method8538((byte)0) && null != var1.field4682) {
               ScriptEvent var3 = new ScriptEvent();
               var3.method1410(var2, (short)5200);
               var3.setArgs(var1.field4682, -2120017636);
               HttpQueryParams.method11268(-547255142).addFirst(var3);
            }

            var1.field4678.method8371(false, 1485355144);
         }
      }
   }
}
