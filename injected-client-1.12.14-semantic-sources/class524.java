import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uf")
public class class524 implements Enum {
   @ObfuscatedSignature(descriptor = "Luf;")
   @ObfuscatedName("at")
   public static final class524 field6036 = new class524(1, 1, 507, 507, 507, 507);
   @ObfuscatedSignature(descriptor = "Luf;")
   @ObfuscatedName("av")
   static final class524 field6034 = new class524(0, 0, 0, 0, 0, 0);
   @ObfuscatedSignature(descriptor = "Luf;")
   @ObfuscatedName("ag")
   static final class524 field6037 = new class524(2, 2, 338, 338, 338, 507);
   @ObfuscatedName("aw")
   final int field6039;
   @ObfuscatedName("ae")
   final int field6043;
   @ObfuscatedName("aj")
   final int field6040;
   @ObfuscatedName("ak")
   final int field6041;
   @ObfuscatedSignature(descriptor = "Luf;")
   @ObfuscatedName("an")
   static final class524 field6035 = new class524(3, 3, 499, 499, 499, 507);
   @ObfuscatedName("ap")
   final int field6042;
   @ObfuscatedName("ay")
   final int field6038;

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bu")
   public boolean method11155(boolean var1, boolean var2, boolean var3) {
      return this.method11135(-884512677 * this.field6039, var1, var2, var3, (byte)-41);
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("az")
   public boolean method11152(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11135(-784785121 * this.field6041, var1, var2, var3, (byte)-40);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZI)Z")
   @ObfuscatedName("aj")
   boolean method11129(int var1, boolean var2, boolean var3, boolean var4, int var5) {
      try {
         int var6 = 0;
         var6 |= var3 ? 1 : 0;
         byte var10001;
         if (var2) {
            if (var5 <= 317784270) {
               throw new IllegalStateException();
            }

            var10001 = 8;
         } else {
            var10001 = 32;
         }

         var6 |= var10001;
         if (var4) {
            if (var5 <= 317784270) {
               throw new IllegalStateException();
            }

            var10001 = 128;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         boolean var10000;
         if (0 != (var1 & var6)) {
            if (var5 <= 317784270) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "uf.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZB)Z")
   @ObfuscatedName("ak")
   boolean method11135(int var1, boolean var2, boolean var3, boolean var4, byte var5) {
      try {
         int var6 = 0;
         byte var10001;
         if (var3) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var10001 = 2;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         if (var2) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var10001 = (byte)16;
         } else {
            var10001 = (byte)64;
         }

         var6 |= var10001;
         if (var4) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var10001 = 256;
         } else {
            var10001 = 0;
         }

         var6 |= var10001;
         boolean var10000;
         if (0 != (var1 & var6)) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "uf.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("ap")
   public boolean method11150(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11135(this.field6040 * 258686257, var1, var2, var3, (byte)-126);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -1567378527 * this.field6038;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "uf.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("er")
   public static int method11159(WorldMapArea var0) {
      return -263036313 * var0.origin.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;ZZZ)Z")
   @ObfuscatedName("re")
   public static boolean method11156(class524 var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11135(-884512677 * var0.field6039, var1, var2, var3, (byte)-37);
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("aw")
   public boolean method11144(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11129(this.field6039 * -884512677, var1, var2, var3, 881751837);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("ay")
   public boolean method11145(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11129(this.field6042 * 1440885129, var1, var2, var3, 878983397);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("be")
   boolean method11136(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 2 : 0;
      var5 |= var2 ? 16 : 64;
      var5 |= var4 ? 1995782577 : 0;
      return 0 != (var1 & var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luf;")
   @ObfuscatedName("ab")
   public static class524[] method11125() {
      return new class524[]{field6034, field6036, field6037, field6035};
   }

   @ObfuscatedSignature(descriptor = "(ZZZI)Z")
   @ObfuscatedName("ad")
   public boolean method11142(boolean var1, boolean var2, boolean var3, int var4) {
      try {
         return this.method11129(-784785121 * this.field6041, var1, var2, var3, 1297193992);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.ap(" + ')');
      }
   }

   class524(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6043 = 1852101449 * var1;
      this.field6038 = -362614687 * var2;
      this.field6040 = var3 * -1632306223;
      this.field6041 = var4 * 1463884511;
      this.field6039 = var5 * -2031646765;
      this.field6042 = 1788681401 * var6;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -1567378527 * this.field6038;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -1567378527 * this.field6038;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luf;")
   @ObfuscatedName("as")
   public static class524[] method11126() {
      return new class524[]{field6034, field6036, field6037, field6035};
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bk")
   public boolean method11146(boolean var1, boolean var2, boolean var3) {
      return this.method11129(this.field6042 * 1440885129, var1, var2, var3, 2106582565);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luf;")
   @ObfuscatedName("ac")
   public static class524[] method11127() {
      return new class524[]{field6034, field6036, field6037, field6035};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;IZZZ)Z")
   @ObfuscatedName("se")
   public static boolean method11130(class524 var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.vmethod28();
      }

      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 128 : 0;
      return 0 != (var1 & var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luf;")
   @ObfuscatedName("ax")
   public static class524[] method11128() {
      return new class524[]{field6034, field6036, field6037, field6035};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;IZZZ)Z")
   @ObfuscatedName("jc")
   public static boolean method11131(class524 var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method11136(var1, var2, var2, var2);
      }

      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 508675863;
      var5 |= var4 ? -1440678987 : 0;
      return 0 != (var1 & var5);
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("ah")
   boolean method11132(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : -425333617;
      var5 |= var4 ? 128 : 0;
      return 0 != (var1 & var5);
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("al")
   boolean method11133(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : -1466218216;
      var5 |= var4 ? 128 : 0;
      return 0 != (var1 & var5);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bb")
   public boolean method11147(boolean var1, boolean var2, boolean var3) {
      return this.method11129(this.field6042 * 1440885129, var1, var2, var3, 528741387);
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("af")
   boolean method11134(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 1 : 0;
      var5 |= var2 ? 8 : 32;
      var5 |= var4 ? 1597129133 : 0;
      return 0 != (var1 & var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;ZZZ)Z")
   @ObfuscatedName("tq")
   public static boolean method11151(class524 var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11135(var0.field6040 * 258686257, var1, var2, var3, (byte)-85);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;IZZZ)Z")
   @ObfuscatedName("bk")
   public static boolean method11137(class524 var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         return var0.method11133(var1, var2, var2, var2);
      } else {
         int var5 = 0;
         var5 |= var3 ? 2 : 0;
         var5 |= var2 ? 16 : 686887574;
         var5 |= var4 ? 256 : 0;
         return 0 != (var1 & var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZ)Z")
   @ObfuscatedName("ao")
   boolean method11138(int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = 0;
      var5 |= var3 ? 2 : 0;
      var5 |= var2 ? 16 : 64;
      var5 |= var4 ? 256 : 0;
      return 0 != (var1 & var5);
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("au")
   public boolean method11157(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11135(-884512677 * this.field6039, var1, var2, var3, (byte)-49);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bg")
   public boolean method11143(boolean var1, boolean var2, boolean var3) {
      return this.method11129(-784785121 * this.field6041, var1, var2, var3, 1350285651);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;IZZZ)Z")
   @ObfuscatedName("qg")
   public static boolean method11139(class524 var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (var0 == null) {
         return var0.method11134(var1, var2, var2, var2);
      } else {
         int var5 = 0;
         var5 |= var3 ? 2 : 0;
         var5 |= var2 ? 16 : 64;
         var5 |= var4 ? 256 : 0;
         return 0 != (var1 & var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bz")
   public boolean method11148(boolean var1, boolean var2, boolean var3) {
      return this.method11129(this.field6042 * 1440885129, var1, var2, var3, 703645344);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bo")
   public boolean method11140(boolean var1, boolean var2, boolean var3) {
      return this.method11129(this.field6040 * 258686257, var1, var2, var3, 649951897);
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bm")
   public boolean method11153(boolean var1, boolean var2, boolean var3) {
      return this.method11135(333048043 * this.field6041, var1, var2, var3, (byte)-59);
   }

   @ObfuscatedSignature(descriptor = "(Luf;ZZZB)Z")
   @ObfuscatedName("ft")
   public static boolean method11141(class524 var0, boolean var1, boolean var2, boolean var3, byte var4) {
      if (var0 == null) {
         return var0.method11149(var1, var1, var1, var4);
      } else {
         try {
            return var0.method11129(var0.field6040 * 258686257, var1, var2, var3, 683279812);
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "uf.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bp")
   public boolean method11154(boolean var1, boolean var2, boolean var3) {
      return this.method11135(-784785121 * this.field6041, var1, var2, var3, (byte)-108);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -1567378527 * this.field6038;
   }

   @ObfuscatedSignature(descriptor = "(ZZZB)Z")
   @ObfuscatedName("ai")
   public boolean method11149(boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         return this.method11129(this.field6038 * 1440885129, var1, var2, var3, 878983397);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uf.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZ)Z")
   @ObfuscatedName("bt")
   public boolean method11158(boolean var1, boolean var2, boolean var3) {
      return this.method11135(-884512677 * this.field6039, var1, var2, var3, (byte)-73);
   }
}
