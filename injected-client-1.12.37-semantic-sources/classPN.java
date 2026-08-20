import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pn")
public class classPN extends classVJ {
   @ObfuscatedName("ao")
   public final int field5352;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5357 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5358 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5359 = 24;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ax")
   static AbstractArchive field5362;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ac")
   static EvictingDualNodeHashTable field5350 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aa")
   final int field5353;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5356 = 4;
   @ObfuscatedName("al")
   public final long field5354;
   @ObfuscatedName("aj")
   public final String field5351;
   @Deprecated
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5360 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final String field5361 = "m";
   @ObfuscatedName("ay")
   final boolean field5355;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ax")
   public static void method9017(AbstractArchive var0) {
      field5362 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpn;)Z")
   @ObfuscatedName("vs")
   public static boolean method9025(classPN var0) {
      return FriendsList.method10130(var0.field5353 * 1468976603, -114938271) == classYY.field7113;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ab")
   public boolean method9028(byte var1) {
      try {
         boolean var10000;
         if (FriendsList.method10130(this.field5353 * 1468976603, 1381354391) == classYY.field7115) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/Object;")
   @ObfuscatedName("as")
   public Object method9031(byte var1) {
      try {
         if (method9026(this, (byte)2)) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return this.field5351;
            }
         } else if (this.method9028((byte)79)) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return 3335646069137558745L * this.field5354;
            }
         } else {
            return -1601970641 * this.field5352;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pn.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpn;)Ljava/lang/Object;")
   @ObfuscatedName("pl")
   public static Object method9032(classPN var0) {
      if (var0 == null) {
         return var0.method9036();
      } else if (method9026(var0, (byte)2)) {
         return var0.field5351;
      } else {
         return var0.method9028((byte)41) ? 3335646069137558745L * var0.field5354 : -1601970641 * var0.field5352;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("lf")
   public String method9039() {
      return this.field5351;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;II)V")
   @ObfuscatedName("xd")
   public static void method9037(PlayerComposition var0, int var1, int var2) {
      var0.field4098[var1] = var2;
      var0.method6711((byte)-4);
   }

   classPN(classXY var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      long var5 = 0L;
      String var7 = null;
      boolean var8 = true;
      if (var1 != null && var1.field6954 != null) {
         label61:
         while (true) {
            int var9 = classXY.method13039(var1, -346779531);
            switch (var9) {
               case 0:
                  break label61;
               case 1:
                  byte var11 = classXY.method13043(var1, (byte)17);
                  int var12 = var11 & 255;
                  if (0 == var12) {
                     throw new IllegalArgumentException("" + Integer.toString(var12, 16));
                  }

                  if (var12 >= 128 && var12 < 160) {
                     char var13 = classOH.field4869[var12 - 128];
                     if (var13 == 0) {
                        var13 = '?';
                     }

                     var12 = var13;
                  }

                  char var10 = (char)var12;
                  if ('s' == var10) {
                     var3 = 36;
                  } else {
                     var3 = 0;
                  }
                  continue;
               case 2:
                  var4 = var1.method13056((byte)1);
               case 3:
               case 6:
               default:
                  continue;
               case 4:
                  var8 = false;
                  continue;
               case 5:
                  var7 = var1.method13071(146456438);
                  continue;
               case 7:
                  var5 = var1.method13059(-377259747);
                  continue;
               case 8:
            }

            var3 = classXY.method13039(var1, -346779531);
         }
      }

      this.field5353 = var3 * -1905629613;
      this.field5352 = var4 * 1306011855;
      this.field5354 = var5 * -1264378860623596695L;
      this.field5351 = var7;
      this.field5355 = var8;
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("hd")
   public long method9040() {
      return this.field5354 * 3335646069137558745L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpn;")
   @ObfuscatedName("ac")
   public static classPN method9018(int var0) {
      classPN var1 = (classPN)field5350.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5362.method11867(11, var0, -721153574);
         var1 = new classPN(new classXY(var2), var0);
         field5350.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpn;B)Z")
   @ObfuscatedName("xz")
   public static boolean method9026(classPN var0, byte var1) {
      if (var0 == null) {
         var0.method9030(var1);
      }

      try {
         boolean var10000;
         if (FriendsList.method10130(var0.field5353 * 1468976603, 1214906981) == classYY.field7113) {
            if (var1 != 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pn.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpn;")
   @ObfuscatedName("aa")
   public static classPN method9019(int var0) {
      classPN var1 = (classPN)field5350.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5362.method11867(11, var0, -1415936845);
         var1 = new classPN(new classXY(var2), var0);
         field5350.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpn;")
   @ObfuscatedName("ao")
   public static classPN method9020(int var0) {
      classPN var1 = (classPN)field5350.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5362.method11867(11, var0, -863354752);
         var1 = new classPN(new classXY(var2), var0);
         field5350.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method9021() {
      EvictingDualNodeHashTable.method6431(field5350);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method9022() {
      EvictingDualNodeHashTable.method6431(field5350);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ar")
   public Object method9033() {
      if (method9026(this, (byte)2)) {
         return this.field5351;
      } else {
         return this.method9028((byte)108) ? 3335646069137558745L * this.field5354 : -1601970641 * this.field5352;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpn;)Ljava/lang/Object;")
   @ObfuscatedName("za")
   public static Object method9034(classPN var0) {
      if (var0 == null) {
         var0.method9027();
      }

      if (method9026(var0, (byte)2)) {
         return var0.field5351;
      } else {
         return var0.method9028((byte)36) ? 3335646069137558745L * var0.field5354 : -1601970641 * var0.field5352;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method9027() {
      return FriendsList.method10130(this.field5353 * 1468976603, -567015048) == classYY.field7113;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method9023() {
      EvictingDualNodeHashTable.method6431(field5350);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ai")
   public Object method9035() {
      if (method9026(this, (byte)2)) {
         return this.field5351;
      } else {
         return this.method9028((byte)16) ? 3335646069137558745L * this.field5354 : -1601970641 * this.field5352;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method9024(int var0, int var1) {
      try {
         var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
         var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
         var0 = var0 + (var0 >>> 4) & 252645135;
         var0 += var0 >>> 8;
         var0 += var0 >>> 16;
         return var0 & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pn.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;III)Lym;")
   @ObfuscatedName("ae")
   public static SpritePixels method9038(AbstractArchive var0, int var1, int var2, int var3) {
      net.runelite.api.SpritePixels var4 = (net.runelite.api.SpritePixels)client.field1037.get(var1);
      if (var4 != null) {
         return ((SpritePixels)var4).method13563();
      } else {
         int var7 = var2;
         int var6 = var1;
         AbstractArchive var5 = var0;
         int var8 = -1864631683;

         try {
            SpritePixels var10000;
            if (!classHK.method6068(var5, var6, var7, (byte)-30)) {
               if (var8 >= -1578504328) {
                  throw new IllegalStateException();
               }

               var5 = null;
               var10000 = var5;
            } else {
               SpritePixels var11 = classSA.method10357((byte)45);
               var10000 = var11;
            }

            return var10000;
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "pn.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9029() {
      return FriendsList.method10130(this.field5353 * 1468976603, -68556490) == classYY.field7113;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("xu")
   public int method9041() {
      return this.field5352 * -1601970641;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ak")
   public Object method9036() {
      if (method9026(this, (byte)2)) {
         return this.field5351;
      } else {
         return this.method9028((byte)41) ? 3335646069137558745L * this.field5354 : -1601970641 * this.field5352;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ag")
   public boolean method9030(byte var1) {
      try {
         boolean var10000;
         if (FriendsList.method10130(this.field5353 * 1468976603, 1381354391) == classYY.field7111) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pn.ag(" + ')');
      }
   }
}
