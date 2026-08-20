import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tw")
public class classTW implements classXZ {
   @ObfuscatedName("ao")
   final int field6245;
   @ObfuscatedName("as")
   final int field6244;
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("ae")
   static final classTW field6241 = new classTW(2, 2, 338, 338, 338, 507);
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("ab")
   static final classTW field6242 = new classTW(3, 3, 499, 499, 499, 507);
   @ObfuscatedName("ag")
   final int field6246;
   @ObfuscatedName("aa")
   final int field6249;
   @ObfuscatedName("ax")
   final int field6248;
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("af")
   public static final classTW field6243 = new classTW(1, 1, 507, 507, 507, 507);
   @ObfuscatedName("ac")
   final int field6247;
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("az")
   static final classTW field6240 = new classTW(0, 0, 0, 0, 0, 0);
   @ObfuscatedSignature(descriptor = "Lmh;")
   @ObfuscatedName("rz")
   static classMH field6250;

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bj")
   public boolean method11190(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6249 * -1476915659, var1, var2, var3, (byte)-62);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -953101483 * this.field6245;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tw.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZB)Z")
   @ObfuscatedName("as")
   boolean method11170(int var1, boolean var2, boolean var3, boolean var4, byte var5) {
      try {
         int var6 = 0;
         byte var10001;
         if (var3) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         if (var2) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            var10001 = (byte)8;
         } else {
            var10001 = (byte)32;
         }

         var6 |= var10001;
         if (var4) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            var10001 = 128;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         return (var1 & var6) != 0;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "tw.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZB)Z")
   @ObfuscatedName("ax")
   boolean method11175(int var1, boolean var2, boolean var3, boolean var4, byte var5) {
      try {
         int var6 = 0;
         byte var10001;
         if (var3) {
            if (var5 >= 31) {
               throw new IllegalStateException();
            }

            var10001 = 2;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         if (var2) {
            if (var5 >= 31) {
               throw new IllegalStateException();
            }

            var10001 = (byte)16;
         } else {
            var10001 = (byte)64;
         }

         var6 |= var10001;
         if (var4) {
            if (var5 >= 31) {
               throw new IllegalStateException();
            }

            var10001 = 256;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         boolean var10000;
         if (0 != (var1 & var6)) {
            if (var5 >= 31) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "tw.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ltw;")
   @ObfuscatedName("ad")
   public static classTW[] method11167() {
      return new classTW[]{field6240, field6243, field6241, field6242};
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("ac")
   public boolean method11178(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11170(this.field6244 * -1207890233, var1, var2, var3, (byte)-95);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(JIIB)J")
   @ObfuscatedName("ac")
   public static long method11207(long var0, int var2, int var3, byte var4) {
      try {
         long var5 = classOW.method8807(var3 - var2 + 1, 1890737205);
         var5 <<= var2;
         return var0 | var5;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "tw.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -953101483 * this.field6245;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -953101483 * this.field6245;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("vl")
   public static boolean method11179(classTW var0, boolean var1, boolean var2, boolean var3) {
      if (var0 == null) {
         var0.method11195(var1, var1, var1);
      }

      return var0.method11170(var0.field6244 * -1207890233, var1, var2, var3, (byte)-53);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -953101483 * this.field6245;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ltw;")
   @ObfuscatedName("ap")
   public static classTW[] method11168() {
      return new classTW[]{field6240, field6243, field6241, field6242};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ltw;")
   @ObfuscatedName("au")
   public static classTW[] method11169() {
      return new classTW[]{field6240, field6243, field6241, field6242};
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("ai")
   boolean method11171(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 456248824 : 0;
      return (var1 & var5) != 0;
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("ar")
   boolean method11172(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 128 : 0;
      return (var1 & var5) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("vo")
   public static boolean method11196(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11175(-1207890233 * var0.field6244, var1, var2, var3, (byte)-106);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bk")
   public boolean method11191(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6249 * -1476915659, var1, var2, var3, (byte)-78);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bb")
   public boolean method11200(boolean var1, boolean var2, boolean var3) {
      return this.method11175(-144564437 * this.field6248, var1, var2, var3, (byte)-20);
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("aj")
   public boolean method11197(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11175(-1207890233 * this.field6244, var1, var2, var3, (byte)-93);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.aj(" + ')');
      }
   }

   classTW(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6246 = var1 * -298460797;
      this.field6245 = var2 * 1625068029;
      this.field6244 = var3 * 1254707959;
      this.field6248 = -1071650011 * var4;
      this.field6247 = 1342327995 * var5;
      this.field6249 = -823569379 * var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lms;)I")
   @ObfuscatedName("zv")
   public static int method11186(classMS var0) {
      return var0.field4574 * -1327391966;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("yh")
   public static boolean method11187(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11170(var0.field6247 * 568016088, var1, var2, var3, (byte)-94);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("at")
   public boolean method11180(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6244 * -1207890233, var1, var2, var3, (byte)-127);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bn")
   public boolean method11183(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6248 * 1369847981, var1, var2, var3, (byte)-67);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("br")
   public boolean method11188(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6247 * 2113017971, var1, var2, var3, (byte)-64);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("am")
   public boolean method11181(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6244 * -1207890233, var1, var2, var3, (byte)-109);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("gd")
   public static boolean method11201(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11175(1369847981 * var0.field6248, var1, var2, var3, (byte)-127);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;IZZZ)Z")
   @ObfuscatedName("zk")
   public static boolean method11173(classTW var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method11200(var2, var2, var2);
      }

      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 128 : 0;
      return (var1 & var5) != 0;
   }

   @ObfuscatedSignature(descriptor = "(Ltw;ZZZI)Z")
   @ObfuscatedName("zu")
   public static boolean method11202(classTW var0, boolean var1, boolean var2, boolean var3, int var4) {
      if (var0 == null) {
         return var0.method11185(var1, var1, var1, var4);
      } else {
         try {
            return var0.method11175(1369847981 * var0.field6248, var1, var2, var3, (byte)-34);
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "tw.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bt")
   public boolean method11192(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6249 * 1299832707, var1, var2, var3, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(Ltw;ZZZB)Z")
   @ObfuscatedName("jm")
   public static boolean method11204(classTW var0, boolean var1, boolean var2, boolean var3, byte var4) {
      if (var0 == null) {
         return var0.method11206(var1, var1, var1, var4);
      } else {
         try {
            return var0.method11175(var0.field6247 * 2113017971, var1, var2, var3, (byte)-61);
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "tw.aq(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bg")
   public boolean method11193(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6249 * -1884258484, var1, var2, var3, (byte)-32);
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("aa")
   public boolean method11184(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11170(this.field6248 * 1369847981, var1, var2, var3, (byte)-90);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bw")
   public boolean method11203(boolean var1, boolean var2, boolean var3) {
      return this.method11175(1940103104 * this.field6248, var1, var2, var3, (byte)-106);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bo")
   public boolean method11198(boolean var1, boolean var2, boolean var3) {
      return this.method11175(-1207890233 * this.field6244, var1, var2, var3, (byte)-62);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bu")
   public boolean method11199(boolean var1, boolean var2, boolean var3) {
      return this.method11175(-1207890233 * this.field6244, var1, var2, var3, (byte)-6);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("an")
   public boolean method11182(boolean var1, boolean var2, boolean var3) {
      return this.method11170(this.field6244 * -1552051970, var1, var2, var3, (byte)-25);
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("aw")
   boolean method11174(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 128 : 0;
      return (var1 & var5) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;IZZZ)Z")
   @ObfuscatedName("qx")
   public static boolean method11176(classTW var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         return var0.method11177(var1, var2, var2, var2);
      } else {
         int var5 = 0;
         var5 |= var3 ? 2 : 0;
         var5 |= var2 ? 16 : 64;
         var5 |= var4 ? 148939176 : 0;
         return 0 != (var1 & var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvl;IIIII)Z")
   @ObfuscatedName("ag")
   static boolean method11208(classVL var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var7 = var0.method11989((byte)42);
         int var8 = classVL.method11982(var0, -655911622);
         int var9 = var0.method11986(-2138789083);
         int var10 = Math.max(var1, Math.min(var8, var3));
         int var11 = Math.max(var2, Math.min(var9, var4));
         int var12 = var8 - var10;
         int var13 = var9 - var11;
         boolean var10000;
         if (var13 * var13 + var12 * var12 <= var7) {
            if (var5 == 1616155503) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "tw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bq")
   public boolean method11205(boolean var1, boolean var2, boolean var3) {
      return this.method11175(this.field6247 * 2113017971, var1, var2, var3, (byte)-70);
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("al")
   public boolean method11194(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11170(this.field6249 * -1476915659, var1, var2, var3, (byte)-21);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cg")
   static boolean method11210(int var0) {
      try {
         boolean var10000;
         if (0 != (-1072700981 * client.field852 & 2)) {
            if (var0 != -811881628) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tw.cg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("ao")
   public boolean method11189(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11170(this.field6247 * 2113017971, var1, var2, var3, (byte)-84);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ao")
   public static void method11209(byte var0) {
      try {
         classFO.field2346 = false;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "tw.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("ah")
   public boolean method11195(boolean var1, boolean var2, boolean var3) {
      return this.method11175(this.field6245 * -1884258484, var1, var2, var3, (byte)-32);
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("av")
   boolean method11177(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 2 : 0;
      var5 |= var2 ? 16 : 64;
      var5 |= var4 ? 148939176 : 0;
      return 0 != (var1 & var5);
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("ay")
   public boolean method11185(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11170(this.field6248 * 1369847981, var1, var2, var3, (byte)-90);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("aq")
   public boolean method11206(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11170(this.field6244 * 2113017971, var1, var2, var3, (byte)-61);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "tw.aq(" + ')');
      }
   }
}
