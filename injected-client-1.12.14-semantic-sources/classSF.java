import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sf")
public class classSF {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5776 = 0;
   @ObfuscatedName("ah")
   int field5765;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5775 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5771 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5772 = 0;
   @ObfuscatedName("am")
   ArrayList field5767;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field5777 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field5778 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5779 = 3;
   @ObfuscatedName("ac")
   int field5764 = -1638768129;
   @ObfuscatedName("ab")
   int field5770 = 784594585;
   @ObfuscatedName("ax")
   int field5762 = 0;
   @ObfuscatedName("ar")
   int field5768 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field5774 = 0;
   @ObfuscatedName("al")
   boolean field5766;
   @ObfuscatedSignature(descriptor = "Lsl;")
   @ObfuscatedName("af")
   AbstractFont field5780;
   @ObfuscatedName("aa")
   int field5769;
   @ObfuscatedName("ao")
   int field5763;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field5773 = 0;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   public void method10134(int var1, int var2) {
      try {
         if (var1 != this.field5769 * -545090629) {
            this.field5769 = -1918289549 * var1;
            this.method10238(-1637238194);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lsw;")
   @ObfuscatedName("av")
   public class472 method10117(int var1, byte var2) {
      try {
         return (class472)this.field5767.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsw;")
   @ObfuscatedName("at")
   class472 method10122(int var1) {
      try {
         if (this.field5767.isEmpty()) {
            if (var1 <= 1036907004) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (class472)this.field5767.get(this.field5767.size() - 1);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ag")
   public boolean method10125(byte var1) {
      try {
         return this.field5767.isEmpty();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("er")
   public int method10218() {
      return -687509261 * this.field5763;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cx")
   public void method10222(int var1) {
      if (var1 != this.field5763 * -687509261) {
         this.field5763 = -171759557 * var1;
         this.method10238(-1533655077);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cs")
   public boolean method10143(int var1, int var2) {
      if (this.field5762 * 582752245 != var1 || var2 != this.field5768 * 1523082686) {
         this.field5762 = var1 * 554200529;
         this.field5768 = 1258780162 * var2;
         this.method10238(-1749908473);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Lsf;IZI)I")
   @ObfuscatedName("nt")
   public static int method10253(classSF var0, int var1, boolean var2, int var3) {
      if (var0 == null) {
         return var0.method10258(var1, var2, var1);
      } else {
         try {
            if (var1 < var0.field5767.size()) {
               int var4 = ((class472)var0.field5767.get(var1)).field5867 * -798824383;

               for (int var5 = var1; var5 > 0; var5--) {
                  if (((class472)var0.field5767.get(var5 - 1)).field5867 * -798824383 < var4) {
                     if (var3 == -125664888) {
                        throw new IllegalStateException();
                     }

                     if (!var2) {
                        return var5;
                     }

                     var2 = false;
                     var4 = ((class472)var0.field5767.get(var5 - 1)).field5867 * -798824383;
                  }
               }
            }

            return 0;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "sf.bi(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   public void method10148(int var1, int var2) {
      try {
         if (this.field5765 * 2134183747 != var1) {
            if (var2 <= 264265653) {
               return;
            }

            this.field5765 = 1672705387 * var1;
            this.method10238(-1779912663);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cc")
   public boolean method10144(int var1, int var2) {
      if (this.field5762 * -1323016979 != var1 || var2 != this.field5768 * -1427880679) {
         this.field5762 = var1 * -581905628;
         this.field5768 = 1628051381 * var2;
         this.method10238(-1829542708);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(CIIB)Lsc;")
   @ObfuscatedName("az")
   public classSC method10161(char var1, int var2, int var3, byte var4) {
      try {
         return method10163(this, Character.toString(var1), var2, var3, -1777551423);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "sf.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ei")
   public int method10175(int var1) {
      return this.method10179(var1, var1 + 1, 2036214745);
   }

   @ObfuscatedSignature(descriptor = "(Lsf;II)I")
   @ObfuscatedName("ep")
   public static int method10242(classSF var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method10190(var1, var1);
      } else {
         try {
            int var10000;
            if (var1 < var0.field5767.size()) {
               if (var2 >= 1303894703) {
                  throw new IllegalStateException();
               }

               var10000 = var0.method10244((class472)var0.field5767.get(var1), false, (byte)8);
            } else {
               var10000 = 0;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "sf.bt(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lsc;")
   @ObfuscatedName("ai")
   classSC method10166(String var1, int var2, int var3) {
      try {
         return method10163(this, var1, this.field5767.size(), var2, 2126121373);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sf.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   void method10172(byte var1) {
      try {
         this.field5767.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ax")
   public int method10179(int var1, int var2, int var3) {
      try {
         if (var2 < var1) {
            if (var3 != 2036214745) {
               throw new IllegalStateException();
            }

            int var4 = var2;
            var2 = var1;
            var1 = var4;
         }

         this.field5767.subList(var1, var2).clear();
         int var7 = var1;
         if (this.method10128(999136528)) {
            if (var3 != 2036214745) {
               throw new IllegalStateException();
            }

            if (1 == this.field5763 * -687509261) {
               if (var3 != 2036214745) {
                  throw new IllegalStateException();
               }

               while (var7 > 0) {
                  if (var3 != 2036214745) {
                     throw new IllegalStateException();
                  }

                  char var5 = ((class472)this.field5767.get(--var7)).field5869;
                  if (var5 == ' ') {
                     break;
                  }

                  if (var3 != 2036214745) {
                     throw new IllegalStateException();
                  }

                  if (var5 == '\t') {
                     if (var3 != 2036214745) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }
         }

         this.method10241(var7, var2, -176298461);
         return var1;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "sf.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lsc;")
   @ObfuscatedName("as")
   public classSC method10168(String var1, int var2) {
      try {
         this.method10172((byte)-59);
         return this.method10166(var1, 0, 1948788126);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;IIB)I")
   @ObfuscatedName("vp")
   public static int method10182(classSF var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method10186(var1, var1, var3);
      }

      try {
         if (var0.field5780 == null) {
            if (var3 <= 14) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (var0.method10128(-338765145)) {
               if (var3 <= 14) {
                  throw new IllegalStateException();
               }

               if (var1 > var0.field5764 * -1814666751) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  return var0.field5767.size();
               }
            }

            if (!var0.field5767.isEmpty()) {
               for (int var4 = 0; var4 < var0.field5767.size(); var4++) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  class472 var5 = (class472)var0.field5767.get(var4);
                  if (var2 <= var5.field5867 * -798824383 + method10199(var0, (byte)36)) {
                     if (var3 <= 14) {
                        throw new IllegalStateException();
                     }

                     if (var2 < -798824383 * var5.field5867) {
                        break;
                     }

                     if (var1 < 1415121929 * var5.field5868) {
                        if (var3 <= 14) {
                           throw new IllegalStateException();
                        }

                        int var10000;
                        if (var4 > 0) {
                           if (var3 <= 14) {
                              throw new IllegalStateException();
                           }

                           var10000 = var4 - 1;
                        } else {
                           var10000 = 0;
                        }

                        return var10000;
                     }

                     if (1 + var4 != var0.field5767.size() && ((class472)var0.field5767.get(1 + var4)).field5867 * -798824383 != var5.field5867 * -798824383) {
                        int var6 = var0.method10244((class472)var0.field5767.get(var4), false, (byte)8);
                        if (var1 < var5.field5868 * 1415121929 + var6) {
                           return var4;
                        }

                        if (var2 <= var5.field5867 * -798824383 + method10199(var0, (byte)-56)) {
                           if (var3 <= 14) {
                              throw new IllegalStateException();
                           }

                           return var4 + 1;
                        }
                     }
                  }
               }

               class472 var8 = (class472)var0.field5767.get(var0.field5767.size() - 1);
               if (var1 >= 1415121929 * var8.field5868) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var8.field5868 * 1415121929 + var0.method10202((short)255)) {
                     if (var3 <= 14) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= -798824383 * var8.field5867 && var2 <= var8.field5867 * -798824383 + method10199(var0, (byte)15)) {
                        if (var3 <= 14) {
                           throw new IllegalStateException();
                        }

                        return var0.field5767.size() - 1;
                     }
                  }
               }
            }

            return var0.field5767.size();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "sf.ar(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Lsl;)V")
   @ObfuscatedName("ca")
   public static void method10139(classSF var0, AbstractFont var1) {
      if (var1 != var0.field5780) {
         var0.field5780 = var1;
         if (null != var0.field5780) {
            if (var0.field5765 * -404509598 == 0) {
               var0.field5765 = 1718323069 * var0.field5780.ascent;
            }

            if (!var0.method10125((byte)-14)) {
               var0.method10238(-1981287319);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public int method10191(int var1) {
      try {
         if (!this.field5767.isEmpty()) {
            if (var1 != -434302836) {
               throw new IllegalStateException();
            }

            if (this.method10201(-1464496245) == 1) {
               if (var1 != -434302836) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.field5767.isEmpty()) {
                  if (var1 != -434302836) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = ((class472)this.field5767.get(this.field5767.size() - 1)).field5868 * 1415121929 + this.method10202((short)255);
               }

               return var10000;
            }
         }

         int var2 = -1;
         int var3 = 0;

         for (int var4 = this.field5767.size() - 1; var4 >= 0; var4--) {
            if (var1 != -434302836) {
               throw new IllegalStateException();
            }

            class472 var5 = (class472)this.field5767.get(var4);
            if (var2 != -798824383 * var5.field5867) {
               if (var1 != -434302836) {
                  throw new IllegalStateException();
               }

               int var6 = this.method10244(var5, false, (byte)8) + var5.field5868 * 1415121929;
               var3 = Math.max(var6, var3);
               var2 = -798824383 * var5.field5867;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "sf.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;S)V")
   @ObfuscatedName("aw")
   public void method10140(AbstractFont var1, short var2) {
      try {
         if (var1 != this.field5780) {
            if (var2 == 5000) {
               return;
            }

            this.field5780 = var1;
            if (null != this.field5780) {
               if (var2 == 5000) {
                  throw new IllegalStateException();
               }

               if (this.field5765 * 2134183747 == 0) {
                  if (var2 == 5000) {
                     return;
                  }

                  this.field5765 = 1672705387 * this.field5780.ascent;
               }

               if (!this.method10125((byte)120)) {
                  if (var2 == 5000) {
                     throw new IllegalStateException();
                  }

                  this.method10238(-1987237432);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ex")
   public int method10201(int var1) {
      try {
         return method10196(this, (byte)46) / this.field5780.ascent;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;B)Ljava/lang/String;")
   @ObfuscatedName("oc")
   public static String method10131(classSF var0, byte var1) {
      if (var0 == null) {
         return var0.method10133(var1);
      } else {
         try {
            if (var0.method10125((byte)69)) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return "";
               }
            } else {
               StringBuilder var2 = new StringBuilder(var0.method10130(-948723151));

               for (int var3 = 0; var3 < var0.method10130(-1517823465); var3++) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  class472 var4 = var0.method10117(var3, (byte)105);
                  var2.append(var4.field5869);
               }

               return var2.toString();
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "sf.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("aa")
   int method10202(short var1) {
      try {
         int var10000;
         if (this.method10125((byte)11)) {
            if (var1 != 255) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.method10244((class472)this.field5767.get(this.field5767.size() - 1), false, (byte)8);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("aq")
   public int method10204(short var1) {
      try {
         return this.field5764 * -1814666751;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.aq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Ljava/lang/String;II)Lsc;")
   @ObfuscatedName("lg")
   public static classSC method10162(classSF var0, String var1, int var2, int var3) {
      if (var0 == null) {
         var0.method10175(var2);
      }

      if (0 == var3) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (var0.field5767.size() >= var3) {
         var0.method10241(var2, var2, -176298461);
         return new classSC(var2, true);
      } else {
         var0.field5767.ensureCapacity(var0.field5767.size() + var1.length());

         for (int var5 = 0; var5 < var1.length() && var0.field5767.size() < var3; var5++) {
            class472 var6 = new class472();
            var6.field5869 = var1.charAt(var5);
            var0.field5767.add(var4, var6);
            var4++;
         }

         var0.method10241(var2, var4, -176298461);
         if (1837761111 * var0.field5770 != 0 && var0.method10201(-2021424809) > var0.field5770 * 1837761111) {
            while (var2 != var4) {
               method10178(var0, --var4, (byte)21);
               if (var0.method10201(-2039531416) <= var0.field5770 * 1837761111) {
                  break;
               }
            }

            return new classSC(var4, true);
         } else {
            return new classSC(var4, false);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("be")
   public void method10208(int var1, int var2) {
      try {
         if (this.field5780 != null) {
            if (var2 == 2135760821) {
               throw new IllegalStateException();
            }

            if (var1 < this.field5780.ascent * 2) {
               if (var2 == 2135760821) {
                  throw new IllegalStateException();
               }

               var1 = Integer.MAX_VALUE;
            }
         }

         if (var1 != -1814666751 * this.field5764) {
            this.field5764 = var1 * -508715519;
            this.method10238(-1731259049);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("df")
   public int method10210(int var1) {
      try {
         return this.field5770 * 1837761111;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bg")
   public void method10215(int var1, int var2) {
      try {
         if (this.field5770 * 1837761111 != var1) {
            if (var2 >= 1670136287) {
               return;
            }

            this.field5770 = var1 * 1362889063;
            this.method10238(-2118976305);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bv")
   public String method10132() {
      if (this.method10125((byte)-45)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method10130(-1638627110));

         for (int var2 = 0; var2 < this.method10130(716491882); var2++) {
            class472 var3 = this.method10117(var2, (byte)112);
            var1.append(var3.field5869);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method10225(int var1) {
      try {
         return this.field5769 * -545090629;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.bk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   public int method10211() {
      return this.field5770 * 1837761111;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bj")
   public int method10234(int var1, int var2) {
      try {
         switch (this.field5768 * -1427880679) {
            case 0:
               return 0;
            case 1:
               return var1 / 2;
            case 2:
               return var1;
            default:
               return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ec")
   public int method10212() {
      return this.field5770 * 1071350782;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("bc")
   public static int method10192(classSF var0) {
      if (!var0.field5767.isEmpty() && var0.method10201(-2015155841) == 1) {
         return var0.field5767.isEmpty() ? 0 : ((class472)var0.field5767.get(var0.field5767.size() - 1)).field5868 * 1415121929 + var0.method10202((short)255);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = var0.field5767.size() - 1; var3 >= 0; var3--) {
            class472 var4 = (class472)var0.field5767.get(var3);
            if (var1 != -798824383 * var4.field5867) {
               int var5 = var0.method10244(var4, false, (byte)8) + var4.field5868 * 1415121929;
               var2 = Math.max(var5, var2);
               var1 = -798824383 * var4.field5867;
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bp")
   void method10241(int var1, int var2, int var3) {
      try {
         if (!this.method10125((byte)-21)) {
            if (var3 != -176298461) {
               throw new IllegalStateException();
            }

            if (this.field5780 != null) {
               classVP var4;
               boolean var10000;
               label246: {
                  var4 = this.method10250(var1, var2, 1573774560);
                  if ((Integer)var4.field6227 == 0) {
                     if (var3 != -176298461) {
                        throw new IllegalStateException();
                     }

                     if ((Integer)var4.field6228 == this.field5767.size()) {
                        if (var3 != -176298461) {
                           throw new IllegalStateException();
                        }

                        var10000 = 1;
                        break label246;
                     }
                  }

                  var10000 = 0;
               }

               boolean var5 = (boolean)var10000;
               int var6 = (Integer)var4.field6227;
               int var7 = 0;
               if (var5) {
                  if (var3 != -176298461) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = ((class472)this.field5767.get((Integer)var4.field6227)).field5867 * -798824383;
               }

               int var8 = var10000;
               int var9 = 0;

               for (int var10 = (Integer)var4.field6227; var10 <= (Integer)var4.field6228; var10++) {
                  if (var3 != -176298461) {
                     throw new IllegalStateException();
                  }

                  boolean var31;
                  if (var10 >= this.field5767.size()) {
                     if (var3 != -176298461) {
                        throw new IllegalStateException();
                     }

                     var31 = true;
                  } else {
                     var31 = false;
                  }

                  boolean var11;
                  int var13;
                  label234: {
                     var11 = var31;
                     class472 var12 = (class472)this.field5767.get(!var11 ? var10 : this.field5767.size() - 1);
                     var13 = !var11 ? this.method10244(var12, false, (byte)8) : 0;
                     if (!var11) {
                        if (var3 != -176298461) {
                           return;
                        }

                        if ('\n' == var12.field5869) {
                           var31 = true;
                           break label234;
                        }
                     }

                     var31 = false;
                  }

                  boolean var14;
                  label228: {
                     var14 = var31;
                     if (!var11) {
                        if (var3 != -176298461) {
                           throw new IllegalStateException();
                        }

                        if (this.method10128(-1222919509)) {
                           if (var3 != -176298461) {
                              throw new IllegalStateException();
                           }

                           if (var7 + var13 > -1814666751 * this.field5764) {
                              if (var3 != -176298461) {
                                 throw new IllegalStateException();
                              }

                              var31 = true;
                              break label228;
                           }
                        }
                     }

                     var31 = false;
                  }

                  label258: {
                     boolean var15 = var31;
                     if (!var14) {
                        if (var3 != -176298461) {
                           throw new IllegalStateException();
                        }

                        if (!var15) {
                           if (var3 != -176298461) {
                              return;
                           }

                           if (!var11) {
                              break label258;
                           }

                           if (var3 != -176298461) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     int var16 = var10;
                     int var17 = 0;
                     if (var15) {
                        if (var3 != -176298461) {
                           return;
                        }

                        int var18 = 0;
                        label215:
                        if (1 == this.field5763 * -687509261) {
                           int var19 = var10;

                           while (true) {
                              if (var19 <= var6) {
                                 break label215;
                              }

                              if (var3 != -176298461) {
                                 throw new IllegalStateException();
                              }

                              class472 var20 = (class472)this.field5767.get(var19);
                              int var10001;
                              if (var19 < var16) {
                                 if (var3 != -176298461) {
                                    return;
                                 }

                                 var10001 = this.method10244(var20, false, (byte)8);
                              } else {
                                 var10001 = 0;
                              }

                              var18 += var10001;
                              if (' ' == var20.field5869) {
                                 break;
                              }

                              if ('\n' == var20.field5869) {
                                 if (var3 != -176298461) {
                                    return;
                                 }
                                 break;
                              }

                              var19--;
                           }

                           var16 = var19;
                           var7 -= var18;
                           var17 = var18;
                        }
                     }

                     int var27 = -method10231(this, var7, (byte)-124);

                     for (int var28 = var6; var28 < var16; var28++) {
                        if (var3 != -176298461) {
                           throw new IllegalStateException();
                        }

                        class472 var29 = (class472)this.field5767.get(var28);
                        int var21 = this.method10244(var29, false, (byte)8);
                        var29.field5868 = -1828568519 * var27;
                        var29.field5867 = var8 * -657643583;
                        var27 += var21;
                     }

                     var6 = var16;
                     var7 = var17;
                     var8 += method10199(this, (byte)-11);
                     var9++;
                  }

                  int var34;
                  if (!var11) {
                     if (var3 != -176298461) {
                        throw new IllegalStateException();
                     }

                     var34 = var13;
                  } else {
                     var34 = 0;
                  }

                  var7 += var34;
               }

               if (0 != -1427880679 * this.field5768) {
                  if (var3 != -176298461) {
                     throw new IllegalStateException();
                  }

                  if (var5) {
                     if (var3 != -176298461) {
                        throw new IllegalStateException();
                     }

                     int var23 = var9 * method10199(this, (byte)-7);
                     int var24 = this.method10234(var23, -488480403);

                     for (int var25 = 0; var25 < this.field5767.size(); var25++) {
                        if (var3 != -176298461) {
                           throw new IllegalStateException();
                        }

                        class472 var26 = (class472)this.field5767.get(var25);
                        var26.field5867 -= var24 * -657643583;
                     }
                  }
               }

               return;
            }
         }
      } catch (RuntimeException var22) {
         throw RestClientThreadFactory.newRunException(var22, "sf.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   void method10173() {
      this.field5767.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lsw;ZB)I")
   @ObfuscatedName("bu")
   int method10244(class472 var1, boolean var2, byte var3) {
      try {
         if (var1.field5869 == '\n') {
            if (var3 != 8) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (!var2) {
               if (0 != this.field5769 * -545090629) {
                  return this.field5780.advances[42];
               }

               if (var3 != 8) {
                  throw new IllegalStateException();
               }
            }

            int var4 = this.field5780.advances[var1.field5869];
            if (0 == var4) {
               if (var3 != 8) {
                  throw new IllegalStateException();
               } else if (var1.field5869 == '\t') {
                  if (var3 != 8) {
                     throw new IllegalStateException();
                  } else {
                     return 3 * this.field5780.advances[32];
                  }
               } else {
                  return this.field5780.advances[32];
               }
            } else {
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "sf.bu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;B)I")
   @ObfuscatedName("aw")
   public static int method10199(classSF var0, byte var1) {
      if (var0 == null) {
         return var0.method10200(var1);
      } else {
         try {
            return var0.field5765 * 2134183747;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "sf.am(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dz")
   public int method10187(int var1, int var2) {
      if (null != this.field5780 && !this.method10125((byte)-14) && var1 <= this.field5767.size()) {
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else {
            var3 = -1;
            var2 = -var2;
         }

         int var4 = 0;
         int var5 = 0;
         if (var1 > 0) {
            class472 var6 = (class472)this.field5767.get(var1 - 1);
            var4 = 1415121929 * var6.field5868 + method10242(this, var1 - 1, 823655151);
            var5 = var6.field5867 * -798824383;
         } else if (-1 == var3 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = 1 == var3 ? this.field5767.size() + 1 : 0;

         for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
            class472 var12 = (class472)this.field5767.get(var11 - 1);
            if (var5 != var12.field5867 * -798824383) {
               var7++;
               var5 = var12.field5867 * -798824383;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var2 == var7) {
               int var13 = Math.abs(var12.field5868 * 1415121929 + method10242(this, var11 - 1, 469086983) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field5767.size();
         } else {
            if (var5 != 0) {
               var7++;
            }

            return 16777215 != var9 && (var2 != var7 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZB)I")
   @ObfuscatedName("by")
   int method10260(int var1, boolean var2, byte var3) {
      try {
         if (var1 < this.field5767.size()) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            }

            int var4 = ((class472)this.field5767.get(var1)).field5867 * -798824383;

            for (int var5 = var1; var5 < this.field5767.size() - 1; var5++) {
               if (var3 >= 4) {
                  throw new IllegalStateException();
               }

               if (((class472)this.field5767.get(1 + var5)).field5867 * -798824383 > var4) {
                  if (var3 >= 4) {
                     throw new IllegalStateException();
                  }

                  if (!var2) {
                     if (var3 >= 4) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((class472)this.field5767.get(var5 + 1)).field5867 * -798824383;
               }
            }
         }

         return this.field5767.size();
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "sf.by(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bk")
   public int method10219(int var1) {
      try {
         return -687509261 * this.field5763;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.bs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   boolean method10128(int var1) {
      try {
         boolean var10000;
         if (1837761111 * this.field5770 > 1) {
            if (var1 >= 1003053665) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsw;")
   @ObfuscatedName("bn")
   public class472 method10118(int var1) {
      return (class472)this.field5767.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lsw;")
   @ObfuscatedName("bd")
   public class472 method10119(int var1) {
      return (class472)this.field5767.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Lsl;)V")
   @ObfuscatedName("dq")
   public static void method10141(classSF var0, AbstractFont var1) {
      if (var1 != var0.field5780) {
         var0.field5780 = var1;
         if (null != var0.field5780) {
            if (var0.field5765 * 1111269525 == 0) {
               var0.field5765 = 1672705387 * var0.field5780.ascent;
            }

            if (!var0.method10125((byte)-39)) {
               var0.method10238(-1637769197);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lsw;")
   @ObfuscatedName("br")
   class472 method10123() {
      return this.field5767.isEmpty() ? null : (class472)this.field5767.get(this.field5767.size() - 1);
   }

   @ObfuscatedSignature(descriptor = "(Lsf;III)Lsi;")
   @ObfuscatedName("im")
   public static classSI method10155(classSF var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method10159(var1, var1, var1);
      } else {
         try {
            if (var2 == var1) {
               return new classSI(var0, 0, 0);
            } else {
               if (var1 <= var0.field5767.size()) {
                  if (var3 >= -1644257037) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= var0.field5767.size()) {
                     if (var2 < var1) {
                        if (var3 >= -1644257037) {
                           throw new IllegalStateException();
                        }

                        return new classSI(var0, var2, var1);
                     }

                     return new classSI(var0, var1, var2);
                  }

                  if (var3 >= -1644257037) {
                     throw new IllegalStateException();
                  }
               }

               return new classSI(var0, 0, 0);
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "sf.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lsw;")
   @ObfuscatedName("bh")
   class472 method10124() {
      return this.field5767.isEmpty() ? null : (class472)this.field5767.get(this.field5767.size() - 1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   public boolean method10126() {
      return this.field5767.isEmpty();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;IZ)I")
   @ObfuscatedName("kb")
   public static int method10261(classSF var0, int var1, boolean var2) {
      if (var1 < var0.field5767.size()) {
         int var3 = ((class472)var0.field5767.get(var1)).field5867 * -798824383;

         for (int var4 = var1; var4 < var0.field5767.size() - 1; var4++) {
            if (((class472)var0.field5767.get(1 + var4)).field5867 * -2063955775 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)var0.field5767.get(var4 + 1)).field5867 * -769807825;
            }
         }
      }

      return var0.field5767.size();
   }

   @ObfuscatedSignature(descriptor = "(Lsf;III)Z")
   @ObfuscatedName("qz")
   public static boolean method10145(classSF var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method10147(var1, var1, var1);
      }

      try {
         if (var0.field5762 * 2087280121 == var1) {
            if (var3 <= -1381956417) {
               throw new IllegalStateException();
            }

            if (var2 == var0.field5768 * -1427880679) {
               return true;
            }

            if (var3 <= -1381956417) {
               throw new IllegalStateException();
            }
         }

         var0.field5762 = var1 * -1783442359;
         var0.field5768 = -564181207 * var2;
         var0.method10238(-2021103931);
         return true;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sf.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   public boolean method10127() {
      return this.field5767.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   boolean method10129() {
      return 1837761111 * this.field5770 > 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   void method10238(int var1) {
      try {
         this.method10241(0, this.field5767.size(), -176298461);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cp")
   public void method10135(int var1) {
      if (var1 != this.field5769 * -545090629) {
         this.field5769 = -1918289549 * var1;
         this.method10238(-2077761069);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("em")
   public void method10149(int var1) {
      if (this.field5765 * 2134183747 != var1) {
         this.field5765 = 1672705387 * var1;
         this.method10238(-1500178925);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cg")
   public void method10136(int var1) {
      if (var1 != this.field5769 * -545090629) {
         this.field5769 = -1918289549 * var1;
         this.method10238(-1762017828);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("db")
   public int method10183(int var1, int var2) {
      if (this.field5780 == null) {
         return 0;
      } else if (this.method10128(-1505310966) && var1 > this.field5764 * -1814666751) {
         return this.field5767.size();
      } else {
         if (!this.field5767.isEmpty()) {
            for (int var3 = 0; var3 < this.field5767.size(); var3++) {
               class472 var4 = (class472)this.field5767.get(var3);
               if (var2 <= var4.field5867 * -494443278 + method10199(this, (byte)-73)) {
                  if (var2 < -287677946 * var4.field5867) {
                     break;
                  }

                  if (var1 < 1415121929 * var4.field5868) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (1 + var3 != this.field5767.size() && ((class472)this.field5767.get(1 + var3)).field5867 * -798824383 != var4.field5867 * 1726077938) {
                     int var5 = this.method10244((class472)this.field5767.get(var3), false, (byte)8);
                     if (var1 < var4.field5868 * 1415121929 + var5) {
                        return var3;
                     }

                     if (var2 <= var4.field5867 * 1593206567 + method10199(this, (byte)-2)) {
                        return var3 + 1;
                     }
                  }
               }
            }

            class472 var6 = (class472)this.field5767.get(this.field5767.size() - 1);
            if (var1 >= 1604117255 * var6.field5868
               && var1 <= var6.field5868 * 1415121929 + this.method10202((short)255)
               && var2 >= -798824383 * var6.field5867
               && var2 <= var6.field5867 * -798824383 + method10199(this, (byte)-58)) {
               return this.field5767.size() - 1;
            }
         }

         return this.field5767.size();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lsc;")
   @ObfuscatedName("ca")
   public classSC method10169(String var1) {
      this.method10172((byte)38);
      return this.method10166(var1, 0, 1975108159);
   }

   @ObfuscatedSignature(descriptor = "(Lsf;Ljava/lang/String;III)Lsc;")
   @ObfuscatedName("qk")
   public static classSC method10163(classSF var0, String var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method10165(var1, var2, var2, var2);
      }

      try {
         if (0 == var3) {
            if (var4 == 495536545) {
               throw new IllegalStateException();
            }

            var3 = Integer.MAX_VALUE;
         }

         int var5 = var2;
         if (var0.field5767.size() >= var3) {
            if (var4 == 495536545) {
               throw new IllegalStateException();
            } else {
               var0.method10241(var2, var2, -176298461);
               return new classSC(var2, true);
            }
         } else {
            var0.field5767.ensureCapacity(var0.field5767.size() + var1.length());

            for (int var6 = 0; var6 < var1.length(); var6++) {
               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               if (var0.field5767.size() >= var3) {
                  break;
               }

               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               class472 var7 = new class472();
               var7.field5869 = var1.charAt(var6);
               var0.field5767.add(var5, var7);
               var5++;
            }

            var0.method10241(var2, var5, -176298461);
            if (1837761111 * var0.field5770 != 0) {
               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               if (var0.method10201(-1983718143) > var0.field5770 * 1837761111) {
                  if (var4 == 495536545) {
                     throw new IllegalStateException();
                  }

                  do {
                     if (var2 == var5) {
                        if (var4 == 495536545) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     method10178(var0, --var5, (byte)21);
                  } while (var0.method10201(-1592853768) > var0.field5770 * 1837761111);

                  return new classSC(var5, true);
               }
            }

            return new classSC(var5, false);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "sf.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;)V")
   @ObfuscatedName("ck")
   public void method10142(AbstractFont var1) {
      if (var1 != this.field5780) {
         this.field5780 = var1;
         if (null != this.field5780) {
            if (this.field5765 * 2134183747 == 0) {
               this.field5765 = 1672705387 * this.field5780.ascent;
            }

            if (!this.method10125((byte)43)) {
               this.method10238(-2113323565);
            }
         }
      }
   }

   public classSF() {
      this.field5765 = 0;
      this.field5766 = true;
      this.field5767 = new ArrayList();
      this.field5763 = 0;
      this.field5769 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fn")
   int method10254(int var1, boolean var2) {
      if (var1 < this.field5767.size()) {
         int var3 = ((class472)this.field5767.get(var1)).field5867 * -798824383;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((class472)this.field5767.get(var4 - 1)).field5867 * -798824383 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)this.field5767.get(var4 - 1)).field5867 * -798824383;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dk")
   public void method10137(int var1) {
      if (var1 != this.field5769 * -545090629) {
         this.field5769 = -1918289549 * var1;
         this.method10238(-2107617775);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   public void method10150(int var1) {
      if (this.field5765 * 2134183747 != var1) {
         this.field5765 = 1672705387 * var1;
         this.method10238(-1655496652);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cd")
   public void method10151(int var1) {
      if (this.field5765 * 2134183747 != var1) {
         this.field5765 = 1672705387 * var1;
         this.method10238(-2128044416);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;B)I")
   @ObfuscatedName("cm")
   public static int method10196(classSF var0, byte var1) {
      if (var0 == null) {
         return var0.method10198(var1);
      } else {
         try {
            int var10000;
            if (var0.method10125((byte)-21)) {
               if (var1 != 46) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = var0.field5780.ascent + ((class472)var0.field5767.get(var0.field5767.size() - 1)).field5867 * -798824383;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "sf.af(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("et")
   public int method10229(int var1) {
      switch (2087280121 * this.field5762) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Lsw;Z)I")
   @ObfuscatedName("bs")
   public static int method10245(classSF var0, class472 var1, boolean var2) {
      if (var0 == null) {
         var0.method10173();
      }

      if (var1.field5869 == '\n') {
         return 0;
      } else if (!var2 && 0 != var0.field5769 * -1807211146) {
         return var0.field5780.advances[42];
      } else {
         int var3 = var0.field5780.advances[var1.field5869];
         if (0 == var3) {
            return var1.field5869 == 9 ? 3 * var0.field5780.advances[-384084760] : var0.field5780.advances[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("co")
   public void method10152(int var1) {
      if (this.field5765 * 2134183747 != var1) {
         this.field5765 = 1672705387 * var1;
         this.method10238(-1834128513);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsi;")
   @ObfuscatedName("cz")
   public classSI method10156(int var1, int var2) {
      if (var2 == var1) {
         return new classSI(this, 0, 0);
      } else if (var1 > this.field5767.size() || var2 > this.field5767.size()) {
         return new classSI(this, 0, 0);
      } else {
         return var2 < var1 ? new classSI(this, var2, var1) : new classSI(this, var1, var2);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;I)I")
   @ObfuscatedName("ce")
   public static int method10176(classSF var0, int var1) {
      if (var0 == null) {
         var0.method10228(var1);
      }

      return var0.method10179(var1, var1 + 1, 2036214745);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Lsw;Z)I")
   @ObfuscatedName("xb")
   public static int method10246(classSF var0, class472 var1, boolean var2) {
      if (var0 == null) {
         return var0.method10205();
      } else if (var1.field5869 == '\n') {
         return 0;
      } else if (!var2 && 0 != var0.field5769 * -545090629) {
         return var0.field5780.advances[42];
      } else {
         int var3 = var0.field5780.advances[var1.field5869];
         if (0 == var3) {
            return var1.field5869 == 9 ? 3 * var0.field5780.advances[32] : var0.field5780.advances[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ch")
   public void method10138(int var1) {
      if (var1 != this.field5769 * -545090629) {
         this.field5769 = -1918289549 * var1;
         this.method10238(-1701813026);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;I)I")
   @ObfuscatedName("ys")
   public static int method10243(classSF var0, int var1) {
      return var1 < var0.field5767.size() ? var0.method10244((class472)var0.field5767.get(var1), false, (byte)8) : 0;
   }

   @ObfuscatedSignature(descriptor = "(II)Lsi;")
   @ObfuscatedName("cf")
   public classSI method10157(int var1, int var2) {
      if (var2 == var1) {
         return new classSI(this, 0, 0);
      } else if (var1 > this.field5767.size() || var2 > this.field5767.size()) {
         return new classSI(this, 0, 0);
      } else {
         return var2 < var1 ? new classSI(this, var2, var1) : new classSI(this, var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("es")
   public void method10216(int var1) {
      if (this.field5770 * 1837761111 != var1) {
         this.field5770 = var1 * 1362889063;
         this.method10238(-1433033410);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lsc;")
   @ObfuscatedName("cw")
   classSC method10167(String var1, int var2) {
      return method10163(this, var1, this.field5767.size(), var2, 830734784);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lsc;")
   @ObfuscatedName("cr")
   public classSC method10170(String var1) {
      this.method10172((byte)-36);
      return this.method10166(var1, 0, 2129448970);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lsc;")
   @ObfuscatedName("cj")
   public classSC method10171(String var1) {
      this.method10172((byte)-1);
      return this.method10166(var1, 0, 2113460092);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eu")
   public int method10235(int var1) {
      switch (this.field5768 * 378524103) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dw")
   public int method10236(int var1) {
      switch (this.field5768 * -1427880679) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public int method10177(int var1) {
      return this.method10179(var1, var1 + 1, 2036214745);
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fg")
   int method10262(int var1, boolean var2) {
      if (var1 < this.field5767.size()) {
         int var3 = ((class472)this.field5767.get(var1)).field5867 * 1073504777;

         for (int var4 = var1; var4 < this.field5767.size() - 1; var4++) {
            if (((class472)this.field5767.get(1 + var4)).field5867 * -810452256 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)this.field5767.get(var4 + 1)).field5867 * 1535301846;
            }
         }
      }

      return this.field5767.size();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dy")
   public int method10180(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field5767.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method10128(-97919594) && 1 == this.field5763 * 874852657) {
         while (var5 > 0) {
            char var4 = ((class472)this.field5767.get(--var5)).field5869;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.method10241(var5, var2, -176298461);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dh")
   public int method10184(int var1, int var2) {
      if (this.field5780 == null) {
         return 0;
      } else if (this.method10128(-2065189272) && var1 > this.field5764 * -1814666751) {
         return this.field5767.size();
      } else {
         if (!this.field5767.isEmpty()) {
            for (int var3 = 0; var3 < this.field5767.size(); var3++) {
               class472 var4 = (class472)this.field5767.get(var3);
               if (var2 <= var4.field5867 * -798824383 + method10199(this, (byte)-42)) {
                  if (var2 < -798824383 * var4.field5867) {
                     break;
                  }

                  if (var1 < 1415121929 * var4.field5868) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (1 + var3 != this.field5767.size() && ((class472)this.field5767.get(1 + var3)).field5867 * -798824383 != var4.field5867 * -798824383) {
                     int var5 = this.method10244((class472)this.field5767.get(var3), false, (byte)8);
                     if (var1 < var4.field5868 * 1415121929 + var5) {
                        return var3;
                     }

                     if (var2 <= var4.field5867 * -798824383 + method10199(this, (byte)40)) {
                        return var3 + 1;
                     }
                  }
               }
            }

            class472 var6 = (class472)this.field5767.get(this.field5767.size() - 1);
            if (var1 >= 1415121929 * var6.field5868
               && var1 <= var6.field5868 * 1415121929 + this.method10202((short)255)
               && var2 >= -798824383 * var6.field5867
               && var2 <= var6.field5867 * -798824383 + method10199(this, (byte)3)) {
               return this.field5767.size() - 1;
            }
         }

         return this.field5767.size();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   public int method10130(int var1) {
      try {
         return this.field5767.size();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   public int method10193() {
      if (!this.field5767.isEmpty() && this.method10201(-1682849847) == 1) {
         return this.field5767.isEmpty() ? 0 : ((class472)this.field5767.get(this.field5767.size() - 1)).field5868 * 1415121929 + this.method10202((short)255);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = this.field5767.size() - 1; var3 >= 0; var3--) {
            class472 var4 = (class472)this.field5767.get(var3);
            if (var1 != -798824383 * var4.field5867) {
               int var5 = this.method10244(var4, false, (byte)8) + var4.field5868 * 1415121929;
               var2 = Math.max(var5, var2);
               var1 = -798824383 * var4.field5867;
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dx")
   public int method10197() {
      return this.method10125((byte)-16) ? 0 : this.field5780.ascent + ((class472)this.field5767.get(this.field5767.size() - 1)).field5867 * 1184913752;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   int method10203() {
      return this.method10125((byte)8) ? 0 : this.method10244((class472)this.field5767.get(this.field5767.size() - 1), false, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("de")
   public int method10205() {
      return this.field5764 * -1814666751;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("do")
   public int method10206() {
      return this.field5764 * -1877869388;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cu")
   public void method10209(int var1) {
      if (this.field5780 != null && var1 < this.field5780.ascent * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != -1814666751 * this.field5764) {
         this.field5764 = var1 * 739085863;
         this.method10238(-1685250647);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dn")
   public int method10213() {
      return this.field5770 * -562788590;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bz")
   public void method10223(int var1, int var2) {
      try {
         if (var1 != this.field5763 * -687509261) {
            if (var2 <= 1210470196) {
               return;
            }

            this.field5763 = -171759557 * var1;
            this.method10238(-1370251690);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ee")
   public int method10214() {
      return this.field5770 * 1837761111;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dc")
   public int method10181(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field5767.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method10128(-1136024256) && 1 == this.field5763 * 787340732) {
         while (var5 > 0) {
            char var4 = ((class472)this.field5767.get(--var5)).field5869;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.method10241(var5, var2, -176298461);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ct")
   public void method10217(int var1) {
      if (this.field5770 * 1837761111 != var1) {
         this.field5770 = var1 * -1247676517;
         this.method10238(-2134392136);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;IZ)I")
   @ObfuscatedName("gr")
   public static int method10255(classSF var0, int var1, boolean var2) {
      if (var0 == null) {
         return var0.method10259(var1, var2);
      } else {
         if (var1 < var0.field5767.size()) {
            int var3 = ((class472)var0.field5767.get(var1)).field5867 * -798824383;

            for (int var4 = var1; var4 > 0; var4--) {
               if (((class472)var0.field5767.get(var4 - 1)).field5867 * -798824383 < var3) {
                  if (!var2) {
                     return var4;
                  }

                  var2 = false;
                  var3 = ((class472)var0.field5767.get(var4 - 1)).field5867 * -798824383;
               }
            }
         }

         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   void method10174() {
      this.field5767.clear();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ek")
   public int method10220() {
      return -687509261 * this.field5763;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ef")
   public int method10221() {
      return -687509261 * this.field5763;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eq")
   public void method10224(int var1) {
      if (var1 != this.field5763 * -687509261) {
         this.field5763 = -1163901579 * var1;
         this.method10238(-1610309785);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsf;IB)I")
   @ObfuscatedName("ex")
   public static int method10178(classSF var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method10232(var1, var2);
      }

      try {
         return var0.method10179(var1, var1 + 1, 2036214745);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ay")
   public static int method10160(int var0, int var1, int var2, int var3) {
      try {
         if (var1 < var0) {
            if (var3 != -19618711) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
            }
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sf.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eg")
   public int method10226() {
      return this.field5769 * -545090629;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("el")
   public int method10227() {
      return this.field5769 * -545090629;
   }

   @ObfuscatedSignature(descriptor = "(Lsf;IIB)I")
   @ObfuscatedName("gg")
   public static int method10188(classSF var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         return var0.method10189(var1, var1, var3);
      } else {
         try {
            if (null != var0.field5780 && !var0.method10125((byte)33)) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               if (var1 <= var0.field5767.size()) {
                  byte var4;
                  if (var2 > 0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var4 = 1;
                  } else {
                     var4 = -1;
                     var2 = -var2;
                  }

                  int var5 = 0;
                  int var6 = 0;
                  if (var1 > 0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     class472 var7 = (class472)var0.field5767.get(var1 - 1);
                     var5 = 1415121929 * var7.field5868 + method10242(var0, var1 - 1, -597883185);
                     var6 = var7.field5867 * -798824383;
                  } else if (-1 == var4) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var1 == 0) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        return 0;
                     }
                  }

                  int var16 = 16777215;
                  int var8 = 0;
                  int var9 = var1;
                  int var10 = 16777215;
                  int var11 = 1 == var4 ? var0.field5767.size() + 1 : 0;

                  for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     class472 var13 = (class472)var0.field5767.get(var12 - 1);
                     if (var6 != var13.field5867 * -798824383) {
                        var8++;
                        var6 = var13.field5867 * -798824383;
                        if (var8 > var2) {
                           if (var3 != 0) {
                              throw new IllegalStateException();
                           }

                           return var9;
                        }
                     }

                     if (var2 == var8) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        int var14 = Math.abs(var13.field5868 * 1415121929 + method10242(var0, var12 - 1, -100761406) - var5);
                        if (var14 >= var10) {
                           return var9;
                        }

                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        var9 = var12;
                        var10 = var14;
                     }
                  }

                  if (var4 == 1) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     return var0.field5767.size();
                  }

                  if (var6 != 0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var8++;
                  }

                  if (16777215 != var10) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var2 != var8 || var5 >= var10) {
                        return var9;
                     }

                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }
                  }

                  return 0;
               }

               if (var3 != 0) {
                  throw new IllegalStateException();
               }
            }

            return 0;
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "sf.ah(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lvp;")
   @ObfuscatedName("ba")
   classVP method10250(int var1, int var2, int var3) {
      try {
         int var4 = Math.min(var1, var2);
         int var5 = Math.max(var1, var2);
         int var6 = this.field5767.size();
         if (var4 == 0) {
            if (var3 <= -333065084) {
               throw new IllegalStateException();
            }

            if (var5 == var6) {
               if (var3 <= -333065084) {
                  throw new IllegalStateException();
               }

               return new classVP(0, var6);
            }
         }

         int var7 = method10253(this, var4, false, -1415235818);
         int var8 = this.method10260(var5, false, (byte)-73);
         switch (-1427880679 * this.field5768) {
            case 0:
               if (0 == this.field5762 * 2087280121) {
                  if (var3 <= -333065084) {
                     throw new IllegalStateException();
                  }

                  return new classVP(var7, var6);
               }

               int var11 = method10253(this, var4, true, 520237725);
               return new classVP(var11, var6);
            case 1:
               return new classVP(0, var6);
            case 2:
               if (this.field5762 * 2087280121 == 2) {
                  if (var3 <= -333065084) {
                     throw new IllegalStateException();
                  }

                  return new classVP(0, var8);
               }

               int var9 = this.method10260(var5, true, (byte)-122);
               return new classVP(0, var9);
            default:
               return new classVP(0, var6);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "sf.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dv")
   public int method10230(int var1) {
      switch (1590360428 * this.field5762) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("da")
   public int method10194() {
      if (!this.field5767.isEmpty() && this.method10201(-1675728319) == 1) {
         return this.field5767.isEmpty() ? 0 : ((class472)this.field5767.get(this.field5767.size() - 1)).field5868 * 1415121929 + this.method10202((short)255);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = this.field5767.size() - 1; var3 >= 0; var3--) {
            class472 var4 = (class472)this.field5767.get(var3);
            if (var1 != -798824383 * var4.field5867) {
               int var5 = this.method10244(var4, false, (byte)8) + var4.field5868 * 1415121929;
               var2 = Math.max(var5, var2);
               var1 = -798824383 * var4.field5867;
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bs")
   public int method10237(int var1) {
      switch (this.field5768 * -1427880679) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ey")
   void method10239() {
      this.method10241(0, this.field5767.size(), -176298461);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   void method10240() {
      this.method10241(0, this.field5767.size(), -176298461);
   }

   @ObfuscatedSignature(descriptor = "(II)Lvp;")
   @ObfuscatedName("fp")
   classVP method10251(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field5767.size();
      if (var3 == 0 && var4 == var5) {
         return new classVP(0, var5);
      } else {
         int var6 = method10253(this, var3, false, -328097537);
         int var7 = this.method10260(var4, false, (byte)-117);
         switch (2081449521 * this.field5768) {
            case 0:
               if (0 == this.field5762 * 2087280121) {
                  return new classVP(var6, var5);
               }

               int var9 = method10253(this, var3, true, 2131512779);
               return new classVP(var9, var5);
            case 1:
               return new classVP(0, var5);
            case 2:
               if (this.field5762 * -2090044087 == 2) {
                  return new classVP(0, var7);
               }

               int var8 = this.method10260(var4, true, (byte)-49);
               return new classVP(0, var8);
            default:
               return new classVP(0, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsw;Z)I")
   @ObfuscatedName("eb")
   int method10247(class472 var1, boolean var2) {
      if (var1.field5869 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field5769 * 987824186) {
         return this.field5780.advances[42];
      } else {
         int var3 = this.field5780.advances[var1.field5869];
         if (0 == var3) {
            return var1.field5869 == 9 ? 3 * this.field5780.advances[605110088] : this.field5780.advances[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsw;Z)I")
   @ObfuscatedName("ff")
   int method10248(class472 var1, boolean var2) {
      if (var1.field5869 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field5769 * 1023203322) {
         return this.field5780.advances[-1745369335];
      } else {
         int var3 = this.field5780.advances[var1.field5869];
         if (0 == var3) {
            return var1.field5869 == 9 ? 3 * this.field5780.advances[32] : this.field5780.advances[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lsc;")
   @ObfuscatedName("cq")
   public classSC method10164(String var1, int var2, int var3) {
      if (0 == var3) {
         var3 = 1266112089;
      }

      int var4 = var2;
      if (this.field5767.size() >= var3) {
         this.method10241(var2, var2, -176298461);
         return new classSC(var2, true);
      } else {
         this.field5767.ensureCapacity(this.field5767.size() + var1.length());

         for (int var5 = 0; var5 < var1.length() && this.field5767.size() < var3; var5++) {
            class472 var6 = new class472();
            var6.field5869 = var1.charAt(var5);
            this.field5767.add(var4, var6);
            var4++;
         }

         this.method10241(var2, var4, -176298461);
         if (-457352096 * this.field5770 != 0 && this.method10201(-1909680460) > this.field5770 * 2044820531) {
            while (var2 != var4) {
               method10178(this, --var4, (byte)21);
               if (this.method10201(-1642113210) <= this.field5770 * 1837761111) {
                  break;
               }
            }

            return new classSC(var4, true);
         } else {
            return new classSC(var4, false);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lvp;")
   @ObfuscatedName("fb")
   classVP method10252(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field5767.size();
      if (var3 == 0 && var4 == var5) {
         return new classVP(0, var5);
      } else {
         int var6 = method10253(this, var3, false, -404284407);
         int var7 = this.method10260(var4, false, (byte)-106);
         switch (-1427880679 * this.field5768) {
            case 0:
               if (0 == this.field5762 * 2087280121) {
                  return new classVP(var6, var5);
               }

               int var9 = method10253(this, var3, true, -1698880106);
               return new classVP(var9, var5);
            case 1:
               return new classVP(0, var5);
            case 2:
               if (this.field5762 * 2087280121 == 2) {
                  return new classVP(0, var7);
               }

               int var8 = this.method10260(var4, true, (byte)-45);
               return new classVP(0, var8);
            default:
               return new classVP(0, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fl")
   int method10256(int var1, boolean var2) {
      if (var1 < this.field5767.size()) {
         int var3 = ((class472)this.field5767.get(var1)).field5867 * -798824383;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((class472)this.field5767.get(var4 - 1)).field5867 * -798824383 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)this.field5767.get(var4 - 1)).field5867 * -798824383;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(Lsf;IB)I")
   @ObfuscatedName("eu")
   public static int method10231(classSF var0, int var1, byte var2) {
      if (var0 == null) {
         return var0.method10233(var1, var2);
      } else {
         try {
            switch (2087280121 * var0.field5762) {
               case 0:
                  return 0;
               case 1:
                  return var1 / 2;
               case 2:
                  return var1;
               default:
                  return 0;
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "sf.bb(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fh")
   int method10257(int var1, boolean var2) {
      if (var1 < this.field5767.size()) {
         int var3 = ((class472)this.field5767.get(var1)).field5867 * -798824383;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((class472)this.field5767.get(var4 - 1)).field5867 * -798824383 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)this.field5767.get(var4 - 1)).field5867 * 885207572;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(II)Lsi;")
   @ObfuscatedName("ci")
   public classSI method10158(int var1, int var2) {
      if (var2 == var1) {
         return new classSI(this, 0, 0);
      } else if (var1 > this.field5767.size() || var2 > this.field5767.size()) {
         return new classSI(this, 0, 0);
      } else {
         return var2 < var1 ? new classSI(this, var2, var1) : new classSI(this, var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsw;")
   @ObfuscatedName("bw")
   public class472 method10120(int var1) {
      return (class472)this.field5767.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;II)I")
   @ObfuscatedName("rc")
   public static int method10185(classSF var0, int var1, int var2) {
      if (var0.field5780 == null) {
         return 0;
      } else if (var0.method10128(-1579901543) && var1 > var0.field5764 * -1814666751) {
         return var0.field5767.size();
      } else {
         if (!var0.field5767.isEmpty()) {
            for (int var3 = 0; var3 < var0.field5767.size(); var3++) {
               class472 var4 = (class472)var0.field5767.get(var3);
               if (var2 <= var4.field5867 * -798824383 + method10199(var0, (byte)8)) {
                  if (var2 < -798824383 * var4.field5867) {
                     break;
                  }

                  if (var1 < 1415121929 * var4.field5868) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (1 + var3 != var0.field5767.size() && ((class472)var0.field5767.get(1 + var3)).field5867 * -798824383 != var4.field5867 * -798824383) {
                     int var5 = var0.method10244((class472)var0.field5767.get(var3), false, (byte)8);
                     if (var1 < var4.field5868 * 1415121929 + var5) {
                        return var3;
                     }

                     if (var2 <= var4.field5867 * -798824383 + method10199(var0, (byte)-32)) {
                        return var3 + 1;
                     }
                  }
               }
            }

            class472 var6 = (class472)var0.field5767.get(var0.field5767.size() - 1);
            if (var1 >= 1415121929 * var6.field5868
               && var1 <= var6.field5868 * 1415121929 + var0.method10202((short)255)
               && var2 >= -798824383 * var6.field5867
               && var2 <= var6.field5867 * -798824383 + method10199(var0, (byte)-14)) {
               return var0.field5767.size() - 1;
            }
         }

         return var0.field5767.size();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;I)V")
   @ObfuscatedName("ad")
   static final void method10264(WorldView var0, int var1) {
      try {
         int var2 = 2010544793 * var0.sizeX;
         int var3 = 1823353167 * var0.sizeY;
         int[][][] var4 = var0.tileHeights;
         byte[][][] var5 = var0.tileSettings;
         Scene var6 = var0.scene;
         CollisionMap[] var7 = var0.collisionMaps;

         for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if (var1 != -1588902870) {
                  throw new IllegalStateException();
               }

               for (int var10 = 0; var10 < var3; var10++) {
                  if (var1 != -1588902870) {
                     throw new IllegalStateException();
                  }

                  if ((var0.tileSettings[var8][var9][var10] & 1) == 1) {
                     if (var1 != -1588902870) {
                        return;
                     }

                     int var11 = var8;
                     if (2 == (var0.tileSettings[1][var9][var10] & 2)) {
                        var11 = var8 - 1;
                     }

                     if (var11 >= 0) {
                        if (var1 != -1588902870) {
                           throw new IllegalStateException();
                        }

                        if (null != var7) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           var7[var11].setBlockedByFloor(var9, var10, (byte)-113);
                        }
                     }
                  }
               }
            }
         }

         Tiles.rndHue = Tiles.rndHue + ((int)(Math.random() * 5.0) - 2) * 392617369;
         if (1001072297 * Tiles.rndHue < -8) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            Tiles.rndHue = 1154028344;
         }

         if (Tiles.rndHue * 1001072297 > 8) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            Tiles.rndHue = -1154028344;
         }

         Tiles.rndLightness = Tiles.rndLightness + ((int)(Math.random() * 5.0) - 2) * -1098612701;
         if (Tiles.rndLightness * -1076351093 < -16) {
            if (var1 != -1588902870) {
               return;
            }

            Tiles.rndLightness = 397934032;
         }

         if (Tiles.rndLightness * -1076351093 > 16) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            Tiles.rndLightness = -397934032;
         }

         for (int var50 = 0; var50 < 4; var50++) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            byte[][] var52 = Tiles.Tiles_underlays2[var50];
            byte var54 = 96;
            short var55 = 768;
            byte var12 = -50;
            byte var13 = -10;
            byte var14 = -50;
            int var15 = (int)Math.sqrt(5100.0);
            int var16 = var15 * 768 >> 8;

            for (int var17 = 1; var17 < var3 - 1; var17++) {
               if (var1 != -1588902870) {
                  throw new IllegalStateException();
               }

               for (int var18 = 1; var18 < var2 - 1; var18++) {
                  if (var1 != -1588902870) {
                     throw new IllegalStateException();
                  }

                  int var19 = var4[var50][var18 + 1][var17] - var4[var50][var18 - 1][var17];
                  int var20 = var4[var50][var18][var17 + 1] - var4[var50][var18][var17 - 1];
                  int var21 = (int)Math.sqrt(var19 * var19 + 65536 + var20 * var20);
                  int var22 = (var19 << 8) / var21;
                  int var23 = 65536 / var21;
                  int var24 = (var20 << 8) / var21;
                  int var25 = (-50 * var24 + var22 * -50 + -10 * var23) / var16 + 96;
                  int var26 = (var52[1 + var18][var17] >> 3)
                     + (var52[var18 - 1][var17] >> 2)
                     + (var52[var18][var17 - 1] >> 2)
                     + (var52[var18][1 + var17] >> 3)
                     + (var52[var18][var17] >> 1);
                  MouseRecorder.field1086[var18][var17] = var25 - var26;
               }
            }

            for (int var56 = 0; var56 < var3; var56++) {
               WorldMapSectionType.Tiles_hue[var56] = 0;
               class565.Tiles_saturation[var56] = 0;
               class67.Tiles_lightness[var56] = 0;
               class161.Tiles_hueMultiplier[var56] = 0;
               class154.field1761[var56] = 0;
            }

            for (int var57 = -5; var57 < var2 + 5; var57++) {
               for (int var59 = 0; var59 < var3; var59++) {
                  if (var1 != -1588902870) {
                     return;
                  }

                  int var62 = var57 + 5;
                  if (var62 >= 0) {
                     if (var1 != -1588902870) {
                        throw new IllegalStateException();
                     }

                     if (var62 < var2) {
                        if (var1 != -1588902870) {
                           return;
                        }

                        int var64 = (int)InvDefinition.method4227(15, (byte)0);
                        int var67 = class33.Tiles_underlays[var50][var62][var59] & var64;
                        if (var67 > 0) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           int var73 = var67 - 1;
                           FloorUnderlayDefinition var77 = (FloorUnderlayDefinition)class402.method8806(
                              FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var73
                           );
                           FloorUnderlayDefinition var70;
                           if (var77 != null) {
                              var70 = var77;
                           } else {
                              byte[] var81 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var73, 1830445036);
                              var77 = new FloorUnderlayDefinition();
                              if (null != var81) {
                                 FloorUnderlayDefinition.method4504(var77, new Buffer(var81), var73, -320814010);
                              }

                              var77.postDecode(-1181210910);
                              FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var77, var73);
                              var70 = var77;
                           }

                           WorldMapSectionType.Tiles_hue[var59] = WorldMapSectionType.Tiles_hue[var59] + 124413169 * var70.hue;
                           class565.Tiles_saturation[var59] = class565.Tiles_saturation[var59] + -1731148931 * var70.saturation;
                           class67.Tiles_lightness[var59] = class67.Tiles_lightness[var59] + var70.lightness * -1928632847;
                           class161.Tiles_hueMultiplier[var59] = class161.Tiles_hueMultiplier[var59] + var70.hueMultiplier * -1636648267;
                           class154.field1761[var59]++;
                        }
                     }
                  }

                  int var65 = var57 - 5;
                  if (var65 >= 0) {
                     if (var1 != -1588902870) {
                        return;
                     }

                     if (var65 < var2) {
                        if (var1 != -1588902870) {
                           return;
                        }

                        int var68 = (int)InvDefinition.method4227(15, (byte)0);
                        int var71 = class33.Tiles_underlays[var50][var65][var59] & var68;
                        if (var71 > 0) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           int var79 = var71 - 1;
                           FloorUnderlayDefinition var82 = (FloorUnderlayDefinition)class402.method8806(
                              FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var79
                           );
                           FloorUnderlayDefinition var74;
                           if (var82 != null) {
                              var74 = var82;
                           } else {
                              byte[] var85 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var79, 250818596);
                              var82 = new FloorUnderlayDefinition();
                              if (var85 != null) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 FloorUnderlayDefinition.method4504(var82, new Buffer(var85), var79, 1271853910);
                              }

                              var82.postDecode(-1400271626);
                              FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var82, var79);
                              var74 = var82;
                           }

                           WorldMapSectionType.Tiles_hue[var59] = WorldMapSectionType.Tiles_hue[var59] - 124413169 * var74.hue;
                           class565.Tiles_saturation[var59] = class565.Tiles_saturation[var59] - var74.saturation * -1731148931;
                           class67.Tiles_lightness[var59] = class67.Tiles_lightness[var59] - -1928632847 * var74.lightness;
                           class161.Tiles_hueMultiplier[var59] = class161.Tiles_hueMultiplier[var59] - -1636648267 * var74.hueMultiplier;
                           class154.field1761[var59]--;
                        }
                     }
                  }
               }

               if (var57 >= 1) {
                  if (var1 != -1588902870) {
                     throw new IllegalStateException();
                  }

                  if (var57 < var2 - 1) {
                     if (var1 != -1588902870) {
                        return;
                     }

                     int var60 = 0;
                     int var63 = 0;
                     int var66 = 0;
                     int var69 = 0;
                     int var72 = 0;

                     for (int var75 = -5; var75 < var3 + 5; var75++) {
                        if (var1 != -1588902870) {
                           return;
                        }

                        int var80 = 5 + var75;
                        if (var80 >= 0 && var80 < var3) {
                           if (var1 != -1588902870) {
                              return;
                           }

                           var60 += WorldMapSectionType.Tiles_hue[var80];
                           var63 += class565.Tiles_saturation[var80];
                           var66 += class67.Tiles_lightness[var80];
                           var69 += class161.Tiles_hueMultiplier[var80];
                           var72 += class154.field1761[var80];
                        }

                        int var84 = var75 - 5;
                        if (var84 >= 0 && var84 < var3) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           var60 -= WorldMapSectionType.Tiles_hue[var84];
                           var63 -= class565.Tiles_saturation[var84];
                           var66 -= class67.Tiles_lightness[var84];
                           var69 -= class161.Tiles_hueMultiplier[var84];
                           var72 -= class154.field1761[var84];
                        }

                        if (var75 >= 1 && var75 < var3 - 1) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           if (client.isLowDetail) {
                              if (var1 != -1588902870) {
                                 return;
                              }

                              if ((var5[0][var57][var75] & 2) == 0) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 if ((var5[var50][var57][var75] & 16) != 0) {
                                    if (var1 != -1588902870) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }
                           }

                           if (var50 < Tiles.Tiles_minPlane * -957711027) {
                              Tiles.Tiles_minPlane = var50 * 84476805;
                           }

                           int var86 = (int)InvDefinition.method4227(15, (byte)0);
                           int var27 = class33.Tiles_underlays[var50][var57][var75] & var86;
                           int var28 = class623.Tiles_overlays[var50][var57][var75] & var86;
                           if (var27 <= 0) {
                              if (var1 != -1588902870) {
                                 return;
                              }

                              if (var28 <= 0) {
                                 continue;
                              }

                              if (var1 != -1588902870) {
                                 throw new IllegalStateException();
                              }
                           }

                           int var29 = var4[var50][var57][var75];
                           int var30 = var4[var50][var57 + 1][var75];
                           int var31 = var4[var50][var57 + 1][1 + var75];
                           int var32 = var4[var50][var57][var75 + 1];
                           int var33 = MouseRecorder.field1086[var57][var75];
                           int var34 = MouseRecorder.field1086[var57 + 1][var75];
                           int var35 = MouseRecorder.field1086[var57 + 1][1 + var75];
                           int var36 = MouseRecorder.field1086[var57][1 + var75];
                           int var37 = -1;
                           int var38 = -1;
                           if (var27 > 0) {
                              if (var1 != -1588902870) {
                                 throw new IllegalStateException();
                              }

                              int var39 = var60 * 256 / var69;
                              int var40 = var63 / var72;
                              int var41 = var66 / var72;
                              var37 = class39.method649(var39, var40, var41, 1128984967);
                              var39 = 1001072297 * Tiles.rndHue + var39 & 0xFF;
                              var41 += -1076351093 * Tiles.rndLightness;
                              if (var41 < 0) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 var41 = 0;
                              } else if (var41 > 255) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 var41 = 255;
                              }

                              var38 = class39.method649(var39, var40, var41, 1128984967);
                           }

                           if (var50 > 0) {
                              boolean var88 = true;
                              if (var27 == 0) {
                                 if (var1 != -1588902870) {
                                    return;
                                 }

                                 if (0 != class200.Tiles_shapes[var50][var57][var75]) {
                                    if (var1 != -1588902870) {
                                       throw new IllegalStateException();
                                    }

                                    var88 = false;
                                 }
                              }

                              if (var28 > 0 && !class189.method4809(var28 - 1, 1974749890).hideUnderlay) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 var88 = false;
                              }

                              if (var88) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 if (var29 == var30 && var31 == var29 && var29 == var32) {
                                    if (var1 != -1588902870) {
                                       return;
                                    }

                                    class148.field1911[var50][var57][var75] = class148.field1911[var50][var57][var75] | 2340;
                                 }
                              }
                           }

                           int var89 = 0;
                           if (-1 != var38) {
                              if (var1 != -1588902870) {
                                 throw new IllegalStateException();
                              }

                              var89 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method1371(var38, 96, (byte)-105)];
                           }

                           if (var28 == 0) {
                              if (var1 != -1588902870) {
                                 throw new IllegalStateException();
                              }

                              var6.addTile(
                                 var50,
                                 var57,
                                 var75,
                                 0,
                                 0,
                                 -1,
                                 var29,
                                 var30,
                                 var31,
                                 var32,
                                 class57.method1371(var37, var33, (byte)-25),
                                 class57.method1371(var37, var34, (byte)-68),
                                 class57.method1371(var37, var35, (byte)-102),
                                 class57.method1371(var37, var36, (byte)-57),
                                 0,
                                 0,
                                 0,
                                 0,
                                 var89,
                                 0
                              );
                           } else {
                              int var90 = class200.Tiles_shapes[var50][var57][var75] + 1;
                              byte var92 = HttpRequest.field83[var50][var57][var75];
                              FloorOverlayDefinition var42 = class189.method4809(var28 - 1, 2124702850);
                              int var43 = var42.texture * 892155017;
                              int var44;
                              int var45;
                              if (var43 >= 0) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 var45 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var43, 55834647);
                                 var44 = -1;
                              } else if (16711935 == 50022547 * var42.primaryRgb) {
                                 if (var1 != -1588902870) {
                                    return;
                                 }

                                 var44 = -2;
                                 var43 = -1;
                                 var45 = -2;
                              } else {
                                 var44 = class39.method649(-1914711119 * var42.hue, -1834712605 * var42.saturation, 1894985397 * var42.lightness, 1128984967);
                                 int var46 = -1914711119 * var42.hue + Tiles.rndHue * 1001072297 & 0xFF;
                                 int var47 = -1076351093 * Tiles.rndLightness + var42.lightness * 1894985397;
                                 if (var47 < 0) {
                                    if (var1 != -1588902870) {
                                       throw new IllegalStateException();
                                    }

                                    var47 = 0;
                                 } else if (var47 > 255) {
                                    if (var1 != -1588902870) {
                                       throw new IllegalStateException();
                                    }

                                    var47 = 255;
                                 }

                                 var45 = class39.method649(var46, var42.saturation * -1834712605, var47, 1128984967);
                              }

                              int var94 = 0;
                              if (var45 != -2) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 var94 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var45, 96, -1350956682)];
                              }

                              if (var42.secondaryRgb * 705541053 != -1) {
                                 if (var1 != -1588902870) {
                                    throw new IllegalStateException();
                                 }

                                 int var95 = Tiles.rndHue * 1001072297 + var42.secondaryHue * -347808971 & 0xFF;
                                 int var48 = -1076351093 * Tiles.rndLightness + var42.secondaryLightness * 2020271701;
                                 if (var48 < 0) {
                                    var48 = 0;
                                 } else if (var48 > 255) {
                                    var48 = 255;
                                 }

                                 var45 = class39.method649(var95, -796039805 * var42.secondarySaturation, var48, 1128984967);
                                 var94 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var45, 96, -1882887803)];
                              }

                              var6.addTile(
                                 var50,
                                 var57,
                                 var75,
                                 var90,
                                 var92,
                                 var43,
                                 var29,
                                 var30,
                                 var31,
                                 var32,
                                 class57.method1371(var37, var33, (byte)-22),
                                 class57.method1371(var37, var34, (byte)-127),
                                 class57.method1371(var37, var35, (byte)-68),
                                 class57.method1371(var37, var36, (byte)-44),
                                 class212.method5134(var44, var33, -781966641),
                                 class212.method5134(var44, var34, 1205277881),
                                 class212.method5134(var44, var35, -1618505861),
                                 class212.method5134(var44, var36, 1680050112),
                                 var89,
                                 var94
                              );
                           }
                        }
                     }
                  }
               }
            }

            for (int var58 = 1; var58 < var3 - 1; var58++) {
               if (var1 != -1588902870) {
                  throw new IllegalStateException();
               }

               for (int var61 = 1; var61 < var2 - 1; var61++) {
                  if (var1 != -1588902870) {
                     throw new IllegalStateException();
                  }

                  int var76;
                  if (0 != (var0.tileSettings[var50][var61][var58] & 8)) {
                     var76 = 0;
                  } else {
                     label616: {
                        if (var50 > 0) {
                           if (var1 != -1588902870) {
                              throw new IllegalStateException();
                           }

                           if ((var0.tileSettings[1][var61][var58] & 2) != 0) {
                              if (var1 != -1588902870) {
                                 throw new IllegalStateException();
                              }

                              var76 = var50 - 1;
                              break label616;
                           }
                        }

                        var76 = var50;
                     }
                  }

                  var6.method5706(var50, var61, var58, var76);
               }
            }

            class33.Tiles_underlays[var50] = (short[][])null;
            class623.Tiles_overlays[var50] = (short[][])null;
            class200.Tiles_shapes[var50] = (byte[][])null;
            HttpRequest.field83[var50] = (byte[][])null;
            Tiles.Tiles_underlays2[var50] = (byte[][])null;
         }

         Scene.method5718(var6, -50, -10, -50);

         for (int var51 = 0; var51 < var2; var51++) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            for (int var53 = 0; var53 < var3; var53++) {
               if (var1 != -1588902870) {
                  return;
               }

               if ((var5[1][var51][var53] & 2) == 2) {
                  if (var1 != -1588902870) {
                     throw new IllegalStateException();
                  }

                  Scene.method5722(var6, var51, var53);
               }
            }
         }

         if (WorldView.method3060(var0, (byte)0)) {
            if (var1 != -1588902870) {
               throw new IllegalStateException();
            }

            HttpResponse.method143(var0, (byte)1);
         }
      } catch (RuntimeException var49) {
         throw RestClientThreadFactory.newRunException(var49, "sf.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method10133(byte var1) {
      try {
         if (this.method10125((byte)69)) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            StringBuilder var2 = new StringBuilder(this.method10219(-948723151));

            for (int var3 = 0; var3 < this.method10191(-1517823465); var3++) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               class472 var4 = this.method10117(var3, (byte)105);
               var2.append(var4.field5869);
            }

            return var2.toString();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "sf.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;)I")
   @ObfuscatedName("wg")
   public static int method10263(SequenceDefinition var0) {
      if (var0 == null) {
         return var0.getDuration();
      } else {
         return var0.isCachedModelIdSet((byte)-52) ? HitSplatDefinition.method4993(var0.SequenceDefinition_cachedModelId * -326405849, 1402352388) : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ab")
   public int method10232(int var1, byte var2) {
      try {
         switch (2087280121 * this.field5762) {
            case 0:
               return 0;
            case 1:
               return var1 / 2;
            case 2:
               return var1;
            default:
               return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.bb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ar")
   public int method10189(int var1, int var2, byte var3) {
      try {
         if (null != this.field5780 && !this.method10125((byte)33)) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            if (var1 <= this.field5767.size()) {
               byte var4;
               if (var2 > 0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var4 = 1;
               } else {
                  var4 = -1;
                  var2 = -var2;
               }

               int var5 = 0;
               int var6 = 0;
               if (var1 > 0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  class472 var7 = (class472)this.field5767.get(var1 - 1);
                  var5 = 1415121929 * var7.field5868 + method10242(this, var1 - 1, -597883185);
                  var6 = var7.field5867 * -798824383;
               } else if (-1 == var4) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var1 == 0) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     return 0;
                  }
               }

               int var16 = 16777215;
               int var8 = 0;
               int var9 = var1;
               int var10 = 16777215;
               int var11 = 1 == var4 ? this.field5767.size() + 1 : 0;

               for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  class472 var13 = (class472)this.field5767.get(var12 - 1);
                  if (var6 != var13.field5868 * -798824383) {
                     var8++;
                     var6 = var13.field5868 * -798824383;
                     if (var8 > var2) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        return var9;
                     }
                  }

                  if (var2 == var8) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     int var14 = Math.abs(var13.field5867 * 1415121929 + method10242(this, var12 - 1, -100761406) - var5);
                     if (var14 >= var10) {
                        return var9;
                     }

                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var9 = var12;
                     var10 = var14;
                  }
               }

               if (var4 == 1) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  return this.field5767.size();
               }

               if (var6 != 0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var8++;
               }

               if (16777215 != var10) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var2 != var8 || var5 >= var10) {
                     return var9;
                  }

                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }
               }

               return 0;
            }

            if (var3 != 0) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "sf.ah(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;I)V")
   @ObfuscatedName("zv")
   public static void method10153(classSF var0, int var1) {
      if (var0 == null) {
         var0.method10154(var1);
      } else {
         if (var0.field5765 * 2134183747 != var1) {
            var0.field5765 = 1672705387 * var1;
            var0.method10238(-1374543307);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   public int method10198(byte var1) {
      try {
         int var10000;
         if (this.method10125((byte)-21)) {
            if (var1 != 46) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.field5780.ascent + ((class472)this.field5767.get(this.field5767.size() - 1)).field5868 * -798824383;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bt")
   int method10190(int var1, int var2) {
      if (null != this.field5780 && !this.method10125((byte)-14) && var1 <= this.field5767.size()) {
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else {
            var3 = -1;
            var2 = -var2;
         }

         int var4 = 0;
         int var5 = 0;
         if (var1 > 0) {
            class472 var6 = (class472)this.field5767.get(var1 - 1);
            var4 = 1415121929 * var6.field5868 + method10242(this, var1 - 1, 823655151);
            var5 = var6.field5867 * -798824383;
         } else if (-1 == var3 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = 1 == var3 ? this.field5767.size() + 1 : 0;

         for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
            class472 var12 = (class472)this.field5767.get(var11 - 1);
            if (var5 != var12.field5867 * -798824383) {
               var7++;
               var5 = var12.field5868 * -798824383;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var2 == var7) {
               int var13 = Math.abs(var12.field5867 * 1415121929 + method10242(this, var11 - 1, 469086983) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field5767.size();
         } else {
            if (var5 != 0) {
               var7++;
            }

            return 16777215 != var9 && (var2 != var7 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)I")
   @ObfuscatedName("bi")
   int method10258(int var1, boolean var2, int var3) {
      try {
         if (var1 < this.field5767.size()) {
            int var4 = ((class472)this.field5767.get(var1)).field5867 * -798824383;

            for (int var5 = var1; var5 > 0; var5--) {
               if (((class472)this.field5767.get(var5 - 1)).field5868 * -798824383 < var4) {
                  if (var3 == -125664888) {
                     throw new IllegalStateException();
                  }

                  if (!var2) {
                     return var5;
                  }

                  var2 = false;
                  var4 = ((class472)this.field5767.get(var5 - 1)).field5867 * -798824383;
               }
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "sf.bi(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("am")
   public int method10200(byte var1) {
      try {
         return this.field5768 * 2134183747;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fs")
   int method10259(int var1, boolean var2) {
      if (var1 < this.field5767.size()) {
         int var3 = ((class472)this.field5767.get(var1)).field5868 * -798824383;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((class472)this.field5767.get(var4 - 1)).field5868 * -798824383 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((class472)this.field5767.get(var4 - 1)).field5867 * -798824383;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bb")
   public int method10233(int var1, byte var2) {
      try {
         switch (2087280121 * this.field5764) {
            case 0:
               return 0;
            case 1:
               return var1 / 2;
            case 2:
               return var1;
            default:
               return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sf.bb(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("uq")
   public static int method10207(classSF var0) {
      return var0.field5764 * -1814666751;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("tr")
   public static int method10195(classSF var0) {
      if (!var0.field5767.isEmpty() && var0.method10201(-2052288961) == 1) {
         return var0.field5767.isEmpty() ? 0 : ((class472)var0.field5767.get(var0.field5767.size() - 1)).field5868 * 1415121929 + var0.method10202((short)255);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = var0.field5767.size() - 1; var3 >= 0; var3--) {
            class472 var4 = (class472)var0.field5767.get(var3);
            if (var1 != -798824383 * var4.field5867) {
               int var5 = var0.method10244(var4, false, (byte)8) + var4.field5868 * 1415121929;
               var2 = Math.max(var5, var2);
               var1 = -798824383 * var4.field5867;
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ep")
   public int method10228(int var1) {
      try {
         return this.field5769 * -545090629;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sf.bk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lsi;")
   @ObfuscatedName("au")
   public classSI method10159(int var1, int var2, int var3) {
      try {
         if (var2 == var1) {
            return new classSI(this, 0, 0);
         } else {
            if (var1 <= this.field5767.size()) {
               if (var3 >= -1644257037) {
                  throw new IllegalStateException();
               }

               if (var2 <= this.field5767.size()) {
                  if (var2 < var1) {
                     if (var3 >= -1644257037) {
                        throw new IllegalStateException();
                     }

                     return new classSI(this, var2, var1);
                  }

                  return new classSI(this, var1, var2);
               }

               if (var3 >= -1644257037) {
                  throw new IllegalStateException();
               }
            }

            return new classSI(this, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sf.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;II)Z")
   @ObfuscatedName("jt")
   public static boolean method10146(classSF var0, int var1, int var2) {
      if (var0.field5762 * 2087280121 != var1 || var2 != var0.field5768 * -1427880679) {
         var0.field5762 = var1 * -1783442359;
         var0.field5768 = -564181207 * var2;
         var0.method10238(-1660241977);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ap")
   public boolean method10147(int var1, int var2, int var3) {
      try {
         if (this.field5764 * 2087280121 == var1) {
            if (var3 <= -1381956417) {
               throw new IllegalStateException();
            }

            if (var2 == this.field5768 * -1427880679) {
               return true;
            }

            if (var3 <= -1381956417) {
               throw new IllegalStateException();
            }
         }

         this.field5769 = var1 * -1783442359;
         this.field5770 = -564181207 * var2;
         this.method10238(-2021103931);
         return true;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sf.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;Lsw;Z)I")
   @ObfuscatedName("dj")
   public static int method10249(classSF var0, class472 var1, boolean var2) {
      if (var0 == null) {
         var0.method10127();
      }

      if (var1.field5869 == '\n') {
         return 0;
      } else if (!var2 && 0 != var0.field5769 * -545090629) {
         return var0.field5780.advances[42];
      } else {
         int var3 = var0.field5780.advances[var1.field5869];
         if (0 == var3) {
            return var1.field5869 == 9 ? 3 * var0.field5780.advances[32] : var0.field5780.advances[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ah")
   public int method10186(int var1, int var2, byte var3) {
      try {
         if (this.field5780 == null) {
            if (var3 <= 14) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.method10128(-338765145)) {
               if (var3 <= 14) {
                  throw new IllegalStateException();
               }

               if (var1 > this.field5769 * -1814666751) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  return this.field5767.size();
               }
            }

            if (!this.field5767.isEmpty()) {
               for (int var4 = 0; var4 < this.field5767.size(); var4++) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  class472 var5 = (class472)this.field5767.get(var4);
                  if (var2 <= var5.field5867 * -798824383 + method10199(this, (byte)36)) {
                     if (var3 <= 14) {
                        throw new IllegalStateException();
                     }

                     if (var2 < -798824383 * var5.field5867) {
                        break;
                     }

                     if (var1 < 1415121929 * var5.field5867) {
                        if (var3 <= 14) {
                           throw new IllegalStateException();
                        }

                        int var10000;
                        if (var4 > 0) {
                           if (var3 <= 14) {
                              throw new IllegalStateException();
                           }

                           var10000 = var4 - 1;
                        } else {
                           var10000 = 0;
                        }

                        return var10000;
                     }

                     if (1 + var4 != this.field5767.size() && ((class472)this.field5767.get(1 + var4)).field5868 * -798824383 != var5.field5867 * -798824383) {
                        int var6 = this.method10244((class472)this.field5767.get(var4), false, (byte)8);
                        if (var1 < var5.field5867 * 1415121929 + var6) {
                           return var4;
                        }

                        if (var2 <= var5.field5867 * -798824383 + method10199(this, (byte)-56)) {
                           if (var3 <= 14) {
                              throw new IllegalStateException();
                           }

                           return var4 + 1;
                        }
                     }
                  }
               }

               class472 var8 = (class472)this.field5767.get(this.field5767.size() - 1);
               if (var1 >= 1415121929 * var8.field5868) {
                  if (var3 <= 14) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var8.field5868 * 1415121929 + this.method10202((short)255)) {
                     if (var3 <= 14) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= -798824383 * var8.field5867 && var2 <= var8.field5867 * -798824383 + method10199(this, (byte)15)) {
                        if (var3 <= 14) {
                           throw new IllegalStateException();
                        }

                        return this.field5767.size() - 1;
                     }
                  }
               }
            }

            return this.field5767.size();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "sf.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;III)Lsc;")
   @ObfuscatedName("ad")
   public classSC method10165(String var1, int var2, int var3, int var4) {
      try {
         if (0 == var3) {
            if (var4 == 495536545) {
               throw new IllegalStateException();
            }

            var3 = Integer.MAX_VALUE;
         }

         int var5 = var2;
         if (this.field5767.size() >= var3) {
            if (var4 == 495536545) {
               throw new IllegalStateException();
            } else {
               this.method10241(var2, var2, -176298461);
               return new classSC(var2, true);
            }
         } else {
            this.field5767.ensureCapacity(this.field5767.size() + var1.length());

            for (int var6 = 0; var6 < var1.length(); var6++) {
               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               if (this.field5767.size() >= var3) {
                  break;
               }

               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               class472 var7 = new class472();
               var7.field5869 = var1.charAt(var6);
               this.field5767.add(var5, var7);
               var5++;
            }

            this.method10241(var2, var5, -176298461);
            if (1837761111 * this.field5768 != 0) {
               if (var4 == 495536545) {
                  throw new IllegalStateException();
               }

               if (this.method10130(-1983718143) > this.field5768 * 1837761111) {
                  if (var4 == 495536545) {
                     throw new IllegalStateException();
                  }

                  do {
                     if (var2 == var5) {
                        if (var4 == 495536545) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     method10178(this, --var5, (byte)21);
                  } while (this.method10236(-1592853768) > this.field5770 * 1837761111);

                  return new classSC(var5, true);
               }
            }

            return new classSC(var5, false);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "sf.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ce")
   public void method10154(int var1) {
      if (this.field5770 * 2134183747 != var1) {
         this.field5763 = 1672705387 * var1;
         this.method10238(-1374543307);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsw;")
   @ObfuscatedName("bf")
   public class472 method10121(int var1) {
      return (class472)this.field5767.get(var1);
   }
}
