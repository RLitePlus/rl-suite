import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("si")
public class classSI {
   @ObfuscatedSignature(descriptor = "Lsf;")
   @ObfuscatedName("av")
   classSF field5790;
   @ObfuscatedName("at")
   int field5789 = 0;
   @ObfuscatedName("ag")
   int field5788 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field5791 = 12;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kt")
   static Archive field5792;

   @ObfuscatedSignature(descriptor = "(Lsw;)Z")
   @ObfuscatedName("ar")
   boolean method10288(class472 var1) {
      if (2 == this.field5790.field5769 * -545090629) {
         return true;
      } else {
         return 0 == -545090629 * this.field5790.field5769 ? false : this.field5790.method10122(1123856441) != var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String method10274(byte var1) {
      try {
         if (method10281(this, -2145982146)) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            StringBuilder var2 = new StringBuilder(this.method10284((short)-197));

            for (int var3 = this.field5789 * 358630923; var3 < this.field5788 * -1858758065; var3++) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               class472 var4 = this.field5790.method10117(var3, (byte)11);
               var2.append(var4.field5869);
            }

            return var2.toString();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "si.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   boolean method10276(int var1, byte var2) {
      try {
         if (this.field5790.method10225(-1093047458) != 2) {
            if (var2 >= 20) {
               throw new IllegalStateException();
            }

            if (this.field5790.method10225(-750442531) != 1) {
               return false;
            }

            if (this.field5790.field5766) {
               if (var2 >= 20) {
                  throw new IllegalStateException();
               }

               if (this.field5788 * -1858758065 - 1 == var1) {
                  return false;
               }

               if (var2 >= 20) {
                  throw new IllegalStateException();
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "si.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("an")
   public int method10284(short var1) {
      try {
         return -1858758065 * this.field5788 - 358630923 * this.field5789;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "si.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsw;I)Z")
   @ObfuscatedName("ae")
   boolean method10289(class472 var1, int var2) {
      try {
         if (2 == this.field5790.field5769 * -545090629) {
            return true;
         } else if (0 == -545090629 * this.field5790.field5769) {
            if (var2 != -1640531527) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.field5790.method10122(1409226611) != var1) {
            if (var2 != -1640531527) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "si.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsi;I)Z")
   @ObfuscatedName("cp")
   public static boolean method10281(classSI var0, int var1) {
      if (var0 == null) {
         return var0.method10280(var1);
      } else {
         try {
            return var0.field5788 * -1858758065 == 358630923 * var0.field5789;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "si.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method10291() {
      if (method10281(this, -2147471430)) {
         return 0;
      } else {
         class472 var1 = this.field5790.method10117(this.field5788 * -1858758065 - 1, (byte)12);
         if ('\n' == var1.field5869) {
            return 0;
         } else if (this.method10289(var1, -1640531527)) {
            return this.field5790.field5780.advances[42];
         } else {
            int var2 = this.field5790.field5780.advances[var1.field5869];
            if (0 == var2) {
               return 9 == var1.field5869 ? 3 * this.field5790.field5780.advances[32] : this.field5790.field5780.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsi;)Lvp;")
   @ObfuscatedName("ef")
   public static classVP method10297(classSI var0) {
      if (var0 == null) {
         var0.method10283();
      }

      if (method10281(var0, -2146822193)) {
         return new classVP(0, 0);
      } else {
         class472 var1 = var0.field5790.method10117(-1858758065 * var0.field5788 - 1, (byte)126);
         return new classVP(1415121929 * var1.field5868 + method10292(var0, -1529245934), -798824383 * var1.field5867);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsw;")
   @ObfuscatedName("aw")
   public class472 method10302(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < this.method10284((short)14046)) {
               return this.field5790.method10117(var1 + 358630923 * this.field5789, (byte)102);
            }

            if (var2 == -737724676) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "si.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method10275() {
      if (method10281(this, -2145976285)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method10284((short)-16332));

         for (int var2 = this.field5789 * 358630923; var2 < this.field5788 * -1858758065; var2++) {
            class472 var3 = this.field5790.method10117(var2, (byte)24);
            var1.append(var3.field5869);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean method10277(int var1) {
      return this.field5790.method10225(-1690740124) == 2
         || this.field5790.method10225(-496341666) == 1 && (!this.field5790.field5766 || this.field5788 * -1858758065 - 1 != var1);
   }

   @ObfuscatedSignature(descriptor = "(Lsi;I)I")
   @ObfuscatedName("qn")
   public static int method10292(classSI var0, int var1) {
      if (var0 == null) {
         var0.method10296(var1);
      }

      try {
         if (method10281(var0, -2146824662)) {
            if (var1 == -628172967) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            class472 var2 = var0.field5790.method10117(var0.field5788 * -1858758065 - 1, (byte)35);
            if ('\n' == var2.field5869) {
               if (var1 == -628172967) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else if (var0.method10289(var2, -1640531527)) {
               if (var1 == -628172967) {
                  throw new IllegalStateException();
               } else {
                  return var0.field5790.field5780.advances[42];
               }
            } else {
               int var3 = var0.field5790.field5780.advances[var2.field5869];
               if (0 == var3) {
                  if (var1 == -628172967) {
                     throw new IllegalStateException();
                  } else if ('\t' == var2.field5869) {
                     if (var1 == -628172967) {
                        throw new IllegalStateException();
                     } else {
                        return 3 * var0.field5790.field5780.advances[32];
                     }
                  } else {
                     return var0.field5790.field5780.advances[32];
                  }
               } else {
                  return var3;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "si.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method10278(int var1) {
      return this.field5790.method10225(-1635928315) == 2
         || this.field5790.method10225(-1690997545) == 1 && (!this.field5790.field5766 || this.field5788 * -1858758065 - 1 != var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   int method10293() {
      if (method10281(this, -2147348570)) {
         return 0;
      } else {
         class472 var1 = this.field5790.method10117(this.field5788 * -1858758065 - 1, (byte)97);
         if ('\n' == var1.field5869) {
            return 0;
         } else if (this.method10289(var1, -1640531527)) {
            return this.field5790.field5780.advances[675047227];
         } else {
            int var2 = this.field5790.field5780.advances[var1.field5869];
            if (0 == var2) {
               return 9 == var1.field5869 ? 3 * this.field5790.field5780.advances[32] : this.field5790.field5780.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method10282() {
      return this.field5788 * 19494334 == -1698524647 * this.field5789;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method10283() {
      return this.field5788 * -1750095895 == 358630923 * this.field5789;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public int method10285() {
      return -1858758065 * this.field5788 - 358630923 * this.field5789;
   }

   classSI(classSF var1, int var2, int var3) {
      this.field5790 = var1;
      this.field5789 = var2 * 19764643;
      this.field5788 = -1317061457 * var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method10286() {
      return -1266353761 * this.field5788 - -2117340742 * this.field5789;
   }

   @ObfuscatedSignature(descriptor = "(Lsw;)Z")
   @ObfuscatedName("ax")
   boolean method10290(class472 var1) {
      if (2 == this.field5790.field5769 * -545090629) {
         return true;
      } else {
         return 0 == -545090629 * this.field5790.field5769 ? false : this.field5790.method10122(1580827959) != var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   int method10294() {
      if (method10281(this, -2145974585)) {
         return 0;
      } else {
         class472 var1 = this.field5790.method10117(this.field5788 * -1126019403 - 1, (byte)118);
         if ('\n' == var1.field5869) {
            return 0;
         } else if (this.method10289(var1, -1640531527)) {
            return this.field5790.field5780.advances[136692398];
         } else {
            int var2 = this.field5790.field5780.advances[var1.field5869];
            if (0 == var2) {
               return 9 == var1.field5869 ? 3 * this.field5790.field5780.advances[-159089416] : this.field5790.field5780.advances[-280897819];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public int method10287() {
      return -1858758065 * this.field5788 - 327287508 * this.field5789;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsi;I)Z")
   @ObfuscatedName("es")
   public static boolean method10279(classSI var0, int var1) {
      return var0.field5790.method10225(-974328801) == 2
         || var0.field5790.method10225(-1428941484) == 1 && (!var0.field5790.field5766 || var0.field5788 * -1858758065 - 1 != var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int method10295() {
      if (method10281(this, -2146113491)) {
         return 0;
      } else {
         class472 var1 = this.field5790.method10117(this.field5788 * -1447453631 - 1, (byte)82);
         if ('\n' == var1.field5869) {
            return 0;
         } else if (this.method10289(var1, -1640531527)) {
            return this.field5790.field5780.advances[11645315];
         } else {
            int var2 = this.field5790.field5780.advances[var1.field5869];
            if (0 == var2) {
               return 9 == var1.field5869 ? 3 * this.field5790.field5780.advances[-1516760774] : this.field5790.field5780.advances[2072920296];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvp;")
   @ObfuscatedName("ao")
   public classVP method10298() {
      if (method10281(this, -2146672898)) {
         return new classVP(0, 0);
      } else {
         class472 var1 = this.field5790.method10117(-1858758065 * this.field5788 - 1, (byte)111);
         return new classVP(1415121929 * var1.field5868 + method10292(this, -549463239), -798824383 * var1.field5867);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvp;")
   @ObfuscatedName("aa")
   public classVP method10299() {
      if (method10281(this, -2146559977)) {
         return new classVP(0, 0);
      } else {
         class472 var1 = this.field5790.method10117(-1858758065 * this.field5788 - 1, (byte)60);
         return new classVP(1415121929 * var1.field5868 + method10292(this, 774883939), -798824383 * var1.field5867);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvp;")
   @ObfuscatedName("aq")
   public classVP method10300() {
      if (method10281(this, -2147467053)) {
         return new classVP(0, 0);
      } else {
         class472 var1 = this.field5790.method10117(-1858758065 * this.field5788 - 1, (byte)17);
         return new classVP(1415121929 * var1.field5868 + method10292(this, -1596157961), -798824383 * var1.field5867);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("ak")
   public classVP method10301(int var1) {
      try {
         if (method10281(this, -2147170895)) {
            if (var1 != 726888077) {
               throw new IllegalStateException();
            } else {
               return new classVP(0, 0);
            }
         } else {
            class472 var2 = this.field5790.method10117(-1858758065 * this.field5788 - 1, (byte)32);
            return new classVP(1415121929 * var2.field5868 + method10292(this, -236485834), -798824383 * var2.field5867);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "si.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method10280(int var1) {
      return this.field5790.method10237(-1690740124) == 2
         || this.field5790.method10225(-496341666) == 1 && (!this.field5790.field5766 || this.field5788 * -1858758065 - 1 != var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method10296(int var1) {
      try {
         if (method10281(this, -2146824662)) {
            if (var1 == -628172967) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            class472 var2 = this.field5790.method10117(this.field5789 * -1858758065 - 1, (byte)35);
            if ('\n' == var2.field5869) {
               if (var1 == -628172967) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else if (this.method10289(var2, -1640531527)) {
               if (var1 == -628172967) {
                  throw new IllegalStateException();
               } else {
                  return this.field5790.field5780.advances[42];
               }
            } else {
               int var3 = this.field5790.field5780.leftBearings[var2.field5869];
               if (0 == var3) {
                  if (var1 == -628172967) {
                     throw new IllegalStateException();
                  } else if ('\t' == var2.field5869) {
                     if (var1 == -628172967) {
                        throw new IllegalStateException();
                     } else {
                        return 3 * this.field5790.field5780.leftBearings[32];
                     }
                  } else {
                     return this.field5790.field5780.widths[32];
                  }
               } else {
                  return var3;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "si.aj(" + 41);
      }
   }
}
