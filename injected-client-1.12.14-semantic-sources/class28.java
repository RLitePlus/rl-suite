import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bg")
public class class28 {
   @ObfuscatedName("cu")
   static int otpMedium;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field162 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field161 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field164 = 60;
   @ObfuscatedName("aw")
   int[] field159;
   @ObfuscatedName("ak")
   int[] field160 = new int[112];
   @ObfuscatedName("um")
   static int field166;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final String field167 = "rw";
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field163 = 0;

   public class28() {
      this.field159 = new int[192];
      Arrays.fill(this.field160, 3);
      Arrays.fill(this.field159, 3);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   public boolean method507(int var1) {
      return method520(this, var1, -1375999259) && (2 == this.field160[var1] || this.field160[var1] == 3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;C)I")
   @ObfuscatedName("mu")
   public static int method496(class28 var0, char var1) {
      if (var0 == null) {
         var0.method504(var1);
      }

      return var0.method522(var1, -1005624215) ? var0.field159[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(CI)I")
   @ObfuscatedName("an")
   public int method497(char var1, int var2) {
      try {
         return this.method522(var1, -1005624215) ? this.field159[var1] : 0;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   public boolean method500(int var1, int var2) {
      try {
         if (method520(this, var1, -2048877957)) {
            if (1 != this.field160[var1]) {
               if (var2 >= 1088857617) {
                  throw new IllegalStateException();
               }

               if (this.field160[var1] != 3) {
                  return false;
               }

               if (var2 >= 1088857617) {
                  throw new IllegalStateException();
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)I")
   @ObfuscatedName("av")
   static int method530(AbstractArchive var0, AbstractArchive var1, int var2) {
      try {
         int var3 = 0;
         String[] var4 = Login.field405;

         for (int var5 = 0; var5 < var4.length; var5++) {
            if (var2 >= -449173548) {
               throw new IllegalStateException();
            }

            String var6 = var4[var5];
            if (var0.tryLoadFileByNames(var6, "", 244325688)) {
               if (var2 >= -449173548) {
                  throw new IllegalStateException();
               }

               var3++;
            }
         }

         var4 = Login.field383;

         for (int var10 = 0; var10 < var4.length; var10++) {
            if (var2 >= -449173548) {
               throw new IllegalStateException();
            }

            String var12 = var4[var10];
            if (var1.tryLoadFileByNames(var12, "", 253930308)) {
               var3++;
            }
         }

         var4 = Login.field407;

         for (int var11 = 0; var11 < var4.length; var11++) {
            if (var2 >= -449173548) {
               throw new IllegalStateException();
            }

            String var13 = var4[var11];
            if (var1.groupLoadPercentByName(var13, (byte)-23) != -1) {
               if (var2 >= -449173548) {
                  throw new IllegalStateException();
               }

               if (var1.tryLoadFileByNames(var13, "", 242888987)) {
                  if (var2 >= -449173548) {
                     throw new IllegalStateException();
                  }

                  var3++;
               }
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bg.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   boolean method516(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("aj")
   public boolean method503(char var1, int var2) {
      try {
         if (this.method522(var1, -1005624215)) {
            if (var2 >= 1104433755) {
               throw new IllegalStateException();
            }

            if (1 == this.field159[var1] || 3 == this.field159[var1]) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ak")
   public boolean method508(int var1, int var2) {
      try {
         if (method520(this, var1, -896834913)) {
            if (var2 == -1370964906) {
               throw new IllegalStateException();
            }

            if (2 == this.field160[var1]) {
               return true;
            }

            if (var2 == -1370964906) {
               throw new IllegalStateException();
            }

            if (this.field160[var1] == 3) {
               if (var2 == -1370964906) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("au")
   boolean method526(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 4) {
               throw new IllegalStateException();
            }

            if (var1 < 4) {
               return true;
            }

            if (var2 <= 4) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid mode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ay")
   boolean method522(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 192) {
               return true;
            }

            if (var2 != -1005624215) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;I)Z")
   @ObfuscatedName("gp")
   public static boolean method517(class28 var0, int var1) {
      if (var0 == null) {
         var0.method502(var1);
      }

      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method490(int var1) {
      return method520(this, var1, -1138046840) ? this.field160[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public int method491(int var1) {
      return method520(this, var1, -1076732400) ? this.field160[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method492(int var1) {
      return method520(this, var1, 885829808) ? this.field160[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bt")
   boolean method523(char var1) {
      if (var1 >= 0 && var1 < -941734342) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bm")
   boolean method518(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   public boolean method501(int var1) {
      return method520(this, var1, -578213696) && (1 == this.field160[var1] || this.field160[var1] == 3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;C)Z")
   @ObfuscatedName("hv")
   public static boolean method511(class28 var0, char var1) {
      return var0 == null ? var0.method513(var1) : var0.method522(var1, -1005624215) && (2 == var0.field159[var1] || 3 == var0.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(Lbg;CI)Z")
   @ObfuscatedName("ii")
   public static boolean method512(class28 var0, char var1, int var2) {
      if (var0 == null) {
         return var0.method525(var1, var2);
      } else {
         try {
            if (var0.method522(var1, -1005624215)) {
               if (var2 <= -420867461) {
                  throw new IllegalStateException();
               }

               if (2 == var0.field159[var1]) {
                  return true;
               }

               if (var2 <= -420867461) {
                  throw new IllegalStateException();
               }

               if (3 == var0.field159[var1]) {
                  return true;
               }
            }

            return false;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "bg.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("am")
   public boolean method504(char var1) {
      return this.method522(var1, -1005624215) && (1 == this.field159[var1] || 3 == this.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ao")
   public boolean method505(char var1) {
      return this.method522(var1, -1005624215) && (1 == this.field159[var1] || 3 == this.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aa")
   public boolean method506(char var1) {
      return this.method522(var1, -1005624215) && (1 == this.field159[var1] || 3 == this.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   public boolean method502(int var1) {
      return method520(this, var1, -721818879) && (1 == this.field160[var1] || this.field160[var1] == 3);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("be")
   public boolean method509(int var1) {
      return method520(this, var1, 2106168801) && (2 == this.field160[var1] || this.field160[var1] == 3);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ag")
   public int method493(int var1, byte var2) {
      try {
         if (method520(this, var1, 2009973436)) {
            if (var2 != 12) {
               throw new IllegalStateException();
            } else {
               return this.field160[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bs")
   public boolean method513(char var1) {
      return this.method522(var1, -1005624215) && (2 == this.field159[var1] || 3 == this.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bz")
   public boolean method514(char var1) {
      return this.method522(var1, -1005624215) && (2 == this.field159[var1] || 3 == this.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bb")
   boolean method519(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("ah")
   public int method498(char var1) {
      return this.method522(var1, -1005624215) ? this.field159[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lbg;II)Z")
   @ObfuscatedName("le")
   public static boolean method520(class28 var0, int var1, int var2) {
      if (var0 == null) {
         var0.method521(var1, var1);
      }

      try {
         if (var1 >= 0) {
            if (var1 < 112) {
               return true;
            }

            if (var2 == 130094391) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bp")
   boolean method524(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(CII)V")
   @ObfuscatedName("at")
   public void method488(char var1, int var2, int var3) {
      try {
         if (this.method522(var1, -1005624215)) {
            if (var3 != -371900800) {
               throw new IllegalStateException();
            }

            if (this.method526(var2, (byte)20)) {
               if (var3 != -371900800) {
                  throw new IllegalStateException();
               }

               this.field159[var1] = var2;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bg.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbg;III)V")
   @ObfuscatedName("wp")
   public static void method486(class28 var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method487(var1, var1, var1);
      }

      try {
         if (method520(var0, var1, -2018837916)) {
            if (var3 == 921778921) {
               throw new IllegalStateException();
            }

            if (var0.method526(var2, (byte)116)) {
               if (var3 == 921778921) {
                  return;
               }

               var0.field160[var1] = var2;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bg.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;C)Z")
   @ObfuscatedName("xb")
   public static boolean method515(class28 var0, char var1) {
      if (var0 == null) {
         var0.method514(var1);
      }

      return var0.method522(var1, -1005624215) && (2 == var0.field159[var1] || 3 == var0.field159[var1]);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bu")
   boolean method527(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ba")
   boolean method528(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bi")
   boolean method529(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)V")
   @ObfuscatedName("ad")
   public void method489(char var1, int var2) {
      if (this.method522(var1, -1005624215) && this.method526(var2, (byte)44)) {
         this.field159[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)I")
   @ObfuscatedName("ao")
   static int method532(Widget var0, byte var1) {
      try {
         if (var0.type * 928687775 != 11) {
            if (var1 == 13) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
               return 1;
            }
         } else {
            String var2 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Widget.method8119(
               var0, var2, 689900449
            );
            return 1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ao(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhb;Lxa;I)V")
   @ObfuscatedName("it")
   public static void method510(EnumComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4454(var1, var2);
      } else {
         if (var2 == 1) {
            var0.outputType = (char)var1.readUnsignedByte(522339916);
         } else if (var2 == 2) {
            var0.inputType = (char)var1.readUnsignedByte(1130741720);
         } else if (3 == var2) {
            var0.defaultStr = var1.readStringCp1252NullCircumfixed(1659560470);
         } else if (var2 == 4) {
            var0.defaultInt = Buffer.method12015(var1, -858633336) * -1746304735;
         } else if (var2 == 5) {
            var0.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            var0.keys = new int[var0.outputCount * -132553189];
            var0.strVals = new String[-132553189 * var0.outputCount];

            for (int var3 = 0; var3 < var0.outputCount * -132553189; var3++) {
               var0.keys[var3] = Buffer.method12015(var1, -483604044);
               var0.strVals[var3] = var1.readStringCp1252NullCircumfixed(-300609246);
            }
         } else if (var2 == 6) {
            var0.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            var0.keys = new int[-132553189 * var0.outputCount];
            var0.intVals = new int[var0.outputCount * -132553189];

            for (int var4 = 0; var4 < var0.outputCount * -132553189; var4++) {
               var0.keys[var4] = Buffer.method12015(var1, 1366332459);
               var0.intVals[var4] = Buffer.method12015(var1, -121253151);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[IB)V")
   @ObfuscatedName("ag")
   public static void method499(String[] var0, int[] var1, byte var2) {
      try {
         WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1, 1319722408);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;I)I")
   @ObfuscatedName("zx")
   public static int method494(class28 var0, int var1) {
      if (var0 == null) {
         return var0.method495(var1);
      } else {
         return method520(var0, var1, 611913496) ? var0.field160[var1] : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("nu")
   public static void method531(Varcs var0) {
      if (var0 == null) {
         var0.method3158();
      } else {
         if (var0.unwrittenChanges && var0.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
            var0.write(141939197);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("av")
   public void method487(int var1, int var2, int var3) {
      try {
         if (method520(this, var1, -2018837916)) {
            if (var3 == 921778921) {
               throw new IllegalStateException();
            }

            if (this.method526(var2, (byte)116)) {
               if (var3 == 921778921) {
                  return;
               }

               this.field159[var1] = var2;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bg.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ap")
   boolean method521(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 112) {
               return true;
            }

            if (var2 == 130094391) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("aw")
   public boolean method525(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 192) {
               return true;
            }

            if (var2 != -1005624215) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bg.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public int method495(int var1) {
      return method520(this, var1, -1138046840) ? this.field159[var1] : 0;
   }
}
