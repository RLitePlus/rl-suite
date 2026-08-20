import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yl")
public class classYL {
   @ObfuscatedName("af")
   static int field7000;
   @ObfuscatedName("ab")
   public static int[] field7002;
   @ObfuscatedName("ae")
   static int field6999;
   @ObfuscatedName("ag")
   public static int[] field7003;
   @ObfuscatedName("az")
   static int field7001;
   @ObfuscatedName("aa")
   public static byte[][] field7004;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)Lyz;")
   @ObfuscatedName("av")
   public static IndexedSprite method13414(AbstractArchive var0, String var1, String var2) {
      if (!AbstractArchive.method11853(var0, var1, var2, 895198534)) {
         return null;
      } else {
         int var3 = var0.method11848(var1, -520753992);
         int var4 = var0.method11851(var3, var2, (byte)-98);
         return classTH.method10812(var0, var3, var4, 807518710);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lyz;")
   @ObfuscatedName("aq")
   static IndexedSprite method13406(AbstractArchive var0, int var1, int var2) {
      if (!classHK.method6068(var0, var1, var2, (byte)-122)) {
         return null;
      } else {
         IndexedSprite var4 = new IndexedSprite();
         var4.field7124 = field7000 * -1073038619;
         var4.field7120 = field6999 * 1770455687;
         var4.field7122 = field7002[0];
         var4.field7123 = field7003[0];
         var4.field7121 = classPO.field5371[0];
         var4.field7119 = classGG.field2578[0];
         var4.palette = classRB.field5639;
         var4.pixels = field7004[0];
         classVZ.method12278((byte)20);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lyz;")
   @ObfuscatedName("ad")
   static IndexedSprite method13407(AbstractArchive var0, int var1, int var2) {
      if (!classHK.method6068(var0, var1, var2, (byte)-34)) {
         return null;
      } else {
         IndexedSprite var4 = new IndexedSprite();
         var4.field7124 = field7000 * -807631027;
         var4.field7120 = field6999 * 1824918833;
         var4.field7122 = field7002[0];
         var4.field7123 = field7003[0];
         var4.field7121 = classPO.field5371[0];
         var4.field7119 = classGG.field2578[0];
         var4.palette = classRB.field5639;
         var4.pixels = field7004[0];
         classVZ.method12278((byte)72);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public static void method13434() {
      field7002 = null;
      field7003 = null;
      classPO.field5371 = null;
      classGG.field2578 = null;
      classRB.field5639 = null;
      field7004 = (byte[][])null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)[Lym;")
   @ObfuscatedName("au")
   public static SpritePixels[] method13408(AbstractArchive var0, int var1, int var2) {
      if (!classHK.method6068(var0, var1, var2, (byte)-3)) {
         return null;
      } else {
         SpritePixels[] var4 = new SpritePixels[1616155503 * field7001];

         for (int var5 = 0; var5 < field7001 * -511692290; var5++) {
            SpritePixels var6 = var4[var5] = new SpritePixels();
            var6.field7006 = -1073038619 * field7000;
            var6.field7008 = field6999 * 322720053;
            var6.field7010 = field7002[var5];
            var6.field7011 = field7003[var5];
            var6.field7007 = classPO.field5371[var5];
            var6.field7009 = classGG.field2578[var5];
            int var7 = var6.field7009 * var6.field7007;
            byte[] var8 = field7004[var5];
            var6.field7005 = new int[var7];

            for (int var9 = 0; var9 < var7; var9++) {
               int var10 = var8[var9] & 994095698;
               var6.field7005[var9] = classRB.field5639[var10];
            }
         }

         classVZ.method12278((byte)-2);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lym;")
   @ObfuscatedName("ai")
   public static SpritePixels method13410(AbstractArchive var0, int var1, int var2) {
      return !classHK.method6068(var0, var1, var2, (byte)-21) ? null : classSA.method10357((byte)-54);
   }

   classYL() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)[Lyz;")
   @ObfuscatedName("aw")
   public static IndexedSprite[] method13412(AbstractArchive var0, String var1, String var2) {
      if (!AbstractArchive.method11853(var0, var1, var2, 1011275913)) {
         return null;
      } else {
         int var3 = var0.method11848(var1, -705410592);
         int var4 = var0.method11851(var3, var2, (byte)-112);
         IndexedSprite[] var5;
         if (!classHK.method6068(var0, var3, var4, (byte)-108)) {
            var5 = null;
         } else {
            var5 = classFS.method4978((byte)-72);
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)[Lyz;")
   @ObfuscatedName("ak")
   public static IndexedSprite[] method13413(AbstractArchive var0, String var1, String var2) {
      if (!AbstractArchive.method11853(var0, var1, var2, 1735022414)) {
         return null;
      } else {
         int var3 = var0.method11848(var1, 1423201720);
         int var4 = var0.method11851(var3, var2, (byte)-56);
         IndexedSprite[] var5;
         if (!classHK.method6068(var0, var3, var4, (byte)1)) {
            var5 = null;
         } else {
            var5 = classFS.method4978((byte)69);
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Ljava/lang/String;Ljava/lang/String;)Lzv;")
   @ObfuscatedName("an")
   public static Font method13416(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
      if (!AbstractArchive.method11853(var0, var2, var3, 2110361279)) {
         return null;
      } else {
         int var4 = var0.method11848(var2, 2083537609);
         int var5 = var0.method11851(var4, var3, (byte)-11);
         Font var6;
         if (!classHK.method6068(var0, var4, var5, (byte)-99)) {
            var6 = null;
         } else {
            byte[] var8 = var1.method11867(var4, var5, -1355610797);
            Font var7;
            if (var8 == null) {
               var7 = null;
            } else {
               Font var9 = new Font(var8, field7002, field7003, classPO.field5371, classGG.field2578, classRB.field5639, field7004);
               classVZ.method12278((byte)-5);
               var7 = var9;
            }

            var6 = var7;
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)Lyz;")
   @ObfuscatedName("at")
   public static IndexedSprite method13415(AbstractArchive var0, String var1, String var2) {
      if (!AbstractArchive.method11853(var0, var1, var2, 1663310988)) {
         return null;
      } else {
         int var3 = var0.method11848(var1, 455923992);
         int var4 = var0.method11851(var3, var2, (byte)-36);
         return classTH.method10812(var0, var3, var4, -1730303153);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   public static void method13435() {
      field7002 = null;
      field7003 = null;
      classPO.field5371 = null;
      classGG.field2578 = null;
      classRB.field5639 = null;
      field7004 = (byte[][])null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Ljava/lang/String;Ljava/lang/String;)Lzv;")
   @ObfuscatedName("am")
   public static Font method13417(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
      if (!AbstractArchive.method11853(var0, var2, var3, 823422888)) {
         return null;
      } else {
         int var4 = var0.method11848(var2, 1595147653);
         int var5 = var0.method11851(var4, var3, (byte)-2);
         Font var6;
         if (!classHK.method6068(var0, var4, var5, (byte)-40)) {
            var6 = null;
         } else {
            byte[] var8 = var1.method11867(var4, var5, -1039067449);
            Font var7;
            if (var8 == null) {
               var7 = null;
            } else {
               Font var9 = new Font(var8, field7002, field7003, classPO.field5371, classGG.field2578, classRB.field5639, field7004);
               classVZ.method12278((byte)15);
               var7 = var9;
            }

            var6 = var7;
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Ljava/lang/String;Ljava/lang/String;)Lzv;")
   @ObfuscatedName("ah")
   public static Font method13418(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
      if (!AbstractArchive.method11853(var0, var2, var3, 795297944)) {
         return null;
      } else {
         int var4 = var0.method11848(var2, 1479060711);
         int var5 = var0.method11851(var4, var3, (byte)-108);
         Font var6;
         if (!classHK.method6068(var0, var4, var5, (byte)-94)) {
            var6 = null;
         } else {
            byte[] var8 = var1.method11867(var4, var5, -1781382106);
            Font var7;
            if (var8 == null) {
               var7 = null;
            } else {
               Font var9 = new Font(var8, field7002, field7003, classPO.field5371, classGG.field2578, classRB.field5639, field7004);
               classVZ.method12278((byte)23);
               var7 = var9;
            }

            var6 = var7;
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Lyz;")
   @ObfuscatedName("bn")
   public static IndexedSprite method13419(AbstractArchive var0, int var1) {
      if (!classLN.method7126(var0, var1, (byte)0)) {
         return null;
      } else {
         IndexedSprite var3 = new IndexedSprite();
         var3.field7124 = field7000 * 1224052395;
         var3.field7120 = field6999 * -1062567517;
         var3.field7122 = field7002[0];
         var3.field7123 = field7003[0];
         var3.field7121 = classPO.field5371[0];
         var3.field7119 = classGG.field2578[0];
         var3.palette = classRB.field5639;
         var3.pixels = field7004[0];
         classVZ.method12278((byte)-2);
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Lyz;")
   @ObfuscatedName("bx")
   public static IndexedSprite method13420(AbstractArchive var0, int var1) {
      if (!classLN.method7126(var0, var1, (byte)0)) {
         return null;
      } else {
         IndexedSprite var3 = new IndexedSprite();
         var3.field7124 = field7000 * -1300955236;
         var3.field7120 = field6999 * -1169812479;
         var3.field7122 = field7002[0];
         var3.field7123 = field7003[0];
         var3.field7121 = classPO.field5371[0];
         var3.field7119 = classGG.field2578[0];
         var3.palette = classRB.field5639;
         var3.pixels = field7004[0];
         classVZ.method12278((byte)48);
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lyz;")
   @ObfuscatedName("bc")
   public static IndexedSprite[] method13421() {
      IndexedSprite[] var0 = new IndexedSprite[field7001 * 1616155503];

      for (int var1 = 0; var1 < field7001 * 789071698; var1++) {
         IndexedSprite var2 = var0[var1] = new IndexedSprite();
         var2.field7124 = field7000 * 413808059;
         var2.field7120 = 669627286 * field6999;
         var2.field7122 = field7002[var1];
         var2.field7123 = field7003[var1];
         var2.field7121 = classPO.field5371[var1];
         var2.field7119 = classGG.field2578[var1];
         var2.palette = classRB.field5639;
         var2.pixels = field7004[var1];
      }

      classVZ.method12278((byte)48);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lyz;")
   @ObfuscatedName("bp")
   public static IndexedSprite[] method13422() {
      IndexedSprite[] var0 = new IndexedSprite[field7001 * 1616155503];

      for (int var1 = 0; var1 < field7001 * 1040868257; var1++) {
         IndexedSprite var2 = var0[var1] = new IndexedSprite();
         var2.field7124 = field7000 * -811801536;
         var2.field7120 = -72144473 * field6999;
         var2.field7122 = field7002[var1];
         var2.field7123 = field7003[var1];
         var2.field7121 = classPO.field5371[var1];
         var2.field7119 = classGG.field2578[var1];
         var2.palette = classRB.field5639;
         var2.pixels = field7004[var1];
      }

      classVZ.method12278((byte)43);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("br")
   static SpritePixels method13423() {
      SpritePixels var0 = new SpritePixels();
      var0.field7006 = field7000 * -1073038619;
      var0.field7008 = field6999 * -1062567517;
      var0.field7010 = field7002[0];
      var0.field7011 = field7003[0];
      var0.field7007 = classPO.field5371[0];
      var0.field7009 = classGG.field2578[0];
      int var1 = var0.field7009 * var0.field7007;
      byte[] var2 = field7004[0];
      var0.field7005 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var0.field7005[var3] = classRB.field5639[var2[var3] & 255];
      }

      classVZ.method12278((byte)39);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("bm")
   static SpritePixels method13424() {
      SpritePixels var0 = new SpritePixels();
      var0.field7006 = field7000 * -1073038619;
      var0.field7008 = field6999 * -1062567517;
      var0.field7010 = field7002[0];
      var0.field7011 = field7003[0];
      var0.field7007 = classPO.field5371[0];
      var0.field7009 = classGG.field2578[0];
      int var1 = var0.field7009 * var0.field7007;
      byte[] var2 = field7004[0];
      var0.field7005 = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var0.field7005[var3] = classRB.field5639[var2[var3] & 255];
      }

      classVZ.method12278((byte)-89);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ba")
   static void method13429(byte[] var0) {
      classXY var1 = new classXY(var0);
      var1.field6955 = (var0.length - 2) * 2053553688;
      field7001 = classXY.method13047(var1, 18008090) * 130492380;
      field7002 = new int[1616155503 * field7001];
      field7003 = new int[field7001 * -152914609];
      classPO.field5371 = new int[1616155503 * field7001];
      classGG.field2578 = new int[403012285 * field7001];
      field7004 = new byte[field7001 * 1559992669][];
      var1.field6955 = 659177515 * (var0.length - 7 - field7001 * -2107671026);
      field7000 = classXY.method13047(var1, -1607706557) * 1527476973;
      field6999 = classXY.method13047(var1, -1669447094) * 1769247414;
      int var2 = (classXY.method13039(var1, -346779531) & -982406193) + 1;

      for (int var3 = 0; var3 < field7001 * 2064483529; var3++) {
         field7002[var3] = classXY.method13047(var1, 1619527892);
      }

      for (int var13 = 0; var13 < field7001 * 320654209; var13++) {
         field7003[var13] = classXY.method13047(var1, -1189459514);
      }

      for (int var14 = 0; var14 < field7001 * 1616155503; var14++) {
         classPO.field5371[var14] = classXY.method13047(var1, 978824665);
      }

      for (int var15 = 0; var15 < field7001 * -749412981; var15++) {
         classGG.field2578[var15] = classXY.method13047(var1, -1402523735);
      }

      var1.field6955 = (var0.length - 7 - field7001 * -482586195 - (var2 - 1) * 3) * -1095856699;
      classRB.field5639 = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         classRB.field5639[var16] = var1.method13051(-758448158);
         if (0 == classRB.field5639[var16]) {
            classRB.field5639[var16] = 1;
         }
      }

      var1.field6955 = 0;

      for (int var17 = 0; var17 < field7001 * 1616155503; var17++) {
         int var4 = classPO.field5371[var17];
         int var5 = classGG.field2578[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field7004[var17] = var7;
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = classXY.method13043(var1, (byte)17);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var11 + var4 * var12] = classXY.method13043(var1, (byte)17);
               }
            }
         }

         if (var10) {
            var1.field6955 += -1095856699 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("bg")
   static boolean method13426(AbstractArchive var0, int var1) {
      byte[] var2 = AbstractArchive.method11814(var0, var1, 1080224828);
      if (var2 == null) {
         return false;
      } else {
         classYS.method13624(var2, -1108124092);
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("bj")
   static boolean method13427(AbstractArchive var0, int var1) {
      byte[] var2 = AbstractArchive.method11814(var0, var1, -1201729758);
      if (var2 == null) {
         return false;
      } else {
         classYS.method13624(var2, -1108124092);
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("bk")
   static boolean method13428(AbstractArchive var0, int var1) {
      byte[] var2 = AbstractArchive.method11814(var0, var1, -917323686);
      if (var2 == null) {
         return false;
      } else {
         classYS.method13624(var2, -1108124092);
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bo")
   static void method13430(byte[] var0) {
      classXY var1 = new classXY(var0);
      var1.field6955 = (var0.length - 2) * 1601993802;
      field7001 = classXY.method13047(var1, -1901436227) * -931176980;
      field7002 = new int[1616155503 * field7001];
      field7003 = new int[field7001 * 1616155503];
      classPO.field5371 = new int[1198446922 * field7001];
      classGG.field2578 = new int[1616155503 * field7001];
      field7004 = new byte[field7001 * 783193958][];
      var1.field6955 = -1894381068 * (var0.length - 7 - field7001 * 44342136);
      field7000 = classXY.method13047(var1, -542899814) * -1821953140;
      field6999 = classXY.method13047(var1, 1694860603) * 1330952715;
      int var2 = (classXY.method13039(var1, -346779531) & 0xFF) + 1;

      for (int var3 = 0; var3 < field7001 * 1616155503; var3++) {
         field7002[var3] = classXY.method13047(var1, 908218162);
      }

      for (int var13 = 0; var13 < field7001 * 1196463563; var13++) {
         field7003[var13] = classXY.method13047(var1, 1752261971);
      }

      for (int var14 = 0; var14 < field7001 * 219892676; var14++) {
         classPO.field5371[var14] = classXY.method13047(var1, -816174142);
      }

      for (int var15 = 0; var15 < field7001 * 1371418118; var15++) {
         classGG.field2578[var15] = classXY.method13047(var1, -1453648936);
      }

      var1.field6955 = (var0.length - 7 - field7001 * 44342136 - (var2 - 1) * 3) * -70107574;
      classRB.field5639 = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         classRB.field5639[var16] = var1.method13051(-758448158);
         if (0 == classRB.field5639[var16]) {
            classRB.field5639[var16] = 1;
         }
      }

      var1.field6955 = 0;

      for (int var17 = 0; var17 < field7001 * 1616155503; var17++) {
         int var4 = classPO.field5371[var17];
         int var5 = classGG.field2578[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field7004[var17] = var7;
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = classXY.method13043(var1, (byte)17);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var11 + var4 * var12] = classXY.method13043(var1, (byte)17);
               }
            }
         }

         if (var10) {
            var1.field6955 += -1212672062 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bu")
   static void method13431(byte[] var0) {
      classXY var1 = new classXY(var0);
      var1.field6955 = (var0.length - 2) * -1095856699;
      field7001 = classXY.method13047(var1, 943946862) * 502976131;
      field7002 = new int[-183080607 * field7001];
      field7003 = new int[field7001 * 1616155503];
      classPO.field5371 = new int[1616155503 * field7001];
      classGG.field2578 = new int[973199484 * field7001];
      field7004 = new byte[field7001 * -2017134195][];
      var1.field6955 = -1095856699 * (var0.length - 7 - field7001 * -992851953);
      field7000 = classXY.method13047(var1, -768676231) * 703458394;
      field6999 = classXY.method13047(var1, 340122354) * 1330952715;
      int var2 = (classXY.method13039(var1, -346779531) & 1436952347) + 1;

      for (int var3 = 0; var3 < field7001 * -505134487; var3++) {
         field7002[var3] = classXY.method13047(var1, 666512451);
      }

      for (int var13 = 0; var13 < field7001 * -236368806; var13++) {
         field7003[var13] = classXY.method13047(var1, -751040237);
      }

      for (int var14 = 0; var14 < field7001 * 149113308; var14++) {
         classPO.field5371[var14] = classXY.method13047(var1, -2097997327);
      }

      for (int var15 = 0; var15 < field7001 * 1616155503; var15++) {
         classGG.field2578[var15] = classXY.method13047(var1, 601903699);
      }

      var1.field6955 = (var0.length - 7 - field7001 * 44342136 - (var2 - 1) * 3) * -1095856699;
      classRB.field5639 = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         classRB.field5639[var16] = var1.method13051(-758448158);
         if (0 == classRB.field5639[var16]) {
            classRB.field5639[var16] = 1;
         }
      }

      var1.field6955 = 0;

      for (int var17 = 0; var17 < field7001 * 1616155503; var17++) {
         int var4 = classPO.field5371[var17];
         int var5 = classGG.field2578[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field7004[var17] = var7;
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = classXY.method13043(var1, (byte)17);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var11 + var4 * var12] = classXY.method13043(var1, (byte)17);
               }
            }
         }

         if (var10) {
            var1.field6955 += 1248587121 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bb")
   static void method13432(byte[] var0) {
      classXY var1 = new classXY(var0);
      var1.field6955 = (var0.length - 2) * -1095856699;
      field7001 = classXY.method13047(var1, 68052884) * 1826761615;
      field7002 = new int[1616155503 * field7001];
      field7003 = new int[field7001 * 1616155503];
      classPO.field5371 = new int[1616155503 * field7001];
      classGG.field2578 = new int[1616155503 * field7001];
      field7004 = new byte[field7001 * 1616155503][];
      var1.field6955 = -1095856699 * (var0.length - 7 - field7001 * 44342136);
      field7000 = classXY.method13047(var1, -1401084917) * 1527476973;
      field6999 = classXY.method13047(var1, 1300250818) * 1330952715;
      int var2 = (classXY.method13039(var1, -346779531) & 0xFF) + 1;

      for (int var3 = 0; var3 < field7001 * 1616155503; var3++) {
         field7002[var3] = classXY.method13047(var1, 769479827);
      }

      for (int var13 = 0; var13 < field7001 * 1616155503; var13++) {
         field7003[var13] = classXY.method13047(var1, -1668468611);
      }

      for (int var14 = 0; var14 < field7001 * 1616155503; var14++) {
         classPO.field5371[var14] = classXY.method13047(var1, -1612178738);
      }

      for (int var15 = 0; var15 < field7001 * 1616155503; var15++) {
         classGG.field2578[var15] = classXY.method13047(var1, 442670040);
      }

      var1.field6955 = (var0.length - 7 - field7001 * 44342136 - (var2 - 1) * 3) * -1095856699;
      classRB.field5639 = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         classRB.field5639[var16] = var1.method13051(-758448158);
         if (0 == classRB.field5639[var16]) {
            classRB.field5639[var16] = 1;
         }
      }

      var1.field6955 = 0;

      for (int var17 = 0; var17 < field7001 * 1616155503; var17++) {
         int var4 = classPO.field5371[var17];
         int var5 = classGG.field2578[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field7004[var17] = var7;
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = classXY.method13043(var1, (byte)17);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var11 + var4 * var12] = classXY.method13043(var1, (byte)17);
               }
            }
         }

         if (var10) {
            var1.field6955 += -1095856699 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Lym;")
   @ObfuscatedName("ar")
   public static SpritePixels method13411(AbstractArchive var0, int var1, int var2) {
      return !classHK.method6068(var0, var1, var2, (byte)-79) ? null : classSA.method10357((byte)6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public static void method13436() {
      field7002 = null;
      field7003 = null;
      classPO.field5371 = null;
      classGG.field2578 = null;
      classRB.field5639 = null;
      field7004 = (byte[][])null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bw")
   static void method13433(byte[] var0) {
      classXY var1 = new classXY(var0);
      var1.field6955 = (var0.length - 2) * -1240084969;
      field7001 = classXY.method13047(var1, 1632575619) * 1826761615;
      field7002 = new int[414299968 * field7001];
      field7003 = new int[field7001 * 143589938];
      classPO.field5371 = new int[-894063266 * field7001];
      classGG.field2578 = new int[1360867942 * field7001];
      field7004 = new byte[field7001 * 1616155503][];
      var1.field6955 = -2098783334 * (var0.length - 7 - field7001 * 739361259);
      field7000 = classXY.method13047(var1, 834313450) * 1527476973;
      field6999 = classXY.method13047(var1, -1362278303) * 413996496;
      int var2 = (classXY.method13039(var1, -346779531) & -911573328) + 1;

      for (int var3 = 0; var3 < field7001 * 1953080487; var3++) {
         field7002[var3] = classXY.method13047(var1, -882835619);
      }

      for (int var13 = 0; var13 < field7001 * 1616155503; var13++) {
         field7003[var13] = classXY.method13047(var1, 1398469454);
      }

      for (int var14 = 0; var14 < field7001 * 1616155503; var14++) {
         classPO.field5371[var14] = classXY.method13047(var1, -1909030951);
      }

      for (int var15 = 0; var15 < field7001 * 1616155503; var15++) {
         classGG.field2578[var15] = classXY.method13047(var1, 638896044);
      }

      var1.field6955 = (var0.length - 7 - field7001 * 44342136 - (var2 - 1) * 3) * -1095856699;
      classRB.field5639 = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         classRB.field5639[var16] = var1.method13051(-758448158);
         if (0 == classRB.field5639[var16]) {
            classRB.field5639[var16] = 1;
         }
      }

      var1.field6955 = 0;

      for (int var17 = 0; var17 < field7001 * 1616155503; var17++) {
         int var4 = classPO.field5371[var17];
         int var5 = classGG.field2578[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field7004[var17] = var7;
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = classXY.method13043(var1, (byte)17);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var11 + var4 * var12] = classXY.method13043(var1, (byte)17);
               }
            }
         }

         if (var10) {
            var1.field6955 += -1095856699 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)[Lym;")
   @ObfuscatedName("ap")
   public static SpritePixels[] method13409(AbstractArchive var0, int var1, int var2) {
      if (!classHK.method6068(var0, var1, var2, (byte)-83)) {
         return null;
      } else {
         SpritePixels[] var4 = new SpritePixels[1616155503 * field7001];

         for (int var5 = 0; var5 < field7001 * 1616155503; var5++) {
            SpritePixels var6 = var4[var5] = new SpritePixels();
            var6.field7006 = -1073038619 * field7000;
            var6.field7008 = field6999 * -1062567517;
            var6.field7010 = field7002[var5];
            var6.field7011 = field7003[var5];
            var6.field7007 = classPO.field5371[var5];
            var6.field7009 = classGG.field2578[var5];
            int var7 = var6.field7009 * var6.field7007;
            byte[] var8 = field7004[var5];
            var6.field7005 = new int[var7];

            for (int var9 = 0; var9 < var7; var9++) {
               int var10 = var8[var9] & 255;
               var6.field7005[var9] = classRB.field5639[var10];
            }
         }

         classVZ.method12278((byte)84);
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;II)Z")
   @ObfuscatedName("bt")
   public static boolean method13425(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.method11867(var1, var2, -1099767856);
      if (null == var3) {
         return false;
      } else {
         classYS.method13624(var3, -1108124092);
         return true;
      }
   }
}
