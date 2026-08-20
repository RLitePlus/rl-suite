import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tt")
public class classTT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6232 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6231 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6233 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6234 = 4;
   @ObfuscatedName("ax")
   int[] field6230 = new int[112];
   @ObfuscatedName("ac")
   int[] field6229 = new int[192];
   @ToRemove(unused = "true")
   @ObfuscatedName("dy")
   public static final int field6235 = 104;

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ah")
   public boolean method11150(char var1) {
      return this.method11157(var1, 1890044400) && (this.field6229[var1] == 2 || 3 == this.field6229[var1]);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("az")
   public void method11132(int var1, int var2, int var3) {
      try {
         if (this.method11153(var1, 120041229)) {
            if (var3 <= 1326720602) {
               throw new IllegalStateException();
            }

            if (this.method11159(var2, 1677759112)) {
               if (var3 <= 1326720602) {
                  return;
               }

               this.field6230[var1] = var2;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "tt.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CIB)V")
   @ObfuscatedName("af")
   public void method11136(char var1, int var2, byte var3) {
      try {
         if (this.method11157(var1, 1690223281) && this.method11159(var2, -677813658)) {
            if (var3 <= 0) {
               return;
            }

            this.field6229[var1] = var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "tt.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public int method11138(int var1, int var2) {
      try {
         if (this.method11153(var1, 120041229)) {
            if (var2 <= -1030414496) {
               throw new IllegalStateException();
            } else {
               return this.field6230[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)V")
   @ObfuscatedName("ad")
   public void method11137(char var1, int var2) {
      if (this.method11157(var1, 1902939094) && this.method11159(var2, 988611010)) {
         this.field6229[var1] = var2;
      }
   }

   public classTT() {
      Arrays.fill(this.field6230, 3);
      Arrays.fill(this.field6229, 3);
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("as")
   public boolean method11147(char var1, int var2) {
      try {
         if (this.method11157(var1, 2065992043)) {
            if (var2 >= -1354864661) {
               throw new IllegalStateException();
            }

            if (this.field6229[var1] == 1) {
               return true;
            }

            if (3 == this.field6229[var1]) {
               if (var2 >= -1354864661) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   public boolean method11149(int var1, int var2) {
      try {
         if (this.method11153(var1, 120041229)) {
            if (var2 >= 357511497) {
               throw new IllegalStateException();
            }

            if (2 == this.field6230[var1]) {
               return true;
            }

            if (var2 >= 357511497) {
               throw new IllegalStateException();
            }

            if (this.field6230[var1] == 3) {
               if (var2 >= 357511497) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ac")
   public boolean method11151(char var1, int var2) {
      try {
         if (this.method11157(var1, 1893354406)) {
            if (var2 != 731299091) {
               throw new IllegalStateException();
            }

            if (this.field6229[var1] == 2) {
               return true;
            }

            if (var2 != 731299091) {
               throw new IllegalStateException();
            }

            if (3 == this.field6229[var1]) {
               if (var2 != 731299091) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;II)Z")
   @ObfuscatedName("jr")
   public static boolean method11144(classTT var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11156(var1, var1);
      }

      try {
         if (var0.method11153(var1, 120041229)) {
            if (var2 >= -1687866249) {
               throw new IllegalStateException();
            }

            if (var0.field6230[var1] == 1 || var0.field6230[var1] == 3) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("al")
   boolean method11153(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return true;
            }

            if (var2 != 120041229) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ao")
   boolean method11157(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1562555760) {
               throw new IllegalStateException();
            }

            if (var1 < 192) {
               return true;
            }

            if (var2 <= 1562555760) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aa")
   boolean method11159(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -1191008513) {
               throw new IllegalStateException();
            }

            if (var1 < 4) {
               return true;
            }

            if (var2 == -1191008513) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid mode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   public void method11133(int var1, int var2) {
      if (this.method11153(var1, 120041229) && this.method11159(var2, 256763138)) {
         this.field6230[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   public void method11134(int var1, int var2) {
      if (this.method11153(var1, 120041229) && this.method11159(var2, 1740472912)) {
         this.field6230[var1] = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;C)Z")
   @ObfuscatedName("pu")
   public static boolean method11148(classTT var0, char var1) {
      return var0 == null ? var0.method11150(var1) : var0.method11157(var1, 2110384787) && (var0.field6229[var1] == 1 || 3 == var0.field6229[var1]);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   public void method11135(int var1, int var2) {
      if (this.method11153(var1, 120041229) && this.method11159(var2, -2111500041)) {
         this.field6230[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method11139(int var1) {
      return this.method11153(var1, 120041229) ? this.field6230[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("aw")
   public int method11142(char var1) {
      return this.method11157(var1, 1903195633) ? this.field6229[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   public boolean method11145(int var1) {
      return this.method11153(var1, 120041229) && (this.field6230[var1] == 1 || this.field6230[var1] == 3);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method11146(int var1) {
      return this.method11153(var1, 120041229) && (this.field6230[var1] == 1 || this.field6230[var1] == 3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;I)I")
   @ObfuscatedName("rv")
   public static int method11140(classTT var0, int var1) {
      if (var0 == null) {
         var0.method11132(var1, var1, var1);
      }

      return var0.method11153(var1, 120041229) ? var0.field6230[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("am")
   public boolean method11152(char var1) {
      return this.method11157(var1, 1814642560) && (this.field6229[var1] == 2 || 3 == this.field6229[var1]);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bp")
   boolean method11160(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bn")
   boolean method11154(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;I)Z")
   @ObfuscatedName("ik")
   public static boolean method11161(classTT var0, int var1) {
      if (var0 == null) {
         var0.method11134(var1, var1);
      }

      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bx")
   boolean method11155(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bc")
   boolean method11158(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("br")
   boolean method11162(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public int method11141(int var1) {
      return this.method11153(var1, 120041229) ? this.field6230[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bm")
   boolean method11163(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("aj")
   public static boolean method11165(char var0, int var1) {
      try {
         if (var0 >= 'A') {
            if (var1 >= -1133777048) {
               throw new IllegalStateException();
            }

            if (var0 <= 'Z') {
               return true;
            }

            if (var1 >= -1133777048) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 'a') {
            if (var1 >= -1133777048) {
               throw new IllegalStateException();
            }

            if (var0 <= 'z') {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "tt.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bg")
   boolean method11164(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)I")
   @ObfuscatedName("ab")
   public int method11143(char var1, int var2) {
      try {
         if (this.method11157(var1, 1594031959)) {
            if (var2 <= -1784280523) {
               throw new IllegalStateException();
            } else {
               return this.field6229[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ff")
   static boolean method11166(int var0) {
      try {
         return client.field975;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "tt.ff(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   public boolean method11156(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != 120041229) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return true;
            }

            if (var2 != 120041229) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tt.aa(" + ')');
      }
   }
}
