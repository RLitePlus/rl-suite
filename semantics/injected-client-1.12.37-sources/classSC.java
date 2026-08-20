import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sc")
public class classSC extends classSQ {
   @ObfuscatedName("ab")
   int field5908;
   @ObfuscatedName("az")
   static final int field5906 = client.field811 * 1683728927 + 1831209147;
   @ObfuscatedSignature(descriptor = "Lgy;")
   @ObfuscatedName("ae")
   final classGY field5909;
   @ObfuscatedName("ag")
   int field5910;
   @ObfuscatedSignature(descriptor = "Lgy;")
   @ObfuscatedName("af")
   final classGY field5907 = new classGY();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;FLgy;)V")
   @ObfuscatedName("ag")
   static void method10364(classGY var0, classGY var1, float var2, classGY var3) {
      var2 = classBF.method998(0.0F, 1.0F, var2, 1649794621);
      int var4 = var1.method5903(877192080) - var0.method5903(299508150);
      int var5 = classGY.method5909(var1, 1690676705) - classGY.method5909(var0, 1690676705);
      var4 = (int)(var4 * var2);
      var5 = (int)(var5 * var2);
      classGY.method5929(var3, var0.method5903(286070242) + var4, classGY.method5909(var0, 1690676705) + var5, (byte)5);
      int var6 = classNF.method7830(var0.method5920(1305253738), var1.method5920(1866390882), (byte)112);
      var6 = (int)(var6 * var2);
      var3.method5923(var0.method5920(1220177858) + var6, 229110535);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;Lsr;IB)V")
   @ObfuscatedName("af")
   @Override
   void vmethod568(classGY var1, classSR var2, int var3, byte var4) {
      try {
         this.field5907.method5926(var1, 521750869);
         this.field5909.method5926(var2.field6029, 104573632);
         this.field5908 = -782499801 * (var3 - 1);
         this.field5910 = field5906 * 1285481973 + var2.field6030 * 1771193875;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "sc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   static final void method10367(int var0, int var1) {
      try {
         classGI.method5463((byte)75);
         switch (var0) {
            case 1:
               Player.method2664(1450325754);
               break;
            case 2:
               classAC.method326(24, 2130611027);
               WorldEntity.method10624(classKK.field3841, classKK.field3842, classKK.field3843, (byte)-96);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "sc.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;DLgy;)V")
   @ObfuscatedName("qi")
   public static void method10368(classGY var0, classGY var1, double var2, classGY var4) {
      if (var2 < 0.0) {
         var2 = 0.0;
      }

      if (var2 > 1.0) {
         var2 = 1.0;
      }

      int var5 = var1.field2741 * -787916131 - var0.field2741 * -787916131;
      int var6 = var1.field2742 * -478154003 - var0.field2742 * -478154003;
      var5 = (int)(var2 * var5);
      var6 = (int)(var2 * var6);
      var4.field2741 = (var0.field2741 * -787916131 + var5) * 1397226421;
      var4.field2742 = (var0.field2742 * -478154003 + var6) * 1296710373;
      int var7 = var1.field2744 * 1859166197 - var0.field2744 * 1859166197 & 2047;
      if (var7 > 1024) {
         var7 = -(2048 - var7);
      }

      var7 = (int)(var7 * var2);
      var4.field2744 = (var0.field2744 * 1859166197 + var7 & 2047) * -429665187;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod573(int var1, int var2, int var3) {
      try {
         this.field5907.method5936(var1, var2, (byte)107);
         this.field5909.method5936(var1, var2, (byte)125);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "sc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("al")
   @Override
   void vmethod574(int var1, int var2) {
      this.field5907.method5936(var1, var2, (byte)105);
      this.field5909.method5936(var1, var2, (byte)102);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;III)Z")
   @ObfuscatedName("ae")
   @Override
   boolean vmethod571(classGY var1, int var2, int var3, int var4) {
      try {
         if (this.field5908 * -1143115881 >= this.field5910 * 823938901) {
            if (var4 <= 517141950) {
               throw new IllegalStateException();
            } else {
               var1.method5926(this.field5909, -148868463);
               return true;
            }
         } else {
            float var5 = UserList.method10187(var2, this.field5908 * -1143115881, 823938901 * this.field5910, 862332991);
            ClanMate.method10275(this.field5907, this.field5909, var5, var1, (short)246);
            boolean var10000;
            if (var5 >= 1.0F) {
               if (var4 <= 517141950) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "sc.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;FLgy;)V")
   @ObfuscatedName("as")
   static void method10365(classGY var0, classGY var1, float var2, classGY var3) {
      var2 = classBF.method998(0.0F, 1.0F, var2, -1186059843);
      int var4 = var1.method5903(1941607674) - var0.method5903(977605635);
      int var5 = classGY.method5909(var1, 1690676705) - classGY.method5909(var0, 1690676705);
      var4 = (int)(var4 * var2);
      var5 = (int)(var5 * var2);
      classGY.method5929(var3, var0.method5903(536377897) + var4, classGY.method5909(var0, 1690676705) + var5, (byte)5);
      int var6 = classNF.method7830(var0.method5920(2008553523), var1.method5920(1870037958), (byte)115);
      var6 = (int)(var6 * var2);
      var3.method5923(var0.method5920(1662433654) + var6, -534132521);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;Lsr;I)V")
   @ObfuscatedName("aa")
   @Override
   void vmethod569(classGY var1, classSR var2, int var3) {
      this.field5907.method5926(var1, 1578416802);
      this.field5909.method5926(var2.field6029, -699182635);
      this.field5908 = -782499801 * (var3 - 1);
      this.field5910 = field5906 * 1285481973 + var2.field6030 * 1771193875;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;Lsr;I)V")
   @ObfuscatedName("ac")
   @Override
   void vmethod570(classGY var1, classSR var2, int var3) {
      this.field5907.method5926(var1, -1724473401);
      this.field5909.method5926(var2.field6029, 1514411741);
      this.field5908 = -782499801 * (var3 - 1);
      this.field5910 = field5906 * 1285481973 + var2.field6030 * 1771193875;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;II)Z")
   @ObfuscatedName("ao")
   @Override
   boolean vmethod572(classGY var1, int var2, int var3) {
      if (this.field5908 * -1143115881 >= this.field5910 * 823938901) {
         var1.method5926(this.field5909, -1216196930);
         return true;
      } else {
         float var4 = UserList.method10187(var2, this.field5908 * 1707513826, 1874518264 * this.field5910, 1880698948);
         ClanMate.method10275(this.field5907, this.field5909, var4, var1, (short)246);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(DII)D")
   @ObfuscatedName("os")
   public static double method10369(double var0, int var2, int var3) {
      return (var0 - var2) / (var3 - var2);
   }

   classSC() {
      this.field5909 = new classGY();
      this.field5908 = 0;
      this.field5910 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod575(int var1, int var2) {
      this.field5907.method5936(var1, var2, (byte)104);
      this.field5909.method5936(var1, var2, (byte)123);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;FLgy;)V")
   @ObfuscatedName("ax")
   static void method10366(classGY var0, classGY var1, float var2, classGY var3) {
      var2 = classBF.method998(0.0F, 1.0F, var2, -1981250567);
      int var4 = var1.method5903(389090945) - var0.method5903(234244656);
      int var5 = classGY.method5909(var1, 1690676705) - classGY.method5909(var0, 1690676705);
      var4 = (int)(var4 * var2);
      var5 = (int)(var5 * var2);
      classGY.method5929(var3, var0.method5903(-312504964) + var4, classGY.method5909(var0, 1690676705) + var5, (byte)5);
      int var6 = classNF.method7830(var0.method5920(1364128016), var1.method5920(1206933441), (byte)69);
      var6 = (int)(var6 * var2);
      var3.method5923(var0.method5920(1504179727) + var6, -152012751);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;DI)Z")
   @ObfuscatedName("dq")
   @Override
   public boolean vmethod576(classGY var1, double var2, int var4) {
      if (this.field5908 * -1143115881 >= this.field5910 * 823938901) {
         var1.method5951(this.field5909);
         return true;
      } else {
         double var5 = method10369(var2, this.field5908 * -1143115881, this.field5910 * 823938901);
         method10368(this.field5907, this.field5909, var5, var1);
         return var5 >= 1.0;
      }
   }
}
