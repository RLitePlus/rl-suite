import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zd")
public class classZD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7164 = 0;
   @ObfuscatedName("ap")
   int field7160 = 1650063991;
   @ObfuscatedName("ak")
   boolean field7157;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field7166 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field7163 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field7168 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field7167 = 0;
   @ObfuscatedName("am")
   int field7155;
   @ObfuscatedName("at")
   ArrayList field7158;
   @ObfuscatedName("au")
   int field7153 = 77075595;
   @ObfuscatedName("ai")
   int field7154 = 0;
   @ObfuscatedName("ar")
   int field7156 = 0;
   @ObfuscatedName("aw")
   int field7161 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field7165 = 1;
   @ObfuscatedSignature(descriptor = "Laaa;")
   @ObfuscatedName("av")
   AbstractFont field7170;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field7162 = 2;
   @ObfuscatedName("an")
   int field7159;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7169 = 0;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eq")
   public int method13945() {
      return this.field7155 * 819482748;
   }

   @ObfuscatedSignature(descriptor = "(II)Laay;")
   @ObfuscatedName("az")
   public classAAY method13839(int var1, int var2) {
      try {
         return (classAAY)this.field7158.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Laay;")
   @ObfuscatedName("af")
   classAAY method13843(short var1) {
      try {
         if (this.field7158.isEmpty()) {
            if (var1 != 1028) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (classAAY)this.field7158.get(this.field7158.size() - 1);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean method13845(int var1) {
      try {
         return this.field7158.isEmpty();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   boolean method13847(int var1) {
      try {
         boolean var10000;
         if (1115114717 * this.field7153 > 1) {
            if (var1 == 1209659655) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method13850(int var1) {
      try {
         return this.field7158.size();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Laaa;)V")
   @ObfuscatedName("ze")
   public static void method13860(classZD var0, AbstractFont var1) {
      if (var1 != var0.field7170) {
         var0.field7170 = var1;
         if (var0.field7170 != null) {
            if (-879393926 * var0.field7161 == 0) {
               var0.field7161 = var0.field7170.field8 * -536330217;
            }

            if (!var0.method13845(-1625891077)) {
               method13954(var0, -141344935);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method13854(byte var1) {
      try {
         if (this.method13845(-1015686106)) {
            return "";
         } else {
            StringBuilder var2 = new StringBuilder(this.method13850(-1947597235));

            for (int var3 = 0; var3 < this.method13850(739958252); var3++) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               classAAY var4 = this.method13839(var3, -1052717093);
               var2.append(var4.field117);
            }

            return var2.toString();
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "zd.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzd;III)Lwb;")
   @ObfuscatedName("mq")
   public static classWB method13970(classZD var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method13974(var1, var1, var1);
      } else {
         try {
            int var4 = Math.min(var1, var2);
            int var5 = Math.max(var1, var2);
            int var6 = var0.field7158.size();
            if (0 == var4) {
               if (var3 == -1912809050) {
                  throw new IllegalStateException();
               }

               if (var6 == var5) {
                  return new classWB(0, var6);
               }
            }

            int var7 = var0.method13976(var4, false, 1542095340);
            int var8 = method13979(var0, var5, false, 601372762);
            switch (var0.field7156 * -2110789749) {
               case 0:
                  if (0 == -562437229 * var0.field7154) {
                     return new classWB(var7, var6);
                  }

                  int var11 = var0.method13976(var4, true, 1542095340);
                  return new classWB(var11, var6);
               case 1:
                  return new classWB(0, var6);
               case 2:
                  if (2 == var0.field7154 * -562437229) {
                     if (var3 == -1912809050) {
                        throw new IllegalStateException();
                     }

                     return new classWB(0, var8);
                  }

                  int var9 = method13979(var0, var5, true, 601372762);
                  return new classWB(0, var9);
               default:
                  return new classWB(0, var6);
            }
         } catch (RuntimeException var10) {
            throw classEG.newRunException(var10, "zd.ba(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public void method13857(int var1, int var2) {
      try {
         if (var1 != this.field7155 * 1736120249) {
            if (var2 == -2105774842) {
               throw new IllegalStateException();
            }

            this.field7155 = var1 * -668090743;
            method13954(this, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("jm")
   public static int method13922(classZD var0) {
      return -980478679 * var0.field7160;
   }

   @ObfuscatedSignature(descriptor = "(Lzd;II)V")
   @ObfuscatedName("fx")
   public static void method13926(classZD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13963(var1, var1);
      }

      try {
         if (null != var0.field7170) {
            if (var2 >= -2037807646) {
               throw new IllegalStateException();
            }

            if (var1 < var0.field7170.field8 * 2) {
               if (var2 >= -2037807646) {
                  return;
               }

               var1 = Integer.MAX_VALUE;
            }
         }

         if (var1 != 1062600889 * var0.field7160) {
            if (var2 >= -2037807646) {
               throw new IllegalStateException();
            }

            var0.field7160 = 497419657 * var1;
            method13954(var0, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.bn(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;I)V")
   @ObfuscatedName("fv")
   public static void method13927(classZD var0, int var1) {
      if (null != var0.field7170 && var1 < var0.field7170.field8 * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != 1219757333 * var0.field7160) {
         var0.field7160 = 1079328656 * var1;
         method13954(var0, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fh")
   int method13975(int var1, boolean var2) {
      if (var1 < this.field7158.size()) {
         int var3 = ((classAAY)this.field7158.get(var1)).field115 * 1839316601;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((classAAY)this.field7158.get(var4 - 1)).field115 * 1839316601 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((classAAY)this.field7158.get(var4 - 1)).field115 * 1839316601;
            }
         }
      }

      return 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;CII)Lzp;")
   @ObfuscatedName("ie")
   public static classZP method13874(classZD var0, char var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13957(var2);
      }

      return var0.method13877(Character.toString(var1), var2, var3, (byte)52);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eh")
   public int method13937() {
      return 2145444479 * this.field7159;
   }

   @ObfuscatedSignature(descriptor = "(III)Laag;")
   @ObfuscatedName("al")
   public classAAG method13871(int var1, int var2, int var3) {
      try {
         if (var1 == var2) {
            if (var3 <= -35830549) {
               throw new IllegalStateException();
            } else {
               return new classAAG(this, 0, 0);
            }
         } else {
            if (var1 <= this.field7158.size()) {
               if (var3 <= -35830549) {
                  throw new IllegalStateException();
               }

               if (var2 <= this.field7158.size()) {
                  if (var2 < var1) {
                     if (var3 <= -35830549) {
                        throw new IllegalStateException();
                     }

                     return new classAAG(this, var2, var1);
                  }

                  return new classAAG(this, var1, var2);
               }

               if (var3 <= -35830549) {
                  throw new IllegalStateException();
               }
            }

            return new classAAG(this, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zd.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lwb;")
   @ObfuscatedName("fi")
   classWB method13971(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field7158.size();
      if (0 == var3 && var5 == var4) {
         return new classWB(0, var5);
      } else {
         int var6 = this.method13976(var3, false, 1542095340);
         int var7 = method13979(this, var4, false, 601372762);
         switch (this.field7156 * 1056070321) {
            case 0:
               if (0 == -294040712 * this.field7154) {
                  return new classWB(var6, var5);
               }

               int var9 = this.method13976(var3, true, 1542095340);
               return new classWB(var9, var5);
            case 1:
               return new classWB(0, var5);
            case 2:
               if (2 == this.field7154 * -562437229) {
                  return new classWB(0, var7);
               }

               int var8 = method13979(this, var4, true, 601372762);
               return new classWB(0, var8);
            default:
               return new classWB(0, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIB)Lzp;")
   @ObfuscatedName("ay")
   public classZP method13877(String var1, int var2, int var3, byte var4) {
      try {
         if (var3 == 0) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }

            var3 = Integer.MAX_VALUE;
         }

         int var5 = var2;
         if (this.field7158.size() >= var3) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            } else {
               this.method13958(var2, var2, 1746970994);
               return new classZP(var2, true);
            }
         } else {
            this.field7158.ensureCapacity(this.field7158.size() + var1.length());

            for (int var6 = 0; var6 < var1.length(); var6++) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               if (this.field7158.size() >= var3) {
                  break;
               }

               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               classAAY var7 = new classAAY();
               var7.field117 = var1.charAt(var6);
               this.field7158.add(var5, var7);
               var5++;
            }

            this.method13958(var2, var5, -49397290);
            if (0 != this.field7153 * 1115114717) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               if (this.method13913(-996765587) > 1115114717 * this.field7153) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  while (true) {
                     if (var5 == var2) {
                        if (var4 <= 1) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     method13892(this, --var5, -1596338929);
                     if (this.method13913(-788234990) <= 1115114717 * this.field7153) {
                        if (var4 <= 1) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return new classZP(var5, true);
               }
            }

            return new classZP(var5, false);
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "zd.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)Lzp;")
   @ObfuscatedName("aq")
   classZP method13882(String var1, int var2, byte var3) {
      try {
         return this.method13877(var1, this.field7158.size(), var2, (byte)106);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zd.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bj")
   void method13890(int var1) {
      try {
         this.field7158.clear();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Laag;")
   @ObfuscatedName("ca")
   public classAAG method13872(int var1, int var2) {
      if (var1 == var2) {
         return new classAAG(this, 0, 0);
      } else if (var1 > this.field7158.size() || var2 > this.field7158.size()) {
         return new classAAG(this, 0, 0);
      } else {
         return var2 < var1 ? new classAAG(this, var2, var1) : new classAAG(this, var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dw")
   public int method13910() {
      return 913897383 * this.field7161;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ar")
   public int method13898(int var1, int var2, int var3) {
      try {
         if (null == this.field7170) {
            if (var3 >= 1362773997) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.method13847(-860246764)) {
               if (var3 >= 1362773997) {
                  throw new IllegalStateException();
               }

               if (var1 > this.field7160 * 1062600889) {
                  if (var3 >= 1362773997) {
                     throw new IllegalStateException();
                  }

                  return this.field7158.size();
               }
            }

            if (!this.field7158.isEmpty()) {
               for (int var4 = 0; var4 < this.field7158.size(); var4++) {
                  classAAY var5 = (classAAY)this.field7158.get(var4);
                  if (var2 <= 1839316601 * var5.field115 + this.method13911((byte)11)) {
                     if (var3 >= 1362773997) {
                        throw new IllegalStateException();
                     }

                     if (var2 < 1839316601 * var5.field115) {
                        if (var3 >= 1362773997) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     if (var1 < -724223965 * var5.field116) {
                        return var4 > 0 ? var4 - 1 : 0;
                     }

                     if (1 + var4 != this.field7158.size()) {
                        if (var3 >= 1362773997) {
                           throw new IllegalStateException();
                        }

                        if (((classAAY)this.field7158.get(1 + var4)).field115 * 1839316601 != 1839316601 * var5.field115) {
                           if (var3 >= 1362773997) {
                              throw new IllegalStateException();
                           }

                           int var6 = this.method13967((classAAY)this.field7158.get(var4), false, (byte)17);
                           if (var1 < -724223965 * var5.field116 + var6) {
                              if (var3 >= 1362773997) {
                                 throw new IllegalStateException();
                              }

                              return var4;
                           }

                           if (var2 <= var5.field115 * 1839316601 + this.method13911((byte)27)) {
                              if (var3 >= 1362773997) {
                                 throw new IllegalStateException();
                              }

                              return 1 + var4;
                           }
                        }
                     }
                  }
               }

               classAAY var8 = (classAAY)this.field7158.get(this.field7158.size() - 1);
               if (var1 >= var8.field116 * -724223965 && var1 <= var8.field116 * -724223965 + this.method13918((byte)51)) {
                  if (var3 >= 1362773997) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= var8.field115 * 1839316601) {
                     if (var3 >= 1362773997) {
                        throw new IllegalStateException();
                     }

                     if (var2 <= 1839316601 * var8.field115 + this.method13911((byte)-104)) {
                        if (var3 >= 1362773997) {
                           throw new IllegalStateException();
                        }

                        return this.field7158.size() - 1;
                     }
                  }
               }
            }

            return this.field7158.size();
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "zd.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ai")
   public int method13893(int var1, int var2, int var3) {
      try {
         if (var2 < var1) {
            if (var3 <= -598527031) {
               throw new IllegalStateException();
            }

            int var4 = var2;
            var2 = var1;
            var1 = var4;
         }

         this.field7158.subList(var1, var2).clear();
         int var7 = var1;
         if (this.method13847(-630275271)) {
            if (var3 <= -598527031) {
               throw new IllegalStateException();
            }

            if (1 == 2145444479 * this.field7159) {
               if (var3 <= -598527031) {
                  throw new IllegalStateException();
               }

               while (var7 > 0) {
                  if (var3 <= -598527031) {
                     throw new IllegalStateException();
                  }

                  char var5 = ((classAAY)this.field7158.get(--var7)).field117;
                  if (' ' == var5) {
                     break;
                  }

                  if (var3 <= -598527031) {
                     throw new IllegalStateException();
                  }

                  if (var5 == '\t') {
                     if (var3 <= -598527031) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }
         }

         this.method13958(var7, var2, 825095783);
         return var1;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "zd.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("cg")
   classZP method13883(String var1, int var2) {
      return this.method13877(var1, this.field7158.size(), var2, (byte)2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Ljava/lang/String;II)Lzp;")
   @ObfuscatedName("wh")
   public static classZP method13878(classZD var0, String var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13845(var2);
      }

      if (var3 == 0) {
         var3 = 1722980846;
      }

      int var4 = var2;
      if (var0.field7158.size() >= var3) {
         var0.method13958(var2, var2, -130490521);
         return new classZP(var2, true);
      } else {
         var0.field7158.ensureCapacity(var0.field7158.size() + var1.length());

         for (int var5 = 0; var5 < var1.length() && var0.field7158.size() < var3; var5++) {
            classAAY var6 = new classAAY();
            var6.field117 = var1.charAt(var5);
            var0.field7158.add(var4, var6);
            var4++;
         }

         var0.method13958(var2, var4, -584960437);
         if (0 != var0.field7153 * 1115114717 && var0.method13913(-897824846) > 1115114717 * var0.field7153) {
            while (var4 != var2) {
               method13892(var0, --var4, -1596338929);
               if (var0.method13913(-687321934) <= 1115114717 * var0.field7153) {
                  break;
               }
            }

            return new classZP(var4, true);
         } else {
            return new classZP(var4, false);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   public int method13908(byte var1) {
      try {
         int var10000;
         if (this.method13845(657928521)) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.field7170.field8 + ((classAAY)this.field7158.get(this.field7158.size() - 1)).field115 * 1839316601;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Laay;")
   @ObfuscatedName("bf")
   classAAY method13844() {
      return this.field7158.isEmpty() ? null : (classAAY)this.field7158.get(this.field7158.size() - 1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method13913(int var1) {
      try {
         return this.method13908((byte)50) / this.field7170.field8;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("am")
   int method13918(byte var1) {
      try {
         int var10000;
         if (this.method13845(-138235057)) {
            if (var1 >= 89) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.method13967((classAAY)this.field7158.get(this.field7158.size() - 1), false, (byte)46);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lzp;")
   @ObfuscatedName("ce")
   public classZP method13888(String var1) {
      this.method13890(944381675);
      return this.method13882(var1, 0, (byte)-90);
   }

   public classZD() {
      this.field7157 = true;
      this.field7158 = new ArrayList();
      this.field7159 = 0;
      this.field7155 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lzd;IB)V")
   @ObfuscatedName("wf")
   public static void method13868(classZD var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method13870(var1, var2);
      }

      try {
         if (var1 != 913897383 * var0.field7161) {
            if (var2 <= 109) {
               throw new IllegalStateException();
            }

            var0.field7161 = var1 * -536330217;
            method13954(var0, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bc")
   public void method13934(int var1, byte var2) {
      try {
         if (var1 != this.field7153 * 1115114717) {
            if (var2 >= 1) {
               return;
            }

            this.field7153 = var1 * 2070408053;
            method13954(this, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("aa")
   public boolean method13865(int var1, int var2, int var3) {
      try {
         if (var1 == -562437229 * this.field7154) {
            if (var3 >= 118690839) {
               throw new IllegalStateException();
            }

            if (var2 == this.field7156 * -2110789749) {
               return true;
            }
         }

         this.field7154 = var1 * 2089661083;
         this.field7156 = var2 * 1535445027;
         method13954(this, -141344935);
         return true;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zd.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("br")
   public void method13941(int var1, int var2) {
      try {
         if (var1 != this.field7159 * 2145444479) {
            if (var2 <= 178286289) {
               throw new IllegalStateException();
            }

            this.field7159 = -803676801 * var1;
            method13954(this, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bm")
   public int method13946(int var1) {
      try {
         return this.field7155 * 1736120249;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.bm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bg")
   public int method13952(int var1, int var2) {
      try {
         switch (this.field7156 * -2110789749) {
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
         throw classEG.newRunException(var3, "zd.bg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzd;IZI)I")
   @ObfuscatedName("kn")
   public static int method13979(classZD var0, int var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method13981(var1, var2, var1);
      }

      try {
         if (var1 < var0.field7158.size()) {
            if (var3 != 601372762) {
               throw new IllegalStateException();
            }

            int var4 = ((classAAY)var0.field7158.get(var1)).field115 * 1839316601;

            for (int var5 = var1; var5 < var0.field7158.size() - 1; var5++) {
               if (var3 != 601372762) {
                  throw new IllegalStateException();
               }

               if (((classAAY)var0.field7158.get(var5 + 1)).field115 * 1839316601 > var4) {
                  if (!var2) {
                     if (var3 != 601372762) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((classAAY)var0.field7158.get(var5 + 1)).field115 * 1839316601;
               }
            }
         }

         return var0.field7158.size();
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "zd.bb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bk")
   void method13958(int var1, int var2, int var3) {
      try {
         if (!this.method13845(-1159494615)) {
            if (var3 == 1105536914) {
               return;
            }

            if (this.field7170 != null) {
               classWB var4;
               boolean var10000;
               label250: {
                  var4 = method13970(this, var1, var2, 978407635);
                  if ((Integer)var4.field6654 == 0) {
                     if (var3 == 1105536914) {
                        throw new IllegalStateException();
                     }

                     if ((Integer)var4.field6655 == this.field7158.size()) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        var10000 = 1;
                        break label250;
                     }
                  }

                  var10000 = 0;
               }

               boolean var5 = (boolean)var10000;
               int var6 = (Integer)var4.field6654;
               int var7 = 0;
               if (var5) {
                  if (var3 == 1105536914) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = ((classAAY)this.field7158.get((Integer)var4.field6654)).field115 * 1839316601;
               }

               int var8 = var10000;
               int var9 = 0;

               for (int var10 = (Integer)var4.field6654; var10 <= (Integer)var4.field6655; var10++) {
                  if (var3 == 1105536914) {
                     throw new IllegalStateException();
                  }

                  boolean var31;
                  if (var10 >= this.field7158.size()) {
                     if (var3 == 1105536914) {
                        return;
                     }

                     var31 = 1;
                  } else {
                     var31 = 0;
                  }

                  boolean var11 = (boolean)var31;
                  classAAY var12 = (classAAY)this.field7158.get(!var11 ? var10 : this.field7158.size() - 1);
                  if (!var11) {
                     if (var3 == 1105536914) {
                        throw new IllegalStateException();
                     }

                     var31 = this.method13967(var12, false, (byte)-17);
                  } else {
                     var31 = 0;
                  }

                  int var13;
                  label240: {
                     var13 = var31;
                     if (!var11) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        if (var12.field117 == '\n') {
                           if (var3 == 1105536914) {
                              throw new IllegalStateException();
                           }

                           var33 = true;
                           break label240;
                        }
                     }

                     var33 = false;
                  }

                  boolean var14;
                  label234: {
                     var14 = var33;
                     if (!var11) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        if (this.method13847(1303054470)) {
                           if (var3 == 1105536914) {
                              return;
                           }

                           if (var7 + var13 > 1062600889 * this.field7160) {
                              if (var3 == 1105536914) {
                                 throw new IllegalStateException();
                              }

                              var34 = true;
                              break label234;
                           }
                        }
                     }

                     var34 = false;
                  }

                  label270: {
                     boolean var15 = var34;
                     if (!var14) {
                        if (var3 == 1105536914) {
                           return;
                        }

                        if (!var15) {
                           if (var3 == 1105536914) {
                              throw new IllegalStateException();
                           }

                           if (!var11) {
                              break label270;
                           }
                        }
                     }

                     int var16 = var10;
                     int var17 = 0;
                     if (var15) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        int var18 = 0;
                        label204:
                        if (2145444479 * this.field7159 == 1) {
                           if (var3 == 1105536914) {
                              throw new IllegalStateException();
                           }

                           int var19 = var10;

                           while (true) {
                              if (var19 <= var6) {
                                 break label204;
                              }

                              classAAY var20 = (classAAY)this.field7158.get(var19);
                              int var10001;
                              if (var19 < var16) {
                                 if (var3 == 1105536914) {
                                    return;
                                 }

                                 var10001 = this.method13967(var20, false, (byte)-94);
                              } else {
                                 var10001 = 0;
                              }

                              var18 += var10001;
                              if (var20.field117 == ' ') {
                                 break;
                              }

                              if (var3 == 1105536914) {
                                 return;
                              }

                              if (var20.field117 == '\n') {
                                 if (var3 == 1105536914) {
                                    throw new IllegalStateException();
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

                     int var27 = -this.method13950(var7, (byte)-60);

                     for (int var28 = var6; var28 < var16; var28++) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        classAAY var29 = (classAAY)this.field7158.get(var28);
                        int var21 = this.method13967(var29, false, (byte)2);
                        var29.field116 = var27 * -1084672117;
                        var29.field115 = -170636343 * var8;
                        var27 += var21;
                     }

                     var6 = var16;
                     var7 = var17;
                     var8 += this.method13911((byte)-11);
                     var9++;
                  }

                  var7 += !var11 ? var13 : 0;
               }

               if (0 != this.field7156 * -2110789749) {
                  if (var3 == 1105536914) {
                     throw new IllegalStateException();
                  }

                  if (var5) {
                     if (var3 == 1105536914) {
                        throw new IllegalStateException();
                     }

                     int var23 = var9 * this.method13911((byte)-37);
                     int var24 = this.method13952(var23, -1932032147);

                     for (int var25 = 0; var25 < this.field7158.size(); var25++) {
                        if (var3 == 1105536914) {
                           throw new IllegalStateException();
                        }

                        classAAY var26 = (classAAY)this.field7158.get(var25);
                        var26.field115 -= -170636343 * var24;
                     }
                  }
               }

               return;
            }

            if (var3 == 1105536914) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var22) {
         throw classEG.newRunException(var22, "zd.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bo")
   int method13964(int var1, int var2) {
      try {
         int var10000;
         if (var1 < this.field7158.size()) {
            if (var2 != -1137455963) {
               throw new IllegalStateException();
            }

            var10000 = this.method13967((classAAY)this.field7158.get(var1), false, (byte)-77);
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laay;ZB)I")
   @ObfuscatedName("bu")
   int method13967(classAAY var1, boolean var2, byte var3) {
      try {
         if ('\n' == var1.field117) {
            return 0;
         } else {
            if (!var2) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (1736120249 * this.field7155 != 0) {
                  return this.field7170.field24[42];
               }

               if (var3 == 0) {
                  throw new IllegalStateException();
               }
            }

            int var4 = this.field7170.field24[var1.field117];
            if (0 == var4) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               } else {
                  return 9 == var1.field117 ? 3 * this.field7170.field24[32] : this.field7170.field24[32];
               }
            } else {
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "zd.bu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)I")
   @ObfuscatedName("bb")
   int method13976(int var1, boolean var2, int var3) {
      try {
         if (var1 < this.field7158.size()) {
            if (var3 != 1542095340) {
               throw new IllegalStateException();
            }

            int var4 = ((classAAY)this.field7158.get(var1)).field115 * 1839316601;

            for (int var5 = var1; var5 > 0; var5--) {
               if (var3 != 1542095340) {
                  throw new IllegalStateException();
               }

               if (((classAAY)this.field7158.get(var5 - 1)).field115 * 1839316601 < var4) {
                  if (var3 != 1542095340) {
                     throw new IllegalStateException();
                  }

                  if (!var2) {
                     if (var3 != 1542095340) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((classAAY)this.field7158.get(var5 - 1)).field115 * 1839316601;
               }
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "zd.bw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   public int method13930(int var1) {
      try {
         return 1115114717 * this.field7153;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.bx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ew")
   public int method13949(int var1) {
      switch (-2034569601 * this.field7154) {
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

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("ad")
   public classZP method13889(String var1, int var2) {
      try {
         this.method13890(1354366766);
         return this.method13882(var1, 0, (byte)-69);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("bq")
   public classAAY method13840(int var1) {
      return (classAAY)this.field7158.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public int method13923(int var1) {
      try {
         return 1062600889 * this.field7160;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   boolean method13848() {
      return 1115114717 * this.field7153 > 1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   public int method13938(int var1) {
      try {
         return 2145444479 * this.field7159;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method13851() {
      return this.field7158.size();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   public int method13852() {
      return this.field7158.size();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public int method13853() {
      return this.field7158.size();
   }

   @ObfuscatedSignature(descriptor = "(Lzd;III)I")
   @ObfuscatedName("pu")
   public static int method13901(classZD var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13905(var1, var1, var1);
      }

      try {
         if (var0.field7170 != null && !var0.method13845(346750611)) {
            if (var1 <= var0.field7158.size()) {
               byte var4;
               if (var2 > 0) {
                  if (var3 >= -440812233) {
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
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  classAAY var7 = (classAAY)var0.field7158.get(var1 - 1);
                  var5 = var7.field116 * -724223965 + var0.method13964(var1 - 1, -1137455963);
                  var6 = var7.field115 * 1839316601;
               } else if (-1 == var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  if (var1 == 0) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     return 0;
                  }
               }

               int var16 = 16777215;
               int var8 = 0;
               int var9 = var1;
               int var10 = 16777215;
               int var10000;
               if (1 == var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  var10000 = var0.field7158.size() + 1;
               } else {
                  var10000 = 0;
               }

               int var11 = var10000;

               for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  classAAY var13 = (classAAY)var0.field7158.get(var12 - 1);
                  if (var6 != 1839316601 * var13.field115) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     var8++;
                     var6 = 1839316601 * var13.field115;
                     if (var8 > var2) {
                        if (var3 >= -440812233) {
                           throw new IllegalStateException();
                        }

                        return var9;
                     }
                  }

                  if (var2 == var8) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     int var14 = Math.abs(var13.field116 * -724223965 + var0.method13964(var12 - 1, -1137455963) - var5);
                     if (var14 >= var10) {
                        return var9;
                     }

                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     var9 = var12;
                     var10 = var14;
                  }
               }

               if (var4 == 1) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  return var0.field7158.size();
               }

               if (0 != var6) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  var8++;
               }

               if (16777215 != var10) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  if (var2 == var8) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     if (var5 < var10) {
                        if (var3 >= -440812233) {
                           throw new IllegalStateException();
                        }

                        return 0;
                     }
                  }

                  return var9;
               }

               return 0;
            }

            if (var3 >= -440812233) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "zd.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ct")
   public String method13855() {
      if (this.method13845(-592415032)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method13850(-1883911097));

         for (int var2 = 0; var2 < this.method13850(-986453213); var2++) {
            classAAY var3 = this.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cb")
   public String method13856() {
      if (this.method13845(-2123381688)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method13850(-159178304));

         for (int var2 = 0; var2 < this.method13850(1515099264); var2++) {
            classAAY var3 = this.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   public boolean method13846() {
      return this.field7158.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cq")
   public void method13858(int var1) {
      if (var1 != this.field7155 * -1652919747) {
         this.field7155 = var1 * -668090743;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laaa;)V")
   @ObfuscatedName("cl")
   public void method13861(AbstractFont var1) {
      if (var1 != this.field7170) {
         this.field7170 = var1;
         if (this.field7170 != null) {
            if (913897383 * this.field7161 == 0) {
               this.field7161 = this.field7170.field8 * -536330217;
            }

            if (!this.method13845(-1010036542)) {
               method13954(this, -141344935);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dd")
   public int method13894(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field7158.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method13847(-1574932375) && 1 == 2145444479 * this.field7159) {
         while (var5 > 0) {
            char var4 = ((classAAY)this.field7158.get(--var5)).field117;
            if (-161673272 == var4 || var4 == '\t') {
               break;
            }
         }
      }

      this.method13958(var5, var2, 313877197);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   public void method13935(int var1) {
      if (var1 != this.field7153 * 1115114717) {
         this.field7153 = var1 * 2070408053;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ak")
   public int method13906(byte var1) {
      try {
         if (!this.field7158.isEmpty() && this.method13913(-1153383749) == 1) {
            if (var1 >= 15) {
               throw new IllegalStateException();
            } else {
               return this.field7158.isEmpty()
                  ? 0
                  : ((classAAY)this.field7158.get(this.field7158.size() - 1)).field116 * -724223965 + this.method13918((byte)-1);
            }
         } else {
            int var2 = -1;
            int var3 = 0;

            for (int var4 = this.field7158.size() - 1; var4 >= 0; var4--) {
               if (var1 >= 15) {
                  throw new IllegalStateException();
               }

               classAAY var5 = (classAAY)this.field7158.get(var4);
               if (var5.field115 * 1839316601 != var2) {
                  int var6 = this.method13967(var5, false, (byte)-32) + var5.field116 * -724223965;
                  var3 = Math.max(var6, var3);
                  var2 = 1839316601 * var5.field115;
               }
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "zd.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Laaa;)V")
   @ObfuscatedName("ty")
   public static void method13862(classZD var0, AbstractFont var1) {
      if (var1 != var0.field7170) {
         var0.field7170 = var1;
         if (var0.field7170 != null) {
            if (326391726 * var0.field7161 == 0) {
               var0.field7161 = var0.field7170.field8 * -536330217;
            }

            if (!var0.method13845(112644631)) {
               method13954(var0, -141344935);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Laag;")
   @ObfuscatedName("ck")
   public classAAG method13873(int var1, int var2) {
      if (var1 == var2) {
         return new classAAG(this, 0, 0);
      } else if (var1 > this.field7158.size() || var2 > this.field7158.size()) {
         return new classAAG(this, 0, 0);
      } else {
         return var2 < var1 ? new classAAG(this, var2, var1) : new classAAG(this, var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lwb;")
   @ObfuscatedName("fb")
   classWB method13972(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field7158.size();
      if (0 == var3 && var5 == var4) {
         return new classWB(0, var5);
      } else {
         int var6 = this.method13976(var3, false, 1542095340);
         int var7 = method13979(this, var4, false, 601372762);
         switch (this.field7156 * -2110789749) {
            case 0:
               if (0 == -562437229 * this.field7154) {
                  return new classWB(var6, var5);
               }

               int var9 = this.method13976(var3, true, 1542095340);
               return new classWB(var9, var5);
            case 1:
               return new classWB(0, var5);
            case 2:
               if (2 == this.field7154 * -562437229) {
                  return new classWB(0, var7);
               }

               int var8 = method13979(this, var4, true, 601372762);
               return new classWB(0, var8);
            default:
               return new classWB(0, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("co")
   public void method13869(int var1) {
      if (var1 != 913897383 * this.field7161) {
         this.field7161 = var1 * -536330217;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(CIIB)Lzp;")
   @ObfuscatedName("aj")
   public classZP method13875(char var1, int var2, int var3, byte var4) {
      try {
         return this.method13877(Character.toString(var1), var2, var3, (byte)101);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "zd.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lzp;")
   @ObfuscatedName("cz")
   public classZP method13879(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (this.field7158.size() >= var3) {
         this.method13958(var2, var2, -5053563);
         return new classZP(var2, true);
      } else {
         this.field7158.ensureCapacity(this.field7158.size() + var1.length());

         for (int var5 = 0; var5 < var1.length() && this.field7158.size() < var3; var5++) {
            classAAY var6 = new classAAY();
            var6.field117 = var1.charAt(var5);
            this.field7158.add(var4, var6);
            var4++;
         }

         this.method13958(var2, var4, -723522998);
         if (0 != this.field7153 * 1115114717 && this.method13913(-1907554588) > 1115114717 * this.field7153) {
            while (var4 != var2) {
               method13892(this, --var4, -1596338929);
               if (this.method13913(161457509) <= 1115114717 * this.field7153) {
                  break;
               }
            }

            return new classZP(var4, true);
         } else {
            return new classZP(var4, false);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   public int method13911(byte var1) {
      try {
         return 913897383 * this.field7161;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("cw")
   classZP method13884(String var1, int var2) {
      return this.method13877(var1, this.field7158.size(), var2, (byte)62);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("cj")
   classZP method13885(String var1, int var2) {
      return this.method13877(var1, this.field7158.size(), var2, (byte)78);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("ci")
   classZP method13886(String var1, int var2) {
      return this.method13877(var1, this.field7158.size(), var2, (byte)127);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dx")
   public int method13899(int var1, int var2) {
      if (null == this.field7170) {
         return 0;
      } else if (this.method13847(1065304407) && var1 > this.field7160 * 1062600889) {
         return this.field7158.size();
      } else {
         if (!this.field7158.isEmpty()) {
            for (int var3 = 0; var3 < this.field7158.size(); var3++) {
               classAAY var4 = (classAAY)this.field7158.get(var3);
               if (var2 <= 1839316601 * var4.field115 + this.method13911((byte)-3)) {
                  if (var2 < 1839316601 * var4.field115) {
                     break;
                  }

                  if (var1 < -724223965 * var4.field116) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (1 + var3 != this.field7158.size() && ((classAAY)this.field7158.get(1 + var3)).field115 * 1839316601 != 1839316601 * var4.field115) {
                     int var5 = this.method13967((classAAY)this.field7158.get(var3), false, (byte)11);
                     if (var1 < -724223965 * var4.field116 + var5) {
                        return var3;
                     }

                     if (var2 <= var4.field115 * 1839316601 + this.method13911((byte)60)) {
                        return 1 + var3;
                     }
                  }
               }
            }

            classAAY var6 = (classAAY)this.field7158.get(this.field7158.size() - 1);
            if (var1 >= var6.field116 * -724223965
               && var1 <= var6.field116 * -724223965 + this.method13918((byte)79)
               && var2 >= var6.field115 * 1839316601
               && var2 <= 1839316601 * var6.field115 + this.method13911((byte)36)) {
               return this.field7158.size() - 1;
            }
         }

         return this.field7158.size();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fj")
   int method13965(int var1) {
      return var1 < this.field7158.size() ? this.method13967((classAAY)this.field7158.get(var1), false, (byte)-68) : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cm")
   public int method13891(int var1) {
      return this.method13893(var1, var1 + 1, 637387306);
   }

   @ObfuscatedSignature(descriptor = "(Lzd;I)V")
   @ObfuscatedName("mw")
   public static void method13954(classZD var0, int var1) {
      if (var0 == null) {
         var0.method13957(var1);
      } else {
         try {
            var0.method13958(0, var0.field7158.size(), -1276439447);
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "zd.bj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   public int method13909() {
      return this.method13845(-412252195) ? 0 : this.field7170.field8 + ((classAAY)this.field7158.get(this.field7158.size() - 1)).field115 * 1839316601;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bt")
   public int method13950(int var1, byte var2) {
      try {
         switch (-562437229 * this.field7154) {
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
         throw classEG.newRunException(var3, "zd.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cy")
   public boolean method13866(int var1, int var2) {
      if (var1 != -562437229 * this.field7154 || var2 != this.field7156 * -2110789749) {
         this.field7154 = var1 * 2089661083;
         this.field7156 = var2 * -1651621399;
         method13954(this, -141344935);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dy")
   public int method13900(int var1, int var2) {
      if (null == this.field7170) {
         return 0;
      } else if (this.method13847(-557759407) && var1 > this.field7160 * -809567525) {
         return this.field7158.size();
      } else {
         if (!this.field7158.isEmpty()) {
            for (int var3 = 0; var3 < this.field7158.size(); var3++) {
               classAAY var4 = (classAAY)this.field7158.get(var3);
               if (var2 <= 1839316601 * var4.field115 + this.method13911((byte)-38)) {
                  if (var2 < 1839316601 * var4.field115) {
                     break;
                  }

                  if (var1 < -724223965 * var4.field116) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (1 + var3 != this.field7158.size() && ((classAAY)this.field7158.get(1 + var3)).field115 * 1839316601 != 1839316601 * var4.field115) {
                     int var5 = this.method13967((classAAY)this.field7158.get(var3), false, (byte)6);
                     if (var1 < -724223965 * var4.field116 + var5) {
                        return var3;
                     }

                     if (var2 <= var4.field115 * -1971250221 + this.method13911((byte)-6)) {
                        return 1 + var3;
                     }
                  }
               }
            }

            classAAY var6 = (classAAY)this.field7158.get(this.field7158.size() - 1);
            if (var1 >= var6.field116 * 633085236
               && var1 <= var6.field116 * -724223965 + this.method13918((byte)82)
               && var2 >= var6.field115 * 1792793377
               && var2 <= -1045848591 * var6.field115 + this.method13911((byte)-28)) {
               return this.field7158.size() - 1;
            }
         }

         return this.field7158.size();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("di")
   public int method13902(int var1, int var2) {
      if (this.field7170 != null && !this.method13845(1619586072) && var1 <= this.field7158.size()) {
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
            classAAY var6 = (classAAY)this.field7158.get(var1 - 1);
            var4 = var6.field116 * -724223965 + this.method13964(var1 - 1, -1137455963);
            var5 = var6.field115 * 1839316601;
         } else if (-1 == var3 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = 1 == var3 ? this.field7158.size() + 1 : 0;

         for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
            classAAY var12 = (classAAY)this.field7158.get(var11 - 1);
            if (var5 != 1839316601 * var12.field115) {
               var7++;
               var5 = 1839316601 * var12.field115;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var2 == var7) {
               int var13 = Math.abs(var12.field116 * -724223965 + this.method13964(var11 - 1, -1137455963) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field7158.size();
         } else {
            if (0 != var5) {
               var7++;
            }

            return 16777215 == var9 || var2 == var7 && var4 < var9 ? 0 : var8;
         }
      } else {
         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Ljava/lang/String;II)Lzp;")
   @ObfuscatedName("tv")
   public static classZP method13880(classZD var0, String var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13909();
      }

      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (var0.field7158.size() >= var3) {
         var0.method13958(var2, var2, -231294871);
         return new classZP(var2, true);
      } else {
         var0.field7158.ensureCapacity(var0.field7158.size() + var1.length());

         for (int var5 = 0; var5 < var1.length() && var0.field7158.size() < var3; var5++) {
            classAAY var6 = new classAAY();
            var6.field117 = var1.charAt(var5);
            var0.field7158.add(var4, var6);
            var4++;
         }

         var0.method13958(var2, var4, 259184984);
         if (0 != var0.field7153 * 1115114717 && var0.method13913(-1913808805) > 1115114717 * var0.field7153) {
            while (var4 != var2) {
               method13892(var0, --var4, -1596338929);
               if (var0.method13913(62691604) <= 1115114717 * var0.field7153) {
                  break;
               }
            }

            return new classZP(var4, true);
         } else {
            return new classZP(var4, false);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("du")
   public int method13903(int var1, int var2) {
      if (this.field7170 != null && !this.method13845(-1426428556) && var1 <= this.field7158.size()) {
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
            classAAY var6 = (classAAY)this.field7158.get(var1 - 1);
            var4 = var6.field116 * -724223965 + this.method13964(var1 - 1, -1137455963);
            var5 = var6.field115 * 1839316601;
         } else if (-1 == var3 && var1 == 0) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = 1 == var3 ? this.field7158.size() + 1 : 0;

         for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
            classAAY var12 = (classAAY)this.field7158.get(var11 - 1);
            if (var5 != 1839316601 * var12.field115) {
               var7++;
               var5 = 1839316601 * var12.field115;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var2 == var7) {
               int var13 = Math.abs(var12.field116 * -724223965 + this.method13964(var11 - 1, -1137455963) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field7158.size();
         } else {
            if (0 != var5) {
               var7++;
            }

            return 16777215 != var9 && (var2 != var7 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dt")
   public int method13904(int var1, int var2) {
      if (this.field7170 != null && !this.method13845(-706566438) && var1 <= this.field7158.size()) {
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
            classAAY var6 = (classAAY)this.field7158.get(var1 - 1);
            var4 = var6.field116 * 512671160 + this.method13964(var1 - 1, -1137455963);
            var5 = var6.field115 * 1839316601;
         } else if (-1 == var3 && var1 == 0) {
            return 0;
         }

         int var14 = -1377061074;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = 1 == var3 ? this.field7158.size() + 1 : 0;

         for (int var11 = var1 + var3; var10 != var11; var11 += var3) {
            classAAY var12 = (classAAY)this.field7158.get(var11 - 1);
            if (var5 != 823500107 * var12.field115) {
               var7++;
               var5 = 1839316601 * var12.field115;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var2 == var7) {
               int var13 = Math.abs(var12.field116 * -724223965 + this.method13964(var11 - 1, -1137455963) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (var3 == 1) {
            return this.field7158.size();
         } else {
            if (0 != var5) {
               var7++;
            }

            return 1370489120 != var9 && (var2 != var7 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzd;II)I")
   @ObfuscatedName("mk")
   public static int method13892(classZD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13897(var1, var1);
      }

      try {
         return var0.method13893(var1, var1 + 1, 1206059140);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dr")
   public int method13907() {
      if (!this.field7158.isEmpty() && this.method13913(-172013881) == 1) {
         return this.field7158.isEmpty() ? 0 : ((classAAY)this.field7158.get(this.field7158.size() - 1)).field116 * -1092954790 + this.method13918((byte)43);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = this.field7158.size() - 1; var3 >= 0; var3--) {
            classAAY var4 = (classAAY)this.field7158.get(var3);
            if (var4.field115 * 1839316601 != var1) {
               int var5 = this.method13967(var4, false, (byte)45) + var4.field116 * -724223965;
               var2 = Math.max(var5, var2);
               var1 = -17956247 * var4.field115;
            }
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   public int method13931() {
      return -1953829844 * this.field7153;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("dr")
   public static int method13932(classZD var0) {
      return 1115114717 * var0.field7153;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("de")
   public int method13912() {
      return 913897383 * this.field7161;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dz")
   public int method13914() {
      return this.method13908((byte)100) / this.field7170.field8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Laay;Z)I")
   @ObfuscatedName("bu")
   public static int method13968(classZD var0, classAAY var1, boolean var2) {
      if (var0 == null) {
         var0.method13849();
      }

      if ('\n' == var1.field117) {
         return 0;
      } else if (!var2 && 1935313314 * var0.field7155 != 0) {
         return var0.field7170.field24[1221953455];
      } else {
         int var3 = var0.field7170.field24[var1.field117];
         if (0 == var3) {
            return 9 == var1.field117 ? 3 * var0.field7170.field24[-1003205486] : var0.field7170.field24[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dn")
   public int method13915() {
      return this.method13908((byte)2) / this.field7170.field8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dv")
   public int method13916() {
      return this.method13908((byte)13) / this.field7170.field8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("do")
   public int method13917() {
      return this.method13908((byte)89) / this.field7170.field8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   int method13919() {
      return this.method13845(-1819545571) ? 0 : this.method13967((classAAY)this.field7158.get(this.field7158.size() - 1), false, (byte)82);
   }

   @ObfuscatedSignature(descriptor = "(Lzd;Laaa;I)V")
   @ObfuscatedName("dv")
   public static void method13863(classZD var0, AbstractFont var1, int var2) {
      if (var0 == null) {
         var0.method13864(var1, var2);
      } else {
         try {
            if (var1 != var0.field7170) {
               if (var2 == 157205671) {
                  throw new IllegalStateException();
               }

               var0.field7170 = var1;
               if (var0.field7170 != null) {
                  if (913897383 * var0.field7161 == 0) {
                     if (var2 == 157205671) {
                        return;
                     }

                     var0.field7161 = var0.field7170.field8 * -536330217;
                  }

                  if (!var0.method13845(1185176199)) {
                     if (var2 == 157205671) {
                        throw new IllegalStateException();
                     }

                     method13954(var0, -141344935);
                  }
               }
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "zd.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   int method13920() {
      return this.method13845(-247763709) ? 0 : this.method13967((classAAY)this.field7158.get(this.field7158.size() - 1), false, (byte)46);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("df")
   public int method13924() {
      return 1062600889 * this.field7160;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dj")
   public int method13925() {
      return -356756542 * this.field7160;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("da")
   public void method13928(int var1) {
      if (null != this.field7170 && var1 < this.field7170.field8 * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != 1062600889 * this.field7160) {
         this.field7160 = 497419657 * var1;
         method13954(this, -141344935);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;II)V")
   @ObfuscatedName("tp")
   public static void method13959(classZD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13851();
      }

      if (!var0.method13845(1248329626) && var0.field7170 != null) {
         classWB var3 = method13970(var0, var1, var2, -107107337);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == var0.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)var0.field7158.get((Integer)var3.field6654)).field115 * 264104680;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= var0.field7158.size();
            classAAY var11 = (classAAY)var0.field7158.get(!var10 ? var9 : var0.field7158.size() - 1);
            int var12 = !var10 ? var0.method13967(var11, false, (byte)-59) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && var0.method13847(-2128003686) && var6 + var12 > 1062600889 * var0.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (-2088165298 * var0.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)var0.field7158.get(var18);
                        var17 += var18 < var15 ? var0.method13967(var19, false, (byte)-33) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -var0.method13950(var6, (byte)-18);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)var0.field7158.get(var26);
                  int var20 = var0.method13967(var27, false, (byte)4);
                  var27.field116 = var25 * -1247494446;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += var0.method13911((byte)-14);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != var0.field7156 * -2110789749 && var4) {
            int var21 = var8 * var0.method13911((byte)-26);
            int var22 = var0.method13952(var21, 1449078493);

            for (int var23 = 0; var23 < var0.field7158.size(); var23++) {
               classAAY var24 = (classAAY)var0.field7158.get(var23);
               var24.field115 -= -170636343 * var22;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cp")
   public void method13859(int var1) {
      if (var1 != this.field7155 * 1736120249) {
         this.field7155 = var1 * -1255605569;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lzp;")
   @ObfuscatedName("cx")
   classZP method13887(String var1, int var2) {
      return this.method13877(var1, this.field7158.size(), var2, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   public int method13933() {
      return 1115114717 * this.field7153;
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("bi")
   public classAAY method13841(int var1) {
      return (classAAY)this.field7158.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;Laay;Z)I")
   @ObfuscatedName("av")
   public static int method13969(classZD var0, classAAY var1, boolean var2) {
      if (var0 == null) {
         var0.method13856();
      }

      if ('\n' == var1.field117) {
         return 0;
      } else if (!var2 && 1736120249 * var0.field7155 != 0) {
         return var0.field7170.field24[42];
      } else {
         int var3 = var0.field7170.field24[var1.field117];
         if (0 == var3) {
            return 9 == var1.field117 ? 3 * var0.field7170.field24[32] : var0.field7170.field24[32];
         } else {
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public void method13942(int var1) {
      if (var1 != this.field7159 * 2145444479) {
         this.field7159 = -803676801 * var1;
         method13954(this, -141344935);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("yp")
   public static int method13921(classZD var0) {
      if (var0 == null) {
         var0.method13933();
      }

      return var0.method13845(706262005) ? 0 : var0.method13967((classAAY)var0.field7158.get(var0.field7158.size() - 1), false, (byte)-8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ev")
   public int method13939() {
      return 2145444479 * this.field7159;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("el")
   public int method13940() {
      return 2145444479 * this.field7159;
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("by")
   public classAAY method13842(int var1) {
      return (classAAY)this.field7158.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eg")
   public void method13943(int var1) {
      if (var1 != this.field7159 * 2145444479) {
         this.field7159 = -803676801 * var1;
         method13954(this, -141344935);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;IZ)I")
   @ObfuscatedName("id")
   public static int method13977(classZD var0, int var1, boolean var2) {
      if (var1 < var0.field7158.size()) {
         int var3 = ((classAAY)var0.field7158.get(var1)).field115 * 1839316601;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((classAAY)var0.field7158.get(var4 - 1)).field115 * 1839316601 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((classAAY)var0.field7158.get(var4 - 1)).field115 * 1839316601;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("en")
   public void method13944(int var1) {
      if (var1 != this.field7159 * 2145444479) {
         this.field7159 = -803676801 * var1;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dc")
   public int method13895(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field7158.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method13847(-2108177668) && 1 == 2145444479 * this.field7159) {
         while (var5 > 0) {
            char var4 = ((classAAY)this.field7158.get(--var5)).field117;
            if (' ' == var4 || var4 == '\t') {
               break;
            }
         }
      }

      this.method13958(var5, var2, -939167821);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   boolean method13849() {
      return 1115114717 * this.field7153 > 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   public int method13947() {
      return this.field7155 * 1736120249;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("et")
   public int method13948() {
      return this.field7155 * 312466455;
   }

   @ObfuscatedSignature(descriptor = "(CII)Lzp;")
   @ObfuscatedName("cc")
   public classZP method13876(char var1, int var2, int var3) {
      return this.method13877(Character.toString(var1), var2, var3, (byte)85);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eu")
   public int method13951(int var1) {
      switch (-562437229 * this.field7154) {
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
   @ObfuscatedName("ef")
   public int method13953(int var1) {
      switch (this.field7156 * -2110789749) {
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
   @ObfuscatedName("em")
   void method13955() {
      this.method13958(0, this.field7158.size(), -1172205105);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   void method13956() {
      this.method13958(0, this.field7158.size(), -786495422);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ei")
   void method13960(int var1, int var2) {
      if (!this.method13845(-123099894) && this.field7170 != null) {
         classWB var3 = method13970(this, var1, var2, 2048275137);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == this.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)this.field7158.get((Integer)var3.field6654)).field115 * -2127012098;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= this.field7158.size();
            classAAY var11 = (classAAY)this.field7158.get(!var10 ? var9 : this.field7158.size() - 1);
            int var12 = !var10 ? this.method13967(var11, false, (byte)58) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && this.method13847(1709188366) && var6 + var12 > 1341052201 * this.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (-945265624 * this.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)this.field7158.get(var18);
                        var17 += var18 < var15 ? this.method13967(var19, false, (byte)-40) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -this.method13950(var6, (byte)-91);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)this.field7158.get(var26);
                  int var20 = this.method13967(var27, false, (byte)64);
                  var27.field116 = var25 * -1084672117;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method13911((byte)-24);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != this.field7156 * -2110789749 && var4) {
            int var21 = var8 * this.method13911((byte)9);
            int var22 = this.method13952(var21, 741565921);

            for (int var23 = 0; var23 < this.field7158.size(); var23++) {
               classAAY var24 = (classAAY)this.field7158.get(var23);
               var24.field115 -= 683669316 * var22;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("eb")
   void method13961(int var1, int var2) {
      if (!this.method13845(-1080875272) && this.field7170 != null) {
         classWB var3 = method13970(this, var1, var2, -589200829);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == this.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)this.field7158.get((Integer)var3.field6654)).field115 * 1839316601;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= this.field7158.size();
            classAAY var11 = (classAAY)this.field7158.get(!var10 ? var9 : this.field7158.size() - 1);
            int var12 = !var10 ? this.method13967(var11, false, (byte)44) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && this.method13847(1298133097) && var6 + var12 > 1062600889 * this.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (2145444479 * this.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)this.field7158.get(var18);
                        var17 += var18 < var15 ? this.method13967(var19, false, (byte)48) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -this.method13950(var6, (byte)-113);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)this.field7158.get(var26);
                  int var20 = this.method13967(var27, false, (byte)-33);
                  var27.field116 = var25 * -1084672117;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method13911((byte)47);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != this.field7156 * -2110789749 && var4) {
            int var21 = var8 * this.method13911((byte)53);
            int var22 = this.method13952(var21, 676744703);

            for (int var23 = 0; var23 < this.field7158.size(); var23++) {
               classAAY var24 = (classAAY)this.field7158.get(var23);
               var24.field115 -= -170636343 * var22;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ec")
   void method13962(int var1, int var2) {
      if (!this.method13845(-2080986150) && this.field7170 != null) {
         classWB var3 = method13970(this, var1, var2, 2048309804);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == this.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)this.field7158.get((Integer)var3.field6654)).field115 * 1839316601;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= this.field7158.size();
            classAAY var11 = (classAAY)this.field7158.get(!var10 ? var9 : this.field7158.size() - 1);
            int var12 = !var10 ? this.method13967(var11, false, (byte)-72) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && this.method13847(375265329) && var6 + var12 > 1062600889 * this.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (2145444479 * this.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)this.field7158.get(var18);
                        var17 += var18 < var15 ? this.method13967(var19, false, (byte)-52) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -this.method13950(var6, (byte)-93);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)this.field7158.get(var26);
                  int var20 = this.method13967(var27, false, (byte)53);
                  var27.field116 = var25 * -1084672117;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method13911((byte)-70);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != this.field7156 * -2110789749 && var4) {
            int var21 = var8 * this.method13911((byte)17);
            int var22 = this.method13952(var21, -1329423564);

            for (int var23 = 0; var23 < this.field7158.size(); var23++) {
               classAAY var24 = (classAAY)this.field7158.get(var23);
               var24.field115 -= -170636343 * var22;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fl")
   int method13966(int var1) {
      return var1 < this.field7158.size() ? this.method13967((classAAY)this.field7158.get(var1), false, (byte)-13) : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;II)Z")
   @ObfuscatedName("pr")
   public static boolean method13867(classZD var0, int var1, int var2) {
      if (var1 != -562437229 * var0.field7154 || var2 != var0.field7156 * 2111014718) {
         var0.field7154 = var1 * 2089661083;
         var0.field7156 = var2 * -838115260;
         method13954(var0, -141344935);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dm")
   public int method13896(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field7158.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method13847(1062983798) && 1 == 2145444479 * this.field7159) {
         while (var5 > 0) {
            char var4 = ((classAAY)this.field7158.get(--var5)).field117;
            if (' ' == var4 || var4 == '\t') {
               break;
            }
         }
      }

      this.method13958(var5, var2, 1543185719);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)Lwb;")
   @ObfuscatedName("fg")
   classWB method13973(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.field7158.size();
      if (0 == var3 && var5 == var4) {
         return new classWB(0, var5);
      } else {
         int var6 = this.method13976(var3, false, 1542095340);
         int var7 = method13979(this, var4, false, 601372762);
         switch (this.field7156 * -2110789749) {
            case 0:
               if (0 == -562437229 * this.field7154) {
                  return new classWB(var6, var5);
               }

               int var9 = this.method13976(var3, true, 1542095340);
               return new classWB(var9, var5);
            case 1:
               return new classWB(0, var5);
            case 2:
               if (2 == this.field7154 * -562437229) {
                  return new classWB(0, var7);
               }

               int var8 = method13979(this, var4, true, 601372762);
               return new classWB(0, var8);
            default:
               return new classWB(0, var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ed")
   public void method13936(int var1) {
      if (var1 != this.field7153 * -2055900056) {
         this.field7153 = var1 * -17852382;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ey")
   public void method13929(int var1) {
      if (null != this.field7170 && var1 < this.field7170.field8 * 2) {
         var1 = -1072880331;
      }

      if (var1 != -1329539716 * this.field7160) {
         this.field7160 = 497419657 * var1;
         method13954(this, -141344935);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fu")
   int method13978(int var1, boolean var2) {
      if (var1 < this.field7158.size()) {
         int var3 = ((classAAY)this.field7158.get(var1)).field115 * -952467886;

         for (int var4 = var1; var4 > 0; var4--) {
            if (((classAAY)this.field7158.get(var4 - 1)).field115 * 670797815 < var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((classAAY)this.field7158.get(var4 - 1)).field115 * -667273127;
            }
         }
      }

      return 0;
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("fp")
   int method13980(int var1, boolean var2) {
      if (var1 < this.field7158.size()) {
         int var3 = ((classAAY)this.field7158.get(var1)).field115 * 360118692;

         for (int var4 = var1; var4 < this.field7158.size() - 1; var4++) {
            if (((classAAY)this.field7158.get(var4 + 1)).field115 * -2134325352 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((classAAY)this.field7158.get(var4 + 1)).field115 * 1839316601;
            }
         }
      }

      return this.field7158.size();
   }

   @ObfuscatedSignature(descriptor = "(Laaa;I)V")
   @ObfuscatedName("ac")
   public void method13864(AbstractFont var1, int var2) {
      try {
         if (var1 != this.field7170) {
            if (var2 == 157205671) {
               throw new IllegalStateException();
            }

            this.field7170 = var1;
            if (this.field7170 != null) {
               if (913897383 * this.field7155 == 0) {
                  if (var2 == 157205671) {
                     return;
                  }

                  this.field7160 = this.field7170.field8 * -536330217;
               }

               if (!this.method13845(1185176199)) {
                  if (var2 == 157205671) {
                     throw new IllegalStateException();
                  }

                  method13954(this, -141344935);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ao")
   public void method13870(int var1, byte var2) {
      try {
         if (var1 != 913897383 * this.field7161) {
            if (var2 <= 109) {
               throw new IllegalStateException();
            }

            this.field7154 = var1 * -536330217;
            method13954(this, -141344935);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zd.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   public void method13963(int var1, int var2) {
      if (!this.method13845(-1080875272) && this.field7170 != null) {
         classWB var3 = method13970(this, var1, var2, -589200829);
         boolean var4 = (Integer)var3.field6655 == 0 && (Integer)var3.field6654 == this.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)this.field7158.get((Integer)var3.field6655)).field115 * 1839316601;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6655; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= this.field7158.size();
            classAAY var11 = (classAAY)this.field7158.get(!var10 ? var9 : this.field7158.size() - 1);
            int var12 = !var10 ? this.method13967(var11, false, (byte)44) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && this.method13847(1298133097) && var6 + var12 > 1062600889 * this.field7153;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (2145444479 * this.field7153 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)this.field7158.get(var18);
                        var17 += var18 < var15 ? this.method13967(var19, false, (byte)48) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -this.method13950(var6, (byte)-113);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)this.field7158.get(var26);
                  int var20 = this.method13967(var27, false, (byte)-33);
                  var27.field115 = var25 * -1084672117;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.method13911((byte)47);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != this.field7161 * -2110789749 && var4) {
            int var21 = var8 * this.method13911((byte)53);
            int var22 = this.method13904(var21, 676744703);

            for (int var23 = 0; var23 < this.field7158.size(); var23++) {
               classAAY var24 = (classAAY)this.field7158.get(var23);
               var24.field115 = var24.field116 - -170636343 * var22;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)I")
   @ObfuscatedName("bw")
   int method13981(int var1, boolean var2, int var3) {
      try {
         if (var1 < this.field7158.size()) {
            if (var3 != 601372762) {
               throw new IllegalStateException();
            }

            int var4 = ((classAAY)this.field7158.get(var1)).field116 * 1839316601;

            for (int var5 = var1; var5 < this.field7158.size() - 1; var5++) {
               if (var3 != 601372762) {
                  throw new IllegalStateException();
               }

               if (((classAAY)this.field7158.get(var5 + 1)).field115 * 1839316601 > var4) {
                  if (!var2) {
                     if (var3 != 601372762) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((classAAY)this.field7158.get(var5 + 1)).field116 * 1839316601;
               }
            }
         }

         return this.field7158.size();
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "zd.bb(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)I")
   @ObfuscatedName("ha")
   public static int method13881(classQZ var0) {
      return var0 == null ? var0.method9907() : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void method13957(int var1) {
      try {
         this.method13958(0, this.field7158.size(), -1276439447);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zd.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lwb;")
   @ObfuscatedName("ba")
   classWB method13974(int var1, int var2, int var3) {
      try {
         int var4 = Math.min(var1, var2);
         int var5 = Math.max(var1, var2);
         int var6 = this.field7158.size();
         if (0 == var4) {
            if (var3 == -1912809050) {
               throw new IllegalStateException();
            }

            if (var6 == var5) {
               return new classWB(0, var6);
            }
         }

         int var7 = this.method13976(var4, false, 1542095340);
         int var8 = method13979(this, var5, false, 601372762);
         switch (this.field7155 * -2110789749) {
            case 0:
               if (0 == -562437229 * this.field7156) {
                  return new classWB(var7, var6);
               }

               int var11 = this.method13981(var4, true, 1542095340);
               return new classWB(var11, var6);
            case 1:
               return new classWB(0, var6);
            case 2:
               if (2 == this.field7159 * -562437229) {
                  if (var3 == -1912809050) {
                     throw new IllegalStateException();
                  }

                  return new classWB(0, var8);
               }

               int var9 = method13979(this, var5, true, 601372762);
               return new classWB(0, var9);
            default:
               return new classWB(0, var6);
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "zd.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aw")
   public int method13905(int var1, int var2, int var3) {
      try {
         if (this.field7170 != null && !this.method13845(346750611)) {
            if (var1 <= this.field7158.size()) {
               byte var4;
               if (var2 > 0) {
                  if (var3 >= -440812233) {
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
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  classAAY var7 = (classAAY)this.field7158.get(var1 - 1);
                  var5 = var7.field116 * -724223965 + this.method13964(var1 - 1, -1137455963);
                  var6 = var7.field115 * 1839316601;
               } else if (-1 == var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  if (var1 == 0) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     return 0;
                  }
               }

               int var16 = 16777215;
               int var8 = 0;
               int var9 = var1;
               int var10 = 16777215;
               int var10000;
               if (1 == var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  var10000 = this.field7158.size() + 1;
               } else {
                  var10000 = 0;
               }

               int var11 = var10000;

               for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  classAAY var13 = (classAAY)this.field7158.get(var12 - 1);
                  if (var6 != 1839316601 * var13.field115) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     var8++;
                     var6 = 1839316601 * var13.field115;
                     if (var8 > var2) {
                        if (var3 >= -440812233) {
                           throw new IllegalStateException();
                        }

                        return var9;
                     }
                  }

                  if (var2 == var8) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     int var14 = Math.abs(var13.field115 * -724223965 + this.method13964(var12 - 1, -1137455963) - var5);
                     if (var14 >= var10) {
                        return var9;
                     }

                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     var9 = var12;
                     var10 = var14;
                  }
               }

               if (var4 == 1) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  return this.field7158.size();
               }

               if (0 != var6) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  var8++;
               }

               if (16777215 != var10) {
                  if (var3 >= -440812233) {
                     throw new IllegalStateException();
                  }

                  if (var2 == var8) {
                     if (var3 >= -440812233) {
                        throw new IllegalStateException();
                     }

                     if (var5 < var10) {
                        if (var3 >= -440812233) {
                           throw new IllegalStateException();
                        }

                        return 0;
                     }
                  }

                  return var9;
               }

               return 0;
            }

            if (var3 >= -440812233) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "zd.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("au")
   public int method13897(int var1, int var2) {
      if (var2 < var1) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.field7158.subList(var1, var2).clear();
      int var5 = var1;
      if (this.method13847(-2108177668) && 1 == 2145444479 * this.field7156) {
         while (var5 > 0) {
            char var4 = ((classAAY)this.field7158.get(--var5)).field117;
            if (' ' == var4 || var4 == '\t') {
               break;
            }
         }
      }

      this.method13958(var5, var2, -939167821);
      return var1;
   }
}
