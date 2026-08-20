import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ur")
public abstract class classUR implements classTY {
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("az")
   classYY field6373;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6372 = 2;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("dz")
   static IndexedSprite field6374;

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   abstract void vmethod581(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ab")
   public void method11510(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = Buffer.method13039(var1, -346779531);
            if (var3 == 0) {
               return;
            }

            classUO var4 = (classUO)classOF.method8404(classRX.method10335(-1951213695), var3, 950555050);
            if (var4 != null) {
               if (var2 != -1830946202) {
                  throw new IllegalStateException();
               }

               switch (1829787843 * var4.field6356) {
                  case 0:
                     classKI[] var5 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                     classOF.method8404(var5, Buffer.method13039(var1, -346779531), 522790870);
                     break;
                  case 1:
                     var1.method13077(37223165);
                     break;
                  case 2:
                  default:
                     throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                  case 3:
                     int var6 = Buffer.method13039(var1, -346779531);
                     this.field6373 = FriendsList.method10130(var6, 675005370);
                     if (null == this.field6373) {
                        if (var2 != -1830946202) {
                           throw new IllegalStateException();
                        }

                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                     }
               }
            } else {
               this.vmethod580(var1, var3, (byte)-66);
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ur.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("az")
   abstract void vmethod580(Buffer var1, int var2, byte var3);

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ac")
   public void method11511(Buffer var1) {
      while (true) {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 == 0) {
            return;
         }

         classUO var3 = (classUO)classOF.method8404(classRX.method10335(-1738877096), var2, -370247037);
         if (var3 != null) {
            switch (1829787843 * var3.field6356) {
               case 0:
                  classKI[] var4 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                  classOF.method8404(var4, Buffer.method13039(var1, -346779531), -1379317163);
                  break;
               case 1:
                  var1.method13077(-1736994784);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 3:
                  int var5 = Buffer.method13039(var1, -346779531);
                  this.field6373 = FriendsList.method10130(var5, 1024371840);
                  if (null == this.field6373) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod580(var1, var2, (byte)-5);
         }
      }
   }

   classUR(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ae")
   abstract void vmethod579(Buffer var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfw;I)I")
   @ObfuscatedName("ov")
   public static int method11516(classFW var0, int var1) {
      return var0.field2414[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ax")
   public void method11512(Buffer var1) {
      while (true) {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 == 0) {
            return;
         }

         classUO var3 = (classUO)classOF.method8404(classRX.method10335(-877397248), var2, 2101096005);
         if (var3 != null) {
            switch (1829787843 * var3.field6356) {
               case 0:
                  classKI[] var4 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                  classOF.method8404(var4, Buffer.method13039(var1, -346779531), 1288041846);
                  break;
               case 1:
                  var1.method13077(1621200149);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 3:
                  int var5 = Buffer.method13039(var1, -346779531);
                  this.field6373 = FriendsList.method10130(var5, 1547033116);
                  if (null == this.field6373) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod580(var1, var2, (byte)-78);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bn")
   static void method11526(byte var0) {
      try {
         if (classAB.field122.method2732((byte)41)) {
            if (var0 != 0) {
               throw new IllegalStateException();
            } else {
               classBK.method1118(0, 0, (byte)76);
            }
         } else {
            classPD.method8845("scape main", 255, (byte)32);
         }
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ur.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aa")
   public void method11513(Buffer var1) {
      while (true) {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 == 0) {
            return;
         }

         classUO var3 = (classUO)classOF.method8404(classRX.method10335(-1676692372), var2, 1964774401);
         if (var3 != null) {
            switch (-699991708 * var3.field6356) {
               case 0:
                  classKI[] var4 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                  classOF.method8404(var4, Buffer.method13039(var1, -346779531), 762853606);
                  break;
               case 1:
                  var1.method13077(-1439005862);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 3:
                  int var5 = Buffer.method13039(var1, -346779531);
                  this.field6373 = FriendsList.method10130(var5, -410694638);
                  if (null == this.field6373) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod580(var1, var2, (byte)-94);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;I)Z")
   @ObfuscatedName("up")
   public static boolean method11522(classTT var0, int var1) {
      if (var0 == null) {
         var0.method11162(var1);
      }

      return var0.method11153(var1, 120041229) && (2 == var0.field6230[var1] || var0.field6230[var1] == 3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lur;)Z")
   @ObfuscatedName("et")
   public static boolean method11518(classUR var0) {
      return var0.field6373 != null;
   }

   @ObfuscatedSignature(descriptor = "(Lur;I)Z")
   @ObfuscatedName("gc")
   public static boolean method11519(classUR var0, int var1) {
      if (var0 == null) {
         var0.method11521(var1);
      }

      try {
         return var0.field6373 != null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ur.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ao")
   public void method11514(Buffer var1) {
      while (true) {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 == 0) {
            return;
         }

         classUO var3 = (classUO)classOF.method8404(classRX.method10335(-1685482280), var2, 835197488);
         if (var3 != null) {
            switch (1829787843 * var3.field6356) {
               case 0:
                  classKI[] var4 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                  classOF.method8404(var4, Buffer.method13039(var1, -346779531), -1740964773);
                  break;
               case 1:
                  var1.method13077(-1372018119);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 3:
                  int var5 = Buffer.method13039(var1, -346779531);
                  this.field6373 = FriendsList.method10130(var5, 608112257);
                  if (null == this.field6373) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod580(var1, var2, (byte)-67);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("al")
   public void method11515(Buffer var1) {
      while (true) {
         int var2 = Buffer.method13039(var1, -346779531);
         if (var2 == 0) {
            return;
         }

         classUO var3 = (classUO)classOF.method8404(classRX.method10335(-1075593783), var2, 1129880159);
         if (var3 != null) {
            switch (1829787843 * var3.field6356) {
               case 0:
                  classKI[] var4 = new classKI[]{classKI.field3593, classKI.field3592, classKI.field3591, classKI.field3590};
                  classOF.method8404(var4, Buffer.method13039(var1, -346779531), -1195889883);
                  break;
               case 1:
                  var1.method13077(1292242393);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
               case 3:
                  int var5 = Buffer.method13039(var1, -346779531);
                  this.field6373 = FriendsList.method10130(var5, -532509648);
                  if (null == this.field6373) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod580(var1, var2, (byte)-55);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   boolean method11520() {
      return this.field6373 != null;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("as")
   Object method11523(int var1) {
      try {
         if (this.field6373 == classYY.field7111) {
            if (var1 <= 1700637583) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (this.field6373 == classYY.field7115) {
            if (var1 <= 1700637583) {
               throw new IllegalStateException();
            } else {
               return -1L;
            }
         } else if (classYY.field7113 == this.field6373) {
            if (var1 <= 1700637583) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ur.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aq")
   Object method11524() {
      if (this.field6373 == classYY.field7111) {
         return 0;
      } else if (this.field6373 == classYY.field7115) {
         return -1L;
      } else {
         return classYY.field7113 == this.field6373 ? "" : null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)I")
   @ObfuscatedName("qb")
   public static int method11525(classLH var0) {
      return var0.field4152 * 1072642345;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)Z")
   @ObfuscatedName("ox")
   public static boolean method11517(classZD var0) {
      return var0.field7158.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   boolean method11521(int var1) {
      try {
         return this.field6373 != null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ur.ag(" + ')');
      }
   }
}
