import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.api.WorldMapData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gx")
public class classGX implements WorldMapData {
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ax")
   classKY field2734;
   @ObfuscatedName("aa")
   boolean field2732;
   @ObfuscatedName("af")
   String field2739;
   @ObfuscatedName("az")
   int field2733 = -752140647;
   @ObfuscatedName("ag")
   int field2735;
   @ObfuscatedName("as")
   int field2731;
   @ObfuscatedName("ae")
   String field2738;
   @ObfuscatedSignature(descriptor = "Lhg;")
   @ObfuscatedName("ac")
   classHG field2730;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field2737 = 123;
   @ObfuscatedName("ab")
   int field2736 = 496714561;
   @ObfuscatedName("ao")
   LinkedList field2740;

   @ObfuscatedSignature(descriptor = "(Luz;B)Luz;")
   @ObfuscatedName("ae")
   public static classUZ method5840(classUZ var0, byte var1) {
      try {
         synchronized (classUZ.field6430) {
            if (0 == -1124722655 * classUZ.field6435) {
               return new classUZ(var0);
            } else {
               classUZ.field6430[(classUZ.field6435 -= 801074145) * -1124722655].method11732(var0, -1600171278);
               return classUZ.field6430[-1124722655 * classUZ.field6435];
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("az")
   public void method5820(classXY var1, int var2, int var3) {
      try {
         this.field2733 = 752140647 * var2;
         this.field2738 = var1.method13071(1112097678);
         this.field2739 = var1.method13071(-52847926);
         this.field2734 = new classKY(var1.method13056((byte)1));
         this.field2736 = var1.method13056((byte)1) * -496714561;
         this.field2735 = var1.method13056((byte)1) * 1284192623;
         classXY.method13039(var1, -346779531);
         boolean var10001;
         if (classXY.method13039(var1, -346779531) == 1) {
            if (var3 <= 643105531) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field2732 = var10001;
         this.field2731 = classXY.method13039(var1, -346779531) * -2079247407;
         int var4 = classXY.method13039(var1, -346779531);
         this.field2740 = new LinkedList();

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 <= 643105531) {
               throw new IllegalStateException();
            }

            this.field2740.add(this.method5827(var1, (byte)1));
         }

         this.method5846(2062050477);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   public int method5883() {
      return this.field2730.field2791 * -1134238487;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("rj")
   public static int method5830(classGN var0) {
      return 1050179627 * var0.field2631;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method5846(int var1) {
      try {
         Iterator var2 = this.field2740.iterator();

         while (var2.hasNext()) {
            if (var1 <= 1781988354) {
               throw new IllegalStateException();
            }

            classHM var3 = (classHM)var2.next();
            var3.vmethod469(this.field2730, 342193347);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gx.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public static String method5860(classGX var0) {
      if (var0 == null) {
         var0.method5859();
      }

      return var0.field2739;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method5848(int var1) {
      try {
         return 1389480535 * this.field2733;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aa")
   public boolean method5854(byte var1) {
      try {
         return this.field2732;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ao")
   public String method5856(int var1) {
      try {
         return this.field2738;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;B)I")
   @ObfuscatedName("sd")
   public static int method5867(classGX var0, byte var1) {
      if (var0 == null) {
         var0.method5869(var1);
      }

      try {
         return 1578239281 * var0.field2731;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method5861(int var1) {
      try {
         return this.field2739;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)I")
   @ObfuscatedName("um")
   public static int method5888(classGX var0) {
      return 1772961034 * var0.field2734.field4055;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method5862(int var1) {
      try {
         return 1774498623 * this.field2736;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   int method5865(byte var1) {
      try {
         return this.field2735 * 1681933711;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   int method5863() {
      return 2083962968 * this.field2736;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public int method5897(int var1) {
      try {
         return this.field2734.field4056 * 819227381;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   public int method5891() {
      return this.field2734.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lhm;")
   @ObfuscatedName("bx")
   classHM method5823(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, 936069132);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2097581916);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("cj")
   public classKY method5900() {
      return new classKY(this.field2734);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bg")
   public boolean method5836(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= 1212455025 * this.field2730.field2789 && var3 <= -1918389617 * this.field2730.field2792) {
         if (var4 >= 1546846349 * this.field2730.field2790 && var4 <= this.field2730.field2791 * -394131752) {
            for (classHM var6 : this.field2740) {
               if (var6.vmethod476(var1, var2, (byte)60)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bt")
   public boolean method5837(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= -1293823145 * this.field2730.field2789 && var3 <= 1597382741 * this.field2730.field2792) {
         if (var4 >= 1546846349 * this.field2730.field2790 && var4 <= this.field2730.field2791 * 252768043) {
            for (classHM var6 : this.field2740) {
               if (var6.vmethod476(var1, var2, (byte)60)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean surfaceContainsPosition(int var1, int var2) {
      return method5838(this, var1, var2, 1404367312);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("at")
   public void method5821(classXY var1, int var2) {
      this.field2733 = 752140647 * var2;
      this.field2738 = var1.method13071(381544322);
      this.field2739 = var1.method13071(-815995053);
      this.field2734 = new classKY(var1.method13056((byte)1));
      this.field2736 = var1.method13056((byte)1) * -496714561;
      this.field2735 = var1.method13056((byte)1) * 1284192623;
      classXY.method13039(var1, -346779531);
      this.field2732 = classXY.method13039(var1, -346779531) == 1;
      this.field2731 = classXY.method13039(var1, -346779531) * -2079247407;
      int var3 = classXY.method13039(var1, -346779531);
      this.field2740 = new LinkedList();

      for (int var4 = 0; var4 < var3; var4++) {
         this.field2740.add(this.method5827(var1, (byte)1));
      }

      this.method5846(2141978621);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lhm;")
   @ObfuscatedName("am")
   classHM method5824(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, -407708683);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2092164313);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   public int method5872() {
      return this.field2730.field2792 * 979916645;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;IIIS)[I")
   @ObfuscatedName("ex")
   public static int[] method5841(classGX var0, int var1, int var2, int var3, short var4) {
      if (var0 == null) {
         return var0.method5842(var1, var1, var1, var4);
      } else {
         try {
            Iterator var5 = var0.field2740.iterator();

            while (var5.hasNext()) {
               if (var4 == 351) {
                  throw new IllegalStateException();
               }

               classHM var6 = (classHM)var5.next();
               if (var6.vmethod472(var1, var2, var3, -1079098217)) {
                  if (var4 == 351) {
                     throw new IllegalStateException();
                  }

                  return var6.vmethod478(var1, var2, var3, (byte)44);
               }
            }

            return null;
         } catch (RuntimeException var7) {
            throw classEG.method3884(var7, "gx.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)I")
   @ObfuscatedName("xf")
   public static int method5873(classGX var0, int var1) {
      if (var0 == null) {
         return var0.method5899(var1);
      } else {
         try {
            return var0.field2730.field2792 * 1597382741;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gx.ap(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lhm;")
   @ObfuscatedName("bc")
   classHM method5825(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, -345759270);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2035974292);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bm")
   public boolean method5831(int var1, int var2, int var3) {
      for (classHM var5 : this.field2740) {
         if (var5.vmethod472(var1, var2, var3, -819144253)) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ab")
   public boolean method5832(int var1, int var2, int var3) {
      for (classHM var5 : this.field2740) {
         if (var5.vmethod472(var1, var2, var3, -1076031181)) {
            return true;
         }
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;Lxy;I)V")
   @ObfuscatedName("rx")
   public static void method5822(classGX var0, classXY var1, int var2) {
      if (var0 == null) {
         var0.method5836(var2, var2);
      }

      var0.field2733 = 752140647 * var2;
      var0.field2738 = var1.method13071(944579687);
      var0.field2739 = var1.method13071(1548044585);
      var0.field2734 = new classKY(var1.method13056((byte)1));
      var0.field2736 = var1.method13056((byte)1) * -496714561;
      var0.field2735 = var1.method13056((byte)1) * 1284192623;
      classXY.method13039(var1, -346779531);
      var0.field2732 = classXY.method13039(var1, -346779531) == 1;
      var0.field2731 = classXY.method13039(var1, -346779531) * -2079247407;
      int var3 = classXY.method13039(var1, -346779531);
      var0.field2740 = new LinkedList();

      for (int var4 = 0; var4 < var3; var4++) {
         var0.field2740.add(var0.method5827(var1, (byte)1));
      }

      var0.method5846(1927889252);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("br")
   public boolean method5833(int var1, int var2, int var3) {
      for (classHM var5 : this.field2740) {
         if (var5.vmethod472(var1, var2, var3, -986597694)) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ci")
   public classKY method5901() {
      return new classKY(this.field2734);
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("bk")
   public classKY method5843(int var1, int var2) {
      for (classHM var4 : this.field2740) {
         if (var4.vmethod476(var1, var2, (byte)60)) {
            return var4.vmethod480(var1, var2, 2141092142);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method5847() {
      for (classHM var2 : this.field2740) {
         var2.vmethod469(this.field2730, 398888398);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method5849() {
      return 1389480535 * this.field2733;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public int method5850() {
      return 1389480535 * this.field2733;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method5851() {
      return 1389480535 * this.field2733;
   }

   @ObfuscatedSignature(descriptor = "(IIB)Lky;")
   @ObfuscatedName("as")
   public classKY method5844(int var1, int var2, byte var3) {
      try {
         for (classHM var5 : this.field2740) {
            if (var5.vmethod476(var1, var2, (byte)60)) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               return var5.vmethod480(var1, var2, 2141092142);
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gx.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)I")
   @ObfuscatedName("dh")
   public static int method5884(classGX var0, int var1) {
      if (var0 == null) {
         var0.method5853(var1);
      }

      try {
         return var0.field2730.field2791 * 252768043;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("be")
   public boolean method5855() {
      return this.field2732;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bq")
   public String method5857() {
      return this.field2738;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   public int method5898() {
      return this.field2734.field4056 * 819227381;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   public int method5870() {
      return this.field2730.field2789 * 1924713133;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public int method5874() {
      return this.field2730.field2792 * 1597382741;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   int method5864() {
      return 1774498623 * this.field2736;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   int method5866() {
      return this.field2735 * 1681933711;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   public int method5868() {
      return 1578239281 * this.field2731;
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("av")
   public classKY method5902(int var1) {
      try {
         return new classKY(this.field2734);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.av(" + ')');
      }
   }

   public classGX() {
      this.field2735 = -1862270976;
      this.field2731 = 2079247407;
      this.field2734 = null;
      this.field2730 = new classHG();
      this.field2732 = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;Lxy;)Lhm;")
   @ObfuscatedName("tm")
   public static classHM method5826(classGX var0, classXY var1) {
      if (var0 == null) {
         var0.method5829(var1);
      }

      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, -1217935631);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2052230242);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   public int method5875() {
      return this.field2730.field2792 * 1597382741;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method5876() {
      return this.field2730.field2792 * 1597382741;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   public int method5885() {
      return this.field2730.field2791 * 252768043;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   public int method5877() {
      return this.field2730.field2792 * 1597382741;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   public int method5878() {
      return -1864268570 * this.field2730.field2790;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   public int method5879() {
      return 1546846349 * this.field2730.field2790;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;S)I")
   @ObfuscatedName("ns")
   public static int method5880(classGX var0, short var1) {
      if (var0 == null) {
         var0.method5882(var1);
      }

      try {
         return 1546846349 * var0.field2730.field2790;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   public int method5881() {
      return 1546846349 * this.field2730.field2790;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method5886() {
      return this.field2730.field2791 * 148347620;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;II)Lky;")
   @ObfuscatedName("ww")
   public static classKY method5845(classGX var0, int var1, int var2) {
      for (classHM var4 : var0.field2740) {
         if (var4.vmethod476(var1, var2, (byte)60)) {
            return var4.vmethod480(var1, var2, 2141092142);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method5887() {
      return this.field2730.field2791 * 252768043;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;III)Z")
   @ObfuscatedName("sv")
   public static boolean method5838(classGX var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method5839(var1, var1, var1);
      } else {
         try {
            int var4 = var1 / 64;
            int var5 = var2 / 64;
            if (var4 >= -1293823145 * var0.field2730.field2789) {
               if (var3 >= 1872027761) {
                  throw new IllegalStateException();
               }

               if (var4 <= 1597382741 * var0.field2730.field2792) {
                  if (var5 >= 1546846349 * var0.field2730.field2790) {
                     if (var3 >= 1872027761) {
                        throw new IllegalStateException();
                     }

                     if (var5 <= var0.field2730.field2791 * 252768043) {
                        Iterator var6 = var0.field2740.iterator();

                        while (var6.hasNext()) {
                           if (var3 >= 1872027761) {
                              throw new IllegalStateException();
                           }

                           classHM var7 = (classHM)var6.next();
                           if (var7.vmethod476(var1, var2, (byte)60)) {
                              if (var3 >= 1872027761) {
                                 throw new IllegalStateException();
                              }

                              return true;
                           }
                        }

                        return false;
                     }

                     if (var3 >= 1872027761) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }

               if (var3 >= 1872027761) {
                  throw new IllegalStateException();
               }
            }

            return false;
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "gx.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ca")
   public int method5889() {
      return 1870919123 * this.field2734.field4055;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cn")
   public int method5892() {
      return this.field2734.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   public int method5893() {
      return this.field2734.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public int method5871(int var1) {
      try {
         return this.field2730.field2789 * -1293823145;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cg")
   public int method5894() {
      return this.field2734.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;B)I")
   @ObfuscatedName("pq")
   public static int method5895(classGX var0, byte var1) {
      if (var0 == null) {
         return var0.method5896(var1);
      } else {
         try {
            return var0.field2734.field4057 * -210579119;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gx.aw(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bf")
   public String method5858() {
      return this.field2738;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)Lhm;")
   @ObfuscatedName("af")
   classHM method5827(classXY var1, byte var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         classHR var4 = (classHR)classOF.method8404(classHR.method6097(1499581853), var3, 2029338115);
         Object var5 = null;
         switch (var4.field2875 * 408829253) {
            case 0:
               var5 = new classHK();
               break;
            case 1:
               var5 = new classHJ();
               break;
            case 2:
               var5 = new classGJ();
               break;
            case 3:
               var5 = new classGH();
               break;
            default:
               throw new IllegalStateException("");
         }

         ((classHM)var5).vmethod484(var1, 2146944303);
         return (classHM)var5;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gx.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;Lxy;)Lhm;")
   @ObfuscatedName("vv")
   public static classHM method5828(classGX var0, classXY var1) {
      if (var0 == null) {
         var0.method5881();
      }

      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, -640915207);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2145587687);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;I)I")
   @ObfuscatedName("au")
   public static int method5890(classGX var0, int var1) {
      if (var0 == null) {
         var0.method5852(var1);
      }

      try {
         return 1870919123 * var0.field2734.field4055;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public int method5852(int var1) {
      try {
         return 1389480535 * this.field2736;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("ae")
   public boolean method5834(int var1, int var2, int var3, byte var4) {
      try {
         for (classHM var6 : this.field2740) {
            if (var6.vmethod472(var1, var2, var3, -1212958818)) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aq")
   public int method5869(byte var1) {
      try {
         return 1578239281 * this.field2733;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIS)[I")
   @ObfuscatedName("ag")
   public int[] method5842(int var1, int var2, int var3, short var4) {
      try {
         Iterator var5 = this.field2740.iterator();

         while (var5.hasNext()) {
            if (var4 == 351) {
               throw new IllegalStateException();
            }

            classHM var6 = (classHM)var5.next();
            if (var6.vmethod472(var1, var2, var3, -1079098217)) {
               if (var4 == 351) {
                  throw new IllegalStateException();
               }

               return var6.vmethod478(var1, var2, var3, (byte)44);
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public int method5899(int var1) {
      try {
         return this.field2734.field4057 * 819227381;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int method5853(int var1) {
      try {
         return 1389480535 * this.field2731;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bp")
   public boolean method5839(int var1, int var2, int var3) {
      try {
         int var4 = var1 / 64;
         int var5 = var2 / 64;
         if (var4 >= -1293823145 * this.field2730.field2792) {
            if (var3 >= 1872027761) {
               throw new IllegalStateException();
            }

            if (var4 <= 1597382741 * this.field2730.field2792) {
               if (var5 >= 1546846349 * this.field2730.field2789) {
                  if (var3 >= 1872027761) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= this.field2730.field2790 * 252768043) {
                     Iterator var6 = this.field2740.iterator();

                     while (var6.hasNext()) {
                        if (var3 >= 1872027761) {
                           throw new IllegalStateException();
                        }

                        classHM var7 = (classHM)var6.next();
                        if (var7.vmethod476(var1, var2, (byte)60)) {
                           if (var3 >= 1872027761) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }
                     }

                     return false;
                  }

                  if (var3 >= 1872027761) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            }

            if (var3 >= 1872027761) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "gx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lhm;")
   @ObfuscatedName("bn")
   classHM method5829(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      classHR var3 = (classHR)classOF.method8404(classHR.method6097(1499581853), var2, -1217935631);
      Object var4 = null;
      switch (var3.field2875 * 408829253) {
         case 0:
            var4 = new classHK();
            break;
         case 1:
            var4 = new classHJ();
            break;
         case 2:
            var4 = new classGJ();
            break;
         case 3:
            var4 = new classGH();
            break;
         default:
            throw new IllegalStateException("");
      }

      ((classHM)var4).vmethod484(var1, 2052230242);
      return (classHM)var4;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;IIIB)Z")
   @ObfuscatedName("og")
   public static boolean method5835(classGX var0, int var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.method5834(var1, var1, var1, var4);
      }

      try {
         for (classHM var6 : var0.field2740) {
            if (var6.vmethod472(var1, var2, var3, -1212958818)) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   public int method5896(byte var1) {
      try {
         return this.field2734.field4057 * -210579119;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("au")
   public int method5882(short var1) {
      try {
         return 1546846349 * this.field2730.field2791;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gx.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bs")
   public String method5859() {
      return this.field2739;
   }
}
