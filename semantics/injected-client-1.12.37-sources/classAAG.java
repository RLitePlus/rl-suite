import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aag")
public class classAAG {
   @ObfuscatedSignature(descriptor = "Lzd;")
   @ObfuscatedName("az")
   classZD field51;
   @ObfuscatedName("af")
   int field52 = 0;
   @ObfuscatedName("ae")
   int field50 = 0;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   boolean method197(int var1) {
      return this.field51.method13946(-504149574) == 2
         || this.field51.method13946(-504149574) == 1 && (!this.field51.field7157 || var1 != this.field50 * -1797594471 - 1);
   }

   classAAG(classZD var1, int var2, int var3) {
      this.field51 = var1;
      this.field52 = var2 * -667208831;
      this.field50 = -1761717847 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Ljava/lang/String;")
   @ObfuscatedName("ig")
   public static String method192(classAAG var0) {
      if (var0 == null) {
         var0.method206();
      }

      if (method202(var0, 2089222867)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(var0.method204(-451671175));

         for (int var2 = 809569409 * var0.field52; var2 < var0.field50 * -1797594471; var2++) {
            classAAY var3 = var0.field51.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("af")
   boolean method198(int var1, int var2) {
      try {
         if (this.field51.method13946(-504149574) != 2) {
            if (var2 != 802134516) {
               throw new IllegalStateException();
            }

            if (this.field51.method13946(-504149574) != 1) {
               return false;
            }

            if (var2 != 802134516) {
               throw new IllegalStateException();
            }

            if (this.field51.field7157) {
               if (var2 != 802134516) {
                  throw new IllegalStateException();
               }

               if (var1 == this.field50 * -1797594471 - 1) {
                  return false;
               }

               if (var2 != 802134516) {
                  throw new IllegalStateException();
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aag.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method204(int var1) {
      try {
         return -1797594471 * this.field50 - 809569409 * this.field52;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aag.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laay;B)Z")
   @ObfuscatedName("ag")
   boolean method208(classAAY var1, byte var2) {
      try {
         if (2 == 1736120249 * this.field51.field7155) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return 0 == 1736120249 * this.field51.field7155 ? false : this.field51.method13843((short)1028) != var1;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aag.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Ljava/lang/String;")
   @ObfuscatedName("uw")
   public static String method193(classAAG var0) {
      if (var0 == null) {
         var0.method216();
      }

      if (method202(var0, 380139598)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(var0.method204(1646277131));

         for (int var2 = 809569409 * var0.field52; var2 < var0.field50 * -1797594471; var2++) {
            classAAY var3 = var0.field51.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("as")
   int method211(byte var1) {
      try {
         if (method202(this, -40501120)) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            classAAY var2 = this.field51.method13839(this.field50 * -1797594471 - 1, -1052717093);
            if (var2.field117 == '\n') {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else if (this.method208(var2, (byte)0)) {
               return this.field51.field7170.field24[42];
            } else {
               int var3 = this.field51.field7170.field24[var2.field117];
               if (0 == var3) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  } else if ('\t' == var2.field117) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     } else {
                        return this.field51.field7170.field24[32] * 3;
                     }
                  } else {
                     return this.field51.field7170.field24[32];
                  }
               } else {
                  return var3;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "aag.as(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)I")
   @ObfuscatedName("tw")
   public static int method212(classAAG var0) {
      if (var0 == null) {
         return var0.method213();
      } else if (method202(var0, 521992298)) {
         return 0;
      } else {
         classAAY var1 = var0.field51.method13839(var0.field50 * 1178995802 - 1, -1052717093);
         if (var1.field117 == '\n') {
            return 0;
         } else if (var0.method208(var1, (byte)0)) {
            return var0.field51.field7170.field24[841422121];
         } else {
            int var2 = var0.field51.field7170.field24[var1.field117];
            if (0 == var2) {
               return 9 == var1.field117 ? var0.field51.field7170.field24[32] * 3 : var0.field51.field7170.field24[690659287];
            } else {
               return var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Z")
   @ObfuscatedName("zm")
   public static boolean method201(classAAG var0) {
      return var0.field50 * 254145364 == var0.field52 * -1152205467;
   }

   @ObfuscatedSignature(descriptor = "(B)Lwb;")
   @ObfuscatedName("ax")
   public classWB method214(byte var1) {
      try {
         if (method202(this, 162381082)) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            } else {
               return new classWB(0, 0);
            }
         } else {
            classAAY var2 = this.field51.method13839(this.field50 * -1797594471 - 1, -1052717093);
            return new classWB(var2.field116 * -724223965 + this.method211((byte)-46), var2.field115 * 1839316601);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aag.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Laay;")
   @ObfuscatedName("ac")
   public classAAY method217(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -1182411687) {
               throw new IllegalStateException();
            }

            if (var1 < this.method204(702650816)) {
               return this.field51.method13839(809569409 * this.field52 + var1, -1052717093);
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aag.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method199(int var1) {
      return this.field51.method13946(-504149574) == 2
         || this.field51.method13946(-504149574) == 1 && (!this.field51.field7157 || var1 != this.field50 * -1797594471 - 1);
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("ah")
   public classAAY method218(int var1) {
      return var1 >= 0 && var1 < this.method204(2003133333) ? this.field51.method13839(-2034971800 * this.field52 + var1, -1052717093) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("bx")
   public classAAY method219(int var1) {
      return var1 >= 0 && var1 < this.method204(622339779) ? this.field51.method13839(809569409 * this.field52 + var1, -1052717093) : null;
   }

   @ObfuscatedSignature(descriptor = "(Laay;)Z")
   @ObfuscatedName("ak")
   boolean method209(classAAY var1) {
      if (2 == 1736120249 * this.field51.field7155) {
         return true;
      } else {
         return 0 == 1736120249 * this.field51.field7155 ? false : this.field51.method13843((short)1028) != var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method205() {
      return -1797594471 * this.field50 - 809569409 * this.field52;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Lwb;")
   @ObfuscatedName("vi")
   public static classWB method215(classAAG var0) {
      if (var0 == null) {
         var0.method205();
      }

      if (method202(var0, -625614037)) {
         return new classWB(0, 0);
      } else {
         classAAY var1 = var0.field51.method13839(var0.field50 * -1797594471 - 1, -1052717093);
         return new classWB(var1.field116 * -724223965 + var0.method211((byte)-18), var1.field115 * 1839316601);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method206() {
      return -1797594471 * this.field50 - -520646158 * this.field52;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Ljava/lang/String;")
   @ObfuscatedName("ta")
   public static String method194(classAAG var0) {
      if (var0 == null) {
         var0.method196();
      }

      if (method202(var0, 259500871)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(var0.method204(1747420811));

         for (int var2 = 2060059584 * var0.field52; var2 < var0.field50 * 1483805727; var2++) {
            classAAY var3 = var0.field51.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(Laay;)Z")
   @ObfuscatedName("aw")
   boolean method210(classAAY var1) {
      if (2 == 1736120249 * this.field51.field7155) {
         return true;
      } else {
         return 0 == 1736120249 * this.field51.field7155 ? false : this.field51.method13843((short)1028) != var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method195(int var1) {
      try {
         if (method202(this, -548845540)) {
            if (var1 <= 790991436) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            StringBuilder var2 = new StringBuilder(this.method204(981640296));

            for (int var3 = 809569409 * this.field52; var3 < this.field50 * -1797594471; var3++) {
               classAAY var4 = this.field51.method13839(var3, -1052717093);
               var2.append(var4.field117);
            }

            return var2.toString();
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "aag.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int method213() {
      if (method202(this, 739816661)) {
         return 0;
      } else {
         classAAY var1 = this.field51.method13839(this.field50 * -1797594471 - 1, -1052717093);
         if (var1.field117 == '\n') {
            return 0;
         } else if (this.method208(var1, (byte)0)) {
            return this.field51.field7170.field24[42];
         } else {
            int var2 = this.field51.field7170.field24[var1.field117];
            if (0 == var2) {
               return 9 == var1.field117 ? this.field51.field7170.field24[32] * 3 : this.field51.field7170.field24[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean method200(int var1) {
      return this.field51.method13946(-504149574) == 2
         || this.field51.method13946(-504149574) == 1 && (!this.field51.field7157 || var1 != this.field50 * -1797594471 - 1);
   }

   @ObfuscatedSignature(descriptor = "(Laag;I)Z")
   @ObfuscatedName("vw")
   public static boolean method202(classAAG var0, int var1) {
      if (var0 == null) {
         return var0.method203(var1);
      } else {
         try {
            return var0.field50 * -1797594471 == var0.field52 * 809569409;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "aag.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Laay;")
   @ObfuscatedName("bn")
   public classAAY method220(int var1) {
      return var1 >= 0 && var1 < this.method204(-1470647932) ? this.field51.method13839(-1762447157 * this.field52 + var1, -1052717093) : null;
   }

   @ObfuscatedSignature(descriptor = "()Lwb;")
   @ObfuscatedName("an")
   public classWB method216() {
      if (method202(this, 203633930)) {
         return new classWB(0, 0);
      } else {
         classAAY var1 = this.field51.method13839(this.field50 * 1024756913 - 1, -1052717093);
         return new classWB(var1.field116 * -724223965 + this.method211((byte)-25), var1.field115 * -718097411);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method196() {
      if (method202(this, 259500871)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method204(1747420811));

         for (int var2 = 2060059584 * this.field52; var2 < this.field52 * 1483805727; var2++) {
            classAAY var3 = this.field51.method13839(var2, -1052717093);
            var1.append(var3.field117);
         }

         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method207() {
      return 648326113 * this.field52 - 1766285715 * this.field52;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean method203(int var1) {
      try {
         return this.field52 * -1797594471 == this.field52 * 809569409;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aag.ae(" + ')');
      }
   }
}
