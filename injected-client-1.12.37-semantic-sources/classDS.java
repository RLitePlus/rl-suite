import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ds")
public class classDS {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field1618 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1619 = 3;
   @ObfuscatedName("ag")
   final int[] field1614;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final String field1622 = "2";
   @ObfuscatedName("ac")
   long field1621;
   @ObfuscatedName("as")
   final Map field1616;
   @ObfuscatedName("ax")
   boolean field1615 = false;
   @ObfuscatedName("ab")
   final boolean[] field1617;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1620 = 10000;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("la")
   static classUK field1623;

   @ObfuscatedSignature(descriptor = "(I)Lte;")
   @ObfuscatedName("bp")
   classTE method3561(int var1) {
      Object var2 = this.field1616.get(var1);
      if (var2 instanceof classTE) {
         return (classTE)var2;
      } else {
         classYY var3 = FriendsList.method10130(this.field1614[var1], -662921870);
         Object var4;
         switch (var3.field7107 * -900901303) {
            case 2:
               var4 = classTM.method10934(this.field1614[var1], -973324355);
               break;
            case 3:
               var4 = (long)classTM.method10934(this.field1614[var1], -973324355);
               break;
            case 4:
               var4 = "";
               break;
            default:
               throw new RuntimeException();
         }

         classTE var5 = new classTE(var3, var4, 0, 16);
         this.field1616.put(var1, var5);
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V")
   @ObfuscatedName("ag")
   void method3551(int var1, Object var2, int var3) {
      try {
         this.field1616.put(var1, var2);
         if (this.field1617[var1]) {
            if (var3 == -2089279832) {
               throw new IllegalStateException();
            }

            this.field1615 = true;
         }

         this.method3593(var1, (String)var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)J")
   @ObfuscatedName("ab")
   long method3546(int var1, int var2) {
      try {
         Object var3 = this.field1616.get(var1);
         if (var3 instanceof Integer) {
            if (var2 == 793642421) {
               throw new IllegalStateException();
            } else {
               return ((Integer)var3).intValue();
            }
         } else if (var3 instanceof Long) {
            if (var2 == 793642421) {
               throw new IllegalStateException();
            } else {
               return (Long)var3;
            }
         } else {
            return -1L;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   void method3580() {
      classAAR var1 = this.method3575(false, (byte)-72);

      label191: {
         try {
            byte[] var2 = new byte[(int)var1.method257(-153393736)];
            int var3 = 0;

            while (var3 < var2.length) {
               int var4 = var1.method260(var2, var3, var2.length - var3, -1397369950);
               if (var4 == -1) {
                  throw new EOFException();
               }

               var3 += var4;
            }

            classXY var24 = new classXY(var2);
            if (var24.field6954.length - 702114061 * var24.field6955 < 1) {
               return;
            }

            int var5 = classXY.method13039(var24, -346779531);
            if (var5 >= 0 && var5 <= 3) {
               if (var5 >= 2) {
                  int var6 = classXY.method13047(var24, -921896574);
                  int var7 = 0;

                  while (true) {
                     if (var7 >= var6) {
                        break label191;
                     }

                     int var8 = classXY.method13047(var24, -1935196466);
                     int var9 = classXY.method13039(var24, -346779531);
                     classYY var10 = (classYY)classOF.method8404(classYY.method13782((byte)-11), var9, -1811551873);
                     Object var11;
                     if (classYY.field7114 == var10) {
                        var11 = classPD.method8843(var24, true, -193629541);
                     } else {
                        var11 = var10.method13787(var24, 827988912);
                     }

                     if (var8 >= 0 && var8 < this.field1617.length && this.field1617[var8]) {
                        this.field1616.put(var8, var11);
                     }

                     var7++;
                  }
               } else {
                  int var25 = classXY.method13047(var24, 1824383334);

                  for (int var26 = 0; var26 < var25; var26++) {
                     int var28 = classXY.method13047(var24, -2002502651);
                     int var30 = var24.method13056((byte)1);
                     if (var28 >= 0 && var28 < this.field1617.length && this.field1617[var28]) {
                        this.field1616.put(var28, var30);
                     }
                  }

                  int var27 = classXY.method13047(var24, -115128737);
                  int var29 = 0;

                  while (true) {
                     if (var29 >= var27) {
                        break label191;
                     }

                     classXY.method13047(var24, 1624199738);
                     var24.method13071(2095879464);
                     var29++;
                  }
               }
            }
         } catch (Exception var22) {
            break label191;
         } finally {
            try {
               classAAR.method247(var1, (byte)1);
            } catch (Exception var21) {
            }
         }

         return;
      }

      this.field1615 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   void method3586() {
      long var1 = classDD.method2983(16711680);
      if (-9088770474988100363L * this.field1621 < var1 - 10000L) {
         this.field1621 = 8207151046932948829L * var1;
         if (this.method3590((byte)-25)) {
            this.method3577(202221874);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;I)I")
   @ObfuscatedName("wa")
   public static int method3539(classDS var0, int var1) {
      Object var2 = var0.field1616.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "(Lds;II)Ljava/lang/String;")
   @ObfuscatedName("sb")
   public static String method3556(classDS var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method3560(var1, var1);
      } else {
         try {
            Object var3 = var0.field1616.get(var1);
            if (var3 instanceof String) {
               if (var2 == -682126121) {
                  throw new IllegalStateException();
               } else {
                  return (String)var3;
               }
            } else {
               return "";
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ds.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lte;")
   @ObfuscatedName("ax")
   classTE method3562(int var1, byte var2) {
      try {
         Object var3 = this.field1616.get(var1);
         if (var3 instanceof classTE) {
            if (var2 >= 2) {
               throw new IllegalStateException();
            } else {
               return (classTE)var3;
            }
         } else {
            classYY var4 = FriendsList.method10130(this.field1614[var1], 292847266);
            Object var5;
            switch (var4.field7107 * -900901303) {
               case 2:
                  var5 = classTM.method10934(this.field1614[var1], -973324355);
                  break;
               case 3:
                  var5 = (long)classTM.method10934(this.field1614[var1], -973324355);
                  break;
               case 4:
                  var5 = "";
                  break;
               default:
                  throw new RuntimeException();
            }

            classTE var6 = new classTE(var4, var5, 0, 16);
            this.field1616.put(var1, var6);
            return var6;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ds.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   Object method3564(int var1, byte var2) {
      try {
         Object var10000;
         if (-1 != this.field1614[var1]) {
            if (var2 <= 7) {
               throw new IllegalStateException();
            }

            var10000 = this.method3562(var1, (byte)-3);
         } else {
            var10000 = method3556(this, var1, 368741272);
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ds.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)Laar;")
   @ObfuscatedName("ao")
   classAAR method3575(boolean var1, byte var2) {
      try {
         return BoundaryObject.method4612("2", classYP.field7028.field4053, var1, (byte)1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ds.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method3577(int var1) {
      try {
         classAAR var2 = this.method3575(true, (byte)-54);

         try {
            int var3 = 3;
            int var4 = 0;
            Iterator var5 = this.field1616.entrySet().iterator();

            while (var5.hasNext()) {
               if (var1 <= -359666248) {
                  throw new IllegalStateException();
               }

               Entry var6 = (Entry)var5.next();
               int var7 = (Integer)var6.getKey();
               if (this.field1617[var7]) {
                  if (var1 <= -359666248) {
                     throw new IllegalStateException();
                  }

                  Object var8 = var6.getValue();
                  var3 += 3;
                  if (var8 instanceof Integer) {
                     if (var1 <= -359666248) {
                        throw new IllegalStateException();
                     }

                     var3 += 4;
                  } else if (var8 instanceof Long) {
                     if (var1 <= -359666248) {
                        throw new IllegalStateException();
                     }

                     var3 += 8;
                  } else if (var8 instanceof String) {
                     var3 += classAU.method712((String)var8, (byte)87);
                  } else if (var8 instanceof classTE) {
                     var3 += classHK.method6069((classTE)var8, 65280);
                  }

                  var4++;
               }
            }

            classXY var23 = new classXY(var3);
            classXY.method12971(var23, 3, (byte)-101);
            var23.method12973(var4, -1542382992);
            Iterator var24 = this.field1616.entrySet().iterator();

            while (var24.hasNext()) {
               if (var1 <= -359666248) {
                  throw new IllegalStateException();
               }

               Entry var25 = (Entry)var24.next();
               int var26 = (Integer)var25.getKey();
               if (this.field1617[var26]) {
                  var23.method12973(var26, -1542382992);
                  Object var9 = var25.getValue();
                  classYY var10 = classYY.method13783(var9.getClass(), -1990439522);
                  classXY.method12971(var23, -701844459 * var10.field7108, (byte)-62);
                  classYY.method13784(var9, var23, (short)-361);
                  if (var9 instanceof classTE) {
                     ((classTE)var9).field6133 = false;
                  }
               }
            }

            var2.method242(var23.field6954, 0, 702114061 * var23.field6955, -1210097394);
         } catch (Exception var20) {
         } finally {
            try {
               classAAR.method247(var2, (byte)1);
            } catch (Exception var19) {
            }
         }

         this.field1615 = false;
         classDD.method2983(16711680);
      } catch (RuntimeException var22) {
         throw classEG.method3884(var22, "ds.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;)V")
   @ObfuscatedName("lv")
   public static void method3567(classDS var0) {
      if (var0 == null) {
         var0.method3571();
      }

      for (int var1 = 0; var1 < var0.field1617.length; var1++) {
         if (!var0.field1617[var1]) {
            var0.field1616.remove(var1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;ILjava/lang/Object;)V")
   @ObfuscatedName("lj")
   public static void method3552(classDS var0, int var1, Object var2) {
      var0.field1616.put(var1, var2);
      if (var0.field1617[var1]) {
         var0.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   void method3581(byte var1) {
      try {
         classAAR var2 = this.method3575(false, (byte)-26);

         label244: {
            try {
               byte[] var3 = new byte[(int)var2.method257(-153393736)];
               int var4 = 0;

               while (var4 < var3.length) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  int var5 = var2.method260(var3, var4, var3.length - var4, -1397369950);
                  if (var5 == -1) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     throw new EOFException();
                  }

                  var4 += var5;
               }

               classXY var27 = new classXY(var3);
               if (var27.field6954.length - 702114061 * var27.field6955 < 1) {
                  return;
               }

               int var6 = classXY.method13039(var27, -346779531);
               if (var6 >= 0 && var6 <= 3) {
                  if (var6 >= 2) {
                     int var7 = classXY.method13047(var27, 709539780);
                     int var8 = 0;

                     while (true) {
                        if (var8 >= var7) {
                           break label244;
                        }

                        int var9 = classXY.method13047(var27, 1601048125);
                        int var10 = classXY.method13039(var27, -346779531);
                        classYY var11 = (classYY)classOF.method8404(classYY.method13782((byte)-18), var10, -1046137310);
                        Object var12;
                        if (classYY.field7114 == var11) {
                           var12 = classPD.method8843(var27, true, -193629541);
                        } else {
                           var12 = var11.method13787(var27, 827988912);
                        }

                        if (var9 >= 0) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var9 < this.field1617.length && this.field1617[var9]) {
                              if (var1 <= 1) {
                                 return;
                              }

                              this.field1616.put(var9, var12);
                           }
                        }

                        var8++;
                     }
                  } else {
                     int var28 = classXY.method13047(var27, 251377840);

                     for (int var29 = 0; var29 < var28; var29++) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        int var31 = classXY.method13047(var27, -1939983567);
                        int var33 = var27.method13056((byte)1);
                        if (var31 >= 0) {
                           if (var1 <= 1) {
                              return;
                           }

                           if (var31 < this.field1617.length && this.field1617[var31]) {
                              if (var1 <= 1) {
                                 return;
                              }

                              this.field1616.put(var31, var33);
                           }
                        }
                     }

                     int var30 = classXY.method13047(var27, 31677533);
                     int var32 = 0;

                     while (true) {
                        if (var32 >= var30) {
                           break label244;
                        }

                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        classXY.method13047(var27, -76674088);
                        var27.method13071(2082619160);
                        var32++;
                     }
                  }
               }
            } catch (Exception var24) {
               break label244;
            } finally {
               try {
                  classAAR.method247(var2, (byte)1);
               } catch (Exception var23) {
               }
            }

            return;
         }

         this.field1615 = false;
      } catch (RuntimeException var26) {
         throw classEG.method3884(var26, "ds.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;)V")
   @ObfuscatedName("yf")
   public static void method3582(classDS var0) {
      if (var0 == null) {
         var0.method3569();
      } else {
         classAAR var1 = var0.method3575(false, (byte)-55);

         label195: {
            try {
               byte[] var2 = new byte[(int)var1.method257(-153393736)];
               int var3 = 0;

               while (var3 < var2.length) {
                  int var4 = var1.method260(var2, var3, var2.length - var3, -1397369950);
                  if (var4 == -1) {
                     throw new EOFException();
                  }

                  var3 += var4;
               }

               classXY var24 = new classXY(var2);
               if (var24.field6954.length - 702114061 * var24.field6955 < 1) {
                  return;
               }

               int var5 = classXY.method13039(var24, -346779531);
               if (var5 >= 0 && var5 <= 3) {
                  if (var5 >= 2) {
                     int var6 = classXY.method13047(var24, -871817624);
                     int var7 = 0;

                     while (true) {
                        if (var7 >= var6) {
                           break label195;
                        }

                        int var8 = classXY.method13047(var24, 1575431533);
                        int var9 = classXY.method13039(var24, -346779531);
                        classYY var10 = (classYY)classOF.method8404(classYY.method13782((byte)-31), var9, -1047088468);
                        Object var11;
                        if (classYY.field7114 == var10) {
                           var11 = classPD.method8843(var24, true, -193629541);
                        } else {
                           var11 = var10.method13787(var24, 827988912);
                        }

                        if (var8 >= 0 && var8 < var0.field1617.length && var0.field1617[var8]) {
                           var0.field1616.put(var8, var11);
                        }

                        var7++;
                     }
                  } else {
                     int var25 = classXY.method13047(var24, 525072211);

                     for (int var26 = 0; var26 < var25; var26++) {
                        int var28 = classXY.method13047(var24, 630193178);
                        int var30 = var24.method13056((byte)1);
                        if (var28 >= 0 && var28 < var0.field1617.length && var0.field1617[var28]) {
                           var0.field1616.put(var28, var30);
                        }
                     }

                     int var27 = classXY.method13047(var24, 931243160);
                     int var29 = 0;

                     while (true) {
                        if (var29 >= var27) {
                           break label195;
                        }

                        classXY.method13047(var24, -2004457063);
                        var24.method13071(211386720);
                        var29++;
                     }
                  }
               }
            } catch (Exception var22) {
               break label195;
            } finally {
               try {
                  classAAR.method247(var1, (byte)1);
               } catch (Exception var21) {
               }
            }

            return;
         }

         var0.field1615 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aq")
   boolean method3590(byte var1) {
      try {
         if (this.field1615) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            Iterator var2 = this.field1616.entrySet().iterator();

            while (var2.hasNext()) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               Entry var3 = (Entry)var2.next();
               if (var3.getValue() instanceof classTE) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  classTE var4 = (classTE)var3.getValue();
                  if (var4.field6133) {
                     if (var1 == 0) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ds.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("hh")
   public void method3593(int var1, String var2) {
      classOE.field4843.getCallbacks().post(new VarClientStrChanged(var1));
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   void method3536(int var1, int var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ap")
   void method3537(int var1, int var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lds;B)V")
   @ObfuscatedName("yu")
   public static void method3568(classDS var0, byte var1) {
      if (var0 == null) {
         var0.method3574(var1);
      } else {
         try {
            for (int var2 = 0; var2 < var0.field1617.length; var2++) {
               if (!var0.field1617[var2]) {
                  if (var1 != 126) {
                     throw new IllegalStateException();
                  }

                  var0.field1616.remove(var2);
               }
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "ds.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lte;")
   @ObfuscatedName("br")
   classTE method3563(int var1) {
      Object var2 = this.field1616.get(var1);
      if (var2 instanceof classTE) {
         return (classTE)var2;
      } else {
         classYY var3 = FriendsList.method10130(this.field1614[var1], -395989592);
         Object var4;
         switch (var3.field7107 * -900901303) {
            case 2:
               var4 = classTM.method10934(this.field1614[var1], -973324355);
               break;
            case 3:
               var4 = (long)classTM.method10934(this.field1614[var1], -973324355);
               break;
            case 4:
               var4 = "";
               break;
            default:
               throw new RuntimeException();
         }

         classTE var5 = new classTE(var3, var4, 0, 16);
         this.field1616.put(var1, var5);
         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)V")
   @ObfuscatedName("aw")
   void method3542(int var1, long var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method3569() {
      for (int var1 = 0; var1 < this.field1617.length; var1++) {
         if (!this.field1617[var1]) {
            this.field1616.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("at")
   long method3547(int var1) {
      Object var2 = this.field1616.get(var1);
      if (var2 instanceof Integer) {
         return ((Integer)var2).intValue();
      } else {
         return var2 instanceof Long ? (Long)var2 : -1L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laar;)J")
   @ObfuscatedName("ps")
   public static long method3550(classAAR var0) throws IOException {
      return var0.field98.length();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method3570() {
      for (int var1 = 0; var1 < this.field1617.length; var1++) {
         if (!this.field1617[var1]) {
            this.field1616.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lds;I)V")
   @ObfuscatedName("lh")
   public static void method3587(classDS var0, int var1) {
      if (var0 == null) {
         var0.method3589(var1);
      } else {
         try {
            long var2 = classDD.method2983(16711680);
            if (-9088770474988100363L * var0.field1621 < var2 - 10000L) {
               var0.field1621 = 8207151046932948829L * var2;
               if (var0.method3590((byte)11)) {
                  if (var1 != -1244339392) {
                     throw new IllegalStateException();
                  }

                  var0.method3577(382679941);
               }
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ds.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("kp")
   public Map method3595() {
      return this.field1616;
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("av")
   long method3548(int var1) {
      Object var2 = this.field1616.get(var1);
      if (var2 instanceof Integer) {
         return ((Integer)var2).intValue();
      } else {
         return var2 instanceof Long ? (Long)var2 : -1L;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bn")
   String method3557(int var1) {
      Object var2 = this.field1616.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bx")
   String method3558(int var1) {
      Object var2 = this.field1616.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bc")
   String method3559(int var1) {
      Object var2 = this.field1616.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bm")
   Object method3565(int var1) {
      return -1 != this.field1614[var1] ? this.method3562(var1, (byte)-80) : method3556(this, var1, -448458976);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("vv")
   public void method3594(int var1, int var2) {
      classOE.field4843.getCallbacks().post(new VarClientIntChanged(var1));
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ah")
   void method3553(int var1, Object var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lpx;")
   @ObfuscatedName("az")
   public static HealthBarDefinition method3535(int var0, int var1) {
      try {
         HealthBarDefinition var2 = (HealthBarDefinition)HealthBarDefinition.field5475.method6422(var0);
         if (null != var2) {
            if (var1 <= 1879621350) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classMN.field4545.method11867(33, var0, -1500169245);
            var2 = new HealthBarDefinition(new classXY(var3), var0);
            HealthBarDefinition.field5475.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("bt")
   Object method3566(int var1) {
      return -1 != this.field1614[var1] ? this.method3562(var1, (byte)-27) : method3556(this, var1, 2011665719);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method3571() {
      for (int var1 = 0; var1 < this.field1617.length; var1++) {
         if (!this.field1617[var1]) {
            this.field1616.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   int method3540(int var1) {
      Object var2 = this.field1616.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "(Lds;IJ)V")
   @ObfuscatedName("mp")
   public static void method3543(classDS var0, int var1, long var2) {
      if (var0 == null) {
         var0.method3544(var1, var2);
      } else {
         try {
            var0.field1616.put(var1, var2);
            if (var0.field1617[var1]) {
               var0.field1615 = true;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ds.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method3572() {
      for (int var1 = 0; var1 < this.field1617.length; var1++) {
         if (!this.field1617[var1]) {
            this.field1616.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method3573() {
      for (int var1 = 0; var1 < this.field1617.length; var1++) {
         if (!this.field1617[var1]) {
            this.field1616.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Laar;")
   @ObfuscatedName("bw")
   classAAR method3576(boolean var1) {
      return BoundaryObject.method4612("2", classYP.field7028.field4053, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   boolean method3591() {
      if (this.field1615) {
         return true;
      } else {
         for (Entry var2 : this.field1616.entrySet()) {
            if (var2.getValue() instanceof classTE) {
               classTE var3 = (classTE)var2.getValue();
               if (var3.field6133) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method3578() {
      classAAR var1 = this.method3575(true, (byte)-44);

      try {
         int var2 = 3;
         int var3 = 0;

         for (Entry var5 : this.field1616.entrySet()) {
            int var6 = (Integer)var5.getKey();
            if (this.field1617[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof Long) {
                  var2 += 8;
               } else if (var7 instanceof String) {
                  var2 += classAU.method712((String)var7, (byte)108);
               } else if (var7 instanceof classTE) {
                  var2 += classHK.method6069((classTE)var7, 65280);
               }

               var3++;
            }
         }

         classXY var20 = new classXY(var2);
         classXY.method12971(var20, 3, (byte)-127);
         var20.method12973(var3, -1542382992);

         for (Entry var22 : this.field1616.entrySet()) {
            int var23 = (Integer)var22.getKey();
            if (this.field1617[var23]) {
               var20.method12973(var23, -1542382992);
               Object var8 = var22.getValue();
               classYY var9 = classYY.method13783(var8.getClass(), -1553239224);
               classXY.method12971(var20, -701844459 * var9.field7108, (byte)-63);
               classYY.method13784(var8, var20, (short)-24483);
               if (var8 instanceof classTE) {
                  ((classTE)var8).field6133 = false;
               }
            }
         }

         var1.method242(var20.field6954, 0, 702114061 * var20.field6955, -415335409);
      } catch (Exception var18) {
      } finally {
         try {
            classAAR.method247(var1, (byte)1);
         } catch (Exception var17) {
         }
      }

      this.field1615 = false;
      classDD.method2983(16711680);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method3579() {
      classAAR var1 = this.method3575(true, (byte)-54);

      try {
         int var2 = 3;
         int var3 = 0;

         for (Entry var5 : this.field1616.entrySet()) {
            int var6 = (Integer)var5.getKey();
            if (this.field1617[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof Long) {
                  var2 += 8;
               } else if (var7 instanceof String) {
                  var2 += classAU.method712((String)var7, (byte)79);
               } else if (var7 instanceof classTE) {
                  var2 += classHK.method6069((classTE)var7, 65280);
               }

               var3++;
            }
         }

         classXY var20 = new classXY(var2);
         classXY.method12971(var20, 3, (byte)-74);
         var20.method12973(var3, -1542382992);

         for (Entry var22 : this.field1616.entrySet()) {
            int var23 = (Integer)var22.getKey();
            if (this.field1617[var23]) {
               var20.method12973(var23, -1542382992);
               Object var8 = var22.getValue();
               classYY var9 = classYY.method13783(var8.getClass(), -1733408573);
               classXY.method12971(var20, -701844459 * var9.field7108, (byte)-110);
               classYY.method13784(var8, var20, (short)-9227);
               if (var8 instanceof classTE) {
                  ((classTE)var8).field6133 = false;
               }
            }
         }

         var1.method242(var20.field6954, 0, 702114061 * var20.field6955, -1162912707);
      } catch (Exception var18) {
      } finally {
         try {
            classAAR.method247(var1, (byte)1);
         } catch (Exception var17) {
         }
      }

      this.field1615 = false;
      classDD.method2983(16711680);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method3583() {
      classAAR var1 = this.method3575(false, (byte)-96);

      label191: {
         try {
            byte[] var2 = new byte[(int)var1.method257(-153393736)];
            int var3 = 0;

            while (var3 < var2.length) {
               int var4 = var1.method260(var2, var3, var2.length - var3, -1397369950);
               if (var4 == -1) {
                  throw new EOFException();
               }

               var3 += var4;
            }

            classXY var24 = new classXY(var2);
            if (var24.field6954.length - 702114061 * var24.field6955 < 1) {
               return;
            }

            int var5 = classXY.method13039(var24, -346779531);
            if (var5 >= 0 && var5 <= 3) {
               if (var5 >= 2) {
                  int var6 = classXY.method13047(var24, 705725156);
                  int var7 = 0;

                  while (true) {
                     if (var7 >= var6) {
                        break label191;
                     }

                     int var8 = classXY.method13047(var24, 360601598);
                     int var9 = classXY.method13039(var24, -346779531);
                     classYY var10 = (classYY)classOF.method8404(classYY.method13782((byte)-43), var9, 1191245413);
                     Object var11;
                     if (classYY.field7114 == var10) {
                        var11 = classPD.method8843(var24, true, -193629541);
                     } else {
                        var11 = var10.method13787(var24, 827988912);
                     }

                     if (var8 >= 0 && var8 < this.field1617.length && this.field1617[var8]) {
                        this.field1616.put(var8, var11);
                     }

                     var7++;
                  }
               } else {
                  int var25 = classXY.method13047(var24, -1815877627);

                  for (int var26 = 0; var26 < var25; var26++) {
                     int var28 = classXY.method13047(var24, 1175830310);
                     int var30 = var24.method13056((byte)1);
                     if (var28 >= 0 && var28 < this.field1617.length && this.field1617[var28]) {
                        this.field1616.put(var28, var30);
                     }
                  }

                  int var27 = classXY.method13047(var24, -697150764);
                  int var29 = 0;

                  while (true) {
                     if (var29 >= var27) {
                        break label191;
                     }

                     classXY.method13047(var24, 1823330756);
                     var24.method13071(-588242542);
                     var29++;
                  }
               }
            }
         } catch (Exception var22) {
            break label191;
         } finally {
            try {
               classAAR.method247(var1, (byte)1);
            } catch (Exception var21) {
            }
         }

         return;
      }

      this.field1615 = false;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   int method3541(int var1, int var2) {
      try {
         Object var3 = this.field1616.get(var1);
         if (var3 instanceof Integer) {
            if (var2 >= 2013526680) {
               throw new IllegalStateException();
            } else {
               return (Integer)var3;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;ILjava/lang/Object;)V")
   @ObfuscatedName("gu")
   public static void method3554(classDS var0, int var1, Object var2) {
      if (var0 == null) {
         var0.method3555(var1, var2);
      }

      var0.field1616.put(var1, var2);
      if (var0.field1617[var1]) {
         var0.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   void method3584() {
      classAAR var1 = this.method3575(false, (byte)-80);

      label191: {
         try {
            byte[] var2 = new byte[(int)var1.method257(-153393736)];
            int var3 = 0;

            while (var3 < var2.length) {
               int var4 = var1.method260(var2, var3, var2.length - var3, -1397369950);
               if (var4 == -1) {
                  throw new EOFException();
               }

               var3 += var4;
            }

            classXY var24 = new classXY(var2);
            if (var24.field6954.length - 103860650 * var24.field6955 < 1) {
               return;
            }

            int var5 = classXY.method13039(var24, -346779531);
            if (var5 >= 0 && var5 <= 3) {
               if (var5 >= 2) {
                  int var6 = classXY.method13047(var24, -684426503);
                  int var7 = 0;

                  while (true) {
                     if (var7 >= var6) {
                        break label191;
                     }

                     int var8 = classXY.method13047(var24, -1093264748);
                     int var9 = classXY.method13039(var24, -346779531);
                     classYY var10 = (classYY)classOF.method8404(classYY.method13782((byte)-68), var9, -1881248535);
                     Object var11;
                     if (classYY.field7114 == var10) {
                        var11 = classPD.method8843(var24, true, -193629541);
                     } else {
                        var11 = var10.method13787(var24, 827988912);
                     }

                     if (var8 >= 0 && var8 < this.field1617.length && this.field1617[var8]) {
                        this.field1616.put(var8, var11);
                     }

                     var7++;
                  }
               } else {
                  int var25 = classXY.method13047(var24, 919758609);

                  for (int var26 = 0; var26 < var25; var26++) {
                     int var28 = classXY.method13047(var24, -629484188);
                     int var30 = var24.method13056((byte)1);
                     if (var28 >= 0 && var28 < this.field1617.length && this.field1617[var28]) {
                        this.field1616.put(var28, var30);
                     }
                  }

                  int var27 = classXY.method13047(var24, -2142870949);
                  int var29 = 0;

                  while (true) {
                     if (var29 >= var27) {
                        break label191;
                     }

                     classXY.method13047(var24, -1832154991);
                     var24.method13071(748053759);
                     var29++;
                  }
               }
            }
         } catch (Exception var22) {
            break label191;
         } finally {
            try {
               classAAR.method247(var1, (byte)1);
            } catch (Exception var21) {
            }
         }

         return;
      }

      this.field1615 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method3585() {
      classAAR var1 = this.method3575(false, (byte)-24);

      label191: {
         try {
            byte[] var2 = new byte[(int)var1.method257(-153393736)];
            int var3 = 0;

            while (var3 < var2.length) {
               int var4 = var1.method260(var2, var3, var2.length - var3, -1397369950);
               if (var4 == -1) {
                  throw new EOFException();
               }

               var3 += var4;
            }

            classXY var24 = new classXY(var2);
            if (var24.field6954.length - 702114061 * var24.field6955 < 1) {
               return;
            }

            int var5 = classXY.method13039(var24, -346779531);
            if (var5 >= 0 && var5 <= 3) {
               if (var5 >= 2) {
                  int var6 = classXY.method13047(var24, -857791691);
                  int var7 = 0;

                  while (true) {
                     if (var7 >= var6) {
                        break label191;
                     }

                     int var8 = classXY.method13047(var24, 321093046);
                     int var9 = classXY.method13039(var24, -346779531);
                     classYY var10 = (classYY)classOF.method8404(classYY.method13782((byte)77), var9, 1623504784);
                     Object var11;
                     if (classYY.field7114 == var10) {
                        var11 = classPD.method8843(var24, true, -193629541);
                     } else {
                        var11 = var10.method13787(var24, 827988912);
                     }

                     if (var8 >= 0 && var8 < this.field1617.length && this.field1617[var8]) {
                        this.field1616.put(var8, var11);
                     }

                     var7++;
                  }
               } else {
                  int var25 = classXY.method13047(var24, 559891422);

                  for (int var26 = 0; var26 < var25; var26++) {
                     int var28 = classXY.method13047(var24, 755005911);
                     int var30 = var24.method13056((byte)1);
                     if (var28 >= 0 && var28 < this.field1617.length && this.field1617[var28]) {
                        this.field1616.put(var28, var30);
                     }
                  }

                  int var27 = classXY.method13047(var24, -546978296);
                  int var29 = 0;

                  while (true) {
                     if (var29 >= var27) {
                        break label191;
                     }

                     classXY.method13047(var24, -1939529292);
                     var24.method13071(-994293465);
                     var29++;
                  }
               }
            }
         } catch (Exception var22) {
            break label191;
         } finally {
            try {
               classAAR.method247(var1, (byte)1);
            } catch (Exception var21) {
            }
         }

         return;
      }

      this.field1615 = false;
   }

   classDS() {
      int var1 = classBF.field427.method11868(19, -647217945);
      this.field1616 = new HashMap();
      this.field1617 = new boolean[var1];
      this.field1614 = new int[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         classPA var3 = classXN.method12847(var2, 1704034469);
         this.field1617[var2] = var3.field5205;
         this.field1614[var2] = -1406890073 * var3.field5204;
      }

      this.method3581((byte)23);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   void method3588() {
      long var1 = classDD.method2983(16711680);
      if (-9088770474988100363L * this.field1621 < var1 - 10000L) {
         this.field1621 = 8207151046932948829L * var1;
         if (this.method3590((byte)38)) {
            this.method3577(1102848362);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("az")
   void method3538(int var1, int var2, int var3) {
      try {
         this.field1616.put(var1, var2);
         if (this.field1617[var1]) {
            if (var3 >= 684645754) {
               this.method3594(var1, var2);
               return;
            }

            this.field1615 = true;
         }

         this.method3594(var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("dp")
   static final void method3592(byte var0) {
      try {
         Iterator var1 = client.field814.iterator();

         while (var1.hasNext()) {
            if (var0 <= 0) {
               throw new IllegalStateException();
            }

            WorldView var2 = (WorldView)var1.next();

            for (classCD var3 = (classCD)var2.field1690.method7915(); var3 != null; var3 = (classCD)classNN.method7924(var2.field1690)) {
               if (var0 <= 0) {
                  throw new IllegalStateException();
               }

               if (var3.field672 * -356773341 > 0) {
                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3.field672 -= -22663797;
               }

               if (0 == var3.field672 * -356773341) {
                  if (var0 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (-1856029911 * var3.field685 >= 0) {
                     if (var0 <= 0) {
                        return;
                     }

                     int var5 = var3.field685 * -1856029911;
                     int var6 = 2060213209 * var3.field677;
                     classOM var7 = classMU.method7729(var5, 1916036814);
                     if (11 == var6) {
                        if (var0 <= 0) {
                           throw new IllegalStateException();
                        }

                        var6 = 10;
                     }

                     if (var6 >= 5) {
                        if (var0 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var6 <= 8) {
                           if (var0 <= 0) {
                              throw new IllegalStateException();
                           }

                           var6 = 4;
                        }
                     }

                     boolean var4 = classOM.method8534(var7, var6, -656313384);
                     if (!var4) {
                        if (var0 <= 0) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  classMI.method7592(
                     var2,
                     -1436432311 * var3.field679,
                     2125153617 * var3.field678,
                     var3.field676 * -1779660971,
                     -522576623 * var3.field680,
                     -1856029911 * var3.field685,
                     -1640283079 * var3.field686,
                     var3.field677 * 2060213209,
                     var3.field682 * 1072982787,
                     (byte)2
                  );
                  var3.vmethod398();
               } else {
                  if (-710753241 * var3.field673 > 0) {
                     if (var0 <= 0) {
                        throw new IllegalStateException();
                     }

                     var3.field673 -= 1512991639;
                  }

                  if (var3.field673 * -710753241 == 0) {
                     if (var0 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (-1779660971 * var3.field676 >= 1) {
                        if (var0 <= 0) {
                           return;
                        }

                        if (-522576623 * var3.field680 >= 1) {
                           if (var0 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (var3.field676 * -1779660971 <= 102) {
                              if (var0 <= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var3.field680 * -522576623 <= 102) {
                                 if (var0 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var3.field675 * 1490231037 >= 0) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    int var10 = 1490231037 * var3.field675;
                                    int var11 = 1299658649 * var3.field683;
                                    classOM var12 = classMU.method7729(var10, 1807366534);
                                    if (var11 == 11) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var11 = 10;
                                    }

                                    if (var11 >= 5) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if (var11 <= 8) {
                                          if (var0 <= 0) {
                                             return;
                                          }

                                          var11 = 4;
                                       }
                                    }

                                    boolean var9 = classOM.method8534(var12, var11, -656313384);
                                    if (!var9) {
                                       if (var0 <= 0) {
                                          throw new IllegalStateException();
                                       }
                                       continue;
                                    }
                                 }

                                 classMI.method7592(
                                    var2,
                                    -1436432311 * var3.field679,
                                    var3.field678 * 2125153617,
                                    var3.field676 * -1779660971,
                                    -522576623 * var3.field680,
                                    var3.field675 * 1490231037,
                                    var3.field684 * 332453363,
                                    var3.field683 * 1299658649,
                                    1072982787 * var3.field682,
                                    (byte)2
                                 );
                                 var3.field673 = -1512991639;
                                 if (-1856029911 * var3.field685 == 1490231037 * var3.field675 && var3.field685 * -1856029911 == -1) {
                                    if (var0 <= 0) {
                                       return;
                                    }

                                    var3.vmethod398();
                                 } else if (var3.field675 * 1490231037 == -1856029911 * var3.field685
                                    && 332453363 * var3.field684 == var3.field686 * -1640283079) {
                                    if (var0 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var3.field683 * 1299658649 == 2060213209 * var3.field677) {
                                       var3.vmethod398();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ds.dp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   static void method3545(byte var0) {
      try {
         classDI.field1519 = (short[][][])null;
         classCO.field1182 = (short[][][])null;
         classBY.field619 = (byte[][][])null;
         classDI.field1518 = (byte[][][])null;
         classDE.field1410 = (int[][][])null;
         BoundaryObject.field2250 = (byte[][][])null;
         classDI.field1517 = (int[][])null;
         classAB.field126 = null;
         classCR.field1229 = null;
         client.field1148 = null;
         GraphicsObject.field476 = null;
         classIC.field2941 = null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ds.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("as")
   String method3560(int var1, int var2) {
      try {
         Object var3 = this.field1616.get(var1);
         if (var3 instanceof String) {
            if (var2 == -682126121) {
               throw new IllegalStateException();
            } else {
               return (String)var3;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aa")
   void method3574(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field1617.length; var2++) {
            if (!this.field1617[var2]) {
               if (var1 != 126) {
                  throw new IllegalStateException();
               }

               this.field1616.remove(var2);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ds.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   void method3589(int var1) {
      try {
         long var2 = classDD.method2983(16711680);
         if (-9088770474988100363L * this.field1621 < var2 - 10000L) {
            this.field1621 = 8207151046932948829L * var2;
            if (this.method3590((byte)11)) {
               if (var1 != -1244339392) {
                  throw new IllegalStateException();
               }

               this.method3577(382679941);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ds.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;I)J")
   @ObfuscatedName("zc")
   public static long method3549(classDS var0, int var1) {
      Object var2 = var0.field1616.get(var1);
      if (var2 instanceof Integer) {
         return ((Integer)var2).intValue();
      } else {
         return var2 instanceof Long ? (Long)var2 : -1L;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("am")
   void method3555(int var1, Object var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)V")
   @ObfuscatedName("ae")
   void method3544(int var1, long var2) {
      this.field1616.put(var1, var2);
      if (this.field1617[var1]) {
         this.field1615 = true;
      }
   }
}
