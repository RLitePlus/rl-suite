import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.Preferences;
import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.VolumeChanged.Type;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cy")
public class classCY implements Preferences {
   @ObfuscatedName("au")
   int field1350;
   @ObfuscatedName("ag")
   final Map field1342 = new LinkedHashMap();
   @ObfuscatedName("as")
   boolean field1351;
   @ObfuscatedName("ax")
   boolean field1341 = false;
   @ObfuscatedName("ac")
   boolean field1356;
   @ObfuscatedName("aa")
   boolean field1353 = false;
   @ObfuscatedName("ak")
   int field1344;
   @ObfuscatedName("ad")
   int field1346;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1357 = 320;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field1358 = 64;
   @ObfuscatedName("ao")
   int field1354;
   @ObfuscatedName("aq")
   int field1343;
   @ObfuscatedName("ar")
   int field1340;
   @ObfuscatedName("aj")
   int field1345;
   @ObfuscatedName("ap")
   String field1352;
   @ObfuscatedName("ai")
   int field1347;
   @ObfuscatedName("aw")
   boolean field1348;
   @ObfuscatedName("ay")
   int field1349;
   @ObfuscatedName("ii")
   static String field1359;
   @ObfuscatedName("al")
   double field1355 = 0.8;

   classCY(classXY var1) {
      this.field1343 = 1880647211;
      this.method2837(-1);
      this.field1340 = -1859112745;
      this.method2838(-1);
      this.field1354 = 1942373673;
      this.method2839(-1);
      this.field1344 = -532488857;
      this.field1352 = null;
      this.field1345 = -2139190381;
      this.field1350 = 850081463;
      this.field1347 = 1977767644;
      this.field1348 = false;
      this.field1349 = 0;
      if (null != var1 && var1.field6954 != null && 0 != var1.field6954.length) {
         int var2 = classXY.method13039(var1, -346779531);
         if (var2 >= 0 && var2 <= 13) {
            if (classXY.method13039(var1, -346779531) == 1) {
               this.field1351 = true;
            }

            if (var2 > 1) {
               this.field1356 = classXY.method13039(var1, -346779531) == 1;
            }

            if (var2 > 3) {
               this.field1345 = classXY.method13039(var1, -346779531) * -2139190381;
            }

            if (var2 > 2) {
               int var3 = classXY.method13039(var1, -346779531);

               for (int var4 = 0; var4 < var3; var4++) {
                  int var5 = var1.method13056((byte)1);
                  int var6 = var1.method13056((byte)1);
                  this.field1342.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field1352 = var1.method13069((byte)-13);
            }

            if (var2 > 5) {
               this.field1341 = var1.method13065((byte)17);
            }

            if (var2 > 6) {
               this.field1355 = classXY.method13039(var1, -346779531) / 100.0;
               this.field1343 = classXY.method13039(var1, -346779531) * -188103595;
               this.method2837(-1);
               this.field1340 = classXY.method13039(var1, -346779531) * 1067557801;
               this.method2838(-1);
               this.field1354 = classXY.method13039(var1, -346779531) * -491985321;
               this.method2839(-1);
            }

            if (var2 > 7) {
               this.field1344 = classXY.method13039(var1, -346779531) * 532488857;
            }

            if (var2 > 8) {
               this.field1353 = classXY.method13039(var1, -346779531) == 1;
            }

            if (var2 > 9) {
               this.field1346 = var1.method13056((byte)1) * -1218635879;
            }

            if (var2 > 10) {
               this.field1350 = classXY.method13039(var1, -346779531) * -481392817;
            }

            if (var2 > 11) {
               classXY.method13039(var1, -346779531);
               this.field1348 = false;
            }

            if (var2 > 12) {
               this.field1349 = var1.method13056((byte)1) * 316561455;
            }
         } else {
            this.method2708(true, (byte)-96);
         }
      } else {
         this.method2708(true, (byte)-122);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dp")
   public void method2836() {
      this.field1345 = 2 * -2139190381;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;IB)V")
   @ObfuscatedName("vz")
   public static void method2752(classCY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method2756(var1, var2);
      }

      try {
         var0.field1346 = var1 * -1218635879;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ck")
   void method2733(boolean var1) {
      this.field1356 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("as")
   void method2721(boolean var1, int var2) {
      try {
         this.field1351 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fg")
   int method2831() {
      return 118742551 * this.field1349;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ac")
   void method2727(boolean var1, int var2) {
      try {
         this.field1341 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fi")
   void method2834(int var1) {
      this.field1349 = 316561455 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fy")
   int method2832() {
      return -2118783281 * this.field1349;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method2737(int var1) {
      try {
         boolean var10001;
         if (!this.field1353) {
            if (var1 == 829972991) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.method2743(var10001, (byte)-114);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   int method2790() {
      return this.field1344 * -1030221399;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fd")
   void method2828(boolean var1) {
      this.field1348 = var1;
      classMW.method7732(1041414693);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   static void method2704() {
      classAAR var0 = null;

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, true, (byte)1);
         classXY var1 = method2712(classAB.field122, 607593018);
         var0.method242(var1.field6954, 0, 702114061 * var1.field6955, -1735767218);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.method252(true, 1729748320);
         }
      } catch (Exception var2) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("dp")
   void method2786(String var1) {
      this.field1352 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("di")
   void method2759(double var1) {
      try {
         this.field1355 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("bk")
   float method2820(int var1) {
      try {
         return this.field1347 * 1136367791 / 100.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   int method2768(byte var1) {
      try {
         return -1250316135 * this.field1340;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("bt")
   int method2810(String var1, byte var2) {
      try {
         return classEB.method3801(var1.toLowerCase(), (byte)92);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("at")
   void method2781(int var1, byte var2) {
      try {
         this.field1354 = -491985321 * var1;
         this.method2839(-1);
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("em")
   int method2816() {
      return -1673247991 * this.field1350;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ve")
   public boolean method2840() {
      return this.field1353;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   void method2795(int var1, int var2) {
      try {
         this.field1344 = 532488857 * var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bw")
   int method2797(int var1) {
      try {
         return this.field1345 * -462206309;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bx(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("ac")
   public static int method2769(classCY var0) {
      return -1250316135 * var0.field1340;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   void method2800(int var1, int var2) {
      try {
         this.field1345 = var1 * -2139190381;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)Z")
   @ObfuscatedName("br")
   boolean method2805(String var1, short var2) {
      try {
         int var3 = this.method2810(var1, (byte)93);
         return this.field1342.containsKey(var3);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cy.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ay")
   void method2743(boolean var1, byte var2) {
      try {
         this.field1353 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bg")
   void method2812(int var1, int var2) {
      try {
         this.field1350 = var1 * -481392817;
         if (classIS.field3053 != null) {
            if (var2 <= 1259557661) {
               return;
            }

            classIS.field3053.field1689.method4253(classAB.field122.method2817((byte)0));
         }

         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcy;I)Z")
   @ObfuscatedName("vj")
   public static boolean method2824(classCY var0, int var1) {
      if (var0 == null) {
         var0.method2827(var1);
      }

      try {
         return var0.field1348;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bj")
   int method2817(byte var1) {
      try {
         return -412733521 * this.field1350;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bj(" + 41);
      }
   }

   public void setAreaSoundEffectVolume(int var1) {
      this.field1354 = var1 * -491985321;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   int method2791() {
      return this.field1344 * -1030221399;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;B)Ljava/lang/String;")
   @ObfuscatedName("vm")
   public static String method2782(classCY var0, byte var1) {
      if (var0 == null) {
         var0.method2785(var1);
      }

      try {
         return var0.field1352;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bo")
   void method2822(int var1, int var2) {
      try {
         this.field1347 = 1565965903 * var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int method2833(int var1) {
      try {
         return -2118783281 * this.field1349;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iy")
   public boolean method2841() {
      return this.field1351;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bb")
   void method2835(int var1, byte var2) {
      try {
         this.field1349 = 316561455 * var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.bb(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcy;")
   @ObfuscatedName("bi")
   static classCY method2701() {
      classAAR var0 = null;
      classCY var1 = new classCY();

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, false, (byte)1);
         byte[] var2 = new byte[(int)var0.method257(-153393736)];
         int var3 = 0;

         while (var3 < var2.length) {
            int var4 = var0.method260(var2, var3, var2.length - var3, -1397369950);
            if (var4 == -1) {
               throw new IOException();
            }

            var3 += var4;
         }

         var1 = new classCY(new classXY(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            classAAR.method247(var0, (byte)1);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lc")
   public int method2842() {
      return this.field1345 * -462206309;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rg")
   public void method2838(int var1) {
      classOE.field4843.getCallbacks().post(new VolumeChanged(Type.EFFECTS));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcy;")
   @ObfuscatedName("be")
   static classCY method2702() {
      classAAR var0 = null;
      classCY var1 = new classCY();

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, false, (byte)1);
         byte[] var2 = new byte[(int)var0.method257(-153393736)];
         int var3 = 0;

         while (var3 < var2.length) {
            int var4 = var0.method260(var2, var3, var2.length - var3, -1397369950);
            if (var4 == -1) {
               throw new IOException();
            }

            var3 += var4;
         }

         var1 = new classCY(new classXY(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            classAAR.method247(var0, (byte)1);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   public int getSoundEffectVolume() {
      return this.field1340 * -1250316135;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcy;")
   @ObfuscatedName("by")
   static classCY method2703() {
      classAAR var0 = null;
      classCY var1 = new classCY();

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, false, (byte)1);
         byte[] var2 = new byte[(int)var0.method257(-153393736)];
         int var3 = 0;

         while (var3 < var2.length) {
            int var4 = var0.method260(var2, var3, var2.length - var3, -1397369950);
            if (var4 == -1) {
               throw new IOException();
            }

            var3 += var4;
         }

         var1 = new classCY(new classXY(var2));
      } catch (Exception var6) {
      }

      try {
         if (null != var0) {
            classAAR.method247(var0, (byte)1);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   static void method2705() {
      classAAR var0 = null;

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, true, (byte)1);
         classXY var1 = method2712(classAB.field122, -499879054);
         var0.method242(var1.field6954, 0, 595193876 * var1.field6955, -1673473414);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.method252(true, 552050983);
         }
      } catch (Exception var2) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   static void method2706() {
      classAAR var0 = null;

      try {
         var0 = classFE.method4612("", classYP.field7028.field4053, true, (byte)1);
         classXY var1 = method2712(classAB.field122, -76062650);
         var0.method242(var1.field6954, 0, 702114061 * var1.field6955, -1792106284);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.method252(true, -732972066);
         }
      } catch (Exception var2) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bd")
   void method2707(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Lxy;")
   @ObfuscatedName("bl")
   classXY method2709() {
      classXY var1 = new classXY(423, true);
      classXY.method12971(var1, 13, (byte)-121);
      classXY.method12971(var1, this.field1351 ? 1 : 0, (byte)-55);
      classXY.method12971(var1, this.field1356 ? 1 : 0, (byte)-19);
      classXY.method12971(var1, this.field1345 * -462206309, (byte)-55);
      classXY.method12971(var1, this.field1342.size(), (byte)-72);

      for (Entry var3 : this.field1342.entrySet()) {
         var1.method12979((Integer)var3.getKey(), 758169893);
         var1.method12979((Integer)var3.getValue(), 1314601295);
      }

      classXY.method12997(var1, null != this.field1352 ? this.field1352 : "", (short)15792);
      classXY.method12994(var1, this.field1341, -1737488759);
      classXY.method12971(var1, (int)(100.0 * this.field1355), (byte)-45);
      classXY.method12971(var1, -169973855 * this.field1343, (byte)-127);
      classXY.method12971(var1, this.field1340 * 1483221444, (byte)-25);
      classXY.method12971(var1, 224749009 * this.field1354, (byte)-92);
      classXY.method12971(var1, this.field1344 * -2106393233, (byte)-90);
      classXY.method12971(var1, this.field1353 ? 1 : 0, (byte)-119);
      var1.method12979(this.field1346 * -757856000, 200759892);
      classXY.method12971(var1, this.field1350 * -412733521, (byte)-8);
      classXY.method12971(var1, this.field1348 ? 1 : 0, (byte)-96);
      var1.method12979(1300958604 * this.field1349, 643079720);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vh")
   public int method2843() {
      return this.field1346 * 588926121;
   }

   @ObfuscatedSignature(descriptor = "()Lxy;")
   @ObfuscatedName("bv")
   classXY method2710() {
      classXY var1 = new classXY(-1129050635, true);
      classXY.method12971(var1, 13, (byte)-23);
      classXY.method12971(var1, this.field1351 ? 1 : 0, (byte)-40);
      classXY.method12971(var1, this.field1356 ? 1 : 0, (byte)-107);
      classXY.method12971(var1, this.field1345 * 1829080374, (byte)-97);
      classXY.method12971(var1, this.field1342.size(), (byte)-27);

      for (Entry var3 : this.field1342.entrySet()) {
         var1.method12979((Integer)var3.getKey(), 1158626782);
         var1.method12979((Integer)var3.getValue(), 2098741072);
      }

      classXY.method12997(var1, null != this.field1352 ? this.field1352 : "", (short)25840);
      classXY.method12994(var1, this.field1341, -1737488759);
      classXY.method12971(var1, (int)(100.0 * this.field1355), (byte)-25);
      classXY.method12971(var1, 1248663805 * this.field1343, (byte)-65);
      classXY.method12971(var1, this.field1340 * -1250316135, (byte)-108);
      classXY.method12971(var1, -1752603289 * this.field1354, (byte)-49);
      classXY.method12971(var1, this.field1344 * -1030221399, (byte)-12);
      classXY.method12971(var1, this.field1353 ? 1 : 0, (byte)-63);
      var1.method12979(this.field1346 * 52298410, -118489349);
      classXY.method12971(var1, this.field1350 * -643597342, (byte)-33);
      classXY.method12971(var1, this.field1348 ? 1 : 0, (byte)-8);
      var1.method12979(-2118783281 * this.field1349, -604304076);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   boolean method2714() {
      return this.field1351;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   boolean method2715() {
      return this.field1351;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method2716() {
      return this.field1351;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("co")
   boolean method2731() {
      return this.field1356;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cp")
   void method2722(boolean var1) {
      this.field1351 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fs")
   public int method2844() {
      return this.field1344 * -1030221399;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cq")
   boolean method2723() {
      return this.field1341;
   }

   public boolean getHideUsername() {
      return this.field1341;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   boolean method2717() {
      return this.field1351;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("da")
   void method2787(String var1) {
      this.field1352 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cs")
   void method2728(boolean var1) {
      this.field1341 = var1;
      classMW.method7732(1041414693);
   }

   public void setSoundEffectVolume(int var1) {
      this.field1340 = var1 * 1067557801;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fl")
   boolean method2825() {
      return this.field1348;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aa")
   boolean method2732(byte var1) {
      try {
         return this.field1356;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cy")
   void method2729(boolean var1) {
      this.field1341 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("eq")
   boolean method2806(String var1) {
      int var2 = this.method2810(var1, (byte)62);
      return this.field1342.containsKey(var2);
   }

   classCY() {
      this.field1343 = 1880647211;
      this.method2837(-1);
      this.field1340 = -1859112745;
      this.method2838(-1);
      this.field1354 = 1942373673;
      this.method2839(-1);
      this.field1344 = -532488857;
      this.field1352 = null;
      this.field1345 = -2139190381;
      this.field1350 = 850081463;
      this.field1347 = 1977767644;
      this.field1348 = false;
      this.field1349 = 0;
      this.method2708(true, (byte)-111);
      this.method2836();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   void method2738() {
      this.method2743(!this.field1353, (byte)-50);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cn")
   void method2739() {
      this.method2743(!this.field1353, (byte)-98);
   }

   @ObfuscatedSignature(descriptor = "(Lcy;I)I")
   @ObfuscatedName("zv")
   public static int method2777(classCY var0, int var1) {
      if (var0 == null) {
         var0.method2780(var1);
      }

      try {
         return var0.field1354 * -1752603289;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cg")
   void method2744(boolean var1) {
      this.field1353 = var1;
      classMW.method7732(1041414693);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)Lxy;")
   @ObfuscatedName("di")
   public static classXY method2711(classCY var0) {
      if (var0 == null) {
         var0.method2842();
      }

      classXY var1 = new classXY(423, true);
      classXY.method12971(var1, 13, (byte)-15);
      classXY.method12971(var1, var0.field1351 ? 1 : 0, (byte)-30);
      classXY.method12971(var1, var0.field1356 ? 1 : 0, (byte)-95);
      classXY.method12971(var1, var0.field1345 * -462206309, (byte)-103);
      classXY.method12971(var1, var0.field1342.size(), (byte)-65);

      for (Entry var3 : var0.field1342.entrySet()) {
         var1.method12979((Integer)var3.getKey(), 1542201510);
         var1.method12979((Integer)var3.getValue(), 849165815);
      }

      classXY.method12997(var1, null != var0.field1352 ? var0.field1352 : "", (short)23385);
      classXY.method12994(var1, var0.field1341, -1737488759);
      classXY.method12971(var1, (int)(100.0 * var0.field1355), (byte)-91);
      classXY.method12971(var1, 1248663805 * var0.field1343, (byte)-80);
      classXY.method12971(var1, var0.field1340 * -1903610175, (byte)-106);
      classXY.method12971(var1, -1752603289 * var0.field1354, (byte)-10);
      classXY.method12971(var1, var0.field1344 * -242242232, (byte)-60);
      classXY.method12971(var1, var0.field1353 ? 1 : 0, (byte)-99);
      var1.method12979(var0.field1346 * 588926121, -352339405);
      classXY.method12971(var1, var0.field1350 * -412733521, (byte)-93);
      classXY.method12971(var1, var0.field1348 ? 1 : 0, (byte)-63);
      var1.method12979(-2118783281 * var0.field1349, 578834382);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cw")
   void method2745(boolean var1) {
      this.field1353 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ca")
   void method2734(boolean var1) {
      this.field1356 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("ap")
   public double method2757(int var1) {
      try {
         return this.field1355;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   int method2747() {
      return this.field1346 * 588926121;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;II)V")
   @ObfuscatedName("nx")
   public static void method2765(classCY var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2776(var1, var1);
      } else {
         try {
            var0.field1343 = var1 * -188103595;
            var0.method2837(-1);
            classMW.method7732(1041414693);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "cy.ar(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ce")
   int method2748() {
      return this.field1346 * 588926121;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cm")
   int method2749() {
      return this.field1346 * 1173473751;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dz")
   void method2771(int var1) {
      this.field1340 = 1067557801 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dd")
   void method2753(int var1) {
      this.field1346 = var1 * -1218635879;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dm")
   void method2754(int var1) {
      this.field1346 = var1 * -1218635879;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Lcy;ZI)V")
   @ObfuscatedName("tc")
   public static void method2829(classCY var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method2830(var1, var2);
      } else {
         try {
            var0.field1348 = var1;
            classMW.method7732(1041414693);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "cy.ba(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dx")
   void method2755(int var1) {
      this.field1346 = var1 * -1218635879;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("dy")
   public double method2758() {
      return this.field1355;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("dt")
   void method2760(double var1) {
      this.field1355 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("au")
   void method2761(double var1) {
      this.field1355 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("oo")
   public void method2837(int var1) {
      classOE.field4843.getCallbacks().post(new VolumeChanged(Type.MUSIC));
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("du")
   void method2762(double var1) {
      this.field1355 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   void method2740() {
      this.method2743(!this.field1353, (byte)-98);
   }

   public String getRememberedUsername() {
      return this.field1352;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("db")
   void method2766(int var1) {
      this.field1343 = var1 * -188103595;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dw")
   int method2770() {
      return -1250316135 * this.field1340;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cv")
   void method2730(boolean var1) {
      this.field1341 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()Lxy;")
   @ObfuscatedName("vf")
   public classXY method2845() {
      return method2712(this, 496016546);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dn")
   void method2772(int var1) {
      this.field1340 = -114101661 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dv")
   void method2773(int var1) {
      this.field1340 = 1067557801 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   int method2778() {
      return this.field1354 * -1752603289;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   int method2779() {
      return this.field1354 * -1752603289;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   public boolean method2741(int var1) {
      try {
         return this.field1353;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ds")
   String method2783() {
      return this.field1352;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("df")
   String method2784() {
      return this.field1352;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ep")
   public boolean method2846() {
      return this.field1356;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;S)Z")
   @ObfuscatedName("uh")
   public static boolean method2724(classCY var0, short var1) {
      if (var0 == null) {
         var0.method2726(var1);
      }

      try {
         return var0.field1341;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   int method2750(int var1) {
      try {
         return this.field1346 * 588926121;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.aq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("ag")
   public static int method2763(classCY var0) {
      return 1248663805 * var0.field1343;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cj")
   void method2746(boolean var1) {
      this.field1353 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("dj")
   void method2788(String var1) {
      this.field1352 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ek")
   int method2792() {
      return this.field1344 * -604012199;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("am")
   void method2789(String var1, int var2) {
      try {
         this.field1352 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ed")
   void method2796(int var1) {
      this.field1344 = 532488857 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ev")
   int method2798() {
      return this.field1345 * -462206309;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("el")
   int method2799() {
      return this.field1345 * -462206309;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eg")
   void method2801(int var1) {
      this.field1345 = var1 * -1027028293;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("en")
   void method2802(String var1, int var2) {
      int var3 = this.method2810(var1, (byte)125);
      if (this.field1342.size() >= 10 && !this.field1342.containsKey(var3)) {
         Iterator var4 = this.field1342.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.field1342.put(var3, var2);
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ex")
   boolean method2807(String var1) {
      int var2 = this.method2810(var1, (byte)32);
      return this.field1342.containsKey(var2);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ae")
   void method2708(boolean var1, byte var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("er")
   int method2808(String var1) {
      int var2 = this.method2810(var1, (byte)73);
      return !this.field1342.containsKey(var2) ? 0 : (Integer)this.field1342.get(var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("eo")
   int method2811(String var1) {
      return classEB.method3801(var1.toLowerCase(), (byte)87);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ai")
   int method2764(byte var1) {
      try {
         return 1248663805 * this.field1343;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("pb")
   public double method2847() {
      return this.field1355;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ew")
   void method2813(int var1) {
      this.field1350 = var1 * -481392817;
      if (classIS.field3053 != null) {
         classIS.field3053.field1689.method4253(classAB.field122.method2817((byte)0));
      }

      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eu")
   void method2814(int var1) {
      this.field1350 = var1 * 1641644051;
      if (classIS.field3053 != null) {
         classIS.field3053.field1689.method4253(classAB.field122.method2817((byte)0));
      }

      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("bm")
   int method2809(String var1, int var2) {
      try {
         int var3 = this.method2810(var1, (byte)78);
         if (!this.field1342.containsKey(var3)) {
            if (var2 == -1163968665) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return (Integer)this.field1342.get(var3);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cy.bm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ez")
   int method2818() {
      return -412733521 * this.field1350;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;I)Lxy;")
   @ObfuscatedName("sd")
   public static classXY method2712(classCY var0, int var1) {
      if (var0 == null) {
         return var0.method2713(var1);
      } else {
         try {
            classXY var2 = new classXY(423, true);
            classXY.method12971(var2, 13, (byte)-20);
            byte var10001;
            if (var0.field1351) {
               if (var1 >= 614604451) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            classXY.method12971(var2, var10001, (byte)-33);
            if (var0.field1356) {
               if (var1 >= 614604451) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            classXY.method12971(var2, var10001, (byte)-26);
            classXY.method12971(var2, var0.field1345 * -462206309, (byte)-62);
            classXY.method12971(var2, var0.field1342.size(), (byte)-115);
            Iterator var3 = var0.field1342.entrySet().iterator();

            while (var3.hasNext()) {
               if (var1 >= 614604451) {
                  throw new IllegalStateException();
               }

               Entry var4 = (Entry)var3.next();
               var2.method12979((Integer)var4.getKey(), 1289349999);
               var2.method12979((Integer)var4.getValue(), 1976655280);
            }

            classXY.method12997(var2, null != var0.field1352 ? var0.field1352 : "", (short)28546);
            classXY.method12994(var2, var0.field1341, -1737488759);
            classXY.method12971(var2, (int)(100.0 * var0.field1355), (byte)-96);
            classXY.method12971(var2, 1248663805 * var0.field1343, (byte)-80);
            classXY.method12971(var2, var0.field1340 * -1250316135, (byte)-88);
            classXY.method12971(var2, -1752603289 * var0.field1354, (byte)-79);
            classXY.method12971(var2, var0.field1344 * -1030221399, (byte)-20);
            if (var0.field1353) {
               if (var1 >= 614604451) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            classXY.method12971(var2, var10001, (byte)-39);
            var2.method12979(var0.field1346 * 588926121, -489025558);
            classXY.method12971(var2, var0.field1350 * -412733521, (byte)-28);
            classXY.method12971(var2, var0.field1348 ? 1 : 0, (byte)-78);
            var2.method12979(-2118783281 * var0.field1349, 1185619690);
            return var2;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "cy.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fm")
   public void method2839(int var1) {
      classOE.field4843.getCallbacks().post(new VolumeChanged(Type.AREA));
   }

   @ObfuscatedSignature(descriptor = "(Lcy;Ljava/lang/String;II)V")
   @ObfuscatedName("yu")
   public static void method2803(classCY var0, String var1, int var2, int var3) {
      if (var0 == null) {
         var0.method2804(var1, var2, var2);
      } else {
         try {
            int var4 = var0.method2810(var1, (byte)35);
            if (var0.field1342.size() >= 10 && !var0.field1342.containsKey(var4)) {
               Iterator var5 = var0.field1342.entrySet().iterator();
               var5.next();
               var5.remove();
            }

            var0.field1342.put(var4, var2);
            classMW.method7732(1041414693);
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "cy.bp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ei")
   int method2819() {
      return -412733521 * this.field1350;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("eb")
   float method2821() {
      return this.field1347 * 1136367791 / 100.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;II)V")
   @ObfuscatedName("vg")
   public static void method2774(classCY var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2775(var1, var1);
      } else {
         try {
            var0.field1340 = 1067557801 * var1;
            var0.method2838(-1);
            classMW.method7732(1041414693);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "cy.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ep")
   void method2823(int var1) {
      this.field1347 = 1565965903 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fo")
   boolean method2826() {
      return this.field1348;
   }

   public int getAreaSoundEffectVolume() {
      return this.field1354 * -1752603289;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   int method2751() {
      return this.field1346 * 588926121;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)Z")
   @ObfuscatedName("ob")
   public static boolean method2718(classCY var0) {
      return var0.field1351;
   }

   @ObfuscatedSignature(descriptor = "(Lcy;B)I")
   @ObfuscatedName("yx")
   public static int method2793(classCY var0, byte var1) {
      if (var0 == null) {
         var0.method2794(var1);
      }

      try {
         return var0.field1344 * -1030221399;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   boolean method2725() {
      return this.field1341;
   }

   public void setRememberedUsername(String var1) {
      this.field1352 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cz")
   public boolean method2742() {
      return this.field1353;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("et")
   void method2815(int var1) {
      this.field1350 = var1 * -481392817;
      if (classIS.field3053 != null) {
         classIS.field3053.field1689.method4253(classAB.field122.method2817((byte)0));
      }

      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dk")
   void method2767(int var1) {
      this.field1343 = var1 * -188103595;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ao")
   void method2735(boolean var1, byte var2) {
      try {
         this.field1356 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   int method2780(int var1) {
      try {
         return this.field1354 * -1752603289;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxy;")
   @ObfuscatedName("ab")
   classXY method2713(int var1) {
      try {
         classXY var2 = new classXY(423, true);
         classXY.method12971(var2, 13, (byte)-20);
         byte var10001;
         if (this.field1351) {
            if (var1 >= 614604451) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         classXY.method12971(var2, var10001, (byte)-33);
         if (this.field1341) {
            if (var1 >= 614604451) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         classXY.method12971(var2, var10001, (byte)-26);
         classXY.method12971(var2, this.field1347 * -462206309, (byte)-62);
         classXY.method12971(var2, this.field1342.size(), (byte)-115);
         Iterator var3 = this.field1342.entrySet().iterator();

         while (var3.hasNext()) {
            if (var1 >= 614604451) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            var2.method12979((Integer)var4.getKey(), 1289349999);
            var2.method13151((Integer)var4.getValue(), 1976655280);
         }

         classXY.method12997(var2, null != this.field1352 ? this.field1352 : "", (short)28546);
         classXY.method12994(var2, this.field1341, -1737488759);
         classXY.method12971(var2, (int)(100.0 * this.field1355), (byte)-96);
         classXY.method12971(var2, 1248663805 * this.field1340, (byte)-80);
         classXY.method12971(var2, this.field1349 * -1250316135, (byte)-88);
         classXY.method12971(var2, -1752603289 * this.field1343, (byte)-79);
         classXY.method12971(var2, this.field1354 * -1030221399, (byte)-20);
         if (this.field1348) {
            if (var1 >= 614604451) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         classXY.method12971(var2, var10001, (byte)-39);
         var2.method13151(this.field1343 * 588926121, -489025558);
         classXY.method12971(var2, this.field1349 * -412733521, (byte)-28);
         classXY.method12971(var2, this.field1351 ? 1 : 0, (byte)-78);
         var2.method13026(-2118783281 * this.field1345, 1185619690);
         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cy.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ad")
   void method2756(int var1, byte var2) {
      try {
         this.field1350 = var1 * -1218635879;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   boolean method2719(int var1) {
      try {
         return this.field1351;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   void method2775(int var1, int var2) {
      try {
         this.field1354 = 1067557801 * var1;
         this.method2839(-1);
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ah")
   int method2794(byte var1) {
      try {
         return this.field1343 * -1030221399;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcy;I)Z")
   @ObfuscatedName("jn")
   public static boolean method2720(classCY var0, int var1) {
      if (var0 == null) {
         return var0.method2719(var1);
      } else {
         try {
            return var0.field1351;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "cy.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("bp")
   void method2804(String var1, int var2, int var3) {
      try {
         int var4 = this.method2810(var1, (byte)35);
         if (this.field1342.size() >= 10 && !this.field1342.containsKey(var4)) {
            Iterator var5 = this.field1342.entrySet().iterator();
            var5.next();
            var5.remove();
         }

         this.field1342.put(var4, var2);
         classMW.method7732(1041414693);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cy.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bu")
   boolean method2827(int var1) {
      try {
         return this.field1348;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ba")
   void method2830(boolean var1, int var2) {
      try {
         this.field1341 = var1;
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   void method2776(int var1, int var2) {
      try {
         this.field1354 = 1067557801 * var1;
         this.method2839(-1);
         classMW.method7732(1041414693);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cy.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcy;ZB)V")
   @ObfuscatedName("qj")
   public static void method2736(classCY var0, boolean var1, byte var2) {
      if (var0 == null) {
         var0.method2735(var1, var2);
      } else {
         try {
            var0.field1356 = var1;
            classMW.method7732(1041414693);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "cy.ao(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("an")
   String method2785(byte var1) {
      try {
         return this.field1352;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ax")
   boolean method2726(short var1) {
      try {
         return this.field1341;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cy.ax(" + ')');
      }
   }
}
